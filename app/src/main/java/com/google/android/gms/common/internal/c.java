package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConnectionCallbacks f12543a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ConnectionCallbacks connectionCallbacks) {
        this.f12543a = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f12543a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.f12543a.onConnectionSuspended(i10);
    }
}
