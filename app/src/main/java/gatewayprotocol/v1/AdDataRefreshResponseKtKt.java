package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshResponseKt;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: AdDataRefreshResponseKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdDataRefreshResponseKtKt {
    /* renamed from: -initializeadDataRefreshResponse  reason: not valid java name */
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse m72initializeadDataRefreshResponse(l<? super AdDataRefreshResponseKt.Dsl, w> block) {
        n.f(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder();
        n.e(newBuilder, "newBuilder()");
        AdDataRefreshResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse copy(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse, l<? super AdDataRefreshResponseKt.Dsl, w> block) {
        n.f(adDataRefreshResponse, "<this>");
        n.f(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder = adDataRefreshResponse.toBuilder();
        n.e(builder, "this.toBuilder()");
        AdDataRefreshResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        n.f(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasError()) {
            return adDataRefreshResponseOrBuilder.getError();
        }
        return null;
    }
}
