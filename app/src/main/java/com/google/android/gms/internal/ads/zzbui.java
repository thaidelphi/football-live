package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbui implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbuk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbui(zzbuk zzbukVar, Context context) {
        this.zza = context;
        this.zzb = zzbukVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbuh zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbuj zzbujVar = (zzbuj) weakHashMap.get(this.zza);
        if (zzbujVar != null) {
            if (zzbujVar.zza + ((Long) zzbdb.zzd.zze()).longValue() >= com.google.android.gms.ads.internal.zzv.zzC().a()) {
                zza = new zzbug(this.zza, zzbujVar.zzb).zza();
                zzbuk zzbukVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbukVar.zza;
                weakHashMap2.put(context, new zzbuj(zzbukVar, zza));
                return zza;
            }
        }
        zza = new zzbug(this.zza).zza();
        zzbuk zzbukVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbukVar2.zza;
        weakHashMap2.put(context2, new zzbuj(zzbukVar2, zza));
        return zza;
    }
}
