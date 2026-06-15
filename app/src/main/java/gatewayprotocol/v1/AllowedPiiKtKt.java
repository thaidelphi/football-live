package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: AllowedPiiKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AllowedPiiKtKt {
    /* renamed from: -initializeallowedPii  reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m78initializeallowedPii(l<? super AllowedPiiKt.Dsl, w> block) {
        n.f(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder newBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        n.e(newBuilder, "newBuilder()");
        AllowedPiiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, l<? super AllowedPiiKt.Dsl, w> block) {
        n.f(allowedPii, "<this>");
        n.f(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        n.e(builder, "this.toBuilder()");
        AllowedPiiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
