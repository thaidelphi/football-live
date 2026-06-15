package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdzt implements zzgal {
    final /* synthetic */ zzfdx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzt(zzdzu zzdzuVar, zzfdx zzfdxVar) {
        this.zza = zzfdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get offline buffered ping database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e8) {
            String valueOf = String.valueOf(e8.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error executing function on offline buffered ping database: ".concat(valueOf));
        }
    }
}
