package gatewayprotocol.v1;

import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: AdOperationsConfigurationKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdOperationsConfigurationKtKt {
    /* renamed from: -initializeadOperationsConfiguration  reason: not valid java name */
    public static final NativeConfigurationOuterClass.AdOperationsConfiguration m73initializeadOperationsConfiguration(l<? super AdOperationsConfigurationKt.Dsl, w> block) {
        n.f(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        n.e(newBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration copy(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration, l<? super AdOperationsConfigurationKt.Dsl, w> block) {
        n.f(adOperationsConfiguration, "<this>");
        n.f(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder = adOperationsConfiguration.toBuilder();
        n.e(builder, "this.toBuilder()");
        AdOperationsConfigurationKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
