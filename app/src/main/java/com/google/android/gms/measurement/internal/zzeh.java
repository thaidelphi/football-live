package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeh extends x {

    /* renamed from: c  reason: collision with root package name */
    private final p f13471c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13472d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeh(zzfy zzfyVar) {
        super(zzfyVar);
        Context zzau = this.f13220a.zzau();
        this.f13220a.u();
        this.f13471c = new p(this, zzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean s(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.s(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.x
    protected final boolean i() {
        return false;
    }

    @VisibleForTesting
    final SQLiteDatabase j() throws SQLiteException {
        if (this.f13472d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f13471c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f13472d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0248 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(int r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.k(int):java.util.List");
    }

    public final void l() {
        int delete;
        c();
        try {
            SQLiteDatabase j10 = j();
            if (j10 == null || (delete = j10.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f13220a.zzay().q().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e8) {
            this.f13220a.zzay().m().b("Error resetting local analytics data. error", e8);
        }
    }

    public final boolean m() {
        return s(3, new byte[0]);
    }

    @VisibleForTesting
    final boolean n() {
        Context zzau = this.f13220a.zzau();
        this.f13220a.u();
        return zzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean o() {
        int i10;
        c();
        if (!this.f13472d && n()) {
            int i11 = 5;
            for (i10 = 0; i10 < 5; i10 = i10 + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase j10 = j();
                    if (j10 == null) {
                        this.f13472d = true;
                        return false;
                    }
                    j10.beginTransaction();
                    j10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    j10.setTransactionSuccessful();
                    j10.endTransaction();
                    j10.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i11);
                    i11 += 20;
                    i10 = 0 == 0 ? i10 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e8) {
                    this.f13220a.zzay().m().b("Error deleting app launch break from local database", e8);
                    this.f13472d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e10) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.f13220a.zzay().m().b("Error deleting app launch break from local database", e10);
                    this.f13472d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f13220a.zzay().r().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean p(zzac zzacVar) {
        byte[] X = this.f13220a.I().X(zzacVar);
        if (X.length > 131072) {
            this.f13220a.zzay().o().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return s(2, X);
    }

    public final boolean q(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        zzax.a(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f13220a.zzay().o().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return s(0, marshall);
    }

    public final boolean r(zzlc zzlcVar) {
        Parcel obtain = Parcel.obtain();
        zzld.a(zzlcVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f13220a.zzay().o().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return s(1, marshall);
    }
}
