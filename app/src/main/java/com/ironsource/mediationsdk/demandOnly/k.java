package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mb;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mg;
import com.ironsource.o9;
import com.ironsource.ra;
import com.ironsource.yq;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k implements i.c {

    /* renamed from: a  reason: collision with root package name */
    private final ra f18753a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f18754b;

    /* renamed from: c  reason: collision with root package name */
    private final mg<ISDemandOnlyRewardedVideoListener> f18755c;

    public k(List<NetworkSettings> list, yq yqVar, com.ironsource.mediationsdk.c cVar, mg<ISDemandOnlyRewardedVideoListener> mgVar, String str, String str2, ra raVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean d10 = yqVar.d();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(yqVar.k(), sessionId);
        this.f18754b = new ConcurrentHashMap<>();
        this.f18753a = raVar;
        this.f18755c = mgVar;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a10 = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (a10 != null) {
                    l lVar = new l(str, str2, networkSettings, this.f18755c.a(networkSettings.getSubProviderId()), yqVar.i(), a10, new com.ironsource.mediationsdk.e(fVar));
                    lVar.a(d10);
                    this.f18754b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public ConcurrentHashMap<String, l> a() {
        return this.f18754b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(h.d dVar) {
        String c10 = dVar.c();
        try {
            l lVar = this.f18754b.get(c10);
            if (lVar == null) {
                this.f18753a.a(1503, c10);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.f18755c.a(c10).onRewardedVideoAdLoadFailed(c10, buildNonExistentInstanceError);
            } else if (dVar.d()) {
                lVar.b(new o.a(IronSourceAES.decode(mb.b().c(), dVar.b())));
            } else {
                lVar.d();
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e8.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.f18755c.a(c10).onRewardedVideoAdLoadFailed(c10, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.f18754b.get(str);
        if (lVar == null) {
            this.f18753a.a(1500, str);
            return false;
        }
        return lVar.a();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.f18754b.get(str);
            if (lVar != null) {
                lVar.e();
                return;
            }
            this.f18753a.a(1507, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            this.f18755c.a(str).onRewardedVideoAdShowFailed(str, buildNonExistentInstanceError);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e8.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.f18755c.a(str).onRewardedVideoAdShowFailed(str, buildShowFailedError);
        }
    }
}
