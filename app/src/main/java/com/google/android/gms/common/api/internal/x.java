package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zabq f12256a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(zabq zabqVar) {
        this.f12256a = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void a() {
        Handler handler;
        handler = this.f12256a.f12339m.f12127p;
        handler.post(new w(this));
    }
}
