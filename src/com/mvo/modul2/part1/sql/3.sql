CREATE TABLE IF NOT EXISTS Employee
(
    Id        int,
    Name      varchar(255),
    Salary    int,
    ManagerId int
);

TRUNCATE TABLE Employee;

INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES ('1', 'Joe', '70000', '3');
INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES ('2', 'Henry', '80000', '4');
INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES ('3', 'Sam', '60000', 'None');
INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES ('4', 'Max', '90000', 'None');

SELECT e.Name AS Employee
FROM Employee e
         LEFT JOIN Employee m ON e.ManagerId = m.Id
WHERE e.Salary > COALESCE(m.Salary, 0);