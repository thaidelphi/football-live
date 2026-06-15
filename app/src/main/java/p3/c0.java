package p3;

import a5.p0;
import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import n3.m1;
import n3.o2;
import n3.s;
import o3.q1;
import p3.e0;
import p3.g;
import p3.v;
import p3.x;
/* compiled from: DefaultAudioSink.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c0 implements v {

    /* renamed from: e0  reason: collision with root package name */
    public static boolean f29579e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    private static final Object f29580f0 = new Object();

    /* renamed from: g0  reason: collision with root package name */
    private static ExecutorService f29581g0;

    /* renamed from: h0  reason: collision with root package name */
    private static int f29582h0;
    private ByteBuffer A;
    private int B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private boolean H;
    private boolean I;
    private long J;
    private float K;
    private p3.g[] L;
    private ByteBuffer[] M;
    private ByteBuffer N;
    private int O;
    private ByteBuffer P;
    private byte[] Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private y Y;
    private d Z;

    /* renamed from: a  reason: collision with root package name */
    private final p3.f f29583a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f29584a0;

    /* renamed from: b  reason: collision with root package name */
    private final p3.h f29585b;

    /* renamed from: b0  reason: collision with root package name */
    private long f29586b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29587c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f29588c0;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f29589d;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f29590d0;

    /* renamed from: e  reason: collision with root package name */
    private final o0 f29591e;

    /* renamed from: f  reason: collision with root package name */
    private final p3.g[] f29592f;

    /* renamed from: g  reason: collision with root package name */
    private final p3.g[] f29593g;

    /* renamed from: h  reason: collision with root package name */
    private final a5.g f29594h;

    /* renamed from: i  reason: collision with root package name */
    private final x f29595i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<j> f29596j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f29597k;

    /* renamed from: l  reason: collision with root package name */
    private final int f29598l;

    /* renamed from: m  reason: collision with root package name */
    private m f29599m;

    /* renamed from: n  reason: collision with root package name */
    private final k<v.b> f29600n;

    /* renamed from: o  reason: collision with root package name */
    private final k<v.e> f29601o;

    /* renamed from: p  reason: collision with root package name */
    private final e f29602p;

    /* renamed from: q  reason: collision with root package name */
    private final s.a f29603q;

    /* renamed from: r  reason: collision with root package name */
    private q1 f29604r;

    /* renamed from: s  reason: collision with root package name */
    private v.c f29605s;

    /* renamed from: t  reason: collision with root package name */
    private g f29606t;

    /* renamed from: u  reason: collision with root package name */
    private g f29607u;

    /* renamed from: v  reason: collision with root package name */
    private AudioTrack f29608v;

    /* renamed from: w  reason: collision with root package name */
    private p3.e f29609w;

    /* renamed from: x  reason: collision with root package name */
    private j f29610x;

    /* renamed from: y  reason: collision with root package name */
    private j f29611y;

    /* renamed from: z  reason: collision with root package name */
    private o2 f29612z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f29613a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {
        public static void a(AudioTrack audioTrack, q1 q1Var) {
            LogSessionId a10 = q1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioDeviceInfo f29613a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f29613a = audioDeviceInfo;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f29614a = new e0.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, double d10);
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f {

        /* renamed from: b  reason: collision with root package name */
        private p3.h f29616b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f29617c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29618d;

        /* renamed from: g  reason: collision with root package name */
        s.a f29621g;

        /* renamed from: a  reason: collision with root package name */
        private p3.f f29615a = p3.f.f29675c;

        /* renamed from: e  reason: collision with root package name */
        private int f29619e = 0;

        /* renamed from: f  reason: collision with root package name */
        e f29620f = e.f29614a;

        public c0 f() {
            if (this.f29616b == null) {
                this.f29616b = new h(new p3.g[0]);
            }
            return new c0(this);
        }

        public f g(p3.f fVar) {
            a5.a.e(fVar);
            this.f29615a = fVar;
            return this;
        }

        public f h(boolean z10) {
            this.f29618d = z10;
            return this;
        }

        public f i(boolean z10) {
            this.f29617c = z10;
            return this;
        }

        public f j(int i10) {
            this.f29619e = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final m1 f29622a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29623b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29624c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29625d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29626e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29627f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29628g;

        /* renamed from: h  reason: collision with root package name */
        public final int f29629h;

        /* renamed from: i  reason: collision with root package name */
        public final p3.g[] f29630i;

        public g(m1 m1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, p3.g[] gVarArr) {
            this.f29622a = m1Var;
            this.f29623b = i10;
            this.f29624c = i11;
            this.f29625d = i12;
            this.f29626e = i13;
            this.f29627f = i14;
            this.f29628g = i15;
            this.f29629h = i16;
            this.f29630i = gVarArr;
        }

        private AudioTrack d(boolean z10, p3.e eVar, int i10) {
            int i11 = p0.f482a;
            if (i11 >= 29) {
                return f(z10, eVar, i10);
            }
            if (i11 >= 21) {
                return e(z10, eVar, i10);
            }
            return g(eVar, i10);
        }

        private AudioTrack e(boolean z10, p3.e eVar, int i10) {
            return new AudioTrack(i(eVar, z10), c0.M(this.f29626e, this.f29627f, this.f29628g), this.f29629h, 1, i10);
        }

        private AudioTrack f(boolean z10, p3.e eVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(i(eVar, z10)).setAudioFormat(c0.M(this.f29626e, this.f29627f, this.f29628g)).setTransferMode(1).setBufferSizeInBytes(this.f29629h).setSessionId(i10).setOffloadedPlayback(this.f29624c == 1).build();
        }

        private AudioTrack g(p3.e eVar, int i10) {
            int e02 = p0.e0(eVar.f29653c);
            if (i10 == 0) {
                return new AudioTrack(e02, this.f29626e, this.f29627f, this.f29628g, this.f29629h, 1);
            }
            return new AudioTrack(e02, this.f29626e, this.f29627f, this.f29628g, this.f29629h, 1, i10);
        }

        private static AudioAttributes i(p3.e eVar, boolean z10) {
            if (z10) {
                return j();
            }
            return eVar.b().f29657a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, p3.e eVar, int i10) throws v.b {
            try {
                AudioTrack d10 = d(z10, eVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new v.b(state, this.f29626e, this.f29627f, this.f29629h, this.f29622a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e8) {
                throw new v.b(0, this.f29626e, this.f29627f, this.f29629h, this.f29622a, l(), e8);
            }
        }

        public boolean b(g gVar) {
            return gVar.f29624c == this.f29624c && gVar.f29628g == this.f29628g && gVar.f29626e == this.f29626e && gVar.f29627f == this.f29627f && gVar.f29625d == this.f29625d;
        }

        public g c(int i10) {
            return new g(this.f29622a, this.f29623b, this.f29624c, this.f29625d, this.f29626e, this.f29627f, this.f29628g, i10, this.f29630i);
        }

        public long h(long j10) {
            return (j10 * 1000000) / this.f29626e;
        }

        public long k(long j10) {
            return (j10 * 1000000) / this.f29622a.f28199z;
        }

        public boolean l() {
            return this.f29624c == 1;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h implements p3.h {

        /* renamed from: a  reason: collision with root package name */
        private final p3.g[] f29631a;

        /* renamed from: b  reason: collision with root package name */
        private final l0 f29632b;

        /* renamed from: c  reason: collision with root package name */
        private final n0 f29633c;

        public h(p3.g... gVarArr) {
            this(gVarArr, new l0(), new n0());
        }

        @Override // p3.h
        public long a(long j10) {
            return this.f29633c.f(j10);
        }

        @Override // p3.h
        public p3.g[] b() {
            return this.f29631a;
        }

        @Override // p3.h
        public o2 c(o2 o2Var) {
            this.f29633c.h(o2Var.f28262a);
            this.f29633c.g(o2Var.f28263b);
            return o2Var;
        }

        @Override // p3.h
        public long d() {
            return this.f29632b.o();
        }

        @Override // p3.h
        public boolean e(boolean z10) {
            this.f29632b.u(z10);
            return z10;
        }

        public h(p3.g[] gVarArr, l0 l0Var, n0 n0Var) {
            p3.g[] gVarArr2 = new p3.g[gVarArr.length + 2];
            this.f29631a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f29632b = l0Var;
            this.f29633c = n0Var;
            gVarArr2[gVarArr.length] = l0Var;
            gVarArr2[gVarArr.length + 1] = n0Var;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i extends RuntimeException {
        private i(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        public final o2 f29634a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29635b;

        /* renamed from: c  reason: collision with root package name */
        public final long f29636c;

        /* renamed from: d  reason: collision with root package name */
        public final long f29637d;

        private j(o2 o2Var, boolean z10, long j10, long j11) {
            this.f29634a = o2Var;
            this.f29635b = z10;
            this.f29636c = j10;
            this.f29637d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class k<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f29638a;

        /* renamed from: b  reason: collision with root package name */
        private T f29639b;

        /* renamed from: c  reason: collision with root package name */
        private long f29640c;

        public k(long j10) {
            this.f29638a = j10;
        }

        public void a() {
            this.f29639b = null;
        }

        public void b(T t10) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f29639b == null) {
                this.f29639b = t10;
                this.f29640c = this.f29638a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f29640c) {
                T t11 = this.f29639b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f29639b;
                a();
                throw t12;
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class l implements x.a {
        private l() {
        }

        @Override // p3.x.a
        public void a(int i10, long j10) {
            if (c0.this.f29605s != null) {
                c0.this.f29605s.e(i10, j10, SystemClock.elapsedRealtime() - c0.this.f29586b0);
            }
        }

        @Override // p3.x.a
        public void b(long j10) {
            a5.t.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // p3.x.a
        public void c(long j10) {
            if (c0.this.f29605s != null) {
                c0.this.f29605s.c(j10);
            }
        }

        @Override // p3.x.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c0.this.T() + ", " + c0.this.U();
            if (!c0.f29579e0) {
                a5.t.i("DefaultAudioSink", str);
                return;
            }
            throw new i(str);
        }

        @Override // p3.x.a
        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c0.this.T() + ", " + c0.this.U();
            if (!c0.f29579e0) {
                a5.t.i("DefaultAudioSink", str);
                return;
            }
            throw new i(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class m {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f29642a = new Handler(Looper.myLooper());

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f29643b;

        /* compiled from: DefaultAudioSink.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0 f29645a;

            a(c0 c0Var) {
                this.f29645a = c0Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(c0.this.f29608v) && c0.this.f29605s != null && c0.this.V) {
                    c0.this.f29605s.g();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(c0.this.f29608v) && c0.this.f29605s != null && c0.this.V) {
                    c0.this.f29605s.g();
                }
            }
        }

        public m() {
            this.f29643b = new a(c0.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f29642a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new d0(handler), this.f29643b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f29643b);
            this.f29642a.removeCallbacksAndMessages(null);
        }
    }

    private void F(long j10) {
        o2 o2Var;
        if (m0()) {
            o2Var = this.f29585b.c(N());
        } else {
            o2Var = o2.f28260d;
        }
        o2 o2Var2 = o2Var;
        boolean e8 = m0() ? this.f29585b.e(S()) : false;
        this.f29596j.add(new j(o2Var2, e8, Math.max(0L, j10), this.f29607u.h(U())));
        l0();
        v.c cVar = this.f29605s;
        if (cVar != null) {
            cVar.a(e8);
        }
    }

    private long G(long j10) {
        while (!this.f29596j.isEmpty() && j10 >= this.f29596j.getFirst().f29637d) {
            this.f29611y = this.f29596j.remove();
        }
        j jVar = this.f29611y;
        long j11 = j10 - jVar.f29637d;
        if (jVar.f29634a.equals(o2.f28260d)) {
            return this.f29611y.f29636c + j11;
        }
        if (this.f29596j.isEmpty()) {
            return this.f29611y.f29636c + this.f29585b.a(j11);
        }
        j first = this.f29596j.getFirst();
        return first.f29636c - p0.Y(first.f29637d - j10, this.f29611y.f29634a.f28262a);
    }

    private long H(long j10) {
        return j10 + this.f29607u.h(this.f29585b.d());
    }

    private AudioTrack I(g gVar) throws v.b {
        try {
            AudioTrack a10 = gVar.a(this.f29584a0, this.f29609w, this.X);
            s.a aVar = this.f29603q;
            if (aVar != null) {
                aVar.C(Y(a10));
            }
            return a10;
        } catch (v.b e8) {
            v.c cVar = this.f29605s;
            if (cVar != null) {
                cVar.b(e8);
            }
            throw e8;
        }
    }

    private AudioTrack J() throws v.b {
        try {
            return I((g) a5.a.e(this.f29607u));
        } catch (v.b e8) {
            g gVar = this.f29607u;
            if (gVar.f29629h > 1000000) {
                g c10 = gVar.c(1000000);
                try {
                    AudioTrack I = I(c10);
                    this.f29607u = c10;
                    return I;
                } catch (v.b e10) {
                    e8.addSuppressed(e10);
                    a0();
                    throw e8;
                }
            }
            a0();
            throw e8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean K() throws p3.v.e {
        /*
            r9 = this;
            int r0 = r9.S
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.S = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.S
            p3.g[] r5 = r9.L
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.c0(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.S
            int r0 = r0 + r2
            r9.S = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            r9.p0(r0, r7)
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.S = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.c0.K():boolean");
    }

    private void L() {
        int i10 = 0;
        while (true) {
            p3.g[] gVarArr = this.L;
            if (i10 >= gVarArr.length) {
                return;
            }
            p3.g gVar = gVarArr[i10];
            gVar.flush();
            this.M[i10] = gVar.a();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat M(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private o2 N() {
        return Q().f29634a;
    }

    private static int O(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        a5.a.f(minBufferSize != -2);
        return minBufferSize;
    }

    private static int P(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return p3.b.d(byteBuffer);
            case 7:
            case 8:
                return f0.e(byteBuffer);
            case 9:
                int m7 = i0.m(p0.H(byteBuffer, byteBuffer.position()));
                if (m7 != -1) {
                    return m7;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return com.ironsource.mediationsdk.metadata.a.f18931n;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int a10 = p3.b.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return p3.b.h(byteBuffer, a10) * 16;
            case 15:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 16:
                return 1024;
            case 17:
                return p3.c.c(byteBuffer);
        }
    }

    private j Q() {
        j jVar = this.f29610x;
        if (jVar != null) {
            return jVar;
        }
        if (!this.f29596j.isEmpty()) {
            return this.f29596j.getLast();
        }
        return this.f29611y;
    }

    @SuppressLint({"InlinedApi"})
    private int R(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = p0.f482a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && p0.f485d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        g gVar = this.f29607u;
        if (gVar.f29624c == 0) {
            return this.C / gVar.f29623b;
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long U() {
        g gVar = this.f29607u;
        if (gVar.f29624c == 0) {
            return this.E / gVar.f29625d;
        }
        return this.F;
    }

    private boolean V() throws v.b {
        q1 q1Var;
        if (this.f29594h.d()) {
            AudioTrack J = J();
            this.f29608v = J;
            if (Y(J)) {
                d0(this.f29608v);
                if (this.f29598l != 3) {
                    AudioTrack audioTrack = this.f29608v;
                    m1 m1Var = this.f29607u.f29622a;
                    audioTrack.setOffloadDelayPadding(m1Var.B, m1Var.C);
                }
            }
            int i10 = p0.f482a;
            if (i10 >= 31 && (q1Var = this.f29604r) != null) {
                c.a(this.f29608v, q1Var);
            }
            this.X = this.f29608v.getAudioSessionId();
            x xVar = this.f29595i;
            AudioTrack audioTrack2 = this.f29608v;
            g gVar = this.f29607u;
            xVar.s(audioTrack2, gVar.f29624c == 2, gVar.f29628g, gVar.f29625d, gVar.f29629h);
            i0();
            int i11 = this.Y.f29836a;
            if (i11 != 0) {
                this.f29608v.attachAuxEffect(i11);
                this.f29608v.setAuxEffectSendLevel(this.Y.f29837b);
            }
            d dVar = this.Z;
            if (dVar != null && i10 >= 23) {
                b.a(this.f29608v, dVar);
            }
            this.I = true;
            return true;
        }
        return false;
    }

    private static boolean W(int i10) {
        return (p0.f482a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean X() {
        return this.f29608v != null;
    }

    private static boolean Y(AudioTrack audioTrack) {
        return p0.f482a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(AudioTrack audioTrack, a5.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.e();
            synchronized (f29580f0) {
                int i10 = f29582h0 - 1;
                f29582h0 = i10;
                if (i10 == 0) {
                    f29581g0.shutdown();
                    f29581g0 = null;
                }
            }
        } catch (Throwable th) {
            gVar.e();
            synchronized (f29580f0) {
                int i11 = f29582h0 - 1;
                f29582h0 = i11;
                if (i11 == 0) {
                    f29581g0.shutdown();
                    f29581g0 = null;
                }
                throw th;
            }
        }
    }

    private void a0() {
        if (this.f29607u.l()) {
            this.f29588c0 = true;
        }
    }

    private void b0() {
        if (this.U) {
            return;
        }
        this.U = true;
        this.f29595i.g(U());
        this.f29608v.stop();
        this.B = 0;
    }

    private void c0(long j10) throws v.e {
        ByteBuffer byteBuffer;
        int length = this.L.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.M[i10 - 1];
            } else {
                byteBuffer = this.N;
                if (byteBuffer == null) {
                    byteBuffer = p3.g.f29684a;
                }
            }
            if (i10 == length) {
                p0(byteBuffer, j10);
            } else {
                p3.g gVar = this.L[i10];
                if (i10 > this.S) {
                    gVar.d(byteBuffer);
                }
                ByteBuffer a10 = gVar.a();
                this.M[i10] = a10;
                if (a10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    private void d0(AudioTrack audioTrack) {
        if (this.f29599m == null) {
            this.f29599m = new m();
        }
        this.f29599m.a(audioTrack);
    }

    private static void e0(final AudioTrack audioTrack, final a5.g gVar) {
        gVar.c();
        synchronized (f29580f0) {
            if (f29581g0 == null) {
                f29581g0 = p0.D0("ExoPlayer:AudioTrackReleaseThread");
            }
            f29582h0++;
            f29581g0.execute(new Runnable() { // from class: p3.b0
                @Override // java.lang.Runnable
                public final void run() {
                    c0.Z(audioTrack, gVar);
                }
            });
        }
    }

    private void f0() {
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.f29590d0 = false;
        this.G = 0;
        this.f29611y = new j(N(), S(), 0L, 0L);
        this.J = 0L;
        this.f29610x = null;
        this.f29596j.clear();
        this.N = null;
        this.O = 0;
        this.P = null;
        this.U = false;
        this.T = false;
        this.S = -1;
        this.A = null;
        this.B = 0;
        this.f29591e.m();
        L();
    }

    private void g0(o2 o2Var, boolean z10) {
        j Q = Q();
        if (o2Var.equals(Q.f29634a) && z10 == Q.f29635b) {
            return;
        }
        j jVar = new j(o2Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (X()) {
            this.f29610x = jVar;
        } else {
            this.f29611y = jVar;
        }
    }

    private void h0(o2 o2Var) {
        if (X()) {
            try {
                this.f29608v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(o2Var.f28262a).setPitch(o2Var.f28263b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e8) {
                a5.t.j("DefaultAudioSink", "Failed to set playback params", e8);
            }
            o2Var = new o2(this.f29608v.getPlaybackParams().getSpeed(), this.f29608v.getPlaybackParams().getPitch());
            this.f29595i.t(o2Var.f28262a);
        }
        this.f29612z = o2Var;
    }

    private void i0() {
        if (X()) {
            if (p0.f482a >= 21) {
                j0(this.f29608v, this.K);
            } else {
                k0(this.f29608v, this.K);
            }
        }
    }

    private static void j0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void k0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void l0() {
        p3.g[] gVarArr = this.f29607u.f29630i;
        ArrayList arrayList = new ArrayList();
        for (p3.g gVar : gVarArr) {
            if (gVar.isActive()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.L = (p3.g[]) arrayList.toArray(new p3.g[size]);
        this.M = new ByteBuffer[size];
        L();
    }

    private boolean m0() {
        return (this.f29584a0 || !"audio/raw".equals(this.f29607u.f29622a.f28185l) || n0(this.f29607u.f29622a.A)) ? false : true;
    }

    private boolean n0(int i10) {
        return this.f29587c && p0.t0(i10);
    }

    private boolean o0(m1 m1Var, p3.e eVar) {
        int f10;
        int F;
        int R;
        if (p0.f482a < 29 || this.f29598l == 0 || (f10 = a5.x.f((String) a5.a.e(m1Var.f28185l), m1Var.f28182i)) == 0 || (F = p0.F(m1Var.f28198y)) == 0 || (R = R(M(m1Var.f28199z, F, f10), eVar.b().f29657a)) == 0) {
            return false;
        }
        if (R == 1) {
            return ((m1Var.B != 0 || m1Var.C != 0) && (this.f29598l == 1)) ? false : true;
        } else if (R == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private void p0(ByteBuffer byteBuffer, long j10) throws v.e {
        int q02;
        v.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                a5.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.P = byteBuffer;
                if (p0.f482a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.Q;
                    if (bArr == null || bArr.length < remaining) {
                        this.Q = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.Q, 0, remaining);
                    byteBuffer.position(position);
                    this.R = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (p0.f482a < 21) {
                int c10 = this.f29595i.c(this.E);
                if (c10 > 0) {
                    q02 = this.f29608v.write(this.Q, this.R, Math.min(remaining2, c10));
                    if (q02 > 0) {
                        this.R += q02;
                        byteBuffer.position(byteBuffer.position() + q02);
                    }
                } else {
                    q02 = 0;
                }
            } else if (this.f29584a0) {
                a5.a.f(j10 != -9223372036854775807L);
                q02 = r0(this.f29608v, byteBuffer, remaining2, j10);
            } else {
                q02 = q0(this.f29608v, byteBuffer, remaining2);
            }
            this.f29586b0 = SystemClock.elapsedRealtime();
            if (q02 < 0) {
                if (!W(q02) || this.F <= 0) {
                    r2 = false;
                }
                v.e eVar = new v.e(q02, this.f29607u.f29622a, r2);
                v.c cVar2 = this.f29605s;
                if (cVar2 != null) {
                    cVar2.b(eVar);
                }
                if (!eVar.f29797b) {
                    this.f29601o.b(eVar);
                    return;
                }
                throw eVar;
            }
            this.f29601o.a();
            if (Y(this.f29608v)) {
                if (this.F > 0) {
                    this.f29590d0 = false;
                }
                if (this.V && (cVar = this.f29605s) != null && q02 < remaining2 && !this.f29590d0) {
                    cVar.d();
                }
            }
            int i10 = this.f29607u.f29624c;
            if (i10 == 0) {
                this.E += q02;
            }
            if (q02 == remaining2) {
                if (i10 != 0) {
                    a5.a.f(byteBuffer == this.N);
                    this.F += this.G * this.O;
                }
                this.P = null;
            }
        }
    }

    private static int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (p0.f482a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.A == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A.putInt(1431633921);
        }
        if (this.B == 0) {
            this.A.putInt(4, i10);
            this.A.putLong(8, j10 * 1000);
            this.A.position(0);
            this.B = i10;
        }
        int remaining = this.A.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.A, remaining, 1);
            if (write < 0) {
                this.B = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int q02 = q0(audioTrack, byteBuffer, i10);
        if (q02 < 0) {
            this.B = 0;
            return q02;
        }
        this.B -= q02;
        return q02;
    }

    public boolean S() {
        return Q().f29635b;
    }

    @Override // p3.v
    public boolean a(m1 m1Var) {
        return n(m1Var) != 0;
    }

    @Override // p3.v
    public o2 b() {
        if (this.f29597k) {
            return this.f29612z;
        }
        return N();
    }

    @Override // p3.v
    public boolean c() {
        return !X() || (this.T && !g());
    }

    @Override // p3.v
    public void d(o2 o2Var) {
        o2 o2Var2 = new o2(p0.p(o2Var.f28262a, 0.1f, 8.0f), p0.p(o2Var.f28263b, 0.1f, 8.0f));
        if (this.f29597k && p0.f482a >= 23) {
            h0(o2Var2);
        } else {
            g0(o2Var2, S());
        }
    }

    @Override // p3.v
    public void e() {
        this.V = true;
        if (X()) {
            this.f29595i.u();
            this.f29608v.play();
        }
    }

    @Override // p3.v
    public void f(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.Z = dVar;
        AudioTrack audioTrack = this.f29608v;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // p3.v
    public void flush() {
        if (X()) {
            f0();
            if (this.f29595i.i()) {
                this.f29608v.pause();
            }
            if (Y(this.f29608v)) {
                ((m) a5.a.e(this.f29599m)).b(this.f29608v);
            }
            if (p0.f482a < 21 && !this.W) {
                this.X = 0;
            }
            g gVar = this.f29606t;
            if (gVar != null) {
                this.f29607u = gVar;
                this.f29606t = null;
            }
            this.f29595i.q();
            e0(this.f29608v, this.f29594h);
            this.f29608v = null;
        }
        this.f29601o.a();
        this.f29600n.a();
    }

    @Override // p3.v
    public boolean g() {
        return X() && this.f29595i.h(U());
    }

    @Override // p3.v
    public void h(int i10) {
        if (this.X != i10) {
            this.X = i10;
            this.W = i10 != 0;
            flush();
        }
    }

    @Override // p3.v
    public void i() {
        if (this.f29584a0) {
            this.f29584a0 = false;
            flush();
        }
    }

    @Override // p3.v
    public void j(m1 m1Var, int i10, int[] iArr) throws v.a {
        p3.g[] gVarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int intValue;
        int i15;
        int i16;
        int a10;
        p3.g[] gVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(m1Var.f28185l)) {
            a5.a.a(p0.u0(m1Var.A));
            i11 = p0.c0(m1Var.A, m1Var.f28198y);
            if (n0(m1Var.A)) {
                gVarArr2 = this.f29593g;
            } else {
                gVarArr2 = this.f29592f;
            }
            this.f29591e.n(m1Var.B, m1Var.C);
            if (p0.f482a < 21 && m1Var.f28198y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f29589d.l(iArr2);
            g.a aVar = new g.a(m1Var.f28199z, m1Var.f28198y, m1Var.A);
            for (p3.g gVar : gVarArr2) {
                try {
                    g.a b10 = gVar.b(aVar);
                    if (gVar.isActive()) {
                        aVar = b10;
                    }
                } catch (g.b e8) {
                    throw new v.a(e8, m1Var);
                }
            }
            int i18 = aVar.f29688c;
            int i19 = aVar.f29686a;
            int F = p0.F(aVar.f29687b);
            gVarArr = gVarArr2;
            i14 = 0;
            i12 = p0.c0(i18, aVar.f29687b);
            i15 = i18;
            i13 = i19;
            intValue = F;
        } else {
            p3.g[] gVarArr3 = new p3.g[0];
            int i20 = m1Var.f28199z;
            if (o0(m1Var, this.f29609w)) {
                gVarArr = gVarArr3;
                i11 = -1;
                i12 = -1;
                i13 = i20;
                i15 = a5.x.f((String) a5.a.e(m1Var.f28185l), m1Var.f28182i);
                intValue = p0.F(m1Var.f28198y);
                i14 = 1;
            } else {
                Pair<Integer, Integer> f10 = this.f29583a.f(m1Var);
                if (f10 != null) {
                    int intValue2 = ((Integer) f10.first).intValue();
                    gVarArr = gVarArr3;
                    i11 = -1;
                    i12 = -1;
                    i13 = i20;
                    i14 = 2;
                    intValue = ((Integer) f10.second).intValue();
                    i15 = intValue2;
                } else {
                    throw new v.a("Unable to configure passthrough for: " + m1Var, m1Var);
                }
            }
        }
        if (i15 == 0) {
            throw new v.a("Invalid output encoding (mode=" + i14 + ") for: " + m1Var, m1Var);
        } else if (intValue != 0) {
            if (i10 != 0) {
                a10 = i10;
                i16 = i15;
            } else {
                i16 = i15;
                a10 = this.f29602p.a(O(i13, intValue, i15), i15, i14, i12, i13, this.f29597k ? 8.0d : 1.0d);
            }
            this.f29588c0 = false;
            g gVar2 = new g(m1Var, i11, i14, i12, i13, intValue, i16, a10, gVarArr);
            if (X()) {
                this.f29606t = gVar2;
            } else {
                this.f29607u = gVar2;
            }
        } else {
            throw new v.a("Invalid output channel config (mode=" + i14 + ") for: " + m1Var, m1Var);
        }
    }

    @Override // p3.v
    public boolean k(ByteBuffer byteBuffer, long j10, int i10) throws v.b, v.e {
        ByteBuffer byteBuffer2 = this.N;
        a5.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f29606t != null) {
            if (!K()) {
                return false;
            }
            if (!this.f29606t.b(this.f29607u)) {
                b0();
                if (g()) {
                    return false;
                }
                flush();
            } else {
                this.f29607u = this.f29606t;
                this.f29606t = null;
                if (Y(this.f29608v) && this.f29598l != 3) {
                    if (this.f29608v.getPlayState() == 3) {
                        this.f29608v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f29608v;
                    m1 m1Var = this.f29607u.f29622a;
                    audioTrack.setOffloadDelayPadding(m1Var.B, m1Var.C);
                    this.f29590d0 = true;
                }
            }
            F(j10);
        }
        if (!X()) {
            try {
                if (!V()) {
                    return false;
                }
            } catch (v.b e8) {
                if (!e8.f29792b) {
                    this.f29600n.b(e8);
                    return false;
                }
                throw e8;
            }
        }
        this.f29600n.a();
        if (this.I) {
            this.J = Math.max(0L, j10);
            this.H = false;
            this.I = false;
            if (this.f29597k && p0.f482a >= 23) {
                h0(this.f29612z);
            }
            F(j10);
            if (this.V) {
                e();
            }
        }
        if (this.f29595i.k(U())) {
            if (this.N == null) {
                a5.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                g gVar = this.f29607u;
                if (gVar.f29624c != 0 && this.G == 0) {
                    int P = P(gVar.f29628g, byteBuffer);
                    this.G = P;
                    if (P == 0) {
                        return true;
                    }
                }
                if (this.f29610x != null) {
                    if (!K()) {
                        return false;
                    }
                    F(j10);
                    this.f29610x = null;
                }
                long k10 = this.J + this.f29607u.k(T() - this.f29591e.l());
                if (!this.H && Math.abs(k10 - j10) > 200000) {
                    this.f29605s.b(new v.d(j10, k10));
                    this.H = true;
                }
                if (this.H) {
                    if (!K()) {
                        return false;
                    }
                    long j11 = j10 - k10;
                    this.J += j11;
                    this.H = false;
                    F(j10);
                    v.c cVar = this.f29605s;
                    if (cVar != null && j11 != 0) {
                        cVar.f();
                    }
                }
                if (this.f29607u.f29624c == 0) {
                    this.C += byteBuffer.remaining();
                } else {
                    this.D += this.G * i10;
                }
                this.N = byteBuffer;
                this.O = i10;
            }
            c0(j10);
            if (!this.N.hasRemaining()) {
                this.N = null;
                this.O = 0;
                return true;
            } else if (this.f29595i.j(U())) {
                a5.t.i("DefaultAudioSink", "Resetting stalled audio track");
                flush();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // p3.v
    public void l() {
        if (p0.f482a < 25) {
            flush();
            return;
        }
        this.f29601o.a();
        this.f29600n.a();
        if (X()) {
            f0();
            if (this.f29595i.i()) {
                this.f29608v.pause();
            }
            this.f29608v.flush();
            this.f29595i.q();
            x xVar = this.f29595i;
            AudioTrack audioTrack = this.f29608v;
            g gVar = this.f29607u;
            xVar.s(audioTrack, gVar.f29624c == 2, gVar.f29628g, gVar.f29625d, gVar.f29629h);
            this.I = true;
        }
    }

    @Override // p3.v
    public void m(v.c cVar) {
        this.f29605s = cVar;
    }

    @Override // p3.v
    public int n(m1 m1Var) {
        if (!"audio/raw".equals(m1Var.f28185l)) {
            return ((this.f29588c0 || !o0(m1Var, this.f29609w)) && !this.f29583a.h(m1Var)) ? 0 : 2;
        } else if (!p0.u0(m1Var.A)) {
            a5.t.i("DefaultAudioSink", "Invalid PCM encoding: " + m1Var.A);
            return 0;
        } else {
            int i10 = m1Var.A;
            return (i10 == 2 || (this.f29587c && i10 == 4)) ? 2 : 1;
        }
    }

    @Override // p3.v
    public void o() throws v.e {
        if (!this.T && X() && K()) {
            b0();
            this.T = true;
        }
    }

    @Override // p3.v
    public long p(boolean z10) {
        if (!X() || this.I) {
            return Long.MIN_VALUE;
        }
        return H(G(Math.min(this.f29595i.d(z10), this.f29607u.h(U()))));
    }

    @Override // p3.v
    public void pause() {
        this.V = false;
        if (X() && this.f29595i.p()) {
            this.f29608v.pause();
        }
    }

    @Override // p3.v
    public /* synthetic */ void q(long j10) {
        u.a(this, j10);
    }

    @Override // p3.v
    public void r(p3.e eVar) {
        if (this.f29609w.equals(eVar)) {
            return;
        }
        this.f29609w = eVar;
        if (this.f29584a0) {
            return;
        }
        flush();
    }

    @Override // p3.v
    public void reset() {
        flush();
        for (p3.g gVar : this.f29592f) {
            gVar.reset();
        }
        for (p3.g gVar2 : this.f29593g) {
            gVar2.reset();
        }
        this.V = false;
        this.f29588c0 = false;
    }

    @Override // p3.v
    public void s() {
        this.H = true;
    }

    @Override // p3.v
    public void setVolume(float f10) {
        if (this.K != f10) {
            this.K = f10;
            i0();
        }
    }

    @Override // p3.v
    public void t() {
        a5.a.f(p0.f482a >= 21);
        a5.a.f(this.W);
        if (this.f29584a0) {
            return;
        }
        this.f29584a0 = true;
        flush();
    }

    @Override // p3.v
    public void u(q1 q1Var) {
        this.f29604r = q1Var;
    }

    @Override // p3.v
    public void v(boolean z10) {
        g0(N(), z10);
    }

    @Override // p3.v
    public void w(y yVar) {
        if (this.Y.equals(yVar)) {
            return;
        }
        int i10 = yVar.f29836a;
        float f10 = yVar.f29837b;
        AudioTrack audioTrack = this.f29608v;
        if (audioTrack != null) {
            if (this.Y.f29836a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f29608v.setAuxEffectSendLevel(f10);
            }
        }
        this.Y = yVar;
    }

    private c0(f fVar) {
        this.f29583a = fVar.f29615a;
        p3.h hVar = fVar.f29616b;
        this.f29585b = hVar;
        int i10 = p0.f482a;
        this.f29587c = i10 >= 21 && fVar.f29617c;
        this.f29597k = i10 >= 23 && fVar.f29618d;
        this.f29598l = i10 >= 29 ? fVar.f29619e : 0;
        this.f29602p = fVar.f29620f;
        a5.g gVar = new a5.g(a5.d.f412a);
        this.f29594h = gVar;
        gVar.e();
        this.f29595i = new x(new l());
        a0 a0Var = new a0();
        this.f29589d = a0Var;
        o0 o0Var = new o0();
        this.f29591e = o0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new k0(), a0Var, o0Var);
        Collections.addAll(arrayList, hVar.b());
        this.f29592f = (p3.g[]) arrayList.toArray(new p3.g[0]);
        this.f29593g = new p3.g[]{new g0()};
        this.K = 1.0f;
        this.f29609w = p3.e.f29649g;
        this.X = 0;
        this.Y = new y(0, 0.0f);
        o2 o2Var = o2.f28260d;
        this.f29611y = new j(o2Var, false, 0L, 0L);
        this.f29612z = o2Var;
        this.S = -1;
        this.L = new p3.g[0];
        this.M = new ByteBuffer[0];
        this.f29596j = new ArrayDeque<>();
        this.f29600n = new k<>(100L);
        this.f29601o = new k<>(100L);
        this.f29603q = fVar.f29621g;
    }
}
