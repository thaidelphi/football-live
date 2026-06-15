package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbaf implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbyu zza;
    final /* synthetic */ zzbag zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaf(zzbag zzbagVar, zzbyu zzbyuVar) {
        this.zza = zzbyuVar;
        this.zzb = zzbagVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
