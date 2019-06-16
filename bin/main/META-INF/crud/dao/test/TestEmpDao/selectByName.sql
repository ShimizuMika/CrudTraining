select * from employee
where 
/*%if name != null*/
  employee_name = /*name*/'hoge'
/*%else */
  and
  employee_name is null
/*%end */