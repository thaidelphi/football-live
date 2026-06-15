package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import j8.p;
import j8.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.n;
/* compiled from: MetricSenderWithBatch.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender _original, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        n.f(_original, "_original");
        n.f(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue<>();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String str, Map<String, String> tags) {
        List<Metric> b10;
        n.f(event, "event");
        n.f(tags, "tags");
        if (event.length() == 0) {
            DeviceLog.debug("Metric event not sent due to being empty: " + event);
            return;
        }
        b10 = p.b(new Metric(event, str, tags));
        sendMetrics(b10);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        List<Metric> b10;
        n.f(metric, "metric");
        b10 = p.b(metric);
        sendMetrics(b10);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(List<Metric> metrics) {
        n.f(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        List<Metric> d10;
        d10 = q.d();
        sendMetrics(d10);
    }

    public final void updateOriginal(SDKMetricsSender metrics) {
        n.f(metrics, "metrics");
        this._original = metrics;
    }
}
