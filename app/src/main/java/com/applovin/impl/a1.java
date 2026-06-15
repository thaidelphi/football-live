package com.applovin.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.g1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a1 implements g1.a {

    /* renamed from: m  reason: collision with root package name */
    private static WeakReference f6468m;

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicBoolean f6469n = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6470a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6471b;

    /* renamed from: e  reason: collision with root package name */
    private final z0 f6474e;

    /* renamed from: g  reason: collision with root package name */
    private g1 f6476g;

    /* renamed from: h  reason: collision with root package name */
    private y6 f6477h;

    /* renamed from: i  reason: collision with root package name */
    private int f6478i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6479j;

    /* renamed from: k  reason: collision with root package name */
    private long f6480k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6481l;

    /* renamed from: c  reason: collision with root package name */
    private final List f6472c = new ArrayList(10);

    /* renamed from: d  reason: collision with root package name */
    private final Object f6473d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private WeakReference f6475f = new WeakReference(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Started Creative Debugger");
                if (!a1.this.h() || a1.f6468m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = a1.f6468m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(a1.this.f6474e, a1.this.f6470a.e());
                }
                a1.f6469n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = a1.f6468m = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f6483a;

        b(Object obj) {
            this.f6483a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new k1(this.f6483a, a1.this.f6470a.B().b()), a1.this.f6470a);
            a1.f6469n.set(false);
        }
    }

    public a1(com.applovin.impl.sdk.j jVar) {
        this.f6470a = jVar;
        Context m7 = com.applovin.impl.sdk.j.m();
        this.f6471b = m7;
        this.f6474e = new z0(m7);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.f6471b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f6470a.e(), new b(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f6468m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f6480k);
        if (this.f6480k == 0 || seconds < 10) {
            return;
        }
        this.f6470a.D().a(y1.f9660d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f6470a.T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f6478i = 0;
    }

    private void m() {
        this.f6470a.e().a(new a());
    }

    public boolean g() {
        return ((Boolean) this.f6470a.a(o4.f8196q1)).booleanValue() && this.f6470a.f0().isCreativeDebuggerEnabled();
    }

    public void k() {
        g1 g1Var = this.f6476g;
        if (g1Var != null) {
            g1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f6479j = ((Boolean) this.f6470a.a(o4.f8204r1)).booleanValue();
            if (this.f6476g == null) {
                this.f6476g = new g1(this.f6470a, this);
            }
            this.f6476g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (!h() && f6469n.compareAndSet(false, true)) {
            Object a10 = this.f6470a.B().a();
            if (a10 != null) {
                e(a10);
                return;
            }
            synchronized (this.f6473d) {
                arrayList = new ArrayList(this.f6472c);
            }
            this.f6474e.a(arrayList, this.f6470a);
            if (!this.f6481l) {
                m();
                this.f6481l = true;
            }
            com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting Creative Debugger...");
            d.a(this.f6471b, MaxCreativeDebuggerActivity.class);
            return;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Creative Debugger is already showing");
    }

    @Override // com.applovin.impl.g1.a
    public void b() {
        if (this.f6478i == 0) {
            this.f6477h = y6.a(TimeUnit.SECONDS.toMillis(3L), this.f6470a, new Runnable() { // from class: com.applovin.impl.l8
                @Override // java.lang.Runnable
                public final void run() {
                    a1.this.j();
                }
            });
        }
        int i10 = this.f6478i;
        if (i10 % 2 == 0) {
            this.f6478i = i10 + 1;
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!o3.a(obj) || c(obj)) {
                if (o3.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.f6473d) {
                    this.f6472c.add(0, new k1(obj, System.currentTimeMillis()));
                    if (this.f6472c.size() > 10) {
                        List list = this.f6472c;
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof u2 ? ((u2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f6475f.get() == null && !h()) {
            Activity b10 = this.f6470a.e().b();
            if (b10 == null) {
                this.f6470a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6470a.I().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = b10.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a10 = a(frameLayout, b10);
                frameLayout.addView(a10);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a10.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.j8
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        a1.this.a(a10, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.n8
                    @Override // java.lang.Runnable
                    public final void run() {
                        a1.this.a(a10, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
                this.f6475f = new WeakReference(a10);
            }
        }
    }

    @Override // com.applovin.impl.g1.a
    public void a() {
        int i10 = this.f6478i;
        if (i10 % 2 == 1) {
            this.f6478i = i10 + 1;
        }
        if (this.f6478i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.m8
                @Override // java.lang.Runnable
                public final void run() {
                    a1.this.e();
                }
            });
            this.f6478i = 0;
            this.f6477h.a();
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f6479j) {
            view.setOnTouchListener(null);
            this.f6480k = 0L;
        }
        frameLayout.removeView(view);
        this.f6475f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f6475f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f6480k > 0 && this.f6479j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(Object obj) {
        JSONObject a10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (obj instanceof u2) {
            String E = ((u2) obj).E();
            return (!o3.b(obj) || (a10 = new g(E, this.f6470a).a()) == null) ? E : a10.toString();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageButton, android.widget.ImageView, android.view.View] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.f6479j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.i8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a10;
                    a10 = a1.this.a(frameLayout, view, motionEvent);
                    return a10;
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.h8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a1.this.a(view);
                }
            });
        }
        if (l0.f()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6480k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.k8
                @Override // java.lang.Runnable
                public final void run() {
                    a1.this.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f6480k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object[], java.io.Serializable] */
    public void a(k1 k1Var, Context context, boolean z10) {
        Object a10 = k1Var.a();
        String a11 = a(k1Var);
        n2 n2Var = new n2();
        if (z10) {
            n2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        n2Var.b(a11);
        String b10 = this.f6470a.v().b(a10);
        if (b10 != null) {
            n2Var.a("\nBid Response:\n");
            n2Var.a(b10);
        }
        String str = "AppLovin Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", a10 instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", n2Var.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                if (!(a10 instanceof com.applovin.impl.sdk.ad.b)) {
                    str = "MAX Ad Report";
                }
                Intent intent2 = intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", n2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.f6470a.f0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent2.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                context.startActivity(intent2);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(createChooser);
                return;
            }
        }
        context.startActivity(createChooser);
    }

    public String a(k1 k1Var) {
        Object a10 = k1Var.a();
        n2 n2Var = new n2();
        n2Var.b("Ad Info:\n");
        if (a10 instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) a10;
            n2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVar).b(bVar);
        } else if (a10 instanceof u2) {
            n2Var.a((u2) a10);
        }
        n2Var.a(this.f6470a);
        n2Var.a("Epoch Timestamp (ms)", Long.valueOf(k1Var.b()));
        n2Var.a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f6470a.x().w()) ? "Fire OS" : com.ironsource.b9.f16509d).a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f6470a.a(o4.J3)).a("App Package Name", this.f6471b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f6470a.Z()).a("Ad Review Version", f.b()).a(a(a10)).a("User ID", this.f6470a.o0().c() != null ? this.f6470a.o0().c() : "None").a("MD", this.f6470a.a(o4.f8226u));
        return n2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f6470a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f6470a.I();
            I.a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a10 = d7.a(obj);
        Bundle a11 = this.f6470a.i().a(a10);
        this.f6470a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I2 = this.f6470a.I();
            I2.a("CreativeDebuggerService", "Serve id: " + a10);
        }
        this.f6470a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I3 = this.f6470a.I();
            I3.a("CreativeDebuggerService", "Public data: " + a11);
        }
        if (a11 != null) {
            for (String str : a11.keySet()) {
                Object obj2 = a11.get(str);
                a11.remove(str);
                BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a11);
            }
            return a11;
        }
        return null;
    }
}
