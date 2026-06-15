package l1;

import android.database.Cursor;
import androidx.room.q0;
import androidx.room.t0;
import androidx.room.w0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f27411a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.p<g> f27412b;

    /* renamed from: c  reason: collision with root package name */
    private final w0 f27413c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends androidx.room.p<g> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.p
        /* renamed from: a */
        public void bind(v0.k kVar, g gVar) {
            String str = gVar.f27409a;
            if (str == null) {
                kVar.v0(1);
            } else {
                kVar.d0(1, str);
            }
            kVar.m0(2, gVar.f27410b);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends w0 {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(q0 q0Var) {
        this.f27411a = q0Var;
        this.f27412b = new a(q0Var);
        this.f27413c = new b(q0Var);
    }

    @Override // l1.h
    public g a(String str) {
        t0 f10 = t0.f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27411a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27411a, f10, false, null);
        try {
            return b10.moveToFirst() ? new g(b10.getString(t0.b.e(b10, "work_spec_id")), b10.getInt(t0.b.e(b10, "system_id"))) : null;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.h
    public void b(g gVar) {
        this.f27411a.assertNotSuspendingTransaction();
        this.f27411a.beginTransaction();
        try {
            this.f27412b.insert((androidx.room.p<g>) gVar);
            this.f27411a.setTransactionSuccessful();
        } finally {
            this.f27411a.endTransaction();
        }
    }

    @Override // l1.h
    public List<String> c() {
        t0 f10 = t0.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f27411a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27411a, f10, false, null);
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

    @Override // l1.h
    public void d(String str) {
        this.f27411a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27413c.acquire();
        if (str == null) {
            acquire.v0(1);
        } else {
            acquire.d0(1, str);
        }
        this.f27411a.beginTransaction();
        try {
            acquire.n();
            this.f27411a.setTransactionSuccessful();
        } finally {
            this.f27411a.endTransaction();
            this.f27413c.release(acquire);
        }
    }
}
