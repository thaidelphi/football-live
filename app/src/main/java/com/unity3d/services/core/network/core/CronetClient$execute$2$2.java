package com.unity3d.services.core.network.core;

import i8.w;
import kotlin.jvm.internal.o;
import org.chromium.net.UrlRequest;
import t8.l;
/* compiled from: CronetClient.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class CronetClient$execute$2$2 extends o implements l<Throwable, w> {
    final /* synthetic */ UrlRequest $req;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f26638a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$req.cancel();
    }
}
