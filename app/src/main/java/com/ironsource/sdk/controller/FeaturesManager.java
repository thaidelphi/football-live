package com.ironsource.sdk.controller;

import com.ironsource.b9;
import com.ironsource.ch;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mm;
import com.ironsource.o8;
import com.ironsource.o9;
import com.ironsource.p8;
import com.ironsource.re;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.ss;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FeaturesManager {

    /* renamed from: d  reason: collision with root package name */
    private static volatile FeaturesManager f20180d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f20181e = "debugMode";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ?> f20182a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String> f20183b = new a();

    /* renamed from: c  reason: collision with root package name */
    private ch f20184c = mm.S().z();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends ArrayList<String> {
        a() {
            add(b9.d.f16587f);
            add(b9.d.f16586e);
            add(b9.d.f16588g);
            add(b9.d.f16589h);
            add(b9.d.f16590i);
            add(b9.d.f16591j);
            add(b9.d.f16592k);
            add(b9.d.f16593l);
            add(b9.d.f16594m);
        }
    }

    private FeaturesManager() {
        if (f20180d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f20182a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f20180d == null) {
            synchronized (FeaturesManager.class) {
                if (f20180d == null) {
                    f20180d = new FeaturesManager();
                }
            }
        }
        return f20180d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> a() {
        return new ArrayList<>(this.f20183b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(b9.a.f16533d) ? networkConfiguration.optJSONObject(b9.a.f16533d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f20182a.containsKey("debugMode")) {
                num = (Integer) this.f20182a.get("debugMode");
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public o8 getFeatureFlagCatchUrlError() {
        return new o8(SDKUtils.getNetworkConfiguration().optJSONObject(o8.a.f19527c));
    }

    public p8 getFeatureFlagClickCheck() {
        return new p8(SDKUtils.getNetworkConfiguration());
    }

    public re getFeatureFlagHealthCheck() {
        JSONObject a10 = this.f20184c.a(b9.a.f16547r);
        return a10 instanceof JSONObject ? new re(a10) : new re(null);
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(b9.a.f16535f);
        if (optJSONObject != null) {
            return optJSONObject.optInt(b9.a.f16534e, 0);
        }
        return 0;
    }

    public ss getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new ss(networkConfiguration.has(b9.a.f16548s) ? networkConfiguration.optJSONObject(b9.a.f16548s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f20184c.c(b9.a.f16550u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f20182a = map;
    }
}
