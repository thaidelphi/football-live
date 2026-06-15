package gatewayprotocol.v1;

import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: SessionCountersKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class SessionCountersKtKt {
    /* renamed from: -initializesessionCounters  reason: not valid java name */
    public static final SessionCountersOuterClass.SessionCounters m116initializesessionCounters(l<? super SessionCountersKt.Dsl, w> block) {
        n.f(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder newBuilder = SessionCountersOuterClass.SessionCounters.newBuilder();
        n.e(newBuilder, "newBuilder()");
        SessionCountersKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters copy(SessionCountersOuterClass.SessionCounters sessionCounters, l<? super SessionCountersKt.Dsl, w> block) {
        n.f(sessionCounters, "<this>");
        n.f(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builder = sessionCounters.toBuilder();
        n.e(builder, "this.toBuilder()");
        SessionCountersKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
