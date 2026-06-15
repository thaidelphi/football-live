package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class wq extends p7<v2> implements RewardedVideoAdListener {
    public wq(tp tpVar, m1 m1Var, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, m5 m5Var, v2 v2Var) {
        super(tpVar, m1Var, baseAdAdapter, new c3(m1Var.g(), m1Var.g().getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), m5Var, v2Var);
    }
}
