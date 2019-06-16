package crud.dao.test;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-06-17T00:30:41.216+0900")
public class TestEmpDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements crud.dao.test.TestEmpDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByExample", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByAgeRange", java.lang.Integer.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByNames", java.util.List.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByNameWithPrefixMatching", java.lang.String.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByNameWithSuffixMatching", java.lang.String.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByNameWithInfixMatching", java.lang.String.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByHiredateRange", java.sql.Timestamp.class, java.sql.Timestamp.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByNotEmptyName", java.lang.String.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectAll", org.seasar.doma.jdbc.SelectOptions.class);

    private static final java.lang.reflect.Method __method10 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectAll");

    private static final java.lang.reflect.Method __method11 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByAges", java.util.List.class);

    private static final java.lang.reflect.Method __method12 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectByName", java.lang.String.class);

    private static final java.lang.reflect.Method __method13 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "selectSummedSalary");

    private static final java.lang.reflect.Method __method14 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "insert", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method15 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "insertWithSqlFile", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method16 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "update", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method17 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "updateWithSqlFile", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method18 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "delete", crud.entity.Employee.class);

    private static final java.lang.reflect.Method __method19 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(crud.dao.test.TestEmpDao.class, "deleteWithSqlFile", crud.entity.Employee.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public TestEmpDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public crud.entity.Employee selectById(java.lang.Integer id) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectById.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<crud.entity.Employee> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            crud.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByExample(crud.entity.Employee e) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByExample", e);
        try {
            if (e == null) {
                throw new org.seasar.doma.DomaNullPointerException("e");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByExample.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("e", crud.entity.Employee.class, e);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByAgeRange(java.lang.Integer min, java.lang.Integer max) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByAgeRange", min, max);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByAgeRange.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("min", java.lang.Integer.class, min);
            __query.addParameter("max", java.lang.Integer.class, max);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByAgeRange");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByAgeRange", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByAgeRange", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByNames(java.util.List<java.lang.String> names) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByNames", names);
        try {
            if (names == null) {
                throw new org.seasar.doma.DomaNullPointerException("names");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByNames.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("names", java.util.List.class, names);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByNames");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByNames", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByNames", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByNameWithPrefixMatching(java.lang.String prefix) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByNameWithPrefixMatching", prefix);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByNameWithPrefixMatching.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("prefix", java.lang.String.class, prefix);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByNameWithPrefixMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method4, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByNameWithPrefixMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByNameWithPrefixMatching", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByNameWithSuffixMatching(java.lang.String suffix) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByNameWithSuffixMatching", suffix);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByNameWithSuffixMatching.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("suffix", java.lang.String.class, suffix);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByNameWithSuffixMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method5, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByNameWithSuffixMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByNameWithSuffixMatching", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByNameWithInfixMatching(java.lang.String infix) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByNameWithInfixMatching", infix);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method6);
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByNameWithInfixMatching.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("infix", java.lang.String.class, infix);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByNameWithInfixMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method6, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByNameWithInfixMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByNameWithInfixMatching", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByHiredateRange(java.sql.Timestamp from, java.sql.Timestamp to) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByHiredateRange", from, to);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method7);
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByHiredateRange.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("from", java.sql.Timestamp.class, from);
            __query.addParameter("to", java.sql.Timestamp.class, to);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByHiredateRange");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method7, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByHiredateRange", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByHiredateRange", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByNotEmptyName(java.lang.String name) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByNotEmptyName", name);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method8);
            __query.setMethod(__method8);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByNotEmptyName.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("name", java.lang.String.class, name);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByNotEmptyName");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method8, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByNotEmptyName", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByNotEmptyName", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectAll(org.seasar.doma.jdbc.SelectOptions options) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectAll", options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method9);
            __query.setMethod(__method9);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectAll.sql");
            __query.setOptions(options);
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method9, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectAll() {
        entering("crud.dao.test.TestEmpDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method10);
            __query.setMethod(__method10);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectAll.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method10, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByAges(java.util.List<java.lang.Integer> ages) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByAges", ages);
        try {
            if (ages == null) {
                throw new org.seasar.doma.DomaNullPointerException("ages");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method11);
            __query.setMethod(__method11);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByAges.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("ages", java.util.List.class, ages);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByAges");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method11, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByAges", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByAges", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<crud.entity.Employee> selectByName(java.lang.String name) {
        entering("crud.dao.test.TestEmpDaoImpl", "selectByName", name);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method12);
            __query.setMethod(__method12);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectByName.sql");
            __query.setEntityType(crud.entity._Employee.getSingletonInternal());
            __query.addParameter("name", java.lang.String.class, name);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectByName");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<crud.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method12, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<crud.entity.Employee>(crud.entity._Employee.getSingletonInternal()));
            java.util.List<crud.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectByName", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectByName", __e);
            throw __e;
        }
    }

    @Override
    public int selectSummedSalary() {
        entering("crud.dao.test.TestEmpDaoImpl", "selectSummedSalary");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method13);
            __query.setMethod(__method13);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/selectSummedSalary.sql");
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("selectSummedSalary");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.lang.Integer> __command = getCommandImplementors().createSelectCommand(__method13, __query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, true));
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "selectSummedSalary", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "selectSummedSalary", __e);
            throw __e;
        }
    }

    @Override
    public int insert(crud.entity.Employee employee) {
        entering("crud.dao.test.TestEmpDaoImpl", "insert", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<crud.entity.Employee> __query = getQueryImplementors().createAutoInsertQuery(__method14, crud.entity._Employee.getSingletonInternal());
            __query.setMethod(__method14);
            __query.setConfig(__config);
            __query.setEntity(employee);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method14, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int insertWithSqlFile(crud.entity.Employee employee) {
        entering("crud.dao.test.TestEmpDaoImpl", "insertWithSqlFile", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.SqlFileInsertQuery __query = getQueryImplementors().createSqlFileInsertQuery(__method15);
            __query.setMethod(__method15);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/insertWithSqlFile.sql");
            __query.addParameter("employee", crud.entity.Employee.class, employee);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("insertWithSqlFile");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("employee", employee, crud.entity._Employee.getSingletonInternal());
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method15, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "insertWithSqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "insertWithSqlFile", __e);
            throw __e;
        }
    }

    @Override
    public int update(crud.entity.Employee employee) {
        entering("crud.dao.test.TestEmpDaoImpl", "update", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<crud.entity.Employee> __query = getQueryImplementors().createAutoUpdateQuery(__method16, crud.entity._Employee.getSingletonInternal());
            __query.setMethod(__method16);
            __query.setConfig(__config);
            __query.setEntity(employee);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method16, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int updateWithSqlFile(crud.entity.Employee employee) {
        entering("crud.dao.test.TestEmpDaoImpl", "updateWithSqlFile", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method17);
            __query.setMethod(__method17);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/updateWithSqlFile.sql");
            __query.addParameter("employee", crud.entity.Employee.class, employee);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("updateWithSqlFile");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("employee", employee, crud.entity._Employee.getSingletonInternal());
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method17, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "updateWithSqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "updateWithSqlFile", __e);
            throw __e;
        }
    }

    @Override
    public int delete(crud.entity.Employee employee) {
        entering("crud.dao.test.TestEmpDaoImpl", "delete", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<crud.entity.Employee> __query = getQueryImplementors().createAutoDeleteQuery(__method18, crud.entity._Employee.getSingletonInternal());
            __query.setMethod(__method18);
            __query.setConfig(__config);
            __query.setEntity(employee);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method18, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int deleteWithSqlFile(crud.entity.Employee employee) {
        entering("crud.dao.test.TestEmpDaoImpl", "deleteWithSqlFile", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method19);
            __query.setMethod(__method19);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/crud/dao/test/TestEmpDao/deleteWithSqlFile.sql");
            __query.addParameter("employee", crud.entity.Employee.class, employee);
            __query.setCallerClassName("crud.dao.test.TestEmpDaoImpl");
            __query.setCallerMethodName("deleteWithSqlFile");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("employee", employee, crud.entity._Employee.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method19, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("crud.dao.test.TestEmpDaoImpl", "deleteWithSqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("crud.dao.test.TestEmpDaoImpl", "deleteWithSqlFile", __e);
            throw __e;
        }
    }

}
