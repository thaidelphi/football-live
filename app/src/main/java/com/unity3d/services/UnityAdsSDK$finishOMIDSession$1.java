package com.unity3d.services;

import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import d9.o0;
import i8.g;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsSDK.kt */
@f(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", l = {192, 193}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK$finishOMIDSession$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ g<AlternativeFlowReader> $alternativeFlowReader$delegate;
    final /* synthetic */ g<GetAdObject> $getAdObject$delegate;
    final /* synthetic */ g<OmFinishSession> $omFinishSession$delegate;
    final /* synthetic */ o0 $omidScope;
    final /* synthetic */ String $opportunityId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$finishOMIDSession$1(String str, o0 o0Var, g<AlternativeFlowReader> gVar, g<? extends GetAdObject> gVar2, g<? extends OmFinishSession> gVar3, d<? super UnityAdsSDK$finishOMIDSession$1> dVar) {
        super(2, dVar);
        this.$opportunityId = str;
        this.$omidScope = o0Var;
        this.$alternativeFlowReader$delegate = gVar;
        this.$getAdObject$delegate = gVar2;
        this.$omFinishSession$delegate = gVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$finishOMIDSession$1(this.$opportunityId, this.$omidScope, this.$alternativeFlowReader$delegate, this.$getAdObject$delegate, this.$omFinishSession$delegate, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$finishOMIDSession$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = n8.b.c()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            i8.p.b(r5)
            goto L51
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            i8.p.b(r5)
            goto L3e
        L1e:
            i8.p.b(r5)
            i8.g<com.unity3d.ads.core.configuration.AlternativeFlowReader> r5 = r4.$alternativeFlowReader$delegate
            com.unity3d.ads.core.configuration.AlternativeFlowReader r5 = com.unity3d.services.UnityAdsSDK.access$finishOMIDSession$lambda$16(r5)
            boolean r5 = r5.invoke()
            if (r5 == 0) goto L51
            i8.g<com.unity3d.ads.core.domain.GetAdObject> r5 = r4.$getAdObject$delegate
            com.unity3d.ads.core.domain.GetAdObject r5 = com.unity3d.services.UnityAdsSDK.access$finishOMIDSession$lambda$14(r5)
            java.lang.String r1 = r4.$opportunityId
            r4.label = r3
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L3e
            return r0
        L3e:
            com.unity3d.ads.core.data.model.AdObject r5 = (com.unity3d.ads.core.data.model.AdObject) r5
            if (r5 == 0) goto L51
            i8.g<com.unity3d.ads.core.domain.om.OmFinishSession> r1 = r4.$omFinishSession$delegate
            com.unity3d.ads.core.domain.om.OmFinishSession r1 = com.unity3d.services.UnityAdsSDK.access$finishOMIDSession$lambda$15(r1)
            r4.label = r2
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 != r0) goto L51
            return r0
        L51:
            d9.o0 r5 = r4.$omidScope
            r0 = 0
            d9.p0.d(r5, r0, r3, r0)
            i8.w r5 = i8.w.f26638a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK$finishOMIDSession$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
