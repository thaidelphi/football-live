package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import m8.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 implements ExposedFunction {
    final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
        return invoke2(objArr, (d<Object>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke2(java.lang.Object[] r10, m8.d<java.lang.Object> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "version"
            java.lang.String r5 = "content"
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L37
            if (r2 != r7) goto L2f
            i8.p.b(r11)
            goto L5f
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            i8.p.b(r11)
            r10 = r10[r6]
            java.lang.String r11 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.n.d(r10, r11)
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.String r11 = r10.optString(r5)
            int r10 = r10.optInt(r4)
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r2 = r9.$sendPrivacyUpdateRequest
            java.lang.String r8 = "privacyUpdateContentBase64"
            kotlin.jvm.internal.n.e(r11, r8)
            com.google.protobuf.ByteString r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r11, r6, r7, r3)
            r0.label = r7
            java.lang.Object r11 = r2.invoke(r10, r11, r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r11 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r11
            java.util.Map r10 = j8.g0.b()
            int r0 = r11.getVersion()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.c(r0)
            r10.put(r4, r0)
            com.google.protobuf.ByteString r11 = r11.getContent()
            java.lang.String r0 = "response.content"
            kotlin.jvm.internal.n.e(r11, r0)
            java.lang.String r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r11, r6, r7, r3)
            r10.put(r5, r11)
            java.util.Map r10 = j8.g0.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1.invoke2(java.lang.Object[], m8.d):java.lang.Object");
    }
}
