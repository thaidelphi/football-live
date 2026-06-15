package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingAdMarkupKt;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: HeaderBiddingAdMarkupKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HeaderBiddingAdMarkupKtKt {
    /* renamed from: -initializeheaderBiddingAdMarkup  reason: not valid java name */
    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup m96initializeheaderBiddingAdMarkup(l<? super HeaderBiddingAdMarkupKt.Dsl, w> block) {
        n.f(block, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder newBuilder = HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.newBuilder();
        n.e(newBuilder, "newBuilder()");
        HeaderBiddingAdMarkupKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup copy(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, l<? super HeaderBiddingAdMarkupKt.Dsl, w> block) {
        n.f(headerBiddingAdMarkup, "<this>");
        n.f(block, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder = headerBiddingAdMarkup.toBuilder();
        n.e(builder, "this.toBuilder()");
        HeaderBiddingAdMarkupKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
