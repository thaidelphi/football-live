package gatewayprotocol.v1;

import gatewayprotocol.v1.CachedAssetsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: CachedAssetsConfigurationKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CachedAssetsConfigurationKtKt {
    /* renamed from: -initializecachedAssetsConfiguration  reason: not valid java name */
    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration m80initializecachedAssetsConfiguration(l<? super CachedAssetsConfigurationKt.Dsl, w> block) {
        n.f(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder();
        n.e(newBuilder, "newBuilder()");
        CachedAssetsConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration copy(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration, l<? super CachedAssetsConfigurationKt.Dsl, w> block) {
        n.f(cachedAssetsConfiguration, "<this>");
        n.f(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder = cachedAssetsConfiguration.toBuilder();
        n.e(builder, "this.toBuilder()");
        CachedAssetsConfigurationKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
