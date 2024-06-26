CREATE TABLE IF NOT EXISTS Customers
(
    Id   int,
    Name varchar(255)
);

CREATE TABLE IF NOT EXISTS Orders
(
    Id         int,
    CustomerId int
);

TRUNCATE TABLE courses;

INSERT INTO courses (Id, Name)
VALUES ('1', 'Joe');
INSERT INTO courses (Id, Name)
VALUES ('2', 'Henry');
INSERT INTO courses (Id, Name)
VALUES ('3', 'Sam');
INSERT INTO courses (Id, Name)
VALUES ('4', 'Max');

TRUNCATE TABLE Orders;

INSERT INTO Orders (Id, CustomerId)
VALUES ('1', '3');
INSERT INTO Orders (Id, CustomerId)
VALUES ('2', '1');

SELECT c.Name AS Custormes
FROM courses c
         LEFT JOIN Orders o ON c.Id = o.CustomerId
WHERE o.CustomerId IS NULL;