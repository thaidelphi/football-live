package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* compiled from: InitializeStateConfigWithLoader.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class InitializeStateConfigWithLoader$doWork$2$1$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ a0<Configuration> $config;
    final /* synthetic */ a0<IConfigurationLoader> $configurationLoader;
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$1(a0<IConfigurationLoader> a0Var, a0<Configuration> a0Var2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, d<? super InitializeStateConfigWithLoader$doWork$2$1$1> dVar) {
        super(2, dVar);
        this.$configurationLoader = a0Var;
        this.$config = a0Var2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            final a0<Configuration> a0Var = this.$config;
            final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
            final InitializeStateConfigWithLoader.Params params = this.$params;
            this.$configurationLoader.f27364a.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1.1
                @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                public void onError(String errorMsg) {
                    SDKMetricsSender sDKMetricsSender;
                    n.f(errorMsg, "errorMsg");
                    sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                    Metric newEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                    n.e(newEmergencySwitchOff, "newEmergencySwitchOff()");
                    sDKMetricsSender.sendMetric(newEmergencySwitchOff);
                    throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(errorMsg), params.getConfig());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                public void onSuccess(Configuration configuration) {
                    TokenStorage tokenStorage;
                    n.f(configuration, "configuration");
                    a0Var.f27364a = configuration;
                    configuration.saveToDisk();
                    tokenStorage = initializeStateConfigWithLoader.tokenStorage;
                    tokenStorage.setInitToken(a0Var.f27364a.getUnifiedAuctionToken());
                }
            });
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
