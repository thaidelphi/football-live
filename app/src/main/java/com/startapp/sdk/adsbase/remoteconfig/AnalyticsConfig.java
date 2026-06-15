package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AnalyticsConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23149a = "https://infoevent.startappservice.com/tracking/infoEvent";
    private static final long serialVersionUID = -1642999941036954496L;
    @TypeInfo(complex = true)
    private AdCallbacksConfig adCallbacks;
    @TypeInfo(type = ArrayList.class)
    private List<String> admHeaders;
    private double admPrb;
    @TypeInfo(type = HashMap.class, value = AnalyticsCategoryConfig.class)
    private Map<String, AnalyticsCategoryConfig> categories;
    public boolean dns;
    private int fuIef;
    public String hostPeriodic;
    public String hostSecured;
    private String noNetworkTimeout;
    private int retryNum;
    private int retryTime;
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig scheduledImpressionInfoEvents;
    private boolean sendHopsOnFirstSucceededSmartRedirect;
    private boolean sendViewabilityInfo;
    private float succeededSmartRedirectInfoProbability;

    public AnalyticsConfig() {
        String str = f23149a;
        this.hostSecured = str;
        this.hostPeriodic = str;
        this.dns = false;
        this.retryNum = 3;
        this.retryTime = 10;
        this.succeededSmartRedirectInfoProbability = 0.01f;
        this.sendHopsOnFirstSucceededSmartRedirect = false;
        this.adCallbacks = new AdCallbacksConfig();
        this.sendViewabilityInfo = false;
        this.admPrb = 0.0d;
        this.admHeaders = Collections.singletonList("Server-Timing");
        this.scheduledImpressionInfoEvents = null;
    }

    public final AdCallbacksConfig a() {
        return this.adCallbacks;
    }

    public final List<String> b() {
        return this.admHeaders;
    }

    public final double c() {
        return this.admPrb;
    }

    public final Map<String, AnalyticsCategoryConfig> d() {
        return this.categories;
    }

    public final int e() {
        return this.fuIef;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsConfig analyticsConfig = (AnalyticsConfig) obj;
        return this.dns == analyticsConfig.dns && this.retryNum == analyticsConfig.retryNum && this.retryTime == analyticsConfig.retryTime && Float.compare(this.succeededSmartRedirectInfoProbability, analyticsConfig.succeededSmartRedirectInfoProbability) == 0 && this.sendHopsOnFirstSucceededSmartRedirect == analyticsConfig.sendHopsOnFirstSucceededSmartRedirect && this.sendViewabilityInfo == analyticsConfig.sendViewabilityInfo && Double.compare(this.admPrb, analyticsConfig.admPrb) == 0 && this.fuIef == analyticsConfig.fuIef && o9.a(this.hostSecured, analyticsConfig.hostSecured) && o9.a(this.hostPeriodic, analyticsConfig.hostPeriodic) && o9.a(this.noNetworkTimeout, analyticsConfig.noNetworkTimeout) && o9.a(this.categories, analyticsConfig.categories) && o9.a(this.adCallbacks, analyticsConfig.adCallbacks) && o9.a(this.admHeaders, analyticsConfig.admHeaders) && o9.a(this.scheduledImpressionInfoEvents, analyticsConfig.scheduledImpressionInfoEvents);
    }

    public final String f() {
        return this.noNetworkTimeout;
    }

    public final int g() {
        return this.retryNum;
    }

    public final long h() {
        return TimeUnit.SECONDS.toMillis(this.retryTime);
    }

    public final int hashCode() {
        Object[] objArr = {this.hostSecured, this.hostPeriodic, Boolean.valueOf(this.dns), Integer.valueOf(this.retryNum), Integer.valueOf(this.retryTime), Float.valueOf(this.succeededSmartRedirectInfoProbability), Boolean.valueOf(this.sendHopsOnFirstSucceededSmartRedirect), this.noNetworkTimeout, this.categories, this.adCallbacks, Boolean.valueOf(this.sendViewabilityInfo), Double.valueOf(this.admPrb), this.admHeaders, Integer.valueOf(this.fuIef), this.scheduledImpressionInfoEvents};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final ComponentInfoEventConfig i() {
        return this.scheduledImpressionInfoEvents;
    }

    public final float j() {
        return this.succeededSmartRedirectInfoProbability;
    }

    public final boolean k() {
        return this.sendHopsOnFirstSucceededSmartRedirect;
    }

    public final boolean l() {
        return this.sendViewabilityInfo;
    }
}
