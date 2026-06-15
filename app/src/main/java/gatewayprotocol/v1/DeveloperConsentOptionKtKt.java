package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: DeveloperConsentOptionKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DeveloperConsentOptionKtKt {
    /* renamed from: -initializedeveloperConsentOption  reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsentOption m85initializedeveloperConsentOption(l<? super DeveloperConsentOptionKt.Dsl, w> block) {
        n.f(block, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        n.e(newBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsentOption copy(DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption, l<? super DeveloperConsentOptionKt.Dsl, w> block) {
        n.f(developerConsentOption, "<this>");
        n.f(block, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder = developerConsentOption.toBuilder();
        n.e(builder, "this.toBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
