package crud.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-06-16T22:54:18.865+0900")
public final class _Jobtype extends org.seasar.doma.jdbc.entity.AbstractEntityType<crud.entity.Jobtype> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final _Jobtype __singleton = new _Jobtype();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the jobtypeId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, crud.entity.Jobtype, java.lang.Integer, Object> $jobtypeId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(crud.entity.Jobtype.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "jobtypeId", "JOBTYPE_ID", __namingType, false);

    /** the jobtypeName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, crud.entity.Jobtype, java.lang.String, Object> $jobtypeName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(crud.entity.Jobtype.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "jobtypeName", "JOBTYPE_NAME", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<crud.entity.Jobtype>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> __entityPropertyTypeMap;

    private _Jobtype() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Jobtype";
        __catalogName = "";
        __schemaName = "";
        __tableName = "JOBTYPE";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($jobtypeId);
        __list.add($jobtypeId);
        __map.put("jobtypeId", $jobtypeId);
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
    public void preInsert(crud.entity.Jobtype entity, org.seasar.doma.jdbc.entity.PreInsertContext<crud.entity.Jobtype> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(crud.entity.Jobtype entity, org.seasar.doma.jdbc.entity.PreUpdateContext<crud.entity.Jobtype> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(crud.entity.Jobtype entity, org.seasar.doma.jdbc.entity.PreDeleteContext<crud.entity.Jobtype> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(crud.entity.Jobtype entity, org.seasar.doma.jdbc.entity.PostInsertContext<crud.entity.Jobtype> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(crud.entity.Jobtype entity, org.seasar.doma.jdbc.entity.PostUpdateContext<crud.entity.Jobtype> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(crud.entity.Jobtype entity, org.seasar.doma.jdbc.entity.PostDeleteContext<crud.entity.Jobtype> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<crud.entity.Jobtype, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, crud.entity.Jobtype, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, crud.entity.Jobtype, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, crud.entity.Jobtype, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public crud.entity.Jobtype newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<crud.entity.Jobtype, ?>> __args) {
        crud.entity.Jobtype entity = new crud.entity.Jobtype();
        if (__args.get("jobtypeId") != null) __args.get("jobtypeId").save(entity);
        if (__args.get("jobtypeName") != null) __args.get("jobtypeName").save(entity);
        return entity;
    }

    @Override
    public Class<crud.entity.Jobtype> getEntityClass() {
        return crud.entity.Jobtype.class;
    }

    @Override
    public crud.entity.Jobtype getOriginalStates(crud.entity.Jobtype __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(crud.entity.Jobtype __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Jobtype getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Jobtype newInstance() {
        return new _Jobtype();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<crud.entity.Jobtype> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
