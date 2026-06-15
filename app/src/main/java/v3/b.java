package v3;

import a5.c0;
import a5.p0;
import a5.t;
import a5.x;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n3.h2;
import n3.m1;
import s3.n;
import v3.a;
import y5.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AtomParsers.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f31753a = p0.m0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f31754a;

        /* renamed from: b  reason: collision with root package name */
        public int f31755b;

        /* renamed from: c  reason: collision with root package name */
        public int f31756c;

        /* renamed from: d  reason: collision with root package name */
        public long f31757d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f31758e;

        /* renamed from: f  reason: collision with root package name */
        private final c0 f31759f;

        /* renamed from: g  reason: collision with root package name */
        private final c0 f31760g;

        /* renamed from: h  reason: collision with root package name */
        private int f31761h;

        /* renamed from: i  reason: collision with root package name */
        private int f31762i;

        public a(c0 c0Var, c0 c0Var2, boolean z10) throws h2 {
            this.f31760g = c0Var;
            this.f31759f = c0Var2;
            this.f31758e = z10;
            c0Var2.K(12);
            this.f31754a = c0Var2.D();
            c0Var.K(12);
            this.f31762i = c0Var.D();
            s3.l.a(c0Var.n() == 1, "first_chunk must be 1");
            this.f31755b = -1;
        }

        public boolean a() {
            long B;
            int i10 = this.f31755b + 1;
            this.f31755b = i10;
            if (i10 == this.f31754a) {
                return false;
            }
            if (this.f31758e) {
                B = this.f31759f.E();
            } else {
                B = this.f31759f.B();
            }
            this.f31757d = B;
            if (this.f31755b == this.f31761h) {
                this.f31756c = this.f31760g.D();
                this.f31760g.L(4);
                int i11 = this.f31762i - 1;
                this.f31762i = i11;
                this.f31761h = i11 > 0 ? this.f31760g.D() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* renamed from: v3.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0368b {

        /* renamed from: a  reason: collision with root package name */
        private final String f31763a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f31764b;

        /* renamed from: c  reason: collision with root package name */
        private final long f31765c;

        /* renamed from: d  reason: collision with root package name */
        private final long f31766d;

        public C0368b(String str, byte[] bArr, long j10, long j11) {
            this.f31763a = str;
            this.f31764b = bArr;
            this.f31765c = j10;
            this.f31766d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final j[] f31767a;

        /* renamed from: b  reason: collision with root package name */
        public m1 f31768b;

        /* renamed from: c  reason: collision with root package name */
        public int f31769c;

        /* renamed from: d  reason: collision with root package name */
        public int f31770d = 0;

        public d(int i10) {
            this.f31767a = new j[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AtomParsers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f31771a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31772b;

        /* renamed from: c  reason: collision with root package name */
        private final c0 f31773c;

        public e(a.b bVar, m1 m1Var) {
            c0 c0Var = bVar.f31752b;
            this.f31773c = c0Var;
            c0Var.K(12);
            int D = c0Var.D();
            if ("audio/raw".equals(m1Var.f28185l)) {
                int c02 = p0.c0(m1Var.A, m1Var.f28198y);
                if (D == 0 || D % c02 != 0) {
                    t.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + c02 + ", stsz sample size: " + D);
                    D = c02;
                }
            }
            this.f31771a = D == 0 ? -1 : D;
            this.f31772b = c0Var.D();
        }

        @Override // v3.b.c
        public int a() {
            int i10 = this.f31771a;
            return i10 == -1 ? this.f31773c.D() : i10;
        }

        @Override // v3.b.c
        public int b() {
            return this.f31771a;
        }

        @Override // v3.b.c
        public int c() {
            return this.f31772b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AtomParsers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final c0 f31774a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31775b;

        /* renamed from: c  reason: collision with root package name */
        private final int f31776c;

        /* renamed from: d  reason: collision with root package name */
        private int f31777d;

        /* renamed from: e  reason: collision with root package name */
        private int f31778e;

        public f(a.b bVar) {
            c0 c0Var = bVar.f31752b;
            this.f31774a = c0Var;
            c0Var.K(12);
            this.f31776c = c0Var.D() & 255;
            this.f31775b = c0Var.D();
        }

        @Override // v3.b.c
        public int a() {
            int i10 = this.f31776c;
            if (i10 == 8) {
                return this.f31774a.z();
            }
            if (i10 == 16) {
                return this.f31774a.F();
            }
            int i11 = this.f31777d;
            this.f31777d = i11 + 1;
            if (i11 % 2 == 0) {
                int z10 = this.f31774a.z();
                this.f31778e = z10;
                return (z10 & 240) >> 4;
            }
            return this.f31778e & 15;
        }

        @Override // v3.b.c
        public int b() {
            return -1;
        }

        @Override // v3.b.c
        public int c() {
            return this.f31775b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final int f31779a;

        /* renamed from: b  reason: collision with root package name */
        private final long f31780b;

        /* renamed from: c  reason: collision with root package name */
        private final int f31781c;

        public g(int i10, long j10, int i11) {
            this.f31779a = i10;
            this.f31780b = j10;
            this.f31781c = i11;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[p0.q(4, 0, length)] && jArr[p0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(c0 c0Var, int i10, int i11, int i12) throws h2 {
        int e8 = c0Var.e();
        s3.l.a(e8 >= i11, null);
        while (e8 - i11 < i12) {
            c0Var.K(e8);
            int n10 = c0Var.n();
            s3.l.a(n10 > 0, "childAtomSize must be positive");
            if (c0Var.n() == i10) {
                return e8;
            }
            e8 += n10;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(a5.c0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, com.google.android.exoplayer2.drm.DrmInitData r29, v3.b.d r30, int r31) throws n3.h2 {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.b.e(a5.c0, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, v3.b$d, int):void");
    }

    static Pair<Integer, j> f(c0 c0Var, int i10, int i11) throws h2 {
        int i12 = i10 + 8;
        int i13 = -1;
        String str = null;
        Integer num = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            c0Var.K(i12);
            int n10 = c0Var.n();
            int n11 = c0Var.n();
            if (n11 == 1718775137) {
                num = Integer.valueOf(c0Var.n());
            } else if (n11 == 1935894637) {
                c0Var.L(4);
                str = c0Var.w(4);
            } else if (n11 == 1935894633) {
                i13 = i12;
                i14 = n10;
            }
            i12 += n10;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            s3.l.a(num != null, "frma atom is mandatory");
            s3.l.a(i13 != -1, "schi atom is mandatory");
            j q10 = q(c0Var, i13, i14, str);
            s3.l.a(q10 != null, "tenc atom is mandatory");
            return Pair.create(num, (j) p0.j(q10));
        }
        return null;
    }

    private static Pair<long[], long[]> g(a.C0367a c0367a) {
        a.b g10 = c0367a.g(1701606260);
        if (g10 == null) {
            return null;
        }
        c0 c0Var = g10.f31752b;
        c0Var.K(8);
        int c10 = v3.a.c(c0Var.n());
        int D = c0Var.D();
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        for (int i10 = 0; i10 < D; i10++) {
            jArr[i10] = c10 == 1 ? c0Var.E() : c0Var.B();
            jArr2[i10] = c10 == 1 ? c0Var.t() : c0Var.n();
            if (c0Var.v() == 1) {
                c0Var.L(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0368b h(c0 c0Var, int i10) {
        c0Var.K(i10 + 8 + 4);
        c0Var.L(1);
        i(c0Var);
        c0Var.L(2);
        int z10 = c0Var.z();
        if ((z10 & 128) != 0) {
            c0Var.L(2);
        }
        if ((z10 & 64) != 0) {
            c0Var.L(c0Var.z());
        }
        if ((z10 & 32) != 0) {
            c0Var.L(2);
        }
        c0Var.L(1);
        i(c0Var);
        String h10 = x.h(c0Var.z());
        if (!"audio/mpeg".equals(h10) && !"audio/vnd.dts".equals(h10) && !"audio/vnd.dts.hd".equals(h10)) {
            c0Var.L(4);
            long B = c0Var.B();
            long B2 = c0Var.B();
            c0Var.L(1);
            int i11 = i(c0Var);
            byte[] bArr = new byte[i11];
            c0Var.j(bArr, 0, i11);
            return new C0368b(h10, bArr, B2 > 0 ? B2 : -1L, B > 0 ? B : -1L);
        }
        return new C0368b(h10, null, -1L, -1L);
    }

    private static int i(c0 c0Var) {
        int z10 = c0Var.z();
        int i10 = z10 & 127;
        while ((z10 & 128) == 128) {
            z10 = c0Var.z();
            i10 = (i10 << 7) | (z10 & 127);
        }
        return i10;
    }

    private static int j(c0 c0Var) {
        c0Var.K(16);
        return c0Var.n();
    }

    private static Pair<Long, String> k(c0 c0Var) {
        c0Var.K(8);
        int c10 = v3.a.c(c0Var.n());
        c0Var.L(c10 == 0 ? 8 : 16);
        long B = c0Var.B();
        c0Var.L(c10 == 0 ? 4 : 8);
        int F = c0Var.F();
        return Pair.create(Long.valueOf(B), "" + ((char) (((F >> 10) & 31) + 96)) + ((char) (((F >> 5) & 31) + 96)) + ((char) ((F & 31) + 96)));
    }

    private static void l(c0 c0Var, int i10, int i11, int i12, d dVar) {
        c0Var.K(i11 + 8 + 8);
        if (i10 == 1835365492) {
            c0Var.u();
            String u10 = c0Var.u();
            if (u10 != null) {
                dVar.f31768b = new m1.b().R(i12).e0(u10).E();
            }
        }
    }

    private static long m(c0 c0Var) {
        c0Var.K(8);
        c0Var.L(v3.a.c(c0Var.n()) != 0 ? 16 : 8);
        return c0Var.B();
    }

    private static float n(c0 c0Var, int i10) {
        c0Var.K(i10 + 8);
        return c0Var.D() / c0Var.D();
    }

    private static byte[] o(c0 c0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c0Var.K(i12);
            int n10 = c0Var.n();
            if (c0Var.n() == 1886547818) {
                return Arrays.copyOfRange(c0Var.d(), i12, n10 + i12);
            }
            i12 += n10;
        }
        return null;
    }

    private static Pair<Integer, j> p(c0 c0Var, int i10, int i11) throws h2 {
        Pair<Integer, j> f10;
        int e8 = c0Var.e();
        while (e8 - i10 < i11) {
            c0Var.K(e8);
            int n10 = c0Var.n();
            s3.l.a(n10 > 0, "childAtomSize must be positive");
            if (c0Var.n() == 1936289382 && (f10 = f(c0Var, e8, n10)) != null) {
                return f10;
            }
            e8 += n10;
        }
        return null;
    }

    private static j q(c0 c0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            c0Var.K(i14);
            int n10 = c0Var.n();
            if (c0Var.n() == 1952804451) {
                int c10 = v3.a.c(c0Var.n());
                c0Var.L(1);
                if (c10 == 0) {
                    c0Var.L(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int z10 = c0Var.z();
                    i12 = z10 & 15;
                    i13 = (z10 & 240) >> 4;
                }
                boolean z11 = c0Var.z() == 1;
                int z12 = c0Var.z();
                byte[] bArr2 = new byte[16];
                c0Var.j(bArr2, 0, 16);
                if (z11 && z12 == 0) {
                    int z13 = c0Var.z();
                    bArr = new byte[z13];
                    c0Var.j(bArr, 0, z13);
                }
                return new j(z11, str, z12, bArr2, i13, i12, bArr);
            }
            i14 += n10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0433 A[EDGE_INSN: B:210:0x0433->B:169:0x0433 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static v3.l r(v3.i r38, v3.a.C0367a r39, s3.n r40) throws n3.h2 {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.b.r(v3.i, v3.a$a, s3.n):v3.l");
    }

    private static d s(c0 c0Var, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws h2 {
        int i12;
        c0Var.K(12);
        int n10 = c0Var.n();
        d dVar = new d(n10);
        for (int i13 = 0; i13 < n10; i13++) {
            int e8 = c0Var.e();
            int n11 = c0Var.n();
            s3.l.a(n11 > 0, "childAtomSize must be positive");
            int n12 = c0Var.n();
            if (n12 == 1635148593 || n12 == 1635148595 || n12 == 1701733238 || n12 == 1831958048 || n12 == 1836070006 || n12 == 1752589105 || n12 == 1751479857 || n12 == 1932670515 || n12 == 1211250227 || n12 == 1987063864 || n12 == 1987063865 || n12 == 1635135537 || n12 == 1685479798 || n12 == 1685479729 || n12 == 1685481573 || n12 == 1685481521) {
                i12 = e8;
                x(c0Var, n12, i12, n11, i10, i11, drmInitData, dVar, i13);
            } else if (n12 == 1836069985 || n12 == 1701733217 || n12 == 1633889587 || n12 == 1700998451 || n12 == 1633889588 || n12 == 1835823201 || n12 == 1685353315 || n12 == 1685353317 || n12 == 1685353320 || n12 == 1685353324 || n12 == 1685353336 || n12 == 1935764850 || n12 == 1935767394 || n12 == 1819304813 || n12 == 1936684916 || n12 == 1953984371 || n12 == 778924082 || n12 == 778924083 || n12 == 1835557169 || n12 == 1835560241 || n12 == 1634492771 || n12 == 1634492791 || n12 == 1970037111 || n12 == 1332770163 || n12 == 1716281667) {
                i12 = e8;
                e(c0Var, n12, e8, n11, i10, str, z10, drmInitData, dVar, i13);
            } else {
                if (n12 == 1414810956 || n12 == 1954034535 || n12 == 2004251764 || n12 == 1937010800 || n12 == 1664495672) {
                    t(c0Var, n12, e8, n11, i10, str, dVar);
                } else if (n12 == 1835365492) {
                    l(c0Var, n12, e8, i10, dVar);
                } else if (n12 == 1667329389) {
                    dVar.f31768b = new m1.b().R(i10).e0("application/x-camera-motion").E();
                }
                i12 = e8;
            }
            c0Var.K(i12 + n11);
        }
        return dVar;
    }

    private static void t(c0 c0Var, int i10, int i11, int i12, int i13, String str, d dVar) {
        c0Var.K(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        q qVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                c0Var.j(bArr, 0, i14);
                qVar = q.q(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                dVar.f31770d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        dVar.f31768b = new m1.b().R(i13).e0(str2).V(str).i0(j10).T(qVar).E();
    }

    private static g u(c0 c0Var) {
        boolean z10;
        c0Var.K(8);
        int c10 = v3.a.c(c0Var.n());
        c0Var.L(c10 == 0 ? 8 : 16);
        int n10 = c0Var.n();
        c0Var.L(4);
        int e8 = c0Var.e();
        int i10 = c10 == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (c0Var.d()[e8 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            c0Var.L(i10);
        } else {
            long B = c10 == 0 ? c0Var.B() : c0Var.E();
            if (B != 0) {
                j10 = B;
            }
        }
        c0Var.L(16);
        int n11 = c0Var.n();
        int n12 = c0Var.n();
        c0Var.L(4);
        int n13 = c0Var.n();
        int n14 = c0Var.n();
        if (n11 == 0 && n12 == 65536 && n13 == -65536 && n14 == 0) {
            i11 = 90;
        } else if (n11 == 0 && n12 == -65536 && n13 == 65536 && n14 == 0) {
            i11 = 270;
        } else if (n11 == -65536 && n12 == 0 && n13 == 0 && n14 == -65536) {
            i11 = 180;
        }
        return new g(n10, j10, i11);
    }

    private static i v(a.C0367a c0367a, a.b bVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws h2 {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0367a f10;
        Pair<long[], long[]> g10;
        a.C0367a c0367a2 = (a.C0367a) a5.a.e(c0367a.f(1835297121));
        int d10 = d(j(((a.b) a5.a.e(c0367a2.g(1751411826))).f31752b));
        if (d10 == -1) {
            return null;
        }
        g u10 = u(((a.b) a5.a.e(c0367a.g(1953196132))).f31752b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = u10.f31780b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long m7 = m(bVar2.f31752b);
        long O0 = j11 != -9223372036854775807L ? p0.O0(j11, 1000000L, m7) : -9223372036854775807L;
        Pair<Long, String> k10 = k(((a.b) a5.a.e(c0367a2.g(1835296868))).f31752b);
        d s10 = s(((a.b) a5.a.e(((a.C0367a) a5.a.e(((a.C0367a) a5.a.e(c0367a2.f(1835626086))).f(1937007212))).g(1937011556))).f31752b, u10.f31779a, u10.f31781c, (String) k10.second, drmInitData, z11);
        if (z10 || (f10 = c0367a.f(1701082227)) == null || (g10 = g(f10)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            jArr2 = (long[]) g10.second;
            jArr = (long[]) g10.first;
        }
        if (s10.f31768b == null) {
            return null;
        }
        return new i(u10.f31779a, d10, ((Long) k10.first).longValue(), m7, O0, s10.f31768b, s10.f31770d, s10.f31767a, s10.f31769c, jArr, jArr2);
    }

    public static List<l> w(a.C0367a c0367a, n nVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11, x5.d<i, i> dVar) throws h2 {
        i apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0367a.f31751d.size(); i10++) {
            a.C0367a c0367a2 = c0367a.f31751d.get(i10);
            if (c0367a2.f31748a == 1953653099 && (apply = dVar.apply(v(c0367a2, (a.b) a5.a.e(c0367a.g(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(r(apply, (a.C0367a) a5.a.e(((a.C0367a) a5.a.e(((a.C0367a) a5.a.e(c0367a2.f(1835297121))).f(1835626086))).f(1937007212)), nVar));
            }
        }
        return arrayList;
    }

    private static void x(c0 c0Var, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, d dVar, int i15) throws h2 {
        DrmInitData drmInitData2;
        int i16;
        int i17;
        byte[] bArr;
        float f10;
        List<byte[]> list;
        String str;
        int i18 = i11;
        int i19 = i12;
        DrmInitData drmInitData3 = drmInitData;
        d dVar2 = dVar;
        c0Var.K(i18 + 8 + 8);
        c0Var.L(16);
        int F = c0Var.F();
        int F2 = c0Var.F();
        c0Var.L(50);
        int e8 = c0Var.e();
        int i20 = i10;
        if (i20 == 1701733238) {
            Pair<Integer, j> p10 = p(c0Var, i18, i19);
            if (p10 != null) {
                i20 = ((Integer) p10.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.c(((j) p10.second).f31850b);
                dVar2.f31767a[i15] = (j) p10.second;
            }
            c0Var.K(e8);
        }
        String str2 = "video/3gpp";
        String str3 = i20 == 1831958048 ? "video/mpeg" : i20 == 1211250227 ? "video/3gpp" : null;
        float f11 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        ByteBuffer byteBuffer = null;
        C0368b c0368b = null;
        boolean z10 = false;
        while (true) {
            if (e8 - i18 >= i19) {
                drmInitData2 = drmInitData3;
                break;
            }
            c0Var.K(e8);
            int e10 = c0Var.e();
            String str5 = str2;
            int n10 = c0Var.n();
            if (n10 == 0) {
                drmInitData2 = drmInitData3;
                if (c0Var.e() - i18 == i19) {
                    break;
                }
            } else {
                drmInitData2 = drmInitData3;
            }
            s3.l.a(n10 > 0, "childAtomSize must be positive");
            int n11 = c0Var.n();
            if (n11 == 1635148611) {
                s3.l.a(str3 == null, null);
                c0Var.K(e10 + 8);
                b5.a b10 = b5.a.b(c0Var);
                list2 = b10.f5089a;
                dVar2.f31769c = b10.f5090b;
                if (!z10) {
                    f11 = b10.f5093e;
                }
                str4 = b10.f5094f;
                str = MimeTypes.VIDEO_H264;
            } else if (n11 == 1752589123) {
                s3.l.a(str3 == null, null);
                c0Var.K(e10 + 8);
                b5.f a10 = b5.f.a(c0Var);
                list2 = a10.f5126a;
                dVar2.f31769c = a10.f5127b;
                if (!z10) {
                    f11 = a10.f5130e;
                }
                str4 = a10.f5131f;
                str = MimeTypes.VIDEO_H265;
            } else {
                if (n11 == 1685480259 || n11 == 1685485123) {
                    i16 = F2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    b5.d a11 = b5.d.a(c0Var);
                    if (a11 != null) {
                        str4 = a11.f5111c;
                        str3 = "video/dolby-vision";
                    }
                } else if (n11 == 1987076931) {
                    s3.l.a(str3 == null, null);
                    str = i20 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (n11 == 1635135811) {
                    s3.l.a(str3 == null, null);
                    str = MimeTypes.VIDEO_AV1;
                } else if (n11 == 1668050025) {
                    ByteBuffer a12 = byteBuffer == null ? a() : byteBuffer;
                    a12.position(21);
                    a12.putShort(c0Var.v());
                    a12.putShort(c0Var.v());
                    byteBuffer = a12;
                    i16 = F2;
                    i17 = i20;
                    e8 += n10;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    drmInitData3 = drmInitData2;
                    i20 = i17;
                    F2 = i16;
                } else if (n11 == 1835295606) {
                    ByteBuffer a13 = byteBuffer == null ? a() : byteBuffer;
                    short v10 = c0Var.v();
                    short v11 = c0Var.v();
                    short v12 = c0Var.v();
                    i17 = i20;
                    short v13 = c0Var.v();
                    short v14 = c0Var.v();
                    List<byte[]> list3 = list2;
                    short v15 = c0Var.v();
                    byte[] bArr3 = bArr2;
                    short v16 = c0Var.v();
                    float f12 = f11;
                    short v17 = c0Var.v();
                    long B = c0Var.B();
                    long B2 = c0Var.B();
                    i16 = F2;
                    a13.position(1);
                    a13.putShort(v14);
                    a13.putShort(v15);
                    a13.putShort(v10);
                    a13.putShort(v11);
                    a13.putShort(v12);
                    a13.putShort(v13);
                    a13.putShort(v16);
                    a13.putShort(v17);
                    a13.putShort((short) (B / 10000));
                    a13.putShort((short) (B2 / 10000));
                    byteBuffer = a13;
                    list2 = list3;
                    bArr2 = bArr3;
                    f11 = f12;
                    e8 += n10;
                    i18 = i11;
                    i19 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    drmInitData3 = drmInitData2;
                    i20 = i17;
                    F2 = i16;
                } else {
                    i16 = F2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    if (n11 == 1681012275) {
                        s3.l.a(str3 == null, null);
                        str3 = str5;
                    } else if (n11 == 1702061171) {
                        s3.l.a(str3 == null, null);
                        c0368b = h(c0Var, e10);
                        String str6 = c0368b.f31763a;
                        byte[] bArr4 = c0368b.f31764b;
                        list2 = bArr4 != null ? q.q(bArr4) : list;
                        str3 = str6;
                        bArr2 = bArr;
                        f11 = f10;
                        e8 += n10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i20 = i17;
                        F2 = i16;
                    } else if (n11 == 1885434736) {
                        f11 = n(c0Var, e10);
                        list2 = list;
                        bArr2 = bArr;
                        z10 = true;
                        e8 += n10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i20 = i17;
                        F2 = i16;
                    } else if (n11 == 1937126244) {
                        bArr2 = o(c0Var, e10, n10);
                        list2 = list;
                        f11 = f10;
                        e8 += n10;
                        i18 = i11;
                        i19 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i20 = i17;
                        F2 = i16;
                    } else if (n11 == 1936995172) {
                        int z11 = c0Var.z();
                        c0Var.L(3);
                        if (z11 == 0) {
                            int z12 = c0Var.z();
                            if (z12 == 0) {
                                i21 = 0;
                            } else if (z12 == 1) {
                                i21 = 1;
                            } else if (z12 == 2) {
                                i21 = 2;
                            } else if (z12 == 3) {
                                i21 = 3;
                            }
                        }
                    } else if (n11 == 1668246642) {
                        int n12 = c0Var.n();
                        if (n12 != 1852009592 && n12 != 1852009571) {
                            t.i("AtomParsers", "Unsupported color type: " + v3.a.a(n12));
                        } else {
                            int F3 = c0Var.F();
                            int F4 = c0Var.F();
                            c0Var.L(2);
                            boolean z13 = n10 == 19 && (c0Var.z() & 128) != 0;
                            i22 = b5.c.b(F3);
                            i23 = z13 ? 1 : 2;
                            i24 = b5.c.c(F4);
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f11 = f10;
                e8 += n10;
                i18 = i11;
                i19 = i12;
                dVar2 = dVar;
                str2 = str5;
                drmInitData3 = drmInitData2;
                i20 = i17;
                F2 = i16;
            }
            str3 = str;
            i16 = F2;
            i17 = i20;
            e8 += n10;
            i18 = i11;
            i19 = i12;
            dVar2 = dVar;
            str2 = str5;
            drmInitData3 = drmInitData2;
            i20 = i17;
            F2 = i16;
        }
        int i25 = F2;
        byte[] bArr5 = bArr2;
        float f13 = f11;
        List<byte[]> list4 = list2;
        if (str3 == null) {
            return;
        }
        m1.b M = new m1.b().R(i13).e0(str3).I(str4).j0(F).Q(i25).a0(f13).d0(i14).b0(bArr5).h0(i21).T(list4).M(drmInitData2);
        int i26 = i22;
        int i27 = i23;
        int i28 = i24;
        if (i26 != -1 || i27 != -1 || i28 != -1 || byteBuffer != null) {
            M.J(new b5.c(i26, i27, i28, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c0368b != null) {
            M.G(a6.b.j(c0368b.f31765c)).Z(a6.b.j(c0368b.f31766d));
        }
        dVar.f31768b = M.E();
    }
}
