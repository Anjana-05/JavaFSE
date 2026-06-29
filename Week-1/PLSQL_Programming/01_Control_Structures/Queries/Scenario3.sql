BEGIN
    FOR loan_record IN (
        SELECT CustomerID, DueDate
        FROM Loans
        WHERE DueDate <= SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ' ||
            loan_record.CustomerID ||
            ' loan due on ' ||
            loan_record.DueDate
        );
    END LOOP;
END;
/