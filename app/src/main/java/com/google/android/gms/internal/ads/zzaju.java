package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaju implements zzajg {
    private final zzdx zza = new zzdx();
    private final zzdx zzb = new zzdx();
    private final zzajt zzc = new zzajt();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        this.zza.zzJ(bArr, i11 + i10);
        this.zza.zzL(i10);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        if (zzeh.zzN(this.zza, this.zzb, this.zzd)) {
            zzdx zzdxVar = this.zza;
            zzdx zzdxVar2 = this.zzb;
            zzdxVar.zzJ(zzdxVar2.zzN(), zzdxVar2.zze());
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzdx zzdxVar3 = this.zza;
            if (zzdxVar3.zzb() >= 3) {
                zzajt zzajtVar = this.zzc;
                int zze = zzdxVar3.zze();
                int zzm = zzdxVar3.zzm();
                int zzq = zzdxVar3.zzq();
                int zzd = zzdxVar3.zzd() + zzq;
                zzcn zzcnVar = null;
                if (zzd > zze) {
                    zzdxVar3.zzL(zze);
                } else {
                    if (zzm != 128) {
                        switch (zzm) {
                            case 20:
                                zzajt.zzd(zzajtVar, zzdxVar3, zzq);
                                break;
                            case 21:
                                zzajt.zzb(zzajtVar, zzdxVar3, zzq);
                                break;
                            case 22:
                                zzajt.zzc(zzajtVar, zzdxVar3, zzq);
                                break;
                        }
                    } else {
                        zzcn zza = zzajtVar.zza();
                        zzajtVar.zze();
                        zzcnVar = zza;
                    }
                    zzdxVar3.zzL(zzd);
                }
                if (zzcnVar != null) {
                    arrayList.add(zzcnVar);
                }
            } else {
                zzdaVar.zza(new zzaiy(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
