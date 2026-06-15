package l1;

import android.database.Cursor;
import androidx.room.q0;
import androidx.room.t0;
import androidx.room.w0;
import androidx.work.z;
import com.ironsource.ug;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l1.p;
/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f27458a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.p<p> f27459b;

    /* renamed from: c  reason: collision with root package name */
    private final w0 f27460c;

    /* renamed from: d  reason: collision with root package name */
    private final w0 f27461d;

    /* renamed from: e  reason: collision with root package name */
    private final w0 f27462e;

    /* renamed from: f  reason: collision with root package name */
    private final w0 f27463f;

    /* renamed from: g  reason: collision with root package name */
    private final w0 f27464g;

    /* renamed from: h  reason: collision with root package name */
    private final w0 f27465h;

    /* renamed from: i  reason: collision with root package name */
    private final w0 f27466i;

    /* renamed from: j  reason: collision with root package name */
    private final w0 f27467j;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends androidx.room.p<p> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.p
        /* renamed from: a */
        public void bind(v0.k kVar, p pVar) {
            String str = pVar.f27432a;
            if (str == null) {
                kVar.v0(1);
            } else {
                kVar.d0(1, str);
            }
            kVar.m0(2, v.j(pVar.f27433b));
            String str2 = pVar.f27434c;
            if (str2 == null) {
                kVar.v0(3);
            } else {
                kVar.d0(3, str2);
            }
            String str3 = pVar.f27435d;
            if (str3 == null) {
                kVar.v0(4);
            } else {
                kVar.d0(4, str3);
            }
            byte[] l10 = androidx.work.e.l(pVar.f27436e);
            if (l10 == null) {
                kVar.v0(5);
            } else {
                kVar.p0(5, l10);
            }
            byte[] l11 = androidx.work.e.l(pVar.f27437f);
            if (l11 == null) {
                kVar.v0(6);
            } else {
                kVar.p0(6, l11);
            }
            kVar.m0(7, pVar.f27438g);
            kVar.m0(8, pVar.f27439h);
            kVar.m0(9, pVar.f27440i);
            kVar.m0(10, pVar.f27442k);
            kVar.m0(11, v.a(pVar.f27443l));
            kVar.m0(12, pVar.f27444m);
            kVar.m0(13, pVar.f27445n);
            kVar.m0(14, pVar.f27446o);
            kVar.m0(15, pVar.f27447p);
            kVar.m0(16, pVar.f27448q ? 1L : 0L);
            kVar.m0(17, v.i(pVar.f27449r));
            androidx.work.c cVar = pVar.f27441j;
            if (cVar != null) {
                kVar.m0(18, v.h(cVar.b()));
                kVar.m0(19, cVar.g() ? 1L : 0L);
                kVar.m0(20, cVar.h() ? 1L : 0L);
                kVar.m0(21, cVar.f() ? 1L : 0L);
                kVar.m0(22, cVar.i() ? 1L : 0L);
                kVar.m0(23, cVar.c());
                kVar.m0(24, cVar.d());
                byte[] c10 = v.c(cVar.a());
                if (c10 == null) {
                    kVar.v0(25);
                    return;
                } else {
                    kVar.p0(25, c10);
                    return;
                }
            }
            kVar.v0(18);
            kVar.v0(19);
            kVar.v0(20);
            kVar.v0(21);
            kVar.v0(22);
            kVar.v0(23);
            kVar.v0(24);
            kVar.v0(25);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends w0 {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends w0 {
        c(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d extends w0 {
        d(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e extends w0 {
        e(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f extends w0 {
        f(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g extends w0 {
        g(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class h extends w0 {
        h(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class i extends w0 {
        i(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(q0 q0Var) {
        this.f27458a = q0Var;
        this.f27459b = new a(q0Var);
        this.f27460c = new b(q0Var);
        this.f27461d = new c(q0Var);
        this.f27462e = new d(q0Var);
        this.f27463f = new e(q0Var);
        this.f27464g = new f(q0Var);
        this.f27465h = new g(q0Var);
        this.f27466i = new h(q0Var);
        this.f27467j = new i(q0Var);
    }

    private void w(androidx.collection.a<String, ArrayList<androidx.work.e>> aVar) {
        ArrayList<androidx.work.e> arrayList;
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>((int) q0.MAX_BIND_PARAMETER_CNT);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.i(i10), aVar.m(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    w(aVar2);
                    aVar2 = new androidx.collection.a<>((int) q0.MAX_BIND_PARAMETER_CNT);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                w(aVar2);
                return;
            }
            return;
        }
        StringBuilder b10 = t0.f.b();
        b10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        t0.f.a(b10, size2);
        b10.append(")");
        t0 f10 = t0.f(b10.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                f10.v0(i12);
            } else {
                f10.d0(i12, str);
            }
            i12++;
        }
        Cursor b11 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int d10 = t0.b.d(b11, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                if (!b11.isNull(d10) && (arrayList = aVar.get(b11.getString(d10))) != null) {
                    arrayList.add(androidx.work.e.g(b11.getBlob(0)));
                }
            }
        } finally {
            b11.close();
        }
    }

    private void x(androidx.collection.a<String, ArrayList<String>> aVar) {
        ArrayList<String> arrayList;
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar2 = new androidx.collection.a<>((int) q0.MAX_BIND_PARAMETER_CNT);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.i(i10), aVar.m(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    x(aVar2);
                    aVar2 = new androidx.collection.a<>((int) q0.MAX_BIND_PARAMETER_CNT);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                x(aVar2);
                return;
            }
            return;
        }
        StringBuilder b10 = t0.f.b();
        b10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        t0.f.a(b10, size2);
        b10.append(")");
        t0 f10 = t0.f(b10.toString(), size2 + 0);
        int i12 = 1;
        for (String str : keySet) {
            if (str == null) {
                f10.v0(i12);
            } else {
                f10.d0(i12, str);
            }
            i12++;
        }
        Cursor b11 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int d10 = t0.b.d(b11, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                if (!b11.isNull(d10) && (arrayList = aVar.get(b11.getString(d10))) != null) {
                    arrayList.add(b11.getString(0));
                }
            }
        } finally {
            b11.close();
        }
    }

    @Override // l1.q
    public void a(String str) {
        this.f27458a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27460c.acquire();
        if (str == null) {
            acquire.v0(1);
        } else {
            acquire.d0(1, str);
        }
        this.f27458a.beginTransaction();
        try {
            acquire.n();
            this.f27458a.setTransactionSuccessful();
        } finally {
            this.f27458a.endTransaction();
            this.f27460c.release(acquire);
        }
    }

    @Override // l1.q
    public int b(z.a aVar, String... strArr) {
        this.f27458a.assertNotSuspendingTransaction();
        StringBuilder b10 = t0.f.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        t0.f.a(b10, strArr.length);
        b10.append(")");
        v0.k compileStatement = this.f27458a.compileStatement(b10.toString());
        compileStatement.m0(1, v.j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.v0(i10);
            } else {
                compileStatement.d0(i10, str);
            }
            i10++;
        }
        this.f27458a.beginTransaction();
        try {
            int n10 = compileStatement.n();
            this.f27458a.setTransactionSuccessful();
            return n10;
        } finally {
            this.f27458a.endTransaction();
        }
    }

    @Override // l1.q
    public List<p> c(long j10) {
        t0 t0Var;
        t0 f10 = t0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        f10.m0(1, j10);
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "required_network_type");
            int e10 = t0.b.e(b10, "requires_charging");
            int e11 = t0.b.e(b10, "requires_device_idle");
            int e12 = t0.b.e(b10, "requires_battery_not_low");
            int e13 = t0.b.e(b10, "requires_storage_not_low");
            int e14 = t0.b.e(b10, "trigger_content_update_delay");
            int e15 = t0.b.e(b10, "trigger_max_content_delay");
            int e16 = t0.b.e(b10, "content_uri_triggers");
            int e17 = t0.b.e(b10, ug.f21009x);
            int e18 = t0.b.e(b10, "state");
            int e19 = t0.b.e(b10, "worker_class_name");
            int e20 = t0.b.e(b10, "input_merger_class_name");
            int e21 = t0.b.e(b10, "input");
            int e22 = t0.b.e(b10, "output");
            t0Var = f10;
            try {
                int e23 = t0.b.e(b10, "initial_delay");
                int e24 = t0.b.e(b10, "interval_duration");
                int e25 = t0.b.e(b10, "flex_duration");
                int e26 = t0.b.e(b10, "run_attempt_count");
                int e27 = t0.b.e(b10, "backoff_policy");
                int e28 = t0.b.e(b10, "backoff_delay_duration");
                int e29 = t0.b.e(b10, "period_start_time");
                int e30 = t0.b.e(b10, "minimum_retention_duration");
                int e31 = t0.b.e(b10, "schedule_requested_at");
                int e32 = t0.b.e(b10, "run_in_foreground");
                int e33 = t0.b.e(b10, "out_of_quota_policy");
                int i10 = e22;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(e17);
                    int i11 = e17;
                    String string2 = b10.getString(e19);
                    int i12 = e19;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = e8;
                    cVar.k(v.e(b10.getInt(e8)));
                    cVar.m(b10.getInt(e10) != 0);
                    cVar.n(b10.getInt(e11) != 0);
                    cVar.l(b10.getInt(e12) != 0);
                    cVar.o(b10.getInt(e13) != 0);
                    int i14 = e10;
                    int i15 = e11;
                    cVar.p(b10.getLong(e14));
                    cVar.q(b10.getLong(e15));
                    cVar.j(v.b(b10.getBlob(e16)));
                    p pVar = new p(string, string2);
                    pVar.f27433b = v.g(b10.getInt(e18));
                    pVar.f27435d = b10.getString(e20);
                    pVar.f27436e = androidx.work.e.g(b10.getBlob(e21));
                    int i16 = i10;
                    pVar.f27437f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = e23;
                    i10 = i16;
                    pVar.f27438g = b10.getLong(i17);
                    int i18 = e20;
                    int i19 = e24;
                    pVar.f27439h = b10.getLong(i19);
                    int i20 = e12;
                    int i21 = e25;
                    pVar.f27440i = b10.getLong(i21);
                    int i22 = e26;
                    pVar.f27442k = b10.getInt(i22);
                    int i23 = e27;
                    pVar.f27443l = v.d(b10.getInt(i23));
                    e25 = i21;
                    int i24 = e28;
                    pVar.f27444m = b10.getLong(i24);
                    int i25 = e29;
                    pVar.f27445n = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    pVar.f27446o = b10.getLong(i26);
                    int i27 = e31;
                    pVar.f27447p = b10.getLong(i27);
                    int i28 = e32;
                    pVar.f27448q = b10.getInt(i28) != 0;
                    int i29 = e33;
                    pVar.f27449r = v.f(b10.getInt(i29));
                    pVar.f27441j = cVar;
                    arrayList.add(pVar);
                    e10 = i14;
                    e33 = i29;
                    e20 = i18;
                    e23 = i17;
                    e24 = i19;
                    e26 = i22;
                    e31 = i27;
                    e17 = i11;
                    e19 = i12;
                    e8 = i13;
                    e32 = i28;
                    e30 = i26;
                    e11 = i15;
                    e28 = i24;
                    e12 = i20;
                    e27 = i23;
                }
                b10.close();
                t0Var.t();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                t0Var.t();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            t0Var = f10;
        }
    }

    @Override // l1.q
    public List<p> d() {
        t0 t0Var;
        t0 f10 = t0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "required_network_type");
            int e10 = t0.b.e(b10, "requires_charging");
            int e11 = t0.b.e(b10, "requires_device_idle");
            int e12 = t0.b.e(b10, "requires_battery_not_low");
            int e13 = t0.b.e(b10, "requires_storage_not_low");
            int e14 = t0.b.e(b10, "trigger_content_update_delay");
            int e15 = t0.b.e(b10, "trigger_max_content_delay");
            int e16 = t0.b.e(b10, "content_uri_triggers");
            int e17 = t0.b.e(b10, ug.f21009x);
            int e18 = t0.b.e(b10, "state");
            int e19 = t0.b.e(b10, "worker_class_name");
            int e20 = t0.b.e(b10, "input_merger_class_name");
            int e21 = t0.b.e(b10, "input");
            int e22 = t0.b.e(b10, "output");
            t0Var = f10;
            try {
                int e23 = t0.b.e(b10, "initial_delay");
                int e24 = t0.b.e(b10, "interval_duration");
                int e25 = t0.b.e(b10, "flex_duration");
                int e26 = t0.b.e(b10, "run_attempt_count");
                int e27 = t0.b.e(b10, "backoff_policy");
                int e28 = t0.b.e(b10, "backoff_delay_duration");
                int e29 = t0.b.e(b10, "period_start_time");
                int e30 = t0.b.e(b10, "minimum_retention_duration");
                int e31 = t0.b.e(b10, "schedule_requested_at");
                int e32 = t0.b.e(b10, "run_in_foreground");
                int e33 = t0.b.e(b10, "out_of_quota_policy");
                int i10 = e22;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(e17);
                    int i11 = e17;
                    String string2 = b10.getString(e19);
                    int i12 = e19;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = e8;
                    cVar.k(v.e(b10.getInt(e8)));
                    cVar.m(b10.getInt(e10) != 0);
                    cVar.n(b10.getInt(e11) != 0);
                    cVar.l(b10.getInt(e12) != 0);
                    cVar.o(b10.getInt(e13) != 0);
                    int i14 = e10;
                    int i15 = e11;
                    cVar.p(b10.getLong(e14));
                    cVar.q(b10.getLong(e15));
                    cVar.j(v.b(b10.getBlob(e16)));
                    p pVar = new p(string, string2);
                    pVar.f27433b = v.g(b10.getInt(e18));
                    pVar.f27435d = b10.getString(e20);
                    pVar.f27436e = androidx.work.e.g(b10.getBlob(e21));
                    int i16 = i10;
                    pVar.f27437f = androidx.work.e.g(b10.getBlob(i16));
                    i10 = i16;
                    int i17 = e23;
                    pVar.f27438g = b10.getLong(i17);
                    int i18 = e21;
                    int i19 = e24;
                    pVar.f27439h = b10.getLong(i19);
                    int i20 = e12;
                    int i21 = e25;
                    pVar.f27440i = b10.getLong(i21);
                    int i22 = e26;
                    pVar.f27442k = b10.getInt(i22);
                    int i23 = e27;
                    pVar.f27443l = v.d(b10.getInt(i23));
                    e25 = i21;
                    int i24 = e28;
                    pVar.f27444m = b10.getLong(i24);
                    int i25 = e29;
                    pVar.f27445n = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    pVar.f27446o = b10.getLong(i26);
                    int i27 = e31;
                    pVar.f27447p = b10.getLong(i27);
                    int i28 = e32;
                    pVar.f27448q = b10.getInt(i28) != 0;
                    int i29 = e33;
                    pVar.f27449r = v.f(b10.getInt(i29));
                    pVar.f27441j = cVar;
                    arrayList.add(pVar);
                    e33 = i29;
                    e10 = i14;
                    e21 = i18;
                    e23 = i17;
                    e24 = i19;
                    e26 = i22;
                    e31 = i27;
                    e17 = i11;
                    e19 = i12;
                    e8 = i13;
                    e32 = i28;
                    e30 = i26;
                    e11 = i15;
                    e28 = i24;
                    e12 = i20;
                    e27 = i23;
                }
                b10.close();
                t0Var.t();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                t0Var.t();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            t0Var = f10;
        }
    }

    @Override // l1.q
    public List<String> e(String str) {
        t0 f10 = t0.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.q
    public z.a f(String str) {
        t0 f10 = t0.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            return b10.moveToFirst() ? v.g(b10.getInt(0)) : null;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.q
    public p g(String str) {
        t0 t0Var;
        p pVar;
        t0 f10 = t0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "required_network_type");
            int e10 = t0.b.e(b10, "requires_charging");
            int e11 = t0.b.e(b10, "requires_device_idle");
            int e12 = t0.b.e(b10, "requires_battery_not_low");
            int e13 = t0.b.e(b10, "requires_storage_not_low");
            int e14 = t0.b.e(b10, "trigger_content_update_delay");
            int e15 = t0.b.e(b10, "trigger_max_content_delay");
            int e16 = t0.b.e(b10, "content_uri_triggers");
            int e17 = t0.b.e(b10, ug.f21009x);
            int e18 = t0.b.e(b10, "state");
            int e19 = t0.b.e(b10, "worker_class_name");
            int e20 = t0.b.e(b10, "input_merger_class_name");
            int e21 = t0.b.e(b10, "input");
            int e22 = t0.b.e(b10, "output");
            t0Var = f10;
            try {
                int e23 = t0.b.e(b10, "initial_delay");
                int e24 = t0.b.e(b10, "interval_duration");
                int e25 = t0.b.e(b10, "flex_duration");
                int e26 = t0.b.e(b10, "run_attempt_count");
                int e27 = t0.b.e(b10, "backoff_policy");
                int e28 = t0.b.e(b10, "backoff_delay_duration");
                int e29 = t0.b.e(b10, "period_start_time");
                int e30 = t0.b.e(b10, "minimum_retention_duration");
                int e31 = t0.b.e(b10, "schedule_requested_at");
                int e32 = t0.b.e(b10, "run_in_foreground");
                int e33 = t0.b.e(b10, "out_of_quota_policy");
                if (b10.moveToFirst()) {
                    String string = b10.getString(e17);
                    String string2 = b10.getString(e19);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.k(v.e(b10.getInt(e8)));
                    cVar.m(b10.getInt(e10) != 0);
                    cVar.n(b10.getInt(e11) != 0);
                    cVar.l(b10.getInt(e12) != 0);
                    cVar.o(b10.getInt(e13) != 0);
                    cVar.p(b10.getLong(e14));
                    cVar.q(b10.getLong(e15));
                    cVar.j(v.b(b10.getBlob(e16)));
                    p pVar2 = new p(string, string2);
                    pVar2.f27433b = v.g(b10.getInt(e18));
                    pVar2.f27435d = b10.getString(e20);
                    pVar2.f27436e = androidx.work.e.g(b10.getBlob(e21));
                    pVar2.f27437f = androidx.work.e.g(b10.getBlob(e22));
                    pVar2.f27438g = b10.getLong(e23);
                    pVar2.f27439h = b10.getLong(e24);
                    pVar2.f27440i = b10.getLong(e25);
                    pVar2.f27442k = b10.getInt(e26);
                    pVar2.f27443l = v.d(b10.getInt(e27));
                    pVar2.f27444m = b10.getLong(e28);
                    pVar2.f27445n = b10.getLong(e29);
                    pVar2.f27446o = b10.getLong(e30);
                    pVar2.f27447p = b10.getLong(e31);
                    pVar2.f27448q = b10.getInt(e32) != 0;
                    pVar2.f27449r = v.f(b10.getInt(e33));
                    pVar2.f27441j = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b10.close();
                t0Var.t();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b10.close();
                t0Var.t();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            t0Var = f10;
        }
    }

    @Override // l1.q
    public List<String> h(String str) {
        t0 f10 = t0.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.q
    public List<androidx.work.e> i(String str) {
        t0 f10 = t0.f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.e.g(b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.q
    public List<p> j(int i10) {
        t0 t0Var;
        t0 f10 = t0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        f10.m0(1, i10);
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "required_network_type");
            int e10 = t0.b.e(b10, "requires_charging");
            int e11 = t0.b.e(b10, "requires_device_idle");
            int e12 = t0.b.e(b10, "requires_battery_not_low");
            int e13 = t0.b.e(b10, "requires_storage_not_low");
            int e14 = t0.b.e(b10, "trigger_content_update_delay");
            int e15 = t0.b.e(b10, "trigger_max_content_delay");
            int e16 = t0.b.e(b10, "content_uri_triggers");
            int e17 = t0.b.e(b10, ug.f21009x);
            int e18 = t0.b.e(b10, "state");
            int e19 = t0.b.e(b10, "worker_class_name");
            int e20 = t0.b.e(b10, "input_merger_class_name");
            int e21 = t0.b.e(b10, "input");
            int e22 = t0.b.e(b10, "output");
            t0Var = f10;
            try {
                int e23 = t0.b.e(b10, "initial_delay");
                int e24 = t0.b.e(b10, "interval_duration");
                int e25 = t0.b.e(b10, "flex_duration");
                int e26 = t0.b.e(b10, "run_attempt_count");
                int e27 = t0.b.e(b10, "backoff_policy");
                int e28 = t0.b.e(b10, "backoff_delay_duration");
                int e29 = t0.b.e(b10, "period_start_time");
                int e30 = t0.b.e(b10, "minimum_retention_duration");
                int e31 = t0.b.e(b10, "schedule_requested_at");
                int e32 = t0.b.e(b10, "run_in_foreground");
                int e33 = t0.b.e(b10, "out_of_quota_policy");
                int i11 = e22;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(e17);
                    int i12 = e17;
                    String string2 = b10.getString(e19);
                    int i13 = e19;
                    androidx.work.c cVar = new androidx.work.c();
                    int i14 = e8;
                    cVar.k(v.e(b10.getInt(e8)));
                    cVar.m(b10.getInt(e10) != 0);
                    cVar.n(b10.getInt(e11) != 0);
                    cVar.l(b10.getInt(e12) != 0);
                    cVar.o(b10.getInt(e13) != 0);
                    int i15 = e10;
                    int i16 = e11;
                    cVar.p(b10.getLong(e14));
                    cVar.q(b10.getLong(e15));
                    cVar.j(v.b(b10.getBlob(e16)));
                    p pVar = new p(string, string2);
                    pVar.f27433b = v.g(b10.getInt(e18));
                    pVar.f27435d = b10.getString(e20);
                    pVar.f27436e = androidx.work.e.g(b10.getBlob(e21));
                    int i17 = i11;
                    pVar.f27437f = androidx.work.e.g(b10.getBlob(i17));
                    i11 = i17;
                    int i18 = e23;
                    pVar.f27438g = b10.getLong(i18);
                    int i19 = e20;
                    int i20 = e24;
                    pVar.f27439h = b10.getLong(i20);
                    int i21 = e12;
                    int i22 = e25;
                    pVar.f27440i = b10.getLong(i22);
                    int i23 = e26;
                    pVar.f27442k = b10.getInt(i23);
                    int i24 = e27;
                    pVar.f27443l = v.d(b10.getInt(i24));
                    e25 = i22;
                    int i25 = e28;
                    pVar.f27444m = b10.getLong(i25);
                    int i26 = e29;
                    pVar.f27445n = b10.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    pVar.f27446o = b10.getLong(i27);
                    int i28 = e31;
                    pVar.f27447p = b10.getLong(i28);
                    int i29 = e32;
                    pVar.f27448q = b10.getInt(i29) != 0;
                    int i30 = e33;
                    pVar.f27449r = v.f(b10.getInt(i30));
                    pVar.f27441j = cVar;
                    arrayList.add(pVar);
                    e33 = i30;
                    e10 = i15;
                    e20 = i19;
                    e23 = i18;
                    e24 = i20;
                    e26 = i23;
                    e31 = i28;
                    e17 = i12;
                    e19 = i13;
                    e8 = i14;
                    e32 = i29;
                    e30 = i27;
                    e11 = i16;
                    e28 = i25;
                    e12 = i21;
                    e27 = i24;
                }
                b10.close();
                t0Var.t();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                t0Var.t();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            t0Var = f10;
        }
    }

    @Override // l1.q
    public int k() {
        this.f27458a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27466i.acquire();
        this.f27458a.beginTransaction();
        try {
            int n10 = acquire.n();
            this.f27458a.setTransactionSuccessful();
            return n10;
        } finally {
            this.f27458a.endTransaction();
            this.f27466i.release(acquire);
        }
    }

    @Override // l1.q
    public int l(String str, long j10) {
        this.f27458a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27465h.acquire();
        acquire.m0(1, j10);
        if (str == null) {
            acquire.v0(2);
        } else {
            acquire.d0(2, str);
        }
        this.f27458a.beginTransaction();
        try {
            int n10 = acquire.n();
            this.f27458a.setTransactionSuccessful();
            return n10;
        } finally {
            this.f27458a.endTransaction();
            this.f27465h.release(acquire);
        }
    }

    @Override // l1.q
    public List<p.b> m(String str) {
        t0 f10 = t0.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int e8 = t0.b.e(b10, ug.f21009x);
            int e10 = t0.b.e(b10, "state");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f27450a = b10.getString(e8);
                bVar.f27451b = v.g(b10.getInt(e10));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.q
    public List<p> n(int i10) {
        t0 t0Var;
        t0 f10 = t0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        f10.m0(1, i10);
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "required_network_type");
            int e10 = t0.b.e(b10, "requires_charging");
            int e11 = t0.b.e(b10, "requires_device_idle");
            int e12 = t0.b.e(b10, "requires_battery_not_low");
            int e13 = t0.b.e(b10, "requires_storage_not_low");
            int e14 = t0.b.e(b10, "trigger_content_update_delay");
            int e15 = t0.b.e(b10, "trigger_max_content_delay");
            int e16 = t0.b.e(b10, "content_uri_triggers");
            int e17 = t0.b.e(b10, ug.f21009x);
            int e18 = t0.b.e(b10, "state");
            int e19 = t0.b.e(b10, "worker_class_name");
            int e20 = t0.b.e(b10, "input_merger_class_name");
            int e21 = t0.b.e(b10, "input");
            int e22 = t0.b.e(b10, "output");
            t0Var = f10;
            try {
                int e23 = t0.b.e(b10, "initial_delay");
                int e24 = t0.b.e(b10, "interval_duration");
                int e25 = t0.b.e(b10, "flex_duration");
                int e26 = t0.b.e(b10, "run_attempt_count");
                int e27 = t0.b.e(b10, "backoff_policy");
                int e28 = t0.b.e(b10, "backoff_delay_duration");
                int e29 = t0.b.e(b10, "period_start_time");
                int e30 = t0.b.e(b10, "minimum_retention_duration");
                int e31 = t0.b.e(b10, "schedule_requested_at");
                int e32 = t0.b.e(b10, "run_in_foreground");
                int e33 = t0.b.e(b10, "out_of_quota_policy");
                int i11 = e22;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(e17);
                    int i12 = e17;
                    String string2 = b10.getString(e19);
                    int i13 = e19;
                    androidx.work.c cVar = new androidx.work.c();
                    int i14 = e8;
                    cVar.k(v.e(b10.getInt(e8)));
                    cVar.m(b10.getInt(e10) != 0);
                    cVar.n(b10.getInt(e11) != 0);
                    cVar.l(b10.getInt(e12) != 0);
                    cVar.o(b10.getInt(e13) != 0);
                    int i15 = e10;
                    int i16 = e11;
                    cVar.p(b10.getLong(e14));
                    cVar.q(b10.getLong(e15));
                    cVar.j(v.b(b10.getBlob(e16)));
                    p pVar = new p(string, string2);
                    pVar.f27433b = v.g(b10.getInt(e18));
                    pVar.f27435d = b10.getString(e20);
                    pVar.f27436e = androidx.work.e.g(b10.getBlob(e21));
                    int i17 = i11;
                    pVar.f27437f = androidx.work.e.g(b10.getBlob(i17));
                    i11 = i17;
                    int i18 = e23;
                    pVar.f27438g = b10.getLong(i18);
                    int i19 = e20;
                    int i20 = e24;
                    pVar.f27439h = b10.getLong(i20);
                    int i21 = e12;
                    int i22 = e25;
                    pVar.f27440i = b10.getLong(i22);
                    int i23 = e26;
                    pVar.f27442k = b10.getInt(i23);
                    int i24 = e27;
                    pVar.f27443l = v.d(b10.getInt(i24));
                    e25 = i22;
                    int i25 = e28;
                    pVar.f27444m = b10.getLong(i25);
                    int i26 = e29;
                    pVar.f27445n = b10.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    pVar.f27446o = b10.getLong(i27);
                    int i28 = e31;
                    pVar.f27447p = b10.getLong(i28);
                    int i29 = e32;
                    pVar.f27448q = b10.getInt(i29) != 0;
                    int i30 = e33;
                    pVar.f27449r = v.f(b10.getInt(i30));
                    pVar.f27441j = cVar;
                    arrayList.add(pVar);
                    e33 = i30;
                    e10 = i15;
                    e20 = i19;
                    e23 = i18;
                    e24 = i20;
                    e26 = i23;
                    e31 = i28;
                    e17 = i12;
                    e19 = i13;
                    e8 = i14;
                    e32 = i29;
                    e30 = i27;
                    e11 = i16;
                    e28 = i25;
                    e12 = i21;
                    e27 = i24;
                }
                b10.close();
                t0Var.t();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                t0Var.t();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            t0Var = f10;
        }
    }

    @Override // l1.q
    public void o(String str, androidx.work.e eVar) {
        this.f27458a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27461d.acquire();
        byte[] l10 = androidx.work.e.l(eVar);
        if (l10 == null) {
            acquire.v0(1);
        } else {
            acquire.p0(1, l10);
        }
        if (str == null) {
            acquire.v0(2);
        } else {
            acquire.d0(2, str);
        }
        this.f27458a.beginTransaction();
        try {
            acquire.n();
            this.f27458a.setTransactionSuccessful();
        } finally {
            this.f27458a.endTransaction();
            this.f27461d.release(acquire);
        }
    }

    @Override // l1.q
    public List<p> p() {
        t0 t0Var;
        t0 f10 = t0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            int e8 = t0.b.e(b10, "required_network_type");
            int e10 = t0.b.e(b10, "requires_charging");
            int e11 = t0.b.e(b10, "requires_device_idle");
            int e12 = t0.b.e(b10, "requires_battery_not_low");
            int e13 = t0.b.e(b10, "requires_storage_not_low");
            int e14 = t0.b.e(b10, "trigger_content_update_delay");
            int e15 = t0.b.e(b10, "trigger_max_content_delay");
            int e16 = t0.b.e(b10, "content_uri_triggers");
            int e17 = t0.b.e(b10, ug.f21009x);
            int e18 = t0.b.e(b10, "state");
            int e19 = t0.b.e(b10, "worker_class_name");
            int e20 = t0.b.e(b10, "input_merger_class_name");
            int e21 = t0.b.e(b10, "input");
            int e22 = t0.b.e(b10, "output");
            t0Var = f10;
            try {
                int e23 = t0.b.e(b10, "initial_delay");
                int e24 = t0.b.e(b10, "interval_duration");
                int e25 = t0.b.e(b10, "flex_duration");
                int e26 = t0.b.e(b10, "run_attempt_count");
                int e27 = t0.b.e(b10, "backoff_policy");
                int e28 = t0.b.e(b10, "backoff_delay_duration");
                int e29 = t0.b.e(b10, "period_start_time");
                int e30 = t0.b.e(b10, "minimum_retention_duration");
                int e31 = t0.b.e(b10, "schedule_requested_at");
                int e32 = t0.b.e(b10, "run_in_foreground");
                int e33 = t0.b.e(b10, "out_of_quota_policy");
                int i10 = e22;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(e17);
                    int i11 = e17;
                    String string2 = b10.getString(e19);
                    int i12 = e19;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = e8;
                    cVar.k(v.e(b10.getInt(e8)));
                    cVar.m(b10.getInt(e10) != 0);
                    cVar.n(b10.getInt(e11) != 0);
                    cVar.l(b10.getInt(e12) != 0);
                    cVar.o(b10.getInt(e13) != 0);
                    int i14 = e10;
                    int i15 = e11;
                    cVar.p(b10.getLong(e14));
                    cVar.q(b10.getLong(e15));
                    cVar.j(v.b(b10.getBlob(e16)));
                    p pVar = new p(string, string2);
                    pVar.f27433b = v.g(b10.getInt(e18));
                    pVar.f27435d = b10.getString(e20);
                    pVar.f27436e = androidx.work.e.g(b10.getBlob(e21));
                    int i16 = i10;
                    pVar.f27437f = androidx.work.e.g(b10.getBlob(i16));
                    i10 = i16;
                    int i17 = e23;
                    pVar.f27438g = b10.getLong(i17);
                    int i18 = e21;
                    int i19 = e24;
                    pVar.f27439h = b10.getLong(i19);
                    int i20 = e12;
                    int i21 = e25;
                    pVar.f27440i = b10.getLong(i21);
                    int i22 = e26;
                    pVar.f27442k = b10.getInt(i22);
                    int i23 = e27;
                    pVar.f27443l = v.d(b10.getInt(i23));
                    e25 = i21;
                    int i24 = e28;
                    pVar.f27444m = b10.getLong(i24);
                    int i25 = e29;
                    pVar.f27445n = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    pVar.f27446o = b10.getLong(i26);
                    int i27 = e31;
                    pVar.f27447p = b10.getLong(i27);
                    int i28 = e32;
                    pVar.f27448q = b10.getInt(i28) != 0;
                    int i29 = e33;
                    pVar.f27449r = v.f(b10.getInt(i29));
                    pVar.f27441j = cVar;
                    arrayList.add(pVar);
                    e33 = i29;
                    e10 = i14;
                    e21 = i18;
                    e23 = i17;
                    e24 = i19;
                    e26 = i22;
                    e31 = i27;
                    e17 = i11;
                    e19 = i12;
                    e8 = i13;
                    e32 = i28;
                    e30 = i26;
                    e11 = i15;
                    e28 = i24;
                    e12 = i20;
                    e27 = i23;
                }
                b10.close();
                t0Var.t();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                t0Var.t();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            t0Var = f10;
        }
    }

    @Override // l1.q
    public boolean q() {
        boolean z10 = false;
        t0 f10 = t0.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f27458a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27458a, f10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.q
    public int r(String str) {
        this.f27458a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27464g.acquire();
        if (str == null) {
            acquire.v0(1);
        } else {
            acquire.d0(1, str);
        }
        this.f27458a.beginTransaction();
        try {
            int n10 = acquire.n();
            this.f27458a.setTransactionSuccessful();
            return n10;
        } finally {
            this.f27458a.endTransaction();
            this.f27464g.release(acquire);
        }
    }

    @Override // l1.q
    public List<p.c> s(String str) {
        t0 f10 = t0.f("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27458a.assertNotSuspendingTransaction();
        this.f27458a.beginTransaction();
        try {
            Cursor b10 = t0.c.b(this.f27458a, f10, true, null);
            int e8 = t0.b.e(b10, ug.f21009x);
            int e10 = t0.b.e(b10, "state");
            int e11 = t0.b.e(b10, "output");
            int e12 = t0.b.e(b10, "run_attempt_count");
            androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>();
            while (b10.moveToNext()) {
                if (!b10.isNull(e8)) {
                    String string = b10.getString(e8);
                    if (aVar.get(string) == null) {
                        aVar.put(string, new ArrayList<>());
                    }
                }
                if (!b10.isNull(e8)) {
                    String string2 = b10.getString(e8);
                    if (aVar2.get(string2) == null) {
                        aVar2.put(string2, new ArrayList<>());
                    }
                }
            }
            b10.moveToPosition(-1);
            x(aVar);
            w(aVar2);
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                ArrayList<String> arrayList2 = !b10.isNull(e8) ? aVar.get(b10.getString(e8)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<androidx.work.e> arrayList3 = !b10.isNull(e8) ? aVar2.get(b10.getString(e8)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                p.c cVar = new p.c();
                cVar.f27452a = b10.getString(e8);
                cVar.f27453b = v.g(b10.getInt(e10));
                cVar.f27454c = androidx.work.e.g(b10.getBlob(e11));
                cVar.f27455d = b10.getInt(e12);
                cVar.f27456e = arrayList2;
                cVar.f27457f = arrayList3;
                arrayList.add(cVar);
            }
            this.f27458a.setTransactionSuccessful();
            b10.close();
            f10.t();
            return arrayList;
        } finally {
            this.f27458a.endTransaction();
        }
    }

    @Override // l1.q
    public void t(p pVar) {
        this.f27458a.assertNotSuspendingTransaction();
        this.f27458a.beginTransaction();
        try {
            this.f27459b.insert((androidx.room.p<p>) pVar);
            this.f27458a.setTransactionSuccessful();
        } finally {
            this.f27458a.endTransaction();
        }
    }

    @Override // l1.q
    public int u(String str) {
        this.f27458a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27463f.acquire();
        if (str == null) {
            acquire.v0(1);
        } else {
            acquire.d0(1, str);
        }
        this.f27458a.beginTransaction();
        try {
            int n10 = acquire.n();
            this.f27458a.setTransactionSuccessful();
            return n10;
        } finally {
            this.f27458a.endTransaction();
            this.f27463f.release(acquire);
        }
    }

    @Override // l1.q
    public void v(String str, long j10) {
        this.f27458a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27462e.acquire();
        acquire.m0(1, j10);
        if (str == null) {
            acquire.v0(2);
        } else {
            acquire.d0(2, str);
        }
        this.f27458a.beginTransaction();
        try {
            acquire.n();
            this.f27458a.setTransactionSuccessful();
        } finally {
            this.f27458a.endTransaction();
            this.f27462e.release(acquire);
        }
    }
}
