package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.h1;
import com.applovin.impl.o4;
import com.applovin.sdk.AppLovinSdkUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends Dialog implements h1 {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f6621a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6622b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f6623c;

    /* renamed from: d  reason: collision with root package name */
    private final b f6624d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f6625e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f6626f;

    /* renamed from: g  reason: collision with root package name */
    private e f6627g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f6627g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.j jVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity != null) {
            this.f6622b = jVar;
            this.f6623c = jVar.I();
            this.f6621a = activity;
            this.f6624d = bVar;
            this.f6625e = aVar;
            requestWindowFeature(1);
            setCancelable(false);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6624d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f6621a);
        this.f6626f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6626f.setBackgroundColor(-1157627904);
        this.f6626f.addView(this.f6624d);
        if (!this.f6625e.j1()) {
            a(this.f6625e.d1());
            g();
        }
        setContentView(this.f6626f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f6626f.removeView(this.f6624d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f6627g == null) {
                a();
            }
            this.f6627g.setVisibility(0);
            this.f6627g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f6627g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6623c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    private void g() {
        this.f6621a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.f0
            @Override // java.lang.Runnable
            public final void run() {
                f.this.f();
            }
        });
    }

    public b c() {
        return this.f6624d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.h1
    public void dismiss() {
        this.f6621a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.g0
            @Override // java.lang.Runnable
            public final void run() {
                f.this.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f6624d.a("javascript:al_onBackPressed();");
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f6621a.getWindow().getAttributes().flags, this.f6621a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f6623c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6623c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.f6624d.a("javascript:al_onCloseTapped();");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f6627g.isClickable()) {
            this.f6627g.performClick();
        }
    }

    private void a(e.a aVar) {
        if (this.f6627g != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6623c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e a10 = e.a(aVar, this.f6621a);
        this.f6627g = a10;
        a10.setVisibility(8);
        this.f6627g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.a(view);
            }
        });
        this.f6627g.setClickable(false);
        int a11 = a(((Integer) this.f6622b.a(o4.F1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a11, a11);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.j jVar = this.f6622b;
        o4 o4Var = o4.I1;
        layoutParams.addRule(((Boolean) jVar.a(o4Var)).booleanValue() ? 9 : 11);
        this.f6627g.a(a11);
        int a12 = a(((Integer) this.f6622b.a(o4.H1)).intValue());
        int a13 = a(((Integer) this.f6622b.a(o4.G1)).intValue());
        layoutParams.setMargins(a13, a12, a13, 0);
        this.f6626f.addView(this.f6627g, layoutParams);
        this.f6627g.bringToFront();
        int a14 = a(((Integer) this.f6622b.a(o4.J1)).intValue());
        View view = new View(this.f6621a);
        view.setBackgroundColor(0);
        int i10 = a11 + a14;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f6622b.a(o4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a13 - a(5), a12 - a(5), a13 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f.this.b(view2);
            }
        });
        this.f6626f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f6625e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f6621a, i10);
    }
}
