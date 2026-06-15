package com.unity3d.services;

import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import d9.j0;
import d9.k;
import d9.k0;
import d9.n0;
import d9.o0;
import d9.p0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.g;
import t8.p;
/* compiled from: SDKErrorHandler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class SDKErrorHandler implements k0 {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final j0 ioDispatcher;
    private final k0.b key;
    private final o0 scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: SDKErrorHandler.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public SDKErrorHandler(j0 ioDispatcher, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sdkMetricsSender) {
        n.f(ioDispatcher, "ioDispatcher");
        n.f(alternativeFlowReader, "alternativeFlowReader");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(sdkMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = ioDispatcher;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        this.scope = p0.h(p0.a(ioDispatcher), new n0("SDKErrorHandler"));
        this.key = k0.f24473s0;
    }

    private final String retrieveCoroutineName(g gVar) {
        String G0;
        n0 n0Var = (n0) gVar.get(n0.f24490b);
        return (n0Var == null || (G0 = n0Var.G0()) == null) ? "unknown" : G0;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4) {
        k.d(this.scope, null, null, new SDKErrorHandler$sendDiagnostic$1(this, str, str2, str4, str3, null), 3, null);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // m8.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) k0.a.a(this, r10, pVar);
    }

    @Override // m8.g.b, m8.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) k0.a.b(this, cVar);
    }

    @Override // d9.k0
    public void handleException(g context, Throwable exception) {
        String str;
        n.f(context, "context");
        n.f(exception, "exception");
        String retrieveCoroutineName = retrieveCoroutineName(context);
        if (exception instanceof NullPointerException) {
            str = "native_exception_npe";
        } else if (exception instanceof OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (exception instanceof IllegalStateException) {
            str = "native_exception_ise";
        } else if (exception instanceof SecurityException) {
            str = "native_exception_se";
        } else {
            str = exception instanceof RuntimeException ? "native_exception_re" : "native_exception";
        }
        String str2 = str;
        boolean invoke = this.alternativeFlowReader.invoke();
        String retrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(exception);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + retrieveUnityCrashValue);
        if (invoke) {
            sendDiagnostic(str2, retrieveUnityCrashValue, retrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(exception, 15));
        } else {
            sendMetric(new Metric(str2, retrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // m8.g
    public g minusKey(g.c<?> cVar) {
        return k0.a.c(this, cVar);
    }

    @Override // m8.g
    public g plus(g gVar) {
        return k0.a.d(this, gVar);
    }

    @Override // m8.g.b
    public k0.b getKey() {
        return this.key;
    }
}
