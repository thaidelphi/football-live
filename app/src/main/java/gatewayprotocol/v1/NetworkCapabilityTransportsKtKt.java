package gatewayprotocol.v1;

import gatewayprotocol.v1.NetworkCapabilityTransportsKt;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: NetworkCapabilityTransportsKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class NetworkCapabilityTransportsKtKt {
    /* renamed from: -initializenetworkCapabilityTransports  reason: not valid java name */
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports m106initializenetworkCapabilityTransports(l<? super NetworkCapabilityTransportsKt.Dsl, w> block) {
        n.f(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        n.e(newBuilder, "newBuilder()");
        NetworkCapabilityTransportsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports copy(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports, l<? super NetworkCapabilityTransportsKt.Dsl, w> block) {
        n.f(networkCapabilityTransports, "<this>");
        n.f(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder = networkCapabilityTransports.toBuilder();
        n.e(builder, "this.toBuilder()");
        NetworkCapabilityTransportsKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
