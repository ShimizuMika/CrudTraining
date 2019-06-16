package crud.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-06-16T22:54:18.906+0900")
public final class _EmpJoinDeptJob extends org.seasar.doma.jdbc.entity.AbstractEntityType<crud.entity.EmpJoinDeptJob> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final _EmpJoinDeptJob __singleton = new _EmpJoinDeptJob();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the employeeId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.Integer, Object> $employeeId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "employeeId", "EMPLOYEE_ID", __namingType, false, __idGenerator);

    /** the employeeName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.String, Object> $employeeName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "employeeName", "EMPLOYEE_NAME", __namingType, true, true, false);

    /** the age */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.Integer, Object> $age = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "age", "", __namingType, true, true, false);

    /** the salary */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.Integer, Object> $salary = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "salary", "", __namingType, true, true, false);

    /** the jobtypeId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.Integer, Object> $jobtypeId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "jobtypeId", "JOBTYPE_ID", __namingType, true, true, false);

    /** the hiredate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.sql.Date, Object> $hiredate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.sql.Date.class, java.sql.Date.class, () -> new org.seasar.doma.wrapper.DateWrapper(), null, null, "hiredate", "", __namingType, true, true, false);

    /** the departmentId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.Integer, Object> $departmentId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "departmentId", "DEPARTMENT_ID", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(crud.entity.EmpJoinDeptJob.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "", __namingType, false);

    /** the insertTimestamp */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.time.LocalDateTime, Object> $insertTimestamp = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "insertTimestamp", "INSERT_TIMESTAMP", __namingType, true, true, false);

    /** the updateTimestamp */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.time.LocalDateTime, Object> $updateTimestamp = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "updateTimestamp", "UPDATE_TIMESTAMP", __namingType, true, true, false);

    /** the departmentName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.String, Object> $departmentName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "departmentName", "DEPARTMENT_NAME", __namingType, true, true, false);

    /** the jobtypeName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, java.lang.String, Object> $jobtypeName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.EmpJoinDeptJob.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "jobtypeName", "JOBTYPE_NAME", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<crud.entity.EmpJoinDeptJob>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> __entityPropertyTypeMap;

    private _EmpJoinDeptJob() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "EmpJoinDeptJob";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> __list = new java.util.ArrayList<>(12);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> __map = new java.util.HashMap<>(12);
        __idList.add($employeeId);
        __list.add($employeeId);
        __map.put("employeeId", $employeeId);
        __list.add($employeeName);
        __map.put("employeeName", $employeeName);
        __list.add($age);
        __map.put("age", $age);
        __list.add($salary);
        __map.put("salary", $salary);
        __list.add($jobtypeId);
        __map.put("jobtypeId", $jobtypeId);
        __list.add($hiredate);
        __map.put("hiredate", $hiredate);
        __list.add($departmentId);
        __map.put("departmentId", $departmentId);
        __list.add($version);
        __map.put("version", $version);
        __list.add($insertTimestamp);
        __map.put("insertTimestamp", $insertTimestamp);
        __list.add($updateTimestamp);
        __map.put("updateTimestamp", $updateTimestamp);
        __list.add($departmentName);
        __map.put("departmentName", $departmentName);
        __list.add($jobtypeName);
        __map.put("jobtypeName", $jobtypeName);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(crud.entity.EmpJoinDeptJob entity, org.seasar.doma.jdbc.entity.PreInsertContext<crud.entity.EmpJoinDeptJob> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(crud.entity.EmpJoinDeptJob entity, org.seasar.doma.jdbc.entity.PreUpdateContext<crud.entity.EmpJoinDeptJob> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(crud.entity.EmpJoinDeptJob entity, org.seasar.doma.jdbc.entity.PreDeleteContext<crud.entity.EmpJoinDeptJob> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(crud.entity.EmpJoinDeptJob entity, org.seasar.doma.jdbc.entity.PostInsertContext<crud.entity.EmpJoinDeptJob> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(crud.entity.EmpJoinDeptJob entity, org.seasar.doma.jdbc.entity.PostUpdateContext<crud.entity.EmpJoinDeptJob> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(crud.entity.EmpJoinDeptJob entity, org.seasar.doma.jdbc.entity.PostDeleteContext<crud.entity.EmpJoinDeptJob> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.EmpJoinDeptJob, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, ?, ?> getGeneratedIdPropertyType() {
        return $employeeId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, crud.entity.EmpJoinDeptJob, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public crud.entity.EmpJoinDeptJob newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<crud.entity.EmpJoinDeptJob, ?>> __args) {
        crud.entity.EmpJoinDeptJob entity = new crud.entity.EmpJoinDeptJob();
        if (__args.get("employeeId") != null) __args.get("employeeId").save(entity);
        if (__args.get("employeeName") != null) __args.get("employeeName").save(entity);
        if (__args.get("age") != null) __args.get("age").save(entity);
        if (__args.get("salary") != null) __args.get("salary").save(entity);
        if (__args.get("jobtypeId") != null) __args.get("jobtypeId").save(entity);
        if (__args.get("hiredate") != null) __args.get("hiredate").save(entity);
        if (__args.get("departmentId") != null) __args.get("departmentId").save(entity);
        if (__args.get("version") != null) __args.get("version").save(entity);
        if (__args.get("insertTimestamp") != null) __args.get("insertTimestamp").save(entity);
        if (__args.get("updateTimestamp") != null) __args.get("updateTimestamp").save(entity);
        if (__args.get("departmentName") != null) __args.get("departmentName").save(entity);
        if (__args.get("jobtypeName") != null) __args.get("jobtypeName").save(entity);
        return entity;
    }

    @Override
    public Class<crud.entity.EmpJoinDeptJob> getEntityClass() {
        return crud.entity.EmpJoinDeptJob.class;
    }

    @Override
    public crud.entity.EmpJoinDeptJob getOriginalStates(crud.entity.EmpJoinDeptJob __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(crud.entity.EmpJoinDeptJob __entity) {
    }

    /**
     * @return the singleton
     */
    public static _EmpJoinDeptJob getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _EmpJoinDeptJob newInstance() {
        return new _EmpJoinDeptJob();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<crud.entity.EmpJoinDeptJob> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
