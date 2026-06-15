package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final FieldSet f15326d = new FieldSet(true);

    /* renamed from: a  reason: collision with root package name */
    private final p0<T, Object> f15327a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15328b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15329c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15330a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f15331b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15331b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15331b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15331b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15331b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15331b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15331b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15331b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15331b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15331b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15331b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15331b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15331b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15331b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15331b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15331b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15331b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15331b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15331b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f15330a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f15330a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f15330a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f15330a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f15330a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f15330a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f15330a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f15330a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f15330a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private FieldSet() {
        this.f15327a = p0.q(16);
    }

    private void A(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (key.isRepeated()) {
            Object j10 = j(key);
            if (j10 == null) {
                j10 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) j10).add(d(obj));
            }
            this.f15327a.put(key, j10);
        } else if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object j11 = j(key);
            if (j11 == null) {
                this.f15327a.put(key, d(value));
                return;
            }
            this.f15327a.put(key, key.internalMergeFrom(((MessageLite) j11).toBuilder(), (MessageLite) value).build());
        } else {
            this.f15327a.put(key, d(value));
        }
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> B() {
        return new FieldSet<>();
    }

    public static Object C(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z10) throws IOException {
        if (z10) {
            return WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.b.f15393b);
        }
        return WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.b.f15392a);
    }

    private void F(T t10, Object obj) {
        if (!w(t10.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void G(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i10, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i10, p(fieldType, false));
        H(codedOutputStream, fieldType, obj);
    }

    static void H(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f15331b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void I(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int i10 = 0;
                for (Object obj2 : list) {
                    i10 += f(liteType, obj2);
                }
                codedOutputStream.writeUInt32NoTag(i10);
                for (Object obj3 : list) {
                    H(codedOutputStream, liteType, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                G(codedOutputStream, liteType, number, obj4);
            }
        } else if (obj instanceof LazyField) {
            G(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            G(codedOutputStream, liteType, number, obj);
        }
    }

    private static Object d(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(WireFormat.FieldType fieldType, int i10, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i10);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + f(fieldType, obj);
    }

    static int f(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f15331b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int g(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int i10 = 0;
            if (fieldDescriptorLite.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i10 += f(liteType, obj2);
                }
                return CodedOutputStream.computeTagSize(number) + i10 + CodedOutputStream.computeUInt32SizeNoTag(i10);
            }
            for (Object obj3 : (List) obj) {
                i10 += e(liteType, number, obj3);
            }
            return i10;
        }
        return e(liteType, number, obj);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> i() {
        return f15326d;
    }

    private int l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (MessageLite) value);
        }
        return g(key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(WireFormat.FieldType fieldType, boolean z10) {
        if (z10) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private static <T extends FieldDescriptorLite<T>> boolean u(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!v(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return v(entry.getValue());
        }
        return true;
    }

    private static boolean v(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean w(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (a.f15330a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof Internal.EnumLite);
            case 9:
                return (obj instanceof MessageLite) || (obj instanceof LazyField);
            default:
                return false;
        }
    }

    public void D(T t10, Object obj) {
        if (t10.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    F(t10, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            F(t10, obj);
        }
        if (obj instanceof LazyField) {
            this.f15329c = true;
        }
        this.f15327a.put(t10, obj);
    }

    public void E(T t10, int i10, Object obj) {
        if (t10.isRepeated()) {
            Object j10 = j(t10);
            if (j10 != null) {
                F(t10, obj);
                ((List) j10).set(i10, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public void a(T t10, Object obj) {
        List list;
        if (t10.isRepeated()) {
            F(t10, obj);
            Object j10 = j(t10);
            if (j10 == null) {
                list = new ArrayList();
                this.f15327a.put(t10, list);
            } else {
                list = (List) j10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public void b(T t10) {
        this.f15327a.remove(t10);
        if (this.f15327a.isEmpty()) {
            this.f15329c = false;
        }
    }

    /* renamed from: c */
    public FieldSet<T> clone() {
        FieldSet<T> B = B();
        for (int i10 = 0; i10 < this.f15327a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f15327a.j(i10);
            B.D(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f15327a.m()) {
            B.D(entry.getKey(), entry.getValue());
        }
        B.f15329c = this.f15329c;
        return B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f15327a.equals(((FieldSet) obj).f15327a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> h() {
        if (this.f15329c) {
            return new LazyField.c(this.f15327a.h().iterator());
        }
        return this.f15327a.h().iterator();
    }

    public int hashCode() {
        return this.f15327a.hashCode();
    }

    public Object j(T t10) {
        Object obj = this.f15327a.get(t10);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public int k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f15327a.k(); i11++) {
            i10 += l(this.f15327a.j(i11));
        }
        for (Map.Entry<T, Object> entry : this.f15327a.m()) {
            i10 += l(entry);
        }
        return i10;
    }

    public Object m(T t10, int i10) {
        if (t10.isRepeated()) {
            Object j10 = j(t10);
            if (j10 != null) {
                return ((List) j10).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int n(T t10) {
        if (t10.isRepeated()) {
            Object j10 = j(t10);
            if (j10 == null) {
                return 0;
            }
            return ((List) j10).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int o() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f15327a.k(); i11++) {
            Map.Entry<T, Object> j10 = this.f15327a.j(i11);
            i10 += g(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f15327a.m()) {
            i10 += g(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean q(T t10) {
        if (t10.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f15327a.get(t10) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        return this.f15327a.isEmpty();
    }

    public boolean s() {
        return this.f15328b;
    }

    public boolean t() {
        for (int i10 = 0; i10 < this.f15327a.k(); i10++) {
            if (!u(this.f15327a.j(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f15327a.m()) {
            if (!u(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> x() {
        if (this.f15329c) {
            return new LazyField.c(this.f15327a.entrySet().iterator());
        }
        return this.f15327a.entrySet().iterator();
    }

    public void y() {
        if (this.f15328b) {
            return;
        }
        for (int i10 = 0; i10 < this.f15327a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f15327a.j(i10);
            if (j10.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) j10.getValue()).makeImmutable();
            }
        }
        this.f15327a.p();
        this.f15328b = true;
    }

    public void z(FieldSet<T> fieldSet) {
        for (int i10 = 0; i10 < fieldSet.f15327a.k(); i10++) {
            A(fieldSet.f15327a.j(i10));
        }
        for (Map.Entry<T, Object> entry : fieldSet.f15327a.m()) {
            A(entry);
        }
    }

    private FieldSet(boolean z10) {
        this(p0.q(0));
        y();
    }

    private FieldSet(p0<T, Object> p0Var) {
        this.f15327a = p0Var;
        y();
    }
}
