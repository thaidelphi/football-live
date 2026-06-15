package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.properties.InitializationStatusReader;
import d9.o0;
import d9.p0;
import j8.p;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
import u8.c;
/* compiled from: MetricSender.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClient httpClient;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final o0 scope;
    private final String sessionToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        int a10;
        n.f(configuration, "configuration");
        n.f(initializationStatusReader, "initializationStatusReader");
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        a10 = c.a(configuration.getMetricSampleRate());
        this.metricSampleRate = String.valueOf(a10);
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService("", b0.b(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClient = (HttpClient) getServiceProvider().getRegistry().getService("", b0.b(HttpClient.class));
        this.scope = p0.a(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String str, Map<String, String> tags) {
        List<Metric> b10;
        n.f(event, "event");
        n.f(tags, "tags");
        if (event.length() == 0) {
            DeviceLog.debug("Metric event not sent due to being null or empty: " + event);
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendMetrics(java.util.List<com.unity3d.services.core.request.metrics.Metric> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "metrics"
            kotlin.jvm.internal.n.f(r8, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L11
            java.lang.String r8 = "Metrics event not send due to being empty"
            com.unity3d.services.core.log.DeviceLog.debug(r8)
            return
        L11:
            java.lang.String r0 = r7.getMetricEndPoint()
            if (r0 == 0) goto L20
            boolean r0 = b9.f.m(r0)
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r0 == 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Metrics: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = " was not sent to null or empty endpoint: "
            r0.append(r8)
            java.lang.String r8 = r7.getMetricEndPoint()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r8)
            return
        L44:
            d9.k0$b r0 = d9.k0.f24473s0
            com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 r2 = new com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1
            r2.<init>(r0, r8)
            d9.o0 r1 = r7.scope
            r3 = 0
            com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1 r4 = new com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 2
            r6 = 0
            d9.i.d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.metrics.MetricSender.sendMetrics(java.util.List):void");
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
