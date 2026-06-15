package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.adcolony.sdk.e0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ug;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a1 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private String E;
    private String F;
    private FileInputStream G;
    private h0 H;
    private com.adcolony.sdk.c I;
    private Surface J;
    private SurfaceTexture K;
    private RectF L;
    private j M;
    private ProgressBar N;
    private MediaPlayer O;
    private f1 P;
    private ExecutorService Q;
    private h0 R;

    /* renamed from: a  reason: collision with root package name */
    private float f5768a;

    /* renamed from: b  reason: collision with root package name */
    private float f5769b;

    /* renamed from: c  reason: collision with root package name */
    private float f5770c;

    /* renamed from: d  reason: collision with root package name */
    private float f5771d;

    /* renamed from: e  reason: collision with root package name */
    private float f5772e;

    /* renamed from: f  reason: collision with root package name */
    private float f5773f;

    /* renamed from: g  reason: collision with root package name */
    private int f5774g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5775h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f5776i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f5777j;

    /* renamed from: k  reason: collision with root package name */
    private int f5778k;

    /* renamed from: l  reason: collision with root package name */
    private int f5779l;

    /* renamed from: m  reason: collision with root package name */
    private int f5780m;

    /* renamed from: n  reason: collision with root package name */
    private int f5781n;

    /* renamed from: o  reason: collision with root package name */
    private int f5782o;

    /* renamed from: p  reason: collision with root package name */
    private int f5783p;

    /* renamed from: q  reason: collision with root package name */
    private int f5784q;

    /* renamed from: r  reason: collision with root package name */
    private double f5785r;

    /* renamed from: s  reason: collision with root package name */
    private double f5786s;

    /* renamed from: t  reason: collision with root package name */
    private long f5787t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f5788u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5789v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f5790w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f5791x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f5792y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f5793z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {
        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.c(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j0 {
        c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.d(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements j0 {
        d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j0 {
        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.b(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements j0 {
        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.e(h0Var);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e8) {
                e8.printStackTrace();
            }
            if (a1.this.R != null) {
                f1 b10 = c0.b();
                c0.b(b10, ug.f21009x, a1.this.f5782o);
                c0.a(b10, "ad_session_id", a1.this.F);
                c0.b(b10, "success", true);
                a1.this.R.a(b10).c();
                a1.this.R = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.f5787t = 0L;
            while (!a1.this.f5788u && !a1.this.f5791x && com.adcolony.sdk.a.c()) {
                Context a10 = com.adcolony.sdk.a.a();
                if (a1.this.f5788u || a1.this.f5793z || a10 == null || !(a10 instanceof Activity)) {
                    return;
                }
                if (a1.this.O.isPlaying()) {
                    if (a1.this.f5787t == 0 && com.adcolony.sdk.a.f5751d) {
                        a1.this.f5787t = System.currentTimeMillis();
                    }
                    a1.this.f5790w = true;
                    a1 a1Var = a1.this;
                    a1Var.f5785r = a1Var.O.getCurrentPosition() / 1000.0d;
                    a1 a1Var2 = a1.this;
                    a1Var2.f5786s = a1Var2.O.getDuration() / 1000.0d;
                    if (System.currentTimeMillis() - a1.this.f5787t > 1000 && !a1.this.C && com.adcolony.sdk.a.f5751d) {
                        if (a1.this.f5785r != 0.0d) {
                            a1.this.C = true;
                        } else {
                            new e0.a().a("getCurrentPosition() not working, firing ").a("AdSession.on_error").a(e0.f5981i);
                            a1.this.g();
                        }
                    }
                    if (a1.this.B) {
                        a1.this.e();
                    }
                }
                if (a1.this.f5790w && !a1.this.f5788u && !a1.this.f5791x) {
                    c0.b(a1.this.P, ug.f21009x, a1.this.f5782o);
                    c0.b(a1.this.P, "container_id", a1.this.I.c());
                    c0.a(a1.this.P, "ad_session_id", a1.this.F);
                    c0.a(a1.this.P, "elapsed", a1.this.f5785r);
                    c0.a(a1.this.P, IronSourceConstants.EVENTS_DURATION, a1.this.f5786s);
                    new h0("VideoView.on_progress", a1.this.I.k(), a1.this.P).c();
                }
                if (a1.this.f5789v || ((Activity) a10).isFinishing()) {
                    a1.this.f5789v = false;
                    a1.this.j();
                    return;
                }
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException unused) {
                    a1.this.g();
                    new e0.a().a("InterruptedException in ADCVideoView's update thread.").a(e0.f5980h);
                }
            }
            if (a1.this.f5789v) {
                a1.this.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5802a;

        i(Context context) {
            this.f5802a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.M = new j(this.f5802a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (a1.this.f5770c * 4.0f), (int) (a1.this.f5770c * 4.0f));
            layoutParams.setMargins(0, a1.this.I.b() - ((int) (a1.this.f5770c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            a1.this.I.addView(a1.this.M, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j extends View {
        j(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                j.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this, 1, null);
            } catch (Exception unused) {
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(a1.this.L, 270.0f, a1.this.f5771d, false, a1.this.f5776i);
            canvas.drawText("" + a1.this.f5774g, a1.this.L.centerX(), (float) (a1.this.L.centerY() + (a1.this.f5777j.getFontMetrics().bottom * 1.35d)), a1.this.f5777j);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(Context context, h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        super(context);
        this.f5775h = true;
        this.f5776i = new Paint();
        this.f5777j = new Paint(1);
        this.L = new RectF();
        this.P = c0.b();
        this.Q = Executors.newSingleThreadExecutor();
        this.I = cVar;
        this.H = h0Var;
        this.f5782o = i10;
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f5788u = true;
        this.f5785r = this.f5786s;
        c0.b(this.P, ug.f21009x, this.f5782o);
        c0.b(this.P, "container_id", this.I.c());
        c0.a(this.P, "ad_session_id", this.F);
        c0.a(this.P, "elapsed", this.f5785r);
        c0.a(this.P, IronSourceConstants.EVENTS_DURATION, this.f5786s);
        new h0("VideoView.on_progress", this.I.k(), this.P).c();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        g();
        e0.a aVar = new e0.a();
        aVar.a("MediaPlayer error: " + i10 + "," + i11).a(e0.f5980h);
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        l();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f5792y = true;
        if (this.D) {
            this.I.removeView(this.N);
        }
        if (this.A) {
            this.f5783p = mediaPlayer.getVideoWidth();
            this.f5784q = mediaPlayer.getVideoHeight();
            l();
            new e0.a().a("MediaPlayer getVideoWidth = ").a(mediaPlayer.getVideoWidth()).a(e0.f5977e);
            new e0.a().a("MediaPlayer getVideoHeight = ").a(mediaPlayer.getVideoHeight()).a(e0.f5977e);
        }
        f1 b10 = c0.b();
        c0.b(b10, ug.f21009x, this.f5782o);
        c0.b(b10, "container_id", this.I.c());
        c0.a(b10, "ad_session_id", this.F);
        new h0("VideoView.on_ready", this.I.k(), b10).c();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.Q;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        try {
            this.Q.submit(new g());
        } catch (RejectedExecutionException unused) {
            g();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null && !this.f5793z) {
            Surface surface = new Surface(surfaceTexture);
            this.J = surface;
            try {
                this.O.setSurface(surface);
            } catch (IllegalStateException unused) {
                new e0.a().a("IllegalStateException thrown when calling MediaPlayer.setSurface()").a(e0.f5980h);
                g();
            }
            this.K = surfaceTexture;
            return;
        }
        new e0.a().a("Null texture provided by system's onSurfaceTextureAvailable or ").a("MediaPlayer has been destroyed.").a(e0.f5981i);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.K = surfaceTexture;
        if (this.f5793z) {
            surfaceTexture.release();
            return true;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.K = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.K = surfaceTexture;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k b10 = com.adcolony.sdk.a.b();
        com.adcolony.sdk.d c10 = b10.c();
        int action = motionEvent.getAction() & 255;
        if (action == 0 || action == 1 || action == 3 || action == 2 || action == 5 || action == 6) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            f1 b11 = c0.b();
            c0.b(b11, "view_id", this.f5782o);
            c0.a(b11, "ad_session_id", this.F);
            c0.b(b11, "container_x", this.f5778k + x10);
            c0.b(b11, "container_y", this.f5779l + y10);
            c0.b(b11, "view_x", x10);
            c0.b(b11, "view_y", y10);
            c0.b(b11, ug.f21009x, this.I.c());
            if (action == 0) {
                new h0("AdContainer.on_touch_began", this.I.k(), b11).c();
            } else if (action == 1) {
                if (!this.I.p()) {
                    b10.a(c10.d().get(this.F));
                }
                new h0("AdContainer.on_touch_ended", this.I.k(), b11).c();
            } else if (action == 2) {
                new h0("AdContainer.on_touch_moved", this.I.k(), b11).c();
            } else if (action == 3) {
                new h0("AdContainer.on_touch_cancelled", this.I.k(), b11).c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", ((int) motionEvent.getX(action2)) + this.f5778k);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action2)) + this.f5779l);
                c0.b(b11, "view_x", (int) motionEvent.getX(action2));
                c0.b(b11, "view_y", (int) motionEvent.getY(action2));
                new h0("AdContainer.on_touch_began", this.I.k(), b11).c();
            } else if (action == 6) {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", ((int) motionEvent.getX(action3)) + this.f5778k);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action3)) + this.f5779l);
                c0.b(b11, "view_x", (int) motionEvent.getX(action3));
                c0.b(b11, "view_y", (int) motionEvent.getY(action3));
                if (!this.I.p()) {
                    b10.a(c10.d().get(this.F));
                }
                new h0("AdContainer.on_touch_ended", this.I.k(), b11).c();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        f1 b10 = c0.b();
        c0.a(b10, ug.f21009x, this.F);
        new h0("AdSession.on_error", this.I.k(), b10).c();
        this.f5788u = true;
    }

    private void l() {
        double min = Math.min(this.f5780m / this.f5783p, this.f5781n / this.f5784q);
        int i10 = (int) (this.f5783p * min);
        int i11 = (int) (this.f5784q * min);
        new e0.a().a("setMeasuredDimension to ").a(i10).a(" by ").a(i11).a(e0.f5977e);
        setMeasuredDimension(i10, i11);
        if (this.A) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i10;
            layoutParams.height = i11;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    private void m() {
        try {
            this.Q.submit(new h());
        } catch (RejectedExecutionException unused) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        if (!this.f5792y) {
            new e0.a().a("ADCVideoView pause() called while MediaPlayer is not prepared.").a(e0.f5979g);
            return false;
        } else if (this.f5790w) {
            this.O.getCurrentPosition();
            this.f5786s = this.O.getDuration();
            this.O.pause();
            this.f5791x = true;
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        if (this.f5792y) {
            if (!this.f5791x && com.adcolony.sdk.a.f5751d) {
                this.O.start();
                m();
            } else if (!this.f5788u && com.adcolony.sdk.a.f5751d) {
                this.O.start();
                this.f5791x = false;
                if (!this.Q.isShutdown()) {
                    m();
                }
                j jVar = this.M;
                if (jVar != null) {
                    jVar.invalidate();
                }
            }
            setWillNotDraw(false);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        new e0.a().a("MediaPlayer stopped and released.").a(e0.f5977e);
        try {
            if (!this.f5788u && this.f5792y && this.O.isPlaying()) {
                this.O.stop();
            }
        } catch (IllegalStateException unused) {
            new e0.a().a("Caught IllegalStateException when calling stop on MediaPlayer").a(e0.f5979g);
        }
        ProgressBar progressBar = this.N;
        if (progressBar != null) {
            this.I.removeView(progressBar);
        }
        this.f5788u = true;
        this.f5792y = false;
        this.O.release();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.f5789v = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Context a10;
        f1 a11 = this.H.a();
        this.F = c0.h(a11, "ad_session_id");
        this.f5778k = c0.d(a11, "x");
        this.f5779l = c0.d(a11, "y");
        this.f5780m = c0.d(a11, "width");
        this.f5781n = c0.d(a11, "height");
        this.B = c0.b(a11, "enable_timer");
        this.D = c0.b(a11, "enable_progress");
        this.E = c0.h(a11, "filepath");
        this.f5783p = c0.d(a11, "video_width");
        this.f5784q = c0.d(a11, "video_height");
        this.f5773f = com.adcolony.sdk.a.b().n().s();
        new e0.a().a("Original video dimensions = ").a(this.f5783p).a("x").a(this.f5784q).a(e0.f5975c);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5780m, this.f5781n);
        layoutParams.setMargins(this.f5778k, this.f5779l, 0, 0);
        layoutParams.gravity = 0;
        this.I.addView(this, layoutParams);
        if (this.D && (a10 = com.adcolony.sdk.a.a()) != null) {
            ProgressBar progressBar = new ProgressBar(a10);
            this.N = progressBar;
            com.adcolony.sdk.c cVar = this.I;
            int i10 = (int) (this.f5773f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i10, i10, 17));
        }
        this.O = new MediaPlayer();
        this.f5792y = false;
        try {
            if (!this.E.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.E);
                this.G = fileInputStream;
                this.O.setDataSource(fileInputStream.getFD());
            } else {
                this.A = true;
                this.O.setDataSource(this.E);
            }
            this.O.setOnErrorListener(this);
            this.O.setOnPreparedListener(this);
            this.O.setOnCompletionListener(this);
            this.O.prepareAsync();
        } catch (IOException e8) {
            new e0.a().a("Failed to create/prepare MediaPlayer: ").a(e8.toString()).a(e0.f5980h);
            g();
        }
        this.I.i().add(com.adcolony.sdk.a.a("VideoView.play", (j0) new a(), true));
        this.I.i().add(com.adcolony.sdk.a.a("VideoView.set_bounds", (j0) new b(), true));
        this.I.i().add(com.adcolony.sdk.a.a("VideoView.set_visible", (j0) new c(), true));
        this.I.i().add(com.adcolony.sdk.a.a("VideoView.pause", (j0) new d(), true));
        this.I.i().add(com.adcolony.sdk.a.a("VideoView.seek_to_time", (j0) new e(), true));
        this.I.i().add(com.adcolony.sdk.a.a("VideoView.set_volume", (j0) new f(), true));
        this.I.j().add("VideoView.play");
        this.I.j().add("VideoView.set_bounds");
        this.I.j().add("VideoView.set_visible");
        this.I.j().add("VideoView.pause");
        this.I.j().add("VideoView.seek_to_time");
        this.I.j().add("VideoView.set_volume");
    }

    void e() {
        Rect rect;
        if (this.f5775h) {
            this.f5772e = (float) (360.0d / this.f5786s);
            this.f5777j.setColor(-3355444);
            this.f5777j.setShadowLayer((int) (this.f5773f * 2.0f), 0.0f, 0.0f, -16777216);
            this.f5777j.setTextAlign(Paint.Align.CENTER);
            this.f5777j.setLinearText(true);
            this.f5777j.setTextSize(this.f5773f * 12.0f);
            this.f5776i.setStyle(Paint.Style.STROKE);
            float f10 = this.f5773f * 2.0f;
            if (f10 > 6.0f) {
                f10 = 6.0f;
            }
            if (f10 < 4.0f) {
                f10 = 4.0f;
            }
            this.f5776i.setStrokeWidth(f10);
            this.f5776i.setShadowLayer((int) (this.f5773f * 3.0f), 0.0f, 0.0f, -16777216);
            this.f5776i.setColor(-3355444);
            this.f5777j.getTextBounds("0123456789", 0, 9, new Rect());
            this.f5770c = rect.height();
            Context a10 = com.adcolony.sdk.a.a();
            if (a10 != null) {
                z0.b(new i(a10));
            }
            this.f5775h = false;
        }
        this.f5774g = (int) (this.f5786s - this.f5785r);
        float f11 = this.f5770c;
        float f12 = (int) f11;
        this.f5768a = f12;
        float f13 = (int) (3.0f * f11);
        this.f5769b = f13;
        float f14 = f11 / 2.0f;
        float f15 = f11 * 2.0f;
        this.L.set(f12 - f14, f13 - f15, f12 + f15, f13 + f14);
        this.f5771d = (float) (this.f5772e * (this.f5786s - this.f5785r));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f5788u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(h0 h0Var) {
        f1 a10 = h0Var.a();
        this.f5778k = c0.d(a10, "x");
        this.f5779l = c0.d(a10, "y");
        this.f5780m = c0.d(a10, "width");
        this.f5781n = c0.d(a10, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f5778k, this.f5779l, 0, 0);
        layoutParams.width = this.f5780m;
        layoutParams.height = this.f5781n;
        setLayoutParams(layoutParams);
        if (!this.B || this.M == null) {
            return;
        }
        int i10 = (int) (this.f5770c * 4.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10);
        layoutParams2.setMargins(0, this.I.b() - ((int) (this.f5770c * 4.0f)), 0, 0);
        layoutParams2.gravity = 0;
        this.M.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(h0 h0Var) {
        if (this.f5792y) {
            if (this.f5788u) {
                this.f5788u = false;
            }
            this.R = h0Var;
            int d10 = c0.d(h0Var.a(), "time");
            int duration = this.O.getDuration() / 1000;
            this.O.setOnSeekCompleteListener(this);
            this.O.seekTo(d10 * 1000);
            if (duration == d10) {
                this.f5788u = true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.K != null) {
            this.f5793z = true;
        }
        this.Q.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        f1 a10 = h0Var.a();
        return c0.d(a10, ug.f21009x) == this.f5782o && c0.d(a10, "container_id") == this.I.c() && c0.h(a10, "ad_session_id").equals(this.I.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaPlayer b() {
        return this.O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.O != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(h0 h0Var) {
        if (this.f5792y) {
            float c10 = (float) c0.c(h0Var.a(), "volume");
            AdColonyInterstitial j10 = com.adcolony.sdk.a.b().j();
            if (j10 != null) {
                j10.a(((double) c10) <= 0.0d);
            }
            this.O.setVolume(c10, c10);
            f1 b10 = c0.b();
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(h0 h0Var) {
        j jVar;
        j jVar2;
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
            if (!this.B || (jVar2 = this.M) == null) {
                return;
            }
            jVar2.setVisibility(0);
            return;
        }
        setVisibility(4);
        if (!this.B || (jVar = this.M) == null) {
            return;
        }
        jVar.setVisibility(4);
    }
}
