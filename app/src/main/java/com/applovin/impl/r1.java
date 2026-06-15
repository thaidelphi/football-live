package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r1 extends o1 {
    public r1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.j jVar) {
        super(bVar, activity, jVar);
    }

    @Override // com.applovin.impl.o1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f8054d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f8053c.l(), (this.f8053c.w0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f8054d.addView(kVar, this.f8055e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f8054d);
        } else {
            this.f8052b.setContentView(this.f8054d);
        }
    }
}
