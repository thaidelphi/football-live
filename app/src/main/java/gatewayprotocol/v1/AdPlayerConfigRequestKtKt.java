package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: AdPlayerConfigRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdPlayerConfigRequestKtKt {
    /* renamed from: -initializeadPlayerConfigRequest  reason: not valid java name */
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest m74initializeadPlayerConfigRequest(l<? super AdPlayerConfigRequestKt.Dsl, w> block) {
        n.f(block, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.Companion;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        n.e(newBuilder, "newBuilder()");
        AdPlayerConfigRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest copy(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest, l<? super AdPlayerConfigRequestKt.Dsl, w> block) {
        n.f(adPlayerConfigRequest, "<this>");
        n.f(block, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.Companion;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder = adPlayerConfigRequest.toBuilder();
        n.e(builder, "this.toBuilder()");
        AdPlayerConfigRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
