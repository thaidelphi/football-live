package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.Invocation;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: HandleInvocationsFromAdViewer.kt */
@f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {161}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class HandleInvocationsFromAdViewer$invoke$2 extends l implements p<g9.f<? super Invocation>, m8.d<? super w>, Object> {
    final /* synthetic */ t8.l<m8.d<? super w>, Object> $onSubscription;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandleInvocationsFromAdViewer$invoke$2(t8.l<? super m8.d<? super w>, ? extends Object> lVar, m8.d<? super HandleInvocationsFromAdViewer$invoke$2> dVar) {
        super(2, dVar);
        this.$onSubscription = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new HandleInvocationsFromAdViewer$invoke$2(this.$onSubscription, dVar);
    }

    @Override // t8.p
    public final Object invoke(g9.f<? super Invocation> fVar, m8.d<? super w> dVar) {
        return ((HandleInvocationsFromAdViewer$invoke$2) create(fVar, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            t8.l<m8.d<? super w>, Object> lVar = this.$onSubscription;
            this.label = 1;
            if (lVar.invoke(this) == c10) {
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
