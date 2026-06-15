package o3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e4.t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import n3.h2;
import n3.l2;
import n3.l3;
import n3.o2;
import n3.p2;
import n3.q3;
import n3.u1;
import n3.z1;
import o3.c;
import o3.p1;
import p3.v;
import x3.o;
import z4.t0;
import z4.z;
/* compiled from: MediaMetricsListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o1 implements c, p1.a {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29277a;

    /* renamed from: b  reason: collision with root package name */
    private final p1 f29278b;

    /* renamed from: c  reason: collision with root package name */
    private final PlaybackSession f29279c;

    /* renamed from: i  reason: collision with root package name */
    private String f29285i;

    /* renamed from: j  reason: collision with root package name */
    private PlaybackMetrics.Builder f29286j;

    /* renamed from: k  reason: collision with root package name */
    private int f29287k;

    /* renamed from: n  reason: collision with root package name */
    private l2 f29290n;

    /* renamed from: o  reason: collision with root package name */
    private b f29291o;

    /* renamed from: p  reason: collision with root package name */
    private b f29292p;

    /* renamed from: q  reason: collision with root package name */
    private b f29293q;

    /* renamed from: r  reason: collision with root package name */
    private n3.m1 f29294r;

    /* renamed from: s  reason: collision with root package name */
    private n3.m1 f29295s;

    /* renamed from: t  reason: collision with root package name */
    private n3.m1 f29296t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f29297u;

    /* renamed from: v  reason: collision with root package name */
    private int f29298v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f29299w;

    /* renamed from: x  reason: collision with root package name */
    private int f29300x;

    /* renamed from: y  reason: collision with root package name */
    private int f29301y;

    /* renamed from: z  reason: collision with root package name */
    private int f29302z;

    /* renamed from: e  reason: collision with root package name */
    private final l3.d f29281e = new l3.d();

    /* renamed from: f  reason: collision with root package name */
    private final l3.b f29282f = new l3.b();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, Long> f29284h = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, Long> f29283g = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final long f29280d = SystemClock.elapsedRealtime();

    /* renamed from: l  reason: collision with root package name */
    private int f29288l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f29289m = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaMetricsListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29303a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29304b;

        public a(int i10, int i11) {
            this.f29303a = i10;
            this.f29304b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaMetricsListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final n3.m1 f29305a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29306b;

        /* renamed from: c  reason: collision with root package name */
        public final String f29307c;

        public b(n3.m1 m1Var, int i10, String str) {
            this.f29305a = m1Var;
            this.f29306b = i10;
            this.f29307c = str;
        }
    }

    private o1(Context context, PlaybackSession playbackSession) {
        this.f29277a = context.getApplicationContext();
        this.f29279c = playbackSession;
        n1 n1Var = new n1();
        this.f29278b = n1Var;
        n1Var.d(this);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int A0(int i10) {
        switch (a5.p0.T(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static DrmInitData B0(y5.q<q3.a> qVar) {
        DrmInitData drmInitData;
        y5.s0<q3.a> it = qVar.iterator();
        while (it.hasNext()) {
            q3.a next = it.next();
            for (int i10 = 0; i10 < next.f28308a; i10++) {
                if (next.g(i10) && (drmInitData = next.c(i10).f28188o) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int C0(DrmInitData drmInitData) {
        for (int i10 = 0; i10 < drmInitData.f10434d; i10++) {
            UUID uuid = drmInitData.e(i10).f10436b;
            if (uuid.equals(n3.i.f28007d)) {
                return 3;
            }
            if (uuid.equals(n3.i.f28008e)) {
                return 2;
            }
            if (uuid.equals(n3.i.f28006c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a D0(l2 l2Var, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (l2Var.f28126a == 1001) {
            return new a(20, 0);
        }
        if (l2Var instanceof n3.q) {
            n3.q qVar = (n3.q) l2Var;
            z11 = qVar.f28292d == 1;
            i10 = qVar.f28296h;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) a5.a.e(l2Var.getCause());
        if (!(th instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof o.b) {
                return new a(13, a5.p0.U(((o.b) th).f32533d));
            }
            if (th instanceof x3.m) {
                return new a(14, a5.p0.U(((x3.m) th).f32488b));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof v.b) {
                return new a(17, ((v.b) th).f29791a);
            }
            if (th instanceof v.e) {
                return new a(18, ((v.e) th).f29796a);
            }
            if (a5.p0.f482a >= 16 && (th instanceof MediaCodec.CryptoException)) {
                int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
                return new a(A0(errorCode), errorCode);
            }
            return new a(22, 0);
        } else if (th instanceof z4.e0) {
            return new a(5, ((z4.e0) th).f33485d);
        } else {
            if (!(th instanceof z4.d0) && !(th instanceof h2)) {
                if (!(th instanceof z4.c0) && !(th instanceof t0.a)) {
                    if (l2Var.f28126a == 1002) {
                        return new a(21, 0);
                    }
                    if (th instanceof j.a) {
                        Throwable th2 = (Throwable) a5.a.e(th.getCause());
                        int i11 = a5.p0.f482a;
                        if (i11 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
                            int U = a5.p0.U(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                            return new a(A0(U), U);
                        } else if (i11 >= 23 && (th2 instanceof MediaDrmResetException)) {
                            return new a(27, 0);
                        } else {
                            if (i11 >= 18 && (th2 instanceof NotProvisionedException)) {
                                return new a(24, 0);
                            }
                            if (i11 >= 18 && (th2 instanceof DeniedByServerException)) {
                                return new a(29, 0);
                            }
                            if (th2 instanceof r3.v) {
                                return new a(23, 0);
                            }
                            if (th2 instanceof e.C0171e) {
                                return new a(28, 0);
                            }
                            return new a(30, 0);
                        }
                    } else if ((th instanceof z.b) && (th.getCause() instanceof FileNotFoundException)) {
                        Throwable cause = ((Throwable) a5.a.e(th.getCause())).getCause();
                        if (a5.p0.f482a >= 21 && (cause instanceof ErrnoException) && ((ErrnoException) cause).errno == OsConstants.EACCES) {
                            return new a(32, 0);
                        }
                        return new a(31, 0);
                    } else {
                        return new a(9, 0);
                    }
                } else if (a5.a0.d(context).f() == 1) {
                    return new a(3, 0);
                } else {
                    Throwable cause2 = th.getCause();
                    if (cause2 instanceof UnknownHostException) {
                        return new a(6, 0);
                    }
                    if (cause2 instanceof SocketTimeoutException) {
                        return new a(7, 0);
                    }
                    if ((th instanceof z4.c0) && ((z4.c0) th).f33479c == 1) {
                        return new a(4, 0);
                    }
                    return new a(8, 0);
                }
            }
            return new a(z10 ? 10 : 11, 0);
        }
    }

    private static Pair<String, String> E0(String str) {
        String[] R0 = a5.p0.R0(str, "-");
        return Pair.create(R0[0], R0.length >= 2 ? R0[1] : null);
    }

    private static int G0(Context context) {
        switch (a5.a0.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int H0(u1 u1Var) {
        u1.h hVar = u1Var.f28373b;
        if (hVar == null) {
            return 0;
        }
        int q02 = a5.p0.q0(hVar.f28437a, hVar.f28438b);
        if (q02 != 0) {
            if (q02 != 1) {
                return q02 != 2 ? 1 : 4;
            }
            return 5;
        }
        return 3;
    }

    private static int I0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 1 : 4;
            }
            return 3;
        }
        return 2;
    }

    private void J0(c.b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int b10 = bVar.b(i10);
            c.a c10 = bVar.c(b10);
            if (b10 == 0) {
                this.f29278b.e(c10);
            } else if (b10 == 11) {
                this.f29278b.c(c10, this.f29287k);
            } else {
                this.f29278b.g(c10);
            }
        }
    }

    private void K0(long j10) {
        int G0 = G0(this.f29277a);
        if (G0 != this.f29289m) {
            this.f29289m = G0;
            this.f29279c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(G0).setTimeSinceCreatedMillis(j10 - this.f29280d).build());
        }
    }

    private void L0(long j10) {
        l2 l2Var = this.f29290n;
        if (l2Var == null) {
            return;
        }
        a D0 = D0(l2Var, this.f29277a, this.f29298v == 4);
        this.f29279c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f29280d).setErrorCode(D0.f29303a).setSubErrorCode(D0.f29304b).setException(l2Var).build());
        this.A = true;
        this.f29290n = null;
    }

    private void M0(p2 p2Var, c.b bVar, long j10) {
        if (p2Var.M() != 2) {
            this.f29297u = false;
        }
        if (p2Var.j() == null) {
            this.f29299w = false;
        } else if (bVar.a(10)) {
            this.f29299w = true;
        }
        int U0 = U0(p2Var);
        if (this.f29288l != U0) {
            this.f29288l = U0;
            this.A = true;
            this.f29279c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f29288l).setTimeSinceCreatedMillis(j10 - this.f29280d).build());
        }
    }

    private void N0(p2 p2Var, c.b bVar, long j10) {
        if (bVar.a(2)) {
            q3 l10 = p2Var.l();
            boolean d10 = l10.d(2);
            boolean d11 = l10.d(1);
            boolean d12 = l10.d(3);
            if (d10 || d11 || d12) {
                if (!d10) {
                    S0(j10, null, 0);
                }
                if (!d11) {
                    O0(j10, null, 0);
                }
                if (!d12) {
                    Q0(j10, null, 0);
                }
            }
        }
        if (x0(this.f29291o)) {
            b bVar2 = this.f29291o;
            n3.m1 m1Var = bVar2.f29305a;
            if (m1Var.f28191r != -1) {
                S0(j10, m1Var, bVar2.f29306b);
                this.f29291o = null;
            }
        }
        if (x0(this.f29292p)) {
            b bVar3 = this.f29292p;
            O0(j10, bVar3.f29305a, bVar3.f29306b);
            this.f29292p = null;
        }
        if (x0(this.f29293q)) {
            b bVar4 = this.f29293q;
            Q0(j10, bVar4.f29305a, bVar4.f29306b);
            this.f29293q = null;
        }
    }

    private void O0(long j10, n3.m1 m1Var, int i10) {
        if (a5.p0.c(this.f29295s, m1Var)) {
            return;
        }
        if (this.f29295s == null && i10 == 0) {
            i10 = 1;
        }
        this.f29295s = m1Var;
        T0(0, j10, m1Var, i10);
    }

    private void P0(p2 p2Var, c.b bVar) {
        DrmInitData B0;
        if (bVar.a(0)) {
            c.a c10 = bVar.c(0);
            if (this.f29286j != null) {
                R0(c10.f29152b, c10.f29154d);
            }
        }
        if (bVar.a(2) && this.f29286j != null && (B0 = B0(p2Var.l().b())) != null) {
            ((PlaybackMetrics.Builder) a5.p0.j(this.f29286j)).setDrmType(C0(B0));
        }
        if (bVar.a(1011)) {
            this.f29302z++;
        }
    }

    private void Q0(long j10, n3.m1 m1Var, int i10) {
        if (a5.p0.c(this.f29296t, m1Var)) {
            return;
        }
        if (this.f29296t == null && i10 == 0) {
            i10 = 1;
        }
        this.f29296t = m1Var;
        T0(2, j10, m1Var, i10);
    }

    private void R0(l3 l3Var, t.b bVar) {
        int f10;
        PlaybackMetrics.Builder builder = this.f29286j;
        if (bVar == null || (f10 = l3Var.f(bVar.f25139a)) == -1) {
            return;
        }
        l3Var.j(f10, this.f29282f);
        l3Var.r(this.f29282f.f28133c, this.f29281e);
        builder.setStreamType(H0(this.f29281e.f28148c));
        l3.d dVar = this.f29281e;
        if (dVar.f28159n != -9223372036854775807L && !dVar.f28157l && !dVar.f28154i && !dVar.g()) {
            builder.setMediaDurationMillis(this.f29281e.f());
        }
        builder.setPlaybackType(this.f29281e.g() ? 2 : 1);
        this.A = true;
    }

    private void S0(long j10, n3.m1 m1Var, int i10) {
        if (a5.p0.c(this.f29294r, m1Var)) {
            return;
        }
        if (this.f29294r == null && i10 == 0) {
            i10 = 1;
        }
        this.f29294r = m1Var;
        T0(1, j10, m1Var, i10);
    }

    private void T0(int i10, long j10, n3.m1 m1Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f29280d);
        if (m1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(I0(i11));
            String str = m1Var.f28184k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = m1Var.f28185l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = m1Var.f28182i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = m1Var.f28181h;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = m1Var.f28190q;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = m1Var.f28191r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = m1Var.f28198y;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = m1Var.f28199z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = m1Var.f28176c;
            if (str4 != null) {
                Pair<String, String> E0 = E0(str4);
                timeSinceCreatedMillis.setLanguage((String) E0.first);
                Object obj = E0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = m1Var.f28192s;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f29279c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int U0(p2 p2Var) {
        int M = p2Var.M();
        if (this.f29297u) {
            return 5;
        }
        if (this.f29299w) {
            return 13;
        }
        if (M == 4) {
            return 11;
        }
        if (M == 2) {
            int i10 = this.f29288l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (p2Var.A()) {
                return p2Var.s() != 0 ? 10 : 6;
            }
            return 7;
        } else if (M == 3) {
            if (p2Var.A()) {
                return p2Var.s() != 0 ? 9 : 3;
            }
            return 4;
        } else if (M != 1 || this.f29288l == 0) {
            return this.f29288l;
        } else {
            return 12;
        }
    }

    private boolean x0(b bVar) {
        return bVar != null && bVar.f29307c.equals(this.f29278b.a());
    }

    public static o1 y0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new o1(context, mediaMetricsManager.createPlaybackSession());
    }

    private void z0() {
        PlaybackMetrics.Builder builder = this.f29286j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f29302z);
            this.f29286j.setVideoFramesDropped(this.f29300x);
            this.f29286j.setVideoFramesPlayed(this.f29301y);
            Long l10 = this.f29283g.get(this.f29285i);
            this.f29286j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f29284h.get(this.f29285i);
            this.f29286j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f29286j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f29279c.reportPlaybackMetrics(this.f29286j.build());
        }
        this.f29286j = null;
        this.f29285i = null;
        this.f29302z = 0;
        this.f29300x = 0;
        this.f29301y = 0;
        this.f29294r = null;
        this.f29295s = null;
        this.f29296t = null;
        this.A = false;
    }

    @Override // o3.c
    public /* synthetic */ void A(c.a aVar, boolean z10) {
        o3.b.W(this, aVar, z10);
    }

    @Override // o3.c
    public /* synthetic */ void B(c.a aVar, Exception exc) {
        o3.b.a(this, aVar, exc);
    }

    @Override // o3.c
    public /* synthetic */ void C(c.a aVar, Metadata metadata) {
        o3.b.K(this, aVar, metadata);
    }

    @Override // o3.c
    public void D(c.a aVar, q3.e eVar) {
        this.f29300x += eVar.f30084g;
        this.f29301y += eVar.f30082e;
    }

    @Override // o3.c
    public /* synthetic */ void E(c.a aVar, int i10, q3.e eVar) {
        o3.b.p(this, aVar, i10, eVar);
    }

    @Override // o3.c
    public /* synthetic */ void F(c.a aVar, boolean z10, int i10) {
        o3.b.Q(this, aVar, z10, i10);
    }

    public LogSessionId F0() {
        return this.f29279c.getSessionId();
    }

    @Override // o3.c
    public /* synthetic */ void G(c.a aVar, int i10, int i11, int i12, float f10) {
        o3.b.k0(this, aVar, i10, i11, i12, f10);
    }

    @Override // o3.c
    public /* synthetic */ void H(c.a aVar, int i10) {
        o3.b.y(this, aVar, i10);
    }

    @Override // o3.c
    public /* synthetic */ void I(c.a aVar, e4.p pVar) {
        o3.b.b0(this, aVar, pVar);
    }

    @Override // o3.c
    public /* synthetic */ void J(c.a aVar, String str) {
        o3.b.d(this, aVar, str);
    }

    @Override // o3.c
    public /* synthetic */ void K(c.a aVar, Exception exc) {
        o3.b.z(this, aVar, exc);
    }

    @Override // o3.c
    public /* synthetic */ void L(c.a aVar, n3.m1 m1Var) {
        o3.b.g(this, aVar, m1Var);
    }

    @Override // o3.c
    public /* synthetic */ void M(c.a aVar) {
        o3.b.A(this, aVar);
    }

    @Override // o3.c
    public /* synthetic */ void N(c.a aVar, int i10) {
        o3.b.O(this, aVar, i10);
    }

    @Override // o3.c
    public /* synthetic */ void O(c.a aVar, String str) {
        o3.b.f0(this, aVar, str);
    }

    @Override // o3.c
    public void P(p2 p2Var, c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        J0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        P0(p2Var, bVar);
        L0(elapsedRealtime);
        N0(p2Var, bVar, elapsedRealtime);
        K0(elapsedRealtime);
        M0(p2Var, bVar, elapsedRealtime);
        if (bVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            this.f29278b.f(bVar.c(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED));
        }
    }

    @Override // o3.c
    public /* synthetic */ void Q(c.a aVar, q3.e eVar) {
        o3.b.f(this, aVar, eVar);
    }

    @Override // o3.c
    public /* synthetic */ void R(c.a aVar, boolean z10) {
        o3.b.H(this, aVar, z10);
    }

    @Override // o3.c
    public /* synthetic */ void S(c.a aVar, n3.o oVar) {
        o3.b.s(this, aVar, oVar);
    }

    @Override // o3.c
    public /* synthetic */ void T(c.a aVar, String str, long j10) {
        o3.b.b(this, aVar, str, j10);
    }

    @Override // o3.c
    public /* synthetic */ void U(c.a aVar) {
        o3.b.U(this, aVar);
    }

    @Override // o3.c
    public /* synthetic */ void V(c.a aVar, e4.l lVar, e4.p pVar) {
        o3.b.F(this, aVar, lVar, pVar);
    }

    @Override // o3.c
    public /* synthetic */ void W(c.a aVar, n3.m1 m1Var, q3.i iVar) {
        o3.b.h(this, aVar, m1Var, iVar);
    }

    @Override // o3.c
    public /* synthetic */ void X(c.a aVar, int i10, q3.e eVar) {
        o3.b.o(this, aVar, i10, eVar);
    }

    @Override // o3.c
    public /* synthetic */ void Y(c.a aVar, long j10, int i10) {
        o3.b.h0(this, aVar, j10, i10);
    }

    @Override // o3.c
    public /* synthetic */ void Z(c.a aVar, Exception exc) {
        o3.b.c0(this, aVar, exc);
    }

    @Override // o3.c
    public /* synthetic */ void a(c.a aVar, int i10, boolean z10) {
        o3.b.t(this, aVar, i10, z10);
    }

    @Override // o3.c
    public void a0(c.a aVar, e4.p pVar) {
        if (aVar.f29154d == null) {
            return;
        }
        b bVar = new b((n3.m1) a5.a.e(pVar.f25134c), pVar.f25135d, this.f29278b.b(aVar.f29152b, (t.b) a5.a.e(aVar.f29154d)));
        int i10 = pVar.f25133b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f29292p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f29293q = bVar;
                return;
            }
        }
        this.f29291o = bVar;
    }

    @Override // o3.c
    public /* synthetic */ void b(c.a aVar, int i10) {
        o3.b.R(this, aVar, i10);
    }

    @Override // o3.c
    public /* synthetic */ void b0(c.a aVar, l2 l2Var) {
        o3.b.P(this, aVar, l2Var);
    }

    @Override // o3.c
    public /* synthetic */ void c(c.a aVar, String str, long j10, long j11) {
        o3.b.c(this, aVar, str, j10, j11);
    }

    @Override // o3.c
    public /* synthetic */ void c0(c.a aVar, p2.b bVar) {
        o3.b.l(this, aVar, bVar);
    }

    @Override // o3.p1.a
    public void d(c.a aVar, String str) {
        t.b bVar = aVar.f29154d;
        if (bVar == null || !bVar.b()) {
            z0();
            this.f29285i = str;
            this.f29286j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.2");
            R0(aVar.f29152b, aVar.f29154d);
        }
    }

    @Override // o3.c
    public /* synthetic */ void d0(c.a aVar, q3 q3Var) {
        o3.b.a0(this, aVar, q3Var);
    }

    @Override // o3.c
    public /* synthetic */ void e(c.a aVar, boolean z10) {
        o3.b.C(this, aVar, z10);
    }

    @Override // o3.p1.a
    public void e0(c.a aVar, String str) {
    }

    @Override // o3.c
    public /* synthetic */ void f(c.a aVar, Object obj, long j10) {
        o3.b.S(this, aVar, obj, j10);
    }

    @Override // o3.c
    public /* synthetic */ void f0(c.a aVar) {
        o3.b.x(this, aVar);
    }

    @Override // o3.c
    public void g(c.a aVar, p2.e eVar, p2.e eVar2, int i10) {
        if (i10 == 1) {
            this.f29297u = true;
        }
        this.f29287k = i10;
    }

    @Override // o3.c
    public /* synthetic */ void g0(c.a aVar, int i10) {
        o3.b.Z(this, aVar, i10);
    }

    @Override // o3.c
    public /* synthetic */ void h(c.a aVar, int i10, long j10, long j11) {
        o3.b.k(this, aVar, i10, j10, j11);
    }

    @Override // o3.c
    public /* synthetic */ void h0(c.a aVar, boolean z10) {
        o3.b.X(this, aVar, z10);
    }

    @Override // o3.c
    public /* synthetic */ void i(c.a aVar, int i10) {
        o3.b.T(this, aVar, i10);
    }

    @Override // o3.c
    public void i0(c.a aVar, b5.a0 a0Var) {
        b bVar = this.f29291o;
        if (bVar != null) {
            n3.m1 m1Var = bVar.f29305a;
            if (m1Var.f28191r == -1) {
                this.f29291o = new b(m1Var.b().j0(a0Var.f5097a).Q(a0Var.f5098b).E(), bVar.f29306b, bVar.f29307c);
            }
        }
    }

    @Override // o3.c
    public /* synthetic */ void j(c.a aVar) {
        o3.b.u(this, aVar);
    }

    @Override // o3.c
    public /* synthetic */ void j0(c.a aVar, z1 z1Var) {
        o3.b.J(this, aVar, z1Var);
    }

    @Override // o3.c
    public /* synthetic */ void k(c.a aVar, int i10, String str, long j10) {
        o3.b.q(this, aVar, i10, str, j10);
    }

    @Override // o3.c
    public /* synthetic */ void k0(c.a aVar, n3.m1 m1Var, q3.i iVar) {
        o3.b.j0(this, aVar, m1Var, iVar);
    }

    @Override // o3.c
    public /* synthetic */ void l(c.a aVar, int i10, int i11) {
        o3.b.Y(this, aVar, i10, i11);
    }

    @Override // o3.c
    public /* synthetic */ void l0(c.a aVar, List list) {
        o3.b.m(this, aVar, list);
    }

    @Override // o3.c
    public /* synthetic */ void m(c.a aVar, n4.e eVar) {
        o3.b.n(this, aVar, eVar);
    }

    @Override // o3.c
    public /* synthetic */ void m0(c.a aVar, u1 u1Var, int i10) {
        o3.b.I(this, aVar, u1Var, i10);
    }

    @Override // o3.c
    public /* synthetic */ void n(c.a aVar, String str, long j10, long j11) {
        o3.b.e0(this, aVar, str, j10, j11);
    }

    @Override // o3.c
    public /* synthetic */ void n0(c.a aVar) {
        o3.b.v(this, aVar);
    }

    @Override // o3.c
    public /* synthetic */ void o(c.a aVar, boolean z10) {
        o3.b.D(this, aVar, z10);
    }

    @Override // o3.c
    public /* synthetic */ void o0(c.a aVar, q3.e eVar) {
        o3.b.g0(this, aVar, eVar);
    }

    @Override // o3.c
    public void p(c.a aVar, e4.l lVar, e4.p pVar, IOException iOException, boolean z10) {
        this.f29298v = pVar.f25132a;
    }

    @Override // o3.c
    public /* synthetic */ void p0(c.a aVar, e4.l lVar, e4.p pVar) {
        o3.b.G(this, aVar, lVar, pVar);
    }

    @Override // o3.c
    public void q(c.a aVar, l2 l2Var) {
        this.f29290n = l2Var;
    }

    @Override // o3.c
    public /* synthetic */ void q0(c.a aVar, n3.m1 m1Var) {
        o3.b.i0(this, aVar, m1Var);
    }

    @Override // o3.c
    public /* synthetic */ void r(c.a aVar) {
        o3.b.w(this, aVar);
    }

    @Override // o3.c
    public /* synthetic */ void r0(c.a aVar, e4.l lVar, e4.p pVar) {
        o3.b.E(this, aVar, lVar, pVar);
    }

    @Override // o3.c
    public /* synthetic */ void s(c.a aVar, Exception exc) {
        o3.b.j(this, aVar, exc);
    }

    @Override // o3.c
    public /* synthetic */ void s0(c.a aVar, String str, long j10) {
        o3.b.d0(this, aVar, str, j10);
    }

    @Override // o3.c
    public /* synthetic */ void t(c.a aVar, o2 o2Var) {
        o3.b.M(this, aVar, o2Var);
    }

    @Override // o3.p1.a
    public void t0(c.a aVar, String str, String str2) {
    }

    @Override // o3.c
    public void u(c.a aVar, int i10, long j10, long j11) {
        t.b bVar = aVar.f29154d;
        if (bVar != null) {
            String b10 = this.f29278b.b(aVar.f29152b, (t.b) a5.a.e(bVar));
            Long l10 = this.f29284h.get(b10);
            Long l11 = this.f29283g.get(b10);
            this.f29284h.put(b10, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f29283g.put(b10, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // o3.c
    public /* synthetic */ void u0(c.a aVar, q3.e eVar) {
        o3.b.e(this, aVar, eVar);
    }

    @Override // o3.c
    public /* synthetic */ void v(c.a aVar, boolean z10, int i10) {
        o3.b.L(this, aVar, z10, i10);
    }

    @Override // o3.c
    public /* synthetic */ void v0(c.a aVar) {
        o3.b.V(this, aVar);
    }

    @Override // o3.p1.a
    public void w(c.a aVar, String str, boolean z10) {
        t.b bVar = aVar.f29154d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f29285i)) {
            z0();
        }
        this.f29283g.remove(str);
        this.f29284h.remove(str);
    }

    @Override // o3.c
    public /* synthetic */ void w0(c.a aVar, int i10, n3.m1 m1Var) {
        o3.b.r(this, aVar, i10, m1Var);
    }

    @Override // o3.c
    public /* synthetic */ void x(c.a aVar, int i10, long j10) {
        o3.b.B(this, aVar, i10, j10);
    }

    @Override // o3.c
    public /* synthetic */ void y(c.a aVar, long j10) {
        o3.b.i(this, aVar, j10);
    }

    @Override // o3.c
    public /* synthetic */ void z(c.a aVar, int i10) {
        o3.b.N(this, aVar, i10);
    }
}
