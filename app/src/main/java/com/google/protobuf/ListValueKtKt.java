package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.ListValueKt;
/* compiled from: ListValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ListValueKtKt {
    /* renamed from: -initializelistValue  reason: not valid java name */
    public static final ListValue m15initializelistValue(t8.l<? super ListValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder newBuilder = ListValue.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        ListValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ListValue copy(ListValue listValue, t8.l<? super ListValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(listValue, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builder = listValue.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        ListValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
