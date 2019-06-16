package crud.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import crud.ConfigAutowireable;
import crud.entity.EmpJoinDeptJob;
import crud.entity.Employee;

@Dao
@ConfigAutowireable
public interface EmployeeDao {

	@Select
	List<Employee> selectAll();

    @Select
    Employee selectById(int id);

    @Select
    List<EmpJoinDeptJob> selectAllEmployeeDepartmentJob();

    @Select
    EmpJoinDeptJob selectEmployeeDepartmentJob(int id);

    @Insert
    int insert(Employee emp);

//    @Update
    @Update(sqlFile=true)  //sqlFile=trueを指定した場合は、自作したsqlFileの命令を実行する
    int update(Employee emp);

    @Delete
    int delete(Employee emp);
}