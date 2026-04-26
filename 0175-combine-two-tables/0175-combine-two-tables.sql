# Write your MySQL query statement below
select Person.firstName, Person.lastName, Address.city, Address.state 
From Person LEFT JOIN Address ON person.personId= Address.personId;