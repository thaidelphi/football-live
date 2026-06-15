package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.k;
import com.applovin.impl.d7;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.h1;
import com.applovin.impl.k4;
import com.applovin.impl.k6;
import com.applovin.impl.l2;
import com.applovin.impl.n2;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.u7;
import com.applovin.impl.v1;
import com.applovin.impl.v3;
import com.applovin.impl.x1;
import com.applovin.impl.x3;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements AppLovinCommunicatorSubscriber {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* renamed from: a  reason: collision with root package name */
    private Context f6542a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f6543b;

    /* renamed from: c  reason: collision with root package name */
    private com.applovin.impl.sdk.j f6544c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdServiceImpl f6545d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.n f6546e;

    /* renamed from: f  reason: collision with root package name */
    private AppLovinCommunicator f6547f;

    /* renamed from: g  reason: collision with root package name */
    private b f6548g;

    /* renamed from: i  reason: collision with root package name */
    private AppLovinAdSize f6550i;

    /* renamed from: j  reason: collision with root package name */
    private String f6551j;

    /* renamed from: k  reason: collision with root package name */
    private androidx.browser.customtabs.f f6552k;

    /* renamed from: l  reason: collision with root package name */
    private com.applovin.impl.adview.c f6553l;

    /* renamed from: m  reason: collision with root package name */
    private e f6554m;

    /* renamed from: n  reason: collision with root package name */
    private com.applovin.impl.adview.b f6555n;

    /* renamed from: o  reason: collision with root package name */
    private WebView f6556o;

    /* renamed from: p  reason: collision with root package name */
    private k f6557p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f6558q;

    /* renamed from: r  reason: collision with root package name */
    private Runnable f6559r;

    /* renamed from: h  reason: collision with root package name */
    private final Map f6549h = Collections.synchronizedMap(new HashMap());

    /* renamed from: s  reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f6560s = null;

    /* renamed from: t  reason: collision with root package name */
    private volatile AppLovinAd f6561t = null;

    /* renamed from: u  reason: collision with root package name */
    private f f6562u = null;

    /* renamed from: v  reason: collision with root package name */
    private f f6563v = null;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicReference f6564w = new AtomicReference();

    /* renamed from: x  reason: collision with root package name */
    private final AtomicBoolean f6565x = new AtomicBoolean();

    /* renamed from: y  reason: collision with root package name */
    private volatile boolean f6566y = false;

    /* renamed from: z  reason: collision with root package name */
    private volatile boolean f6567z = false;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f6555n != null) {
                a.this.f6555n.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0120a implements k.a {
            C0120a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f6555n.addView(a.this.f6557p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                com.applovin.impl.sdk.n unused = a.this.f6546e;
                if (com.applovin.impl.sdk.n.a()) {
                    a.this.f6546e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f6560s != null) {
                if (a.this.f6555n != null) {
                    a.this.t();
                    com.applovin.impl.sdk.n unused = a.this.f6546e;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = a.this.f6546e;
                        nVar.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f6560s.getAdIdNumber() + "...");
                    }
                    a.b(a.this.f6555n, a.this.f6560s.getSize());
                    if (a.this.f6557p != null) {
                        u7.c(a.this.f6557p);
                        a.this.f6557p = null;
                    }
                    x1 x1Var = new x1(a.this.f6549h, a.this.f6544c);
                    if (x1Var.c()) {
                        a.this.f6557p = new k(x1Var, a.this.f6542a);
                        a.this.f6557p.a(new C0120a());
                    }
                    a.this.f6555n.setAdHtmlLoaded(false);
                    a.this.f6555n.a(a.this.f6560s);
                    if (a.this.f6560s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f6567z) {
                        return;
                    }
                    a.this.f6560s.setHasShown(true);
                    return;
                }
                com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f6560s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                l2.a(a.this.C, a.this.f6560s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a  reason: collision with root package name */
        private final a f6571a;

        e(a aVar, com.applovin.impl.sdk.j jVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (jVar != null) {
                this.f6571a = aVar;
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }

        private a a() {
            return this.f6571a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a a10 = a();
            if (a10 != null) {
                a10.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.n.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a a10 = a();
            if (a10 != null) {
                a10.b(i10);
            }
        }
    }

    private void B() {
        if (this.f6546e != null && com.applovin.impl.sdk.n.a() && com.applovin.impl.sdk.n.a()) {
            this.f6546e.a("AppLovinAdView", "Destroying...");
        }
        e8.b(this.f6555n);
        this.f6555n = null;
        e8.b(this.f6556o);
        this.f6556o = null;
        this.f6552k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        this.f6567z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f6555n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f6543b == null || (bVar = this.f6555n) == null || bVar.getParent() != null) {
            return;
        }
        this.f6543b.addView(this.f6555n);
        b(this.f6555n, this.f6560s.getSize());
        if (this.f6560s.isOpenMeasurementEnabled()) {
            this.f6560s.getAdEventTracker().a((View) this.f6555n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (this.f6555n != null && this.f6562u != null) {
            a();
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        if (this.f6562u != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f6546e;
                nVar.a("AppLovinAdView", "Detaching expanded ad: " + this.f6562u.b());
            }
            this.f6563v = this.f6562u;
            this.f6562u = null;
            a(this.f6550i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        com.applovin.impl.sdk.ad.a b10;
        f fVar = this.f6563v;
        if (fVar == null && this.f6562u == null) {
            return;
        }
        if (fVar != null) {
            b10 = fVar.b();
            this.f6563v.dismiss();
            this.f6563v = null;
        } else {
            b10 = this.f6562u.b();
            this.f6562u.dismiss();
            this.f6562u = null;
        }
        l2.a(this.C, b10, (AppLovinAdView) this.f6543b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        f().loadUrl("chrome://crash");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.applovin.impl.sdk.ad.b bVar = this.f6560s;
        n2 n2Var = new n2();
        n2Var.a().a(bVar).a(i());
        if (!d7.a(bVar.getSize())) {
            n2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        n2Var.a(this.f6544c);
        n2Var.a();
        if (com.applovin.impl.sdk.n.a()) {
            this.f6546e.a("AppLovinAdView", n2Var.toString());
        }
    }

    private void v() {
        if (this.f6560s.S0()) {
            int a10 = this.f6544c.o().a();
            if (com.applovin.impl.sdk.h.a(a10)) {
                this.f6555n.a("javascript:al_muteSwitchOn();");
            } else if (a10 == 2) {
                this.f6555n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    public void A() {
        if (!this.f6566y || this.f6567z) {
            return;
        }
        this.f6567z = true;
    }

    public void C() {
        if (this.f6566y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f6564w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f6567z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    public AppLovinAdSize k() {
        return this.f6550i;
    }

    public String l() {
        return this.f6551j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.w
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.r();
                }
            });
        }
    }

    public void s() {
        if (this.f6544c != null && this.f6554m != null && this.f6542a != null && this.f6566y) {
            this.f6545d.loadNextAd(this.f6551j, this.f6550i, this.f6554m);
        } else {
            com.applovin.impl.sdk.n.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    public void u() {
        if ((this.f6542a instanceof h1) && this.f6560s != null && this.f6560s.S() == b.EnumC0135b.DISMISS) {
            ((h1) this.f6542a).dismiss();
        }
    }

    public void w() {
        if (this.f6562u == null && this.f6563v == null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f6546e;
                nVar.a("AppLovinAdView", "Ad: " + this.f6560s + " closed.");
            }
            a(this.f6559r);
            l2.b(this.B, this.f6560s);
            this.f6560s = null;
            return;
        }
        a();
    }

    public void x() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f6546e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f6548g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void y() {
        if (com.applovin.impl.o.a(this.f6555n)) {
            this.f6544c.C().c(v1.f9444r);
        }
    }

    public void z() {
        if (this.f6566y) {
            l2.b(this.B, this.f6560s);
            if (this.f6560s != null && this.f6560s.isOpenMeasurementEnabled() && d7.a(this.f6560s.getSize())) {
                this.f6560s.getAdEventTracker().f();
            }
            if (this.f6555n != null && this.f6562u != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6546e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f6546e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int applyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int i10 = -1;
        if (label.equals(appLovinAdSize2.getLabel())) {
            applyDimension = -1;
        } else if (appLovinAdSize.getWidth() == -1) {
            applyDimension = displayMetrics.widthPixels;
        } else {
            applyDimension = (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
            if (appLovinAdSize.getHeight() == -1) {
                i10 = displayMetrics.heightPixels;
            } else {
                i10 = (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = i10;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.t
            @Override // java.lang.Runnable
            public final void run() {
                a.this.p();
            }
        });
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.x
            @Override // java.lang.Runnable
            public final void run() {
                a.this.q();
            }
        });
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f6555n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f6560s;
    }

    public androidx.browser.customtabs.f h() {
        return this.f6552k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f6543b;
    }

    public com.applovin.impl.sdk.j j() {
        return this.f6544c;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.j jVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f6544c = jVar;
            this.f6545d = jVar.j();
            this.f6546e = jVar.I();
            this.f6547f = AppLovinCommunicator.getInstance(context);
            this.f6550i = appLovinAdSize;
            this.f6551j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f6542a = context;
            this.f6543b = appLovinAdView;
            this.f6553l = new com.applovin.impl.adview.c(this, jVar);
            this.f6559r = new c();
            this.f6558q = new d();
            this.f6554m = new e(this, jVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.adview.u
            @Override // java.lang.Runnable
            public final void run() {
                a.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f6560s.getAdEventTracker().c(webView);
        k kVar = this.f6557p;
        if (kVar != null && kVar.a()) {
            v3 adEventTracker = this.f6560s.getAdEventTracker();
            k kVar2 = this.f6557p;
            adEventTracker.b(webView, Collections.singletonList(new x3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f6560s.getAdEventTracker().a((View) webView);
        }
        this.f6560s.getAdEventTracker().h();
        this.f6560s.getAdEventTracker().g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f6553l, this.f6544c, this.f6542a);
            this.f6555n = bVar;
            bVar.setBackgroundColor(0);
            this.f6555n.setWillNotCacheDrawing(false);
            this.f6543b.setBackgroundColor(0);
            this.f6543b.addView(this.f6555n);
            b(this.f6555n, appLovinAdSize);
            if (!this.f6566y) {
                a(this.f6559r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.v
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.m();
                }
            });
            this.f6566y = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f6544c.D().a("AppLovinAdView", "initAdWebView", th);
            this.f6565x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.f6562u == null && (this.f6560s instanceof com.applovin.impl.sdk.ad.a) && this.f6555n != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f6560s;
            Context context = this.f6542a;
            Activity b10 = context instanceof Activity ? (Activity) context : u7.b(this.f6555n, this.f6544c);
            if (b10 != null && !b10.isFinishing()) {
                ViewGroup viewGroup = this.f6543b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f6555n);
                }
                f fVar = new f(aVar, this.f6555n, b10, this.f6544c);
                this.f6562u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.o
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        a.this.a(dialogInterface);
                    }
                });
                this.f6562u.show();
                l2.c(this.C, this.f6560s, (AppLovinAdView) this.f6543b);
                if (this.f6560s.isOpenMeasurementEnabled()) {
                    this.f6560s.getAdEventTracker().a((View) this.f6562u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri j10 = aVar.j();
            if (j10 != null) {
                this.f6545d.trackAndLaunchClick(aVar, i(), this, j10, motionEvent, null);
            }
            this.f6555n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.o.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.o.b(attributeSet)) {
                s();
            }
        }
    }

    public void a(String str, Object obj) {
        this.f6549h.put(str, obj);
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f6567z) {
                c(appLovinAd);
            } else {
                this.f6564w.set(appLovinAd);
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6546e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.q
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.a(appLovinAd);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f6546e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            d7.b(appLovinAd, this.f6544c);
            if (this.f6566y) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) d7.a(appLovinAd, this.f6544c);
                if (bVar == null) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    l2.a(this.B, "Unable to retrieve the loaded ad");
                    return;
                } else if (bVar == this.f6560s) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f6544c.a(o4.K1)).booleanValue()) {
                        if (this.B instanceof f2) {
                            l2.a(this.B, "Attempting to show ad again");
                            return;
                        } else if (!d7.c(this.f6544c)) {
                            this.f6544c.D().a(y1.f9677l0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                            return;
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    return;
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.f6546e;
                        nVar.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                    }
                    l2.b(this.B, this.f6560s);
                    if (this.f6560s != null && this.f6560s.isOpenMeasurementEnabled()) {
                        this.f6560s.getAdEventTracker().f();
                    }
                    this.f6564w.set(null);
                    this.f6561t = null;
                    this.f6560s = bVar;
                    if (this.f6560s.y0()) {
                        this.f6552k = this.f6544c.w().a(this);
                        this.f6544c.w().b(this.f6560s.A(), this.f6552k);
                    }
                    if (!this.f6567z && d7.a(this.f6550i)) {
                        this.f6544c.j().trackImpression(bVar);
                    }
                    if (this.f6562u != null) {
                        c();
                    }
                    a(this.f6558q);
                    return;
                }
            }
            com.applovin.impl.sdk.n.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        if (!this.f6567z) {
            a(this.f6559r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.z
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(i10);
            }
        });
    }

    public void b(Uri uri) {
        if (this.f6560s != null && this.f6560s.A0() && this.f6556o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f6544c.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6544c.I().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f6542a);
            this.f6556o = webView;
            webView.setWebViewClient(new k4());
            this.f6556o.getSettings().setJavaScriptEnabled(true);
            this.f6556o.loadDataWithBaseURL((String) this.f6544c.a(o4.f8265y6), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void a(final WebView webView, String str) {
        if (this.f6560s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.s
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.f6544c.a(o4.Y5)).booleanValue() || (str != null && str.startsWith(this.f6560s.h()))) {
            try {
                if (this.f6560s != this.f6561t) {
                    this.f6561t = this.f6560s;
                    v();
                    this.f6555n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f6544c.v().d(this.f6560s);
                        this.f6544c.D().a(y1.f9682o, this.f6560s);
                        l2.a(this.B, this.f6560s);
                        this.f6555n.a("javascript:al_onAdViewRendered();");
                    }
                    if ((this.f6560s instanceof com.applovin.impl.sdk.ad.a) && this.f6560s.isOpenMeasurementEnabled()) {
                        this.f6544c.i0().a(new k6(this.f6544c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.this.b(webView);
                            }
                        }), u5.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.j jVar = this.f6544c;
                if (jVar != null) {
                    jVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.a0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.y
            @Override // java.lang.Runnable
            public final void run() {
                a.this.n();
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (appLovinAdView != null) {
            this.f6545d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent, bundle);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f6546e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        l2.a(this.D, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f6565x.compareAndSet(true, false)) {
            a(this.f6550i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.j jVar = this.f6544c;
            if (jVar != null) {
                jVar.D().a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.j jVar = this.f6544c;
            if (jVar != null) {
                jVar.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f6548g = bVar;
    }

    public void a(Uri uri) {
        if (this.f6560s == null || !this.f6560s.A0()) {
            return;
        }
        if (this.f6556o == null) {
            this.f6544c.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f6544c.I().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter("event_name");
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f6544c.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f6544c.I().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.r
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(queryParameter2, queryParameter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        e8.a(this.f6556o, str3);
    }
}
