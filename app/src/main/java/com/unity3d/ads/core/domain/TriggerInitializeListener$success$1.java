package com.unity3d.ads.core.domain;

import com.unity3d.services.core.properties.SdkProperties;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: TriggerInitializeListener.kt */
@f(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$success$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class TriggerInitializeListener$success$1 extends l implements p<o0, m8.d<? super w>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TriggerInitializeListener$success$1(m8.d<? super TriggerInitializeListener$success$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new TriggerInitializeListener$success$1(dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((TriggerInitializeListener$success$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            SdkProperties.notifyInitializationComplete();
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
