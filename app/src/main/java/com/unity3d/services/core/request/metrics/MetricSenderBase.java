package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import i8.s;
import j8.i0;
import j8.j0;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: MetricSenderBase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class MetricSenderBase implements SDKMetricsSender {
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(InitializationStatusReader _initStatusReader) {
        n.f(_initStatusReader, "_initStatusReader");
        this._initStatusReader = _initStatusReader;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(Metric metric) {
        Map d10;
        Map l10;
        n.f(metric, "metric");
        d10 = i0.d(s.a("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())));
        l10 = j0.l(metric.getTags(), d10);
        sendMetric(Metric.copy$default(metric, null, null, l10, 3, null));
    }
}
