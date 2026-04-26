# Write your MySQL query statement below
select P.firstName, P.lastName, A.city, A.state 
From Person P LEFT JOIN Address A ON P.personId= A.personId;