package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: RequestRetryPolicyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RequestRetryPolicyKtKt {
    /* renamed from: -initializerequestRetryPolicy  reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestRetryPolicy m114initializerequestRetryPolicy(l<? super RequestRetryPolicyKt.Dsl, w> block) {
        n.f(block, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        n.e(newBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy copy(NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy, l<? super RequestRetryPolicyKt.Dsl, w> block) {
        n.f(requestRetryPolicy, "<this>");
        n.f(block, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder = requestRetryPolicy.toBuilder();
        n.e(builder, "this.toBuilder()");
        RequestRetryPolicyKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
