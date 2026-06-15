package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class qj extends l2 {
    @Override // com.ironsource.l2
    public void a(AdInfo adInfo) {
        sg.a().c(adInfo);
    }

    @Override // com.ironsource.l2
    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        sg.a().a(ironSourceError, adInfo);
    }

    @Override // com.ironsource.l2
    public void a(Placement placement, AdInfo adInfo) {
        sg.a().b(adInfo);
    }

    @Override // com.ironsource.l2
    public void c(AdInfo adInfo) {
        sg.a().e(adInfo);
    }

    @Override // com.ironsource.l2
    public void d(AdInfo adInfo) {
        sg.a().d(adInfo);
    }

    @Override // com.ironsource.l2
    public void g(AdInfo adInfo) {
        sg.a().f(adInfo);
    }
}
