package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: TokenCountersKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TokenCountersKtKt {
    /* renamed from: -initializetokenCounters  reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.TokenCounters m122initializetokenCounters(l<? super TokenCountersKt.Dsl, w> block) {
        n.f(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        n.e(newBuilder, "newBuilder()");
        TokenCountersKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, l<? super TokenCountersKt.Dsl, w> block) {
        n.f(tokenCounters, "<this>");
        n.f(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = tokenCounters.toBuilder();
        n.e(builder, "this.toBuilder()");
        TokenCountersKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
