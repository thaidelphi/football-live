package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: DeveloperConsentKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DeveloperConsentKtKt {
    /* renamed from: -initializedeveloperConsent  reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsent m84initializedeveloperConsent(l<? super DeveloperConsentKt.Dsl, w> block) {
        n.f(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        n.e(newBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent copy(DeveloperConsentOuterClass.DeveloperConsent developerConsent, l<? super DeveloperConsentKt.Dsl, w> block) {
        n.f(developerConsent, "<this>");
        n.f(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builder = developerConsent.toBuilder();
        n.e(builder, "this.toBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
