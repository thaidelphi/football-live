package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshRequestKt;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: AdDataRefreshRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdDataRefreshRequestKtKt {
    /* renamed from: -initializeadDataRefreshRequest  reason: not valid java name */
    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest m71initializeadDataRefreshRequest(l<? super AdDataRefreshRequestKt.Dsl, w> block) {
        n.f(block, "block");
        AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.Companion;
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder newBuilder = AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
        n.e(newBuilder, "newBuilder()");
        AdDataRefreshRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest copy(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest, l<? super AdDataRefreshRequestKt.Dsl, w> block) {
        n.f(adDataRefreshRequest, "<this>");
        n.f(block, "block");
        AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.Companion;
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder = adDataRefreshRequest.toBuilder();
        n.e(builder, "this.toBuilder()");
        AdDataRefreshRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        n.f(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasCampaignState()) {
            return adDataRefreshRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        n.f(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        n.f(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasSessionCounters()) {
            return adDataRefreshRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        n.f(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasStaticDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
