package com.appnext.core.ra.database;

import android.database.Cursor;
import androidx.room.p;
import androidx.room.q0;
import androidx.room.t0;
import androidx.room.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v0.k;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements b {
    private final q0 dT;
    private final p<a> ex;
    private final p<a> ey;
    private final w0 ez;

    public c(q0 q0Var) {
        this.dT = q0Var;
        this.ex = new p<a>(q0Var) { // from class: com.appnext.core.ra.database.c.1
            @Override // androidx.room.p
            public final /* synthetic */ void bind(k kVar, a aVar) {
                a aVar2 = aVar;
                String str = aVar2.eu;
                if (str == null) {
                    kVar.v0(1);
                } else {
                    kVar.d0(1, str);
                }
                String str2 = aVar2.ev;
                if (str2 == null) {
                    kVar.v0(2);
                } else {
                    kVar.d0(2, str2);
                }
                kVar.m0(3, aVar2.ew ? 1L : 0L);
            }

            @Override // androidx.room.w0
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `RecentApp` (`recentAppPackage`,`storeDate`,`sent`) VALUES (?,?,?)";
            }
        };
        this.ey = new p<a>(q0Var) { // from class: com.appnext.core.ra.database.c.2
            @Override // androidx.room.p
            public final /* synthetic */ void bind(k kVar, a aVar) {
                a aVar2 = aVar;
                String str = aVar2.eu;
                if (str == null) {
                    kVar.v0(1);
                } else {
                    kVar.d0(1, str);
                }
                String str2 = aVar2.ev;
                if (str2 == null) {
                    kVar.v0(2);
                } else {
                    kVar.d0(2, str2);
                }
                kVar.m0(3, aVar2.ew ? 1L : 0L);
            }

            @Override // androidx.room.w0
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `RecentApp` (`recentAppPackage`,`storeDate`,`sent`) VALUES (?,?,?)";
            }
        };
        this.ez = new w0(q0Var) { // from class: com.appnext.core.ra.database.c.3
            @Override // androidx.room.w0
            public final String createQuery() {
                return "DELETE FROM recentapp WHERE storeDate NOT LIKE ?";
            }
        };
    }

    public static List<Class<?>> ag() {
        return Collections.emptyList();
    }

    @Override // com.appnext.core.ra.database.b
    public final long[] a(List<a> list) {
        this.dT.assertNotSuspendingTransaction();
        this.dT.beginTransaction();
        try {
            long[] insertAndReturnIdsArray = this.ex.insertAndReturnIdsArray(list);
            this.dT.setTransactionSuccessful();
            return insertAndReturnIdsArray;
        } finally {
            this.dT.endTransaction();
        }
    }

    @Override // com.appnext.core.ra.database.b
    public final List<a> aw() {
        t0 f10 = t0.f("SELECT * FROM recentapp", 0);
        this.dT.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.dT, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "recentAppPackage");
            int e10 = t0.b.e(b10, "storeDate");
            int e11 = t0.b.e(b10, "sent");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                a aVar = new a();
                if (b10.isNull(e8)) {
                    aVar.eu = null;
                } else {
                    aVar.eu = b10.getString(e8);
                }
                if (b10.isNull(e10)) {
                    aVar.ev = null;
                } else {
                    aVar.ev = b10.getString(e10);
                }
                aVar.ew = b10.getInt(e11) != 0;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // com.appnext.core.ra.database.b
    public final List<a> ax() {
        t0 f10 = t0.f("SELECT * FROM recentapp WHERE sent = 0", 0);
        this.dT.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.dT, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "recentAppPackage");
            int e10 = t0.b.e(b10, "storeDate");
            int e11 = t0.b.e(b10, "sent");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                a aVar = new a();
                if (b10.isNull(e8)) {
                    aVar.eu = null;
                } else {
                    aVar.eu = b10.getString(e8);
                }
                if (b10.isNull(e10)) {
                    aVar.ev = null;
                } else {
                    aVar.ev = b10.getString(e10);
                }
                aVar.ew = b10.getInt(e11) != 0;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // com.appnext.core.ra.database.b
    public final void b(List<a> list) {
        this.dT.assertNotSuspendingTransaction();
        this.dT.beginTransaction();
        try {
            this.ey.insert(list);
            this.dT.setTransactionSuccessful();
        } finally {
            this.dT.endTransaction();
        }
    }

    @Override // com.appnext.core.ra.database.b
    public final int z(String str) {
        this.dT.assertNotSuspendingTransaction();
        k acquire = this.ez.acquire();
        if (str == null) {
            acquire.v0(1);
        } else {
            acquire.d0(1, str);
        }
        this.dT.beginTransaction();
        try {
            int n10 = acquire.n();
            this.dT.setTransactionSuccessful();
            return n10;
        } finally {
            this.dT.endTransaction();
            this.ez.release(acquire);
        }
    }
}
