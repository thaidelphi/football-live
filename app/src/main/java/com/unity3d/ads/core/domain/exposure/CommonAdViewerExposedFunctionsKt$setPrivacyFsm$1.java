package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import i8.w;
import m8.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
        return invoke2(objArr, (d<? super w>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke2(java.lang.Object[] r5, m8.d<? super i8.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            i8.p.b(r6)
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            i8.p.b(r6)
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
            r2 = 0
            r5 = r5[r2]
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.n.d(r5, r2)
            java.lang.String r5 = (java.lang.String) r5
            r2 = 2
            byte[] r5 = android.util.Base64.decode(r5, r2)
            java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
            kotlin.jvm.internal.n.e(r5, r2)
            com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
            r0.label = r3
            java.lang.Object r5 = r6.setPrivacyFsm(r5, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            i8.w r5 = i8.w.f26638a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1.invoke2(java.lang.Object[], m8.d):java.lang.Object");
    }
}
