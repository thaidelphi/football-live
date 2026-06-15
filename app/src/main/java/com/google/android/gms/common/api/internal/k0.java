package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class k0 implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f12222a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleApiClient f12223b;

    /* renamed from: c  reason: collision with root package name */
    public final GoogleApiClient.OnConnectionFailedListener f12224c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zak f12225d;

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f12225d.h(connectionResult, this.f12222a);
    }
}
