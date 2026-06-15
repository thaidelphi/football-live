package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationDataKt;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: InitializationDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationDataKtKt {
    /* renamed from: -initializeinitializationData  reason: not valid java name */
    public static final InitializationDataOuterClass.InitializationData m99initializeinitializationData(l<? super InitializationDataKt.Dsl, w> block) {
        n.f(block, "block");
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        InitializationDataOuterClass.InitializationData.Builder newBuilder = InitializationDataOuterClass.InitializationData.newBuilder();
        n.e(newBuilder, "newBuilder()");
        InitializationDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationDataOuterClass.InitializationData copy(InitializationDataOuterClass.InitializationData initializationData, l<? super InitializationDataKt.Dsl, w> block) {
        n.f(initializationData, "<this>");
        n.f(block, "block");
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        InitializationDataOuterClass.InitializationData.Builder builder = initializationData.toBuilder();
        n.e(builder, "this.toBuilder()");
        InitializationDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        n.f(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasInitializationRequest()) {
            return initializationDataOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        n.f(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasSharedData()) {
            return initializationDataOrBuilder.getSharedData();
        }
        return null;
    }
}
