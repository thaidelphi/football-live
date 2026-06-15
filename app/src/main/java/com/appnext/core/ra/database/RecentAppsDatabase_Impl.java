package com.appnext.core.ra.database;

import androidx.room.n;
import androidx.room.q0;
import androidx.room.s0;
import androidx.room.v;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t0.g;
import v0.g;
import v0.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class RecentAppsDatabase_Impl extends RecentAppsDatabase {
    private volatile b eB;

    @Override // androidx.room.q0
    public final void clearAllTables() {
        super.assertNotMainThread();
        g q02 = super.getOpenHelper().q0();
        try {
            super.beginTransaction();
            q02.m("DELETE FROM `RecentApp`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            q02.r0("PRAGMA wal_checkpoint(FULL)").close();
            if (!q02.x0()) {
                q02.m("VACUUM");
            }
        }
    }

    @Override // androidx.room.q0
    protected final v createInvalidationTracker() {
        return new v(this, new HashMap(0), new HashMap(0), "RecentApp");
    }

    @Override // androidx.room.q0
    protected final h createOpenHelper(n nVar) {
        return nVar.f4216a.a(h.b.a(nVar.f4217b).c(nVar.f4218c).b(new s0(nVar, new s0.a(1) { // from class: com.appnext.core.ra.database.RecentAppsDatabase_Impl.1
            {
                super(1);
            }

            @Override // androidx.room.s0.a
            public final void createAllTables(g gVar) {
                gVar.m("CREATE TABLE IF NOT EXISTS `RecentApp` (`recentAppPackage` TEXT NOT NULL, `storeDate` TEXT NOT NULL, `sent` INTEGER NOT NULL, PRIMARY KEY(`recentAppPackage`, `storeDate`))");
                gVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                gVar.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e1eb051e9230fda8568d681a1d3cf00b')");
            }

            @Override // androidx.room.s0.a
            public final void dropAllTables(g gVar) {
                gVar.m("DROP TABLE IF EXISTS `RecentApp`");
                if (((q0) RecentAppsDatabase_Impl.this).mCallbacks != null) {
                    int size = ((q0) RecentAppsDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q0.b) ((q0) RecentAppsDatabase_Impl.this).mCallbacks.get(i10)).b(gVar);
                    }
                }
            }

            @Override // androidx.room.s0.a
            protected final void onCreate(g gVar) {
                if (((q0) RecentAppsDatabase_Impl.this).mCallbacks != null) {
                    int size = ((q0) RecentAppsDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q0.b) ((q0) RecentAppsDatabase_Impl.this).mCallbacks.get(i10)).a(gVar);
                    }
                }
            }

            @Override // androidx.room.s0.a
            public final void onOpen(g gVar) {
                ((q0) RecentAppsDatabase_Impl.this).mDatabase = gVar;
                RecentAppsDatabase_Impl.this.internalInitInvalidationTracker(gVar);
                if (((q0) RecentAppsDatabase_Impl.this).mCallbacks != null) {
                    int size = ((q0) RecentAppsDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q0.b) ((q0) RecentAppsDatabase_Impl.this).mCallbacks.get(i10)).c(gVar);
                    }
                }
            }

            @Override // androidx.room.s0.a
            public final void onPostMigrate(g gVar) {
            }

            @Override // androidx.room.s0.a
            public final void onPreMigrate(g gVar) {
                t0.c.a(gVar);
            }

            @Override // androidx.room.s0.a
            protected final s0.b onValidateSchema(g gVar) {
                HashMap hashMap = new HashMap(3);
                hashMap.put("recentAppPackage", new g.a("recentAppPackage", AdPreferences.TYPE_TEXT, true, 1, null, 1));
                hashMap.put("storeDate", new g.a("storeDate", AdPreferences.TYPE_TEXT, true, 2, null, 1));
                hashMap.put("sent", new g.a("sent", "INTEGER", true, 0, null, 1));
                t0.g gVar2 = new t0.g("RecentApp", hashMap, new HashSet(0), new HashSet(0));
                t0.g a10 = t0.g.a(gVar, "RecentApp");
                if (!gVar2.equals(a10)) {
                    return new s0.b(false, "RecentApp(com.appnext.core.ra.database.RecentApp).\n Expected:\n" + gVar2 + "\n Found:\n" + a10);
                }
                return new s0.b(true, null);
            }
        }, "e1eb051e9230fda8568d681a1d3cf00b", "52c6c70fcfd3ff556a2b04d53ac85ff8")).a());
    }

    @Override // androidx.room.q0
    public final List<s0.b> getAutoMigrations(Map<Class<? extends s0.a>, s0.a> map) {
        return Arrays.asList(new s0.b[0]);
    }

    @Override // androidx.room.q0
    public final Set<Class<? extends s0.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.q0
    protected final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.class, c.ag());
        return hashMap;
    }

    @Override // com.appnext.core.ra.database.RecentAppsDatabase
    public final b recentAppDao() {
        b bVar;
        if (this.eB != null) {
            return this.eB;
        }
        synchronized (this) {
            if (this.eB == null) {
                this.eB = new c(this);
            }
            bVar = this.eB;
        }
        return bVar;
    }
}
