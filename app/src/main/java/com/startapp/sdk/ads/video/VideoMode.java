package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.startio.adsession.media.InteractionType;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.adsession.media.Position;
import com.iab.omid.library.startio.adsession.media.VastProperties;
import com.ironsource.b9;
import com.ironsource.cc;
import com.startapp.c5;
import com.startapp.f0;
import com.startapp.g9;
import com.startapp.h4;
import com.startapp.ia;
import com.startapp.j6;
import com.startapp.j9;
import com.startapp.ja;
import com.startapp.ka;
import com.startapp.l3;
import com.startapp.ma;
import com.startapp.na;
import com.startapp.o9;
import com.startapp.oa;
import com.startapp.p4;
import com.startapp.pa;
import com.startapp.q;
import com.startapp.qa;
import com.startapp.ra;
import com.startapp.sa;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.ta;
import com.startapp.ua;
import com.startapp.y;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class VideoMode extends h4 {
    public NativeVideoPlayer P;
    public VideoView Q;
    public RelativeLayout R;
    public RelativeLayout S;
    public ProgressBar T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f22749a0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f22751c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f22752d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f22753e0;

    /* renamed from: g0  reason: collision with root package name */
    public int f22755g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f22756h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f22757i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22758j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f22759k0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f22768t0;
    public int Y = 1;

    /* renamed from: b0  reason: collision with root package name */
    public int f22750b0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public int f22754f0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public String f22760l0 = null;

    /* renamed from: m0  reason: collision with root package name */
    public final Handler f22761m0 = new Handler();

    /* renamed from: n0  reason: collision with root package name */
    public final HashMap f22762n0 = new HashMap();

    /* renamed from: o0  reason: collision with root package name */
    public final HashMap f22763o0 = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    public final HashMap f22764p0 = new HashMap();

    /* renamed from: q0  reason: collision with root package name */
    public final HashMap f22765q0 = new HashMap();

    /* renamed from: r0  reason: collision with root package name */
    public final Handler f22766r0 = new Handler();

    /* renamed from: s0  reason: collision with root package name */
    public final a f22767s0 = new a();

    /* renamed from: u0  reason: collision with root package name */
    public final b f22769u0 = new b();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum HtmlMode {
        /* JADX INFO: Fake field, exist only in values array */
        PLAYER,
        POST_ROLL
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum VideoFinishedReason {
        COMPLETE,
        CLICKED,
        SKIPPED
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoMode videoMode = VideoMode.this;
            if (videoMode.V && videoMode.B()) {
                VideoMode videoMode2 = VideoMode.this;
                if (videoMode2.W) {
                    int u10 = videoMode2.u();
                    VideoMode videoMode3 = VideoMode.this;
                    int v10 = videoMode3.v();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long j10 = u10;
                    long seconds = timeUnit.toSeconds(j10);
                    if (seconds > videoMode3.f22759k0) {
                        videoMode3.f22759k0 = seconds;
                        videoMode3.a("videoApi.setVideoCurrentPosition", Long.valueOf(seconds));
                        if (u10 != v10 || videoMode3.f22757i0) {
                            v10 -= u10;
                        }
                        videoMode3.a("videoApi.setVideoRemainingTimer", Long.valueOf(timeUnit.toSeconds(v10)));
                        if (videoMode3.E > 0 || videoMode3.C() || videoMode3.Z) {
                            long j11 = 0;
                            if (!videoMode3.Z && videoMode3.E <= 0) {
                                long g10 = videoMode3.w().g();
                                NativeVideoPlayer nativeVideoPlayer = videoMode3.P;
                                if (nativeVideoPlayer != null) {
                                    if (nativeVideoPlayer.f22820g != null) {
                                        g10 = Math.min(g10, nativeVideoPlayer.f22821h.getDuration());
                                    }
                                }
                                long seconds2 = timeUnit.toSeconds(g10) - timeUnit.toSeconds(j10);
                                if (seconds2 > 0) {
                                    j11 = seconds2;
                                }
                            }
                            videoMode3.a("videoApi.setSkipTimer", Long.valueOf(j11));
                        }
                    }
                    VideoMode.this.b(u10);
                }
            }
            VideoMode.this.f22766r0.postDelayed(this, 200L);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (VideoMode.this.f22769u0.isInitialStickyBroadcast()) {
                return;
            }
            VideoMode videoMode = VideoMode.this;
            videoMode.U = !videoMode.U;
            videoMode.D();
            VideoMode videoMode2 = VideoMode.this;
            videoMode2.a(videoMode2.U);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends h4.h {

        /* compiled from: Sta */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoMode.this.j();
                VideoMode.this.t();
            }
        }

        public c() {
            super();
        }

        @Override // com.startapp.h4.h, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            VideoMode.this.f22766r0.postDelayed(new a(), AdsCommonMetaData.f22889h.G().b() * 1000);
        }
    }

    public final boolean A() {
        return !this.f22751c0 ? B() && this.V : this.f22750b0 >= AdsCommonMetaData.f22889h.G().j() && B() && this.V;
    }

    public final boolean B() {
        NativeVideoPlayer nativeVideoPlayer = this.P;
        if (nativeVideoPlayer != null) {
            if (nativeVideoPlayer.f22820g != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        NativeVideoPlayer nativeVideoPlayer;
        boolean n10 = w().n();
        Long h10 = w().h();
        if (h10 == null || (nativeVideoPlayer = this.P) == null) {
            return n10;
        }
        if (nativeVideoPlayer.f22820g != null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return n10 && timeUnit.toSeconds((long) nativeVideoPlayer.f22821h.getDuration()) > timeUnit.toSeconds(h10.longValue());
        }
        return n10;
    }

    public final void D() {
        NativeVideoPlayer nativeVideoPlayer = this.P;
        if (nativeVideoPlayer != null) {
            try {
                boolean z10 = this.U;
                MediaPlayer mediaPlayer = nativeVideoPlayer.f22820g;
                if (mediaPlayer != null) {
                    if (z10) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.U ? "OFF" : "ON";
        a("videoApi.setSound", objArr);
    }

    public final void E() {
        if (this.P == null) {
            return;
        }
        boolean q10 = AdsCommonMetaData.f22889h.G().q();
        String c10 = w().c();
        boolean z10 = true;
        if (c10 != null) {
            NativeVideoPlayer nativeVideoPlayer = this.P;
            if (nativeVideoPlayer != null) {
                nativeVideoPlayer.a(c10);
            }
            if (q10) {
                d.b.f22797a.getClass();
                if (c10.endsWith(".temp")) {
                    this.f22751c0 = true;
                    this.f22753e0 = true;
                    this.f22750b0 = AdsCommonMetaData.f22889h.G().j();
                }
            }
        } else if (q10) {
            String j10 = w().j();
            d dVar = d.b.f22797a;
            if (j10 != null) {
                if (j10.equals(dVar.f22796c)) {
                    dVar.f22794a = false;
                }
            } else {
                dVar.getClass();
            }
            NativeVideoPlayer nativeVideoPlayer2 = this.P;
            if (nativeVideoPlayer2 != null) {
                nativeVideoPlayer2.a(j10);
            }
            this.f22751c0 = true;
            ProgressBar progressBar = this.T;
            if (progressBar == null || !progressBar.isShown()) {
                z10 = false;
            }
            if (!z10) {
                this.f22761m0.postDelayed(new na(this), AdsCommonMetaData.f22889h.G().h());
            }
        } else {
            a(VideoFinishedReason.SKIPPED);
        }
        if (this.f22760l0 == null) {
            this.f22760l0 = this.f22751c0 ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : "1";
        }
    }

    public final void F() {
        VideoView videoView;
        j6 j6Var;
        this.f22752d0 = true;
        if (this.f22757i0) {
            NativeVideoPlayer nativeVideoPlayer = this.P;
            if (nativeVideoPlayer != null) {
                nativeVideoPlayer.f22821h.pause();
                return;
            }
            return;
        }
        boolean z10 = u() == 0;
        if (z10) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a("videoApi.setVideoDuration", Long.valueOf(timeUnit.toSeconds(v())));
            a("videoApi.setVideoRemainingTimer", 0);
            Object[] objArr = new Object[1];
            long g10 = w().g();
            NativeVideoPlayer nativeVideoPlayer2 = this.P;
            if (nativeVideoPlayer2 != null) {
                if (nativeVideoPlayer2.f22820g != null) {
                    g10 = Math.min(g10, nativeVideoPlayer2.f22821h.getDuration());
                }
            }
            objArr[0] = Long.valueOf(timeUnit.toSeconds(g10));
            a("videoApi.setSkipTimer", objArr);
            a("videoApi.setVideoCurrentPosition", Long.valueOf(timeUnit.toSeconds(u())));
        }
        if (this.P != null) {
            if (z10) {
                a((ImageButton) null);
            }
            NativeVideoPlayer nativeVideoPlayer3 = this.P;
            if (nativeVideoPlayer3 != null) {
                nativeVideoPlayer3.f22821h.start();
                this.f22015x.setBackgroundColor(33554431);
            }
            int v10 = v();
            if (z10 && v10 > 0 && (j6Var = this.H) != null) {
                float f10 = v10;
                float f11 = this.U ? 0.0f : 1.0f;
                MediaEvents mediaEvents = j6Var.f22142c;
                if (mediaEvents != null) {
                    mediaEvents.start(f10, f11);
                }
            }
            G();
            if (this.f22752d0 && (videoView = this.Q) != null) {
                a(videoView);
            }
        }
        this.f22202c.f22957b.setVisibility(0);
        D();
    }

    public final void G() {
        ProgressBar progressBar;
        this.f22761m0.removeCallbacksAndMessages(null);
        ProgressBar progressBar2 = this.T;
        if (!(progressBar2 != null && progressBar2.isShown()) || (progressBar = this.T) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.startapp.h4, com.startapp.l2
    public final void a(Bundle bundle) {
        boolean z10;
        super.a(bundle);
        try {
            this.f22755g0 = 100 / AdsCommonMetaData.f22889h.G().i();
            x();
            z();
            if (!w().o() && !AdsCommonMetaData.f22889h.G().m().equals("muted")) {
                z10 = false;
                this.U = z10;
            }
            z10 = true;
            this.U = z10;
        } catch (Throwable th) {
            l3.a(th);
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            c5.a(this.f22201b).a(intent);
            this.X = true;
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r6 <= 0) goto L50;
     */
    @Override // com.startapp.h4, com.startapp.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r10 = this;
            boolean r0 = r10.f22757i0
            r1 = 0
            if (r0 == 0) goto L9
            r10.i()
            return r1
        L9:
            com.startapp.sdk.ads.video.player.NativeVideoPlayer r0 = r10.P
            if (r0 != 0) goto Le
            return r1
        Le:
            int r0 = r10.u()
            boolean r2 = r10.Z
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L1a
            goto L4f
        L1a:
            int r2 = r10.E
            if (r2 <= 0) goto L1f
            goto L4f
        L1f:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.startapp.sdk.ads.video.VideoAdDetails r6 = r10.w()
            long r6 = r6.g()
            com.startapp.sdk.ads.video.player.NativeVideoPlayer r8 = r10.P
            if (r8 == 0) goto L41
            android.media.MediaPlayer r9 = r8.f22820g
            if (r9 == 0) goto L33
            r9 = r5
            goto L34
        L33:
            r9 = r1
        L34:
            if (r9 == 0) goto L41
            android.widget.VideoView r8 = r8.f22821h
            int r8 = r8.getDuration()
            long r8 = (long) r8
            long r6 = java.lang.Math.min(r6, r8)
        L41:
            long r6 = r2.toSeconds(r6)
            long r8 = (long) r0
            long r8 = r2.toSeconds(r8)
            long r6 = r6 - r8
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L50
        L4f:
            r6 = r3
        L50:
            int r0 = r10.E
            if (r0 > 0) goto L61
            boolean r0 = r10.C()
            if (r0 != 0) goto L61
            boolean r0 = r10.Z
            if (r0 == 0) goto L5f
            goto L61
        L5f:
            r0 = r1
            goto L62
        L61:
            r0 = r5
        L62:
            if (r0 == 0) goto La2
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto La2
            android.widget.ProgressBar r0 = r10.T
            if (r0 == 0) goto L73
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L73
            r1 = r5
        L73:
            if (r1 == 0) goto L78
            r10.G()
        L78:
            com.startapp.sdk.ads.video.VideoMode$VideoFinishedReason r0 = com.startapp.sdk.ads.video.VideoMode.VideoFinishedReason.SKIPPED
            r10.a(r0)
            com.startapp.sdk.ads.video.VideoAdDetails r0 = r10.w()
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r0 = r0.i()
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r0 = r0.p()
            com.startapp.sdk.ads.video.tracking.VideoTrackingParams r1 = new com.startapp.sdk.ads.video.tracking.VideoTrackingParams
            java.lang.String r2 = r10.f22216q
            int r3 = r10.f22758j0
            int r3 = r10.a(r3)
            int r4 = r10.E
            java.lang.String r6 = r10.f22760l0
            r1.<init>(r3, r4, r2, r6)
            int r2 = r10.f22758j0
            java.lang.String r3 = "skipped"
            r10.a(r2, r1, r3, r0)
            return r5
        La2:
            com.startapp.sdk.ads.video.VideoAdDetails r0 = r10.w()
            boolean r0 = r0.m()
            if (r0 != 0) goto Lb2
            boolean r0 = r10.f22749a0
            if (r0 == 0) goto Lb1
            goto Lb2
        Lb1:
            return r5
        Lb2:
            r10.i()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.VideoMode.b():boolean");
    }

    @Override // com.startapp.h4, com.startapp.l2
    public final void e() {
        MediaEvents mediaEvents;
        if (!this.f22757i0 && !this.f22201b.isFinishing() && !this.f22749a0 && !this.Z) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            NativeVideoPlayer nativeVideoPlayer = this.P;
            if (nativeVideoPlayer != null) {
                nativeVideoPlayer.f22821h.pause();
                j6 j6Var = this.H;
                if (j6Var != null && (mediaEvents = j6Var.f22142c) != null) {
                    mediaEvents.pause();
                }
            }
            a(this.f22758j0, new VideoPausedTrackingParams(this.f22216q, a(this.f22758j0), this.E, this.Y, pauseOrigin, this.f22760l0), b9.h.f16647e0, w().i().j());
        }
        NativeVideoPlayer nativeVideoPlayer2 = this.P;
        if (nativeVideoPlayer2 != null) {
            MediaPlayer mediaPlayer = nativeVideoPlayer2.f22820g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(null);
                nativeVideoPlayer2.f22820g = null;
            }
            d.b.f22797a.f22795b = null;
            this.P = null;
        }
        G();
        if (this.f22768t0) {
            this.f22201b.unregisterReceiver(this.f22769u0);
            this.f22768t0 = false;
        }
        this.f22766r0.removeCallbacksAndMessages(null);
        super.e();
    }

    @Override // com.startapp.h4, com.startapp.l2
    public final void f() {
        super.f();
        if (this.f22201b.isFinishing()) {
            return;
        }
        this.f22201b.registerReceiver(this.f22769u0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f22768t0 = true;
        if (this.Q == null) {
            Context a10 = f0.a(this.f22201b);
            if (a10 == null) {
                a10 = this.f22201b;
            }
            this.S = (RelativeLayout) this.f22201b.findViewById(1475346432);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            VideoView videoView = new VideoView(a10);
            this.Q = videoView;
            videoView.setId(100);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            ProgressBar progressBar = new ProgressBar(a10, null, 16843399);
            this.T = progressBar;
            progressBar.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(14);
            layoutParams3.addRule(15);
            RelativeLayout relativeLayout = new RelativeLayout(a10);
            this.R = relativeLayout;
            relativeLayout.setId(1475346436);
            this.f22201b.setContentView(this.R);
            this.R.addView(this.Q, layoutParams2);
            this.R.addView(this.S, layoutParams);
            this.R.addView(this.T, layoutParams3);
            if (q.f22401g.booleanValue()) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(12);
                layoutParams4.addRule(14);
                RelativeLayout relativeLayout2 = this.R;
                TextView textView = new TextView(a10);
                textView.setBackgroundColor(-16777216);
                y.a(textView, 0.5f);
                textView.setTextColor(-7829368);
                textView.setSingleLine(false);
                textView.setText("url=" + w().j());
                relativeLayout2.addView(textView, layoutParams4);
            }
            this.f22202c.f22957b.setVisibility(4);
        }
        if (this.P == null) {
            this.P = new NativeVideoPlayer(this.Q);
        }
        this.W = false;
        RelativeLayout relativeLayout3 = this.R;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(-16777216);
        }
        E();
        if (this.f22757i0) {
            this.f22202c.f22957b.setVisibility(0);
            this.Q.setVisibility(4);
        }
        NativeVideoPlayer nativeVideoPlayer = this.P;
        nativeVideoPlayer.f23494e = new ra(this);
        nativeVideoPlayer.f23491b = new sa(this);
        nativeVideoPlayer.f23493d = new h(this);
        ta taVar = new ta(this);
        nativeVideoPlayer.f23492c = new ua(this);
        this.P.f23495f = taVar;
        y.a(this.Q, new ma(this));
        this.f22766r0.post(this.f22767s0);
    }

    @Override // com.startapp.l2
    public final void h() {
        if (this.X) {
            return;
        }
        super.h();
    }

    @Override // com.startapp.h4
    public final void i() {
        if (this.X) {
            return;
        }
        if (!this.f22757i0 && this.Q != null) {
            NativeVideoPlayer nativeVideoPlayer = this.P;
            int currentPosition = nativeVideoPlayer != null ? nativeVideoPlayer.f22821h.getCurrentPosition() : 0;
            a(currentPosition, new VideoTrackingParams(a(currentPosition), this.E, this.f22216q, this.f22760l0), "closed", w().i().i());
            return;
        }
        a(this.f22758j0, new VideoTrackingParams(a(this.f22758j0), this.E, this.f22216q, this.f22760l0), "postrollClosed", w().i().l());
        super.i();
    }

    @Override // com.startapp.h4
    public final long k() {
        return TimeUnit.MILLISECONDS.toSeconds(u());
    }

    @Override // com.startapp.h4
    public final p4 l() {
        Activity activity = this.f22201b;
        h4.a aVar = this.M;
        qa qaVar = new qa(this);
        g gVar = new g(this);
        pa paVar = new pa(this);
        TrackingParams trackingParams = new TrackingParams(this.f22216q);
        boolean[] zArr = this.f22206g;
        return new ka(activity, aVar, aVar, qaVar, gVar, paVar, trackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    @Override // com.startapp.h4
    public final long m() {
        Long l10 = this.f22217r;
        if (l10 != null) {
            return TimeUnit.SECONDS.toMillis(l10.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f23158k.t());
    }

    @Override // com.startapp.h4
    public final TrackingParams n() {
        return new VideoTrackingParams(0, this.E, this.f22216q, this.f22760l0);
    }

    @Override // com.startapp.h4
    public final boolean o() {
        return this.f22211l.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    @Override // com.startapp.h4, android.view.View.OnClickListener
    public final void onClick(View view) {
        this.M.run();
    }

    @Override // com.startapp.h4
    public final void p() {
    }

    @Override // com.startapp.h4
    public final void q() {
        this.V = true;
        if (this.f22757i0) {
            a((View) this.f22015x);
            y();
            return;
        }
        a("videoApi.setClickableVideo", Boolean.valueOf(w().l()));
        a("videoApi.setMode", "PLAYER");
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(w().m() || this.f22749a0);
        a("videoApi.setCloseable", objArr);
        a("videoApi.setSkippable", Boolean.valueOf(this.E > 0 || C() || this.Z));
        if (A()) {
            F();
        }
    }

    @Override // com.startapp.h4
    public final void r() {
        int l10 = AdsCommonMetaData.f22889h.G().l();
        ActionTrackingLink[] o10 = w().i().o();
        a((v() * l10) / 100, new VideoTrackingParams(l10, this.E, this.f22216q, this.f22760l0), "rewarded", o10);
    }

    public final int u() {
        NativeVideoPlayer nativeVideoPlayer = this.P;
        if (nativeVideoPlayer == null) {
            return this.f22758j0;
        }
        int currentPosition = nativeVideoPlayer.f22821h.getCurrentPosition();
        if (currentPosition > this.f22758j0) {
            this.f22758j0 = currentPosition;
        }
        return this.f22758j0;
    }

    public final int v() {
        NativeVideoPlayer nativeVideoPlayer = this.P;
        if (nativeVideoPlayer != null) {
            return nativeVideoPlayer.f22821h.getDuration();
        }
        return -1;
    }

    public final VideoAdDetails w() {
        return ((VideoEnabledAd) this.f22211l).w();
    }

    public final void x() {
        if (this.f22207h.equals("back")) {
            if (AdsCommonMetaData.f22889h.G().a().equals(VideoConfig.BackMode.BOTH)) {
                this.Z = true;
                this.f22749a0 = true;
            } else if (AdsCommonMetaData.f22889h.G().a().equals(VideoConfig.BackMode.SKIP)) {
                this.Z = true;
                this.f22749a0 = false;
            } else if (AdsCommonMetaData.f22889h.G().a().equals(VideoConfig.BackMode.CLOSE)) {
                this.Z = false;
                this.f22749a0 = true;
            } else if (AdsCommonMetaData.f22889h.G().a().equals(VideoConfig.BackMode.DISABLED)) {
                this.Z = false;
                this.f22749a0 = false;
            } else {
                this.Z = false;
                this.f22749a0 = false;
            }
        }
    }

    public final void y() {
        String e8 = w().e();
        if (e8 != null) {
            this.f22015x.setWebViewClient(new c());
            WebView webView = this.f22015x;
            WeakHashMap weakHashMap = o9.f22359a;
            try {
                webView.loadDataWithBaseURL(MetaData.f23158k.q(), e8, "text/html", cc.N, null);
                return;
            } catch (Throwable th) {
                l3.a(th);
                return;
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.P != null);
        a("videoApi.setReplayEnabled", objArr);
        a("videoApi.setMode", HtmlMode.POST_ROLL + "_" + w().f());
        this.f22766r0.postDelayed(new oa(this), AdsCommonMetaData.f22889h.G().b() * 1000);
    }

    public final void z() {
        FractionTrackingLink[] c10 = w().i().c();
        if (c10 != null) {
            for (FractionTrackingLink fractionTrackingLink : c10) {
                List list = (List) this.f22764p0.get(Integer.valueOf(fractionTrackingLink.g()));
                if (list == null) {
                    list = new ArrayList();
                    this.f22764p0.put(Integer.valueOf(fractionTrackingLink.g()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a10 = w().i().a();
        if (a10 != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a10) {
                List list2 = (List) this.f22765q0.get(Integer.valueOf(absoluteTrackingLink.g()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f22765q0.put(Integer.valueOf(absoluteTrackingLink.g()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    @Override // com.startapp.h4
    public final void a(WebView webView) {
        super.a(webView);
        y.b(webView);
    }

    public final void a(View view) {
        a("videoApi.setVideoFrame", Integer.valueOf(j9.b(this.f22201b, view.getLeft())), Integer.valueOf(j9.b(this.f22201b, view.getTop())), Integer.valueOf(j9.b(this.f22201b, view.getWidth())), Integer.valueOf(j9.b(this.f22201b, view.getHeight())));
    }

    public final void b(int i10) {
        List list;
        MediaEvents mediaEvents;
        if (!this.f22756h0 && this.E <= 0 && i10 != 0) {
            this.f22756h0 = true;
            super.p();
            a(0, new VideoTrackingParams(0, this.E, this.f22216q, this.f22760l0), "impression", w().i().d());
            a(0, new VideoTrackingParams(0, this.E, this.f22216q, this.f22760l0), "creativeView", w().i().b());
            j6 j6Var = this.H;
            if (j6Var != null && j6Var.f22141b != null && j6Var.f22143d.compareAndSet(false, true)) {
                j6Var.f22141b.impressionOccurred();
            }
        }
        for (Integer num : this.f22764p0.keySet()) {
            int intValue = num.intValue();
            if (i10 > 0 && i10 >= (v() * intValue) / 100 && this.f22762n0.get(Integer.valueOf(intValue)) == null) {
                if (this.f22764p0.containsKey(Integer.valueOf(intValue))) {
                    List list2 = (List) this.f22764p0.get(Integer.valueOf(intValue));
                    if (list2 != null) {
                        a((v() * intValue) / 100, new VideoProgressTrackingParams(intValue, this.E, this.f22216q, this.f22760l0), "fraction", (VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]));
                    }
                    j6 j6Var2 = this.H;
                    if (j6Var2 != null) {
                        if (intValue == 25) {
                            MediaEvents mediaEvents2 = j6Var2.f22142c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.firstQuartile();
                            }
                        } else if (intValue == 50) {
                            MediaEvents mediaEvents3 = j6Var2.f22142c;
                            if (mediaEvents3 != null) {
                                mediaEvents3.midpoint();
                            }
                        } else if (intValue == 75 && (mediaEvents = j6Var2.f22142c) != null) {
                            mediaEvents.thirdQuartile();
                        }
                    }
                }
                this.f22762n0.put(Integer.valueOf(intValue), Boolean.TRUE);
            }
        }
        for (Integer num2 : this.f22765q0.keySet()) {
            int intValue2 = num2.intValue();
            if (i10 > 0 && i10 >= intValue2 && this.f22763o0.get(Integer.valueOf(intValue2)) == null) {
                if (this.f22765q0.containsKey(Integer.valueOf(intValue2)) && (list = (List) this.f22765q0.get(Integer.valueOf(intValue2))) != null) {
                    a(intValue2, new VideoProgressTrackingParams(intValue2, this.E, this.f22216q, this.f22760l0), "absolute", (VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]));
                }
                this.f22763o0.put(Integer.valueOf(intValue2), Boolean.TRUE);
            }
        }
        if (i10 >= (v() * AdsCommonMetaData.f22889h.G().l()) / 100) {
            s();
        }
        if (this.f22751c0) {
            if (i10 >= (v() * AdsCommonMetaData.f22889h.G().l()) / 100) {
                s();
            }
        }
    }

    public final void a(VideoFinishedReason videoFinishedReason) {
        MediaEvents mediaEvents;
        j6 j6Var;
        MediaEvents mediaEvents2;
        VideoFinishedReason videoFinishedReason2 = VideoFinishedReason.SKIPPED;
        if (videoFinishedReason == videoFinishedReason2 && (j6Var = this.H) != null && (mediaEvents2 = j6Var.f22142c) != null) {
            mediaEvents2.skipped();
        }
        VideoFinishedReason videoFinishedReason3 = VideoFinishedReason.COMPLETE;
        if (videoFinishedReason == videoFinishedReason3) {
            int v10 = v();
            this.f22758j0 = v10;
            b(v10);
            s();
            j6 j6Var2 = this.H;
            if (j6Var2 != null && (mediaEvents = j6Var2.f22142c) != null) {
                mediaEvents.complete();
            }
        } else {
            NativeVideoPlayer nativeVideoPlayer = this.P;
            if (nativeVideoPlayer != null) {
                nativeVideoPlayer.f22821h.pause();
            }
        }
        if (videoFinishedReason == videoFinishedReason3 || videoFinishedReason == videoFinishedReason2) {
            if (w().k()) {
                y();
                this.f22202c.f22957b.setVisibility(0);
            } else {
                a();
            }
            this.f22757i0 = true;
            if (w().k()) {
                a(this.f22758j0, new VideoTrackingParams(a(this.f22758j0), this.E, this.f22216q, this.f22760l0), "postrollImression", w().i().m());
            }
        }
    }

    @Override // com.startapp.h4
    public final void a(ImageButton imageButton) {
        VideoAdDetails w10;
        List<VerificationDetails> a10;
        long j10;
        VastProperties createVastPropertiesForNonSkippableMedia;
        if (!MetaData.f23158k.X() || (w10 = w()) == null || (a10 = w10.a()) == null) {
            return;
        }
        j6 j6Var = new j6(this.f22015x.getContext(), a10, true);
        this.H = j6Var;
        if (j6Var.f22140a != null) {
            try {
                AdInformationView adInformationView = this.f22202c.f22957b;
                if (adInformationView != null) {
                    j6Var.a(adInformationView, FriendlyObstructionPurpose.OTHER);
                }
                if (imageButton != null) {
                    this.H.a(imageButton, FriendlyObstructionPurpose.CLOSE_AD);
                }
                this.H.a(this.f22015x, FriendlyObstructionPurpose.VIDEO_CONTROLS);
                this.H.a(this.S, FriendlyObstructionPurpose.OTHER);
            } catch (RuntimeException unused) {
            }
            j6 j6Var2 = this.H;
            VideoView videoView = this.Q;
            AdSession adSession = j6Var2.f22140a;
            if (adSession != null) {
                adSession.registerAdView(videoView);
            }
            AdSession adSession2 = this.H.f22140a;
            if (adSession2 != null) {
                adSession2.start();
            }
            j6 j6Var3 = this.H;
            boolean z10 = this.E > 0 || C() || this.Z;
            if (C()) {
                j10 = w().g();
                NativeVideoPlayer nativeVideoPlayer = this.P;
                if (nativeVideoPlayer != null) {
                    if (nativeVideoPlayer.f22820g != null) {
                        j10 = Math.min(j10, nativeVideoPlayer.f22821h.getDuration());
                    }
                }
            } else {
                j10 = 0;
            }
            if (j6Var3.f22141b == null || !j6Var3.f22144e.compareAndSet(false, true)) {
                return;
            }
            if (z10) {
                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia((float) j10, true, Position.STANDALONE);
            } else {
                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
            }
            j6Var3.f22141b.loaded(createVastPropertiesForNonSkippableMedia);
        }
    }

    @Override // com.startapp.h4, com.startapp.l2
    public final void a() {
        super.a();
        if (this.f22753e0) {
            d dVar = d.b.f22797a;
            String c10 = w().c();
            dVar.getClass();
            if (c10 != null && c10.endsWith(".temp")) {
                new File(c10).delete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.startapp.ab r12) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.VideoMode.a(com.startapp.ab):void");
    }

    public final int a(int i10) {
        if (v() > 0) {
            return (i10 * 100) / v();
        }
        return 0;
    }

    @Override // com.startapp.h4
    public final boolean a(String str, boolean z10) {
        String b10;
        ActionTrackingLink[] h10;
        if (this.f22757i0) {
            b10 = w().d();
        } else {
            b10 = w().b();
        }
        if (!TextUtils.isEmpty(b10)) {
            z10 = true;
            str = b10;
        }
        if (!this.f22757i0) {
            a(VideoFinishedReason.CLICKED);
        }
        boolean z11 = this.f22757i0;
        if (z11) {
            h10 = w().i().k();
        } else {
            h10 = w().i().h();
        }
        a(this.f22758j0, new VideoClickedTrackingParams(this.f22216q, a(this.f22758j0), this.E, z11, this.f22760l0), "clicked", h10);
        j6 j6Var = this.H;
        if (j6Var != null) {
            InteractionType interactionType = InteractionType.CLICK;
            MediaEvents mediaEvents = j6Var.f22142c;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(interactionType);
            }
        }
        return super.a(str, z10);
    }

    public final void a(boolean z10) {
        ActionTrackingLink[] g10;
        if (this.P == null) {
            return;
        }
        if (z10) {
            g10 = w().i().f();
        } else {
            g10 = w().i().g();
        }
        a(this.P.f22821h.getCurrentPosition(), new VideoTrackingParams(a(this.P.f22821h.getCurrentPosition()), this.E, this.f22216q, this.f22760l0), "sound", g10);
        j6 j6Var = this.H;
        if (j6Var != null) {
            float f10 = z10 ? 0.0f : 1.0f;
            MediaEvents mediaEvents = j6Var.f22142c;
            if (mediaEvents != null) {
                mediaEvents.volumeChange(f10);
            }
        }
    }

    public final void a(int i10, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        ja jaVar = new ja(i10, videoTrackingParams, w().j(), videoTrackingLinkArr);
        jaVar.f22157e = str;
        ia a10 = jaVar.a();
        Activity activity = this.f22201b;
        if (activity == null || a10 == null) {
            return;
        }
        for (String str2 : a10.f22112a) {
            if (str2 != null && str2.length() > 0) {
                try {
                    com.startapp.sdk.components.a a11 = com.startapp.sdk.components.a.a(activity);
                    a11.f23249y.a().execute(new g9(a11.f23232h, a11.f23237m, str2, null));
                } catch (Throwable th) {
                    l3.a(th);
                }
            }
        }
    }
}
