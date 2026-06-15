package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
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
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mg;
import com.ironsource.mj;
import com.ironsource.o9;
import com.ironsource.ra;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements i.b {

    /* renamed from: a  reason: collision with root package name */
    private final ra f18688a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, g> f18689b;

    /* renamed from: c  reason: collision with root package name */
    private final mg<ISDemandOnlyInterstitialListener> f18690c;

    public f(List<NetworkSettings> list, mj mjVar, com.ironsource.mediationsdk.c cVar, mg<ISDemandOnlyInterstitialListener> mgVar, String str, String str2, ra raVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean j10 = mjVar.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(mjVar.g(), sessionId);
        this.f18689b = new ConcurrentHashMap<>();
        this.f18688a = raVar;
        this.f18690c = mgVar;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a10 = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (a10 != null) {
                    g gVar = new g(str, str2, networkSettings, this.f18690c.a(networkSettings.getSubProviderId()), mjVar.e(), a10, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(j10);
                    this.f18689b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.f18689b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(h.d dVar) {
        String c10 = dVar.c();
        String b10 = dVar.b();
        try {
            g gVar = this.f18689b.get(c10);
            if (gVar == null) {
                this.f18688a.a(2503, c10);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.f18690c.a(c10).onInterstitialAdLoadFailed(c10, buildNonExistentInstanceError);
            } else if (TextUtils.isEmpty(b10)) {
                gVar.c();
            } else {
                gVar.a(new o.a(IronSourceAES.decode(mb.b().c(), b10)));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e8.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.f18690c.a(c10).onInterstitialAdLoadFailed(c10, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.f18689b.get(str);
            if (gVar != null) {
                gVar.b();
                return;
            }
            this.f18688a.a(2507, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            this.f18690c.a(str).onInterstitialAdShowFailed(str, buildNonExistentInstanceError);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e8.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.f18690c.a(str).onInterstitialAdShowFailed(str, buildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.f18689b.get(str);
        if (gVar == null) {
            this.f18688a.a(2500, str);
            return false;
        }
        return gVar.a();
    }
}
