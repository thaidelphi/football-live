package androidx.work.impl;

import android.content.Context;
import android.os.Build;
/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static s0.b f4671a = new C0084a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static s0.b f4672b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static s0.b f4673c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static s0.b f4674d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static s0.b f4675e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static s0.b f4676f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static s0.b f4677g = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class C0084a extends s0.b {
        C0084a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            gVar.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.m("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            gVar.m("DROP TABLE IF EXISTS alarmInfo");
            gVar.m("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends s0.b {
        b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                gVar.m("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends s0.b {
        c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            gVar.m("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            gVar.m("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d extends s0.b {
        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            gVar.m("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e extends s0.b {
        e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            gVar.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f extends s0.b {
        f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            gVar.m("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g extends s0.b {
        g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            gVar.m("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h extends s0.b {

        /* renamed from: c  reason: collision with root package name */
        final Context f4678c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f4678c = context;
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            if (this.f30595b >= 10) {
                gVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f4678c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class i extends s0.b {

        /* renamed from: c  reason: collision with root package name */
        final Context f4679c;

        public i(Context context) {
            super(9, 10);
            this.f4679c = context;
        }

        @Override // s0.b
        public void a(v0.g gVar) {
            gVar.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            m1.e.b(this.f4679c, gVar);
            m1.c.a(this.f4679c, gVar);
        }
    }
}
