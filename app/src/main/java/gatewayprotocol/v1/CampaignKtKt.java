package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: CampaignKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CampaignKtKt {
    /* renamed from: -initializecampaign  reason: not valid java name */
    public static final CampaignStateOuterClass.Campaign m81initializecampaign(l<? super CampaignKt.Dsl, w> block) {
        n.f(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
        CampaignStateOuterClass.Campaign.Builder newBuilder = CampaignStateOuterClass.Campaign.newBuilder();
        n.e(newBuilder, "newBuilder()");
        CampaignKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.Campaign copy(CampaignStateOuterClass.Campaign campaign, l<? super CampaignKt.Dsl, w> block) {
        n.f(campaign, "<this>");
        n.f(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
        CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
        n.e(builder, "this.toBuilder()");
        CampaignKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getLoadTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        n.f(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getShowTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        n.f(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}
