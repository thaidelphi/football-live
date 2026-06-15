package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: PlacementKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class PlacementKtKt {
    /* renamed from: -initializeplacement  reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m110initializeplacement(l<? super PlacementKt.Dsl, w> block) {
        n.f(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder newBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        n.e(newBuilder, "newBuilder()");
        PlacementKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, l<? super PlacementKt.Dsl, w> block) {
        n.f(placement, "<this>");
        n.f(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        n.e(builder, "this.toBuilder()");
        PlacementKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
