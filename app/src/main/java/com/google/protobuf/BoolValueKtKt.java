package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValueKt;
/* compiled from: BoolValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class BoolValueKtKt {
    /* renamed from: -initializeboolValue  reason: not valid java name */
    public static final BoolValue m3initializeboolValue(t8.l<? super BoolValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder newBuilder = BoolValue.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        BoolValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final BoolValue copy(BoolValue boolValue, t8.l<? super BoolValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(boolValue, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builder = boolValue.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        BoolValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
