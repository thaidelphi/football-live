package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueKt;
/* compiled from: StringValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class StringValueKtKt {
    /* renamed from: -initializestringValue  reason: not valid java name */
    public static final StringValue m20initializestringValue(t8.l<? super StringValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder newBuilder = StringValue.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        StringValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StringValue copy(StringValue stringValue, t8.l<? super StringValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(stringValue, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builder = stringValue.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        StringValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
