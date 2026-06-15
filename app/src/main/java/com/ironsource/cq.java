package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class cq {

    /* renamed from: b  reason: collision with root package name */
    private static cq f16898b;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, NetworkSettings> f16899a = new ConcurrentHashMap<>();

    private cq() {
    }

    public static synchronized cq c() {
        cq cqVar;
        synchronized (cq.class) {
            if (f16898b == null) {
                f16898b = new cq();
            }
            cqVar = f16898b;
        }
        return cqVar;
    }

    public HashSet<String> a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.f16899a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
        }
        return hashSet;
    }

    public void a() {
        this.f16899a.clear();
    }

    public void a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f16899a.put(networkSettings.getProviderName(), networkSettings);
    }

    public boolean a(String str) {
        return this.f16899a.containsKey(str);
    }

    public NetworkSettings b(String str) {
        NetworkSettings networkSettings = this.f16899a.get(str);
        if (networkSettings == null) {
            NetworkSettings networkSettings2 = new NetworkSettings(str);
            a(networkSettings2);
            return networkSettings2;
        }
        return networkSettings;
    }

    public void b() {
        for (NetworkSettings networkSettings : this.f16899a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings b10 = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.mergeJsons(networkSettings.getApplicationSettings(), b10.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.mergeJsons(networkSettings.getInterstitialSettings(), b10.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.mergeJsons(networkSettings.getRewardedVideoSettings(), b10.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.mergeJsons(networkSettings.getBannerSettings(), b10.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.mergeJsons(networkSettings.getNativeAdSettings(), b10.getNativeAdSettings()));
            }
        }
    }

    public NetworkSettings c(String str) {
        for (NetworkSettings networkSettings : this.f16899a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    public ConcurrentHashMap<String, NetworkSettings> d() {
        return this.f16899a;
    }
}
