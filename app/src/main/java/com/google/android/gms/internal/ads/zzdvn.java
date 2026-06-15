package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdvn implements zzgal {
    final /* synthetic */ zzdvo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvn(zzdvo zzdvoVar) {
        this.zza = zzdvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        Pattern pattern;
        zzdyq zzdyqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgc)).booleanValue()) {
            pattern = zzdvo.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzdyqVar = this.zza.zzf;
                zzdyqVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdyq zzdyqVar;
        zzdyq zzdyqVar2;
        zzfag zzfagVar = (zzfag) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgc)).booleanValue()) {
            zzdyqVar = this.zza.zzf;
            zzdyqVar.zzi(zzfagVar.zzb.zzb.zzf);
            zzdyqVar2 = this.zza.zzf;
            zzdyqVar2.zzj(zzfagVar.zzb.zzb.zzg);
        }
    }
}
