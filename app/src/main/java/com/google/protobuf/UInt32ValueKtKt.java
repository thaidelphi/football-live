package com.google.protobuf;

import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueKt;
/* compiled from: UInt32ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UInt32ValueKtKt {
    /* renamed from: -initializeuInt32Value  reason: not valid java name */
    public static final UInt32Value m24initializeuInt32Value(t8.l<? super UInt32ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder newBuilder = UInt32Value.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        UInt32ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UInt32Value copy(UInt32Value uInt32Value, t8.l<? super UInt32ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(uInt32Value, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder builder = uInt32Value.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        UInt32ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
