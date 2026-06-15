package com.applovin.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.a2;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d;
import com.applovin.impl.d0;
import com.applovin.impl.d7;
import com.applovin.impl.e;
import com.applovin.impl.h1;
import com.applovin.impl.h2;
import com.applovin.impl.l0;
import com.applovin.impl.o4;
import com.applovin.impl.p1;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.ironsource.b9;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinFullscreenActivity extends Activity implements h1 {

    /* renamed from: i  reason: collision with root package name */
    private static final Set f6427i = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j  reason: collision with root package name */
    private static final Object f6428j = new Object();
    @SuppressLint({"StaticFieldLeak"})
    public static h2 parentInterstitialWrapper;

    /* renamed from: a  reason: collision with root package name */
    private j f6429a;

    /* renamed from: b  reason: collision with root package name */
    private p1 f6430b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f6431c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f6432d;

    /* renamed from: e  reason: collision with root package name */
    private b f6433e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6434f;

    /* renamed from: g  reason: collision with root package name */
    private d0 f6435g;

    /* renamed from: h  reason: collision with root package name */
    private long f6436h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements OnBackInvokedCallback {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f6438a;

        protected b(Runnable runnable) {
            this.f6438a = runnable;
        }

        public void onBackInvoked() {
            this.f6438a.run();
        }
    }

    private void b() {
        j jVar = this.f6429a;
        if (jVar == null || !((Boolean) jVar.a(o4.f8109f2)).booleanValue()) {
            return;
        }
        final Long l10 = (Long) this.f6429a.a(o4.f8117g2);
        this.f6435g = d0.a(l10.longValue(), true, this.f6429a, new Runnable() { // from class: com.applovin.adview.b
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinFullscreenActivity.this.a(l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        p1 p1Var = this.f6430b;
        if (p1Var != null) {
            p1Var.p();
        }
        if (d7.e(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // com.applovin.impl.h1
    public void dismiss() {
        if (l0.l() && this.f6433e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f6433e);
            this.f6433e = null;
        }
        p1 p1Var = this.f6430b;
        if (p1Var != null) {
            p1Var.c();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p1 p1Var = this.f6430b;
        if (p1Var != null) {
            p1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            n.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss();
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            n.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(-16777216);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            h2 h2Var = parentInterstitialWrapper;
            if (h2Var != null && h2Var.f() != null) {
                h2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        j a10 = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).a();
        this.f6429a = a10;
        this.f6434f = ((Boolean) a10.a(o4.f8253x2)).booleanValue();
        findViewById.setFitsSystemWindows(true);
        h2 h2Var2 = parentInterstitialWrapper;
        if (h2Var2 != null && h2Var2.f() != null && parentInterstitialWrapper.f().K0() && l0.b()) {
            u7.a(findViewById, this.f6429a);
        }
        d.a(this.f6434f, this);
        if (l0.l() && ((Boolean) this.f6429a.a(o4.J5)).booleanValue()) {
            this.f6433e = new b(new Runnable() { // from class: com.applovin.adview.a
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinFullscreenActivity.this.c();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f6433e);
        }
        a();
        b();
        Integer num = (Integer) this.f6429a.a(o4.f8129h6);
        if (num.intValue() > 0) {
            synchronized (f6428j) {
                Set set = f6427i;
                set.add(this);
                d7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f6429a.D());
            }
        }
        h2 h2Var3 = parentInterstitialWrapper;
        if (h2Var3 != null) {
            p1.a(h2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f6429a, this, new a());
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f6429a);
        this.f6432d = aVar;
        bindService(intent, aVar, 1);
        if (l0.j()) {
            String str = this.f6429a.f0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        j jVar = this.f6429a;
        if (jVar != null && ((Boolean) jVar.a(o4.f8101e2)).booleanValue()) {
            this.f6429a.h0().b(q4.M);
            this.f6429a.h0().b(q4.O);
            this.f6429a.h0().b(q4.P);
        }
        if (this.f6435g != null) {
            this.f6429a.h0().b(q4.N);
            this.f6435g.a();
            this.f6435g = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f6432d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        p1 p1Var = this.f6430b;
        if (p1Var != null) {
            if (!p1Var.g()) {
                this.f6430b.c();
                if (this.f6429a != null) {
                    this.f6429a.D().a(y1.f9657b0, parentInterstitialWrapper.f(), CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity"));
                }
            }
            this.f6430b.q();
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        p1 p1Var = this.f6430b;
        if (p1Var != null) {
            p1Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        p1 p1Var = this.f6430b;
        if (p1Var != null) {
            p1Var.r();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        p1 p1Var;
        try {
            super.onResume();
            if (this.f6431c.get() || (p1Var = this.f6430b) == null) {
                return;
            }
            p1Var.s();
        } catch (IllegalArgumentException e8) {
            this.f6429a.I();
            if (n.a()) {
                this.f6429a.I().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e8);
            }
            this.f6429a.D().a("AppLovinFullscreenActivity", b9.h.f16679u0, e8);
            dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        p1 p1Var = this.f6430b;
        if (p1Var != null) {
            p1Var.t();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f6430b != null) {
            if (!this.f6431c.getAndSet(false)) {
                this.f6430b.b(z10);
            }
            if (z10) {
                d.a(this.f6434f, this);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(p1 p1Var) {
        this.f6430b = p1Var;
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements p1.d {
        a() {
        }

        @Override // com.applovin.impl.p1.d
        public void a(p1 p1Var) {
            AppLovinFullscreenActivity.this.f6430b = p1Var;
            p1Var.v();
        }

        @Override // com.applovin.impl.p1.d
        public void a(String str, Throwable th) {
            h2.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
        }
    }

    private void a() {
        h2 h2Var;
        j jVar = this.f6429a;
        if (jVar == null || !((Boolean) jVar.a(o4.f8101e2)).booleanValue() || (h2Var = parentInterstitialWrapper) == null || h2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b f10 = parentInterstitialWrapper.f();
        List g10 = f10.g();
        if (CollectionUtils.isEmpty(g10)) {
            return;
        }
        e eVar = (e) g10.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.f6429a.h0().b(q4.O, jSONObject.toString());
        this.f6429a.h0().b(q4.M, Long.valueOf(System.currentTimeMillis()));
        this.f6429a.h0().b(q4.P, CollectionUtils.toJsonString(a2.b(f10), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f6436h += l10.longValue();
        this.f6429a.h0().b(q4.N, Long.valueOf(this.f6436h));
    }
}
