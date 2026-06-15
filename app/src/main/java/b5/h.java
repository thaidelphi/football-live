package b5;

import a5.m0;
import a5.p0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import b5.y;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.ByteBuffer;
import java.util.List;
import n3.m1;
import n3.n1;
import n3.z2;
import x3.l;
import x3.v;
/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends x3.o {
    private static boolean A1;

    /* renamed from: y1  reason: collision with root package name */
    private static final int[] f5134y1 = {1920, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: z1  reason: collision with root package name */
    private static boolean f5135z1;
    private final Context P0;
    private final m Q0;
    private final y.a R0;
    private final long S0;
    private final int T0;
    private final boolean U0;
    private b V0;
    private boolean W0;
    private boolean X0;
    private Surface Y0;
    private PlaceholderSurface Z0;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f5136a1;

    /* renamed from: b1  reason: collision with root package name */
    private int f5137b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f5138c1;

    /* renamed from: d1  reason: collision with root package name */
    private boolean f5139d1;

    /* renamed from: e1  reason: collision with root package name */
    private boolean f5140e1;

    /* renamed from: f1  reason: collision with root package name */
    private long f5141f1;

    /* renamed from: g1  reason: collision with root package name */
    private long f5142g1;

    /* renamed from: h1  reason: collision with root package name */
    private long f5143h1;

    /* renamed from: i1  reason: collision with root package name */
    private int f5144i1;

    /* renamed from: j1  reason: collision with root package name */
    private int f5145j1;

    /* renamed from: k1  reason: collision with root package name */
    private int f5146k1;

    /* renamed from: l1  reason: collision with root package name */
    private long f5147l1;

    /* renamed from: m1  reason: collision with root package name */
    private long f5148m1;

    /* renamed from: n1  reason: collision with root package name */
    private long f5149n1;

    /* renamed from: o1  reason: collision with root package name */
    private int f5150o1;

    /* renamed from: p1  reason: collision with root package name */
    private int f5151p1;

    /* renamed from: q1  reason: collision with root package name */
    private int f5152q1;

    /* renamed from: r1  reason: collision with root package name */
    private int f5153r1;

    /* renamed from: s1  reason: collision with root package name */
    private float f5154s1;

    /* renamed from: t1  reason: collision with root package name */
    private a0 f5155t1;

    /* renamed from: u1  reason: collision with root package name */
    private boolean f5156u1;

    /* renamed from: v1  reason: collision with root package name */
    private int f5157v1;

    /* renamed from: w1  reason: collision with root package name */
    c f5158w1;

    /* renamed from: x1  reason: collision with root package name */
    private k f5159x1;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(b9.h.f16644d);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5160a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5161b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5162c;

        public b(int i10, int i11, int i12) {
            this.f5160a = i10;
            this.f5161b = i11;
            this.f5162c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class c implements l.c, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f5163a;

        public c(x3.l lVar) {
            Handler w10 = p0.w(this);
            this.f5163a = w10;
            lVar.f(this, w10);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this != hVar.f5158w1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                hVar.Q1();
                return;
            }
            try {
                hVar.P1(j10);
            } catch (n3.q e8) {
                h.this.e1(e8);
            }
        }

        @Override // x3.l.c
        public void a(x3.l lVar, long j10, long j11) {
            if (p0.f482a < 30) {
                this.f5163a.sendMessageAtFrontOfQueue(Message.obtain(this.f5163a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(p0.W0(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, l.b bVar, x3.q qVar, long j10, boolean z10, Handler handler, y yVar, int i10) {
        this(context, bVar, qVar, j10, z10, handler, yVar, i10, 30.0f);
    }

    private static List<x3.n> B1(Context context, x3.q qVar, m1 m1Var, boolean z10, boolean z11) throws v.c {
        String str = m1Var.f28185l;
        if (str == null) {
            return y5.q.p();
        }
        List<x3.n> a10 = qVar.a(str, z10, z11);
        String m7 = x3.v.m(m1Var);
        if (m7 == null) {
            return y5.q.l(a10);
        }
        List<x3.n> a11 = qVar.a(m7, z10, z11);
        if (p0.f482a >= 26 && "video/dolby-vision".equals(m1Var.f28185l) && !a11.isEmpty() && !a.a(context)) {
            return y5.q.l(a11);
        }
        return y5.q.j().g(a10).g(a11).h();
    }

    protected static int C1(x3.n nVar, m1 m1Var) {
        if (m1Var.f28186m != -1) {
            int size = m1Var.f28187n.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += m1Var.f28187n.get(i11).length;
            }
            return m1Var.f28186m + i10;
        }
        return y1(nVar, m1Var);
    }

    private static int D1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private static boolean F1(long j10) {
        return j10 < -30000;
    }

    private static boolean G1(long j10) {
        return j10 < -500000;
    }

    private void I1() {
        if (this.f5144i1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R0.n(this.f5144i1, elapsedRealtime - this.f5143h1);
            this.f5144i1 = 0;
            this.f5143h1 = elapsedRealtime;
        }
    }

    private void K1() {
        int i10 = this.f5150o1;
        if (i10 != 0) {
            this.R0.B(this.f5149n1, i10);
            this.f5149n1 = 0L;
            this.f5150o1 = 0;
        }
    }

    private void L1() {
        int i10 = this.f5151p1;
        if (i10 == -1 && this.f5152q1 == -1) {
            return;
        }
        a0 a0Var = this.f5155t1;
        if (a0Var != null && a0Var.f5097a == i10 && a0Var.f5098b == this.f5152q1 && a0Var.f5099c == this.f5153r1 && a0Var.f5100d == this.f5154s1) {
            return;
        }
        a0 a0Var2 = new a0(this.f5151p1, this.f5152q1, this.f5153r1, this.f5154s1);
        this.f5155t1 = a0Var2;
        this.R0.D(a0Var2);
    }

    private void M1() {
        if (this.f5136a1) {
            this.R0.A(this.Y0);
        }
    }

    private void N1() {
        a0 a0Var = this.f5155t1;
        if (a0Var != null) {
            this.R0.D(a0Var);
        }
    }

    private void O1(long j10, long j11, m1 m1Var) {
        k kVar = this.f5159x1;
        if (kVar != null) {
            kVar.a(j10, j11, m1Var, r0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1() {
        d1();
    }

    private void R1() {
        Surface surface = this.Y0;
        PlaceholderSurface placeholderSurface = this.Z0;
        if (surface == placeholderSurface) {
            this.Y0 = null;
        }
        placeholderSurface.release();
        this.Z0 = null;
    }

    private static void U1(x3.l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.h(bundle);
    }

    private void V1() {
        this.f5142g1 = this.S0 > 0 ? SystemClock.elapsedRealtime() + this.S0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [b5.h, x3.o, n3.f] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void W1(Object obj) throws n3.q {
        PlaceholderSurface placeholderSurface = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface2 = this.Z0;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                x3.n o02 = o0();
                if (o02 != null && b2(o02)) {
                    placeholderSurface = PlaceholderSurface.c(this.P0, o02.f32495g);
                    this.Z0 = placeholderSurface;
                }
            }
        }
        if (this.Y0 != placeholderSurface) {
            this.Y0 = placeholderSurface;
            this.Q0.m(placeholderSurface);
            this.f5136a1 = false;
            int state = getState();
            x3.l n02 = n0();
            if (n02 != null) {
                if (p0.f482a >= 23 && placeholderSurface != null && !this.W0) {
                    X1(n02, placeholderSurface);
                } else {
                    V0();
                    F0();
                }
            }
            if (placeholderSurface != null && placeholderSurface != this.Z0) {
                N1();
                r1();
                if (state == 2) {
                    V1();
                    return;
                }
                return;
            }
            s1();
            r1();
        } else if (placeholderSurface == null || placeholderSurface == this.Z0) {
        } else {
            N1();
            M1();
        }
    }

    private boolean b2(x3.n nVar) {
        return p0.f482a >= 23 && !this.f5156u1 && !t1(nVar.f32489a) && (!nVar.f32495g || PlaceholderSurface.b(this.P0));
    }

    private void r1() {
        x3.l n02;
        this.f5138c1 = false;
        if (p0.f482a < 23 || !this.f5156u1 || (n02 = n0()) == null) {
            return;
        }
        this.f5158w1 = new c(n02);
    }

    private void s1() {
        this.f5155t1 = null;
    }

    private static void u1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean v1() {
        return "NVIDIA".equals(p0.f484c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0722, code lost:
        if (r0.equals("ELUGA_Ray_X") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean x1() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.h.x1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int y1(x3.n r9, n3.m1 r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.h.y1(x3.n, n3.m1):int");
    }

    private static Point z1(x3.n nVar, m1 m1Var) {
        int[] iArr;
        int i10 = m1Var.f28191r;
        int i11 = m1Var.f28190q;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f5134y1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (p0.f482a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point b10 = nVar.b(i15, i13);
                if (nVar.u(b10.x, b10.y, m1Var.f28192s)) {
                    return b10;
                }
            } else {
                try {
                    int l10 = p0.l(i13, 16) * 16;
                    int l11 = p0.l(i14, 16) * 16;
                    if (l10 * l11 <= x3.v.N()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    protected b A1(x3.n nVar, m1 m1Var, m1[] m1VarArr) {
        int y12;
        int i10 = m1Var.f28190q;
        int i11 = m1Var.f28191r;
        int C1 = C1(nVar, m1Var);
        if (m1VarArr.length == 1) {
            if (C1 != -1 && (y12 = y1(nVar, m1Var)) != -1) {
                C1 = Math.min((int) (C1 * 1.5f), y12);
            }
            return new b(i10, i11, C1);
        }
        int length = m1VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            m1 m1Var2 = m1VarArr[i12];
            if (m1Var.f28197x != null && m1Var2.f28197x == null) {
                m1Var2 = m1Var2.b().J(m1Var.f28197x).E();
            }
            if (nVar.e(m1Var, m1Var2).f30104d != 0) {
                int i13 = m1Var2.f28190q;
                z10 |= i13 == -1 || m1Var2.f28191r == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, m1Var2.f28191r);
                C1 = Math.max(C1, C1(nVar, m1Var2));
            }
        }
        if (z10) {
            a5.t.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point z12 = z1(nVar, m1Var);
            if (z12 != null) {
                i10 = Math.max(i10, z12.x);
                i11 = Math.max(i11, z12.y);
                C1 = Math.max(C1, y1(nVar, m1Var.b().j0(i10).Q(i11).E()));
                a5.t.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new b(i10, i11, C1);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat E1(m1 m1Var, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", m1Var.f28190q);
        mediaFormat.setInteger("height", m1Var.f28191r);
        a5.w.e(mediaFormat, m1Var.f28187n);
        a5.w.c(mediaFormat, "frame-rate", m1Var.f28192s);
        a5.w.d(mediaFormat, "rotation-degrees", m1Var.f28193t);
        a5.w.b(mediaFormat, m1Var.f28197x);
        if ("video/dolby-vision".equals(m1Var.f28185l) && (q10 = x3.v.q(m1Var)) != null) {
            a5.w.d(mediaFormat, "profile", ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f5160a);
        mediaFormat.setInteger("max-height", bVar.f5161b);
        a5.w.d(mediaFormat, "max-input-size", bVar.f5162c);
        if (p0.f482a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            u1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void F() {
        s1();
        r1();
        this.f5136a1 = false;
        this.f5158w1 = null;
        try {
            super.F();
        } finally {
            this.R0.m(this.K0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void G(boolean z10, boolean z11) throws n3.q {
        super.G(z10, z11);
        boolean z12 = z().f27897a;
        a5.a.f((z12 && this.f5157v1 == 0) ? false : true);
        if (this.f5156u1 != z12) {
            this.f5156u1 = z12;
            V0();
        }
        this.R0.o(this.K0);
        this.f5139d1 = z11;
        this.f5140e1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void H(long j10, boolean z10) throws n3.q {
        super.H(j10, z10);
        r1();
        this.Q0.j();
        this.f5147l1 = -9223372036854775807L;
        this.f5141f1 = -9223372036854775807L;
        this.f5145j1 = 0;
        if (z10) {
            V1();
        } else {
            this.f5142g1 = -9223372036854775807L;
        }
    }

    @Override // x3.o
    protected void H0(Exception exc) {
        a5.t.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.R0.C(exc);
    }

    protected boolean H1(long j10, boolean z10) throws n3.q {
        int O = O(j10);
        if (O == 0) {
            return false;
        }
        if (z10) {
            q3.e eVar = this.K0;
            eVar.f30081d += O;
            eVar.f30083f += this.f5146k1;
        } else {
            this.K0.f30087j++;
            d2(O, this.f5146k1);
        }
        k0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    @TargetApi(17)
    public void I() {
        try {
            super.I();
        } finally {
            if (this.Z0 != null) {
                R1();
            }
        }
    }

    @Override // x3.o
    protected void I0(String str, l.a aVar, long j10, long j11) {
        this.R0.k(str, j10, j11);
        this.W0 = t1(str);
        this.X0 = ((x3.n) a5.a.e(o0())).n();
        if (p0.f482a < 23 || !this.f5156u1) {
            return;
        }
        this.f5158w1 = new c((x3.l) a5.a.e(n0()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void J() {
        super.J();
        this.f5144i1 = 0;
        this.f5143h1 = SystemClock.elapsedRealtime();
        this.f5148m1 = SystemClock.elapsedRealtime() * 1000;
        this.f5149n1 = 0L;
        this.f5150o1 = 0;
        this.Q0.k();
    }

    @Override // x3.o
    protected void J0(String str) {
        this.R0.l(str);
    }

    void J1() {
        this.f5140e1 = true;
        if (this.f5138c1) {
            return;
        }
        this.f5138c1 = true;
        this.R0.A(this.Y0);
        this.f5136a1 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o, n3.f
    public void K() {
        this.f5142g1 = -9223372036854775807L;
        I1();
        K1();
        this.Q0.l();
        super.K();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o
    public q3.i K0(n1 n1Var) throws n3.q {
        q3.i K0 = super.K0(n1Var);
        this.R0.p(n1Var.f28250b, K0);
        return K0;
    }

    @Override // x3.o
    protected void L0(m1 m1Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        x3.l n02 = n0();
        if (n02 != null) {
            n02.b(this.f5137b1);
        }
        if (this.f5156u1) {
            this.f5151p1 = m1Var.f28190q;
            this.f5152q1 = m1Var.f28191r;
        } else {
            a5.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f5151p1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f5152q1 = integer2;
        }
        float f10 = m1Var.f28194u;
        this.f5154s1 = f10;
        if (p0.f482a >= 21) {
            int i10 = m1Var.f28193t;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f5151p1;
                this.f5151p1 = this.f5152q1;
                this.f5152q1 = i11;
                this.f5154s1 = 1.0f / f10;
            }
        } else {
            this.f5153r1 = m1Var.f28193t;
        }
        this.Q0.g(m1Var.f28192s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o
    public void N0(long j10) {
        super.N0(j10);
        if (this.f5156u1) {
            return;
        }
        this.f5146k1--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o
    public void O0() {
        super.O0();
        r1();
    }

    @Override // x3.o
    protected void P0(q3.g gVar) throws n3.q {
        boolean z10 = this.f5156u1;
        if (!z10) {
            this.f5146k1++;
        }
        if (p0.f482a >= 23 || !z10) {
            return;
        }
        P1(gVar.f30093e);
    }

    protected void P1(long j10) throws n3.q {
        o1(j10);
        L1();
        this.K0.f30082e++;
        J1();
        N0(j10);
    }

    @Override // x3.o
    protected q3.i R(x3.n nVar, m1 m1Var, m1 m1Var2) {
        q3.i e8 = nVar.e(m1Var, m1Var2);
        int i10 = e8.f30105e;
        int i11 = m1Var2.f28190q;
        b bVar = this.V0;
        if (i11 > bVar.f5160a || m1Var2.f28191r > bVar.f5161b) {
            i10 |= 256;
        }
        if (C1(nVar, m1Var2) > this.V0.f5162c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new q3.i(nVar.f32489a, m1Var, m1Var2, i12 != 0 ? 0 : e8.f30104d, i12);
    }

    @Override // x3.o
    protected boolean R0(long j10, long j11, x3.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m1 m1Var) throws n3.q {
        boolean z12;
        long j13;
        a5.a.e(lVar);
        if (this.f5141f1 == -9223372036854775807L) {
            this.f5141f1 = j10;
        }
        if (j12 != this.f5147l1) {
            this.Q0.h(j12);
            this.f5147l1 = j12;
        }
        long v02 = v0();
        long j14 = j12 - v02;
        if (z10 && !z11) {
            c2(lVar, i10, j14);
            return true;
        }
        double w02 = w0();
        boolean z13 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / w02);
        if (z13) {
            j15 -= elapsedRealtime - j11;
        }
        if (this.Y0 == this.Z0) {
            if (F1(j15)) {
                c2(lVar, i10, j14);
                e2(j15);
                return true;
            }
            return false;
        }
        long j16 = elapsedRealtime - this.f5148m1;
        if (this.f5140e1 ? this.f5138c1 : !(z13 || this.f5139d1)) {
            j13 = j16;
            z12 = false;
        } else {
            z12 = true;
            j13 = j16;
        }
        if (this.f5142g1 == -9223372036854775807L && j10 >= v02 && (z12 || (z13 && a2(j15, j13)))) {
            long nanoTime = System.nanoTime();
            O1(j14, nanoTime, m1Var);
            if (p0.f482a >= 21) {
                T1(lVar, i10, j14, nanoTime);
            } else {
                S1(lVar, i10, j14);
            }
            e2(j15);
            return true;
        }
        if (z13 && j10 != this.f5141f1) {
            long nanoTime2 = System.nanoTime();
            long b10 = this.Q0.b((j15 * 1000) + nanoTime2);
            long j17 = (b10 - nanoTime2) / 1000;
            boolean z14 = this.f5142g1 != -9223372036854775807L;
            if (Y1(j17, j11, z11) && H1(j10, z14)) {
                return false;
            }
            if (Z1(j17, j11, z11)) {
                if (z14) {
                    c2(lVar, i10, j14);
                } else {
                    w1(lVar, i10, j14);
                }
                e2(j17);
                return true;
            } else if (p0.f482a >= 21) {
                if (j17 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    O1(j14, b10, m1Var);
                    T1(lVar, i10, j14, b10);
                    e2(j17);
                    return true;
                }
            } else if (j17 < 30000) {
                if (j17 > 11000) {
                    try {
                        Thread.sleep((j17 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                O1(j14, b10, m1Var);
                S1(lVar, i10, j14);
                e2(j17);
                return true;
            }
        }
        return false;
    }

    protected void S1(x3.l lVar, int i10, long j10) {
        L1();
        m0.a("releaseOutputBuffer");
        lVar.l(i10, true);
        m0.c();
        this.f5148m1 = SystemClock.elapsedRealtime() * 1000;
        this.K0.f30082e++;
        this.f5145j1 = 0;
        J1();
    }

    protected void T1(x3.l lVar, int i10, long j10, long j11) {
        L1();
        m0.a("releaseOutputBuffer");
        lVar.i(i10, j11);
        m0.c();
        this.f5148m1 = SystemClock.elapsedRealtime() * 1000;
        this.K0.f30082e++;
        this.f5145j1 = 0;
        J1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x3.o
    public void X0() {
        super.X0();
        this.f5146k1 = 0;
    }

    protected void X1(x3.l lVar, Surface surface) {
        lVar.d(surface);
    }

    protected boolean Y1(long j10, long j11, boolean z10) {
        return G1(j10) && !z10;
    }

    protected boolean Z1(long j10, long j11, boolean z10) {
        return F1(j10) && !z10;
    }

    protected boolean a2(long j10, long j11) {
        return F1(j10) && j11 > 100000;
    }

    @Override // x3.o
    protected x3.m b0(Throwable th, x3.n nVar) {
        return new g(th, nVar, this.Y0);
    }

    protected void c2(x3.l lVar, int i10, long j10) {
        m0.a("skipVideoBuffer");
        lVar.l(i10, false);
        m0.c();
        this.K0.f30083f++;
    }

    protected void d2(int i10, int i11) {
        q3.e eVar = this.K0;
        eVar.f30085h += i10;
        int i12 = i10 + i11;
        eVar.f30084g += i12;
        this.f5144i1 += i12;
        int i13 = this.f5145j1 + i12;
        this.f5145j1 = i13;
        eVar.f30086i = Math.max(i13, eVar.f30086i);
        int i14 = this.T0;
        if (i14 <= 0 || this.f5144i1 < i14) {
            return;
        }
        I1();
    }

    protected void e2(long j10) {
        this.K0.a(j10);
        this.f5149n1 += j10;
        this.f5150o1++;
    }

    @Override // n3.y2, n3.a3
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // x3.o
    protected boolean h1(x3.n nVar) {
        return this.Y0 != null || b2(nVar);
    }

    @Override // x3.o, n3.y2
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && (this.f5138c1 || (((placeholderSurface = this.Z0) != null && this.Y0 == placeholderSurface) || n0() == null || this.f5156u1))) {
            this.f5142g1 = -9223372036854775807L;
            return true;
        } else if (this.f5142g1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f5142g1) {
                return true;
            }
            this.f5142g1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // n3.f, n3.t2.b
    public void j(int i10, Object obj) throws n3.q {
        if (i10 == 1) {
            W1(obj);
        } else if (i10 == 7) {
            this.f5159x1 = (k) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f5157v1 != intValue) {
                this.f5157v1 = intValue;
                if (this.f5156u1) {
                    V0();
                }
            }
        } else if (i10 != 4) {
            if (i10 != 5) {
                super.j(i10, obj);
            } else {
                this.Q0.o(((Integer) obj).intValue());
            }
        } else {
            this.f5137b1 = ((Integer) obj).intValue();
            x3.l n02 = n0();
            if (n02 != null) {
                n02.b(this.f5137b1);
            }
        }
    }

    @Override // x3.o
    protected int k1(x3.q qVar, m1 m1Var) throws v.c {
        boolean z10;
        int i10 = 0;
        if (!a5.x.s(m1Var.f28185l)) {
            return z2.a(0);
        }
        boolean z11 = m1Var.f28188o != null;
        List<x3.n> B1 = B1(this.P0, qVar, m1Var, z11, false);
        if (z11 && B1.isEmpty()) {
            B1 = B1(this.P0, qVar, m1Var, false, false);
        }
        if (B1.isEmpty()) {
            return z2.a(1);
        }
        if (!x3.o.l1(m1Var)) {
            return z2.a(2);
        }
        x3.n nVar = B1.get(0);
        boolean m7 = nVar.m(m1Var);
        if (!m7) {
            for (int i11 = 1; i11 < B1.size(); i11++) {
                x3.n nVar2 = B1.get(i11);
                if (nVar2.m(m1Var)) {
                    z10 = false;
                    m7 = true;
                    nVar = nVar2;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = m7 ? 4 : 3;
        int i13 = nVar.p(m1Var) ? 16 : 8;
        int i14 = nVar.f32496h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (p0.f482a >= 26 && "video/dolby-vision".equals(m1Var.f28185l) && !a.a(this.P0)) {
            i15 = 256;
        }
        if (m7) {
            List<x3.n> B12 = B1(this.P0, qVar, m1Var, z11, true);
            if (!B12.isEmpty()) {
                x3.n nVar3 = x3.v.u(B12, m1Var).get(0);
                if (nVar3.m(m1Var) && nVar3.p(m1Var)) {
                    i10 = 32;
                }
            }
        }
        return z2.c(i12, i13, i10, i14, i15);
    }

    @Override // x3.o, n3.f, n3.y2
    public void p(float f10, float f11) throws n3.q {
        super.p(f10, f11);
        this.Q0.i(f10);
    }

    @Override // x3.o
    protected boolean p0() {
        return this.f5156u1 && p0.f482a < 23;
    }

    @Override // x3.o
    protected float q0(float f10, m1 m1Var, m1[] m1VarArr) {
        float f11 = -1.0f;
        for (m1 m1Var2 : m1VarArr) {
            float f12 = m1Var2.f28192s;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // x3.o
    protected List<x3.n> s0(x3.q qVar, m1 m1Var, boolean z10) throws v.c {
        return x3.v.u(B1(this.P0, qVar, m1Var, z10, this.f5156u1), m1Var);
    }

    protected boolean t1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f5135z1) {
                A1 = x1();
                f5135z1 = true;
            }
        }
        return A1;
    }

    @Override // x3.o
    @TargetApi(17)
    protected l.a u0(x3.n nVar, m1 m1Var, MediaCrypto mediaCrypto, float f10) {
        PlaceholderSurface placeholderSurface = this.Z0;
        if (placeholderSurface != null && placeholderSurface.f11048a != nVar.f32495g) {
            R1();
        }
        String str = nVar.f32491c;
        b A12 = A1(nVar, m1Var, D());
        this.V0 = A12;
        MediaFormat E1 = E1(m1Var, str, A12, f10, this.U0, this.f5156u1 ? this.f5157v1 : 0);
        if (this.Y0 == null) {
            if (b2(nVar)) {
                if (this.Z0 == null) {
                    this.Z0 = PlaceholderSurface.c(this.P0, nVar.f32495g);
                }
                this.Y0 = this.Z0;
            } else {
                throw new IllegalStateException();
            }
        }
        return l.a.b(nVar, E1, m1Var, this.Y0, mediaCrypto);
    }

    protected void w1(x3.l lVar, int i10, long j10) {
        m0.a("dropVideoBuffer");
        lVar.l(i10, false);
        m0.c();
        d2(0, 1);
    }

    @Override // x3.o
    @TargetApi(29)
    protected void x0(q3.g gVar) throws n3.q {
        if (this.X0) {
            ByteBuffer byteBuffer = (ByteBuffer) a5.a.e(gVar.f30094f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        U1(n0(), bArr);
                    }
                }
            }
        }
    }

    public h(Context context, l.b bVar, x3.q qVar, long j10, boolean z10, Handler handler, y yVar, int i10, float f10) {
        super(2, bVar, qVar, z10, f10);
        this.S0 = j10;
        this.T0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.P0 = applicationContext;
        this.Q0 = new m(applicationContext);
        this.R0 = new y.a(handler, yVar);
        this.U0 = v1();
        this.f5142g1 = -9223372036854775807L;
        this.f5151p1 = -1;
        this.f5152q1 = -1;
        this.f5154s1 = -1.0f;
        this.f5137b1 = 1;
        this.f5157v1 = 0;
        s1();
    }
}
