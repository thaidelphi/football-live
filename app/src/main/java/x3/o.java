package x3;

import a5.k0;
import a5.m0;
import a5.p0;
import a5.y;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.j;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import n3.m1;
import n3.n1;
import o3.q1;
import q3.g;
import x3.l;
import x3.v;
/* compiled from: MediaCodecRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class o extends n3.f {
    private static final byte[] O0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final long[] A;
    private boolean A0;
    private m1 B;
    private boolean B0;
    private m1 C;
    private boolean C0;
    private com.google.android.exoplayer2.drm.j D;
    private long D0;
    private com.google.android.exoplayer2.drm.j E;
    private long E0;
    private MediaCrypto F;
    private boolean F0;
    private boolean G;
    private boolean G0;
    private long H;
    private boolean H0;
    private float I;
    private boolean I0;
    private float J;
    private n3.q J0;
    private l K;
    protected q3.e K0;
    private m1 L;
    private long L0;
    private MediaFormat M;
    private long M0;
    private boolean N;
    private int N0;
    private float O;
    private ArrayDeque<n> P;
    private b Q;
    private n R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f32500a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f32501b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f32502c0;

    /* renamed from: d0  reason: collision with root package name */
    private i f32503d0;

    /* renamed from: e0  reason: collision with root package name */
    private long f32504e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f32505f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f32506g0;

    /* renamed from: h0  reason: collision with root package name */
    private ByteBuffer f32507h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f32508i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f32509j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f32510k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f32511l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f32512m0;

    /* renamed from: n  reason: collision with root package name */
    private final l.b f32513n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f32514n0;

    /* renamed from: o  reason: collision with root package name */
    private final q f32515o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f32516p;

    /* renamed from: q  reason: collision with root package name */
    private final float f32517q;

    /* renamed from: r  reason: collision with root package name */
    private final q3.g f32518r;

    /* renamed from: s  reason: collision with root package name */
    private final q3.g f32519s;

    /* renamed from: t  reason: collision with root package name */
    private final q3.g f32520t;

    /* renamed from: u  reason: collision with root package name */
    private final h f32521u;

    /* renamed from: v  reason: collision with root package name */
    private final k0<m1> f32522v;

    /* renamed from: w  reason: collision with root package name */
    private final ArrayList<Long> f32523w;

    /* renamed from: x  reason: collision with root package name */
    private final MediaCodec.BufferInfo f32524x;

    /* renamed from: x0  reason: collision with root package name */
    private int f32525x0;

    /* renamed from: y  reason: collision with root package name */
    private final long[] f32526y;

    /* renamed from: y0  reason: collision with root package name */
    private int f32527y0;

    /* renamed from: z  reason: collision with root package name */
    private final long[] f32528z;

    /* renamed from: z0  reason: collision with root package name */
    private int f32529z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        public static void a(l.a aVar, q1 q1Var) {
            LogSessionId a10 = q1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f32482b.setString("log-session-id", a10.getStringId());
        }
    }

    public o(int i10, l.b bVar, q qVar, boolean z10, float f10) {
        super(i10);
        this.f32513n = bVar;
        this.f32515o = (q) a5.a.e(qVar);
        this.f32516p = z10;
        this.f32517q = f10;
        this.f32518r = q3.g.t();
        this.f32519s = new q3.g(0);
        this.f32520t = new q3.g(2);
        h hVar = new h();
        this.f32521u = hVar;
        this.f32522v = new k0<>();
        this.f32523w = new ArrayList<>();
        this.f32524x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f32526y = new long[10];
        this.f32528z = new long[10];
        this.A = new long[10];
        this.L0 = -9223372036854775807L;
        c1(-9223372036854775807L);
        hVar.q(0);
        hVar.f30091c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f32525x0 = 0;
        this.f32505f0 = -1;
        this.f32506g0 = -1;
        this.f32504e0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.f32527y0 = 0;
        this.f32529z0 = 0;
    }

    private void A0(n nVar, MediaCrypto mediaCrypto) throws Exception {
        String str = nVar.f32489a;
        int i10 = p0.f482a;
        float q02 = i10 < 23 ? -1.0f : q0(this.J, this.B, D());
        float f10 = q02 > this.f32517q ? q02 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a u02 = u0(nVar, this.B, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(u02, C());
        }
        try {
            m0.a("createCodec:" + str);
            this.K = this.f32513n.a(u02);
            m0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.R = nVar;
            this.O = f10;
            this.L = this.B;
            this.S = S(str);
            this.T = T(str, this.L);
            this.U = Y(str);
            this.V = a0(str);
            this.W = V(str);
            this.X = W(str);
            this.Y = U(str);
            this.Z = Z(str, this.L);
            this.f32502c0 = X(nVar) || p0();
            if (this.K.g()) {
                this.f32514n0 = true;
                this.f32525x0 = 1;
                this.f32500a0 = this.S != 0;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f32489a)) {
                this.f32503d0 = new i();
            }
            if (getState() == 2) {
                this.f32504e0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.K0.f30078a++;
            I0(str, u02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            m0.c();
            throw th;
        }
    }

    private boolean B0(long j10) {
        int size = this.f32523w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f32523w.get(i10).longValue() == j10) {
                this.f32523w.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean C0(IllegalStateException illegalStateException) {
        if (p0.f482a < 21 || !D0(illegalStateException)) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
        }
        return true;
    }

    private static boolean D0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean E0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G0(android.media.MediaCrypto r8, boolean r9) throws x3.o.b {
        /*
            r7 = this;
            java.util.ArrayDeque<x3.n> r0 = r7.P
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.m0(r9)     // Catch: x3.v.c -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: x3.v.c -> L2d
            r2.<init>()     // Catch: x3.v.c -> L2d
            r7.P = r2     // Catch: x3.v.c -> L2d
            boolean r3 = r7.f32516p     // Catch: x3.v.c -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: x3.v.c -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: x3.v.c -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<x3.n> r2 = r7.P     // Catch: x3.v.c -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: x3.v.c -> L2d
            x3.n r0 = (x3.n) r0     // Catch: x3.v.c -> L2d
            r2.add(r0)     // Catch: x3.v.c -> L2d
        L2a:
            r7.Q = r1     // Catch: x3.v.c -> L2d
            goto L39
        L2d:
            r8 = move-exception
            x3.o$b r0 = new x3.o$b
            n3.m1 r1 = r7.B
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<x3.n> r0 = r7.P
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<x3.n> r0 = r7.P
            java.lang.Object r0 = r0.peekFirst()
            x3.n r0 = (x3.n) r0
        L49:
            x3.l r2 = r7.K
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<x3.n> r2 = r7.P
            java.lang.Object r2 = r2.peekFirst()
            x3.n r2 = (x3.n) r2
            boolean r3 = r7.h1(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.A0(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            a5.t.i(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.A0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            a5.t.j(r4, r5, r3)
            java.util.ArrayDeque<x3.n> r4 = r7.P
            r4.removeFirst()
            x3.o$b r4 = new x3.o$b
            n3.m1 r5 = r7.B
            r4.<init>(r5, r3, r9, r2)
            r7.H0(r4)
            x3.o$b r2 = r7.Q
            if (r2 != 0) goto L9f
            r7.Q = r4
            goto La5
        L9f:
            x3.o$b r2 = x3.o.b.a(r2, r4)
            r7.Q = r2
        La5:
            java.util.ArrayDeque<x3.n> r2 = r7.P
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            x3.o$b r8 = r7.Q
            throw r8
        Lb1:
            r7.P = r1
            return
        Lb4:
            x3.o$b r8 = new x3.o$b
            n3.m1 r0 = r7.B
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.o.G0(android.media.MediaCrypto, boolean):void");
    }

    private void P() throws n3.q {
        a5.a.f(!this.F0);
        n1 A = A();
        this.f32520t.g();
        do {
            this.f32520t.g();
            int M = M(A, this.f32520t, 0);
            if (M == -5) {
                K0(A);
                return;
            } else if (M != -4) {
                if (M != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f32520t.l()) {
                this.F0 = true;
                return;
            } else {
                if (this.H0) {
                    m1 m1Var = (m1) a5.a.e(this.B);
                    this.C = m1Var;
                    L0(m1Var, null);
                    this.H0 = false;
                }
                this.f32520t.r();
            }
        } while (this.f32521u.v(this.f32520t));
        this.f32511l0 = true;
    }

    private boolean Q(long j10, long j11) throws n3.q {
        boolean z10;
        a5.a.f(!this.G0);
        if (this.f32521u.A()) {
            h hVar = this.f32521u;
            if (!R0(j10, j11, null, hVar.f30091c, this.f32506g0, 0, hVar.z(), this.f32521u.x(), this.f32521u.k(), this.f32521u.l(), this.C)) {
                return false;
            }
            N0(this.f32521u.y());
            this.f32521u.g();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.F0) {
            this.G0 = true;
            return z10;
        }
        if (this.f32511l0) {
            a5.a.f(this.f32521u.v(this.f32520t));
            this.f32511l0 = z10;
        }
        if (this.f32512m0) {
            if (this.f32521u.A()) {
                return true;
            }
            c0();
            this.f32512m0 = z10;
            F0();
            if (!this.f32510k0) {
                return z10;
            }
        }
        P();
        if (this.f32521u.A()) {
            this.f32521u.r();
        }
        if (this.f32521u.A() || this.F0 || this.f32512m0) {
            return true;
        }
        return z10;
    }

    @TargetApi(23)
    private void Q0() throws n3.q {
        int i10 = this.f32529z0;
        if (i10 == 1) {
            j0();
        } else if (i10 == 2) {
            j0();
            n1();
        } else if (i10 != 3) {
            this.G0 = true;
            W0();
        } else {
            U0();
        }
    }

    private int S(String str) {
        int i10 = p0.f482a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = p0.f485d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = p0.f483b;
                return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
            }
            return 0;
        }
        return 0;
    }

    private void S0() {
        this.C0 = true;
        MediaFormat a10 = this.K.a();
        if (this.S != 0 && a10.getInteger("width") == 32 && a10.getInteger("height") == 32) {
            this.f32501b0 = true;
            return;
        }
        if (this.Z) {
            a10.setInteger("channel-count", 1);
        }
        this.M = a10;
        this.N = true;
    }

    private static boolean T(String str, m1 m1Var) {
        return p0.f482a < 21 && m1Var.f28187n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private boolean T0(int i10) throws n3.q {
        n1 A = A();
        this.f32518r.g();
        int M = M(A, this.f32518r, i10 | 4);
        if (M == -5) {
            K0(A);
            return true;
        } else if (M == -4 && this.f32518r.l()) {
            this.F0 = true;
            Q0();
            return false;
        } else {
            return false;
        }
    }

    private static boolean U(String str) {
        if (p0.f482a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(p0.f484c)) {
            String str2 = p0.f483b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private void U0() throws n3.q {
        V0();
        F0();
    }

    private static boolean V(String str) {
        int i10 = p0.f482a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = p0.f483b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean W(String str) {
        return p0.f482a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean X(n nVar) {
        String str = nVar.f32489a;
        int i10 = p0.f482a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(p0.f484c) && "AFTS".equals(p0.f485d) && nVar.f32495g));
    }

    private static boolean Y(String str) {
        int i10 = p0.f482a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && p0.f485d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean Z(String str, m1 m1Var) {
        return p0.f482a <= 18 && m1Var.f28198y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void Z0() {
        this.f32505f0 = -1;
        this.f32519s.f30091c = null;
    }

    private static boolean a0(String str) {
        return p0.f482a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void a1() {
        this.f32506g0 = -1;
        this.f32507h0 = null;
    }

    private void b1(com.google.android.exoplayer2.drm.j jVar) {
        r3.d.a(this.D, jVar);
        this.D = jVar;
    }

    private void c0() {
        this.f32512m0 = false;
        this.f32521u.g();
        this.f32520t.g();
        this.f32511l0 = false;
        this.f32510k0 = false;
    }

    private void c1(long j10) {
        this.M0 = j10;
        if (j10 != -9223372036854775807L) {
            M0(j10);
        }
    }

    private boolean d0() {
        if (this.A0) {
            this.f32527y0 = 1;
            if (!this.U && !this.W) {
                this.f32529z0 = 1;
            } else {
                this.f32529z0 = 3;
                return false;
            }
        }
        return true;
    }

    private void e0() throws n3.q {
        if (this.A0) {
            this.f32527y0 = 1;
            this.f32529z0 = 3;
            return;
        }
        U0();
    }

    @TargetApi(23)
    private boolean f0() throws n3.q {
        if (this.A0) {
            this.f32527y0 = 1;
            if (!this.U && !this.W) {
                this.f32529z0 = 2;
            } else {
                this.f32529z0 = 3;
                return false;
            }
        } else {
            n1();
        }
        return true;
    }

    private void f1(com.google.android.exoplayer2.drm.j jVar) {
        r3.d.a(this.E, jVar);
        this.E = jVar;
    }

    private boolean g0(long j10, long j11) throws n3.q {
        boolean z10;
        boolean R0;
        l lVar;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int k10;
        if (!y0()) {
            if (this.X && this.B0) {
                try {
                    k10 = this.K.k(this.f32524x);
                } catch (IllegalStateException unused) {
                    Q0();
                    if (this.G0) {
                        V0();
                    }
                    return false;
                }
            } else {
                k10 = this.K.k(this.f32524x);
            }
            if (k10 < 0) {
                if (k10 == -2) {
                    S0();
                    return true;
                }
                if (this.f32502c0 && (this.F0 || this.f32527y0 == 2)) {
                    Q0();
                }
                return false;
            } else if (this.f32501b0) {
                this.f32501b0 = false;
                this.K.l(k10, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo2 = this.f32524x;
                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                    Q0();
                    return false;
                }
                this.f32506g0 = k10;
                ByteBuffer n10 = this.K.n(k10);
                this.f32507h0 = n10;
                if (n10 != null) {
                    n10.position(this.f32524x.offset);
                    ByteBuffer byteBuffer2 = this.f32507h0;
                    MediaCodec.BufferInfo bufferInfo3 = this.f32524x;
                    byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                }
                if (this.Y) {
                    MediaCodec.BufferInfo bufferInfo4 = this.f32524x;
                    if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                        long j12 = this.D0;
                        if (j12 != -9223372036854775807L) {
                            bufferInfo4.presentationTimeUs = j12;
                        }
                    }
                }
                this.f32508i0 = B0(this.f32524x.presentationTimeUs);
                long j13 = this.E0;
                long j14 = this.f32524x.presentationTimeUs;
                this.f32509j0 = j13 == j14;
                o1(j14);
            }
        }
        if (this.X && this.B0) {
            try {
                lVar = this.K;
                byteBuffer = this.f32507h0;
                i10 = this.f32506g0;
                bufferInfo = this.f32524x;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                R0 = R0(j10, j11, lVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f32508i0, this.f32509j0, this.C);
            } catch (IllegalStateException unused3) {
                Q0();
                if (this.G0) {
                    V0();
                }
                return z10;
            }
        } else {
            z10 = false;
            l lVar2 = this.K;
            ByteBuffer byteBuffer3 = this.f32507h0;
            int i11 = this.f32506g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f32524x;
            R0 = R0(j10, j11, lVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f32508i0, this.f32509j0, this.C);
        }
        if (R0) {
            N0(this.f32524x.presentationTimeUs);
            boolean z11 = (this.f32524x.flags & 4) != 0 ? true : z10;
            a1();
            if (!z11) {
                return true;
            }
            Q0();
        }
        return z10;
    }

    private boolean g1(long j10) {
        return this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.H;
    }

    private boolean h0(n nVar, m1 m1Var, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.j jVar2) throws n3.q {
        r3.q t02;
        if (jVar == jVar2) {
            return false;
        }
        if (jVar2 == null || jVar == null || !jVar2.c().equals(jVar.c()) || p0.f482a < 23) {
            return true;
        }
        UUID uuid = n3.i.f28008e;
        if (uuid.equals(jVar.c()) || uuid.equals(jVar2.c()) || (t02 = t0(jVar2)) == null) {
            return true;
        }
        return !nVar.f32495g && (t02.f30372c ? false : jVar2.g(m1Var.f28185l));
    }

    private boolean i0() throws n3.q {
        int i10;
        if (this.K == null || (i10 = this.f32527y0) == 2 || this.F0) {
            return false;
        }
        if (i10 == 0 && i1()) {
            e0();
        }
        if (this.f32505f0 < 0) {
            int j10 = this.K.j();
            this.f32505f0 = j10;
            if (j10 < 0) {
                return false;
            }
            this.f32519s.f30091c = this.K.c(j10);
            this.f32519s.g();
        }
        if (this.f32527y0 == 1) {
            if (!this.f32502c0) {
                this.B0 = true;
                this.K.e(this.f32505f0, 0, 0, 0L, 4);
                Z0();
            }
            this.f32527y0 = 2;
            return false;
        } else if (this.f32500a0) {
            this.f32500a0 = false;
            ByteBuffer byteBuffer = this.f32519s.f30091c;
            byte[] bArr = O0;
            byteBuffer.put(bArr);
            this.K.e(this.f32505f0, 0, bArr.length, 0L, 0);
            Z0();
            this.A0 = true;
            return true;
        } else {
            if (this.f32525x0 == 1) {
                for (int i11 = 0; i11 < this.L.f28187n.size(); i11++) {
                    this.f32519s.f30091c.put(this.L.f28187n.get(i11));
                }
                this.f32525x0 = 2;
            }
            int position = this.f32519s.f30091c.position();
            n1 A = A();
            try {
                int M = M(A, this.f32519s, 0);
                if (g()) {
                    this.E0 = this.D0;
                }
                if (M == -3) {
                    return false;
                }
                if (M == -5) {
                    if (this.f32525x0 == 2) {
                        this.f32519s.g();
                        this.f32525x0 = 1;
                    }
                    K0(A);
                    return true;
                } else if (this.f32519s.l()) {
                    if (this.f32525x0 == 2) {
                        this.f32519s.g();
                        this.f32525x0 = 1;
                    }
                    this.F0 = true;
                    if (!this.A0) {
                        Q0();
                        return false;
                    }
                    try {
                        if (!this.f32502c0) {
                            this.B0 = true;
                            this.K.e(this.f32505f0, 0, 0, 0L, 4);
                            Z0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e8) {
                        throw x(e8, this.B, p0.T(e8.getErrorCode()));
                    }
                } else if (!this.A0 && !this.f32519s.n()) {
                    this.f32519s.g();
                    if (this.f32525x0 == 2) {
                        this.f32525x0 = 1;
                    }
                    return true;
                } else {
                    boolean s10 = this.f32519s.s();
                    if (s10) {
                        this.f32519s.f30090b.b(position);
                    }
                    if (this.T && !s10) {
                        y.b(this.f32519s.f30091c);
                        if (this.f32519s.f30091c.position() == 0) {
                            return true;
                        }
                        this.T = false;
                    }
                    q3.g gVar = this.f32519s;
                    long j11 = gVar.f30093e;
                    i iVar = this.f32503d0;
                    if (iVar != null) {
                        j11 = iVar.d(this.B, gVar);
                        this.D0 = Math.max(this.D0, this.f32503d0.b(this.B));
                    }
                    long j12 = j11;
                    if (this.f32519s.k()) {
                        this.f32523w.add(Long.valueOf(j12));
                    }
                    if (this.H0) {
                        this.f32522v.a(j12, this.B);
                        this.H0 = false;
                    }
                    this.D0 = Math.max(this.D0, j12);
                    this.f32519s.r();
                    if (this.f32519s.j()) {
                        x0(this.f32519s);
                    }
                    P0(this.f32519s);
                    try {
                        if (s10) {
                            this.K.m(this.f32505f0, 0, this.f32519s.f30090b, j12, 0);
                        } else {
                            this.K.e(this.f32505f0, 0, this.f32519s.f30091c.limit(), j12, 0);
                        }
                        Z0();
                        this.A0 = true;
                        this.f32525x0 = 0;
                        this.K0.f30080c++;
                        return true;
                    } catch (MediaCodec.CryptoException e10) {
                        throw x(e10, this.B, p0.T(e10.getErrorCode()));
                    }
                }
            } catch (g.a e11) {
                H0(e11);
                T0(0);
                j0();
                return true;
            }
        }
    }

    private void j0() {
        try {
            this.K.flush();
        } finally {
            X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean l1(m1 m1Var) {
        int i10 = m1Var.E;
        return i10 == 0 || i10 == 2;
    }

    private List<n> m0(boolean z10) throws v.c {
        List<n> s02 = s0(this.f32515o, this.B, z10);
        if (s02.isEmpty() && z10) {
            s02 = s0(this.f32515o, this.B, false);
            if (!s02.isEmpty()) {
                a5.t.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f28185l + ", but no secure decoder available. Trying to proceed with " + s02 + ".");
            }
        }
        return s02;
    }

    private boolean m1(m1 m1Var) throws n3.q {
        if (p0.f482a >= 23 && this.K != null && this.f32529z0 != 3 && getState() != 0) {
            float q02 = q0(this.J, m1Var, D());
            float f10 = this.O;
            if (f10 == q02) {
                return true;
            }
            if (q02 == -1.0f) {
                e0();
                return false;
            } else if (f10 == -1.0f && q02 <= this.f32517q) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", q02);
                this.K.h(bundle);
                this.O = q02;
            }
        }
        return true;
    }

    private void n1() throws n3.q {
        try {
            this.F.setMediaDrmSession(t0(this.E).f30371b);
            b1(this.E);
            this.f32527y0 = 0;
            this.f32529z0 = 0;
        } catch (MediaCryptoException e8) {
            throw x(e8, this.B, 6006);
        }
    }

    private r3.q t0(com.google.android.exoplayer2.drm.j jVar) throws n3.q {
        q3.b e8 = jVar.e();
        if (e8 != null && !(e8 instanceof r3.q)) {
            throw x(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + e8), this.B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (r3.q) e8;
    }

    private boolean y0() {
        return this.f32506g0 >= 0;
    }

    private void z0(m1 m1Var) {
        c0();
        String str = m1Var.f28185l;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.f32521u.B(1);
        } else {
            this.f32521u.B(32);
        }
        this.f32510k0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n3.f
    public void F() {
        this.B = null;
        this.L0 = -9223372036854775807L;
        c1(-9223372036854775807L);
        this.N0 = 0;
        l0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F0() throws n3.q {
        m1 m1Var;
        if (this.K != null || this.f32510k0 || (m1Var = this.B) == null) {
            return;
        }
        if (this.E == null && j1(m1Var)) {
            z0(this.B);
            return;
        }
        b1(this.E);
        String str = this.B.f28185l;
        com.google.android.exoplayer2.drm.j jVar = this.D;
        if (jVar != null) {
            if (this.F == null) {
                r3.q t02 = t0(jVar);
                if (t02 == null) {
                    if (this.D.getError() == null) {
                        return;
                    }
                } else {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(t02.f30370a, t02.f30371b);
                        this.F = mediaCrypto;
                        this.G = !t02.f30372c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e8) {
                        throw x(e8, this.B, 6006);
                    }
                }
            }
            if (r3.q.f30369d) {
                int state = this.D.getState();
                if (state == 1) {
                    j.a aVar = (j.a) a5.a.e(this.D.getError());
                    throw x(aVar, this.B, aVar.f10525a);
                } else if (state != 4) {
                    return;
                }
            }
        }
        try {
            G0(this.F, this.G);
        } catch (b e10) {
            throw x(e10, this.B, IronSourceConstants.NT_LOAD);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n3.f
    public void G(boolean z10, boolean z11) throws n3.q {
        this.K0 = new q3.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n3.f
    public void H(long j10, boolean z10) throws n3.q {
        this.F0 = false;
        this.G0 = false;
        this.I0 = false;
        if (this.f32510k0) {
            this.f32521u.g();
            this.f32520t.g();
            this.f32511l0 = false;
        } else {
            k0();
        }
        if (this.f32522v.l() > 0) {
            this.H0 = true;
        }
        this.f32522v.c();
        int i10 = this.N0;
        if (i10 != 0) {
            c1(this.f32528z[i10 - 1]);
            this.L0 = this.f32526y[this.N0 - 1];
            this.N0 = 0;
        }
    }

    protected abstract void H0(Exception exc);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n3.f
    public void I() {
        try {
            c0();
            V0();
        } finally {
            f1(null);
        }
    }

    protected abstract void I0(String str, l.a aVar, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n3.f
    public void J() {
    }

    protected abstract void J0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n3.f
    public void K() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (f0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
        if (f0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ce, code lost:
        r7 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q3.i K0(n3.n1 r12) throws n3.q {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.o.K0(n3.n1):q3.i");
    }

    @Override // n3.f
    protected void L(m1[] m1VarArr, long j10, long j11) throws n3.q {
        if (this.M0 == -9223372036854775807L) {
            a5.a.f(this.L0 == -9223372036854775807L);
            this.L0 = j10;
            c1(j11);
            return;
        }
        int i10 = this.N0;
        if (i10 == this.f32528z.length) {
            a5.t.i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f32528z[this.N0 - 1]);
        } else {
            this.N0 = i10 + 1;
        }
        long[] jArr = this.f32526y;
        int i11 = this.N0;
        jArr[i11 - 1] = j10;
        this.f32528z[i11 - 1] = j11;
        this.A[i11 - 1] = this.D0;
    }

    protected abstract void L0(m1 m1Var, MediaFormat mediaFormat) throws n3.q;

    protected void M0(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N0(long j10) {
        while (this.N0 != 0 && j10 >= this.A[0]) {
            this.L0 = this.f32526y[0];
            c1(this.f32528z[0]);
            int i10 = this.N0 - 1;
            this.N0 = i10;
            long[] jArr = this.f32526y;
            System.arraycopy(jArr, 1, jArr, 0, i10);
            long[] jArr2 = this.f32528z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.N0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.N0);
            O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O0() {
    }

    protected abstract void P0(q3.g gVar) throws n3.q;

    protected abstract q3.i R(n nVar, m1 m1Var, m1 m1Var2);

    protected abstract boolean R0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m1 m1Var) throws n3.q;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.drm.j, android.media.MediaCrypto] */
    public void V0() {
        try {
            l lVar = this.K;
            if (lVar != null) {
                lVar.release();
                this.K0.f30079b++;
                J0(this.R.f32489a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void W0() throws n3.q {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X0() {
        Z0();
        a1();
        this.f32504e0 = -9223372036854775807L;
        this.B0 = false;
        this.A0 = false;
        this.f32500a0 = false;
        this.f32501b0 = false;
        this.f32508i0 = false;
        this.f32509j0 = false;
        this.f32523w.clear();
        this.D0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        i iVar = this.f32503d0;
        if (iVar != null) {
            iVar.c();
        }
        this.f32527y0 = 0;
        this.f32529z0 = 0;
        this.f32525x0 = this.f32514n0 ? 1 : 0;
    }

    protected void Y0() {
        X0();
        this.J0 = null;
        this.f32503d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.C0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f32502c0 = false;
        this.f32514n0 = false;
        this.f32525x0 = 0;
        this.G = false;
    }

    @Override // n3.a3
    public final int a(m1 m1Var) throws n3.q {
        try {
            return k1(this.f32515o, m1Var);
        } catch (v.c e8) {
            throw x(e8, m1Var, IronSourceConstants.NT_INSTANCE_LOAD);
        }
    }

    protected m b0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    @Override // n3.y2
    public boolean c() {
        return this.G0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d1() {
        this.I0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e1(n3.q qVar) {
        this.J0 = qVar;
    }

    protected boolean h1(n nVar) {
        return true;
    }

    protected boolean i1() {
        return false;
    }

    @Override // n3.y2
    public boolean isReady() {
        return this.B != null && (E() || y0() || (this.f32504e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f32504e0));
    }

    protected boolean j1(m1 m1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean k0() throws n3.q {
        boolean l02 = l0();
        if (l02) {
            F0();
        }
        return l02;
    }

    protected abstract int k1(q qVar, m1 m1Var) throws v.c;

    protected boolean l0() {
        if (this.K == null) {
            return false;
        }
        int i10 = this.f32529z0;
        if (i10 != 3 && !this.U && ((!this.V || this.C0) && (!this.W || !this.B0))) {
            if (i10 == 2) {
                int i11 = p0.f482a;
                a5.a.f(i11 >= 23);
                if (i11 >= 23) {
                    try {
                        n1();
                    } catch (n3.q e8) {
                        a5.t.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e8);
                        V0();
                        return true;
                    }
                }
            }
            j0();
            return false;
        }
        V0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final l n0() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n o0() {
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o1(long j10) throws n3.q {
        boolean z10;
        m1 j11 = this.f32522v.j(j10);
        if (j11 == null && this.N) {
            j11 = this.f32522v.i();
        }
        if (j11 != null) {
            this.C = j11;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.N && this.C != null)) {
            L0(this.C, this.M);
            this.N = false;
        }
    }

    @Override // n3.f, n3.y2
    public void p(float f10, float f11) throws n3.q {
        this.I = f10;
        this.J = f11;
        m1(this.L);
    }

    protected boolean p0() {
        return false;
    }

    protected abstract float q0(float f10, m1 m1Var, m1[] m1VarArr);

    @Override // n3.f, n3.a3
    public final int r() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaFormat r0() {
        return this.M;
    }

    @Override // n3.y2
    public void s(long j10, long j11) throws n3.q {
        boolean z10 = false;
        if (this.I0) {
            this.I0 = false;
            Q0();
        }
        n3.q qVar = this.J0;
        if (qVar == null) {
            try {
                if (this.G0) {
                    W0();
                    return;
                } else if (this.B != null || T0(2)) {
                    F0();
                    if (this.f32510k0) {
                        m0.a("bypassRender");
                        while (Q(j10, j11)) {
                        }
                        m0.c();
                    } else if (this.K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        m0.a("drainAndFeed");
                        while (g0(j10, j11) && g1(elapsedRealtime)) {
                        }
                        while (i0() && g1(elapsedRealtime)) {
                        }
                        m0.c();
                    } else {
                        this.K0.f30081d += O(j10);
                        T0(1);
                    }
                    this.K0.c();
                    return;
                } else {
                    return;
                }
            } catch (IllegalStateException e8) {
                if (C0(e8)) {
                    H0(e8);
                    if (p0.f482a >= 21 && E0(e8)) {
                        z10 = true;
                    }
                    if (z10) {
                        V0();
                    }
                    throw y(b0(e8, o0()), this.B, z10, 4003);
                }
                throw e8;
            }
        }
        this.J0 = null;
        throw qVar;
    }

    protected abstract List<n> s0(q qVar, m1 m1Var, boolean z10) throws v.c;

    protected abstract l.a u0(n nVar, m1 m1Var, MediaCrypto mediaCrypto, float f10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long v0() {
        return this.M0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float w0() {
        return this.I;
    }

    protected void x0(q3.g gVar) throws n3.q {
    }

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f32530a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f32531b;

        /* renamed from: c  reason: collision with root package name */
        public final n f32532c;

        /* renamed from: d  reason: collision with root package name */
        public final String f32533d;

        /* renamed from: e  reason: collision with root package name */
        public final b f32534e;

        public b(m1 m1Var, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + m1Var, th, m1Var.f28185l, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f32530a, this.f32531b, this.f32532c, this.f32533d, bVar);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public b(m1 m1Var, Throwable th, boolean z10, n nVar) {
            this("Decoder init failed: " + nVar.f32489a + ", " + m1Var, th, m1Var.f28185l, z10, nVar, p0.f482a >= 21 ? d(th) : null, null);
        }

        private b(String str, Throwable th, String str2, boolean z10, n nVar, String str3, b bVar) {
            super(str, th);
            this.f32530a = str2;
            this.f32531b = z10;
            this.f32532c = nVar;
            this.f32533d = str3;
            this.f32534e = bVar;
        }
    }
}
