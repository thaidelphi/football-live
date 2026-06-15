package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final Charset US_ASCII = Charset.forName("US-ASCII");
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z10);

        boolean getBoolean(int i10);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Boolean> mutableCopyWithCapacity(int i10);

        boolean setBoolean(int i10, boolean z10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d10);

        double getDouble(int i10);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Double> mutableCopyWithCapacity(int i10);

        double setDouble(int i10, double d10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface EnumVerifier {
        boolean isInRange(int i10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f10);

        float getFloat(int i10);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Float> mutableCopyWithCapacity(int i10);

        float setFloat(int i10, float f10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i10);

        int getInt(int i10);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Integer> mutableCopyWithCapacity(int i10);

        int setInt(int i10, int i11);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public interface Converter<F, T> {
            T convert(F f10);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
            this.fromList = list;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.converter.convert(this.fromList.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long j10);

        long getLong(int i10);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Long> mutableCopyWithCapacity(int i10);

        long setLong(int i10, long j10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public interface Converter<A, B> {
            A doBackward(B b10);

            B doForward(A a10);
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a<T> implements Converter<Integer, T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EnumLiteMap f15349a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EnumLite f15350b;

            a(EnumLiteMap enumLiteMap, EnumLite enumLite) {
                this.f15349a = enumLiteMap;
                this.f15350b = enumLite;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            /* renamed from: a */
            public Integer doBackward(EnumLite enumLite) {
                return Integer.valueOf(enumLite.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            /* renamed from: b */
            public EnumLite doForward(Integer num) {
                EnumLite findValueByNumber = this.f15349a.findValueByNumber(num.intValue());
                return findValueByNumber == null ? this.f15350b : findValueByNumber;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class b implements Map.Entry<K, V> {

            /* renamed from: a  reason: collision with root package name */
            private final Map.Entry<K, RealValue> f15351a;

            public b(Map.Entry<K, RealValue> entry) {
                this.f15351a = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f15351a.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) MapAdapter.this.valueConverter.doForward(this.f15351a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f15351a.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v10) {
                Object value = this.f15351a.setValue(MapAdapter.this.valueConverter.doBackward(v10));
                if (value == null) {
                    return null;
                }
                return (V) MapAdapter.this.valueConverter.doForward(value);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        private class c implements Iterator<Map.Entry<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private final Iterator<Map.Entry<K, RealValue>> f15353a;

            public c(Iterator<Map.Entry<K, RealValue>> it) {
                this.f15353a = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, V> next() {
                return new b(this.f15353a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f15353a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f15353a.remove();
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        private class d extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private final Set<Map.Entry<K, RealValue>> f15355a;

            public d(Set<Map.Entry<K, RealValue>> set) {
                this.f15355a = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new c(this.f15355a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f15355a.size();
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.realMap = map;
            this.valueConverter = converter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(EnumLiteMap<T> enumLiteMap, T t10) {
            return new a(enumLiteMap, t10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new d(this.realMap.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.realMap.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            RealValue put = this.realMap.put(k10, this.valueConverter.doBackward(v10));
            if (put == null) {
                return null;
            }
            return this.valueConverter.doForward(put);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(ISO_8859_1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return ((ByteBuffer) byteBuffer.duplicate().clear()).equals((ByteBuffer) byteBuffer2.duplicate().clear());
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e8) {
            throw new RuntimeException("Failed to get default instance for " + cls, e8);
        }
    }

    public static int hashBoolean(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        int i10 = 1;
        for (byte[] bArr : list) {
            i10 = (i10 * 31) + hashCode(bArr);
        }
        return i10;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        int i10 = 1;
        for (ByteBuffer byteBuffer : list) {
            i10 = (i10 * 31) + hashCodeByteBuffer(byteBuffer);
        }
        return i10;
    }

    public static int hashEnum(EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        int i10 = 1;
        for (EnumLite enumLite : list) {
            i10 = (i10 * 31) + hashEnum(enumLite);
        }
        return i10;
    }

    public static int hashLong(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object mergeMessage(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialHash(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return u0.t(bArr);
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!equalsByteBuffer(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(byte[] bArr) {
        return hashCode(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int partialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (partialHash == 0) {
                return 1;
            }
            return partialHash;
        }
        int capacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
        int capacity2 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = partialHash(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    static int hashCode(byte[] bArr, int i10, int i11) {
        int partialHash = partialHash(i11, bArr, i10, i11);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }
}
