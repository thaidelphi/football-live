package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.v2;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class p7<Listener extends v2> extends m7<Listener> implements AdapterAdRewardListener {

    /* renamed from: r  reason: collision with root package name */
    private ib f19693r;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends hr {
        a() {
        }

        @Override // com.ironsource.hr
        public void a() {
            p7.this.U();
        }
    }

    public p7(tp tpVar, m1 m1Var, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, c3 c3Var, m5 m5Var, Listener listener) {
        super(tpVar, m1Var, baseAdAdapter, c3Var, m5Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f19847g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            e2 e2Var = this.f19844d;
            if (e2Var != null) {
                fv fvVar = e2Var.f17171k;
                fvVar.g("mCurrentPlacement is null state = " + this.f19845e);
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placement name = " + j()));
        if (this.f19844d != null) {
            HashMap hashMap = new HashMap();
            if (com.ironsource.mediationsdk.p.m().s() != null) {
                for (String str : com.ironsource.mediationsdk.p.m().s().keySet()) {
                    hashMap.put("custom_" + str, com.ironsource.mediationsdk.p.m().s().get(str));
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f19844d.f17170j.a(j(), this.f19847g.getRewardName(), this.f19847g.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, c()), ib.a(this.f19693r), hashMap, com.ironsource.mediationsdk.p.m().l());
        }
        ((v2) this.f19842b).a((p7<?>) this, this.f19847g);
    }

    @Override // com.ironsource.m7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f19693r = new ib();
        super.onAdClosed();
    }

    @Override // com.ironsource.q7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f19693r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().c()) {
            u().a(new a());
        } else {
            U();
        }
    }
}
