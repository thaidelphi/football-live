package gatewayprotocol.v1;

import gatewayprotocol.v1.PrivacyUpdateResponseKt;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: PrivacyUpdateResponseKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class PrivacyUpdateResponseKtKt {
    /* renamed from: -initializeprivacyUpdateResponse  reason: not valid java name */
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse m112initializeprivacyUpdateResponse(l<? super PrivacyUpdateResponseKt.Dsl, w> block) {
        n.f(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder newBuilder = PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder();
        n.e(newBuilder, "newBuilder()");
        PrivacyUpdateResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse copy(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse, l<? super PrivacyUpdateResponseKt.Dsl, w> block) {
        n.f(privacyUpdateResponse, "<this>");
        n.f(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder = privacyUpdateResponse.toBuilder();
        n.e(builder, "this.toBuilder()");
        PrivacyUpdateResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
