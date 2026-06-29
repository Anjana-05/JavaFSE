CREATE OR REPLACE PROCEDURE TransferFunds(
    source_acc IN NUMBER,
    target_acc IN NUMBER,
    amount IN NUMBER
)
AS
    source_balance NUMBER;
BEGIN
    SELECT Balance
    INTO source_balance
    FROM Accounts
    WHERE AccountID = source_acc;

    IF source_balance >= amount THEN
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = source_acc;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = target_acc;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    END IF;
END;
/

BEGIN
    TransferFunds(101, 102, 2000);
END;
/

SELECT * FROM Accounts;