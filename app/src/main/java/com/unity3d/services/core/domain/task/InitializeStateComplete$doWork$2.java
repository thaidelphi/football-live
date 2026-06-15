package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import d9.o0;
import i8.o;
import i8.w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateComplete.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateComplete$doWork$2 extends l implements p<o0, d<? super o<? extends w>>, Object> {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, d<? super InitializeStateComplete$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateComplete$doWork$2(this.$params, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super o<w>> dVar) {
        return ((InitializeStateComplete$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super o<? extends w>> dVar) {
        return invoke2(o0Var, (d<? super o<w>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            InitializeStateComplete.Params params = this.$params;
            try {
                o.a aVar = o.f26626b;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                n.e(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        b.a(moduleConfiguration.initCompleteState(params.getConfig()));
                    }
                }
                b10 = o.b(w.f26638a);
            } catch (CancellationException e8) {
                throw e8;
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
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
