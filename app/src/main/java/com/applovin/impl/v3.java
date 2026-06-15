package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class v3 {

    /* renamed from: a  reason: collision with root package name */
    protected final AppLovinAdBase f9451a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f9452b;

    /* renamed from: c  reason: collision with root package name */
    protected final com.applovin.impl.sdk.n f9453c;

    /* renamed from: d  reason: collision with root package name */
    protected final String f9454d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f9455e;

    /* renamed from: f  reason: collision with root package name */
    protected AdSession f9456f;

    /* renamed from: g  reason: collision with root package name */
    protected AdEvents f9457g;

    public v3(AppLovinAdBase appLovinAdBase) {
        this.f9451a = appLovinAdBase;
        this.f9452b = appLovinAdBase.getSdk();
        this.f9453c = appLovinAdBase.getSdk().I();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f9454d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext a10;
        if (!this.f9451a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9453c.d(this.f9454d, "Skip starting session - Open Measurement disabled");
            }
        } else if (this.f9456f != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9453c;
                String str = this.f9454d;
                nVar.k(str, "Attempting to start session again for ad: " + this.f9451a);
            }
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9453c.a(this.f9454d, "Starting session");
            }
            AdSessionConfiguration a11 = a();
            if (a11 == null || (a10 = a(webView)) == null) {
                return;
            }
            try {
                AdSession createAdSession = AdSession.createAdSession(a11, a10);
                this.f9456f = createAdSession;
                try {
                    this.f9457g = AdEvents.createAdEvents(createAdSession);
                    a(this.f9456f);
                    this.f9456f.start();
                    this.f9455e = true;
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f9453c.a(this.f9454d, "Session started");
                    }
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f9453c.a(this.f9454d, "Failed to create ad events", th);
                    }
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9453c.a(this.f9454d, "Failed to create session", th2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f9457g.loaded();
    }

    protected abstract AdSessionConfiguration a();

    protected abstract AdSessionContext a(WebView webView);

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    protected void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.df
            @Override // java.lang.Runnable
            public final void run() {
                v3.this.b(webView);
            }
        });
    }

    public void e() {
        c(null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.af
            @Override // java.lang.Runnable
            public final void run() {
                v3.this.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.ze
            @Override // java.lang.Runnable
            public final void run() {
                v3.this.c();
            }
        });
    }

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.bf
            @Override // java.lang.Runnable
            public final void run() {
                v3.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f9456f.registerAdView(view);
        this.f9456f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x3 x3Var = (x3) it.next();
            if (x3Var.c() != null) {
                try {
                    this.f9456f.addFriendlyObstruction(x3Var.c(), x3Var.b(), x3Var.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.f9453c;
                        String str = this.f9454d;
                        nVar.a(str, "Failed to add friendly obstruction (" + x3Var + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f9457g.impressionOccurred();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f9456f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f9455e) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9453c;
                    String str2 = this.f9454d;
                    nVar.a(str2, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9453c;
                String str3 = this.f9454d;
                nVar2.a(str3, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.cf
            @Override // java.lang.Runnable
            public final void run() {
                v3.this.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.ef
            @Override // java.lang.Runnable
            public final void run() {
                v3.this.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f9455e = false;
        this.f9456f.finish();
        this.f9456f = null;
        this.f9457g = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ff
            @Override // java.lang.Runnable
            public final void run() {
                v3.this.a(str, runnable);
            }
        });
    }
}
