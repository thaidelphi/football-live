package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import d9.o0;
import i8.w;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import org.json.JSONObject;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MetricSender.kt */
@f(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {65}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MetricSender$sendMetrics$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ List<Metric> $metrics;
    int label;
    final /* synthetic */ MetricSender this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$1(MetricSender metricSender, List<Metric> list, d<? super MetricSender$sendMetrics$1> dVar) {
        super(2, dVar);
        this.this$0 = metricSender;
        this.$metrics = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new MetricSender$sendMetrics$1(this.this$0, this.$metrics, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((MetricSender$sendMetrics$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        String str;
        MetricCommonTags metricCommonTags;
        String str2;
        HttpClient httpClient;
        Object execute;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            str = this.this$0.metricSampleRate;
            metricCommonTags = this.this$0.commonTags;
            List<Metric> list = this.$metrics;
            str2 = this.this$0.sessionToken;
            String jSONObject = new JSONObject(new MetricsContainer(str, metricCommonTags, list, str2).toMap()).toString();
            n.e(jSONObject, "JSONObject(container.toMap()).toString()");
            String metricEndPoint = this.this$0.getMetricEndPoint();
            if (metricEndPoint == null) {
                metricEndPoint = "";
            }
            HttpRequest httpRequest = new HttpRequest(metricEndPoint, null, RequestType.POST, jSONObject, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
            httpClient = this.this$0.httpClient;
            this.label = 1;
            execute = httpClient.execute(httpRequest, this);
            if (execute == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
            execute = obj;
        }
        HttpResponse httpResponse = (HttpResponse) execute;
        if (httpResponse.getStatusCode() / 100 == 2) {
            DeviceLog.debug("Metric " + this.$metrics + " sent to " + this.this$0.getMetricEndPoint());
        } else {
            DeviceLog.debug("Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode());
        }
        return w.f26638a;
    }
}
