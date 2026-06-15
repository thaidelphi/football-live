package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzezj implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdn zza;
    final /* synthetic */ zzezl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezj(zzezl zzezlVar, com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        this.zza = zzdnVar;
        this.zzb = zzezlVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdmj zzdmjVar;
        zzdmjVar = this.zzb.zzi;
        if (zzdmjVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            }
        }
    }
}
