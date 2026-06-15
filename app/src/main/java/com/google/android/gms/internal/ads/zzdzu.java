package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.b9;
import com.ironsource.da;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdzu extends zzfoe {
    private final Context zza;
    private final zzgba zzb;

    public zzdzu(Context context, zzgba zzgbaVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzin)).intValue(), zzfog.zza);
        this.zza = context;
        this.zzb = zzgbaVar;
    }

    public static /* synthetic */ Void zza(zzdzu zzdzuVar, zzdzw zzdzwVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(da.a.f16995d, Long.valueOf(zzdzwVar.zza));
        contentValues.put("gws_query_id", zzdzwVar.zzb);
        contentValues.put("url", zzdzwVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzdzwVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzbr zzA = com.google.android.gms.ads.internal.util.zzs.zzA(zzdzuVar.zza);
        if (zzA != null) {
            try {
                zzA.zze(ObjectWrapper.u0(zzdzuVar.zza));
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e8);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void zzb(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{da.a.f16995d, "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(da.a.f16995d);
                int columnIndex2 = query.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j10 = query.getLong(columnIndex);
                    String string = query.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        Uri parse = Uri.parse(string);
                        String encodedQuery = parse.getEncodedQuery();
                        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                        clearQuery.appendQueryParameter("bd", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().a() - j10));
                        str = String.valueOf(clearQuery.build()) + b9.i.f16694c + encodedQuery;
                    }
                    strArr[i10] = str;
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                zzuVar.zza(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zzc(final String str) {
        zze(new zzfdx(this) { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                zzdzu.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzdzw zzdzwVar) {
        zze(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzdzo
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                zzdzu.zza(zzdzu.this, zzdzwVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzfdx zzfdxVar) {
        zzgap.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdzu.this.getWritableDatabase();
            }
        }), new zzdzt(this, zzfdxVar), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // java.lang.Runnable
            public final void run() {
                zzdzu.zzf(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzh(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zze(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzdzp
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                zzdzu.this.zzg((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }
}
