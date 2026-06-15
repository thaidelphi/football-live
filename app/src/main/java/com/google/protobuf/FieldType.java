package com.google.protobuf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.List;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DOUBLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FieldType {
    private static final /* synthetic */ FieldType[] $VALUES;
    public static final FieldType BOOL;
    public static final FieldType BOOL_LIST;
    public static final FieldType BOOL_LIST_PACKED;
    public static final FieldType BYTES;
    public static final FieldType BYTES_LIST;
    public static final FieldType DOUBLE;
    public static final FieldType DOUBLE_LIST;
    public static final FieldType DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final FieldType ENUM;
    public static final FieldType ENUM_LIST;
    public static final FieldType ENUM_LIST_PACKED;
    public static final FieldType FIXED32;
    public static final FieldType FIXED32_LIST;
    public static final FieldType FIXED32_LIST_PACKED;
    public static final FieldType FIXED64;
    public static final FieldType FIXED64_LIST;
    public static final FieldType FIXED64_LIST_PACKED;
    public static final FieldType FLOAT;
    public static final FieldType FLOAT_LIST;
    public static final FieldType FLOAT_LIST_PACKED;
    public static final FieldType GROUP;
    public static final FieldType GROUP_LIST;
    public static final FieldType INT32;
    public static final FieldType INT32_LIST;
    public static final FieldType INT32_LIST_PACKED;
    public static final FieldType INT64;
    public static final FieldType INT64_LIST;
    public static final FieldType INT64_LIST_PACKED;
    public static final FieldType MAP;
    public static final FieldType MESSAGE;
    public static final FieldType MESSAGE_LIST;
    public static final FieldType SFIXED32;
    public static final FieldType SFIXED32_LIST;
    public static final FieldType SFIXED32_LIST_PACKED;
    public static final FieldType SFIXED64;
    public static final FieldType SFIXED64_LIST;
    public static final FieldType SFIXED64_LIST_PACKED;
    public static final FieldType SINT32;
    public static final FieldType SINT32_LIST;
    public static final FieldType SINT32_LIST_PACKED;
    public static final FieldType SINT64;
    public static final FieldType SINT64_LIST;
    public static final FieldType SINT64_LIST_PACKED;
    public static final FieldType STRING;
    public static final FieldType STRING_LIST;
    public static final FieldType UINT32;
    public static final FieldType UINT32_LIST;
    public static final FieldType UINT32_LIST_PACKED;
    public static final FieldType UINT64;
    public static final FieldType UINT64_LIST;
    public static final FieldType UINT64_LIST_PACKED;
    private static final FieldType[] VALUES;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15332a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f15333b;

        static {
            int[] iArr = new int[JavaType.values().length];
            f15333b = iArr;
            try {
                iArr[JavaType.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15333b[JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15333b[JavaType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f15332a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15332a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15332a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a  reason: collision with root package name */
        private final boolean f15339a;

        b(boolean z10) {
            this.f15339a = z10;
        }

        public boolean b() {
            return this.f15339a;
        }
    }

    private static /* synthetic */ FieldType[] $values() {
        return new FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        b bVar = b.SCALAR;
        JavaType javaType = JavaType.DOUBLE;
        DOUBLE = new FieldType("DOUBLE", 0, 0, bVar, javaType);
        JavaType javaType2 = JavaType.FLOAT;
        FLOAT = new FieldType("FLOAT", 1, 1, bVar, javaType2);
        JavaType javaType3 = JavaType.LONG;
        INT64 = new FieldType("INT64", 2, 2, bVar, javaType3);
        UINT64 = new FieldType("UINT64", 3, 3, bVar, javaType3);
        JavaType javaType4 = JavaType.INT;
        INT32 = new FieldType("INT32", 4, 4, bVar, javaType4);
        FIXED64 = new FieldType("FIXED64", 5, 5, bVar, javaType3);
        FIXED32 = new FieldType("FIXED32", 6, 6, bVar, javaType4);
        JavaType javaType5 = JavaType.BOOLEAN;
        BOOL = new FieldType("BOOL", 7, 7, bVar, javaType5);
        JavaType javaType6 = JavaType.STRING;
        STRING = new FieldType("STRING", 8, 8, bVar, javaType6);
        JavaType javaType7 = JavaType.MESSAGE;
        MESSAGE = new FieldType("MESSAGE", 9, 9, bVar, javaType7);
        JavaType javaType8 = JavaType.BYTE_STRING;
        BYTES = new FieldType("BYTES", 10, 10, bVar, javaType8);
        UINT32 = new FieldType("UINT32", 11, 11, bVar, javaType4);
        JavaType javaType9 = JavaType.ENUM;
        ENUM = new FieldType("ENUM", 12, 12, bVar, javaType9);
        SFIXED32 = new FieldType("SFIXED32", 13, 13, bVar, javaType4);
        SFIXED64 = new FieldType("SFIXED64", 14, 14, bVar, javaType3);
        SINT32 = new FieldType("SINT32", 15, 15, bVar, javaType4);
        SINT64 = new FieldType("SINT64", 16, 16, bVar, javaType3);
        GROUP = new FieldType("GROUP", 17, 17, bVar, javaType7);
        b bVar2 = b.VECTOR;
        DOUBLE_LIST = new FieldType("DOUBLE_LIST", 18, 18, bVar2, javaType);
        FLOAT_LIST = new FieldType("FLOAT_LIST", 19, 19, bVar2, javaType2);
        INT64_LIST = new FieldType("INT64_LIST", 20, 20, bVar2, javaType3);
        UINT64_LIST = new FieldType("UINT64_LIST", 21, 21, bVar2, javaType3);
        INT32_LIST = new FieldType("INT32_LIST", 22, 22, bVar2, javaType4);
        FIXED64_LIST = new FieldType("FIXED64_LIST", 23, 23, bVar2, javaType3);
        FIXED32_LIST = new FieldType("FIXED32_LIST", 24, 24, bVar2, javaType4);
        BOOL_LIST = new FieldType("BOOL_LIST", 25, 25, bVar2, javaType5);
        STRING_LIST = new FieldType("STRING_LIST", 26, 26, bVar2, javaType6);
        MESSAGE_LIST = new FieldType("MESSAGE_LIST", 27, 27, bVar2, javaType7);
        BYTES_LIST = new FieldType("BYTES_LIST", 28, 28, bVar2, javaType8);
        UINT32_LIST = new FieldType("UINT32_LIST", 29, 29, bVar2, javaType4);
        ENUM_LIST = new FieldType("ENUM_LIST", 30, 30, bVar2, javaType9);
        SFIXED32_LIST = new FieldType("SFIXED32_LIST", 31, 31, bVar2, javaType4);
        SFIXED64_LIST = new FieldType("SFIXED64_LIST", 32, 32, bVar2, javaType3);
        SINT32_LIST = new FieldType("SINT32_LIST", 33, 33, bVar2, javaType4);
        SINT64_LIST = new FieldType("SINT64_LIST", 34, 34, bVar2, javaType3);
        b bVar3 = b.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new FieldType("DOUBLE_LIST_PACKED", 35, 35, bVar3, javaType);
        FLOAT_LIST_PACKED = new FieldType("FLOAT_LIST_PACKED", 36, 36, bVar3, javaType2);
        INT64_LIST_PACKED = new FieldType("INT64_LIST_PACKED", 37, 37, bVar3, javaType3);
        UINT64_LIST_PACKED = new FieldType("UINT64_LIST_PACKED", 38, 38, bVar3, javaType3);
        INT32_LIST_PACKED = new FieldType("INT32_LIST_PACKED", 39, 39, bVar3, javaType4);
        FIXED64_LIST_PACKED = new FieldType("FIXED64_LIST_PACKED", 40, 40, bVar3, javaType3);
        FIXED32_LIST_PACKED = new FieldType("FIXED32_LIST_PACKED", 41, 41, bVar3, javaType4);
        BOOL_LIST_PACKED = new FieldType("BOOL_LIST_PACKED", 42, 42, bVar3, javaType5);
        UINT32_LIST_PACKED = new FieldType("UINT32_LIST_PACKED", 43, 43, bVar3, javaType4);
        ENUM_LIST_PACKED = new FieldType("ENUM_LIST_PACKED", 44, 44, bVar3, javaType9);
        SFIXED32_LIST_PACKED = new FieldType("SFIXED32_LIST_PACKED", 45, 45, bVar3, javaType4);
        SFIXED64_LIST_PACKED = new FieldType("SFIXED64_LIST_PACKED", 46, 46, bVar3, javaType3);
        SINT32_LIST_PACKED = new FieldType("SINT32_LIST_PACKED", 47, 47, bVar3, javaType4);
        SINT64_LIST_PACKED = new FieldType("SINT64_LIST_PACKED", 48, 48, bVar3, javaType3);
        GROUP_LIST = new FieldType("GROUP_LIST", 49, 49, bVar2, javaType7);
        MAP = new FieldType("MAP", 50, 50, b.MAP, JavaType.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        FieldType[] values = values();
        VALUES = new FieldType[values.length];
        for (FieldType fieldType : values) {
            VALUES[fieldType.id] = fieldType;
        }
    }

    private FieldType(String str, int i10, int i11, b bVar, JavaType javaType) {
        int i12;
        this.id = i11;
        this.collection = bVar;
        this.javaType = javaType;
        int i13 = a.f15332a[bVar.ordinal()];
        boolean z10 = true;
        if (i13 == 1) {
            this.elementType = javaType.getBoxedType();
        } else if (i13 != 2) {
            this.elementType = null;
        } else {
            this.elementType = javaType.getBoxedType();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f15333b[javaType.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : z10;
    }

    public static FieldType forId(int i10) {
        if (i10 >= 0) {
            FieldType[] fieldTypeArr = VALUES;
            if (i10 >= fieldTypeArr.length) {
                return null;
            }
            return fieldTypeArr[i10];
        }
        return null;
    }

    private static java.lang.reflect.Type getGenericSuperList(Class<?> cls) {
        java.lang.reflect.Type[] genericInterfaces;
        for (java.lang.reflect.Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static java.lang.reflect.Type getListParameter(Class<?> cls, java.lang.reflect.Type[] typeArr) {
        boolean z10;
        while (true) {
            int i10 = 0;
            if (cls != List.class) {
                java.lang.reflect.Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                        java.lang.reflect.Type type = actualTypeArguments[i11];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length != typeParameters.length) {
                                throw new RuntimeException("Type array mismatch");
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 >= typeParameters.length) {
                                    z10 = false;
                                    break;
                                } else if (type == typeParameters[i12]) {
                                    actualTypeArguments[i11] = typeArr[i12];
                                    z10 = true;
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            if (!z10) {
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i10 < length) {
                            Class<?> cls2 = interfaces[i10];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i10++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    private boolean isValidForList(java.lang.reflect.Field field) {
        Class<?> type = field.getType();
        if (this.javaType.getType().isAssignableFrom(type)) {
            java.lang.reflect.Type[] typeArr = EMPTY_TYPES;
            if (field.getGenericType() instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
            }
            java.lang.reflect.Type listParameter = getListParameter(type, typeArr);
            if (listParameter instanceof Class) {
                return this.elementType.isAssignableFrom((Class) listParameter);
            }
            return true;
        }
        return false;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.b();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        if (b.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
