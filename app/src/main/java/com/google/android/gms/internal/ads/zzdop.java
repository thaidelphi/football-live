package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdop implements zzhdk {
    private final zzhdt zza;

    public zzdop(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzgba zzc = zzfdn.zzc();
        zzdph zzb = ((zzdpi) this.zza).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfa)).booleanValue()) {
            emptySet = Collections.singleton(new zzdbw(zzb, zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhds.zzb(emptySet);
        return emptySet;
    }
}
