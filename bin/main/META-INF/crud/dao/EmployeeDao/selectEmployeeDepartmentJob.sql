select
  e.*,
  d.DEPARTMENT_NAME ,j.JOBTYPE_NAME
from 
  employee e 
left outer join 
  department d 
  on 
  e.department_id = d.DEPARTMENT_ID 
left outer join 
  jobtype j
  on 
  e.JOBTYPE_ID = j.JOBTYPE_ID 
where
e.employee_id=/*id*/1
order by 
  e.EMPLOYEE_ID