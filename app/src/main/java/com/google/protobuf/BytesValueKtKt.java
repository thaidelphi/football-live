package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueKt;
/* compiled from: BytesValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class BytesValueKtKt {
    /* renamed from: -initializebytesValue  reason: not valid java name */
    public static final BytesValue m4initializebytesValue(t8.l<? super BytesValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder newBuilder = BytesValue.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        BytesValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, t8.l<? super BytesValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(bytesValue, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builder = bytesValue.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        BytesValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
