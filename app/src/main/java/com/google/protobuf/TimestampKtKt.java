package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;
/* compiled from: TimestampKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class TimestampKtKt {
    /* renamed from: -initializetimestamp  reason: not valid java name */
    public static final Timestamp m22initializetimestamp(t8.l<? super TimestampKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder newBuilder = Timestamp.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        TimestampKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, t8.l<? super TimestampKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(timestamp, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        TimestampKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
