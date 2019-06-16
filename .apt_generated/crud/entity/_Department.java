package crud.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-06-17T00:30:40.870+0900")
public final class _Department extends org.seasar.doma.jdbc.entity.AbstractEntityType<crud.entity.Department> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final _Department __singleton = new _Department();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the departmentId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, crud.entity.Department, java.lang.Integer, Object> $departmentId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(crud.entity.Department.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "departmentId", "DEPARTMENT_ID", __namingType, false);

    /** the departmentName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.Department, java.lang.String, Object> $departmentName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.Department.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "departmentName", "DEPARTMENT_NAME", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<crud.entity.Department>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> __entityPropertyTypeMap;

    private _Department() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Department";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($departmentId);
        __list.add($departmentId);
        __map.put("departmentId", $departmentId);
        __list.add($departmentName);
        __map.put("departmentName", $departmentName);
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
    public void preInsert(crud.entity.Department entity, org.seasar.doma.jdbc.entity.PreInsertContext<crud.entity.Department> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(crud.entity.Department entity, org.seasar.doma.jdbc.entity.PreUpdateContext<crud.entity.Department> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(crud.entity.Department entity, org.seasar.doma.jdbc.entity.PreDeleteContext<crud.entity.Department> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(crud.entity.Department entity, org.seasar.doma.jdbc.entity.PostInsertContext<crud.entity.Department> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(crud.entity.Department entity, org.seasar.doma.jdbc.entity.PostUpdateContext<crud.entity.Department> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(crud.entity.Department entity, org.seasar.doma.jdbc.entity.PostDeleteContext<crud.entity.Department> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Department, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, crud.entity.Department, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, crud.entity.Department, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, crud.entity.Department, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public crud.entity.Department newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<crud.entity.Department, ?>> __args) {
        crud.entity.Department entity = new crud.entity.Department();
        if (__args.get("departmentId") != null) __args.get("departmentId").save(entity);
        if (__args.get("departmentName") != null) __args.get("departmentName").save(entity);
        return entity;
    }

    @Override
    public Class<crud.entity.Department> getEntityClass() {
        return crud.entity.Department.class;
    }

    @Override
    public crud.entity.Department getOriginalStates(crud.entity.Department __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(crud.entity.Department __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Department getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Department newInstance() {
        return new _Department();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<crud.entity.Department> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
