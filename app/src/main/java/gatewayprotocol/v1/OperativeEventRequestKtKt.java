package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.OperativeEventRequestKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: OperativeEventRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OperativeEventRequestKtKt {
    /* renamed from: -initializeoperativeEventRequest  reason: not valid java name */
    public static final OperativeEventRequestOuterClass.OperativeEventRequest m108initializeoperativeEventRequest(l<? super OperativeEventRequestKt.Dsl, w> block) {
        n.f(block, "block");
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
        n.e(newBuilder, "newBuilder()");
        OperativeEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final OperativeEventRequestOuterClass.OperativeEventRequest copy(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, l<? super OperativeEventRequestKt.Dsl, w> block) {
        n.f(operativeEventRequest, "<this>");
        n.f(block, "block");
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder = operativeEventRequest.toBuilder();
        n.e(builder, "this.toBuilder()");
        OperativeEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasCampaignState()) {
            return operativeEventRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return operativeEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasSessionCounters()) {
            return operativeEventRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return operativeEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
