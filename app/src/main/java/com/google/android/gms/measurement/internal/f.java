package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzns;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.da;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f extends r3 {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f12930f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f12931g = {cc.f16874p, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f12932h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f12933i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f12934j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f12935k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f12936l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f12937m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    private final e f12938d;

    /* renamed from: e  reason: collision with root package name */
    private final o3 f12939e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(zzkz zzkzVar) {
        super(zzkzVar);
        this.f12939e = new o3(this.f13220a.zzav());
        this.f13220a.u();
        this.f12938d = new e(this, this.f13220a.zzau(), "google_app_measurement.db");
    }

    static final void C(ContentValues contentValues, String str, Object obj) {
        Preconditions.g(b9.h.X);
        Preconditions.m(obj);
        if (obj instanceof String) {
            contentValues.put(b9.h.X, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(b9.h.X, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(b9.h.X, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long D(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = K().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e8) {
                this.f13220a.zzay().m().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long F(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = K().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e8) {
                this.f13220a.zzay().m().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0227: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0227 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void B(String str, long j10, long j11, y3 y3Var) {
        ?? r42;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        int i10;
        String str2;
        String[] strArr;
        Preconditions.m(y3Var);
        c();
        d();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase K = K();
                r42 = TextUtils.isEmpty(null);
                try {
                    if (r42 != 0) {
                        int i11 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        rawQuery = K.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (i11 != 0 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", i11 != 0 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i12 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        rawQuery = K.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (i12 != 0 ? " and rowid <= ?" : "") + " order by rowid limit 1;", i12 != 0 ? new String[]{null, String.valueOf(j11)} : new String[]{null});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str4 = string;
                    try {
                        Cursor query = K.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str4}, null, null, "rowid", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                        try {
                            if (!query.moveToFirst()) {
                                this.f13220a.zzay().m().b("Raw event metadata record is missing. appId", zzeo.u(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    zzgc zzgcVar = (zzgc) ((zzgb) zzlb.x(zzgc.zzt(), query.getBlob(0))).zzaE();
                                    if (query.moveToNext()) {
                                        this.f13220a.zzay().r().b("Get multiple raw event metadata records, expected one. appId", zzeo.u(str3));
                                    }
                                    query.close();
                                    Preconditions.m(zzgcVar);
                                    y3Var.f13261a = zzgcVar;
                                    if (j11 != -1) {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str3, str4, String.valueOf(j11)};
                                    } else {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str3, str4};
                                    }
                                    Cursor query2 = K.query("raw_events", new String[]{"rowid", "name", da.a.f16995d, "data"}, str2, strArr, null, null, "rowid", null);
                                    if (query2.moveToFirst()) {
                                        do {
                                            long j12 = query2.getLong(0);
                                            try {
                                                zzfr zzfrVar = (zzfr) zzlb.x(zzfs.zze(), query2.getBlob(3));
                                                zzfrVar.zzi(query2.getString(i10));
                                                zzfrVar.zzm(query2.getLong(2));
                                                if (!y3Var.a(j12, (zzfs) zzfrVar.zzaE())) {
                                                    query2.close();
                                                    return;
                                                }
                                            } catch (IOException e8) {
                                                this.f13220a.zzay().m().c("Data loss. Failed to merge raw event. appId", zzeo.u(str3), e8);
                                            }
                                        } while (query2.moveToNext());
                                        query2.close();
                                        return;
                                    }
                                    this.f13220a.zzay().r().b("Raw event data disappeared while in transaction. appId", zzeo.u(str3));
                                    query2.close();
                                } catch (IOException e10) {
                                    this.f13220a.zzay().m().c("Data loss. Failed to merge raw event metadata. appId", zzeo.u(str3), e10);
                                    query.close();
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                r42 = str4;
                                this.f13220a.zzay().m().c("Data loss. Error selecting raw event. appId", zzeo.u(str3), e);
                                if (r42 != 0) {
                                    r42.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = str4;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            str4 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            str4 = query;
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        r42 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e15) {
            e = e15;
            r42 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int E(String str, String str2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        c();
        d();
        try {
            return K().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().d("Error deleting conditional property", zzeo.u(str), this.f13220a.y().f(str2), e8);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final long G(String str, String str2) {
        long j10;
        SQLiteException e8;
        ContentValues contentValues;
        Preconditions.g(str);
        Preconditions.g("first_open_count");
        c();
        d();
        SQLiteDatabase K = K();
        K.beginTransaction();
        try {
            try {
                j10 = F("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j10 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (K.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f13220a.zzay().m().c("Failed to insert column (got -1). appId", zzeo.u(str), "first_open_count");
                        return -1L;
                    }
                    j10 = 0;
                }
            } catch (SQLiteException e10) {
                j10 = 0;
                e8 = e10;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Long.valueOf(1 + j10));
            } catch (SQLiteException e11) {
                e8 = e11;
                this.f13220a.zzay().m().d("Error inserting column. appId", zzeo.u(str), "first_open_count", e8);
                return j10;
            }
            if (K.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f13220a.zzay().m().c("Failed to update column (got 0). appId", zzeo.u(str), "first_open_count");
                return -1L;
            }
            K.setTransactionSuccessful();
            return j10;
        } finally {
            K.endTransaction();
        }
    }

    public final long H() {
        return F("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long I() {
        return F("select max(timestamp) from raw_events", null, 0L);
    }

    public final long J(String str) {
        Preconditions.g(str);
        return F("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final SQLiteDatabase K() {
        c();
        try {
            return this.f12938d.getWritableDatabase();
        } catch (SQLiteException e8) {
            this.f13220a.zzay().r().b("Error opening database", e8);
            throw e8;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle L(java.lang.String r8) {
        /*
            r7 = this;
            r7.c()
            r7.d()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.K()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.zzfy r8 = r7.f13220a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzeo r8 = r8.zzay()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzem r8 = r8.q()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfr r3 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzlk r2 = com.google.android.gms.measurement.internal.zzlb.x(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzke r2 = r2.zzaE()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzkz r8 = r7.f13125b     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.b0()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfw r3 = (com.google.android.gms.internal.measurement.zzfw) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.zzv()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.zzy()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.zzw()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfy r3 = r7.f13220a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzem r3 = r3.m()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeo.u(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.zzfy r2 = r7.f13220a     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzem r2 = r2.m()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.L(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01eb: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:51:0x01eb */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d A[Catch: SQLiteException -> 0x01cb, all -> 0x01ea, TryCatch #1 {all -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:35:0x01ab, B:37:0x01b4, B:28:0x0170, B:18:0x011d, B:46:0x01d1), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0170 A[Catch: SQLiteException -> 0x01cb, all -> 0x01ea, TryCatch #1 {all -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:35:0x01ab, B:37:0x01b4, B:28:0x0170, B:18:0x011d, B:46:0x01d1), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f A[Catch: SQLiteException -> 0x01cb, all -> 0x01ea, TryCatch #1 {all -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:35:0x01ab, B:37:0x01b4, B:28:0x0170, B:18:0x011d, B:46:0x01d1), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a2 A[Catch: SQLiteException -> 0x01cb, all -> 0x01ea, TryCatch #1 {all -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:35:0x01ab, B:37:0x01b4, B:28:0x0170, B:18:0x011d, B:46:0x01d1), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b4 A[Catch: SQLiteException -> 0x01cb, all -> 0x01ea, TRY_LEAVE, TryCatch #1 {all -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:35:0x01ab, B:37:0x01b4, B:28:0x0170, B:18:0x011d, B:46:0x01d1), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.a1 M(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.M(java.lang.String):com.google.android.gms.measurement.internal.a1");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac N(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.N(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final zzak O(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return P(j10, str, 1L, false, false, z12, false, z14);
    }

    public final zzak P(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Preconditions.g(str);
        c();
        d();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase K = K();
                Cursor query = K.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f13220a.zzay().r().b("Not updating daily counts, app is not known. appId", zzeo.u(str));
                    query.close();
                    return zzakVar;
                }
                if (query.getLong(0) == j10) {
                    zzakVar.f13296b = query.getLong(1);
                    zzakVar.f13295a = query.getLong(2);
                    zzakVar.f13297c = query.getLong(3);
                    zzakVar.f13298d = query.getLong(4);
                    zzakVar.f13299e = query.getLong(5);
                }
                if (z10) {
                    zzakVar.f13296b += j11;
                }
                if (z11) {
                    zzakVar.f13295a += j11;
                }
                if (z12) {
                    zzakVar.f13297c += j11;
                }
                if (z13) {
                    zzakVar.f13298d += j11;
                }
                if (z14) {
                    zzakVar.f13299e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.f13295a));
                contentValues.put("daily_events_count", Long.valueOf(zzakVar.f13296b));
                contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.f13297c));
                contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.f13298d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.f13299e));
                K.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzakVar;
            } catch (SQLiteException e8) {
                this.f13220a.zzay().m().c("Error updating daily counts. appId", zzeo.u(str), e8);
                if (0 != 0) {
                    cursor.close();
                }
                return zzakVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.i Q(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.Q(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.i");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.b4 S(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.g(r20)
            com.google.android.gms.common.internal.Preconditions.g(r21)
            r19.c()
            r19.d()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.K()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.T(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.b4 r0 = new com.google.android.gms.measurement.internal.b4     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.zzfy r2 = r1.f13220a     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzem r2 = r2.m()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeo.u(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.f13220a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzem r2 = r2.m()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeo.u(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzfy r5 = r1.f13220a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzej r5 = r5.y()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.f(r9)     // Catch: java.lang.Throwable -> La2
            r2.d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.b4");
    }

    @VisibleForTesting
    final Object T(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f13220a.zzay().m().a("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.f13220a.zzay().m().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    this.f13220a.zzay().m().a("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i10);
            }
            return Double.valueOf(cursor.getDouble(i10));
        } else {
            return Long.valueOf(cursor.getLong(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String U() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.K()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.zzfy r3 = r6.f13220a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzem r3 = r3.m()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.U():java.lang.String");
    }

    public final List V(String str, String str2, String str3) {
        Preconditions.g(str);
        c();
        d();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return W(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.f13220a.zzay().m();
        r27.f13220a.u();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List W(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.W(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List X(String str) {
        Preconditions.g(str);
        c();
        d();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f13220a.u();
                cursor = K().query("user_attributes", new String[]{"name", cc.f16874p, "set_timestamp", b9.h.X}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object T = T(cursor, 3);
                    if (T == null) {
                        this.f13220a.zzay().m().b("Read invalid user property value, ignoring it. appId", zzeo.u(str));
                    } else {
                        arrayList.add(new b4(str, str2, string, j10, T));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e8) {
                this.f13220a.zzay().m().c("Error querying user properties. appId", zzeo.u(str), e8);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r0 = r17.f13220a.zzay().m();
        r17.f13220a.u();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Y(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.Y(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void Z() {
        d();
        K().beginTransaction();
    }

    public final void a0() {
        d();
        K().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void b0(List list) {
        c();
        d();
        Preconditions.m(list);
        Preconditions.o(list.size());
        if (p()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (D("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.f13220a.zzay().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                K().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e8) {
                this.f13220a.zzay().m().b("Error incrementing retry count. error", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0() {
        c();
        d();
        if (p()) {
            long a10 = this.f13125b.Z().f13659e.a();
            long b10 = this.f13220a.zzav().b();
            long abs = Math.abs(b10 - a10);
            this.f13220a.u();
            if (abs > ((Long) zzeb.f13454z.a(null)).longValue()) {
                this.f13125b.Z().f13659e.b(b10);
                c();
                d();
                if (p()) {
                    SQLiteDatabase K = K();
                    this.f13220a.u();
                    int delete = K.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f13220a.zzav().a()), String.valueOf(zzag.d())});
                    if (delete > 0) {
                        this.f13220a.zzay().q().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    protected final boolean g() {
        return false;
    }

    public final void h(String str, String str2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        c();
        d();
        try {
            K().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().d("Error deleting user property. appId", zzeo.u(str), this.f13220a.y().f(str2), e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0358, code lost:
        if (K().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035a, code lost:
        r23.f13220a.zzay().m().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzeo.u(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0373, code lost:
        r23.f13220a.zzay().m().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzeo.u(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0386, code lost:
        d();
        c();
        com.google.android.gms.common.internal.Preconditions.g(r24);
        r0 = K();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (((com.google.android.gms.internal.measurement.zzes) r11.next()).zzj() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r23.f13220a.zzay().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzeo.u(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r12 = (com.google.android.gms.internal.measurement.zzej) r11.next();
        d();
        c();
        com.google.android.gms.common.internal.Preconditions.g(r24);
        com.google.android.gms.common.internal.Preconditions.m(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
        if (r12.zzg().isEmpty() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
        r0 = r23.f13220a.zzay().r();
        r8 = com.google.android.gms.measurement.internal.zzeo.u(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r12.zzp() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
        r3 = r12.zzbv();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023d, code lost:
        if (r12.zzp() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0259, code lost:
        if (r12.zzq() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        if (K().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027b, code lost:
        r23.f13220a.zzay().m().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzeo.u(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028e, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        r23.f13220a.zzay().m().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzeo.u(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
        r21 = r4;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b8, code lost:
        if (r0.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ba, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzes) r0.next();
        d();
        c();
        com.google.android.gms.common.internal.Preconditions.g(r24);
        com.google.android.gms.common.internal.Preconditions.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d4, code lost:
        if (r3.zze().isEmpty() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d6, code lost:
        r0 = r23.f13220a.zzay().r();
        r7 = com.google.android.gms.measurement.internal.zzeo.u(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ee, code lost:
        if (r3.zzj() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fa, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0303, code lost:
        r4 = r3.zzbv();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x031a, code lost:
        if (r3.zzj() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0325, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0338, code lost:
        if (r3.zzk() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.i(java.lang.String, java.util.List):void");
    }

    public final void j() {
        d();
        K().setTransactionSuccessful();
    }

    public final void k(a1 a1Var) {
        Preconditions.m(a1Var);
        c();
        d();
        String d02 = a1Var.d0();
        Preconditions.m(d02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d02);
        contentValues.put("app_instance_id", a1Var.e0());
        contentValues.put("gmp_app_id", a1Var.i0());
        contentValues.put("resettable_device_id_hash", a1Var.a());
        contentValues.put("last_bundle_index", Long.valueOf(a1Var.Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(a1Var.Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(a1Var.X()));
        contentValues.put("app_version", a1Var.g0());
        contentValues.put("app_store", a1Var.f0());
        contentValues.put("gmp_version", Long.valueOf(a1Var.W()));
        contentValues.put("dev_cert_hash", Long.valueOf(a1Var.T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(a1Var.J()));
        contentValues.put("day", Long.valueOf(a1Var.S()));
        contentValues.put("daily_public_events_count", Long.valueOf(a1Var.Q()));
        contentValues.put("daily_events_count", Long.valueOf(a1Var.P()));
        contentValues.put("daily_conversions_count", Long.valueOf(a1Var.N()));
        contentValues.put("config_fetched_time", Long.valueOf(a1Var.M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(a1Var.V()));
        contentValues.put("app_version_int", Long.valueOf(a1Var.L()));
        contentValues.put("firebase_instance_id", a1Var.h0());
        contentValues.put("daily_error_events_count", Long.valueOf(a1Var.O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(a1Var.R()));
        contentValues.put("health_monitor_sample", a1Var.j0());
        a1Var.A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(a1Var.I()));
        contentValues.put("admob_app_id", a1Var.b0());
        contentValues.put("dynamite_version", Long.valueOf(a1Var.U()));
        contentValues.put("session_stitching_token", a1Var.b());
        List c10 = a1Var.c();
        if (c10 != null) {
            if (c10.isEmpty()) {
                this.f13220a.zzay().r().b("Safelisted events should not be an empty list. appId", d02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c10));
            }
        }
        zzns.zzc();
        if (this.f13220a.u().w(null, zzeb.f13425k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase K = K();
            if (K.update("apps", contentValues, "app_id = ?", new String[]{d02}) == 0 && K.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f13220a.zzay().m().b("Failed to insert/update app (got -1). appId", zzeo.u(d02));
            }
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().c("Error storing app. appId", zzeo.u(d02), e8);
        }
    }

    public final void l(i iVar) {
        Preconditions.m(iVar);
        c();
        d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", iVar.f12996a);
        contentValues.put("name", iVar.f12997b);
        contentValues.put("lifetime_count", Long.valueOf(iVar.f12998c));
        contentValues.put("current_bundle_count", Long.valueOf(iVar.f12999d));
        contentValues.put("last_fire_timestamp", Long.valueOf(iVar.f13001f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(iVar.f13002g));
        contentValues.put("last_bundled_day", iVar.f13003h);
        contentValues.put("last_sampled_complex_event_id", iVar.f13004i);
        contentValues.put("last_sampling_rate", iVar.f13005j);
        contentValues.put("current_session_count", Long.valueOf(iVar.f13000e));
        Boolean bool = iVar.f13006k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (K().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f13220a.zzay().m().b("Failed to insert/update event aggregates (got -1). appId", zzeo.u(iVar.f12996a));
            }
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().c("Error storing event aggregates. appId", zzeo.u(iVar.f12996a), e8);
        }
    }

    public final boolean m() {
        return D("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean n() {
        return D("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean o() {
        return D("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    protected final boolean p() {
        Context zzau = this.f13220a.zzau();
        this.f13220a.u();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean q(String str, Long l10, long j10, zzfs zzfsVar) {
        c();
        d();
        Preconditions.m(zzfsVar);
        Preconditions.g(str);
        Preconditions.m(l10);
        byte[] zzbv = zzfsVar.zzbv();
        this.f13220a.zzay().q().c("Saving complex main event, appId, data size", this.f13220a.y().d(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbv);
        try {
            if (K().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f13220a.zzay().m().b("Failed to insert complex main event (got -1). appId", zzeo.u(str));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().c("Error storing complex main event. appId", zzeo.u(str), e8);
            return false;
        }
    }

    public final boolean r(zzac zzacVar) {
        Preconditions.m(zzacVar);
        c();
        d();
        String str = zzacVar.f13273a;
        Preconditions.m(str);
        if (S(str, zzacVar.f13275c.f13708b) == null) {
            long D = D("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f13220a.u();
            if (D >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(cc.f16874p, zzacVar.f13274b);
        contentValues.put("name", zzacVar.f13275c.f13708b);
        C(contentValues, b9.h.X, Preconditions.m(zzacVar.f13275c.X()));
        contentValues.put("active", Boolean.valueOf(zzacVar.f13277e));
        contentValues.put("trigger_event_name", zzacVar.f13278f);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.f13280h));
        contentValues.put("timed_out_event", this.f13220a.I().X(zzacVar.f13279g));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.f13276d));
        contentValues.put("triggered_event", this.f13220a.I().X(zzacVar.f13281i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.f13275c.f13709c));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.f13282j));
        contentValues.put("expired_event", this.f13220a.I().X(zzacVar.f13283k));
        try {
            if (K().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f13220a.zzay().m().b("Failed to insert/update conditional user property (got -1)", zzeo.u(str));
            }
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().c("Error storing conditional user property", zzeo.u(str), e8);
        }
        return true;
    }

    public final boolean s(b4 b4Var) {
        Preconditions.m(b4Var);
        c();
        d();
        if (S(b4Var.f12884a, b4Var.f12886c) == null) {
            if (zzlh.S(b4Var.f12886c)) {
                if (D("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{b4Var.f12884a}) >= this.f13220a.u().k(b4Var.f12884a, zzeb.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(b4Var.f12886c)) {
                long D = D("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{b4Var.f12884a, b4Var.f12885b});
                this.f13220a.u();
                if (D >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b4Var.f12884a);
        contentValues.put(cc.f16874p, b4Var.f12885b);
        contentValues.put("name", b4Var.f12886c);
        contentValues.put("set_timestamp", Long.valueOf(b4Var.f12887d));
        C(contentValues, b9.h.X, b4Var.f12888e);
        try {
            if (K().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f13220a.zzay().m().b("Failed to insert/update user property (got -1). appId", zzeo.u(b4Var.f12884a));
            }
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().c("Error storing user property. appId", zzeo.u(b4Var.f12884a), e8);
        }
        return true;
    }
}
