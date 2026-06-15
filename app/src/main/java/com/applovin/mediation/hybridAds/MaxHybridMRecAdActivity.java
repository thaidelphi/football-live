package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.View;
import com.applovin.impl.q2;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxHybridMRecAdActivity extends q2 {

    /* renamed from: e  reason: collision with root package name */
    private View f9874e;

    public void a(r2 r2Var, View view, j jVar, MaxAdapterListener maxAdapterListener) {
        super.a(r2Var, jVar, maxAdapterListener);
        this.f9874e = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.q2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f9874e, "MaxHybridMRecAdActivity");
    }
}
