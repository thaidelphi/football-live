package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbar;
import com.ironsource.b9;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdzh {
    private final zzbak zza;
    private final Context zzb;
    private final zzdym zzc;
    private final VersionInfoParcel zzd;

    public zzdzh(Context context, VersionInfoParcel versionInfoParcel, zzbak zzbakVar, zzdym zzdymVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbakVar;
        this.zzc = zzdymVar;
    }

    public static /* synthetic */ Void zza(zzdzh zzdzhVar, boolean z10, SQLiteDatabase sQLiteDatabase) {
        if (z10) {
            zzdzhVar.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbar.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgwz e8) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(e8.getMessage());
                }
            }
            query.close();
            Context context = zzdzhVar.zzb;
            zzbar.zzaf.zzc zzi = zzbar.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzdzb.zza(sQLiteDatabase, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzdzb.zza(sQLiteDatabase, 1));
            zzi.zzx(zzdzb.zza(sQLiteDatabase, 3));
            zzi.zzF(com.google.android.gms.ads.internal.zzv.zzC().a());
            zzi.zzB(zzdzb.zzb(sQLiteDatabase, 2));
            final zzbar.zzaf zzbr = zzi.zzbr();
            int size = arrayList.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                zzbar.zzaf.zza zzaVar = (zzbar.zzaf.zza) arrayList.get(i11);
                if (zzaVar.zzk() == zzbar.zzq.ENUM_TRUE && zzaVar.zze() > j10) {
                    j10 = zzaVar.zze();
                }
            }
            if (j10 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(b9.h.X, Long.valueOf(j10));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzdzhVar.zza.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdzf
                @Override // com.google.android.gms.internal.ads.zzbaj
                public final void zza(zzbar.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzbar.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = zzdzhVar.zzd;
            zzbar.zzar.zza zzd = zzbar.zzar.zzd();
            zzd.zzg(versionInfoParcel.buddyApkVersion);
            zzd.zzi(zzdzhVar.zzd.clientJarVersion);
            zzd.zzh(true != zzdzhVar.zzd.isClientJar ? 2 : 0);
            final zzbar.zzar zzbr2 = zzd.zzbr();
            zzdzhVar.zza.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdzg
                @Override // com.google.android.gms.internal.ads.zzbaj
                public final void zza(zzbar.zzt.zza zzaVar2) {
                    zzbar.zzm.zza zzbM = zzaVar2.zzg().zzbM();
                    zzbM.zzw(zzbar.zzar.this);
                    zzaVar2.zzK(zzbM);
                }
            });
            zzdzhVar.zza.zzc(10004);
            zzdzb.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzdze
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final Object zza(Object obj) {
                    zzdzh.zza(zzdzh.this, z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e8) {
            String valueOf = String.valueOf(e8.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in offline signals database startup: ".concat(valueOf));
        }
    }
}
