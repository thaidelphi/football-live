package com.unity3d.ads.adplayer;

import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Invocation.kt */
@f(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {23}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Invocation$handle$3 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ t8.l<d<Object>, Object> $handler;
    int label;
    final /* synthetic */ Invocation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Invocation$handle$3(t8.l<? super d<Object>, ? extends Object> lVar, Invocation invocation, d<? super Invocation$handle$3> dVar) {
        super(2, dVar);
        this.$handler = lVar;
        this.this$0 = invocation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new Invocation$handle$3(this.$handler, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((Invocation$handle$3) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        d9.w wVar;
        d9.w wVar2;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                i8.p.b(obj);
                t8.l<d<Object>, Object> lVar = this.$handler;
                this.label = 1;
                obj = lVar.invoke(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            wVar2 = this.this$0.completableDeferred;
            wVar2.L(obj);
        } catch (Throwable th) {
            wVar = this.this$0.completableDeferred;
            wVar.J(th);
        }
        return w.f26638a;
    }
}
