package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.StructKt;
/* compiled from: StructKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class StructKtKt {
    /* renamed from: -initializestruct  reason: not valid java name */
    public static final Struct m21initializestruct(t8.l<? super StructKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder newBuilder = Struct.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        StructKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Struct copy(Struct struct, t8.l<? super StructKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(struct, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builder = struct.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        StructKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
