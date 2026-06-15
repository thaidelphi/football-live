package com.google.protobuf;

import com.google.protobuf.Int64Value;
import com.google.protobuf.Int64ValueKt;
/* compiled from: Int64ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Int64ValueKtKt {
    /* renamed from: -initializeint64Value  reason: not valid java name */
    public static final Int64Value m14initializeint64Value(t8.l<? super Int64ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder newBuilder = Int64Value.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        Int64ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Int64Value copy(Int64Value int64Value, t8.l<? super Int64ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(int64Value, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builder = int64Value.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        Int64ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
