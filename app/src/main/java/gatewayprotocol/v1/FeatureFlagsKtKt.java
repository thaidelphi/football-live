package gatewayprotocol.v1;

import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: FeatureFlagsKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class FeatureFlagsKtKt {
    /* renamed from: -initializefeatureFlags  reason: not valid java name */
    public static final NativeConfigurationOuterClass.FeatureFlags m94initializefeatureFlags(l<? super FeatureFlagsKt.Dsl, w> block) {
        n.f(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        n.e(newBuilder, "newBuilder()");
        FeatureFlagsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.FeatureFlags copy(NativeConfigurationOuterClass.FeatureFlags featureFlags, l<? super FeatureFlagsKt.Dsl, w> block) {
        n.f(featureFlags, "<this>");
        n.f(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builder = featureFlags.toBuilder();
        n.e(builder, "this.toBuilder()");
        FeatureFlagsKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
