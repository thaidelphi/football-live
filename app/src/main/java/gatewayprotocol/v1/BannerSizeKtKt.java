package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: BannerSizeKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BannerSizeKtKt {
    /* renamed from: -initializebannerSize  reason: not valid java name */
    public static final AdRequestOuterClass.BannerSize m79initializebannerSize(l<? super BannerSizeKt.Dsl, w> block) {
        n.f(block, "block");
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        n.e(newBuilder, "newBuilder()");
        BannerSizeKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.BannerSize copy(AdRequestOuterClass.BannerSize bannerSize, l<? super BannerSizeKt.Dsl, w> block) {
        n.f(bannerSize, "<this>");
        n.f(block, "block");
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder builder = bannerSize.toBuilder();
        n.e(builder, "this.toBuilder()");
        BannerSizeKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
