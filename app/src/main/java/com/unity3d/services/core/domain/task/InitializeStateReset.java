package com.unity3d.services.core.domain.task;

import android.app.Application;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.ClientProperties;
import i8.o;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: InitializeStateReset.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class InitializeStateReset extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* compiled from: InitializeStateReset.kt */
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

    public InitializeStateReset(ISDKDispatchers dispatchers) {
        n.f(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: doWork-gIAlu-s$suspendImpl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m68doWorkgIAlus$suspendImpl(com.unity3d.services.core.domain.task.InitializeStateReset r5, com.unity3d.services.core.domain.task.InitializeStateReset.Params r6, m8.d<? super i8.o<? extends com.unity3d.services.core.configuration.Configuration>> r7) {
        /*
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1
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
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            i8.p.b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            d9.j0 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.label = r3
            java.lang.Object r7 = d9.i.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            i8.o r7 = (i8.o) r7
            java.lang.Object r5 = r7.i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset.m68doWorkgIAlus$suspendImpl(com.unity3d.services.core.domain.task.InitializeStateReset, com.unity3d.services.core.domain.task.InitializeStateReset$Params, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterLifecycleCallbacks() {
        if (Lifecycle.getLifecycleListener() != null) {
            Application application = ClientProperties.getApplication();
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
            }
            Lifecycle.setLifecycleListener(null);
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo52doWorkgIAlus(BaseParams baseParams, d dVar) {
        return m69doWorkgIAlus((Params) baseParams, (d<? super o<? extends Configuration>>) dVar);
    }

    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    public Object m69doWorkgIAlus(Params params, d<? super o<? extends Configuration>> dVar) {
        return m68doWorkgIAlus$suspendImpl(this, params, dVar);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("reset");
    }
}
