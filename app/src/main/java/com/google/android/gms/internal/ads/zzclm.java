package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzclm implements zzgal {
    final /* synthetic */ zzclo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclm(zzclo zzcloVar) {
        this.zza = zzcloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbb zzfbbVar;
        zzfhk zzfhkVar;
        zzfag zzfagVar;
        zzezu zzezuVar;
        zzezu zzezuVar2;
        Context context;
        zzclo zzcloVar = this.zza;
        String str = (String) obj;
        zzfbbVar = zzcloVar.zzh;
        zzfhkVar = zzcloVar.zzg;
        zzfagVar = zzcloVar.zze;
        zzezuVar = zzcloVar.zzf;
        zzezuVar2 = zzcloVar.zzf;
        List zzd = zzfhkVar.zzd(zzfagVar, zzezuVar, false, "", str, zzezuVar2.zzc);
        zzclo zzcloVar2 = this.zza;
        zzbyf zzp = com.google.android.gms.ads.internal.zzv.zzp();
        context = zzcloVar2.zza;
        zzfbbVar.zzc(zzd, true == zzp.zzA(context) ? 2 : 1);
    }
}
