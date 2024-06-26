CREATE TABLE IF NOT EXISTS Employee
(
    Id     int,
    Salary int
);

TRUNCATE TABLE Employee;

INSERT INTO Employee (Id, Salary)
VALUES ('1', '100');
INSERT INTO Employee (Id, Salary)
VALUES ('2', '200');
INSERT INTO Employee (Id, Salary)
VALUES ('3', '300');

SELECT Salary AS SecondHighestSalary
FROM (SELECT DISTINCT Salary
      FROM Employee
      ORDER BY Salary DESC
      LIMIT 1 OFFSET 1) AS SecondHighest;