package crud.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import crud.ConfigAutowireable;
import crud.entity.Jobtype;

@Dao
@ConfigAutowireable
public interface JobtypeDao {

	@Select
	List<Jobtype> selectAll();

    @Select
    Jobtype selectById(int id);
}