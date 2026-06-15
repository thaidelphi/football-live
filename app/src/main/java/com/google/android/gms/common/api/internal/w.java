package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x f12255a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(x xVar) {
        this.f12255a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.f12255a.f12256a;
        client = zabqVar.f12328b;
        client2 = zabqVar.f12328b;
        client.disconnect(client2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
