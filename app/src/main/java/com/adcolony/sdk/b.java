package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.ug;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends Activity {

    /* renamed from: a  reason: collision with root package name */
    c f5805a;

    /* renamed from: b  reason: collision with root package name */
    int f5806b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f5807c;

    /* renamed from: d  reason: collision with root package name */
    boolean f5808d;

    /* renamed from: e  reason: collision with root package name */
    boolean f5809e;

    /* renamed from: f  reason: collision with root package name */
    boolean f5810f;

    /* renamed from: g  reason: collision with root package name */
    boolean f5811g;

    /* renamed from: h  reason: collision with root package name */
    boolean f5812h;

    /* renamed from: i  reason: collision with root package name */
    boolean f5813i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b.this.a(h0Var);
        }
    }

    void a(boolean z10) {
        Iterator<Map.Entry<Integer, a1>> it = this.f5805a.m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            a1 value = it.next().getValue();
            if (!value.f() && value.b().isPlaying()) {
                value.h();
            }
        }
        AdColonyInterstitial j10 = com.adcolony.sdk.a.b().j();
        if (j10 != null && j10.i() && j10.e().c() != null && z10 && this.f5812h) {
            j10.e().a("pause");
        }
    }

    void b(boolean z10) {
        for (Map.Entry<Integer, a1> entry : this.f5805a.m().entrySet()) {
            a1 value = entry.getValue();
            if (!value.f() && !value.b().isPlaying() && !com.adcolony.sdk.a.b().o().b()) {
                value.i();
            }
        }
        AdColonyInterstitial j10 = com.adcolony.sdk.a.b().j();
        if (j10 == null || !j10.i() || j10.e().c() == null) {
            return;
        }
        if (!(z10 && this.f5812h) && this.f5813i) {
            j10.e().a("resume");
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        f1 b10 = c0.b();
        c0.a(b10, ug.f21009x, this.f5805a.a());
        new h0("AdSession.on_back_button", this.f5805a.k(), b10).c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            a();
        } else {
            ((AdColonyAdViewActivity) this).c();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.adcolony.sdk.a.d() && com.adcolony.sdk.a.b().l() != null) {
            k b10 = com.adcolony.sdk.a.b();
            this.f5810f = false;
            c l10 = b10.l();
            this.f5805a = l10;
            l10.d(false);
            if (z0.g()) {
                this.f5805a.d(true);
            }
            this.f5805a.a();
            this.f5807c = this.f5805a.k();
            boolean multiWindowEnabled = b10.u().getMultiWindowEnabled();
            this.f5811g = multiWindowEnabled;
            if (multiWindowEnabled) {
                getWindow().addFlags(com.ironsource.mediationsdk.metadata.a.f18931n);
                getWindow().clearFlags(1024);
            } else {
                getWindow().addFlags(1024);
                getWindow().clearFlags(com.ironsource.mediationsdk.metadata.a.f18931n);
            }
            requestWindowFeature(1);
            getWindow().getDecorView().setBackgroundColor(-16777216);
            if (b10.u().getKeepScreenOn()) {
                getWindow().addFlags(128);
            }
            ViewParent parent = this.f5805a.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f5805a);
            }
            setContentView(this.f5805a);
            this.f5805a.i().add(com.adcolony.sdk.a.a("AdSession.finish_fullscreen_ad", (j0) new a(), true));
            this.f5805a.j().add("AdSession.finish_fullscreen_ad");
            a(this.f5806b);
            if (!this.f5805a.o()) {
                f1 b11 = c0.b();
                c0.a(b11, ug.f21009x, this.f5805a.a());
                c0.b(b11, "screen_width", this.f5805a.d());
                c0.b(b11, "screen_height", this.f5805a.b());
                new h0("AdSession.on_fullscreen_ad_started", this.f5805a.k(), b11).c();
                this.f5805a.e(true);
                return;
            }
            a();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!com.adcolony.sdk.a.d() || this.f5805a == null || this.f5808d) {
            return;
        }
        if ((Build.VERSION.SDK_INT < 24 || !z0.g()) && !this.f5805a.q()) {
            f1 b10 = c0.b();
            c0.a(b10, ug.f21009x, this.f5805a.a());
            new h0("AdSession.on_error", this.f5805a.k(), b10).c();
            this.f5810f = true;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        a(this.f5809e);
        this.f5809e = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        a();
        b(this.f5809e);
        this.f5809e = true;
        this.f5813i = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (z10 && this.f5809e) {
            com.adcolony.sdk.a.b().x().b(true);
            b(this.f5809e);
            this.f5812h = true;
        } else if (z10 || !this.f5809e) {
        } else {
            com.adcolony.sdk.a.b().x().a(true);
            a(this.f5809e);
            this.f5812h = false;
        }
    }

    void a() {
        k b10 = com.adcolony.sdk.a.b();
        if (this.f5805a == null) {
            this.f5805a = b10.l();
        }
        c cVar = this.f5805a;
        if (cVar == null) {
            return;
        }
        cVar.d(false);
        if (z0.g()) {
            this.f5805a.d(true);
        }
        Rect x10 = this.f5811g ? b10.n().x() : b10.n().w();
        if (x10.width() <= 0 || x10.height() <= 0) {
            return;
        }
        f1 b11 = c0.b();
        f1 b12 = c0.b();
        float s10 = b10.n().s();
        c0.b(b12, "width", (int) (x10.width() / s10));
        c0.b(b12, "height", (int) (x10.height() / s10));
        c0.b(b12, "app_orientation", z0.d(z0.f()));
        c0.b(b12, "x", 0);
        c0.b(b12, "y", 0);
        c0.a(b12, "ad_session_id", this.f5805a.a());
        c0.b(b11, "screen_width", x10.width());
        c0.b(b11, "screen_height", x10.height());
        c0.a(b11, "ad_session_id", this.f5805a.a());
        c0.b(b11, ug.f21009x, this.f5805a.c());
        this.f5805a.setLayoutParams(new FrameLayout.LayoutParams(x10.width(), x10.height()));
        this.f5805a.b(x10.width());
        this.f5805a.a(x10.height());
        new h0("MRAID.on_size_change", this.f5805a.k(), b12).c();
        new h0("AdContainer.on_orientation_change", this.f5805a.k(), b11).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), "status");
        if ((d10 == 5 || d10 == 0 || d10 == 6 || d10 == 1) && !this.f5808d) {
            k b10 = com.adcolony.sdk.a.b();
            r o10 = b10.o();
            b10.d(h0Var);
            if (o10.a() != null) {
                o10.a().dismiss();
                o10.a((AlertDialog) null);
            }
            if (!this.f5810f) {
                finish();
            }
            this.f5808d = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            b10.e(false);
            f1 b11 = c0.b();
            c0.a(b11, ug.f21009x, this.f5805a.a());
            new h0("AdSession.on_close", this.f5805a.k(), b11).c();
            b10.a((c) null);
            b10.a((AdColonyInterstitial) null);
            b10.a((AdColonyAdView) null);
            com.adcolony.sdk.a.b().c().f().remove(this.f5805a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10) {
        if (i10 == 0) {
            setRequestedOrientation(7);
        } else if (i10 != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f5806b = i10;
    }
}
