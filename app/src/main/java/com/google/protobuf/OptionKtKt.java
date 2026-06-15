package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;
/* compiled from: OptionKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class OptionKtKt {
    /* renamed from: -initializeoption  reason: not valid java name */
    public static final Option m18initializeoption(t8.l<? super OptionKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder newBuilder = Option.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        OptionKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Option copy(Option option, t8.l<? super OptionKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(option, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builder = option.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        OptionKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        kotlin.jvm.internal.n.f(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
