package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final b<K, V> metadata;
    private final V value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15362a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15362a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15362a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15362a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final WireFormat.FieldType f15363a;

        /* renamed from: b  reason: collision with root package name */
        public final K f15364b;

        /* renamed from: c  reason: collision with root package name */
        public final WireFormat.FieldType f15365c;

        /* renamed from: d  reason: collision with root package name */
        public final V f15366d;

        public b(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
            this.f15363a = fieldType;
            this.f15364b = k10;
            this.f15365c = fieldType2;
            this.f15366d = v10;
        }
    }

    private MapEntryLite(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        this.metadata = new b<>(fieldType, k10, fieldType2, v10);
        this.key = k10;
        this.value = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int computeSerializedSize(b<K, V> bVar, K k10, V v10) {
        return FieldSet.e(bVar.f15363a, 1, k10) + FieldSet.e(bVar.f15365c, 2, v10);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        return new MapEntryLite<>(fieldType, k10, fieldType2, v10);
    }

    static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t10) throws IOException {
        int i10 = a.f15362a[fieldType.ordinal()];
        if (i10 == 1) {
            MessageLite.Builder builder = ((MessageLite) t10).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        } else if (i10 != 2) {
            if (i10 != 3) {
                return (T) FieldSet.C(codedInputStream, fieldType, true);
            }
            throw new RuntimeException("Groups are not allowed in maps.");
        } else {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, b<K, V> bVar, K k10, V v10) throws IOException {
        FieldSet.G(codedOutputStream, bVar.f15363a, 1, k10);
        FieldSet.G(codedOutputStream, bVar.f15365c, 2, v10);
    }

    public int computeMessageSize(int i10, K k10, V v10) {
        return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k10, v10));
    }

    public K getKey() {
        return this.key;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b<K, V> getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        b<K, V> bVar = this.metadata;
        Object obj = bVar.f15364b;
        Object obj2 = bVar.f15366d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.makeTag(1, this.metadata.f15363a.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, this.metadata.f15363a, obj);
            } else if (readTag == WireFormat.makeTag(2, this.metadata.f15365c.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.f15365c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i10, K k10, V v10) throws IOException {
        codedOutputStream.writeTag(i10, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k10, v10));
        writeTo(codedOutputStream, this.metadata, k10, v10);
    }

    static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, b<K, V> bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object obj = bVar.f15364b;
        Object obj2 = bVar.f15366d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.makeTag(1, bVar.f15363a.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, bVar.f15363a, obj);
            } else if (readTag == WireFormat.makeTag(2, bVar.f15365c.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, bVar.f15365c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private MapEntryLite(b<K, V> bVar, K k10, V v10) {
        this.metadata = bVar;
        this.key = k10;
        this.value = v10;
    }
}
