package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnsafeUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f15513a = I();

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f15514b = com.google.protobuf.b.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f15515c = r(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f15516d = r(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f15517e = G();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f15518f = a0();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f15519g = Z();

    /* renamed from: h  reason: collision with root package name */
    static final long f15520h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f15521i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f15522j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f15523k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f15524l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f15525m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f15526n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f15527o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f15528p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f15529q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f15530r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f15531s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f15532t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f15533u;

    /* renamed from: v  reason: collision with root package name */
    private static final int f15534v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f15535w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnsafeUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() throws Exception {
            java.lang.reflect.Field[] declaredFields;
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.t0.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public boolean e(Object obj, long j10) {
            return t0.f15535w ? t0.v(obj, j10) : t0.w(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public byte g(Object obj, long j10) {
            return t0.f15535w ? t0.z(obj, j10) : t0.A(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }

        @Override // com.google.protobuf.t0.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.protobuf.t0.e
        public long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public void o(Object obj, long j10, boolean z10) {
            if (t0.f15535w) {
                t0.O(obj, j10, z10);
            } else {
                t0.P(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.t0.e
        public void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public void q(Object obj, long j10, byte b10) {
            if (t0.f15535w) {
                t0.S(obj, j10, b10);
            } else {
                t0.T(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.t0.e
        public void r(Object obj, long j10, double d10) {
            u(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.t0.e
        public void s(Object obj, long j10, float f10) {
            t(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.t0.e
        public boolean x() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.t0.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public boolean e(Object obj, long j10) {
            return t0.f15535w ? t0.v(obj, j10) : t0.w(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public byte g(Object obj, long j10) {
            return t0.f15535w ? t0.z(obj, j10) : t0.A(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }

        @Override // com.google.protobuf.t0.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.protobuf.t0.e
        public long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public void o(Object obj, long j10, boolean z10) {
            if (t0.f15535w) {
                t0.O(obj, j10, z10);
            } else {
                t0.P(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.t0.e
        public void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.t0.e
        public void q(Object obj, long j10, byte b10) {
            if (t0.f15535w) {
                t0.S(obj, j10, b10);
            } else {
                t0.T(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.t0.e
        public void r(Object obj, long j10, double d10) {
            u(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.t0.e
        public void s(Object obj, long j10, float f10) {
            t(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.t0.e
        public boolean x() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.t0.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f15536a.copyMemory((Object) null, j10, bArr, t0.f15520h + j11, j12);
        }

        @Override // com.google.protobuf.t0.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            this.f15536a.copyMemory(bArr, t0.f15520h + j10, (Object) null, j11, j12);
        }

        @Override // com.google.protobuf.t0.e
        public boolean e(Object obj, long j10) {
            return this.f15536a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public byte f(long j10) {
            return this.f15536a.getByte(j10);
        }

        @Override // com.google.protobuf.t0.e
        public byte g(Object obj, long j10) {
            return this.f15536a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public double h(Object obj, long j10) {
            return this.f15536a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public float i(Object obj, long j10) {
            return this.f15536a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.t0.e
        public long k(long j10) {
            return this.f15536a.getLong(j10);
        }

        @Override // com.google.protobuf.t0.e
        public void o(Object obj, long j10, boolean z10) {
            this.f15536a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.t0.e
        public void p(long j10, byte b10) {
            this.f15536a.putByte(j10, b10);
        }

        @Override // com.google.protobuf.t0.e
        public void q(Object obj, long j10, byte b10) {
            this.f15536a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.t0.e
        public void r(Object obj, long j10, double d10) {
            this.f15536a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.t0.e
        public void s(Object obj, long j10, float f10) {
            this.f15536a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.t0.e
        public boolean w() {
            if (super.w()) {
                try {
                    Class<?> cls = this.f15536a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    t0.L(th);
                    return false;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.t0.e
        public boolean x() {
            if (super.x()) {
                try {
                    Class<?> cls = this.f15536a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", cls2);
                    cls.getMethod("putByte", cls2, Byte.TYPE);
                    cls.getMethod("getInt", cls2);
                    cls.getMethod("putInt", cls2, Integer.TYPE);
                    cls.getMethod("getLong", cls2);
                    cls.getMethod("putLong", cls2, cls2);
                    cls.getMethod("copyMemory", cls2, cls2, cls2);
                    cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    return true;
                } catch (Throwable th) {
                    t0.L(th);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f15536a;

        e(Unsafe unsafe) {
            this.f15536a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f15536a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f15536a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract void d(byte[] bArr, long j10, long j11, long j12);

        public abstract boolean e(Object obj, long j10);

        public abstract byte f(long j10);

        public abstract byte g(Object obj, long j10);

        public abstract double h(Object obj, long j10);

        public abstract float i(Object obj, long j10);

        public final int j(Object obj, long j10) {
            return this.f15536a.getInt(obj, j10);
        }

        public abstract long k(long j10);

        public final long l(Object obj, long j10) {
            return this.f15536a.getLong(obj, j10);
        }

        public final Object m(Object obj, long j10) {
            return this.f15536a.getObject(obj, j10);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f15536a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j10, boolean z10);

        public abstract void p(long j10, byte b10);

        public abstract void q(Object obj, long j10, byte b10);

        public abstract void r(Object obj, long j10, double d10);

        public abstract void s(Object obj, long j10, float f10);

        public final void t(Object obj, long j10, int i10) {
            this.f15536a.putInt(obj, j10, i10);
        }

        public final void u(Object obj, long j10, long j11) {
            this.f15536a.putLong(obj, j10, j11);
        }

        public final void v(Object obj, long j10, Object obj2) {
            this.f15536a.putObject(obj, j10, obj2);
        }

        public boolean w() {
            Unsafe unsafe = this.f15536a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                t0.L(th);
                return false;
            }
        }

        public boolean x() {
            Unsafe unsafe = this.f15536a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return t0.b() != null;
            } catch (Throwable th) {
                t0.L(th);
                return false;
            }
        }
    }

    static {
        long m7 = m(byte[].class);
        f15520h = m7;
        f15521i = m(boolean[].class);
        f15522j = n(boolean[].class);
        f15523k = m(int[].class);
        f15524l = n(int[].class);
        f15525m = m(long[].class);
        f15526n = n(long[].class);
        f15527o = m(float[].class);
        f15528p = n(float[].class);
        f15529q = m(double[].class);
        f15530r = n(double[].class);
        f15531s = m(Object[].class);
        f15532t = n(Object[].class);
        f15533u = t(o());
        f15534v = (int) (7 & m7);
        f15535w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private t0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte A(Object obj, long j10) {
        return (byte) ((D(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double B(Object obj, long j10) {
        return f15517e.h(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float C(Object obj, long j10) {
        return f15517e.i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(Object obj, long j10) {
        return f15517e.j(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long E(long j10) {
        return f15517e.k(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long F(Object obj, long j10) {
        return f15517e.l(obj, j10);
    }

    private static e G() {
        Unsafe unsafe = f15513a;
        if (unsafe == null) {
            return null;
        }
        if (com.google.protobuf.b.c()) {
            if (f15515c) {
                return new c(unsafe);
            }
            if (f15516d) {
                return new b(unsafe);
            }
            return null;
        }
        return new d(unsafe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object H(Object obj, long j10) {
        return f15517e.m(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean J() {
        return f15519g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K() {
        return f15518f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Throwable th) {
        Logger logger = Logger.getLogger(t0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long M(java.lang.reflect.Field field) {
        return f15517e.n(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(Object obj, long j10, boolean z10) {
        f15517e.o(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(Object obj, long j10, boolean z10) {
        S(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j10, boolean z10) {
        T(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Q(long j10, byte b10) {
        f15517e.p(j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R(byte[] bArr, long j10, byte b10) {
        f15517e.q(bArr, f15520h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int D = D(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        W(obj, j11, ((255 & b10) << i10) | (D & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        W(obj, j11, ((255 & b10) << i10) | (D(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void U(Object obj, long j10, double d10) {
        f15517e.r(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void V(Object obj, long j10, float f10) {
        f15517e.s(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void W(Object obj, long j10, int i10) {
        f15517e.t(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void X(Object obj, long j10, long j11) {
        f15517e.u(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Y(Object obj, long j10, Object obj2) {
        f15517e.v(obj, j10, obj2);
    }

    private static boolean Z() {
        e eVar = f15517e;
        if (eVar == null) {
            return false;
        }
        return eVar.w();
    }

    private static boolean a0() {
        e eVar = f15517e;
        if (eVar == null) {
            return false;
        }
        return eVar.x();
    }

    static /* synthetic */ java.lang.reflect.Field b() {
        return o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long k(ByteBuffer byteBuffer) {
        return f15517e.l(byteBuffer, f15533u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T l(Class<T> cls) {
        try {
            return (T) f15513a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static int m(Class<?> cls) {
        if (f15519g) {
            return f15517e.a(cls);
        }
        return -1;
    }

    private static int n(Class<?> cls) {
        if (f15519g) {
            return f15517e.b(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field o() {
        java.lang.reflect.Field s10;
        if (!com.google.protobuf.b.c() || (s10 = s(Buffer.class, "effectiveDirectAddress")) == null) {
            java.lang.reflect.Field s11 = s(Buffer.class, "address");
            if (s11 == null || s11.getType() != Long.TYPE) {
                return null;
            }
            return s11;
        }
        return s10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(long j10, byte[] bArr, long j11, long j12) {
        f15517e.c(j10, bArr, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(byte[] bArr, long j10, long j11, long j12) {
        f15517e.d(bArr, j10, j11, j12);
    }

    static boolean r(Class<?> cls) {
        if (com.google.protobuf.b.c()) {
            try {
                Class<?> cls2 = f15514b;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static java.lang.reflect.Field s(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long t(java.lang.reflect.Field field) {
        e eVar;
        if (field == null || (eVar = f15517e) == null) {
            return -1L;
        }
        return eVar.n(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(Object obj, long j10) {
        return f15517e.e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j10) {
        return z(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Object obj, long j10) {
        return A(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte x(long j10) {
        return f15517e.f(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte y(byte[] bArr, long j10) {
        return f15517e.g(bArr, f15520h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j10) {
        return (byte) ((D(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }
}
