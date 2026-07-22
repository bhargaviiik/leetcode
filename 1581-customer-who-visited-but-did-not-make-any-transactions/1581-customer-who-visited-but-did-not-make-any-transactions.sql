# Write your MySQL query statement below
Select customer_id, sum(transactions.transaction_id is null) as count_no_trans
from visits left join transactions
on visits.visit_id=transactions.visit_id
group by visits.customer_id
having count_no_trans>0;