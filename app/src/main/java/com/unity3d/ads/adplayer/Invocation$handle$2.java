package com.unity3d.ads.adplayer;

import i8.p;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Invocation.kt */
@f(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Invocation$handle$2 extends l implements t8.l<d<? super w>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Invocation$handle$2(d<? super Invocation$handle$2> dVar) {
        super(1, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(d<?> dVar) {
        return new Invocation$handle$2(dVar);
    }

    @Override // t8.l
    public final Object invoke(d<? super w> dVar) {
        return ((Invocation$handle$2) create(dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            p.b(obj);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
