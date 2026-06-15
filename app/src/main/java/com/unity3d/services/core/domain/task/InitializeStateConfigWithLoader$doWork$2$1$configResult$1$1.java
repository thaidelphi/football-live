package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import d9.i;
import d9.j0;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* compiled from: InitializeStateConfigWithLoader.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", l = {69}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 extends l implements p<Integer, d<? super w>, Object> {
    final /* synthetic */ a0<Configuration> $config;
    final /* synthetic */ a0<IConfigurationLoader> $configurationLoader;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitializeStateConfigWithLoader.kt */
    @f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super w>, Object> {
        final /* synthetic */ a0<Configuration> $config;
        final /* synthetic */ a0<IConfigurationLoader> $configurationLoader;
        int label;
        final /* synthetic */ InitializeStateConfigWithLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a0<IConfigurationLoader> a0Var, a0<Configuration> a0Var2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$configurationLoader = a0Var;
            this.$config = a0Var2;
            this.this$0 = initializeStateConfigWithLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n8.d.c();
            if (this.label == 0) {
                i8.p.b(obj);
                final a0<Configuration> a0Var = this.$config;
                final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
                this.$configurationLoader.f27364a.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1.1
                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onError(String errorMsg) {
                        SDKMetricsSender sDKMetricsSender;
                        n.f(errorMsg, "errorMsg");
                        sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                        Metric newEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                        n.e(newEmergencySwitchOff, "newEmergencySwitchOff()");
                        sDKMetricsSender.sendMetric(newEmergencySwitchOff);
                        throw new AbortRetryException(errorMsg);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, a0<IConfigurationLoader> a0Var, a0<Configuration> a0Var2, d<? super InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$configurationLoader = a0Var;
        this.$config = a0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(this.this$0, this.$configurationLoader, this.$config, dVar);
        initializeStateConfigWithLoader$doWork$2$1$configResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateConfigWithLoader$doWork$2$1$configResult$1$1;
    }

    public final Object invoke(int i10, d<? super w> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1) create(Integer.valueOf(i10), dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super w> dVar) {
        return invoke(num.intValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        ISDKDispatchers iSDKDispatchers;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            iSDKDispatchers = this.this$0.dispatchers;
            j0 io = iSDKDispatchers.getIo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, null);
            this.label = 1;
            if (i.g(io, anonymousClass1, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
