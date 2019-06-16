package crud.dao.test;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import crud.DataSourceConfiguration;
import crud.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DataSourceConfiguration.class,
		TestEmpDaoImpl.class })
public class TestEmpDaoTest {
	@Autowired
	TestEmpDao dao;


	@Test
	public void testSelectById() {// 単純検索テスト
		Employee emp = dao.selectById(1);
		assertEquals(Integer.valueOf(1), emp.getEmployeeId());
	}

	@Test
	public void testSelectByExample() {
		Employee e = new Employee();
		e.setEmployeeName("SMITH");
		List<Employee> list = dao.selectByExample(e);
		assertEquals(1, list.size());
	}

	@Test
	public void testSelectByAgeRange() {
		List<Employee> list = dao.selectByAgeRange(30, 40);
		assertEquals("ALLEN", list.get(0).getEmployeeName());
	}

	@Test
	public void testSelectByNames() {
		List<String> names = Arrays.asList("JONES", "SCOTT", "FORD");
		List<Employee> list = dao.selectByNames(names);
		assertEquals(3, list.size());
	}

	@Test
	public void testSelectByNameWithPrefixMatching() {
		List<Employee> list = dao.selectByNameWithPrefixMatching("S");
		assertEquals(2, list.size());
	}

	@Test
	public void testSelectByNameWithSuffixMatching() {
		List<Employee> list = dao.selectByNameWithSuffixMatching("S");
		assertEquals(3, list.size());
	}

	@Test
	public void testSelectByNameWithInfixMatching() {
		List<Employee> list = dao.selectByNameWithInfixMatching("A");
		assertEquals(7, list.size());
	}

	@Test
	public void testSelectByHiredateRange() {
		Timestamp from = Timestamp.valueOf("2014-01-01 11:11:22");
		Timestamp to = Timestamp.valueOf("2014-03-31 11:11:22");
		List<Employee> list = dao.selectByHiredateRange(from, to);
		assertEquals(4, list.size());
	}

	@Test
	public void testSelectByNotEmptyName() {
		List<Employee> list = dao.selectByNotEmptyName("SMITH");
		assertEquals(1, list.size());
		list = dao.selectByNotEmptyName(null);// 全ての情報
		assertEquals("ALLEN", list.get(0).getEmployeeName());
	}

	@Test
	public void testSelectAll() {
		// 指定ページ、指定行数を条件にするページング検索
		SelectOptions options = SelectOptions.get().offset(5).limit(3);
		List<Employee> list = dao.selectAll(options);
		assertEquals(3, list.size());
		// 指定ページ、指定行数、件数取得を条件にするページングと同時に集計も行う検索
		options = SelectOptions.get().offset(5).limit(3).count();
		list = dao.selectAll(options);
		assertEquals(3, list.size());
		assertEquals(1, options.getCount());

	}

}
