update Employee 
set 
  EMPLOYEE_NAME = /* employee.employeeName */'testUser', 
  AGE = /* employee.age */32, 
  SALARY = /* employee.salary */200, 
  JOBTYPE_ID = /* employee.jobtypeId */1, 
  HIREDATE = /* employee.hiredate */date'2015-05-08', 
  DEPARTMENT_ID = /* employee.departmentId */1,
  UPDATE_TIMESTAMP = /* employee.updateTimestamp */timestamp'2015-05-09 10:11:12', 
  VERSION = /* employee.version */1
where
  EMPLOYEE_ID = /* employee.employeeId */1