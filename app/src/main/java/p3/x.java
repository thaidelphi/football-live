package p3;

import a5.p0;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class x {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final a f29810a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f29811b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f29812c;

    /* renamed from: d  reason: collision with root package name */
    private int f29813d;

    /* renamed from: e  reason: collision with root package name */
    private int f29814e;

    /* renamed from: f  reason: collision with root package name */
    private w f29815f;

    /* renamed from: g  reason: collision with root package name */
    private int f29816g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29817h;

    /* renamed from: i  reason: collision with root package name */
    private long f29818i;

    /* renamed from: j  reason: collision with root package name */
    private float f29819j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29820k;

    /* renamed from: l  reason: collision with root package name */
    private long f29821l;

    /* renamed from: m  reason: collision with root package name */
    private long f29822m;

    /* renamed from: n  reason: collision with root package name */
    private Method f29823n;

    /* renamed from: o  reason: collision with root package name */
    private long f29824o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29825p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f29826q;

    /* renamed from: r  reason: collision with root package name */
    private long f29827r;

    /* renamed from: s  reason: collision with root package name */
    private long f29828s;

    /* renamed from: t  reason: collision with root package name */
    private long f29829t;

    /* renamed from: u  reason: collision with root package name */
    private long f29830u;

    /* renamed from: v  reason: collision with root package name */
    private int f29831v;

    /* renamed from: w  reason: collision with root package name */
    private int f29832w;

    /* renamed from: x  reason: collision with root package name */
    private long f29833x;

    /* renamed from: y  reason: collision with root package name */
    private long f29834y;

    /* renamed from: z  reason: collision with root package name */
    private long f29835z;

    /* compiled from: AudioTrackPositionTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public x(a aVar) {
        this.f29810a = (a) a5.a.e(aVar);
        if (p0.f482a >= 18) {
            try {
                this.f29823n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f29811b = new long[10];
    }

    private boolean a() {
        return this.f29817h && ((AudioTrack) a5.a.e(this.f29812c)).getPlayState() == 2 && e() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / this.f29816g;
    }

    private long e() {
        AudioTrack audioTrack = (AudioTrack) a5.a.e(this.f29812c);
        if (this.f29833x != -9223372036854775807L) {
            return Math.min(this.A, this.f29835z + ((((SystemClock.elapsedRealtime() * 1000) - this.f29833x) * this.f29816g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f29817h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f29830u = this.f29828s;
            }
            playbackHeadPosition += this.f29830u;
        }
        if (p0.f482a <= 29) {
            if (playbackHeadPosition == 0 && this.f29828s > 0 && playState == 3) {
                if (this.f29834y == -9223372036854775807L) {
                    this.f29834y = SystemClock.elapsedRealtime();
                }
                return this.f29828s;
            }
            this.f29834y = -9223372036854775807L;
        }
        if (this.f29828s > playbackHeadPosition) {
            this.f29829t++;
        }
        this.f29828s = playbackHeadPosition;
        return playbackHeadPosition + (this.f29829t << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j10, long j11) {
        w wVar = (w) a5.a.e(this.f29815f);
        if (wVar.e(j10)) {
            long c10 = wVar.c();
            long b10 = wVar.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f29810a.e(b10, c10, j10, j11);
                wVar.f();
            } else if (Math.abs(b(b10) - j11) > 5000000) {
                this.f29810a.d(b10, c10, j10, j11);
                wVar.f();
            } else {
                wVar.a();
            }
        }
    }

    private void m() {
        long f10 = f();
        if (f10 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f29822m >= 30000) {
            long[] jArr = this.f29811b;
            int i10 = this.f29831v;
            jArr[i10] = f10 - nanoTime;
            this.f29831v = (i10 + 1) % 10;
            int i11 = this.f29832w;
            if (i11 < 10) {
                this.f29832w = i11 + 1;
            }
            this.f29822m = nanoTime;
            this.f29821l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f29832w;
                if (i12 >= i13) {
                    break;
                }
                this.f29821l += this.f29811b[i12] / i13;
                i12++;
            }
        }
        if (this.f29817h) {
            return;
        }
        l(nanoTime, f10);
        n(nanoTime);
    }

    private void n(long j10) {
        Method method;
        if (!this.f29826q || (method = this.f29823n) == null || j10 - this.f29827r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) p0.j((Integer) method.invoke(a5.a.e(this.f29812c), new Object[0]))).intValue() * 1000) - this.f29818i;
            this.f29824o = intValue;
            long max = Math.max(intValue, 0L);
            this.f29824o = max;
            if (max > 5000000) {
                this.f29810a.b(max);
                this.f29824o = 0L;
            }
        } catch (Exception unused) {
            this.f29823n = null;
        }
        this.f29827r = j10;
    }

    private static boolean o(int i10) {
        return p0.f482a < 23 && (i10 == 5 || i10 == 6);
    }

    private void r() {
        this.f29821l = 0L;
        this.f29832w = 0;
        this.f29831v = 0;
        this.f29822m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f29820k = false;
    }

    public int c(long j10) {
        return this.f29814e - ((int) (j10 - (e() * this.f29813d)));
    }

    public long d(boolean z10) {
        long j10;
        if (((AudioTrack) a5.a.e(this.f29812c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        w wVar = (w) a5.a.e(this.f29815f);
        boolean d10 = wVar.d();
        if (d10) {
            j10 = b(wVar.b()) + p0.Y(nanoTime - wVar.c(), this.f29819j);
        } else {
            if (this.f29832w == 0) {
                j10 = f();
            } else {
                j10 = this.f29821l + nanoTime;
            }
            if (!z10) {
                j10 = Math.max(0L, j10 - this.f29824o);
            }
        }
        if (this.D != d10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime - this.F;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.E + p0.Y(j11, this.f29819j)))) / 1000;
        }
        if (!this.f29820k) {
            long j13 = this.B;
            if (j10 > j13) {
                this.f29820k = true;
                this.f29810a.c(System.currentTimeMillis() - p0.Z0(p0.d0(p0.Z0(j10 - j13), this.f29819j)));
            }
        }
        this.C = nanoTime;
        this.B = j10;
        this.D = d10;
        return j10;
    }

    public void g(long j10) {
        this.f29835z = e();
        this.f29833x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) a5.a.e(this.f29812c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f29834y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f29834y >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) a5.a.e(this.f29812c)).getPlayState();
        if (this.f29817h) {
            if (playState == 2) {
                this.f29825p = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f29825p;
        boolean h10 = h(j10);
        this.f29825p = h10;
        if (z10 && !h10 && playState != 1) {
            this.f29810a.a(this.f29814e, p0.Z0(this.f29818i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f29833x == -9223372036854775807L) {
            ((w) a5.a.e(this.f29815f)).g();
            return true;
        }
        return false;
    }

    public void q() {
        r();
        this.f29812c = null;
        this.f29815f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f29812c = audioTrack;
        this.f29813d = i11;
        this.f29814e = i12;
        this.f29815f = new w(audioTrack);
        this.f29816g = audioTrack.getSampleRate();
        this.f29817h = z10 && o(i10);
        boolean u02 = p0.u0(i10);
        this.f29826q = u02;
        this.f29818i = u02 ? b(i12 / i11) : -9223372036854775807L;
        this.f29828s = 0L;
        this.f29829t = 0L;
        this.f29830u = 0L;
        this.f29825p = false;
        this.f29833x = -9223372036854775807L;
        this.f29834y = -9223372036854775807L;
        this.f29827r = 0L;
        this.f29824o = 0L;
        this.f29819j = 1.0f;
    }

    public void t(float f10) {
        this.f29819j = f10;
        w wVar = this.f29815f;
        if (wVar != null) {
            wVar.g();
        }
    }

    public void u() {
        ((w) a5.a.e(this.f29815f)).g();
    }
}
