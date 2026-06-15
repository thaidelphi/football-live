package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcmc implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzcmc(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzclz zzclzVar = (zzclz) this.zza.zzb();
        zzgba zzc = zzfdn.zzc();
        if (((JSONObject) this.zzb.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzdbw(zzclzVar, zzc));
        }
        zzhds.zzb(singleton);
        return singleton;
    }
}
