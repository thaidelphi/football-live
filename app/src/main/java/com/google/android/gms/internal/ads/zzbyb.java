package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbyb extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbyf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyb(zzbyf zzbyfVar) {
        this.zza = zzbyfVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbbr zzbbrVar;
        zzbyf zzbyfVar = this.zza;
        context = zzbyfVar.zze;
        versionInfoParcel = zzbyfVar.zzf;
        zzbbp zzbbpVar = new zzbbp(context, versionInfoParcel.afmaVersion);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzv.zze();
                zzbbrVar = this.zza.zzh;
                zzbbs.zza(zzbbrVar, zzbbpVar);
            } catch (IllegalArgumentException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot config CSI reporter.", e8);
            }
        }
    }
}
