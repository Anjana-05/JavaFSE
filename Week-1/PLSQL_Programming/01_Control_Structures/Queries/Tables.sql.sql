CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(10)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1, 'Ravi', 65, 15000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Priya', 45, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Arjun', 70, 25000, 'FALSE');
INSERT INTO Customers VALUES (4, 'Sneha', 30, 12000, 'FALSE');
INSERT INTO Customers VALUES (5, 'Kiran', 62, 5000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 8, SYSDATE + 10);
INSERT INTO Loans VALUES (102, 2, 9, SYSDATE + 45);
INSERT INTO Loans VALUES (103, 3, 7, SYSDATE + 20);
INSERT INTO Loans VALUES (104, 4, 10, SYSDATE + 5);
INSERT INTO Loans VALUES (105, 5, 8, SYSDATE + 25);

SELECT * FROM Customers;
SELECT * FROM Loans;