package crud.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-06-17T00:30:41.266+0900")
public class DepartmentDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements crud.dao.DepartmentDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.DepartmentDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.DepartmentDao.class, "selectById", int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public DepartmentDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<crud.entity.Department> selectAll() {
        entering("crud.dao.DepartmentDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/DepartmentDao/selectAll.sql");
            __query.setEntityType(crud.entity._Department.getSingletonInternal());
            __query.setCallerClassName("crud.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Department>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Department>(crud.entity._Department.getSingletonInternal()));
            java.util.List<crud.entity.Department> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.DepartmentDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.DepartmentDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public crud.entity.Department selectById(int id) {
        entering("crud.dao.DepartmentDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/DepartmentDao/selectById.sql");
            __query.setEntityType(crud.entity._Department.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("crud.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<crud.entity.Department> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<crud.entity.Department>(crud.entity._Department.getSingletonInternal()));
            crud.entity.Department __result = __command.execute();
            __query.complete();
            exiting("crud.dao.DepartmentDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.DepartmentDaoImpl", "selectById", __e);
            throw __e;
        }
    }

}
