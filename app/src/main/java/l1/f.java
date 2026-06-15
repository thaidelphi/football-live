package l1;

import android.database.Cursor;
import androidx.room.q0;
import androidx.room.t0;
/* compiled from: PreferenceDao_Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f27406a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.p<d> f27407b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends androidx.room.p<d> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.p
        /* renamed from: a */
        public void bind(v0.k kVar, d dVar) {
            String str = dVar.f27404a;
            if (str == null) {
                kVar.v0(1);
            } else {
                kVar.d0(1, str);
            }
            Long l10 = dVar.f27405b;
            if (l10 == null) {
                kVar.v0(2);
            } else {
                kVar.m0(2, l10.longValue());
            }
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public f(q0 q0Var) {
        this.f27406a = q0Var;
        this.f27407b = new a(q0Var);
    }

    @Override // l1.e
    public void a(d dVar) {
        this.f27406a.assertNotSuspendingTransaction();
        this.f27406a.beginTransaction();
        try {
            this.f27407b.insert((androidx.room.p<d>) dVar);
            this.f27406a.setTransactionSuccessful();
        } finally {
            this.f27406a.endTransaction();
        }
    }

    @Override // l1.e
    public Long b(String str) {
        t0 f10 = t0.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f10.v0(1);
        } else {
            f10.d0(1, str);
        }
        this.f27406a.assertNotSuspendingTransaction();
        Long l10 = null;
        Cursor b10 = t0.c.b(this.f27406a, f10, false, null);
        try {
            if (b10.moveToFirst() && !b10.isNull(0)) {
                l10 = Long.valueOf(b10.getLong(0));
            }
            return l10;
        } finally {
            b10.close();
            f10.t();
        }
    }
}
