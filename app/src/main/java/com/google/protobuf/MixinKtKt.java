package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;
/* compiled from: MixinKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class MixinKtKt {
    /* renamed from: -initializemixin  reason: not valid java name */
    public static final Mixin m17initializemixin(t8.l<? super MixinKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder newBuilder = Mixin.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        MixinKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Mixin copy(Mixin mixin, t8.l<? super MixinKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(mixin, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builder = mixin.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        MixinKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
