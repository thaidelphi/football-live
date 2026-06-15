package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcge implements zzhdk {
    private final zzhdt zza;

    public zzcge(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdsl zzdslVar = (zzdsl) this.zza.zzb();
        zzgba zzc = zzfdn.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbL)).booleanValue()) {
            emptySet = Collections.singleton(new zzdbw(zzdslVar, zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhds.zzb(emptySet);
        return emptySet;
    }
}
