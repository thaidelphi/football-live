package b5;

import a5.p0;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.ironsource.b9;
/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final b5.e f5182a = new b5.e();

    /* renamed from: b  reason: collision with root package name */
    private final b f5183b;

    /* renamed from: c  reason: collision with root package name */
    private final e f5184c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5185d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f5186e;

    /* renamed from: f  reason: collision with root package name */
    private float f5187f;

    /* renamed from: g  reason: collision with root package name */
    private float f5188g;

    /* renamed from: h  reason: collision with root package name */
    private float f5189h;

    /* renamed from: i  reason: collision with root package name */
    private float f5190i;

    /* renamed from: j  reason: collision with root package name */
    private int f5191j;

    /* renamed from: k  reason: collision with root package name */
    private long f5192k;

    /* renamed from: l  reason: collision with root package name */
    private long f5193l;

    /* renamed from: m  reason: collision with root package name */
    private long f5194m;

    /* renamed from: n  reason: collision with root package name */
    private long f5195n;

    /* renamed from: o  reason: collision with root package name */
    private long f5196o;

    /* renamed from: p  reason: collision with root package name */
    private long f5197p;

    /* renamed from: q  reason: collision with root package name */
    private long f5198q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e8) {
                a5.t.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {

        /* compiled from: VideoFrameReleaseHelper.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f5199a;

        private c(WindowManager windowManager) {
            this.f5199a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // b5.m.b
        public void a(b.a aVar) {
            aVar.a(this.f5199a.getDefaultDisplay());
        }

        @Override // b5.m.b
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f5200a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f5201b;

        private d(DisplayManager displayManager) {
            this.f5200a = displayManager;
        }

        private Display c() {
            return this.f5200a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(b9.h.f16644d);
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // b5.m.b
        public void a(b.a aVar) {
            this.f5201b = aVar;
            this.f5200a.registerDisplayListener(this, p0.v());
            aVar.a(c());
        }

        @Override // b5.m.b
        public void b() {
            this.f5200a.unregisterDisplayListener(this);
            this.f5201b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f5201b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f  reason: collision with root package name */
        private static final e f5202f = new e();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f5203a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f5204b;

        /* renamed from: c  reason: collision with root package name */
        private final HandlerThread f5205c;

        /* renamed from: d  reason: collision with root package name */
        private Choreographer f5206d;

        /* renamed from: e  reason: collision with root package name */
        private int f5207e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f5205c = handlerThread;
            handlerThread.start();
            Handler u10 = p0.u(handlerThread.getLooper(), this);
            this.f5204b = u10;
            u10.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f5206d;
            if (choreographer != null) {
                int i10 = this.f5207e + 1;
                this.f5207e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f5206d = Choreographer.getInstance();
            } catch (RuntimeException e8) {
                a5.t.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e8);
            }
        }

        public static e d() {
            return f5202f;
        }

        private void f() {
            Choreographer choreographer = this.f5206d;
            if (choreographer != null) {
                int i10 = this.f5207e - 1;
                this.f5207e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f5203a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f5204b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f5203a = j10;
            ((Choreographer) a5.a.e(this.f5206d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f5204b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public m(Context context) {
        b f10 = f(context);
        this.f5183b = f10;
        this.f5184c = f10 != null ? e.d() : null;
        this.f5192k = -9223372036854775807L;
        this.f5193l = -9223372036854775807L;
        this.f5187f = -1.0f;
        this.f5190i = 1.0f;
        this.f5191j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (p0.f482a < 30 || (surface = this.f5186e) == null || this.f5191j == Integer.MIN_VALUE || this.f5189h == 0.0f) {
            return;
        }
        this.f5189h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static b f(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            b d10 = p0.f482a >= 17 ? d.d(applicationContext) : null;
            return d10 == null ? c.c(applicationContext) : d10;
        }
        return null;
    }

    private void n() {
        this.f5194m = 0L;
        this.f5197p = -1L;
        this.f5195n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f5192k = refreshRate;
            this.f5193l = (refreshRate * 80) / 100;
            return;
        }
        a5.t.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f5192k = -9223372036854775807L;
        this.f5193l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.f5188g) >= (r7.f5182a.e() && (r7.f5182a.d() > 5000000000L ? 1 : (r7.f5182a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r7.f5182a.c() >= 30) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            r7 = this;
            int r0 = a5.p0.f482a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f5186e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            b5.e r0 = r7.f5182a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            b5.e r0 = r7.f5182a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r7.f5187f
        L1d:
            float r2 = r7.f5188g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            b5.e r1 = r7.f5182a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            b5.e r1 = r7.f5182a
            long r1 = r1.d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f5188g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            b5.e r2 = r7.f5182a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f5188g = r0
            r7.r(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m.q():void");
    }

    private void r(boolean z10) {
        Surface surface;
        if (p0.f482a < 30 || (surface = this.f5186e) == null || this.f5191j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f5185d) {
            float f11 = this.f5188g;
            if (f11 != -1.0f) {
                f10 = this.f5190i * f11;
            }
        }
        if (z10 || this.f5189h != f10) {
            this.f5189h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        e eVar;
        if (this.f5197p != -1 && this.f5182a.e()) {
            long a10 = this.f5198q + (((float) (this.f5182a.a() * (this.f5194m - this.f5197p))) / this.f5190i);
            if (!c(j10, a10)) {
                n();
            } else {
                j11 = a10;
                this.f5195n = this.f5194m;
                this.f5196o = j11;
                eVar = this.f5184c;
                if (eVar != null || this.f5192k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f5203a;
                return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f5192k) - this.f5193l;
            }
        }
        j11 = j10;
        this.f5195n = this.f5194m;
        this.f5196o = j11;
        eVar = this.f5184c;
        if (eVar != null) {
        }
        return j11;
    }

    public void g(float f10) {
        this.f5187f = f10;
        this.f5182a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f5195n;
        if (j11 != -1) {
            this.f5197p = j11;
            this.f5198q = this.f5196o;
        }
        this.f5194m++;
        this.f5182a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f5190i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f5185d = true;
        n();
        if (this.f5183b != null) {
            ((e) a5.a.e(this.f5184c)).a();
            this.f5183b.a(new b.a() { // from class: b5.l
                @Override // b5.m.b.a
                public final void a(Display display) {
                    m.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f5185d = false;
        b bVar = this.f5183b;
        if (bVar != null) {
            bVar.b();
            ((e) a5.a.e(this.f5184c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f5186e == surface) {
            return;
        }
        d();
        this.f5186e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f5191j == i10) {
            return;
        }
        this.f5191j = i10;
        r(true);
    }
}
