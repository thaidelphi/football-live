package com.appnext.core.adswatched.database;

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
import t0.c;
import t0.g;
import v0.g;
import v0.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdWatchedDatabase_Impl extends AdWatchedDatabase {
    private volatile a dX;

    @Override // com.appnext.core.adswatched.database.AdWatchedDatabase
    public final a adWatchedDao() {
        a aVar;
        if (this.dX != null) {
            return this.dX;
        }
        synchronized (this) {
            if (this.dX == null) {
                this.dX = new b(this);
            }
            aVar = this.dX;
        }
        return aVar;
    }

    @Override // androidx.room.q0
    public final void clearAllTables() {
        super.assertNotMainThread();
        g q02 = super.getOpenHelper().q0();
        try {
            super.beginTransaction();
            q02.m("DELETE FROM `AdWatched`");
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
        return new v(this, new HashMap(0), new HashMap(0), "AdWatched");
    }

    @Override // androidx.room.q0
    protected final h createOpenHelper(n nVar) {
        return nVar.f4216a.a(h.b.a(nVar.f4217b).c(nVar.f4218c).b(new s0(nVar, new s0.a(1) { // from class: com.appnext.core.adswatched.database.AdWatchedDatabase_Impl.1
            {
                super(1);
            }

            @Override // androidx.room.s0.a
            public final void createAllTables(g gVar) {
                gVar.m("CREATE TABLE IF NOT EXISTS `AdWatched` (`bannerId` TEXT NOT NULL, `auid` TEXT NOT NULL, PRIMARY KEY(`bannerId`, `auid`))");
                gVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                gVar.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '78dfff40d553309e5115594472f14b49')");
            }

            @Override // androidx.room.s0.a
            public final void dropAllTables(g gVar) {
                gVar.m("DROP TABLE IF EXISTS `AdWatched`");
                if (((q0) AdWatchedDatabase_Impl.this).mCallbacks != null) {
                    int size = ((q0) AdWatchedDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q0.b) ((q0) AdWatchedDatabase_Impl.this).mCallbacks.get(i10)).b(gVar);
                    }
                }
            }

            @Override // androidx.room.s0.a
            protected final void onCreate(g gVar) {
                if (((q0) AdWatchedDatabase_Impl.this).mCallbacks != null) {
                    int size = ((q0) AdWatchedDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q0.b) ((q0) AdWatchedDatabase_Impl.this).mCallbacks.get(i10)).a(gVar);
                    }
                }
            }

            @Override // androidx.room.s0.a
            public final void onOpen(g gVar) {
                ((q0) AdWatchedDatabase_Impl.this).mDatabase = gVar;
                AdWatchedDatabase_Impl.this.internalInitInvalidationTracker(gVar);
                if (((q0) AdWatchedDatabase_Impl.this).mCallbacks != null) {
                    int size = ((q0) AdWatchedDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q0.b) ((q0) AdWatchedDatabase_Impl.this).mCallbacks.get(i10)).c(gVar);
                    }
                }
            }

            @Override // androidx.room.s0.a
            public final void onPostMigrate(g gVar) {
            }

            @Override // androidx.room.s0.a
            public final void onPreMigrate(g gVar) {
                c.a(gVar);
            }

            @Override // androidx.room.s0.a
            protected final s0.b onValidateSchema(g gVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("bannerId", new g.a("bannerId", AdPreferences.TYPE_TEXT, true, 1, null, 1));
                hashMap.put("auid", new g.a("auid", AdPreferences.TYPE_TEXT, true, 2, null, 1));
                t0.g gVar2 = new t0.g("AdWatched", hashMap, new HashSet(0), new HashSet(0));
                t0.g a10 = t0.g.a(gVar, "AdWatched");
                if (!gVar2.equals(a10)) {
                    return new s0.b(false, "AdWatched(com.appnext.core.adswatched.database.AdWatched).\n Expected:\n" + gVar2 + "\n Found:\n" + a10);
                }
                return new s0.b(true, null);
            }
        }, "78dfff40d553309e5115594472f14b49", "e2de3c54f36f9aabd3896d5f33522662")).a());
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
        hashMap.put(a.class, b.ag());
        return hashMap;
    }
}
