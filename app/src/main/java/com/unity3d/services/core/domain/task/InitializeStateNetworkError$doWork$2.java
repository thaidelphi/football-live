package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import d9.o0;
import d9.z2;
import i8.o;
import i8.w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateNetworkError.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateNetworkError$doWork$2 extends l implements p<o0, d<? super o<? extends w>>, Object> {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, d<? super InitializeStateNetworkError$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super o<w>> dVar) {
        return ((InitializeStateNetworkError$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super o<? extends w>> dVar) {
        return invoke2(o0Var, (d<? super o<w>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object b10;
        InitializeStateNetworkError initializeStateNetworkError;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                i8.p.b(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                o.a aVar = o.f26626b;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object d10 = z2.d(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (d10 == c10) {
                    return c10;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = d10;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                i8.p.b(obj);
            }
        } catch (CancellationException e8) {
            throw e8;
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            b10 = o.b(i8.p.a(th));
        }
        if (((w) obj) != null) {
            b10 = o.b(w.f26638a);
            if (o.g(b10)) {
                o.a aVar3 = o.f26626b;
                b10 = o.b(b10);
            } else {
                Throwable d11 = o.d(b10);
                if (d11 != null) {
                    o.a aVar4 = o.f26626b;
                    b10 = o.b(i8.p.a(d11));
                }
            }
            return o.a(b10);
        }
        ConnectivityMonitor.removeListener(initializeStateNetworkError);
        throw new Exception("No connected events within the timeout!");
    }
}
