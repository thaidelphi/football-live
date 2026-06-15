package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import j8.i0;
import j8.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: MetricsContainer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MetricsContainer {
    public static final Companion Companion = new Companion(null);
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final String apiLevel;
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;
    private final String metricSampleRate;
    private final List<Metric> metrics;
    private final String sTkn;
    private final String shSid;

    /* compiled from: MetricsContainer.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public MetricsContainer(String metricSampleRate, MetricCommonTags commonTags, List<Metric> metrics, String str) {
        n.f(metricSampleRate, "metricSampleRate");
        n.f(commonTags, "commonTags");
        n.f(metrics, "metrics");
        this.metricSampleRate = metricSampleRate;
        this.commonTags = commonTags;
        this.metrics = metrics;
        this.sTkn = str;
        this.shSid = Session.Default.getId();
        this.apiLevel = String.valueOf(Device.getApiLevel());
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    public final Map<String, Object> toMap() {
        int k10;
        Map b10;
        Map<String, Object> a10;
        List<Metric> list = this.metrics;
        k10 = r.k(list, 10);
        ArrayList arrayList = new ArrayList(k10);
        for (Metric metric : list) {
            arrayList.add(metric.toMap());
        }
        b10 = i0.b();
        b10.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        b10.put(METRICS_CONTAINER, arrayList);
        b10.put(METRICS_CONTAINER_TAGS, this.commonTags.toMap());
        b10.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        b10.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            b10.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        String deviceModel = this.deviceModel;
        if (deviceModel != null) {
            n.e(deviceModel, "deviceModel");
            b10.put("deviceModel", deviceModel);
        }
        String deviceName = this.deviceName;
        if (deviceName != null) {
            n.e(deviceName, "deviceName");
            b10.put(METRIC_CONTAINER_DEVICE_NAME, deviceName);
        }
        String deviceManufacturer = this.deviceManufacturer;
        if (deviceManufacturer != null) {
            n.e(deviceManufacturer, "deviceManufacturer");
            b10.put(METRIC_CONTAINER_DEVICE_MAKE, deviceManufacturer);
        }
        String gameId = this.gameId;
        if (gameId != null) {
            n.e(gameId, "gameId");
            b10.put("gameId", gameId);
        }
        a10 = i0.a(b10);
        return a10;
    }
}
