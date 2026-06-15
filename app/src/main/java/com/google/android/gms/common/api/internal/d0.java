package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zact f12203a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(zact zactVar) {
        this.f12203a = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zacs zacsVar;
        zacsVar = this.f12203a.f12364g;
        zacsVar.c(new ConnectionResult(4));
    }
}
