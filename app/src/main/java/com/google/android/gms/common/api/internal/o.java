package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zaaw f12237a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(zaaw zaawVar, zaas zaasVar) {
        this.f12237a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ClientSettings clientSettings;
        com.google.android.gms.signin.zae zaeVar;
        clientSettings = this.f12237a.f12285r;
        ClientSettings clientSettings2 = (ClientSettings) Preconditions.m(clientSettings);
        zaeVar = this.f12237a.f12278k;
        ((com.google.android.gms.signin.zae) Preconditions.m(zaeVar)).c(new n(this.f12237a));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean p10;
        lock = this.f12237a.f12269b;
        lock.lock();
        try {
            p10 = this.f12237a.p(connectionResult);
            if (p10) {
                this.f12237a.h();
                this.f12237a.m();
            } else {
                this.f12237a.k(connectionResult);
            }
        } finally {
            lock2 = this.f12237a.f12269b;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
