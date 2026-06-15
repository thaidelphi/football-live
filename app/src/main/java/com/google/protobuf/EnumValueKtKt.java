package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueKt;
/* compiled from: EnumValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class EnumValueKtKt {
    /* renamed from: -initializeenumValue  reason: not valid java name */
    public static final EnumValue m9initializeenumValue(t8.l<? super EnumValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder newBuilder = EnumValue.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        EnumValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, t8.l<? super EnumValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(enumValue, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builder = enumValue.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        EnumValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
