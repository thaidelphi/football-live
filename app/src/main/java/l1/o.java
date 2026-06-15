package l1;

import androidx.room.q0;
import androidx.room.w0;
/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f27423a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.p<m> f27424b;

    /* renamed from: c  reason: collision with root package name */
    private final w0 f27425c;

    /* renamed from: d  reason: collision with root package name */
    private final w0 f27426d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends androidx.room.p<m> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.p
        /* renamed from: a */
        public void bind(v0.k kVar, m mVar) {
            String str = mVar.f27421a;
            if (str == null) {
                kVar.v0(1);
            } else {
                kVar.d0(1, str);
            }
            byte[] l10 = androidx.work.e.l(mVar.f27422b);
            if (l10 == null) {
                kVar.v0(2);
            } else {
                kVar.p0(2, l10);
            }
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends w0 {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends w0 {
        c(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.w0
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(q0 q0Var) {
        this.f27423a = q0Var;
        this.f27424b = new a(q0Var);
        this.f27425c = new b(q0Var);
        this.f27426d = new c(q0Var);
    }

    @Override // l1.n
    public void a(String str) {
        this.f27423a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27425c.acquire();
        if (str == null) {
            acquire.v0(1);
        } else {
            acquire.d0(1, str);
        }
        this.f27423a.beginTransaction();
        try {
            acquire.n();
            this.f27423a.setTransactionSuccessful();
        } finally {
            this.f27423a.endTransaction();
            this.f27425c.release(acquire);
        }
    }

    @Override // l1.n
    public void b() {
        this.f27423a.assertNotSuspendingTransaction();
        v0.k acquire = this.f27426d.acquire();
        this.f27423a.beginTransaction();
        try {
            acquire.n();
            this.f27423a.setTransactionSuccessful();
        } finally {
            this.f27423a.endTransaction();
            this.f27426d.release(acquire);
        }
    }

    @Override // l1.n
    public void c(m mVar) {
        this.f27423a.assertNotSuspendingTransaction();
        this.f27423a.beginTransaction();
        try {
            this.f27424b.insert((androidx.room.p<m>) mVar);
            this.f27423a.setTransactionSuccessful();
        } finally {
            this.f27423a.endTransaction();
        }
    }
}
