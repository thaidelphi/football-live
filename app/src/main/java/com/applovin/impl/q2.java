package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.p2;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class q2 extends Activity implements p2.a {

    /* renamed from: a  reason: collision with root package name */
    protected com.applovin.impl.sdk.j f8435a;

    /* renamed from: b  reason: collision with root package name */
    protected p2 f8436b;

    /* renamed from: c  reason: collision with root package name */
    protected r2 f8437c = new r2(null);

    /* renamed from: d  reason: collision with root package name */
    private MaxAdapterListener f8438d;

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(r2 r2Var, com.applovin.impl.sdk.j jVar, MaxAdapterListener maxAdapterListener) {
        this.f8435a = jVar;
        this.f8437c = r2Var;
        this.f8438d = maxAdapterListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.setBackgroundColor(this.f8437c.a());
        com.applovin.impl.sdk.j jVar = this.f8435a;
        d.a(jVar != null ? ((Boolean) jVar.a(o4.f8253x2)).booleanValue() : true, this);
        p2 p2Var = new p2(this.f8437c, this);
        this.f8436b = p2Var;
        p2Var.setListener(this);
        this.f8436b.setVisibility(4);
        viewGroup.addView(this.f8436b);
        u7.a(this.f8436b, this.f8437c.b());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f8438d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            } else {
                throw new IllegalStateException("Failed to fire hidden callback (" + this.f8438d + "): neither interstitial nor app open ad");
            }
        }
        super.onDestroy();
    }

    @Override // com.applovin.impl.p2.a
    public void a(p2 p2Var) {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((ViewGroup) findViewById(16908290)).addView(view);
        this.f8436b.bringToFront();
        MaxAdapterListener maxAdapterListener = this.f8438d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
        } else {
            throw new IllegalStateException("Failed to fire display callback (" + this.f8438d + "): neither interstitial nor app open ad");
        }
    }

    private void a(String str) {
        MaxAdapterError maxAdapterError = new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Null hybrid ad view (" + str + ")");
        MaxAdapterListener maxAdapterListener = this.f8438d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        } else {
            throw new IllegalStateException("Failed to fire display failed callback (" + this.f8438d + "): neither interstitial nor app open ad");
        }
        finish();
    }
}
