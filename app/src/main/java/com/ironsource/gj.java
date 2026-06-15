package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gj implements em {

    /* renamed from: a  reason: collision with root package name */
    private final InterstitialAdRequest f17572a;

    /* renamed from: b  reason: collision with root package name */
    private final InterstitialAdLoaderListener f17573b;

    /* renamed from: c  reason: collision with root package name */
    private final e3 f17574c;

    /* renamed from: d  reason: collision with root package name */
    private final p3 f17575d;

    public gj(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, e3 adapterConfigProvider, p3 analyticsFactory) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        kotlin.jvm.internal.n.f(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.n.f(analyticsFactory, "analyticsFactory");
        this.f17572a = adRequest;
        this.f17573b = publisherListener;
        this.f17574c = adapterConfigProvider;
        this.f17575d = analyticsFactory;
    }

    public /* synthetic */ gj(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, e3 e3Var, p3 p3Var, int i10, kotlin.jvm.internal.h hVar) {
        this(interstitialAdRequest, interstitialAdLoaderListener, e3Var, (i10 & 8) != 0 ? new o3(IronSource.AD_UNIT.INTERSTITIAL) : p3Var);
    }

    @Override // com.ironsource.em
    public bm a() throws Exception {
        IronSourceError b10;
        String instanceId = this.f17572a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        kotlin.jvm.internal.n.e(sDKVersion, "getSDKVersion()");
        q3 a10 = this.f17575d.a(new k3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            cm a11 = new dm(this.f17572a.getAdm(), this.f17572a.getProviderName$mediationsdk_release(), this.f17574c, kn.f18097e.a().c().get()).a();
            new ej(a11).a();
            wn wnVar = new wn();
            k5 k5Var = new k5(this.f17572a.getAdm(), this.f17572a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f17572a;
            kotlin.jvm.internal.n.c(a11);
            hg hgVar = hg.f17676a;
            return new dj(interstitialAdRequest, a11, new fj(hgVar, this.f17573b), k5Var, wnVar, a10, new zi(a10, hgVar.c()), null, null, 384, null);
        } catch (Exception e8) {
            o9.d().a(e8);
            if (e8 instanceof or) {
                b10 = ((or) e8).a();
            } else {
                wb wbVar = wb.f21282a;
                String message = e8.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                b10 = wbVar.b(message);
            }
            return new xb(this.f17572a, new fj(hg.f17676a, this.f17573b), a10, b10);
        }
    }
}
