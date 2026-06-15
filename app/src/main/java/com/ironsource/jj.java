package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class jj extends m7<j2> implements InterstitialAdListener {
    public jj(tp tpVar, m1 m1Var, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, m5 m5Var, j2 j2Var) {
        super(tpVar, m1Var, baseAdAdapter, new c3(m1Var.g(), m1Var.g().getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), m5Var, j2Var);
    }
}
