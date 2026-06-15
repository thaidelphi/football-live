package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;
/* compiled from: MethodKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class MethodKtKt {
    /* renamed from: -initializemethod  reason: not valid java name */
    public static final Method m16initializemethod(t8.l<? super MethodKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder newBuilder = Method.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        MethodKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Method copy(Method method, t8.l<? super MethodKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(method, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builder = method.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        MethodKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
