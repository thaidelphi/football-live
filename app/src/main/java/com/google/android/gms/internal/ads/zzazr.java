package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazr implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzazs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazr(zzazs zzazsVar) {
        this.zza = zzazsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzazv zzazvVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzazs zzazsVar = this.zza;
            zzazvVar = zzazsVar.zzd;
            if (zzazvVar != null) {
                zzazsVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
