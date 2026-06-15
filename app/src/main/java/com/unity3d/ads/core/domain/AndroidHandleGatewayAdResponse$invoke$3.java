package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import i8.n;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidHandleGatewayAdResponse.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHandleGatewayAdResponse$invoke$3 extends l implements p<n<? extends byte[], ? extends Integer>, m8.d<? super w>, Object> {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $placementId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$3(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, ByteString byteString, String str, m8.d<? super AndroidHandleGatewayAdResponse$invoke$3> dVar) {
        super(2, dVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$opportunityId = byteString;
        this.$placementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        AndroidHandleGatewayAdResponse$invoke$3 androidHandleGatewayAdResponse$invoke$3 = new AndroidHandleGatewayAdResponse$invoke$3(this.this$0, this.$opportunityId, this.$placementId, dVar);
        androidHandleGatewayAdResponse$invoke$3.L$0 = obj;
        return androidHandleGatewayAdResponse$invoke$3;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(n<byte[], Integer> nVar, m8.d<? super w> dVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$3) create(nVar, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(n<? extends byte[], ? extends Integer> nVar, m8.d<? super w> dVar) {
        return invoke2((n<byte[], Integer>) nVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
        if (r1 != null) goto L7;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            n8.b.c()
            int r0 = r9.label
            if (r0 != 0) goto L94
            i8.p.b(r10)
            java.lang.Object r10 = r9.L$0
            i8.n r10 = (i8.n) r10
            java.lang.Object r0 = r10.a()
            byte[] r0 = (byte[]) r0
            java.lang.Object r10 = r10.b()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r1 = r9.this$0
            com.unity3d.ads.core.data.repository.CampaignRepository r1 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getCampaignRepository$p(r1)
            com.google.protobuf.ByteString r2 = r9.$opportunityId
            gatewayprotocol.v1.CampaignStateOuterClass$Campaign r1 = r1.getCampaign(r2)
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L58
            gatewayprotocol.v1.CampaignKt$Dsl$Companion r5 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
            com.google.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
            java.lang.String r6 = "this.toBuilder()"
            kotlin.jvm.internal.n.e(r1, r6)
            gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r1 = (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder) r1
            gatewayprotocol.v1.CampaignKt$Dsl r1 = r5._create(r1)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = b9.c.f5283b
            r5.<init>(r0, r6)
            com.google.protobuf.ByteString r5 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r5, r4, r3, r2)
            r1.setData(r5)
            r1.setDataVersion(r10)
            gatewayprotocol.v1.CampaignStateOuterClass$Campaign r1 = r1._build()
            if (r1 == 0) goto L58
            goto L86
        L58:
            java.lang.String r1 = r9.$placementId
            com.google.protobuf.ByteString r5 = r9.$opportunityId
            gatewayprotocol.v1.CampaignKt$Dsl$Companion r6 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
            gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r7 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder()
            java.lang.String r8 = "newBuilder()"
            kotlin.jvm.internal.n.e(r7, r8)
            gatewayprotocol.v1.CampaignKt$Dsl r6 = r6._create(r7)
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = b9.c.f5283b
            r7.<init>(r0, r8)
            com.google.protobuf.ByteString r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r7, r4, r3, r2)
            r6.setData(r0)
            r6.setDataVersion(r10)
            r6.setPlacementId(r1)
            r6.setImpressionOpportunityId(r5)
            gatewayprotocol.v1.CampaignStateOuterClass$Campaign r1 = r6._build()
        L86:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r10 = r9.this$0
            com.unity3d.ads.core.data.repository.CampaignRepository r10 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getCampaignRepository$p(r10)
            com.google.protobuf.ByteString r0 = r9.$opportunityId
            r10.setCampaign(r0, r1)
            i8.w r10 = i8.w.f26638a
            return r10
        L94:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
