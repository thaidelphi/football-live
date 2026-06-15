package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
import t8.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {139, 145, 146}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyShowUseCase$invoke$2 extends l implements p<t8.a<? extends w>, m8.d<? super w>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ String $placement;
    final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, m8.d<? super w>, Object> $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$2(LegacyShowUseCase legacyShowUseCase, boolean z10, AdObject adObject, boolean z11, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super m8.d<? super w>, ? extends Object> tVar, String str, m8.d<? super LegacyShowUseCase$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = legacyShowUseCase;
        this.$isBanner = z10;
        this.$adObject = adObject;
        this.$useTimeout = z11;
        this.$reportShowError = tVar;
        this.$placement = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        LegacyShowUseCase$invoke$2 legacyShowUseCase$invoke$2 = new LegacyShowUseCase$invoke$2(this.this$0, this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, dVar);
        legacyShowUseCase$invoke$2.L$0 = obj;
        return legacyShowUseCase$invoke$2;
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(t8.a<? extends w> aVar, m8.d<? super w> dVar) {
        return invoke2((t8.a<w>) aVar, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(t8.a<w> aVar, m8.d<? super w> dVar) {
        return ((LegacyShowUseCase$invoke$2) create(aVar, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = n8.b.c()
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r10.L$0
            t8.a r0 = (t8.a) r0
            i8.p.b(r11)
            goto Lb5
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            java.lang.Object r1 = r10.L$0
            t8.a r1 = (t8.a) r1
            i8.p.b(r11)
            goto L8d
        L2a:
            java.lang.Object r1 = r10.L$0
            t8.a r1 = (t8.a) r1
            i8.p.b(r11)
            goto L76
        L32:
            i8.p.b(r11)
            java.lang.Object r11 = r10.L$0
            r1 = r11
            t8.a r1 = (t8.a) r1
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            g9.w r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r11)
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lbb
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            g9.w r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r11)
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lbb
            boolean r11 = r10.$isBanner
            if (r11 == 0) goto L63
            goto Lbb
        L63:
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r5 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
            com.unity3d.ads.core.data.model.AdObject r6 = r10.$adObject
            r10.L$0 = r1
            r10.label = r4
            java.lang.String r4 = "timeout"
            java.lang.Object r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r11, r5, r4, r6, r10)
            if (r11 != r0) goto L76
            return r0
        L76:
            boolean r11 = r10.$useTimeout
            if (r11 == 0) goto Lb8
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            com.unity3d.ads.core.domain.Show r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r11)
            com.unity3d.ads.core.data.model.AdObject r4 = r10.$adObject
            r10.L$0 = r1
            r10.label = r3
            java.lang.Object r11 = r11.terminate(r4, r10)
            if (r11 != r0) goto L8d
            return r0
        L8d:
            t8.t<java.lang.String, com.unity3d.ads.UnityAds$UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, m8.d<? super i8.w>, java.lang.Object> r3 = r10.$reportShowError
            com.unity3d.ads.UnityAds$UnityAdsShowError r5 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "[UnityAds] Timeout while trying to show "
            r11.append(r4)
            java.lang.String r4 = r10.$placement
            r11.append(r4)
            java.lang.String r6 = r11.toString()
            r7 = 0
            r8 = 0
            r10.L$0 = r1
            r10.label = r2
            java.lang.String r4 = "timeout"
            r9 = r10
            java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto Lb4
            return r0
        Lb4:
            r0 = r1
        Lb5:
            r0.invoke()
        Lb8:
            i8.w r11 = i8.w.f26638a
            return r11
        Lbb:
            i8.w r11 = i8.w.f26638a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
