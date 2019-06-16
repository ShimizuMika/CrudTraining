package crud.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import crud.ConfigAutowireable;
import crud.entity.Department;

@Dao
@ConfigAutowireable
public interface DepartmentDao {

	@Select
	List<Department> selectAll();

    @Select
    Department selectById(int id);
}