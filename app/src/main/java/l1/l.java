package l1;

import android.database.Cursor;
import androidx.room.q0;
import androidx.room.t0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkNameDao_Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f27418a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.p<j> f27419b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends androidx.room.p<j> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.p
        /* renamed from: a */
        public void bind(v0.k kVar, j jVar) {
            String str = jVar.f27416a;
            if (str == null) {
                kVar.v0(1);
            } else {
                kVar.d0(1, str);
            }
            String str2 = jVar.f27417b;
            if (str2 == null) {
                kVar.v0(2);
            } else {
                kVar.d0(2, str2);
            }
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public l(q0 q0Var) {
        this.f27418a = q0Var;
        this.f27419b = new a(q0Var);
    }

    @Override // l1.k
    public List<String> a(String str) {
        t0 f10 = t0.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27418a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27418a, f10, false, null);
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

    @Override // l1.k
    public void b(j jVar) {
        this.f27418a.assertNotSuspendingTransaction();
        this.f27418a.beginTransaction();
        try {
            this.f27419b.insert((androidx.room.p<j>) jVar);
            this.f27418a.setTransactionSuccessful();
        } finally {
            this.f27418a.endTransaction();
        }
    }
}
