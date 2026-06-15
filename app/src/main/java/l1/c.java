package l1;

import android.database.Cursor;
import androidx.room.q0;
import androidx.room.t0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DependencyDao_Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f27401a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.p<l1.a> f27402b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends androidx.room.p<l1.a> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.p
        /* renamed from: a */
        public void bind(v0.k kVar, l1.a aVar) {
            String str = aVar.f27399a;
            if (str == null) {
                kVar.v0(1);
            } else {
                kVar.d0(1, str);
            }
            String str2 = aVar.f27400b;
            if (str2 == null) {
                kVar.v0(2);
            } else {
                kVar.d0(2, str2);
            }
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(q0 q0Var) {
        this.f27401a = q0Var;
        this.f27402b = new a(q0Var);
    }

    @Override // l1.b
    public void a(l1.a aVar) {
        this.f27401a.assertNotSuspendingTransaction();
        this.f27401a.beginTransaction();
        try {
            this.f27402b.insert((androidx.room.p<l1.a>) aVar);
            this.f27401a.setTransactionSuccessful();
        } finally {
            this.f27401a.endTransaction();
        }
    }

    @Override // l1.b
    public List<String> b(String str) {
        t0 f10 = t0.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27401a.assertNotSuspendingTransaction();
        Cursor b10 = t0.c.b(this.f27401a, f10, false, null);
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

    @Override // l1.b
    public boolean c(String str) {
        t0 f10 = t0.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27401a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor b10 = t0.c.b(this.f27401a, f10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            f10.t();
        }
    }

    @Override // l1.b
    public boolean d(String str) {
        t0 f10 = t0.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27401a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor b10 = t0.c.b(this.f27401a, f10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            f10.t();
        }
    }
}
