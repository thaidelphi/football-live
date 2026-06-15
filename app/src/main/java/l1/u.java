package l1;

import android.database.Cursor;
import androidx.room.q0;
import androidx.room.t0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkTagDao_Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f27479a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.p<s> f27480b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends androidx.room.p<s> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.p
        /* renamed from: a */
        public void bind(v0.k kVar, s sVar) {
            String str = sVar.f27477a;
            if (str == null) {
                kVar.v0(1);
            } else {
                kVar.d0(1, str);
            }
            String str2 = sVar.f27478b;
            if (str2 == null) {
                kVar.v0(2);
            } else {
                kVar.d0(2, str2);
            }
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public u(q0 q0Var) {
        this.f27479a = q0Var;
        this.f27480b = new a(q0Var);
    }

    @Override // l1.t
    public List<String> a(String str) {
        t0 f10 = t0.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27479a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27479a, f10, false, null);
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

    @Override // l1.t
    public void b(s sVar) {
        this.f27479a.assertNotSuspendingTransaction();
        this.f27479a.beginTransaction();
        try {
            this.f27480b.insert((androidx.room.p<s>) sVar);
            this.f27479a.setTransactionSuccessful();
        } finally {
            this.f27479a.endTransaction();
        }
    }
}
