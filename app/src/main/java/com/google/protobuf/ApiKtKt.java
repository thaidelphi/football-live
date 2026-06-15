package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.ApiKt;
/* compiled from: ApiKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ApiKtKt {
    /* renamed from: -initializeapi  reason: not valid java name */
    public static final Api m2initializeapi(t8.l<? super ApiKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder newBuilder = Api.newBuilder();
        kotlin.jvm.internal.n.e(newBuilder, "newBuilder()");
        ApiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Api copy(Api api, t8.l<? super ApiKt.Dsl, i8.w> block) {
        kotlin.jvm.internal.n.f(api, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builder = api.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        ApiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        kotlin.jvm.internal.n.f(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
