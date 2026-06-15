package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: TriggerInitializeListener.kt */
@f(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class TriggerInitializeListener$error$1 extends l implements p<o0, m8.d<? super w>, Object> {
    final /* synthetic */ String $errorMsg;
    final /* synthetic */ UnityAds.UnityAdsInitializationError $unityAdsInitializationError;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerInitializeListener$error$1(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str, m8.d<? super TriggerInitializeListener$error$1> dVar) {
        super(2, dVar);
        this.$unityAdsInitializationError = unityAdsInitializationError;
        this.$errorMsg = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new TriggerInitializeListener$error$1(this.$unityAdsInitializationError, this.$errorMsg, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((TriggerInitializeListener$error$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
