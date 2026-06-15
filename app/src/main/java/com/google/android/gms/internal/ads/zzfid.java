package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfid extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfie zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfid(zzfie zzfieVar) {
        this.zza = zzfieVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzr(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzr(false);
    }
}
