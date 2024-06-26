CREATE TABLE Person
(
    PersonID  int,
    FirstName varchar(255),
    LastName  varchar(255)
);

CREATE TABLE Address
(
    AddressId int,
    PersonId  int,
    City      varchar(255),
    State     varchar(255)
);

TRUNCATE TABLE Person;

INSERT INTO Person (PersonId, LastName, FirstName)
VALUES (1, 'Wang', 'Allen');

TRUNCATE TABLE Address;

INSERT INTO Address (AddressId, PersonId, City, State)
VALUES (1, 1, 'New York City', 'New York');

SELECT p.FirstName,
       p.LastName,
       a.City,
       a.State
FROM Person p
         LEFT JOIN Address a on p.PersonID = a.PersonId
