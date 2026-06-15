package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbar;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdzc implements zzfeu {
    private final zzdyq zza;
    private final zzdyu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzc(zzdyq zzdyqVar, zzdyu zzdyuVar) {
        this.zza = zzdyqVar;
        this.zzb = zzdyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzd(zzfen zzfenVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgc)).booleanValue() && zzfen.RENDERER == zzfenVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().b() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdA(zzfen zzfenVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdB(zzfen zzfenVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgc)).booleanValue() && zzfen.RENDERER == zzfenVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().b() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdC(zzfen zzfenVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgc)).booleanValue()) {
            if (zzfen.RENDERER == zzfenVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzv.zzC().b());
            } else if (zzfen.PRELOADED_LOADER == zzfenVar || zzfen.SERVER_TRANSACTION == zzfenVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzv.zzC().b());
                final zzdyu zzdyuVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzdyuVar.zza.zza(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzdyt
                    @Override // com.google.android.gms.internal.ads.zzfdx
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzdyu.this.zzf()) {
                            return null;
                        }
                        long j10 = zzd;
                        zzbar.zzaf.zza.C0180zza zzn = zzbar.zzaf.zza.zzn();
                        zzn.zzP(j10);
                        byte[] zzaV = zzn.zzbr().zzaV();
                        zzdzb.zzf(sQLiteDatabase, false, false);
                        zzdzb.zzc(sQLiteDatabase, j10, zzaV);
                        return null;
                    }
                });
            }
        }
    }
}
