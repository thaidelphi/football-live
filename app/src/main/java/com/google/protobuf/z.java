package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.google.protobuf.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageSchema.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z<T> implements m0<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f15541r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f15542s = t0.I();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f15543a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f15544b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15545c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15546d;

    /* renamed from: e  reason: collision with root package name */
    private final MessageLite f15547e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15548f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15549g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15550h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f15551i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f15552j;

    /* renamed from: k  reason: collision with root package name */
    private final int f15553k;

    /* renamed from: l  reason: collision with root package name */
    private final int f15554l;

    /* renamed from: m  reason: collision with root package name */
    private final b0 f15555m;

    /* renamed from: n  reason: collision with root package name */
    private final q f15556n;

    /* renamed from: o  reason: collision with root package name */
    private final r0<?, ?> f15557o;

    /* renamed from: p  reason: collision with root package name */
    private final j<?> f15558p;

    /* renamed from: q  reason: collision with root package name */
    private final t f15559q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MessageSchema.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15560a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15560a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15560a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15560a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15560a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15560a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15560a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15560a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15560a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15560a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15560a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15560a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15560a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15560a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15560a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15560a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15560a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15560a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private z(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, b0 b0Var, q qVar, r0<?, ?> r0Var, j<?> jVar, t tVar) {
        this.f15543a = iArr;
        this.f15544b = objArr;
        this.f15545c = i10;
        this.f15546d = i11;
        this.f15549g = messageLite instanceof GeneratedMessageLite;
        this.f15550h = z10;
        this.f15548f = jVar != null && jVar.e(messageLite);
        this.f15551i = z11;
        this.f15552j = iArr2;
        this.f15553k = i12;
        this.f15554l = i13;
        this.f15555m = b0Var;
        this.f15556n = qVar;
        this.f15557o = r0Var;
        this.f15558p = jVar;
        this.f15547e = messageLite;
        this.f15559q = tVar;
    }

    private <UT, UB> int A(r0<UT, UB> r0Var, T t10) {
        return r0Var.h(r0Var.g(t10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0(T r18, com.google.protobuf.Writer r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z.A0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private static <T> int B(T t10, long j10) {
        return t0.D(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B0(T r13, com.google.protobuf.Writer r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z.B0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private static boolean C(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C0(T r11, com.google.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z.C0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private boolean D(T t10, int i10) {
        int m02 = m0(i10);
        long j10 = 1048575 & m02;
        if (j10 != 1048575) {
            return (t0.D(t10, j10) & (1 << (m02 >>> 20))) != 0;
        }
        int z02 = z0(i10);
        long Z = Z(z02);
        switch (y0(z02)) {
            case 0:
                return Double.doubleToRawLongBits(t0.B(t10, Z)) != 0;
            case 1:
                return Float.floatToRawIntBits(t0.C(t10, Z)) != 0;
            case 2:
                return t0.F(t10, Z) != 0;
            case 3:
                return t0.F(t10, Z) != 0;
            case 4:
                return t0.D(t10, Z) != 0;
            case 5:
                return t0.F(t10, Z) != 0;
            case 6:
                return t0.D(t10, Z) != 0;
            case 7:
                return t0.u(t10, Z);
            case 8:
                Object H = t0.H(t10, Z);
                if (H instanceof String) {
                    return !((String) H).isEmpty();
                }
                if (H instanceof ByteString) {
                    return !ByteString.EMPTY.equals(H);
                }
                throw new IllegalArgumentException();
            case 9:
                return t0.H(t10, Z) != null;
            case 10:
                return !ByteString.EMPTY.equals(t0.H(t10, Z));
            case 11:
                return t0.D(t10, Z) != 0;
            case 12:
                return t0.D(t10, Z) != 0;
            case 13:
                return t0.D(t10, Z) != 0;
            case 14:
                return t0.F(t10, Z) != 0;
            case 15:
                return t0.D(t10, Z) != 0;
            case 16:
                return t0.F(t10, Z) != 0;
            case 17:
                return t0.H(t10, Z) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private <K, V> void D0(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.H(i10, this.f15559q.b(v(i11)), this.f15559q.e(obj));
        }
    }

    private boolean E(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return D(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    private void E0(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.f(i10, (String) obj);
        } else {
            writer.j(i10, (ByteString) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean F(Object obj, int i10, m0 m0Var) {
        return m0Var.d(t0.H(obj, Z(i10)));
    }

    private <UT, UB> void F0(r0<UT, UB> r0Var, T t10, Writer writer) throws IOException {
        r0Var.t(r0Var.g(t10), writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean G(Object obj, int i10, int i11) {
        List list = (List) t0.H(obj, Z(i10));
        if (list.isEmpty()) {
            return true;
        }
        m0 w10 = w(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!w10.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.m0] */
    private boolean H(T t10, int i10, int i11) {
        Map<?, ?> e8 = this.f15559q.e(t0.H(t10, Z(i10)));
        if (e8.isEmpty()) {
            return true;
        }
        if (this.f15559q.b(v(i11)).f15365c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        m0<T> m0Var = 0;
        for (Object obj : e8.values()) {
            if (m0Var == null) {
                m0Var = h0.a().c(obj.getClass());
            }
            boolean d10 = m0Var.d(obj);
            m0Var = m0Var;
            if (!d10) {
                return false;
            }
        }
        return true;
    }

    private static boolean I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean J(T t10, T t11, int i10) {
        long m02 = m0(i10) & 1048575;
        return t0.D(t10, m02) == t0.D(t11, m02);
    }

    private boolean K(T t10, int i10, int i11) {
        return t0.D(t10, (long) (m0(i11) & 1048575)) == i10;
    }

    private static boolean L(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> M(Object obj, long j10) {
        return (List) t0.H(obj, j10);
    }

    private static <T> long N(T t10, long j10) {
        return t0.F(t10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0649 A[Catch: all -> 0x06a1, TRY_LEAVE, TryCatch #0 {all -> 0x06a1, blocks: (B:158:0x061a, B:169:0x0643, B:171:0x0649, B:181:0x0671, B:182:0x0676), top: B:210:0x061a }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b3 A[LOOP:2: B:201:0x06af->B:203:0x06b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06c8  */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.protobuf.r0] */
    /* JADX WARN: Type inference failed for: r14v62 */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.protobuf.k0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void O(com.google.protobuf.r0<UT, UB> r19, com.google.protobuf.j<ET> r20, T r21, com.google.protobuf.k0 r22, com.google.protobuf.ExtensionRegistryLite r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z.O(com.google.protobuf.r0, com.google.protobuf.j, java.lang.Object, com.google.protobuf.k0, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void P(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, k0 k0Var) throws IOException {
        long Z = Z(z0(i10));
        Object H = t0.H(obj, Z);
        if (H == null) {
            H = this.f15559q.d(obj2);
            t0.Y(obj, Z, H);
        } else if (this.f15559q.h(H)) {
            Object d10 = this.f15559q.d(obj2);
            this.f15559q.a(d10, H);
            t0.Y(obj, Z, d10);
            H = d10;
        }
        k0Var.q(this.f15559q.c(H), this.f15559q.b(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(T t10, T t11, int i10) {
        if (D(t11, i10)) {
            long Z = Z(z0(i10));
            Unsafe unsafe = f15542s;
            Object object = unsafe.getObject(t11, Z);
            if (object != null) {
                m0 w10 = w(i10);
                if (!D(t10, i10)) {
                    if (!I(object)) {
                        unsafe.putObject(t10, Z, object);
                    } else {
                        Object f10 = w10.f();
                        w10.a(f10, object);
                        unsafe.putObject(t10, Z, f10);
                    }
                    s0(t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, Z);
                if (!I(object2)) {
                    Object f11 = w10.f();
                    w10.a(f11, object2);
                    unsafe.putObject(t10, Z, f11);
                    object2 = f11;
                }
                w10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + Y(i10) + " is present but null: " + t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(T t10, T t11, int i10) {
        int Y = Y(i10);
        if (K(t11, Y, i10)) {
            long Z = Z(z0(i10));
            Unsafe unsafe = f15542s;
            Object object = unsafe.getObject(t11, Z);
            if (object != null) {
                m0 w10 = w(i10);
                if (!K(t10, Y, i10)) {
                    if (!I(object)) {
                        unsafe.putObject(t10, Z, object);
                    } else {
                        Object f10 = w10.f();
                        w10.a(f10, object);
                        unsafe.putObject(t10, Z, f10);
                    }
                    t0(t10, Y, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, Z);
                if (!I(object2)) {
                    Object f11 = w10.f();
                    w10.a(f11, object2);
                    unsafe.putObject(t10, Z, f11);
                    object2 = f11;
                }
                w10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + Y(i10) + " is present but null: " + t11);
        }
    }

    private void S(T t10, T t11, int i10) {
        int z02 = z0(i10);
        long Z = Z(z02);
        int Y = Y(i10);
        switch (y0(z02)) {
            case 0:
                if (D(t11, i10)) {
                    t0.U(t10, Z, t0.B(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (D(t11, i10)) {
                    t0.V(t10, Z, t0.C(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (D(t11, i10)) {
                    t0.X(t10, Z, t0.F(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 3:
                if (D(t11, i10)) {
                    t0.X(t10, Z, t0.F(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 4:
                if (D(t11, i10)) {
                    t0.W(t10, Z, t0.D(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 5:
                if (D(t11, i10)) {
                    t0.X(t10, Z, t0.F(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 6:
                if (D(t11, i10)) {
                    t0.W(t10, Z, t0.D(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 7:
                if (D(t11, i10)) {
                    t0.N(t10, Z, t0.u(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (D(t11, i10)) {
                    t0.Y(t10, Z, t0.H(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 9:
                Q(t10, t11, i10);
                return;
            case 10:
                if (D(t11, i10)) {
                    t0.Y(t10, Z, t0.H(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 11:
                if (D(t11, i10)) {
                    t0.W(t10, Z, t0.D(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 12:
                if (D(t11, i10)) {
                    t0.W(t10, Z, t0.D(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 13:
                if (D(t11, i10)) {
                    t0.W(t10, Z, t0.D(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 14:
                if (D(t11, i10)) {
                    t0.X(t10, Z, t0.F(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 15:
                if (D(t11, i10)) {
                    t0.W(t10, Z, t0.D(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 16:
                if (D(t11, i10)) {
                    t0.X(t10, Z, t0.F(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 17:
                Q(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f15556n.d(t10, t11, Z);
                return;
            case 50:
                o0.F(this.f15559q, t10, t11, Z);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (K(t11, Y, i10)) {
                    t0.Y(t10, Z, t0.H(t11, Z));
                    t0(t10, Y, i10);
                    return;
                }
                return;
            case 60:
                R(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (K(t11, Y, i10)) {
                    t0.Y(t10, Z, t0.H(t11, Z));
                    t0(t10, Y, i10);
                    return;
                }
                return;
            case 68:
                R(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object T(T t10, int i10) {
        m0 w10 = w(i10);
        long Z = Z(z0(i10));
        if (!D(t10, i10)) {
            return w10.f();
        }
        Object object = f15542s.getObject(t10, Z);
        if (I(object)) {
            return object;
        }
        Object f10 = w10.f();
        if (object != null) {
            w10.a(f10, object);
        }
        return f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object U(T t10, int i10, int i11) {
        m0 w10 = w(i11);
        if (!K(t10, i10, i11)) {
            return w10.f();
        }
        Object object = f15542s.getObject(t10, Z(z0(i11)));
        if (I(object)) {
            return object;
        }
        Object f10 = w10.f();
        if (object != null) {
            w10.a(f10, object);
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> z<T> V(Class<T> cls, w wVar, b0 b0Var, q qVar, r0<?, ?> r0Var, j<?> jVar, t tVar) {
        if (wVar instanceof j0) {
            return X((j0) wVar, b0Var, qVar, r0Var, jVar, tVar);
        }
        return W((StructuralMessageInfo) wVar, b0Var, qVar, r0Var, jVar, tVar);
    }

    static <T> z<T> W(StructuralMessageInfo structuralMessageInfo, b0 b0Var, q qVar, r0<?, ?> r0Var, j<?> jVar, t tVar) {
        int n10;
        int n11;
        int i10;
        boolean z10 = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] d10 = structuralMessageInfo.d();
        if (d10.length == 0) {
            n10 = 0;
            n11 = 0;
        } else {
            n10 = d10[0].n();
            n11 = d10[d10.length - 1].n();
        }
        int length = d10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (FieldInfo fieldInfo : d10) {
            if (fieldInfo.t() == FieldType.MAP) {
                i11++;
            } else if (fieldInfo.t().id() >= 18 && fieldInfo.t().id() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] c10 = structuralMessageInfo.c();
        if (c10 == null) {
            c10 = f15541r;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < d10.length) {
            FieldInfo fieldInfo2 = d10[i13];
            int n12 = fieldInfo2.n();
            v0(fieldInfo2, iArr, i14, objArr);
            if (i15 < c10.length && c10[i15] == n12) {
                c10[i15] = i14;
                i15++;
            }
            if (fieldInfo2.t() == FieldType.MAP) {
                iArr2[i16] = i14;
                i16++;
            } else if (fieldInfo2.t().id() >= 18 && fieldInfo2.t().id() <= 49) {
                i10 = i14;
                iArr3[i17] = (int) t0.M(fieldInfo2.m());
                i17++;
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr2 == null) {
            iArr2 = f15541r;
        }
        if (iArr3 == null) {
            iArr3 = f15541r;
        }
        int[] iArr4 = new int[c10.length + iArr2.length + iArr3.length];
        System.arraycopy(c10, 0, iArr4, 0, c10.length);
        System.arraycopy(iArr2, 0, iArr4, c10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, c10.length + iArr2.length, iArr3.length);
        return new z<>(iArr, objArr, n10, n11, structuralMessageInfo.b(), z10, true, iArr4, c10.length, c10.length + iArr2.length, b0Var, qVar, r0Var, jVar, tVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.protobuf.z<T> X(com.google.protobuf.j0 r34, com.google.protobuf.b0 r35, com.google.protobuf.q r36, com.google.protobuf.r0<?, ?> r37, com.google.protobuf.j<?> r38, com.google.protobuf.t r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z.X(com.google.protobuf.j0, com.google.protobuf.b0, com.google.protobuf.q, com.google.protobuf.r0, com.google.protobuf.j, com.google.protobuf.t):com.google.protobuf.z");
    }

    private int Y(int i10) {
        return this.f15543a[i10];
    }

    private static long Z(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean a0(T t10, long j10) {
        return ((Boolean) t0.H(t10, j10)).booleanValue();
    }

    private static <T> double b0(T t10, long j10) {
        return ((Double) t0.H(t10, j10)).doubleValue();
    }

    private static <T> float c0(T t10, long j10) {
        return ((Float) t0.H(t10, j10)).floatValue();
    }

    private static <T> int d0(T t10, long j10) {
        return ((Integer) t0.H(t10, j10)).intValue();
    }

    private static <T> long e0(T t10, long j10) {
        return ((Long) t0.H(t10, j10)).longValue();
    }

    private <K, V> int f0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, c.b bVar) throws IOException {
        Unsafe unsafe = f15542s;
        Object v10 = v(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f15559q.h(object)) {
            Object d10 = this.f15559q.d(v10);
            this.f15559q.a(d10, object);
            unsafe.putObject(t10, j10, d10);
            object = d10;
        }
        return n(bArr, i10, i11, this.f15559q.b(v10), this.f15559q.c(object), bVar);
    }

    private int g0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, c.b bVar) throws IOException {
        Unsafe unsafe = f15542s;
        long j11 = this.f15543a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(c.d(bArr, i10)));
                    int i18 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(c.l(bArr, i10)));
                    int i19 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int L = c.L(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Long.valueOf(bVar.f15405b));
                    unsafe.putInt(t10, j11, i13);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int I = c.I(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(bVar.f15404a));
                    unsafe.putInt(t10, j11, i13);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(c.j(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(c.h(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int L2 = c.L(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f15405b != 0));
                    unsafe.putInt(t10, j11, i13);
                    return L2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int I2 = c.I(bArr, i10, bVar);
                    int i22 = bVar.f15404a;
                    if (i22 == 0) {
                        unsafe.putObject(t10, j10, "");
                    } else if ((i15 & 536870912) != 0 && !u0.u(bArr, I2, I2 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    } else {
                        unsafe.putObject(t10, j10, new String(bArr, I2, i22, Internal.UTF_8));
                        I2 += i22;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return I2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object U = U(t10, i13, i17);
                    int O = c.O(U, w(i17), bArr, i10, i11, bVar);
                    x0(t10, i13, i17, U);
                    return O;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int b10 = c.b(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, bVar.f15406c);
                    unsafe.putInt(t10, j11, i13);
                    return b10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int I3 = c.I(bArr, i10, bVar);
                    int i23 = bVar.f15404a;
                    Internal.EnumVerifier u10 = u(i17);
                    if (u10 != null && !u10.isInRange(i23)) {
                        x(t10).storeField(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(t10, j10, Integer.valueOf(i23));
                        unsafe.putInt(t10, j11, i13);
                    }
                    return I3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int I4 = c.I(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f15404a)));
                    unsafe.putInt(t10, j11, i13);
                    return I4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int L3 = c.L(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f15405b)));
                    unsafe.putInt(t10, j11, i13);
                    return L3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object U2 = U(t10, i13, i17);
                    int N = c.N(U2, w(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    x0(t10, i13, i17, U2);
                    return N;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x029b, code lost:
        if (r0 != r15) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02be, code lost:
        if (r0 != r15) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c1, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0252, code lost:
        if (r0 != r15) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0254, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r10 = r18;
        r1 = r19;
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int i0(T r31, byte[] r32, int r33, int r34, com.google.protobuf.c.b r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z.i0(java.lang.Object, byte[], int, int, com.google.protobuf.c$b):int");
    }

    private int j0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, c.b bVar) throws IOException {
        int J;
        Unsafe unsafe = f15542s;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t10, j11);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, protobufList);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return c.s(bArr, i10, protobufList, bVar);
                }
                if (i14 == 1) {
                    return c.e(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return c.v(bArr, i10, protobufList, bVar);
                }
                if (i14 == 5) {
                    return c.m(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return c.z(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.M(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return c.y(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.J(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return c.u(bArr, i10, protobufList, bVar);
                }
                if (i14 == 1) {
                    return c.k(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return c.t(bArr, i10, protobufList, bVar);
                }
                if (i14 == 5) {
                    return c.i(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    return c.r(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.a(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        return c.D(i12, bArr, i10, i11, protobufList, bVar);
                    }
                    return c.E(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return c.q(w(i15), i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return c.c(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    J = c.y(bArr, i10, protobufList, bVar);
                } else if (i14 == 0) {
                    J = c.J(i12, bArr, i10, i11, protobufList, bVar);
                }
                o0.A(t10, i13, protobufList, u(i15), null, this.f15557o);
                return J;
            case 33:
            case 47:
                if (i14 == 2) {
                    return c.w(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.A(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return c.x(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.B(i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return c.o(w(i15), i12, bArr, i10, i11, protobufList, bVar);
                }
                break;
        }
        return i10;
    }

    private boolean k(T t10, T t11, int i10) {
        return D(t10, i10) == D(t11, i10);
    }

    private int k0(int i10) {
        if (i10 < this.f15545c || i10 > this.f15546d) {
            return -1;
        }
        return u0(i10, 0);
    }

    private static <T> boolean l(T t10, long j10) {
        return t0.u(t10, j10);
    }

    private int l0(int i10, int i11) {
        if (i10 < this.f15545c || i10 > this.f15546d) {
            return -1;
        }
        return u0(i10, i11);
    }

    private static void m(Object obj) {
        if (I(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private int m0(int i10) {
        return this.f15543a[i10 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int n(byte[] bArr, int i10, int i11, MapEntryLite.b<K, V> bVar, Map<K, V> map, c.b bVar2) throws IOException {
        int i12;
        int I = c.I(bArr, i10, bVar2);
        int i13 = bVar2.f15404a;
        if (i13 >= 0 && i13 <= i11 - I) {
            int i14 = I + i13;
            K k10 = bVar.f15364b;
            V v10 = bVar.f15366d;
            while (I < i14) {
                int i15 = I + 1;
                byte b10 = bArr[I];
                if (b10 < 0) {
                    i12 = c.H(b10, bArr, i15, bVar2);
                    b10 = bVar2.f15404a;
                } else {
                    i12 = i15;
                }
                int i16 = b10 >>> 3;
                int i17 = b10 & 7;
                if (i16 != 1) {
                    if (i16 == 2 && i17 == bVar.f15365c.getWireType()) {
                        I = o(bArr, i12, i11, bVar.f15365c, bVar.f15366d.getClass(), bVar2);
                        v10 = bVar2.f15406c;
                    }
                    I = c.P(b10, bArr, i12, i11, bVar2);
                } else if (i17 == bVar.f15363a.getWireType()) {
                    I = o(bArr, i12, i11, bVar.f15363a, null, bVar2);
                    k10 = bVar2.f15406c;
                } else {
                    I = c.P(b10, bArr, i12, i11, bVar2);
                }
            }
            if (I == i14) {
                map.put(k10, v10);
                return i14;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private <E> void n0(Object obj, long j10, k0 k0Var, m0<E> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        k0Var.e(this.f15556n.e(obj, j10), m0Var, extensionRegistryLite);
    }

    private int o(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, c.b bVar) throws IOException {
        switch (a.f15560a[fieldType.ordinal()]) {
            case 1:
                int L = c.L(bArr, i10, bVar);
                bVar.f15406c = Boolean.valueOf(bVar.f15405b != 0);
                return L;
            case 2:
                return c.b(bArr, i10, bVar);
            case 3:
                bVar.f15406c = Double.valueOf(c.d(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar.f15406c = Integer.valueOf(c.h(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar.f15406c = Long.valueOf(c.j(bArr, i10));
                return i10 + 8;
            case 8:
                bVar.f15406c = Float.valueOf(c.l(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int I = c.I(bArr, i10, bVar);
                bVar.f15406c = Integer.valueOf(bVar.f15404a);
                return I;
            case 12:
            case 13:
                int L2 = c.L(bArr, i10, bVar);
                bVar.f15406c = Long.valueOf(bVar.f15405b);
                return L2;
            case 14:
                return c.p(h0.a().c(cls), bArr, i10, i11, bVar);
            case 15:
                int I2 = c.I(bArr, i10, bVar);
                bVar.f15406c = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f15404a));
                return I2;
            case 16:
                int L3 = c.L(bArr, i10, bVar);
                bVar.f15406c = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f15405b));
                return L3;
            case 17:
                return c.F(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <E> void o0(Object obj, int i10, k0 k0Var, m0<E> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        k0Var.g(this.f15556n.e(obj, Z(i10)), m0Var, extensionRegistryLite);
    }

    private static <T> double p(T t10, long j10) {
        return t0.B(t10, j10);
    }

    private void p0(Object obj, int i10, k0 k0Var) throws IOException {
        if (C(i10)) {
            t0.Y(obj, Z(i10), k0Var.P());
        } else if (this.f15549g) {
            t0.Y(obj, Z(i10), k0Var.F());
        } else {
            t0.Y(obj, Z(i10), k0Var.s());
        }
    }

    private boolean q(T t10, T t11, int i10) {
        int z02 = z0(i10);
        long Z = Z(z02);
        switch (y0(z02)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(t0.B(t10, Z)) == Double.doubleToLongBits(t0.B(t11, Z));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(t0.C(t10, Z)) == Float.floatToIntBits(t0.C(t11, Z));
            case 2:
                return k(t10, t11, i10) && t0.F(t10, Z) == t0.F(t11, Z);
            case 3:
                return k(t10, t11, i10) && t0.F(t10, Z) == t0.F(t11, Z);
            case 4:
                return k(t10, t11, i10) && t0.D(t10, Z) == t0.D(t11, Z);
            case 5:
                return k(t10, t11, i10) && t0.F(t10, Z) == t0.F(t11, Z);
            case 6:
                return k(t10, t11, i10) && t0.D(t10, Z) == t0.D(t11, Z);
            case 7:
                return k(t10, t11, i10) && t0.u(t10, Z) == t0.u(t11, Z);
            case 8:
                return k(t10, t11, i10) && o0.K(t0.H(t10, Z), t0.H(t11, Z));
            case 9:
                return k(t10, t11, i10) && o0.K(t0.H(t10, Z), t0.H(t11, Z));
            case 10:
                return k(t10, t11, i10) && o0.K(t0.H(t10, Z), t0.H(t11, Z));
            case 11:
                return k(t10, t11, i10) && t0.D(t10, Z) == t0.D(t11, Z);
            case 12:
                return k(t10, t11, i10) && t0.D(t10, Z) == t0.D(t11, Z);
            case 13:
                return k(t10, t11, i10) && t0.D(t10, Z) == t0.D(t11, Z);
            case 14:
                return k(t10, t11, i10) && t0.F(t10, Z) == t0.F(t11, Z);
            case 15:
                return k(t10, t11, i10) && t0.D(t10, Z) == t0.D(t11, Z);
            case 16:
                return k(t10, t11, i10) && t0.F(t10, Z) == t0.F(t11, Z);
            case 17:
                return k(t10, t11, i10) && o0.K(t0.H(t10, Z), t0.H(t11, Z));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return o0.K(t0.H(t10, Z), t0.H(t11, Z));
            case 50:
                return o0.K(t0.H(t10, Z), t0.H(t11, Z));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return J(t10, t11, i10) && o0.K(t0.H(t10, Z), t0.H(t11, Z));
            default:
                return true;
        }
    }

    private void q0(Object obj, int i10, k0 k0Var) throws IOException {
        if (C(i10)) {
            k0Var.r(this.f15556n.e(obj, Z(i10)));
        } else {
            k0Var.H(this.f15556n.e(obj, Z(i10)));
        }
    }

    private <UT, UB> UB r(Object obj, int i10, UB ub, r0<UT, UB> r0Var, Object obj2) {
        Internal.EnumVerifier u10;
        int Y = Y(i10);
        Object H = t0.H(obj, Z(z0(i10)));
        return (H == null || (u10 = u(i10)) == null) ? ub : (UB) s(i10, Y, this.f15559q.c(H), u10, ub, r0Var, obj2);
    }

    private static java.lang.reflect.Field r0(Class<?> cls, String str) {
        java.lang.reflect.Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private <K, V, UT, UB> UB s(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, r0<UT, UB> r0Var, Object obj) {
        MapEntryLite.b<?, ?> b10 = this.f15559q.b(v(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = r0Var.f(obj);
                }
                ByteString.g newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(b10, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.b(), b10, next.getKey(), next.getValue());
                    r0Var.d(ub, i11, newCodedBuilder.a());
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return ub;
    }

    private void s0(T t10, int i10) {
        int m02 = m0(i10);
        long j10 = 1048575 & m02;
        if (j10 == 1048575) {
            return;
        }
        t0.W(t10, j10, (1 << (m02 >>> 20)) | t0.D(t10, j10));
    }

    private static <T> float t(T t10, long j10) {
        return t0.C(t10, j10);
    }

    private void t0(T t10, int i10, int i11) {
        t0.W(t10, m0(i11) & 1048575, i10);
    }

    private Internal.EnumVerifier u(int i10) {
        return (Internal.EnumVerifier) this.f15544b[((i10 / 3) * 2) + 1];
    }

    private int u0(int i10, int i11) {
        int length = (this.f15543a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Y = Y(i13);
            if (i10 == Y) {
                return i13;
            }
            if (i10 < Y) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private Object v(int i10) {
        return this.f15544b[(i10 / 3) * 2];
    }

    private static void v0(FieldInfo fieldInfo, int[] iArr, int i10, Object[] objArr) {
        int M;
        int i11;
        fieldInfo.q();
        FieldType t10 = fieldInfo.t();
        int M2 = (int) t0.M(fieldInfo.m());
        int id = t10.id();
        if (!t10.isList() && !t10.isMap()) {
            java.lang.reflect.Field r10 = fieldInfo.r();
            M = r10 == null ? 1048575 : (int) t0.M(r10);
            i11 = Integer.numberOfTrailingZeros(fieldInfo.s());
        } else if (fieldInfo.k() == null) {
            M = 0;
            i11 = 0;
        } else {
            M = (int) t0.M(fieldInfo.k());
            i11 = 0;
        }
        iArr[i10] = fieldInfo.n();
        iArr[i10 + 1] = M2 | (id << 20) | (fieldInfo.w() ? 268435456 : 0) | (fieldInfo.u() ? 536870912 : 0);
        iArr[i10 + 2] = M | (i11 << 20);
        Class<?> p10 = fieldInfo.p();
        if (fieldInfo.o() == null) {
            if (p10 != null) {
                objArr[((i10 / 3) * 2) + 1] = p10;
                return;
            } else if (fieldInfo.l() != null) {
                objArr[((i10 / 3) * 2) + 1] = fieldInfo.l();
                return;
            } else {
                return;
            }
        }
        int i12 = (i10 / 3) * 2;
        objArr[i12] = fieldInfo.o();
        if (p10 != null) {
            objArr[i12 + 1] = p10;
        } else if (fieldInfo.l() != null) {
            objArr[i12 + 1] = fieldInfo.l();
        }
    }

    private m0 w(int i10) {
        int i11 = (i10 / 3) * 2;
        m0 m0Var = (m0) this.f15544b[i11];
        if (m0Var != null) {
            return m0Var;
        }
        m0<T> c10 = h0.a().c((Class) this.f15544b[i11 + 1]);
        this.f15544b[i11] = c10;
        return c10;
    }

    private void w0(T t10, int i10, Object obj) {
        f15542s.putObject(t10, Z(z0(i10)), obj);
        s0(t10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UnknownFieldSetLite x(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    private void x0(T t10, int i10, int i11, Object obj) {
        f15542s.putObject(t10, Z(z0(i11)), obj);
        t0(t10, i10, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int y(T t10) {
        int i10;
        int i11;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        boolean z10;
        int f10;
        int i12;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = f15542s;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.f15543a.length) {
            int z02 = z0(i15);
            int Y = Y(i15);
            int y02 = y0(z02);
            if (y02 <= 17) {
                i10 = this.f15543a[i15 + 2];
                int i18 = i10 & i13;
                i11 = 1 << (i10 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(t10, i18);
                    i14 = i18;
                }
            } else {
                i10 = (!this.f15551i || y02 < FieldType.DOUBLE_LIST_PACKED.id() || y02 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f15543a[i15 + 2] & i13;
                i11 = 0;
            }
            long Z = Z(z02);
            switch (y02) {
                case 0:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(Y, 0.0d);
                        i16 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(Y, 0.0f);
                        i16 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(Y, unsafe.getLong(t10, Z));
                        i16 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(Y, unsafe.getLong(t10, Z));
                        i16 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(Y, unsafe.getInt(t10, Z));
                        i16 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(Y, 0L);
                        i16 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i17 & i11) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(Y, 0);
                        i16 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(Y, true);
                        i16 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i17 & i11) != 0) {
                        Object object = unsafe.getObject(t10, Z);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(Y, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(Y, (String) object);
                        }
                        i16 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = o0.o(Y, unsafe.getObject(t10, Z), w(i15));
                        i16 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(Y, (ByteString) unsafe.getObject(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(Y, unsafe.getInt(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(Y, unsafe.getInt(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i17 & i11) != 0) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(Y, 0);
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(Y, 0L);
                        i16 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(Y, unsafe.getInt(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(Y, unsafe.getLong(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i17 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(Y, (MessageLite) unsafe.getObject(t10, Z), w(i15));
                        i16 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = o0.h(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += computeBoolSize;
                    break;
                case 19:
                    z10 = false;
                    f10 = o0.f(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 20:
                    z10 = false;
                    f10 = o0.m(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 21:
                    z10 = false;
                    f10 = o0.x(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 22:
                    z10 = false;
                    f10 = o0.k(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 23:
                    z10 = false;
                    f10 = o0.h(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 24:
                    z10 = false;
                    f10 = o0.f(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 25:
                    z10 = false;
                    f10 = o0.a(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 26:
                    computeBoolSize = o0.u(Y, (List) unsafe.getObject(t10, Z));
                    i16 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = o0.p(Y, (List) unsafe.getObject(t10, Z), w(i15));
                    i16 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = o0.c(Y, (List) unsafe.getObject(t10, Z));
                    i16 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = o0.v(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += computeBoolSize;
                    break;
                case 30:
                    z10 = false;
                    f10 = o0.d(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 31:
                    z10 = false;
                    f10 = o0.f(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 32:
                    z10 = false;
                    f10 = o0.h(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 33:
                    z10 = false;
                    f10 = o0.q(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 34:
                    z10 = false;
                    f10 = o0.s(Y, (List) unsafe.getObject(t10, Z), false);
                    i16 += f10;
                    break;
                case 35:
                    i12 = o0.i((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    i12 = o0.g((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    i12 = o0.n((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    i12 = o0.y((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    i12 = o0.l((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    i12 = o0.i((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    i12 = o0.g((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    i12 = o0.b((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    i12 = o0.w((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    i12 = o0.e((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    i12 = o0.g((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    i12 = o0.i((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    i12 = o0.r((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    i12 = o0.t((List) unsafe.getObject(t10, Z));
                    if (i12 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i12);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + i12;
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = o0.j(Y, (List) unsafe.getObject(t10, Z), w(i15));
                    i16 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.f15559q.g(Y, unsafe.getObject(t10, Z), v(i15));
                    i16 += computeBoolSize;
                    break;
                case 51:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(Y, 0.0d);
                        i16 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(Y, 0.0f);
                        i16 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(Y, e0(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(Y, e0(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(Y, d0(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(Y, 0L);
                        i16 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (K(t10, Y, i15)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(Y, 0);
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 58:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(Y, true);
                        i16 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (K(t10, Y, i15)) {
                        Object object2 = unsafe.getObject(t10, Z);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(Y, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(Y, (String) object2);
                        }
                        i16 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = o0.o(Y, unsafe.getObject(t10, Z), w(i15));
                        i16 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(Y, (ByteString) unsafe.getObject(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(Y, d0(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(Y, d0(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (K(t10, Y, i15)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(Y, 0);
                        i16 += computeSFixed32Size;
                    }
                    break;
                case 65:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(Y, 0L);
                        i16 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(Y, d0(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(Y, e0(t10, Z));
                        i16 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (K(t10, Y, i15)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(Y, (MessageLite) unsafe.getObject(t10, Z), w(i15));
                        i16 += computeBoolSize;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        int A = i16 + A(this.f15557o, t10);
        return this.f15548f ? A + this.f15558p.c(t10).o() : A;
    }

    private static int y0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int z(T t10) {
        int computeDoubleSize;
        int i10;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = f15542s;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f15543a.length; i12 += 3) {
            int z02 = z0(i12);
            int y02 = y0(z02);
            int Y = Y(i12);
            long Z = Z(z02);
            int i13 = (y02 < FieldType.DOUBLE_LIST_PACKED.id() || y02 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f15543a[i12 + 2] & 1048575;
            switch (y02) {
                case 0:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(Y, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(Y, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(Y, t0.F(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(Y, t0.F(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(Y, t0.D(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(Y, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(Y, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(Y, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (D(t10, i12)) {
                        Object H = t0.H(t10, Z);
                        if (H instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(Y, (ByteString) H);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(Y, (String) H);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (D(t10, i12)) {
                        computeDoubleSize = o0.o(Y, t0.H(t10, Z), w(i12));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(Y, (ByteString) t0.H(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(Y, t0.D(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(Y, t0.D(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(Y, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(Y, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(Y, t0.D(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(Y, t0.F(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (D(t10, i12)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(Y, (MessageLite) t0.H(t10, Z), w(i12));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    computeDoubleSize = o0.h(Y, M(t10, Z), false);
                    break;
                case 19:
                    computeDoubleSize = o0.f(Y, M(t10, Z), false);
                    break;
                case 20:
                    computeDoubleSize = o0.m(Y, M(t10, Z), false);
                    break;
                case 21:
                    computeDoubleSize = o0.x(Y, M(t10, Z), false);
                    break;
                case 22:
                    computeDoubleSize = o0.k(Y, M(t10, Z), false);
                    break;
                case 23:
                    computeDoubleSize = o0.h(Y, M(t10, Z), false);
                    break;
                case 24:
                    computeDoubleSize = o0.f(Y, M(t10, Z), false);
                    break;
                case 25:
                    computeDoubleSize = o0.a(Y, M(t10, Z), false);
                    break;
                case 26:
                    computeDoubleSize = o0.u(Y, M(t10, Z));
                    break;
                case 27:
                    computeDoubleSize = o0.p(Y, M(t10, Z), w(i12));
                    break;
                case 28:
                    computeDoubleSize = o0.c(Y, M(t10, Z));
                    break;
                case 29:
                    computeDoubleSize = o0.v(Y, M(t10, Z), false);
                    break;
                case 30:
                    computeDoubleSize = o0.d(Y, M(t10, Z), false);
                    break;
                case 31:
                    computeDoubleSize = o0.f(Y, M(t10, Z), false);
                    break;
                case 32:
                    computeDoubleSize = o0.h(Y, M(t10, Z), false);
                    break;
                case 33:
                    computeDoubleSize = o0.q(Y, M(t10, Z), false);
                    break;
                case 34:
                    computeDoubleSize = o0.s(Y, M(t10, Z), false);
                    break;
                case 35:
                    i10 = o0.i((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i10 = o0.g((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i10 = o0.n((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i10 = o0.y((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i10 = o0.l((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i10 = o0.i((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i10 = o0.g((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i10 = o0.b((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i10 = o0.w((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i10 = o0.e((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i10 = o0.g((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i10 = o0.i((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i10 = o0.r((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i10 = o0.t((List) unsafe.getObject(t10, Z));
                    if (i10 > 0) {
                        if (this.f15551i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(Y);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i10);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + i10;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    computeDoubleSize = o0.j(Y, M(t10, Z), w(i12));
                    break;
                case 50:
                    computeDoubleSize = this.f15559q.g(Y, t0.H(t10, Z), v(i12));
                    break;
                case 51:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(Y, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(Y, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(Y, e0(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(Y, e0(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(Y, d0(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(Y, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(Y, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(Y, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (K(t10, Y, i12)) {
                        Object H2 = t0.H(t10, Z);
                        if (H2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(Y, (ByteString) H2);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(Y, (String) H2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = o0.o(Y, t0.H(t10, Z), w(i12));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(Y, (ByteString) t0.H(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(Y, d0(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(Y, d0(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(Y, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(Y, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(Y, d0(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(Y, e0(t10, Z));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (K(t10, Y, i12)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(Y, (MessageLite) t0.H(t10, Z), w(i12));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i11 += computeDoubleSize;
        }
        return i11 + A(this.f15557o, t10);
    }

    private int z0(int i10) {
        return this.f15543a[i10 + 1];
    }

    @Override // com.google.protobuf.m0
    public void a(T t10, T t11) {
        m(t10);
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f15543a.length; i10 += 3) {
            S(t10, t11, i10);
        }
        o0.G(this.f15557o, t10, t11);
        if (this.f15548f) {
            o0.E(this.f15558p, t10, t11);
        }
    }

    @Override // com.google.protobuf.m0
    public void b(T t10, Writer writer) throws IOException {
        if (writer.y() == Writer.FieldOrder.DESCENDING) {
            C0(t10, writer);
        } else if (this.f15550h) {
            B0(t10, writer);
        } else {
            A0(t10, writer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.m0
    public void c(T t10) {
        if (I(t10)) {
            if (t10 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.f15543a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int z02 = z0(i10);
                long Z = Z(z02);
                int y02 = y0(z02);
                if (y02 != 9) {
                    switch (y02) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f15556n.c(t10, Z);
                            continue;
                        case 50:
                            Unsafe unsafe = f15542s;
                            Object object = unsafe.getObject(t10, Z);
                            if (object != null) {
                                unsafe.putObject(t10, Z, this.f15559q.f(object));
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (D(t10, i10)) {
                    w(i10).c(f15542s.getObject(t10, Z));
                }
            }
            this.f15557o.j(t10);
            if (this.f15548f) {
                this.f15558p.f(t10);
            }
        }
    }

    @Override // com.google.protobuf.m0
    public final boolean d(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f15553k) {
            int i15 = this.f15552j[i14];
            int Y = Y(i15);
            int z02 = z0(i15);
            int i16 = this.f15543a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f15542s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (L(z02) && !E(t10, i15, i10, i11, i18)) {
                return false;
            }
            int y02 = y0(z02);
            if (y02 != 9 && y02 != 17) {
                if (y02 != 27) {
                    if (y02 == 60 || y02 == 68) {
                        if (K(t10, Y, i15) && !F(t10, z02, w(i15))) {
                            return false;
                        }
                    } else if (y02 != 49) {
                        if (y02 == 50 && !H(t10, z02, i15)) {
                            return false;
                        }
                    }
                }
                if (!G(t10, z02, i15)) {
                    return false;
                }
            } else if (E(t10, i15, i10, i11, i18) && !F(t10, z02, w(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f15548f || this.f15558p.c(t10).t();
    }

    @Override // com.google.protobuf.m0
    public int e(T t10) {
        return this.f15550h ? z(t10) : y(t10);
    }

    @Override // com.google.protobuf.m0
    public T f() {
        return (T) this.f15555m.a(this.f15547e);
    }

    @Override // com.google.protobuf.m0
    public int g(T t10) {
        int i10;
        int hashLong;
        int length = this.f15543a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int z02 = z0(i12);
            int Y = Y(i12);
            long Z = Z(z02);
            int i13 = 37;
            switch (y0(z02)) {
                case 0:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(t0.B(t10, Z)));
                    i11 = i10 + hashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    hashLong = Float.floatToIntBits(t0.C(t10, Z));
                    i11 = i10 + hashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(t0.F(t10, Z));
                    i11 = i10 + hashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(t0.F(t10, Z));
                    i11 = i10 + hashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    hashLong = t0.D(t10, Z);
                    i11 = i10 + hashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(t0.F(t10, Z));
                    i11 = i10 + hashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    hashLong = t0.D(t10, Z);
                    i11 = i10 + hashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    hashLong = Internal.hashBoolean(t0.u(t10, Z));
                    i11 = i10 + hashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    hashLong = ((String) t0.H(t10, Z)).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 9:
                    Object H = t0.H(t10, Z);
                    if (H != null) {
                        i13 = H.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    hashLong = t0.H(t10, Z).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    hashLong = t0.D(t10, Z);
                    i11 = i10 + hashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    hashLong = t0.D(t10, Z);
                    i11 = i10 + hashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    hashLong = t0.D(t10, Z);
                    i11 = i10 + hashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(t0.F(t10, Z));
                    i11 = i10 + hashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    hashLong = t0.D(t10, Z);
                    i11 = i10 + hashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(t0.F(t10, Z));
                    i11 = i10 + hashLong;
                    break;
                case 17:
                    Object H2 = t0.H(t10, Z);
                    if (H2 != null) {
                        i13 = H2.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    hashLong = t0.H(t10, Z).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    hashLong = t0.H(t10, Z).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 51:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(b0(t10, Z)));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Float.floatToIntBits(c0(t10, Z));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(e0(t10, Z));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(e0(t10, Z));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = d0(t10, Z);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(e0(t10, Z));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = d0(t10, Z);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashBoolean(a0(t10, Z));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = ((String) t0.H(t10, Z)).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = t0.H(t10, Z).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = t0.H(t10, Z).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = d0(t10, Z);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = d0(t10, Z);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = d0(t10, Z);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(e0(t10, Z));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = d0(t10, Z);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(e0(t10, Z));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (K(t10, Y, i12)) {
                        i10 = i11 * 53;
                        hashLong = t0.H(t10, Z).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f15557o.g(t10).hashCode();
        return this.f15548f ? (hashCode * 53) + this.f15558p.c(t10).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.m0
    public void h(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Objects.requireNonNull(extensionRegistryLite);
        m(t10);
        O(this.f15557o, this.f15558p, t10, k0Var, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h0(T t10, byte[] bArr, int i10, int i11, int i12, c.b bVar) throws IOException {
        Unsafe unsafe;
        int i13;
        z<T> zVar;
        int i14;
        int i15;
        int i16;
        int i17;
        T t11;
        byte b10;
        int k02;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr2;
        int L;
        int i28;
        int i29;
        z<T> zVar2 = this;
        T t12 = t10;
        byte[] bArr3 = bArr;
        int i30 = i11;
        int i31 = i12;
        c.b bVar2 = bVar;
        m(t10);
        Unsafe unsafe2 = f15542s;
        int i32 = i10;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                byte b11 = bArr3[i32];
                if (b11 < 0) {
                    int H = c.H(b11, bArr3, i38, bVar2);
                    b10 = bVar2.f15404a;
                    i38 = H;
                } else {
                    b10 = b11;
                }
                int i39 = b10 >>> 3;
                int i40 = b10 & 7;
                if (i39 > i36) {
                    k02 = zVar2.l0(i39, i33 / 3);
                } else {
                    k02 = zVar2.k0(i39);
                }
                int i41 = k02;
                if (i41 == -1) {
                    i18 = i39;
                    i19 = i38;
                    i15 = b10;
                    i20 = i35;
                    i21 = i37;
                    unsafe = unsafe2;
                    i13 = i31;
                    i22 = 0;
                } else {
                    int i42 = zVar2.f15543a[i41 + 1];
                    int y02 = y0(i42);
                    long Z = Z(i42);
                    int i43 = b10;
                    if (y02 <= 17) {
                        int i44 = zVar2.f15543a[i41 + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i37) {
                            if (i37 != 1048575) {
                                unsafe2.putInt(t12, i37, i35);
                            }
                            i24 = i46;
                            i23 = unsafe2.getInt(t12, i46);
                        } else {
                            i23 = i35;
                            i24 = i37;
                        }
                        switch (y02) {
                            case 0:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 1) {
                                    t0.U(t12, Z, c.d(bArr2, i38));
                                    i32 = i38 + 8;
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 5) {
                                    t0.V(t12, Z, c.l(bArr2, i38));
                                    i32 = i38 + 4;
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 0) {
                                    L = c.L(bArr2, i38, bVar2);
                                    unsafe2.putLong(t10, Z, bVar2.f15405b);
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i32 = L;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 0) {
                                    i32 = c.I(bArr2, i38, bVar2);
                                    unsafe2.putInt(t12, Z, bVar2.f15404a);
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 1) {
                                    unsafe2.putLong(t10, Z, c.j(bArr2, i38));
                                    i32 = i38 + 8;
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 5) {
                                    unsafe2.putInt(t12, Z, c.h(bArr2, i38));
                                    i32 = i38 + 4;
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 0) {
                                    i32 = c.L(bArr2, i38, bVar2);
                                    t0.N(t12, Z, bVar2.f15405b != 0);
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 2) {
                                    if ((536870912 & i42) == 0) {
                                        i32 = c.C(bArr2, i38, bVar2);
                                    } else {
                                        i32 = c.F(bArr2, i38, bVar2);
                                    }
                                    unsafe2.putObject(t12, Z, bVar2.f15406c);
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 2) {
                                    Object T = zVar2.T(t12, i25);
                                    i32 = c.O(T, zVar2.w(i25), bArr, i38, i11, bVar);
                                    zVar2.w0(t12, i25, T);
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 2) {
                                    i32 = c.b(bArr2, i38, bVar2);
                                    unsafe2.putObject(t12, Z, bVar2.f15406c);
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 0) {
                                    i32 = c.I(bArr2, i38, bVar2);
                                    int i47 = bVar2.f15404a;
                                    Internal.EnumVerifier u10 = zVar2.u(i25);
                                    if (u10 != null && !u10.isInRange(i47)) {
                                        x(t10).storeField(i27, Long.valueOf(i47));
                                        i33 = i25;
                                        i35 = i23;
                                        i34 = i27;
                                        i36 = i18;
                                        i31 = i12;
                                        bArr3 = bArr2;
                                        i37 = i26;
                                    } else {
                                        unsafe2.putInt(t12, Z, i47);
                                        i35 = i23 | i45;
                                        i31 = i12;
                                        i33 = i25;
                                        i34 = i27;
                                        i36 = i18;
                                        bArr3 = bArr2;
                                        i37 = i26;
                                        break;
                                    }
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                if (i40 == 0) {
                                    i32 = c.I(bArr2, i38, bVar2);
                                    unsafe2.putInt(t12, Z, CodedInputStream.decodeZigZag32(bVar2.f15404a));
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 16:
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                bArr2 = bArr;
                                if (i40 == 0) {
                                    L = c.L(bArr2, i38, bVar2);
                                    unsafe2.putLong(t10, Z, CodedInputStream.decodeZigZag64(bVar2.f15405b));
                                    i35 = i23 | i45;
                                    i31 = i12;
                                    i32 = L;
                                    i33 = i25;
                                    i34 = i27;
                                    i36 = i18;
                                    bArr3 = bArr2;
                                    i37 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 17:
                                if (i40 == 3) {
                                    Object T2 = zVar2.T(t12, i41);
                                    i32 = c.N(T2, zVar2.w(i41), bArr, i38, i11, (i39 << 3) | 4, bVar);
                                    zVar2.w0(t12, i41, T2);
                                    i35 = i23 | i45;
                                    i37 = i24;
                                    i31 = i12;
                                    i33 = i41;
                                    i34 = i43;
                                    i36 = i39;
                                    bArr3 = bArr;
                                    break;
                                } else {
                                    i18 = i39;
                                    i25 = i41;
                                    i26 = i24;
                                    i27 = i43;
                                    i21 = i26;
                                    i19 = i38;
                                    i22 = i25;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            default:
                                i18 = i39;
                                i25 = i41;
                                i26 = i24;
                                i27 = i43;
                                i21 = i26;
                                i19 = i38;
                                i22 = i25;
                                unsafe = unsafe2;
                                i20 = i23;
                                i15 = i27;
                                i13 = i12;
                                break;
                        }
                    } else {
                        i18 = i39;
                        i21 = i37;
                        i20 = i35;
                        if (y02 == 27) {
                            if (i40 == 2) {
                                Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe2.getObject(t12, Z);
                                if (!protobufList.isModifiable()) {
                                    int size = protobufList.size();
                                    protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                    unsafe2.putObject(t12, Z, protobufList);
                                }
                                i32 = c.q(zVar2.w(i41), i43, bArr, i38, i11, protobufList, bVar);
                                i33 = i41;
                                i34 = i43;
                                i37 = i21;
                                i35 = i20;
                                i36 = i18;
                                bArr3 = bArr;
                                i31 = i12;
                            } else {
                                i28 = i38;
                                unsafe = unsafe2;
                                i22 = i41;
                                i29 = i43;
                                i13 = i12;
                                i19 = i28;
                            }
                        } else if (y02 <= 49) {
                            int i48 = i38;
                            unsafe = unsafe2;
                            i22 = i41;
                            i29 = i43;
                            i32 = j0(t10, bArr, i38, i11, i43, i18, i40, i41, i42, y02, Z, bVar);
                            if (i32 != i48) {
                                zVar2 = this;
                                t12 = t10;
                                bArr3 = bArr;
                                i30 = i11;
                                i31 = i12;
                                bVar2 = bVar;
                                i37 = i21;
                                i35 = i20;
                                i33 = i22;
                                i34 = i29;
                                i36 = i18;
                                unsafe2 = unsafe;
                            } else {
                                i13 = i12;
                                i19 = i32;
                            }
                        } else {
                            i28 = i38;
                            unsafe = unsafe2;
                            i22 = i41;
                            i29 = i43;
                            if (y02 != 50) {
                                i32 = g0(t10, bArr, i28, i11, i29, i18, i40, i42, y02, Z, i22, bVar);
                                if (i32 != i28) {
                                    zVar2 = this;
                                    t12 = t10;
                                    bArr3 = bArr;
                                    i30 = i11;
                                    i31 = i12;
                                    bVar2 = bVar;
                                    i37 = i21;
                                    i35 = i20;
                                    i33 = i22;
                                    i34 = i29;
                                    i36 = i18;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i19 = i32;
                                }
                            } else if (i40 == 2) {
                                i32 = f0(t10, bArr, i28, i11, i22, Z, bVar);
                                if (i32 != i28) {
                                    zVar2 = this;
                                    t12 = t10;
                                    bArr3 = bArr;
                                    i30 = i11;
                                    i31 = i12;
                                    bVar2 = bVar;
                                    i37 = i21;
                                    i35 = i20;
                                    i33 = i22;
                                    i34 = i29;
                                    i36 = i18;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i19 = i32;
                                }
                            } else {
                                i13 = i12;
                                i19 = i28;
                            }
                        }
                        i15 = i29;
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    if (this.f15548f && bVar.f15407d != ExtensionRegistryLite.getEmptyRegistry()) {
                        i32 = c.g(i15, bArr, i19, i11, t10, this.f15547e, this.f15557o, bVar);
                    } else {
                        i32 = c.G(i15, bArr, i19, i11, x(t10), bVar);
                    }
                    t12 = t10;
                    bArr3 = bArr;
                    i30 = i11;
                    i34 = i15;
                    zVar2 = this;
                    bVar2 = bVar;
                    i37 = i21;
                    i35 = i20;
                    i33 = i22;
                    i36 = i18;
                    unsafe2 = unsafe;
                    i31 = i13;
                } else {
                    i17 = 1048575;
                    zVar = this;
                    i14 = i19;
                    i16 = i21;
                    i35 = i20;
                }
            } else {
                int i49 = i37;
                unsafe = unsafe2;
                i13 = i31;
                zVar = zVar2;
                i14 = i32;
                i15 = i34;
                i16 = i49;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            t11 = t10;
            unsafe.putInt(t11, i16, i35);
        } else {
            t11 = t10;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i50 = zVar.f15553k; i50 < zVar.f15554l; i50++) {
            unknownFieldSetLite = (UnknownFieldSetLite) r(t10, zVar.f15552j[i50], unknownFieldSetLite, zVar.f15557o, t10);
        }
        if (unknownFieldSetLite != null) {
            zVar.f15557o.o(t11, unknownFieldSetLite);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i14;
    }

    @Override // com.google.protobuf.m0
    public void i(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        if (this.f15550h) {
            i0(t10, bArr, i10, i11, bVar);
        } else {
            h0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    @Override // com.google.protobuf.m0
    public boolean j(T t10, T t11) {
        int length = this.f15543a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!q(t10, t11, i10)) {
                return false;
            }
        }
        if (this.f15557o.g(t10).equals(this.f15557o.g(t11))) {
            if (this.f15548f) {
                return this.f15558p.c(t10).equals(this.f15558p.c(t11));
            }
            return true;
        }
        return false;
    }
}
