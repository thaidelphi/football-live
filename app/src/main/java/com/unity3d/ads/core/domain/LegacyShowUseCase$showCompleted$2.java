package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$2", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyShowUseCase$showCompleted$2 extends l implements p<o0, m8.d<? super w>, Object> {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ ShowStatus $status;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$showCompleted$2(Listeners listeners, String str, ShowStatus showStatus, m8.d<? super LegacyShowUseCase$showCompleted$2> dVar) {
        super(2, dVar);
        this.$listeners = listeners;
        this.$placement = str;
        this.$status = showStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new LegacyShowUseCase$showCompleted$2(this.$listeners, this.$placement, this.$status, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((LegacyShowUseCase$showCompleted$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            this.$listeners.onComplete(this.$placement, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(this.$status));
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
