package com.google.protobuf;

import com.google.protobuf.Value;
import com.google.protobuf.ValueKt;
/* compiled from: ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ValueKtKt {
    /* renamed from: -initializevalue  reason: not valid java name */
    public static final Value m26initializevalue(t8.l<? super ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder newBuilder = Value.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Value copy(Value value, t8.l<? super ValueKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(value, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builder = value.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.n.f(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.n.f(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
