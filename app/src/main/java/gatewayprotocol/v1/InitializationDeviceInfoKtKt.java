package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: InitializationDeviceInfoKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationDeviceInfoKtKt {
    /* renamed from: -initializeinitializationDeviceInfo  reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationDeviceInfo m100initializeinitializationDeviceInfo(l<? super InitializationDeviceInfoKt.Dsl, w> block) {
        n.f(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
        n.e(newBuilder, "newBuilder()");
        InitializationDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo copy(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo, l<? super InitializationDeviceInfoKt.Dsl, w> block) {
        n.f(initializationDeviceInfo, "<this>");
        n.f(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder = initializationDeviceInfo.toBuilder();
        n.e(builder, "this.toBuilder()");
        InitializationDeviceInfoKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
