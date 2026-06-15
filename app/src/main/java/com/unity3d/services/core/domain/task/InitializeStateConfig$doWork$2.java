package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import d9.o0;
import i8.o;
import i8.w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateConfig.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {32}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateConfig$doWork$2 extends l implements p<o0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, d<? super InitializeStateConfig$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateConfig$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object b10;
        Configuration configuration;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        Object mo53invokegIAlus;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                i8.p.b(obj);
                InitializeStateConfig.Params params = this.$params;
                InitializeStateConfig initializeStateConfig = this.this$0;
                o.a aVar = o.f26626b;
                DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                try {
                    initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    mo53invokegIAlus = initializeStateConfigWithLoader.mo53invokegIAlus(params2, (d<? super o<? extends Configuration>>) this);
                    if (mo53invokegIAlus == c10) {
                        return c10;
                    }
                    configuration = configuration2;
                } catch (NetworkIOException e8) {
                    e = e8;
                    configuration = configuration2;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                configuration = (Configuration) this.L$0;
                try {
                    i8.p.b(obj);
                    mo53invokegIAlus = ((o) obj).i();
                } catch (NetworkIOException e10) {
                    e = e10;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            }
            i8.p.b(mo53invokegIAlus);
            b10 = o.b((Configuration) mo53invokegIAlus);
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            b10 = o.b(i8.p.a(th));
        }
        if (o.g(b10)) {
            o.a aVar3 = o.f26626b;
            b10 = o.b(b10);
        } else {
            Throwable d10 = o.d(b10);
            if (d10 != null) {
                o.a aVar4 = o.f26626b;
                b10 = o.b(i8.p.a(d10));
            }
        }
        return o.a(b10);
    }
}
