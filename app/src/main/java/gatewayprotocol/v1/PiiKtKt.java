package gatewayprotocol.v1;

import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: PiiKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class PiiKtKt {
    /* renamed from: -initializepii  reason: not valid java name */
    public static final PiiOuterClass.Pii m109initializepii(l<? super PiiKt.Dsl, w> block) {
        n.f(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder newBuilder = PiiOuterClass.Pii.newBuilder();
        n.e(newBuilder, "newBuilder()");
        PiiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PiiOuterClass.Pii copy(PiiOuterClass.Pii pii, l<? super PiiKt.Dsl, w> block) {
        n.f(pii, "<this>");
        n.f(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builder = pii.toBuilder();
        n.e(builder, "this.toBuilder()");
        PiiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
