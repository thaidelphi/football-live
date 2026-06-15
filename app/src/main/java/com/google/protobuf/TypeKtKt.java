package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;
/* compiled from: TypeKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class TypeKtKt {
    /* renamed from: -initializetype  reason: not valid java name */
    public static final Type m23initializetype(t8.l<? super TypeKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder newBuilder = Type.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        TypeKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Type copy(Type type, t8.l<? super TypeKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(type, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builder = type.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        TypeKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        kotlin.jvm.internal.n.f(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
