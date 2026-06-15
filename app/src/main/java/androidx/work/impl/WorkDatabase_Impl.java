package androidx.work.impl;

import android.os.Build;
import androidx.room.q0;
import androidx.room.s0;
import androidx.room.v;
import com.ironsource.b9;
import com.ironsource.ug;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import l1.b;
import l1.e;
import l1.f;
import l1.h;
import l1.i;
import l1.k;
import l1.l;
import l1.n;
import l1.o;
import l1.q;
import l1.r;
import l1.t;
import l1.u;
import t0.c;
import t0.g;
import v0.g;
import v0.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile q f4663b;

    /* renamed from: c  reason: collision with root package name */
    private volatile b f4664c;

    /* renamed from: d  reason: collision with root package name */
    private volatile t f4665d;

    /* renamed from: e  reason: collision with root package name */
    private volatile h f4666e;

    /* renamed from: f  reason: collision with root package name */
    private volatile k f4667f;

    /* renamed from: g  reason: collision with root package name */
    private volatile n f4668g;

    /* renamed from: h  reason: collision with root package name */
    private volatile e f4669h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends s0.a {
        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.s0.a
        public void createAllTables(g gVar) {
            gVar.m("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.m("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.m("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            gVar.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            gVar.m("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.m("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.s0.a
        public void dropAllTables(g gVar) {
            gVar.m("DROP TABLE IF EXISTS `Dependency`");
            gVar.m("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.m("DROP TABLE IF EXISTS `WorkTag`");
            gVar.m("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.m("DROP TABLE IF EXISTS `WorkName`");
            gVar.m("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.m("DROP TABLE IF EXISTS `Preference`");
            if (((q0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((q0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q0.b) ((q0) WorkDatabase_Impl.this).mCallbacks.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.s0.a
        protected void onCreate(g gVar) {
            if (((q0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((q0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q0.b) ((q0) WorkDatabase_Impl.this).mCallbacks.get(i10)).a(gVar);
                }
            }
        }

        @Override // androidx.room.s0.a
        public void onOpen(g gVar) {
            ((q0) WorkDatabase_Impl.this).mDatabase = gVar;
            gVar.m("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            if (((q0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((q0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q0.b) ((q0) WorkDatabase_Impl.this).mCallbacks.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.s0.a
        public void onPostMigrate(g gVar) {
        }

        @Override // androidx.room.s0.a
        public void onPreMigrate(g gVar) {
            c.a(gVar);
        }

        @Override // androidx.room.s0.a
        protected s0.b onValidateSchema(g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new g.a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, null, 1));
            hashMap.put("prerequisite_id", new g.a("prerequisite_id", AdPreferences.TYPE_TEXT, true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ug.f21009x)));
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(ug.f21009x)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            t0.g gVar2 = new t0.g("Dependency", hashMap, hashSet, hashSet2);
            t0.g a10 = t0.g.a(gVar, "Dependency");
            if (!gVar2.equals(a10)) {
                return new s0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar2 + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(ug.f21009x, new g.a(ug.f21009x, AdPreferences.TYPE_TEXT, true, 1, null, 1));
            hashMap2.put("state", new g.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new g.a("worker_class_name", AdPreferences.TYPE_TEXT, true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new g.a("input_merger_class_name", AdPreferences.TYPE_TEXT, false, 0, null, 1));
            hashMap2.put("input", new g.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new g.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new g.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new g.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            t0.g gVar3 = new t0.g("WorkSpec", hashMap2, hashSet3, hashSet4);
            t0.g a11 = t0.g.a(gVar, "WorkSpec");
            if (!gVar3.equals(a11)) {
                return new s0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar3 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new g.a("tag", AdPreferences.TYPE_TEXT, true, 1, null, 1));
            hashMap3.put("work_spec_id", new g.a("work_spec_id", AdPreferences.TYPE_TEXT, true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ug.f21009x)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            t0.g gVar4 = new t0.g("WorkTag", hashMap3, hashSet5, hashSet6);
            t0.g a12 = t0.g.a(gVar, "WorkTag");
            if (!gVar4.equals(a12)) {
                return new s0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar4 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new g.a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, null, 1));
            hashMap4.put("system_id", new g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ug.f21009x)));
            t0.g gVar5 = new t0.g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            t0.g a13 = t0.g.a(gVar, "SystemIdInfo");
            if (!gVar5.equals(a13)) {
                return new s0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar5 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new g.a("name", AdPreferences.TYPE_TEXT, true, 1, null, 1));
            hashMap5.put("work_spec_id", new g.a("work_spec_id", AdPreferences.TYPE_TEXT, true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ug.f21009x)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            t0.g gVar6 = new t0.g("WorkName", hashMap5, hashSet8, hashSet9);
            t0.g a14 = t0.g.a(gVar, "WorkName");
            if (!gVar6.equals(a14)) {
                return new s0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar6 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new g.a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, null, 1));
            hashMap6.put("progress", new g.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ug.f21009x)));
            t0.g gVar7 = new t0.g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            t0.g a15 = t0.g.a(gVar, "WorkProgress");
            if (!gVar7.equals(a15)) {
                return new s0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar7 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(b9.h.W, new g.a(b9.h.W, AdPreferences.TYPE_TEXT, true, 1, null, 1));
            hashMap7.put("long_value", new g.a("long_value", "INTEGER", false, 0, null, 1));
            t0.g gVar8 = new t0.g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            t0.g a16 = t0.g.a(gVar, "Preference");
            if (!gVar8.equals(a16)) {
                return new s0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar8 + "\n Found:\n" + a16);
            }
            return new s0.b(true, null);
        }
    }

    @Override // androidx.room.q0
    public void clearAllTables() {
        super.assertNotMainThread();
        v0.g q02 = super.getOpenHelper().q0();
        boolean z10 = Build.VERSION.SDK_INT >= 21;
        if (!z10) {
            try {
                q02.m("PRAGMA foreign_keys = FALSE");
            } finally {
                super.endTransaction();
                if (!z10) {
                    q02.m("PRAGMA foreign_keys = TRUE");
                }
                q02.r0("PRAGMA wal_checkpoint(FULL)").close();
                if (!q02.x0()) {
                    q02.m("VACUUM");
                }
            }
        }
        super.beginTransaction();
        if (z10) {
            q02.m("PRAGMA defer_foreign_keys = TRUE");
        }
        q02.m("DELETE FROM `Dependency`");
        q02.m("DELETE FROM `WorkSpec`");
        q02.m("DELETE FROM `WorkTag`");
        q02.m("DELETE FROM `SystemIdInfo`");
        q02.m("DELETE FROM `WorkName`");
        q02.m("DELETE FROM `WorkProgress`");
        q02.m("DELETE FROM `Preference`");
        super.setTransactionSuccessful();
    }

    @Override // androidx.room.q0
    protected v createInvalidationTracker() {
        return new v(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.q0
    protected v0.h createOpenHelper(androidx.room.n nVar) {
        return nVar.f4216a.a(h.b.a(nVar.f4217b).c(nVar.f4218c).b(new s0(nVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b d() {
        b bVar;
        if (this.f4664c != null) {
            return this.f4664c;
        }
        synchronized (this) {
            if (this.f4664c == null) {
                this.f4664c = new l1.c(this);
            }
            bVar = this.f4664c;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e h() {
        e eVar;
        if (this.f4669h != null) {
            return this.f4669h;
        }
        synchronized (this) {
            if (this.f4669h == null) {
                this.f4669h = new f(this);
            }
            eVar = this.f4669h;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public l1.h i() {
        l1.h hVar;
        if (this.f4666e != null) {
            return this.f4666e;
        }
        synchronized (this) {
            if (this.f4666e == null) {
                this.f4666e = new i(this);
            }
            hVar = this.f4666e;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k j() {
        k kVar;
        if (this.f4667f != null) {
            return this.f4667f;
        }
        synchronized (this) {
            if (this.f4667f == null) {
                this.f4667f = new l(this);
            }
            kVar = this.f4667f;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n k() {
        n nVar;
        if (this.f4668g != null) {
            return this.f4668g;
        }
        synchronized (this) {
            if (this.f4668g == null) {
                this.f4668g = new o(this);
            }
            nVar = this.f4668g;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q l() {
        q qVar;
        if (this.f4663b != null) {
            return this.f4663b;
        }
        synchronized (this) {
            if (this.f4663b == null) {
                this.f4663b = new r(this);
            }
            qVar = this.f4663b;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t m() {
        t tVar;
        if (this.f4665d != null) {
            return this.f4665d;
        }
        synchronized (this) {
            if (this.f4665d == null) {
                this.f4665d = new u(this);
            }
            tVar = this.f4665d;
        }
        return tVar;
    }
}
