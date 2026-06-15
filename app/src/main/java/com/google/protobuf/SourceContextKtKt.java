package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextKt;
/* compiled from: SourceContextKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class SourceContextKtKt {
    /* renamed from: -initializesourceContext  reason: not valid java name */
    public static final SourceContext m19initializesourceContext(t8.l<? super SourceContextKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder newBuilder = SourceContext.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        SourceContextKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, t8.l<? super SourceContextKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(sourceContext, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        SourceContextKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
