package com.google.protobuf;

import com.google.protobuf.Internal;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class FieldInfo implements Comparable<FieldInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final java.lang.reflect.Field f15311a;

    /* renamed from: b  reason: collision with root package name */
    private final FieldType f15312b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f15313c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15314d;

    /* renamed from: e  reason: collision with root package name */
    private final java.lang.reflect.Field f15315e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15316f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15317g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15318h;

    /* renamed from: i  reason: collision with root package name */
    private final f0 f15319i;

    /* renamed from: j  reason: collision with root package name */
    private final java.lang.reflect.Field f15320j;

    /* renamed from: k  reason: collision with root package name */
    private final Class<?> f15321k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f15322l;

    /* renamed from: m  reason: collision with root package name */
    private final Internal.EnumVerifier f15323m;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private f0 oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public FieldInfo build() {
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return FieldInfo.f(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                if (this.required) {
                    return FieldInfo.j(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
                }
                return FieldInfo.i(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                if (field2 == null) {
                    return FieldInfo.d(this.field, this.fieldNumber, this.type, enumVerifier);
                }
                return FieldInfo.h(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            if (field3 == null) {
                return FieldInfo.c(this.field, this.fieldNumber, this.type, this.enforceUtf8);
            }
            return FieldInfo.g(this.field, this.fieldNumber, this.type, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z10) {
            this.enforceUtf8 = z10;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.field = field;
            return this;
        }

        public Builder withFieldNumber(int i10) {
            this.fieldNumber = i10;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(f0 f0Var, Class<?> cls) {
            if (this.field == null && this.presenceField == null) {
                this.oneofStoredType = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field field, int i10) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i10;
            return this;
        }

        public Builder withRequired(boolean z10) {
            this.required = z10;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15324a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f15324a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15324a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15324a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15324a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private FieldInfo(java.lang.reflect.Field field, int i10, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i11, boolean z10, boolean z11, f0 f0Var, Class<?> cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f15311a = field;
        this.f15312b = fieldType;
        this.f15313c = cls;
        this.f15314d = i10;
        this.f15315e = field2;
        this.f15316f = i11;
        this.f15317g = z10;
        this.f15318h = z11;
        this.f15321k = cls2;
        this.f15322l = obj;
        this.f15323m = enumVerifier;
        this.f15320j = field3;
    }

    private static void a(int i10) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i10);
    }

    public static FieldInfo c(java.lang.reflect.Field field, int i10, FieldType fieldType, boolean z10) {
        a(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i10, fieldType, null, null, 0, false, z10, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static FieldInfo d(java.lang.reflect.Field field, int i10, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        a(i10);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static FieldInfo f(java.lang.reflect.Field field, int i10, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.checkNotNull(obj, "mapDefaultEntry");
        a(i10);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i10, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static FieldInfo g(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2) {
        a(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static FieldInfo h(java.lang.reflect.Field field, int i10, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        a(i10);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i10, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static FieldInfo i(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z10, Internal.EnumVerifier enumVerifier) {
        a(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 != null && !v(i11)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
        }
        return new FieldInfo(field, i10, fieldType, null, field2, i11, false, z10, null, null, null, enumVerifier, null);
    }

    public static FieldInfo j(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z10, Internal.EnumVerifier enumVerifier) {
        a(i10);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 != null && !v(i11)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
        }
        return new FieldInfo(field, i10, fieldType, null, field2, i11, true, z10, null, null, null, enumVerifier, null);
    }

    private static boolean v(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f15314d - fieldInfo.f15314d;
    }

    public java.lang.reflect.Field k() {
        return this.f15320j;
    }

    public Internal.EnumVerifier l() {
        return this.f15323m;
    }

    public java.lang.reflect.Field m() {
        return this.f15311a;
    }

    public int n() {
        return this.f15314d;
    }

    public Object o() {
        return this.f15322l;
    }

    public Class<?> p() {
        int i10 = a.f15324a[this.f15312b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            java.lang.reflect.Field field = this.f15311a;
            return field != null ? field.getType() : this.f15321k;
        } else if (i10 == 3 || i10 == 4) {
            return this.f15313c;
        } else {
            return null;
        }
    }

    public f0 q() {
        return this.f15319i;
    }

    public java.lang.reflect.Field r() {
        return this.f15315e;
    }

    public int s() {
        return this.f15316f;
    }

    public FieldType t() {
        return this.f15312b;
    }

    public boolean u() {
        return this.f15318h;
    }

    public boolean w() {
        return this.f15317g;
    }
}
