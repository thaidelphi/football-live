package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcln implements zzgal {
    final /* synthetic */ String zza;
    final /* synthetic */ zzclo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcln(zzclo zzcloVar, String str) {
        this.zza = str;
        this.zzb = zzcloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzfbb zzfbbVar;
        zzfhk zzfhkVar;
        zzfag zzfagVar;
        zzezu zzezuVar;
        List zzu;
        zzclo zzcloVar = this.zzb;
        zzfbbVar = zzcloVar.zzh;
        zzfhkVar = zzcloVar.zzg;
        zzfagVar = zzcloVar.zze;
        zzezuVar = zzcloVar.zzf;
        zzu = zzcloVar.zzu();
        zzfbbVar.zza(zzfhkVar.zzd(zzfagVar, zzezuVar, false, this.zza, null, zzu));
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbb zzfbbVar;
        zzfhk zzfhkVar;
        zzfag zzfagVar;
        zzezu zzezuVar;
        List zzu;
        zzclo zzcloVar = this.zzb;
        String str = this.zza;
        String str2 = (String) obj;
        zzfbbVar = zzcloVar.zzh;
        zzfhkVar = zzcloVar.zzg;
        zzfagVar = zzcloVar.zze;
        zzezuVar = zzcloVar.zzf;
        zzu = zzcloVar.zzu();
        zzfbbVar.zza(zzfhkVar.zzd(zzfagVar, zzezuVar, false, str, str2, zzu));
    }
}
