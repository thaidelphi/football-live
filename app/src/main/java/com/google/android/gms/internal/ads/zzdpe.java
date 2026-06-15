package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbar;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdpe implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzdpe(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzeui) this.zza).zza();
        Context zza2 = ((zzcfx) this.zzb).zza();
        zzgba zzc = zzfdn.zzc();
        Map zzb = ((zzhdo) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfa)).booleanValue()) {
            zzbak zzbakVar = new zzbak(new zzbaq(zza2));
            zzbakVar.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdpf
                @Override // com.google.android.gms.internal.ads.zzbaj
                public final void zza(zzbar.zzt.zza zzaVar) {
                    zzaVar.zzO(zza);
                }
            });
            emptySet = Collections.singleton(new zzdbw(new zzdph(zzbakVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhds.zzb(emptySet);
        return emptySet;
    }
}
