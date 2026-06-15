package com.unity3d.services.core.network.core;

import kotlin.jvm.internal.o;
import t8.l;
/* compiled from: OkHttp3Client.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class OkHttp3Client$makeRequest$2$1$onResponse$2 extends o implements l<Long, Boolean> {
    public static final OkHttp3Client$makeRequest$2$1$onResponse$2 INSTANCE = new OkHttp3Client$makeRequest$2$1$onResponse$2();

    OkHttp3Client$makeRequest$2$1$onResponse$2() {
        super(1);
    }

    public final Boolean invoke(long j10) {
        return Boolean.valueOf(j10 != -1);
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ Boolean invoke(Long l10) {
        return invoke(l10.longValue());
    }
}
