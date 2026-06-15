package com.unity3d.services.core.extensions;

import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoroutineExtensions.kt */
@f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1<T> extends l implements p<o0, d<? super T>, Object> {
    final /* synthetic */ t8.l<d<? super T>, Object> $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(t8.l<? super d<? super T>, ? extends Object> lVar, d<? super CoroutineExtensionsKt$memoize$2$deferred$1$1$1> dVar) {
        super(2, dVar);
        this.$action = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, dVar);
    }

    public final Object invoke(o0 o0Var, d<? super T> dVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object obj) {
        return invoke(o0Var, (d) ((d) obj));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            t8.l<d<? super T>, Object> lVar = this.$action;
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
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }
}
