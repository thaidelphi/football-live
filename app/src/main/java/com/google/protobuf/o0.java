package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SchemaUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f15469a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final r0<?, ?> f15470b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final r0<?, ?> f15471c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final r0<?, ?> f15472d = new s0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(Object obj, int i10, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, r0<UT, UB> r0Var) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) L(obj, i10, intValue, ub, r0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(intValue2)) {
                    ub = (UB) L(obj, i10, intValue2, ub, r0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static r0<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (r0) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void E(j<FT> jVar, T t10, T t11) {
        FieldSet<FT> c10 = jVar.c(t11);
        if (c10.r()) {
            return;
        }
        jVar.d(t10).z(c10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(t tVar, T t10, T t11, long j10) {
        t0.Y(t10, j10, tVar.a(t0.H(t10, j10), t0.H(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(r0<UT, UB> r0Var, T t10, T t11) {
        r0Var.p(t10, r0Var.k(r0Var.g(t10), r0Var.g(t11)));
    }

    public static r0<?, ?> H() {
        return f15470b;
    }

    public static r0<?, ?> I() {
        return f15471c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f15469a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB L(Object obj, int i10, int i11, UB ub, r0<UT, UB> r0Var) {
        if (ub == null) {
            ub = r0Var.f(obj);
        }
        r0Var.e(ub, i10, i11);
        return ub;
    }

    public static r0<?, ?> M() {
        return f15472d;
    }

    public static void N(int i10, List<Boolean> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.G(i10, list, z10);
    }

    public static void O(int i10, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.P(i10, list);
    }

    public static void P(int i10, List<Double> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.N(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.m(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.E(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.b(i10, list, z10);
    }

    public static void U(int i10, List<?> list, Writer writer, m0 m0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.r(i10, list, m0Var);
    }

    public static void V(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.M(i10, list, z10);
    }

    public static void X(int i10, List<?> list, Writer writer, m0 m0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i10, list, m0Var);
    }

    public static void Y(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.F(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.u(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * CodedOutputStream.computeBoolSize(i10, true);
    }

    public static void a0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.K(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.o(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * CodedOutputStream.computeTagSize(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            computeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i11));
        }
        return computeTagSize;
    }

    public static void c0(int i10, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.e(i10, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e8 = e(list);
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(e8);
        }
        return e8 + (size * CodedOutputStream.computeTagSize(i10));
    }

    public static void d0(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.n(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeEnumSizeNoTag(oVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeEnumSizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.v(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i10, List<MessageLite> list, m0 m0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.computeGroupSize(i10, list.get(i12), m0Var);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(l10);
        }
        return l10 + (size * CodedOutputStream.computeTagSize(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeInt32SizeNoTag(oVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(n10);
        }
        return n10 + (list.size() * CodedOutputStream.computeTagSize(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeInt64SizeNoTag(rVar.getLong(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i10, Object obj, m0 m0Var) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(i10, (LazyFieldLite) obj);
        }
        return CodedOutputStream.computeMessageSize(i10, (MessageLite) obj, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i10, List<?> list, m0 m0Var) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof LazyFieldLite) {
                computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, m0Var);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(r10);
        }
        return r10 + (size * CodedOutputStream.computeTagSize(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeSInt32SizeNoTag(oVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(t10);
        }
        return t10 + (size * CodedOutputStream.computeTagSize(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeSInt64SizeNoTag(rVar.getLong(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i10, List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i11 < size) {
                Object raw = lazyStringList.getRaw(i11);
                if (raw instanceof ByteString) {
                    computeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                } else {
                    computeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                computeTagSize += computeStringSizeNoTag2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof ByteString) {
                    computeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                } else {
                    computeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
                }
                computeTagSize += computeStringSizeNoTag;
                i11++;
            }
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(w10);
        }
        return w10 + (size * CodedOutputStream.computeTagSize(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeUInt32SizeNoTag(oVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        if (z10) {
            return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(y10);
        }
        return y10 + (size * CodedOutputStream.computeTagSize(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeUInt64SizeNoTag(rVar.getLong(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, r0<UT, UB> r0Var) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (enumLiteMap.findValueByNumber(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) L(obj, i10, intValue, ub, r0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(intValue2) == null) {
                    ub = (UB) L(obj, i10, intValue2, ub, r0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
