package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: DiagnosticEventRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticEventRequestKtKt {
    /* renamed from: -initializediagnosticEventRequest  reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest m87initializediagnosticEventRequest(l<? super DiagnosticEventRequestKt.Dsl, w> block) {
        n.f(block, "block");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        n.e(newBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest copy(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest, l<? super DiagnosticEventRequestKt.Dsl, w> block) {
        n.f(diagnosticEventRequest, "<this>");
        n.f(block, "block");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder = diagnosticEventRequest.toBuilder();
        n.e(builder, "this.toBuilder()");
        DiagnosticEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
