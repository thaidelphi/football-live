package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.EnumKt;
/* compiled from: EnumKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class EnumKtKt {
    /* renamed from: -initializeenum  reason: not valid java name */
    public static final Enum m8initializeenum(t8.l<? super EnumKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder newBuilder = Enum.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        EnumKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Enum copy(Enum r22, t8.l<? super EnumKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(r22, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builder = r22.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        EnumKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        kotlin.jvm.internal.n.f(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
