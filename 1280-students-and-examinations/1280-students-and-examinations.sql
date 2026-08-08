with temp as (
    select * from students
    cross join subjects
)
select temp.student_id, temp.student_name, temp.subject_name, count( examinations.student_id) as attended_exams
from temp left join examinations
on temp.student_id= examinations.student_id
and temp.subject_name = examinations.subject_name
group by student_id, student_name, subject_name
order by temp.student_id, temp.subject_name;