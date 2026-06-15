package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mb;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ra;
import com.ironsource.u6;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements i.a {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, d> f18636a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private ra f18637b;

    public c(List<NetworkSettings> list, u6 u6Var, String str, String str2, ra raVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean k10 = u6Var.k();
        this.f18637b = raVar;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(u6Var.d(), sessionId));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a10 = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (a10 != null) {
                    d dVar = new d(str, str2, networkSettings, u6Var.b(), a10, eVar);
                    dVar.a(k10);
                    this.f18636a.put(dVar.l(), dVar);
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.f18636a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.f18637b.a(3503, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        d dVar = this.f18636a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout, new o.a(IronSourceAES.decode(mb.b().c(), str2)));
            return;
        }
        this.f18637b.a(3503, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(String str) {
        d dVar = this.f18636a.get(str);
        if (dVar != null) {
            dVar.r();
            return;
        }
        this.f18637b.a(IronSourceConstants.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
        IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
    }
}
