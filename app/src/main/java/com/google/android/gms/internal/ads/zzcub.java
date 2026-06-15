package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcub implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzcub(zzcua zzcuaVar, zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        VersionInfoParcel zza = ((zzcgl) this.zzb).zza();
        zzezu zza2 = ((zzcqc) this.zzc).zza();
        zzbwj zzbwjVar = new zzbwj();
        zzbwk zzbwkVar = zza2.zzA;
        if (zzbwkVar != null) {
            zzezz zzezzVar = zza2.zzs;
            return new zzbwi(context, zza, zzbwkVar, zzezzVar == null ? null : zzezzVar.zzb, zzbwjVar);
        }
        return null;
    }
}
