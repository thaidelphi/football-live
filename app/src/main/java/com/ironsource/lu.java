package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class lu {

    /* renamed from: a  reason: collision with root package name */
    public static final lu f18358a = new lu();

    private lu() {
    }

    private final JSONObject a(String str, String str2) {
        Map g10;
        g10 = j8.j0.g(i8.s.a(bu.f16777b, str), i8.s.a("sdkVersion", str2));
        return new JSONObject(g10);
    }

    public final int a() {
        return mm.f19249r.d().f().k();
    }

    public final ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public final IronSourceBannerLayout a(Activity activity, ISBannerSize size) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(size, "size");
        IronSourceBannerLayout b10 = com.ironsource.mediationsdk.p.m().b(activity, size);
        kotlin.jvm.internal.n.e(b10, "getInstance().createBanner(activity, size)");
        return b10;
    }

    public final String a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return c4.a(context, c(context));
    }

    public final String a(NetworkSettings networkSettings) {
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final String a(Placement placement) {
        String placementName;
        return (placement == null || (placementName = placement.getPlacementName()) == null) ? new String() : placementName;
    }

    public final String a(String key) {
        boolean w10;
        List c02;
        boolean w11;
        List c03;
        boolean w12;
        kotlin.jvm.internal.n.f(key, "key");
        try {
            w10 = b9.p.w(key, "-", false, 2, null);
            if (w10) {
                c02 = b9.p.c0(key, new String[]{"-"}, false, 0, 6, null);
                String str = (String) j8.o.B(c02);
                w11 = b9.p.w(str, "_", false, 2, null);
                if (!w11) {
                    return str;
                }
                c03 = b9.p.c0(str, new String[]{"_"}, false, 0, 6, null);
            } else {
                w12 = b9.p.w(key, "_", false, 2, null);
                if (!w12) {
                    return key;
                }
                c03 = b9.p.c0(key, new String[]{"_"}, false, 0, 6, null);
            }
            return (String) j8.o.v(c03);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.getMessage());
            return key;
        }
    }

    public final JSONObject a(boolean z10) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z10);
        kotlin.jvm.internal.n.e(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    public final void a(int i10, JSONObject data) {
        kotlin.jvm.internal.n.f(data, "data");
        ar.i().a(new zb(i10, data));
    }

    public final void a(Activity activity) {
        if (activity != null) {
            IronSource.showInterstitial(activity);
        } else {
            IronSource.showInterstitial();
        }
    }

    public final void a(IronSource.AD_UNIT adUnit, eu loadAdConfig) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        com.ironsource.mediationsdk.p.m().a(adUnit, loadAdConfig);
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.destroyBanner(ironSourceBannerLayout);
    }

    public final void a(LevelPlayBannerListener levelPlayBannerListener) {
        t5.a().b(levelPlayBannerListener);
    }

    public final void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        sg.a().b(levelPlayInterstitialListener);
    }

    public final void a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        dq.a().b(levelPlayRewardedVideoBaseListener);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final LevelPlayAdSize b(String str, int i10, int i11) {
        return ((str == null || str.length() == 0) || kotlin.jvm.internal.n.a(str, com.ironsource.mediationsdk.l.f18875f)) ? LevelPlayAdSize.Companion.createCustomSize(i10, i11) : kotlin.jvm.internal.n.a(str, com.ironsource.mediationsdk.l.f18872c) ? LevelPlayAdSize.MEDIUM_RECTANGLE : LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
    }

    public final String b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return c4.b(context, c(context));
    }

    public final JSONObject b() {
        JSONObject b10 = ce.a().b();
        kotlin.jvm.internal.n.e(b10, "getProperties().toJSON()");
        return b10;
    }

    public final void b(Activity activity) {
        if (activity != null) {
            IronSource.showRewardedVideo(activity);
        } else {
            IronSource.showRewardedVideo();
        }
    }

    public final void b(IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.loadBanner(ironSourceBannerLayout);
    }

    public final void b(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final String c(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return c4.g(context);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().d();
            kotlin.jvm.internal.n.e(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    lu luVar = f18358a;
                    String key = entry.getKey();
                    kotlin.jvm.internal.n.e(key, "entry.key");
                    String a10 = luVar.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    kotlin.jvm.internal.n.e(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    kotlin.jvm.internal.n.e(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(a10, luVar.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
        }
        return jSONObject;
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().c());
        concurrentHashMap.putAll(qk.b().c());
        return concurrentHashMap;
    }

    public final boolean e() {
        return IronSource.isInterstitialReady();
    }

    public final boolean f() {
        return IronSource.isRewardedVideoAvailable();
    }

    public final void g() {
        IronSource.loadInterstitial();
    }

    public final void h() {
        IronSource.loadRewardedVideo();
    }

    public final void i() {
        com.ironsource.mediationsdk.p.m().R();
    }
}
