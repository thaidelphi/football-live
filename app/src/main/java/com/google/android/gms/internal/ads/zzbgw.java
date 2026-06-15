package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbgw extends zzbgb {
    final /* synthetic */ zzbgz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbgw(zzbgz zzbgzVar, zzbgy zzbgyVar) {
        this.zza = zzbgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zze(zzbfs zzbfsVar, String str) {
        com.google.android.gms.ads.formats.zzf zzfVar;
        com.google.android.gms.ads.formats.zzf zzfVar2;
        zzbft zzf;
        zzbgz zzbgzVar = this.zza;
        zzfVar = zzbgzVar.zzb;
        if (zzfVar == null) {
            return;
        }
        zzfVar2 = zzbgzVar.zzb;
        zzf = zzbgzVar.zzf(zzbfsVar);
        zzfVar2.zzb(zzf, str);
    }
}
