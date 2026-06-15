package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.AnyKt;
/* compiled from: AnyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AnyKtKt {
    /* renamed from: -initializeany  reason: not valid java name */
    public static final Any m1initializeany(t8.l<? super AnyKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder newBuilder = Any.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        AnyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Any copy(Any any, t8.l<? super AnyKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(any, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builder = any.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        AnyKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
