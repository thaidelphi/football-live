package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: RequestTimeoutPolicyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RequestTimeoutPolicyKtKt {
    /* renamed from: -initializerequestTimeoutPolicy  reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy m115initializerequestTimeoutPolicy(l<? super RequestTimeoutPolicyKt.Dsl, w> block) {
        n.f(block, "block");
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        n.e(newBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy copy(NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy, l<? super RequestTimeoutPolicyKt.Dsl, w> block) {
        n.f(requestTimeoutPolicy, "<this>");
        n.f(block, "block");
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder = requestTimeoutPolicy.toBuilder();
        n.e(builder, "this.toBuilder()");
        RequestTimeoutPolicyKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
