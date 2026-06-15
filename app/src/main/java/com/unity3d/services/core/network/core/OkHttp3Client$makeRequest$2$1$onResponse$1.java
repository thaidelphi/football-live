package com.unity3d.services.core.network.core;

import kotlin.jvm.internal.o;
import t8.a;
import y9.c;
import y9.e;
/* compiled from: OkHttp3Client.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class OkHttp3Client$makeRequest$2$1$onResponse$1 extends o implements a<Long> {
    final /* synthetic */ c $buffer;
    final /* synthetic */ e $source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$1(e eVar, c cVar) {
        super(0);
        this.$source = eVar;
        this.$buffer = cVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final Long invoke() {
        return Long.valueOf(this.$source.H(this.$buffer, 8192L));
    }
}
