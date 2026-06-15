package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeuk implements zzhdk {
    public static zzerz zza(Context context, zzbxt zzbxtVar, zzbxu zzbxuVar, Object obj, zzetc zzetcVar, zzetw zzetwVar, zzhde zzhdeVar, zzhde zzhdeVar2, zzhde zzhdeVar3, zzhde zzhdeVar4, zzhde zzhdeVar5, zzhde zzhdeVar6, zzhde zzhdeVar7, Executor executor, zzffn zzffnVar, zzdqf zzdqfVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzetp) obj);
        hashSet.add(zzetcVar);
        hashSet.add(zzetwVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfI)).booleanValue()) {
            hashSet.add((zzerw) zzhdeVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfJ)).booleanValue()) {
            hashSet.add((zzerw) zzhdeVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfL)).booleanValue()) {
            hashSet.add((zzerw) zzhdeVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfM)).booleanValue()) {
            hashSet.add((zzerw) zzhdeVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzde)).booleanValue()) {
            hashSet.add((zzerw) zzhdeVar7.zzb());
        }
        return new zzerz(context, executor, hashSet, zzffnVar, zzdqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
