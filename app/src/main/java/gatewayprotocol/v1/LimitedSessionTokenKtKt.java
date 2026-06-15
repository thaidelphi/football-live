package gatewayprotocol.v1;

import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: LimitedSessionTokenKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LimitedSessionTokenKtKt {
    /* renamed from: -initializelimitedSessionToken  reason: not valid java name */
    public static final UniversalRequestOuterClass.LimitedSessionToken m103initializelimitedSessionToken(l<? super LimitedSessionTokenKt.Dsl, w> block) {
        n.f(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder newBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        n.e(newBuilder, "newBuilder()");
        LimitedSessionTokenKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken copy(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken, l<? super LimitedSessionTokenKt.Dsl, w> block) {
        n.f(limitedSessionToken, "<this>");
        n.f(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builder = limitedSessionToken.toBuilder();
        n.e(builder, "this.toBuilder()");
        LimitedSessionTokenKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
