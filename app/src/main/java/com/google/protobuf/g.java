package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g implements Writer {

    /* renamed from: a  reason: collision with root package name */
    private final CodedOutputStream f15424a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedOutputStreamWriter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15425a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15425a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15425a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15425a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15425a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15425a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15425a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15425a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15425a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15425a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15425a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15425a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15425a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private g(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.f15424a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static g Q(CodedOutputStream codedOutputStream) {
        g gVar = codedOutputStream.wrapper;
        return gVar != null ? gVar : new g(codedOutputStream);
    }

    private <V> void R(int i10, boolean z10, V v10, MapEntryLite.b<Boolean, V> bVar) throws IOException {
        this.f15424a.writeTag(i10, 2);
        this.f15424a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Boolean.valueOf(z10), v10));
        MapEntryLite.writeTo(this.f15424a, bVar, Boolean.valueOf(z10), v10);
    }

    private <V> void S(int i10, MapEntryLite.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer num : map.keySet()) {
            iArr[i11] = num.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f15424a.writeTag(i10, 2);
            this.f15424a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Integer.valueOf(i13), v10));
            MapEntryLite.writeTo(this.f15424a, bVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void T(int i10, MapEntryLite.b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long l10 : map.keySet()) {
            jArr[i11] = l10.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f15424a.writeTag(i10, 2);
            this.f15424a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Long.valueOf(j10), v10));
            MapEntryLite.writeTo(this.f15424a, bVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void U(int i10, MapEntryLite.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.f15425a[bVar.f15363a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    R(i10, false, v10, bVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    R(i10, true, v11, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                S(i10, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                T(i10, bVar, map);
                return;
            case 12:
                V(i10, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f15363a);
        }
    }

    private <V> void V(int i10, MapEntryLite.b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            V v10 = map.get(str2);
            this.f15424a.writeTag(i10, 2);
            this.f15424a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, str2, v10));
            MapEntryLite.writeTo(this.f15424a, bVar, str2, v10);
        }
    }

    private void W(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f15424a.writeString(i10, (String) obj);
        } else {
            this.f15424a.writeBytes(i10, (ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void A(int i10, long j10) throws IOException {
        this.f15424a.writeInt64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void B(int i10, boolean z10) throws IOException {
        this.f15424a.writeBool(i10, z10);
    }

    @Override // com.google.protobuf.Writer
    public void C(int i10, int i11) throws IOException {
        this.f15424a.writeSFixed32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public void D(int i10) throws IOException {
        this.f15424a.writeTag(i10, 3);
    }

    @Override // com.google.protobuf.Writer
    public void E(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeFixed64SizeNoTag(list.get(i13).longValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeFixed64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeFixed64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void F(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i13).intValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeSFixed32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeSFixed32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void G(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeBoolSizeNoTag(list.get(i13).booleanValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeBoolNoTag(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeBool(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void H(int i10, MapEntryLite.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f15424a.isSerializationDeterministic()) {
            U(i10, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f15424a.writeTag(i10, 2);
            this.f15424a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.f15424a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.Writer
    public void I(int i10, float f10) throws IOException {
        this.f15424a.writeFloat(i10, f10);
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public void J(int i10) throws IOException {
        this.f15424a.writeTag(i10, 4);
    }

    @Override // com.google.protobuf.Writer
    public void K(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i13).intValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeSInt32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeSInt32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void L(int i10, int i11) throws IOException {
        this.f15424a.writeEnum(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void M(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeInt64SizeNoTag(list.get(i13).longValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeInt64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void N(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeDoubleSizeNoTag(list.get(i13).doubleValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeDoubleNoTag(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeDouble(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void O(int i10, int i11) throws IOException {
        this.f15424a.writeSInt32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void P(int i10, List<ByteString> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f15424a.writeBytes(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.Writer
    public void a(int i10, List<?> list, m0 m0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            w(i10, list.get(i11), m0Var);
        }
    }

    @Override // com.google.protobuf.Writer
    public void b(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeFloatSizeNoTag(list.get(i13).floatValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeFloatNoTag(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeFloat(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void c(int i10, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f15424a.writeRawMessageSetExtension(i10, (ByteString) obj);
        } else {
            this.f15424a.writeMessageSetExtension(i10, (MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void d(int i10, int i11) throws IOException {
        this.f15424a.writeFixed32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void e(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i11 < list.size()) {
                W(i10, lazyStringList.getRaw(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeString(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void f(int i10, String str) throws IOException {
        this.f15424a.writeString(i10, str);
    }

    @Override // com.google.protobuf.Writer
    public void g(int i10, long j10) throws IOException {
        this.f15424a.writeUInt64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void h(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeInt32SizeNoTag(list.get(i13).intValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeInt32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeInt32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void i(int i10, Object obj, m0 m0Var) throws IOException {
        this.f15424a.writeGroup(i10, (MessageLite) obj, m0Var);
    }

    @Override // com.google.protobuf.Writer
    public void j(int i10, ByteString byteString) throws IOException {
        this.f15424a.writeBytes(i10, byteString);
    }

    @Override // com.google.protobuf.Writer
    public void k(int i10, int i11) throws IOException {
        this.f15424a.writeInt32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void l(int i10, long j10) throws IOException {
        this.f15424a.writeSFixed64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void m(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeFixed32SizeNoTag(list.get(i13).intValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeFixed32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeFixed32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void n(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i13).intValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeUInt32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeUInt32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void o(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i13).longValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeSInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeSInt64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void p(int i10, long j10) throws IOException {
        this.f15424a.writeSInt64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void q(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeEnumSizeNoTag(list.get(i13).intValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeEnumNoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeEnum(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void r(int i10, List<?> list, m0 m0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            i(i10, list.get(i11), m0Var);
        }
    }

    @Override // com.google.protobuf.Writer
    public void s(int i10, int i11) throws IOException {
        this.f15424a.writeUInt32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void t(int i10, double d10) throws IOException {
        this.f15424a.writeDouble(i10, d10);
    }

    @Override // com.google.protobuf.Writer
    public void u(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i13).longValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeSFixed64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeSFixed64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void v(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f15424a.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i13).longValue());
            }
            this.f15424a.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.f15424a.writeUInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f15424a.writeUInt64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void w(int i10, Object obj, m0 m0Var) throws IOException {
        this.f15424a.writeMessage(i10, (MessageLite) obj, m0Var);
    }

    @Override // com.google.protobuf.Writer
    public void x(int i10, long j10) throws IOException {
        this.f15424a.writeFixed64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public Writer.FieldOrder y() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.protobuf.Writer
    public void z(int i10, Object obj) throws IOException {
        this.f15424a.writeMessage(i10, (MessageLite) obj);
    }
}
