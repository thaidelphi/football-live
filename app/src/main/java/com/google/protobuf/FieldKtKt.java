package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;
/* compiled from: FieldKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FieldKtKt {
    /* renamed from: -initializefield  reason: not valid java name */
    public static final Field m10initializefield(t8.l<? super FieldKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder newBuilder = Field.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        FieldKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Field copy(Field field, t8.l<? super FieldKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(field, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        FieldKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
