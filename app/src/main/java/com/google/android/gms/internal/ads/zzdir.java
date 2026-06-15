package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdir implements zzgal {
    final /* synthetic */ zzdis zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdir(zzdis zzdisVar) {
        this.zza = zzdisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfo)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    /* renamed from: zzc */
    public final void zzb(List list) {
        try {
            zzcdq zzcdqVar = (zzcdq) list.get(0);
            if (zzcdqVar != null) {
                this.zza.zzb(zzcdqVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e8) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfo)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "omid native display exp");
            }
        }
    }
}
