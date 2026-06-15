package com.google.protobuf;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationKt;
/* compiled from: DurationKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class DurationKtKt {
    /* renamed from: -initializeduration  reason: not valid java name */
    public static final Duration m6initializeduration(t8.l<? super DurationKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder newBuilder = Duration.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        DurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Duration copy(Duration duration, t8.l<? super DurationKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(duration, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builder = duration.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        DurationKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
