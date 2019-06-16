package crud.dao.test;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import crud.DataSourceConfiguration;
import crud.dao.test.TestEmpDao;
import crud.dao.test.TestEmpDaoImpl;
import crud.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DataSourceConfiguration.class,
		TestEmpDaoImpl.class })
public class TestEmpActionDaoTest {
	@Autowired
	TestEmpDao employeeDao;


	@Test
	@Transactional
	@Rollback(true)
	public void testInsertWithSqlFile() {
		Employee obj = new Employee();
		obj.setEmployeeId(1050);
		obj.setEmployeeName("赤ちゃんおむつピっピーちゃん");
		obj.setAge(40);
		obj.setSalary(1000);
		obj.setJobtypeId(1);
		obj.setHiredate(new Date(new java.util.Date().getTime()));
		obj.setDepartmentId(1);
		obj.setInsertTimestamp(LocalDateTime.now());
		obj.setUpdateTimestamp(LocalDateTime.now());
		obj.setVersion(1);
		int ret = employeeDao.insertWithSqlFile(obj);
		assertEquals(1, ret);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testUpdateWithSqlFile() {
		Employee obj = employeeDao.selectById(2);
		obj.setAge(35);
		int ret = employeeDao.updateWithSqlFile(obj);
		assertEquals(1, ret);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testDeleteWithSqlFile() {
		Employee obj = employeeDao.selectById(8);
		int ret = employeeDao.deleteWithSqlFile(obj);
		assertEquals(1, ret);
	}
}
