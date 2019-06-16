package crud.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-06-17T00:33:20.647+0900")
public class JobtypeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements crud.dao.JobtypeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.JobtypeDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.JobtypeDao.class, "selectById", int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public JobtypeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<crud.entity.Jobtype> selectAll() {
        entering("crud.dao.JobtypeDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/JobtypeDao/selectAll.sql");
            __query.setEntityType(crud.entity._Jobtype.getSingletonInternal());
            __query.setCallerClassName("crud.dao.JobtypeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Jobtype>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Jobtype>(crud.entity._Jobtype.getSingletonInternal()));
            java.util.List<crud.entity.Jobtype> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.JobtypeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.JobtypeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public crud.entity.Jobtype selectById(int id) {
        entering("crud.dao.JobtypeDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/JobtypeDao/selectById.sql");
            __query.setEntityType(crud.entity._Jobtype.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("crud.dao.JobtypeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<crud.entity.Jobtype> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<crud.entity.Jobtype>(crud.entity._Jobtype.getSingletonInternal()));
            crud.entity.Jobtype __result = __command.execute();
            __query.complete();
            exiting("crud.dao.JobtypeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.JobtypeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

}
