package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueKt;
/* compiled from: UInt64ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value  reason: not valid java name */
    public static final UInt64Value m25initializeuInt64Value(t8.l<? super UInt64ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder newBuilder = UInt64Value.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        UInt64ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, t8.l<? super UInt64ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(uInt64Value, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builder = uInt64Value.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        UInt64ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
