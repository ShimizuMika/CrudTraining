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
public class TestEmpActionSimpleDaoTest {
	@Autowired
	TestEmpDao employeeDao;


	@Test
	@Transactional
	@Rollback(true)
	public void testInsert() {
		
		Employee obj = new Employee();
		obj.setEmployeeName("test");
		obj.setAge(50);
		obj.setSalary(1000);
		obj.setHiredate(new Date(new java.util.Date().getTime()));
		obj.setJobtypeId(2);
		obj.setInsertTimestamp(LocalDateTime.now());
		int ret=employeeDao.insert(obj);
		
		assertEquals(1, ret);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testUpdate() {
		Employee obj = employeeDao.selectById(2);
		obj.setAge(35);
		int ret = employeeDao.update(obj);
		assertEquals(1, ret);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testDelete() {
		Employee obj = employeeDao.selectById(7);
		int ret = employeeDao.delete(obj);
		assertEquals(1, ret);
	}
}
