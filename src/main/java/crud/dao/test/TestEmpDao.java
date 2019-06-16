
package crud.dao.test;

import java.sql.Timestamp;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.jdbc.SelectOptions;

import crud.ConfigAutowireable;
import crud.entity.Employee;

@Dao
@ConfigAutowireable
public interface TestEmpDao {

    @Select		//単純検索
    Employee selectById(Integer id);
   
    @Select		//エンティティによる検索（.ドット文法で指定）
    List<Employee> selectByExample(Employee e);
    
    @Select		//条件分岐
    List<Employee> selectByAgeRange(Integer min, Integer max);

    @Select		//IN述語に対する検索
    List<Employee> selectByNames(List<String> names);

    @Select		//LIKE述語に対する前方一致検索
    List<Employee> selectByNameWithPrefixMatching(String prefix);

    @Select		//LIKE述語に対する後方一致検索
    List<Employee> selectByNameWithSuffixMatching(String suffix);

    @Select		//LIKE述語に対する中間一致検索
    List<Employee> selectByNameWithInfixMatching(String infix);

    @Select		//日付による範囲検索
    List<Employee> selectByHiredateRange(Timestamp from, Timestamp to);
    
    @Select		//文字シーケンスがnull、長さが０検索
    List<Employee> selectByNotEmptyName(String name);
    
    
    //ページング検索・・・指定ページ、指定行数を条件にする（order by 必須）
    //ページングと同時に集計も行う検索…指定ページ、指定行数、件数取得を条件にする
    @Select		
    List<Employee> selectAll(SelectOptions options);

    @Select		//全社員リスト
    List<Employee> selectAll();

    @Select		//１つの項目条件について複数値検索 or
    List<Employee> selectByAges(List<Integer> ages);

    @Select		//条件分岐でelseを用いた検索
    List<Employee> selectByName(String name);
    
    @Select		//全社員給与合計
    int selectSummedSalary();

    @Insert
    int insert(Employee employee);

    @Insert(sqlFile = true)
    int insertWithSqlFile(Employee employee);

    @Update
    int update(Employee employee);

    @Update(sqlFile = true)
    int updateWithSqlFile(Employee employee);

    @Delete
    int delete(Employee employee);

    @Delete(sqlFile = true)
    int deleteWithSqlFile(Employee employee);
   
}
