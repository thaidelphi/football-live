package p3;

import a5.p0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.List;
import n3.m1;
import n3.n1;
import n3.o2;
import n3.y2;
import n3.z2;
import p3.t;
import p3.v;
import x3.l;
import x3.v;
/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h0 extends x3.o implements a5.v {
    private final Context P0;
    private final t.a Q0;
    private final v R0;
    private int S0;
    private boolean T0;
    private m1 U0;
    private long V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    private y2.a f29691a1;

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {
        public static void a(v vVar, Object obj) {
            vVar.f((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class c implements v.c {
        private c() {
        }

        @Override // p3.v.c
        public void a(boolean z10) {
            h0.this.Q0.C(z10);
        }

        @Override // p3.v.c
        public void b(Exception exc) {
            a5.t.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            h0.this.Q0.l(exc);
        }

        @Override // p3.v.c
        public void c(long j10) {
            h0.this.Q0.B(j10);
        }

        @Override // p3.v.c
        public void d() {
            if (h0.this.f29691a1 != null) {
                h0.this.f29691a1.a();
            }
        }

        @Override // p3.v.c
        public void e(int i10, long j10, long j11) {
            h0.this.Q0.D(i10, j10, j11);
        }

        @Override // p3.v.c
        public void f() {
            h0.this.x1();
        }

        @Override // p3.v.c
        public void g() {
            if (h0.this.f29691a1 != null) {
                h0.this.f29691a1.b();
            }
        }
    }

    public h0(Context context, l.b bVar, x3.q qVar, boolean z10, Handler handler, t tVar, v vVar) {
        super(1, bVar, qVar, z10, 44100.0f);
        this.P0 = context.getApplicationContext();
        this.R0 = vVar;
        this.Q0 = new t.a(handler, tVar);
        vVar.m(new c());
    }

    private static boolean r1(String str) {
        if (p0.f482a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(p0.f484c)) {
            String str2 = p0.f483b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean s1() {
        if (p0.f482a == 23) {
            String str = p0.f485d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int t1(x3.n nVar, m1 m1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f32489a) || (i10 = p0.f482a) >= 24 || (i10 == 23 && p0.x0(this.P0))) {
            return m1Var.f28186m;
        }
        return -1;
    }

    private static List<x3.n> v1(x3.q qVar, m1 m1Var, boolean z10, v vVar) throws v.c {
        x3.n v10;
        String str = m1Var.f28185l;
        if (str == null) {
            return y5.q.p();
        }
        if (vVar.a(m1Var) && (v10 = x3.v.v()) != null) {
            return y5.q.q(v10);
        }
        List<x3.n> a10 = qVar.a(str, z10, false);
        String m7 = x3.v.m(m1Var);
        if (m7 == null) {
            return y5.q.l(a10);
        }
        return y5.q.j().g(a10).g(qVar.a(m7, z10, false)).h();
    }

    private void y1() {
        long p10 = this.R0.p(c());
        if (p10 != Long.MIN_VALUE) {
            if (!this.X0) {
                p10 = Math.max(this.V0, p10);
            }
            this.V0 = p10;
            this.X0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void F() {
        this.Y0 = true;
        try {
            this.R0.flush();
            try {
                super.F();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.F();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void G(boolean z10, boolean z11) throws n3.q {
        super.G(z10, z11);
        this.Q0.p(this.K0);
        if (z().f27897a) {
            this.R0.t();
        } else {
            this.R0.i();
        }
        this.R0.u(C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void H(long j10, boolean z10) throws n3.q {
        super.H(j10, z10);
        if (this.Z0) {
            this.R0.l();
        } else {
            this.R0.flush();
        }
        this.V0 = j10;
        this.W0 = true;
        this.X0 = true;
    }

    @Override // x3.o
    protected void H0(Exception exc) {
        a5.t.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.Q0.k(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void I() {
        try {
            super.I();
        } finally {
            if (this.Y0) {
                this.Y0 = false;
                this.R0.reset();
            }
        }
    }

    @Override // x3.o
    protected void I0(String str, l.a aVar, long j10, long j11) {
        this.Q0.m(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void J() {
        super.J();
        this.R0.e();
    }

    @Override // x3.o
    protected void J0(String str) {
        this.Q0.n(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void K() {
        y1();
        this.R0.pause();
        super.K();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o
    public q3.i K0(n1 n1Var) throws n3.q {
        q3.i K0 = super.K0(n1Var);
        this.Q0.q(n1Var.f28250b, K0);
        return K0;
    }

    @Override // x3.o
    protected void L0(m1 m1Var, MediaFormat mediaFormat) throws n3.q {
        int a02;
        int i10;
        m1 m1Var2 = this.U0;
        int[] iArr = null;
        if (m1Var2 != null) {
            m1Var = m1Var2;
        } else if (n0() != null) {
            if ("audio/raw".equals(m1Var.f28185l)) {
                a02 = m1Var.A;
            } else if (p0.f482a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                a02 = mediaFormat.getInteger("pcm-encoding");
            } else {
                a02 = mediaFormat.containsKey("v-bits-per-sample") ? p0.a0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            m1 E = new m1.b().e0("audio/raw").Y(a02).N(m1Var.B).O(m1Var.C).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.T0 && E.f28198y == 6 && (i10 = m1Var.f28198y) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < m1Var.f28198y; i11++) {
                    iArr[i11] = i11;
                }
            }
            m1Var = E;
        }
        try {
            this.R0.j(m1Var, 0, iArr);
        } catch (v.a e8) {
            throw x(e8, e8.f29790a, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // x3.o
    protected void M0(long j10) {
        this.R0.q(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o
    public void O0() {
        super.O0();
        this.R0.s();
    }

    @Override // x3.o
    protected void P0(q3.g gVar) {
        if (!this.W0 || gVar.k()) {
            return;
        }
        if (Math.abs(gVar.f30093e - this.V0) > 500000) {
            this.V0 = gVar.f30093e;
        }
        this.W0 = false;
    }

    @Override // x3.o
    protected q3.i R(x3.n nVar, m1 m1Var, m1 m1Var2) {
        q3.i e8 = nVar.e(m1Var, m1Var2);
        int i10 = e8.f30105e;
        if (t1(nVar, m1Var2) > this.S0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new q3.i(nVar.f32489a, m1Var, m1Var2, i11 != 0 ? 0 : e8.f30104d, i11);
    }

    @Override // x3.o
    protected boolean R0(long j10, long j11, x3.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m1 m1Var) throws n3.q {
        a5.a.e(byteBuffer);
        if (this.U0 != null && (i11 & 2) != 0) {
            ((x3.l) a5.a.e(lVar)).l(i10, false);
            return true;
        } else if (z10) {
            if (lVar != null) {
                lVar.l(i10, false);
            }
            this.K0.f30083f += i12;
            this.R0.s();
            return true;
        } else {
            try {
                if (this.R0.k(byteBuffer, j12, i12)) {
                    if (lVar != null) {
                        lVar.l(i10, false);
                    }
                    this.K0.f30082e += i12;
                    return true;
                }
                return false;
            } catch (v.b e8) {
                throw y(e8, e8.f29793c, e8.f29792b, IronSourceConstants.errorCode_biddingDataException);
            } catch (v.e e10) {
                throw y(e10, m1Var, e10.f29797b, IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    @Override // x3.o
    protected void W0() throws n3.q {
        try {
            this.R0.o();
        } catch (v.e e8) {
            throw y(e8, e8.f29798c, e8.f29797b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // a5.v
    public o2 b() {
        return this.R0.b();
    }

    @Override // x3.o, n3.y2
    public boolean c() {
        return super.c() && this.R0.c();
    }

    @Override // a5.v
    public void d(o2 o2Var) {
        this.R0.d(o2Var);
    }

    @Override // n3.y2, n3.a3
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // x3.o, n3.y2
    public boolean isReady() {
        return this.R0.g() || super.isReady();
    }

    @Override // n3.f, n3.t2.b
    public void j(int i10, Object obj) throws n3.q {
        if (i10 == 2) {
            this.R0.setVolume(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.R0.r((e) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.R0.v(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.R0.h(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f29691a1 = (y2.a) obj;
                    return;
                case 12:
                    if (p0.f482a >= 23) {
                        b.a(this.R0, obj);
                        return;
                    }
                    return;
                default:
                    super.j(i10, obj);
                    return;
            }
        } else {
            this.R0.w((y) obj);
        }
    }

    @Override // x3.o
    protected boolean j1(m1 m1Var) {
        return this.R0.a(m1Var);
    }

    @Override // x3.o
    protected int k1(x3.q qVar, m1 m1Var) throws v.c {
        boolean z10;
        if (!a5.x.o(m1Var.f28185l)) {
            return z2.a(0);
        }
        int i10 = p0.f482a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = m1Var.E != 0;
        boolean l12 = x3.o.l1(m1Var);
        int i11 = 8;
        if (l12 && this.R0.a(m1Var) && (!z12 || x3.v.v() != null)) {
            return z2.b(4, 8, i10);
        }
        if ("audio/raw".equals(m1Var.f28185l) && !this.R0.a(m1Var)) {
            return z2.a(1);
        }
        if (!this.R0.a(p0.b0(2, m1Var.f28198y, m1Var.f28199z))) {
            return z2.a(1);
        }
        List<x3.n> v12 = v1(qVar, m1Var, false, this.R0);
        if (v12.isEmpty()) {
            return z2.a(1);
        }
        if (!l12) {
            return z2.a(2);
        }
        x3.n nVar = v12.get(0);
        boolean m7 = nVar.m(m1Var);
        if (!m7) {
            for (int i12 = 1; i12 < v12.size(); i12++) {
                x3.n nVar2 = v12.get(i12);
                if (nVar2.m(m1Var)) {
                    z10 = false;
                    nVar = nVar2;
                    break;
                }
            }
        }
        z10 = true;
        z11 = m7;
        int i13 = z11 ? 4 : 3;
        if (z11 && nVar.p(m1Var)) {
            i11 = 16;
        }
        return z2.c(i13, i11, i10, nVar.f32496h ? 64 : 0, z10 ? 128 : 0);
    }

    @Override // a5.v
    public long o() {
        if (getState() == 2) {
            y1();
        }
        return this.V0;
    }

    @Override // x3.o
    protected float q0(float f10, m1 m1Var, m1[] m1VarArr) {
        int i10 = -1;
        for (m1 m1Var2 : m1VarArr) {
            int i11 = m1Var2.f28199z;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // x3.o
    protected List<x3.n> s0(x3.q qVar, m1 m1Var, boolean z10) throws v.c {
        return x3.v.u(v1(qVar, m1Var, z10, this.R0), m1Var);
    }

    @Override // x3.o
    protected l.a u0(x3.n nVar, m1 m1Var, MediaCrypto mediaCrypto, float f10) {
        this.S0 = u1(nVar, m1Var, D());
        this.T0 = r1(nVar.f32489a);
        MediaFormat w12 = w1(m1Var, nVar.f32491c, this.S0, f10);
        this.U0 = "audio/raw".equals(nVar.f32490b) && !"audio/raw".equals(m1Var.f28185l) ? m1Var : null;
        return l.a.a(nVar, w12, m1Var, mediaCrypto);
    }

    protected int u1(x3.n nVar, m1 m1Var, m1[] m1VarArr) {
        int t12 = t1(nVar, m1Var);
        if (m1VarArr.length == 1) {
            return t12;
        }
        for (m1 m1Var2 : m1VarArr) {
            if (nVar.e(m1Var, m1Var2).f30104d != 0) {
                t12 = Math.max(t12, t1(nVar, m1Var2));
            }
        }
        return t12;
    }

    @Override // n3.f, n3.y2
    public a5.v w() {
        return this;
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat w1(m1 m1Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", m1Var.f28198y);
        mediaFormat.setInteger("sample-rate", m1Var.f28199z);
        a5.w.e(mediaFormat, m1Var.f28187n);
        a5.w.d(mediaFormat, "max-input-size", i10);
        int i11 = p0.f482a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !s1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(m1Var.f28185l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.R0.n(p0.b0(4, m1Var.f28198y, m1Var.f28199z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    protected void x1() {
        this.X0 = true;
    }
}
