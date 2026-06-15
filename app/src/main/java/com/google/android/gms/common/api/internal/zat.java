package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    public final Api<?> f12393a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12394b;

    /* renamed from: c  reason: collision with root package name */
    private zau f12395c;

    private final zau b() {
        Preconditions.n(this.f12395c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f12395c;
    }

    public final void a(zau zauVar) {
        this.f12395c = zauVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        b().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        b().Z(connectionResult, this.f12393a, this.f12394b);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        b().onConnectionSuspended(i10);
    }
}
