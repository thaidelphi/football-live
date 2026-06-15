package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: CampaignStateKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CampaignStateKtKt {
    /* renamed from: -initializecampaignState  reason: not valid java name */
    public static final CampaignStateOuterClass.CampaignState m82initializecampaignState(l<? super CampaignStateKt.Dsl, w> block) {
        n.f(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        n.e(newBuilder, "newBuilder()");
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState copy(CampaignStateOuterClass.CampaignState campaignState, l<? super CampaignStateKt.Dsl, w> block) {
        n.f(campaignState, "<this>");
        n.f(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder builder = campaignState.toBuilder();
        n.e(builder, "this.toBuilder()");
        CampaignStateKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
