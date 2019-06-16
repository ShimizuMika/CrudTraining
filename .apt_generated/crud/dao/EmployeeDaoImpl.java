package crud.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-06-17T00:33:20.632+0900")
public class EmployeeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements crud.dao.EmployeeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.EmployeeDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.EmployeeDao.class, "selectById", int.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.EmployeeDao.class, "selectAllEmployeeDepartmentJob");

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.EmployeeDao.class, "selectEmployeeDepartmentJob", int.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.EmployeeDao.class, "insert", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.EmployeeDao.class, "update", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.EmployeeDao.class, "delete", crud.entity.Employee.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public EmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<crud.entity.Employee> selectAll() {
        entering("crud.dao.EmployeeDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/EmployeeDao/selectAll.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.setCallerClassName("crud.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public crud.entity.Employee selectById(int id) {
        entering("crud.dao.EmployeeDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/EmployeeDao/selectById.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("crud.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<crud.entity.Employee> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            crud.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("crud.dao.EmployeeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.EmployeeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.EmpJoinDeptJob> selectAllEmployeeDepartmentJob() {
        entering("crud.dao.EmployeeDaoImpl", "selectAllEmployeeDepartmentJob");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/EmployeeDao/selectAllEmployeeDepartmentJob.sql");
            __query.setEntityType(crud.entity._EmpJoinDeptJob.getSingletonInternal());
            __query.setCallerClassName("crud.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAllEmployeeDepartmentJob");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.EmpJoinDeptJob>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.EmpJoinDeptJob>(crud.entity._EmpJoinDeptJob.getSingletonInternal()));
            java.util.List<crud.entity.EmpJoinDeptJob> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.EmployeeDaoImpl", "selectAllEmployeeDepartmentJob", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.EmployeeDaoImpl", "selectAllEmployeeDepartmentJob", __e);
            throw __e;
        }
    }

    @Override
    public crud.entity.EmpJoinDeptJob selectEmployeeDepartmentJob(int id) {
        entering("crud.dao.EmployeeDaoImpl", "selectEmployeeDepartmentJob", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/EmployeeDao/selectEmployeeDepartmentJob.sql");
            __query.setEntityType(crud.entity._EmpJoinDeptJob.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("crud.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectEmployeeDepartmentJob");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<crud.entity.EmpJoinDeptJob> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<crud.entity.EmpJoinDeptJob>(crud.entity._EmpJoinDeptJob.getSingletonInternal()));
            crud.entity.EmpJoinDeptJob __result = __command.execute();
            __query.complete();
            exiting("crud.dao.EmployeeDaoImpl", "selectEmployeeDepartmentJob", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.EmployeeDaoImpl", "selectEmployeeDepartmentJob", __e);
            throw __e;
        }
    }

    @Override
    public int insert(crud.entity.Employee emp) {
        entering("crud.dao.EmployeeDaoImpl", "insert", emp);
        try {
            if (emp == null) {
                throw new org.seasar.doma.DomaNullPointerException("emp");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<crud.entity.Employee> __query = getQueryImplementors().createAutoInsertQuery(__method4, crud.entity._Employee.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(emp);
            __query.setCallerClassName("crud.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.EmployeeDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.EmployeeDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(crud.entity.Employee emp) {
        entering("crud.dao.EmployeeDaoImpl", "update", emp);
        try {
            if (emp == null) {
                throw new org.seasar.doma.DomaNullPointerException("emp");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/EmployeeDao/update.sql");
            __query.addParameter("emp", crud.entity.Employee.class, emp);
            __query.setCallerClassName("crud.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("emp", emp, crud.entity._Employee.getSingletonInternal());
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.EmployeeDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.EmployeeDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(crud.entity.Employee emp) {
        entering("crud.dao.EmployeeDaoImpl", "delete", emp);
        try {
            if (emp == null) {
                throw new org.seasar.doma.DomaNullPointerException("emp");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<crud.entity.Employee> __query = getQueryImplementors().createAutoDeleteQuery(__method6, crud.entity._Employee.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntity(emp);
            __query.setCallerClassName("crud.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method6, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.EmployeeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.EmployeeDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
