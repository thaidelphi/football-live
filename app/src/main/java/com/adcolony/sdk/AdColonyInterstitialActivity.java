package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyInterstitialActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    AdColonyInterstitial f5728j;

    /* renamed from: k  reason: collision with root package name */
    private i f5729k;

    public AdColonyInterstitialActivity() {
        this.f5728j = !a.d() ? null : a.b().j();
    }

    @Override // com.adcolony.sdk.b
    void a(h0 h0Var) {
        String e8;
        super.a(h0Var);
        d c10 = a.b().c();
        f1 f10 = c0.f(h0Var.a(), "v4iap");
        e1 a10 = c0.a(f10, "product_ids");
        AdColonyInterstitial adColonyInterstitial = this.f5728j;
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null && (e8 = a10.e(0)) != null) {
            this.f5728j.getListener().onIAPEvent(this.f5728j, e8, c0.d(f10, "engagement_type"));
        }
        c10.a(this.f5805a);
        if (this.f5728j != null) {
            c10.f().remove(this.f5728j.b());
            if (this.f5728j.getListener() != null) {
                this.f5728j.getListener().onClosed(this.f5728j);
                this.f5728j.a((c) null);
                this.f5728j.setListener(null);
            }
            this.f5728j.o();
            this.f5728j = null;
        }
        i iVar = this.f5729k;
        if (iVar != null) {
            iVar.a();
            this.f5729k = null;
        }
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.f5728j;
        this.f5806b = adColonyInterstitial2 == null ? -1 : adColonyInterstitial2.f();
        super.onCreate(bundle);
        if (!a.d() || (adColonyInterstitial = this.f5728j) == null) {
            return;
        }
        p0 e8 = adColonyInterstitial.e();
        if (e8 != null) {
            e8.a(this.f5805a);
        }
        this.f5729k = new i(new Handler(Looper.getMainLooper()), this.f5728j);
        if (this.f5728j.getListener() != null) {
            this.f5728j.getListener().onOpened(this.f5728j);
        }
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }
}
