package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.DoubleValueKt;
/* compiled from: DoubleValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class DoubleValueKtKt {
    /* renamed from: -initializedoubleValue  reason: not valid java name */
    public static final DoubleValue m5initializedoubleValue(t8.l<? super DoubleValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder newBuilder = DoubleValue.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        DoubleValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DoubleValue copy(DoubleValue doubleValue, t8.l<? super DoubleValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(doubleValue, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder builder = doubleValue.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        DoubleValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
