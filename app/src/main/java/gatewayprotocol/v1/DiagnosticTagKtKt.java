package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: DiagnosticTagKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticTagKtKt {
    /* renamed from: -initializediagnosticTag  reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticTag m89initializediagnosticTag(l<? super DiagnosticTagKt.Dsl, w> block) {
        n.f(block, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
        n.e(newBuilder, "newBuilder()");
        DiagnosticTagKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticTag copy(DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag, l<? super DiagnosticTagKt.Dsl, w> block) {
        n.f(diagnosticTag, "<this>");
        n.f(block, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder = diagnosticTag.toBuilder();
        n.e(builder, "this.toBuilder()");
        DiagnosticTagKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
