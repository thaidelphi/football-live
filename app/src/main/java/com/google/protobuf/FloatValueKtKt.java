package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueKt;
/* compiled from: FloatValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FloatValueKtKt {
    /* renamed from: -initializefloatValue  reason: not valid java name */
    public static final FloatValue m12initializefloatValue(t8.l<? super FloatValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder newBuilder = FloatValue.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        FloatValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final FloatValue copy(FloatValue floatValue, t8.l<? super FloatValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(floatValue, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builder = floatValue.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        FloatValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
