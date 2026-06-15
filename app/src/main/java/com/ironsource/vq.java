package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o2;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class vq extends o7<wq> {
    public vq(List<NetworkSettings> list, yq yqVar, String str, boolean z10, qk qkVar, IronSourceSegment ironSourceSegment) {
        super(new tq(str, list, yqVar, z10), qkVar, ironSourceSegment);
    }

    @Override // com.ironsource.n7
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getLoadWhileShowSupportedState(networkSettings);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    public void a(IronSourceError ironSourceError) {
        o2.a a10 = this.f19360o.h().a();
        if (a10 == o2.a.AUTOMATIC_LOAD_AFTER_CLOSE || a10 == o2.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f19365t.a(false, (AdInfo) null);
        } else {
            super.a(ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    /* renamed from: b */
    public wq a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i10, String str, m5 m5Var) {
        return new wq(this, new m1(IronSource.AD_UNIT.REWARDED_VIDEO, this.f19360o.o(), i10, this.f19352g, str, this.f19350e, this.f19351f, networkSettings, this.f19360o.n()), baseAdAdapter, m5Var, this);
    }

    @Override // com.ironsource.n7
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    @Override // com.ironsource.n7
    protected l2 g() {
        return new br();
    }

    @Override // com.ironsource.n7
    protected String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.n7
    protected String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.ironsource.n7
    protected boolean q() {
        return this.f19360o.h().a() == o2.a.MANUAL;
    }

    @Override // com.ironsource.n7
    protected boolean t() {
        return this.f19360o.h().a() == o2.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
