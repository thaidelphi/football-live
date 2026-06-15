package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskKt;
/* compiled from: FieldMaskKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FieldMaskKtKt {
    /* renamed from: -initializefieldMask  reason: not valid java name */
    public static final FieldMask m11initializefieldMask(t8.l<? super FieldMaskKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder newBuilder = FieldMask.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        FieldMaskKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final FieldMask copy(FieldMask fieldMask, t8.l<? super FieldMaskKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(fieldMask, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builder = fieldMask.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        FieldMaskKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
