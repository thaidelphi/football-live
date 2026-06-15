package com.unity3d.ads.core.utils;

import d9.o0;
import d9.p0;
import d9.z0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.a;
import t8.p;
/* compiled from: CommonCoroutineTimer.kt */
@f(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class CommonCoroutineTimer$start$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ a<w> $action;
    final /* synthetic */ long $delayStartMillis;
    final /* synthetic */ long $repeatMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCoroutineTimer$start$1(long j10, a<w> aVar, long j11, d<? super CommonCoroutineTimer$start$1> dVar) {
        super(2, dVar);
        this.$delayStartMillis = j10;
        this.$action = aVar;
        this.$repeatMillis = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        CommonCoroutineTimer$start$1 commonCoroutineTimer$start$1 = new CommonCoroutineTimer$start$1(this.$delayStartMillis, this.$action, this.$repeatMillis, dVar);
        commonCoroutineTimer$start$1.L$0 = obj;
        return commonCoroutineTimer$start$1;
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((CommonCoroutineTimer$start$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        o0 o0Var;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            o0Var = (o0) this.L$0;
            long j10 = this.$delayStartMillis;
            this.L$0 = o0Var;
            this.label = 1;
            if (z0.a(j10, this) == c10) {
                return c10;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o0Var = (o0) this.L$0;
            i8.p.b(obj);
        }
        while (p0.g(o0Var)) {
            this.$action.invoke();
            long j11 = this.$repeatMillis;
            this.L$0 = o0Var;
            this.label = 2;
            if (z0.a(j11, this) == c10) {
                return c10;
            }
        }
        return w.f26638a;
    }
}
