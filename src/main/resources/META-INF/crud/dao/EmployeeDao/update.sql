UPDATE Employee 
SET
  EMPLOYEE_NAME =/*emp.employeeName*/'name',
  AGE =/*emp.age*/'age',
  SALARY=/*emp.salary*/'salary',
  JOBTYPE_ID=/*emp.jobtypeId*/'jobType_id',
  HIREDATE=/*emp.hiredate*/'hiredate',
  DEPARTMENT_ID=/*emp.departmentId*/'department_id',
  VERSION=/*emp.version+1*/'version',
  INSERT_TIMESTAMP=/*emp.insertTimestamp*/'insertTime',
  UPDATE_TIMESTAMP=/*emp.updateTimestamp*/'updTime'  
WHERE 
  EMPLOYEE_ID =/*emp.employeeId*/'employee_id'