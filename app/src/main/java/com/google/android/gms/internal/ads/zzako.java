package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzako implements zzajg {
    private final zzdx zza = new zzdx();

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        zzcn zzp;
        this.zza.zzJ(bArr, i11 + i10);
        this.zza.zzL(i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzdx zzdxVar = this.zza;
            if (zzdxVar.zzb() > 0) {
                zzcv.zze(zzdxVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
                zzdx zzdxVar2 = this.zza;
                int zzg = zzdxVar2.zzg() - 8;
                if (zzdxVar2.zzg() == 1987343459) {
                    zzdx zzdxVar3 = this.zza;
                    CharSequence charSequence = null;
                    zzcl zzclVar = null;
                    while (zzg > 0) {
                        zzcv.zze(zzg >= 8, "Incomplete vtt cue box header found.");
                        int zzg2 = zzdxVar3.zzg();
                        int zzg3 = zzdxVar3.zzg();
                        int i12 = zzg - 8;
                        int i13 = zzg2 - 8;
                        String zzC = zzeh.zzC(zzdxVar3.zzN(), zzdxVar3.zzd(), i13);
                        zzdxVar3.zzM(i13);
                        if (zzg3 == 1937011815) {
                            zzclVar = zzaky.zzb(zzC);
                        } else if (zzg3 == 1885436268) {
                            charSequence = zzaky.zza(null, zzC.trim(), Collections.emptyList());
                        }
                        zzg = i12 - i13;
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (zzclVar != null) {
                        zzclVar.zzl(charSequence);
                        zzp = zzclVar.zzp();
                    } else {
                        Pattern pattern = zzaky.zza;
                        zzakw zzakwVar = new zzakw();
                        zzakwVar.zzc = charSequence;
                        zzp = zzakwVar.zza().zzp();
                    }
                    arrayList.add(zzp);
                } else {
                    this.zza.zzM(zzg);
                }
            } else {
                zzdaVar.zza(new zzaiy(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
