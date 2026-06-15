package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import i8.o;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: InitializeStateLoadWeb.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateLoadWeb extends MetricTask<Params, LoadWebResult> {
    private final ISDKDispatchers dispatchers;
    private final HttpClient httpClient;
    private final InitializeStateNetworkError initializeStateNetworkError;

    /* compiled from: InitializeStateLoadWeb.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class LoadWebResult {
        private final Configuration config;
        private final String webViewDataString;

        public LoadWebResult(Configuration config, String webViewDataString) {
            n.f(config, "config");
            n.f(webViewDataString, "webViewDataString");
            this.config = config;
            this.webViewDataString = webViewDataString;
        }

        public static /* synthetic */ LoadWebResult copy$default(LoadWebResult loadWebResult, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i10 & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewDataString;
        }

        public final LoadWebResult copy(Configuration config, String webViewDataString) {
            n.f(config, "config");
            n.f(webViewDataString, "webViewDataString");
            return new LoadWebResult(config, webViewDataString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LoadWebResult) {
                LoadWebResult loadWebResult = (LoadWebResult) obj;
                return n.a(this.config, loadWebResult.config) && n.a(this.webViewDataString, loadWebResult.webViewDataString);
            }
            return false;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewDataString() {
            return this.webViewDataString;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewDataString.hashCode();
        }

        public String toString() {
            return "LoadWebResult(config=" + this.config + ", webViewDataString=" + this.webViewDataString + ')';
        }
    }

    /* compiled from: InitializeStateLoadWeb.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration config) {
            n.f(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration config) {
            n.f(config, "config");
            return new Params(config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && n.a(this.config, ((Params) obj).config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadWeb(ISDKDispatchers dispatchers, InitializeStateNetworkError initializeStateNetworkError, HttpClient httpClient) {
        n.f(dispatchers, "dispatchers");
        n.f(initializeStateNetworkError, "initializeStateNetworkError");
        n.f(httpClient, "httpClient");
        this.dispatchers = dispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.httpClient = httpClient;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo52doWorkgIAlus(BaseParams baseParams, d dVar) {
        return m66doWorkgIAlus((Params) baseParams, (d<? super o<LoadWebResult>>) dVar);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("download_web_view");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m66doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params r6, m8.d<? super i8.o<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            i8.p.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            i8.p.b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            d9.j0 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.label = r3
            java.lang.Object r7 = d9.i.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            i8.o r7 = (i8.o) r7
            java.lang.Object r6 = r7.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb.m66doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params, m8.d):java.lang.Object");
    }
}
