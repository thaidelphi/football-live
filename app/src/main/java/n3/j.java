package n3;

import android.os.SystemClock;
import n3.u1;
/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements r1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f28068a;

    /* renamed from: b  reason: collision with root package name */
    private final float f28069b;

    /* renamed from: c  reason: collision with root package name */
    private final long f28070c;

    /* renamed from: d  reason: collision with root package name */
    private final float f28071d;

    /* renamed from: e  reason: collision with root package name */
    private final long f28072e;

    /* renamed from: f  reason: collision with root package name */
    private final long f28073f;

    /* renamed from: g  reason: collision with root package name */
    private final float f28074g;

    /* renamed from: h  reason: collision with root package name */
    private long f28075h;

    /* renamed from: i  reason: collision with root package name */
    private long f28076i;

    /* renamed from: j  reason: collision with root package name */
    private long f28077j;

    /* renamed from: k  reason: collision with root package name */
    private long f28078k;

    /* renamed from: l  reason: collision with root package name */
    private long f28079l;

    /* renamed from: m  reason: collision with root package name */
    private long f28080m;

    /* renamed from: n  reason: collision with root package name */
    private float f28081n;

    /* renamed from: o  reason: collision with root package name */
    private float f28082o;

    /* renamed from: p  reason: collision with root package name */
    private float f28083p;

    /* renamed from: q  reason: collision with root package name */
    private long f28084q;

    /* renamed from: r  reason: collision with root package name */
    private long f28085r;

    /* renamed from: s  reason: collision with root package name */
    private long f28086s;

    /* compiled from: DefaultLivePlaybackSpeedControl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f28087a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f28088b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f28089c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f28090d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f28091e = a5.p0.C0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f28092f = a5.p0.C0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f28093g = 0.999f;

        public j a() {
            return new j(this.f28087a, this.f28088b, this.f28089c, this.f28090d, this.f28091e, this.f28092f, this.f28093g);
        }
    }

    private void f(long j10) {
        long j11 = this.f28085r + (this.f28086s * 3);
        if (this.f28080m > j11) {
            float C0 = (float) a5.p0.C0(this.f28070c);
            this.f28080m = a6.d.b(j11, this.f28077j, this.f28080m - (((this.f28083p - 1.0f) * C0) + ((this.f28081n - 1.0f) * C0)));
            return;
        }
        long r10 = a5.p0.r(j10 - (Math.max(0.0f, this.f28083p - 1.0f) / this.f28071d), this.f28080m, j11);
        this.f28080m = r10;
        long j12 = this.f28079l;
        if (j12 == -9223372036854775807L || r10 <= j12) {
            return;
        }
        this.f28080m = j12;
    }

    private void g() {
        long j10 = this.f28075h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f28076i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f28078k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f28079l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f28077j == j10) {
            return;
        }
        this.f28077j = j10;
        this.f28080m = j10;
        this.f28085r = -9223372036854775807L;
        this.f28086s = -9223372036854775807L;
        this.f28084q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f28085r;
        if (j13 == -9223372036854775807L) {
            this.f28085r = j12;
            this.f28086s = 0L;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f28074g));
        this.f28085r = max;
        this.f28086s = h(this.f28086s, Math.abs(j12 - max), this.f28074g);
    }

    @Override // n3.r1
    public void a(u1.g gVar) {
        this.f28075h = a5.p0.C0(gVar.f28427a);
        this.f28078k = a5.p0.C0(gVar.f28428b);
        this.f28079l = a5.p0.C0(gVar.f28429c);
        float f10 = gVar.f28430d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f28068a;
        }
        this.f28082o = f10;
        float f11 = gVar.f28431e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f28069b;
        }
        this.f28081n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f28075h = -9223372036854775807L;
        }
        g();
    }

    @Override // n3.r1
    public float b(long j10, long j11) {
        if (this.f28075h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f28084q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f28084q < this.f28070c) {
            return this.f28083p;
        }
        this.f28084q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f28080m;
        if (Math.abs(j12) < this.f28072e) {
            this.f28083p = 1.0f;
        } else {
            this.f28083p = a5.p0.p((this.f28071d * ((float) j12)) + 1.0f, this.f28082o, this.f28081n);
        }
        return this.f28083p;
    }

    @Override // n3.r1
    public long c() {
        return this.f28080m;
    }

    @Override // n3.r1
    public void d() {
        long j10 = this.f28080m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f28073f;
        this.f28080m = j11;
        long j12 = this.f28079l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f28080m = j12;
        }
        this.f28084q = -9223372036854775807L;
    }

    @Override // n3.r1
    public void e(long j10) {
        this.f28076i = j10;
        g();
    }

    private j(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f28068a = f10;
        this.f28069b = f11;
        this.f28070c = j10;
        this.f28071d = f12;
        this.f28072e = j11;
        this.f28073f = j12;
        this.f28074g = f13;
        this.f28075h = -9223372036854775807L;
        this.f28076i = -9223372036854775807L;
        this.f28078k = -9223372036854775807L;
        this.f28079l = -9223372036854775807L;
        this.f28082o = f10;
        this.f28081n = f11;
        this.f28083p = 1.0f;
        this.f28084q = -9223372036854775807L;
        this.f28077j = -9223372036854775807L;
        this.f28080m = -9223372036854775807L;
        this.f28085r = -9223372036854775807L;
        this.f28086s = -9223372036854775807L;
    }
}
