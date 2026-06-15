package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: DiagnosticEventsConfigurationKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticEventsConfigurationKtKt {
    /* renamed from: -initializediagnosticEventsConfiguration  reason: not valid java name */
    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration m88initializediagnosticEventsConfiguration(l<? super DiagnosticEventsConfigurationKt.Dsl, w> block) {
        n.f(block, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        n.e(newBuilder, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration copy(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration, l<? super DiagnosticEventsConfigurationKt.Dsl, w> block) {
        n.f(diagnosticEventsConfiguration, "<this>");
        n.f(block, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder = diagnosticEventsConfiguration.toBuilder();
        n.e(builder, "this.toBuilder()");
        DiagnosticEventsConfigurationKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
