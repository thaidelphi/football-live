package com.unity3d.services.core.domain.task;

import d9.o;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import n8.c;
import t8.p;
/* compiled from: InitializeStateNetworkError.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", l = {82}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class InitializeStateNetworkError$doWork$2$1$success$1 extends l implements p<o0, d<? super w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2$1$success$1(InitializeStateNetworkError initializeStateNetworkError, d<? super InitializeStateNetworkError$doWork$2$1$success$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateNetworkError$doWork$2$1$success$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((InitializeStateNetworkError$doWork$2$1$success$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        d b10;
        Object c11;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            InitializeStateNetworkError initializeStateNetworkError = this.this$0;
            this.L$0 = initializeStateNetworkError;
            this.label = 1;
            b10 = c.b(this);
            o oVar = new o(b10, 1);
            oVar.C();
            initializeStateNetworkError.startListening(oVar);
            Object z10 = oVar.z();
            c11 = n8.d.c();
            if (z10 == c11) {
                h.c(this);
            }
            if (z10 == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            InitializeStateNetworkError initializeStateNetworkError2 = (InitializeStateNetworkError) this.L$0;
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
