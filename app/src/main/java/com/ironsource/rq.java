package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class rq implements em {

    /* renamed from: a  reason: collision with root package name */
    private final RewardedAdRequest f20011a;

    /* renamed from: b  reason: collision with root package name */
    private final RewardedAdLoaderListener f20012b;

    /* renamed from: c  reason: collision with root package name */
    private final e3 f20013c;

    /* renamed from: d  reason: collision with root package name */
    private final p3 f20014d;

    public rq(RewardedAdRequest adRequest, RewardedAdLoaderListener publisherListener, e3 adapterConfigProvider, p3 analyticsFactory) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        kotlin.jvm.internal.n.f(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.n.f(analyticsFactory, "analyticsFactory");
        this.f20011a = adRequest;
        this.f20012b = publisherListener;
        this.f20013c = adapterConfigProvider;
        this.f20014d = analyticsFactory;
    }

    public /* synthetic */ rq(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, e3 e3Var, p3 p3Var, int i10, kotlin.jvm.internal.h hVar) {
        this(rewardedAdRequest, rewardedAdLoaderListener, e3Var, (i10 & 8) != 0 ? new o3(IronSource.AD_UNIT.REWARDED_VIDEO) : p3Var);
    }

    @Override // com.ironsource.em
    public bm a() throws Exception {
        IronSourceError d10;
        String instanceId = this.f20011a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        kotlin.jvm.internal.n.e(sDKVersion, "getSDKVersion()");
        q3 a10 = this.f20014d.a(new k3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            cm a11 = new dm(this.f20011a.getAdm(), this.f20011a.getProviderName$mediationsdk_release(), this.f20013c, kn.f18097e.a().c().get()).a();
            new pq(a11).a();
            wn wnVar = new wn();
            k5 k5Var = new k5(this.f20011a.getAdm(), this.f20011a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f20011a;
            kotlin.jvm.internal.n.c(a11);
            hg hgVar = hg.f17676a;
            return new oq(rewardedAdRequest, a11, new qq(hgVar, this.f20012b), k5Var, wnVar, a10, new jq(a10, hgVar.c()), null, null, 384, null);
        } catch (Exception e8) {
            o9.d().a(e8);
            if (e8 instanceof or) {
                d10 = ((or) e8).a();
            } else {
                wb wbVar = wb.f21282a;
                String message = e8.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                d10 = wbVar.d(message);
            }
            return new yb(this.f20011a, new qq(hg.f17676a, this.f20012b), a10, d10);
        }
    }
}
