package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: InitializationRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationRequestKtKt {
    /* renamed from: -initializeinitializationRequest  reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationRequest m101initializeinitializationRequest(l<? super InitializationRequestKt.Dsl, w> block) {
        n.f(block, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
        n.e(newBuilder, "newBuilder()");
        InitializationRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest copy(InitializationRequestOuterClass.InitializationRequest initializationRequest, l<? super InitializationRequestKt.Dsl, w> block) {
        n.f(initializationRequest, "<this>");
        n.f(block, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder builder = initializationRequest.toBuilder();
        n.e(builder, "this.toBuilder()");
        InitializationRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        n.f(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasClientInfo()) {
            return initializationRequestOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        n.f(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasDeviceInfo()) {
            return initializationRequestOrBuilder.getDeviceInfo();
        }
        return null;
    }
}
