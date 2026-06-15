package com.google.protobuf;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Int32ValueKt;
/* compiled from: Int32ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Int32ValueKtKt {
    /* renamed from: -initializeint32Value  reason: not valid java name */
    public static final Int32Value m13initializeint32Value(t8.l<? super Int32ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder newBuilder = Int32Value.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        Int32ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Int32Value copy(Int32Value int32Value, t8.l<? super Int32ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(int32Value, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder builder = int32Value.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        Int32ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
