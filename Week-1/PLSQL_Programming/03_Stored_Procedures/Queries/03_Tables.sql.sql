CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    AccountType VARCHAR2(20),
    Balance NUMBER
);

INSERT INTO Accounts VALUES (101, 'Savings', 10000);
INSERT INTO Accounts VALUES (102, 'Savings', 15000);
INSERT INTO Accounts VALUES (103, 'Current', 20000);
INSERT INTO Accounts VALUES (104, 'Savings', 5000);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);

INSERT INTO Employees VALUES (1, 'Ravi', 'IT', 50000);
INSERT INTO Employees VALUES (2, 'Priya', 'HR', 45000);
INSERT INTO Employees VALUES (3, 'Arjun', 'IT', 60000);
INSERT INTO Employees VALUES (4, 'Sneha', 'Sales', 55000);

SELECT * FROM Accounts;
SELECT * FROM Employees;