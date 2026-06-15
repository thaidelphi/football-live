package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.c8;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t1 extends p1 implements AppLovinCommunicatorSubscriber {
    private final u1 J;
    private MediaPlayer K;
    private final View L;
    protected final AppLovinVideoView M;
    protected final com.applovin.impl.a N;
    protected final com.applovin.impl.adview.g O;
    protected f0 P;
    protected final ImageView Q;
    protected com.applovin.impl.adview.l R;
    protected final ProgressBar S;
    protected ProgressBar T;
    protected ImageView U;
    private final e V;
    private final d W;
    private final Handler X;
    private final Handler Y;
    protected final x0 Z;

    /* renamed from: a0  reason: collision with root package name */
    protected final x0 f9217a0;

    /* renamed from: b0  reason: collision with root package name */
    private final boolean f9218b0;

    /* renamed from: c0  reason: collision with root package name */
    protected boolean f9219c0;

    /* renamed from: d0  reason: collision with root package name */
    protected long f9220d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f9221e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f9222f0;

    /* renamed from: g0  reason: collision with root package name */
    protected boolean f9223g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f9224h0;

    /* renamed from: i0  reason: collision with root package name */
    private final AtomicBoolean f9225i0;

    /* renamed from: j0  reason: collision with root package name */
    private final AtomicBoolean f9226j0;

    /* renamed from: k0  reason: collision with root package name */
    private long f9227k0;

    /* renamed from: l0  reason: collision with root package name */
    private long f9228l0;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements x0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9229a;

        a(int i10) {
            this.f9229a = i10;
        }

        @Override // com.applovin.impl.x0.b
        public void a() {
            t1 t1Var = t1.this;
            if (t1Var.P != null) {
                long seconds = this.f9229a - TimeUnit.MILLISECONDS.toSeconds(t1Var.M.getCurrentPosition());
                if (seconds <= 0) {
                    t1.this.f8342t = true;
                } else if (t1.this.N()) {
                    t1.this.P.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.x0.b
        public boolean b() {
            return t1.this.N();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements x0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f9231a;

        b(Integer num) {
            this.f9231a = num;
        }

        @Override // com.applovin.impl.x0.b
        public void a() {
            t1 t1Var = t1.this;
            if (t1Var.f9223g0) {
                t1Var.S.setVisibility(8);
                return;
            }
            t1.this.S.setProgress((int) ((t1Var.M.getCurrentPosition() / ((float) t1.this.f9220d0)) * this.f9231a.intValue()));
        }

        @Override // com.applovin.impl.x0.b
        public boolean b() {
            return !t1.this.f9223g0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements x0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f9233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f9234b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Long f9235c;

        c(long j10, Integer num, Long l10) {
            this.f9233a = j10;
            this.f9234b = num;
            this.f9235c = l10;
        }

        @Override // com.applovin.impl.x0.b
        public void a() {
            t1.this.T.setProgress((int) ((((float) t1.this.f8338p) / ((float) this.f9233a)) * this.f9234b.intValue()));
            t1.this.f8338p += this.f9235c.longValue();
        }

        @Override // com.applovin.impl.x0.b
        public boolean b() {
            return t1.this.f8338p < this.f9233a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class d implements c8.a {
        private d() {
        }

        @Override // com.applovin.impl.c8.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            t1.this.c();
        }

        @Override // com.applovin.impl.c8.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            t1.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.c8.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            t1.this.G = true;
        }

        @Override // com.applovin.impl.c8.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            t1.this.R();
        }

        /* synthetic */ d(t1 t1Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.c8.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            t1.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.c8.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            b7.b(uri, t1.this.f8330h.getController().g(), t1.this.f8324b);
        }

        @Override // com.applovin.impl.c8.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            b7.a(uri, t1.this.f8330h.getController(), t1.this.f8324b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            t1.this.a(motionEvent, (Bundle) null);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "Video completed");
            }
            t1.this.f9224h0 = true;
            t1 t1Var = t1.this;
            if (!t1Var.f8340r) {
                t1Var.Q();
            } else if (t1Var.h()) {
                t1.this.x();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            t1 t1Var = t1.this;
            t1Var.d("Video view error (" + i10 + "," + i11 + ")");
            t1.this.M.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = t1.this.f8325c;
                nVar2.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i10 + ", " + i11 + ")");
            }
            if (i10 == 701) {
                t1.this.P();
                return false;
            } else if (i10 != 3) {
                if (i10 == 702) {
                    t1.this.B();
                    return false;
                }
                return false;
            } else {
                t1.this.Z.b();
                t1 t1Var = t1.this;
                if (t1Var.O != null) {
                    t1Var.M();
                }
                t1.this.B();
                if (t1.this.D.b()) {
                    t1.this.u();
                    return false;
                }
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            t1.this.K = mediaPlayer;
            mediaPlayer.setOnInfoListener(t1.this.V);
            mediaPlayer.setOnErrorListener(t1.this.V);
            float f10 = !t1.this.f9219c0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            t1.this.f8341s = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            t1.this.c(mediaPlayer.getDuration());
            t1.this.L();
            com.applovin.impl.sdk.n nVar = t1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                t1.this.f8325c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + t1.this.K);
            }
        }

        /* synthetic */ e(t1 t1Var, a aVar) {
            this();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1 t1Var = t1.this;
            if (view == t1Var.O) {
                t1Var.R();
            } else if (view == t1Var.Q) {
                t1Var.S();
            } else if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = t1.this.f8325c;
                nVar.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(t1 t1Var, a aVar) {
            this();
        }
    }

    public t1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.J = new u1(this.f8323a, this.f8326d, this.f8324b);
        this.U = null;
        e eVar = new e(this, null);
        this.V = eVar;
        d dVar = new d(this, null);
        this.W = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.X = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.Y = handler2;
        x0 x0Var = new x0(handler, this.f8324b);
        this.Z = x0Var;
        this.f9217a0 = new x0(handler2, this.f8324b);
        boolean G0 = this.f8323a.G0();
        this.f9218b0 = G0;
        this.f9219c0 = d7.e(this.f8324b);
        this.f9222f0 = -1;
        this.f9225i0 = new AtomicBoolean();
        this.f9226j0 = new AtomicBoolean();
        this.f9227k0 = -2L;
        this.f9228l0 = 0L;
        if (bVar.hasVideoUrl()) {
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.M = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(eVar);
            appLovinVideoView.setOnCompletionListener(eVar);
            appLovinVideoView.setOnErrorListener(eVar);
            bVar.e().putString("video_view_address", u7.a(appLovinVideoView));
            View view = new View(activity);
            this.L = view;
            boolean z10 = false;
            view.setBackgroundColor(Color.argb(254, 0, 0, 0));
            if (((Boolean) jVar.a(o4.f8212s1)).booleanValue()) {
                view.setOnTouchListener(new AppLovinTouchToClickListener(jVar, o4.f8155l0, activity, eVar));
            } else {
                appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(jVar, o4.f8155l0, activity, eVar));
                view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.wd
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        boolean a10;
                        a10 = t1.a(view2, motionEvent);
                        return a10;
                    }
                });
            }
            f fVar = new f(this, null);
            if (bVar.i0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.a0(), activity);
                this.O = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.O = null;
            }
            if (a(this.f9219c0, jVar)) {
                ImageView imageView = new ImageView(activity);
                this.Q = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                d(this.f9219c0);
            } else {
                this.Q = null;
            }
            String f02 = bVar.f0();
            if (StringUtils.isValidString(f02)) {
                c8 c8Var = new c8(jVar);
                c8Var.a(new WeakReference(dVar));
                com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.e0(), bVar, c8Var, activity);
                this.R = lVar;
                lVar.a(f02);
            } else {
                this.R = null;
            }
            if (G0) {
                com.applovin.impl.a aVar = new com.applovin.impl.a(activity, ((Integer) jVar.a(o4.f8229u2)).intValue(), 16842874);
                this.N = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                aVar.setBackgroundColor(Color.parseColor("#00000000"));
                aVar.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.N = null;
            }
            int d10 = d();
            if (((Boolean) jVar.a(o4.Z1)).booleanValue() && d10 > 0) {
                z10 = true;
            }
            if (this.P == null && z10) {
                this.P = new f0(activity);
                int q10 = bVar.q();
                this.P.setTextColor(q10);
                this.P.setTextSize(((Integer) jVar.a(o4.Y1)).intValue());
                this.P.setFinishedStrokeColor(q10);
                this.P.setFinishedStrokeWidth(((Integer) jVar.a(o4.X1)).intValue());
                this.P.setMax(d10);
                this.P.setProgress(d10);
                x0Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(d10));
            }
            if (bVar.p0()) {
                Integer num = (Integer) jVar.a(o4.f8213s2);
                ProgressBar progressBar = new ProgressBar(activity, null, 16842872);
                this.S = progressBar;
                a(progressBar, bVar.o0(), num.intValue());
                x0Var.a("PROGRESS_BAR", ((Long) jVar.a(o4.f8205r2)).longValue(), new b(num));
                return;
            }
            this.S = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        com.applovin.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        com.applovin.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.a();
            final com.applovin.impl.a aVar2 = this.N;
            Objects.requireNonNull(aVar2);
            a(new Runnable() { // from class: com.applovin.impl.yd
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f9227k0 = -1L;
        this.f9228l0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f8337o = SystemClock.elapsedRealtime();
    }

    private void J() {
        com.applovin.impl.adview.l lVar;
        t7 g02 = this.f8323a.g0();
        if (g02 == null || !g02.j() || this.f9223g0 || (lVar = this.R) == null) {
            return;
        }
        final boolean z10 = lVar.getVisibility() == 4;
        final long h10 = g02.h();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.xd
            @Override // java.lang.Runnable
            public final void run() {
                t1.this.b(z10, h10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (this.f9223g0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f8325c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f8324b.e0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f8325c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.f9222f0 >= 0) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f8325c;
                nVar.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f9222f0 + "ms for MediaPlayer: " + this.K);
            }
            this.M.seekTo(this.f9222f0);
            this.M.start();
            this.Z.b();
            this.f9222f0 = -1;
            a(new Runnable() { // from class: com.applovin.impl.de
                @Override // java.lang.Runnable
                public final void run() {
                    t1.this.F();
                }
            }, 250L);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.f9226j0.compareAndSet(false, true)) {
            a(this.O, this.f8323a.i0(), new Runnable() { // from class: com.applovin.impl.zd
                @Override // java.lang.Runnable
                public final void run() {
                    t1.this.G();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z10) {
        this.f9221e0 = z();
        if (z10) {
            this.M.pause();
        } else {
            this.M.stopPlayback();
        }
    }

    public void A() {
        this.f8345w++;
        if (this.f8323a.B()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f8325c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            c();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Skipping video...");
        }
        Q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.be
            @Override // java.lang.Runnable
            public final void run() {
                t1.this.E();
            }
        });
    }

    protected boolean C() {
        if (this.G && this.f8323a.Y0()) {
            return true;
        }
        return D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean D() {
        return z() >= this.f8323a.k0();
    }

    protected void L() {
        long W;
        long millis;
        if (this.f8323a.V() >= 0 || this.f8323a.W() >= 0) {
            if (this.f8323a.V() >= 0) {
                W = this.f8323a.V();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f8323a;
                long j10 = this.f9220d0;
                long j11 = j10 > 0 ? j10 : 0L;
                if (aVar.V0()) {
                    int f12 = (int) ((com.applovin.impl.sdk.ad.a) this.f8323a).f1();
                    if (f12 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(f12);
                    } else {
                        int p10 = (int) aVar.p();
                        if (p10 > 0) {
                            millis = TimeUnit.SECONDS.toMillis(p10);
                        }
                    }
                    j11 += millis;
                }
                W = (long) (j11 * (this.f8323a.W() / 100.0d));
            }
            b(W);
        }
    }

    protected boolean N() {
        return (this.f8342t || this.f9223g0 || !this.M.isPlaying()) ? false : true;
    }

    protected boolean O() {
        return h() && !C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.fe
            @Override // java.lang.Runnable
            public final void run() {
                t1.this.H();
            }
        });
    }

    public void Q() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        e(this.f8323a.c1());
        long U = this.f8323a.U();
        if (U > 0) {
            this.f8338p = 0L;
            Long l10 = (Long) this.f8324b.a(o4.A2);
            Integer num = (Integer) this.f8324b.a(o4.D2);
            ProgressBar progressBar = new ProgressBar(this.f8326d, null, 16842872);
            this.T = progressBar;
            a(progressBar, this.f8323a.T(), num.intValue());
            this.f9217a0.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), new c(U, num, l10));
            this.f9217a0.b();
        }
        this.J.a(this.f8332j, this.f8331i, this.f8330h, this.T);
        a("javascript:al_onPoststitialShow(" + this.f8345w + "," + this.f8346x + ");", this.f8323a.D());
        if (this.f8332j != null) {
            if (this.f8323a.p() >= 0) {
                a(this.f8332j, this.f8323a.p(), new Runnable() { // from class: com.applovin.impl.ae
                    @Override // java.lang.Runnable
                    public final void run() {
                        t1.this.I();
                    }
                });
            } else {
                this.f8332j.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f8332j;
        if (gVar != null) {
            arrayList.add(new x3(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f8331i;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f8331i;
            arrayList.add(new x3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = this.T;
        if (progressBar2 != null) {
            arrayList.add(new x3(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f8323a.getAdEventTracker().b(this.f8330h, arrayList);
        o();
        this.f9223g0 = true;
    }

    public void R() {
        this.f9227k0 = SystemClock.elapsedRealtime() - this.f9228l0;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.f9227k0 + "ms");
        }
        if (O()) {
            u();
            m();
            if (com.applovin.impl.sdk.n.a()) {
                this.f8325c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.D.e();
            return;
        }
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S() {
        MediaPlayer mediaPlayer = this.K;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f9219c0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = !this.f9219c0;
            this.f9219c0 = z10;
            d(z10);
            a(this.f9219c0, 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f8323a);
        }
        if (this.f9225i0.compareAndSet(false, true)) {
            if (((Boolean) this.f8324b.a(o4.P0)).booleanValue()) {
                this.f8324b.A().d(this.f8323a, com.applovin.impl.sdk.j.m());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.B;
            if (appLovinAdDisplayListener instanceof f2) {
                ((f2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.f8324b.D().a(this.f8323a instanceof e7 ? "handleVastVideoError" : "handleVideoError", str, this.f8323a);
            c();
        }
    }

    @Override // com.applovin.impl.p1
    public void f() {
        super.f();
        this.J.a(this.R);
        this.J.a((View) this.O);
        if (!h() || this.f9223g0) {
            x();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.p1
    protected void l() {
        super.a(z(), this.f9218b0, C(), this.f9227k0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f8323a.getAdIdNumber() && this.f9218b0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i10 >= 200 && i10 < 300) || this.f9224h0 || this.M.isPlaying()) {
                    return;
                }
                d("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.p1
    public void q() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f8324b.a(o4.V5)).booleanValue()) {
                e8.b(this.R);
                this.R = null;
            }
            if (this.f9218b0) {
                AppLovinCommunicator.getInstance(this.f8326d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.M;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.M.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.K;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.q();
    }

    @Override // com.applovin.impl.p1
    public void u() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f9222f0 = this.M.getCurrentPosition();
        this.M.pause();
        this.Z.c();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.a("AppLovinFullscreenActivity", "Paused video at position " + this.f9222f0 + "ms");
        }
    }

    @Override // com.applovin.impl.p1
    public void v() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.p1
    protected void x() {
        this.J.a(this.f8333k);
        this.f8337o = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int z() {
        long currentPosition = this.M.getCurrentPosition();
        if (this.f9224h0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.f9220d0)) * 100.0f);
        }
        return this.f9221e0;
    }

    @Override // com.applovin.impl.p1
    public void b(boolean z10) {
        super.b(z10);
        if (z10) {
            a(0L);
            if (this.f9223g0) {
                this.f9217a0.b();
            }
        } else if (this.f9223g0) {
            this.f9217a0.c();
        } else {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(long j10) {
        this.f9220d0 = j10;
    }

    @Override // com.applovin.impl.p1
    public void c() {
        this.Z.a();
        this.f9217a0.a();
        this.X.removeCallbacksAndMessages(null);
        this.Y.removeCallbacksAndMessages(null);
        l();
        super.c();
    }

    @Override // com.applovin.impl.p1
    public void a(ViewGroup viewGroup) {
        String str;
        this.J.a(this.Q, this.O, this.R, this.N, this.S, this.P, this.M, this.L, this.f8330h, this.f8331i, this.U, viewGroup);
        if (l0.i() && (str = this.f8324b.f0().getExtraParameters().get("audio_focus_request")) != null) {
            this.M.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (a(!this.f9218b0)) {
            return;
        }
        this.M.setVideoURI(this.f8323a.q0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        com.applovin.impl.adview.k kVar = this.f8331i;
        if (kVar != null) {
            kVar.b();
        }
        this.M.start();
        if (this.f9218b0) {
            P();
        }
        this.f8330h.renderAd(this.f8323a);
        if (this.O != null) {
            this.f8324b.i0().a(new k6(this.f8324b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.ce
                @Override // java.lang.Runnable
                public final void run() {
                    t1.this.M();
                }
            }), u5.b.TIMEOUT, this.f8323a.j0(), true);
        }
        super.c(this.f9219c0);
    }

    @Override // com.applovin.impl.p1
    public void e() {
        super.e();
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10, long j10) {
        if (z10) {
            u7.a(this.R, j10, (Runnable) null);
        } else {
            u7.b(this.R, j10, (Runnable) null);
        }
    }

    private void d(boolean z10) {
        if (l0.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f8326d.getDrawable(z10 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.Q.setScaleType(ImageView.ScaleType.FIT_XY);
                this.Q.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.Q, z10 ? this.f8323a.M() : this.f8323a.d0(), this.f8324b);
    }

    @Override // com.applovin.impl.c2.a
    public void b() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p1
    public void a(final String str, long j10) {
        super.a(str, j10);
        if (this.R == null || j10 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.ge
            @Override // java.lang.Runnable
            public final void run() {
                t1.this.a(str);
            }
        }, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        e8.a(this.R, str, "AppLovinFullscreenActivity", this.f8324b);
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        if (l0.f()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f8323a.F0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f8325c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri h02 = this.f8323a.h0();
            if (h02 != null) {
                if (!((Boolean) this.f8324b.a(o4.A)).booleanValue() || (context = this.f8326d) == null) {
                    AppLovinAdView appLovinAdView = this.f8330h;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.j.m();
                }
                this.f8324b.j().trackAndLaunchVideoClick(this.f8323a, h02, motionEvent, bundle, this, context);
                l2.a(this.A, this.f8323a);
                this.f8346x++;
                return;
            }
            return;
        }
        J();
    }

    @Override // com.applovin.impl.p1
    public void a(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.ee
            @Override // java.lang.Runnable
            public final void run() {
                t1.this.K();
            }
        }, j10);
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.j jVar) {
        if (((Boolean) jVar.a(o4.f8141j2)).booleanValue()) {
            if (!((Boolean) jVar.a(o4.f8149k2)).booleanValue() || z10) {
                return true;
            }
            return ((Boolean) jVar.a(o4.f8165m2)).booleanValue();
        }
        return false;
    }

    @Override // com.applovin.impl.c2.a
    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        A();
    }
}
