package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z0 implements y0 {

    /* renamed from: a  reason: collision with root package name */
    private final vn f21603a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21604a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f21605b = 1000;

        private a() {
        }
    }

    public z0(vn networkLoadApi) {
        kotlin.jvm.internal.n.f(networkLoadApi, "networkLoadApi");
        this.f21603a = networkLoadApi;
    }

    @Override // com.ironsource.y0
    public String a() {
        return this.f21603a.a();
    }

    @Override // com.ironsource.y0
    public void a(rj adInstance, Map<String, String> loadParams) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        try {
            this.f21603a.a(adInstance, new xn(null, false, 3, null));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e8.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("1000: loadAd failed: ");
            sb.append(e8.getMessage());
            String sb2 = sb.toString();
            io b10 = adInstance.b();
            if (b10 instanceof ad) {
                io b11 = adInstance.b();
                kotlin.jvm.internal.n.d(b11, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((ad) b11).onInterstitialLoadFailed(sb2);
            } else if (b10 instanceof ko) {
                io b12 = adInstance.b();
                kotlin.jvm.internal.n.d(b12, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((ko) b12).onBannerLoadFail(sb2);
            }
        }
    }
}
