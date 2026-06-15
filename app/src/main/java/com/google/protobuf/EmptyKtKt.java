package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;
/* compiled from: EmptyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class EmptyKtKt {
    /* renamed from: -initializeempty  reason: not valid java name */
    public static final Empty m7initializeempty(t8.l<? super EmptyKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder newBuilder = Empty.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        EmptyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Empty copy(Empty empty, t8.l<? super EmptyKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(empty, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        EmptyKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
