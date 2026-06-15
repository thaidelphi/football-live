package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f7 implements em {

    /* renamed from: a  reason: collision with root package name */
    private final BannerAdRequest f17384a;

    /* renamed from: b  reason: collision with root package name */
    private final BannerAdLoaderListener f17385b;

    /* renamed from: c  reason: collision with root package name */
    private final e3 f17386c;

    /* renamed from: d  reason: collision with root package name */
    private final p3 f17387d;

    public f7(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, e3 adapterConfigProvider, p3 analyticsFactory) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        kotlin.jvm.internal.n.f(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.n.f(analyticsFactory, "analyticsFactory");
        this.f17384a = adRequest;
        this.f17385b = publisherListener;
        this.f17386c = adapterConfigProvider;
        this.f17387d = analyticsFactory;
    }

    public /* synthetic */ f7(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, e3 e3Var, p3 p3Var, int i10, kotlin.jvm.internal.h hVar) {
        this(bannerAdRequest, bannerAdLoaderListener, e3Var, (i10 & 8) != 0 ? new o3(IronSource.AD_UNIT.BANNER) : p3Var);
    }

    @Override // com.ironsource.em
    public bm a() throws Exception {
        IronSourceError a10;
        String instanceId = this.f17384a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        kotlin.jvm.internal.n.e(sDKVersion, "getSDKVersion()");
        q3 a11 = this.f17387d.a(new k3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            cm a12 = new dm(this.f17384a.getAdm(), this.f17384a.getProviderName$mediationsdk_release(), this.f17386c, kn.f18097e.a().c().get()).a();
            new d7(a12, this.f17384a.getSize()).a();
            wn wnVar = new wn();
            k5 k5Var = new k5(this.f17384a.getAdm(), this.f17384a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f17384a;
            AdSize size = bannerAdRequest.getSize();
            kotlin.jvm.internal.n.c(a12);
            hg hgVar = hg.f17676a;
            return new c7(bannerAdRequest, size, k5Var, a12, wnVar, a11, new e7(hgVar, this.f17385b), new e6(a11, hgVar.c()), null, null, 768, null);
        } catch (Exception e8) {
            o9.d().a(e8);
            if (e8 instanceof or) {
                a10 = ((or) e8).a();
            } else {
                wb wbVar = wb.f21282a;
                String message = e8.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                a10 = wbVar.a(message);
            }
            return new vb(a10, new e7(hg.f17676a, this.f17385b), a11);
        }
    }
}
