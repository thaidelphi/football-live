package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class hj extends l7<jj, AdapterAdInteractionListener> {
    hj(xf xfVar, wf wfVar, List<NetworkSettings> list, mj mjVar, String str, qk qkVar, IronSourceSegment ironSourceSegment) {
        super(xfVar, wfVar, new ij(str, list, mjVar), qkVar, ironSourceSegment);
    }

    public hj(List<NetworkSettings> list, mj mjVar, String str, qk qkVar, IronSourceSegment ironSourceSegment) {
        super(new ij(str, list, mjVar), qkVar, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    /* renamed from: b */
    public jj a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i10, String str, m5 m5Var) {
        return new jj(this, new m1(IronSource.AD_UNIT.INTERSTITIAL, this.f19360o.o(), i10, this.f19352g, str, this.f19350e, this.f19351f, networkSettings, this.f19360o.n()), baseAdAdapter, m5Var, this);
    }

    @Override // com.ironsource.n7
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }

    @Override // com.ironsource.n7
    protected l2 g() {
        return new qj();
    }

    @Override // com.ironsource.n7
    protected String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.n7
    protected String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }
}
