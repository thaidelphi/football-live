package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyAdViewActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    AdColonyAdView f5685j;

    public AdColonyAdViewActivity() {
        this.f5685j = !a.d() ? null : a.b().k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        ViewParent parent = this.f5805a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f5805a);
        }
        this.f5685j.a();
        a.b().a((AdColonyAdView) null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f5685j.b();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public void onBackPressed() {
        b();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (a.d() && (adColonyAdView = this.f5685j) != null) {
            this.f5806b = adColonyAdView.getOrientation();
            super.onCreate(bundle);
            this.f5685j.b();
            AdColonyAdViewListener listener = this.f5685j.getListener();
            if (listener != null) {
                listener.onOpened(this.f5685j);
                return;
            }
            return;
        }
        a.b().a((AdColonyAdView) null);
        finish();
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
