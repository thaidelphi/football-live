package a5;

import android.util.SparseBooleanArray;
/* compiled from: FlagSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f463a;

    /* compiled from: FlagSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f464a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f465b;

        public b a(int i10) {
            a5.a.f(!this.f465b);
            this.f464a.append(i10, true);
            return this;
        }

        public b b(m mVar) {
            for (int i10 = 0; i10 < mVar.d(); i10++) {
                a(mVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public m e() {
            a5.a.f(!this.f465b);
            this.f465b = true;
            return new m(this.f464a);
        }
    }

    public boolean a(int i10) {
        return this.f463a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        a5.a.c(i10, 0, d());
        return this.f463a.keyAt(i10);
    }

    public int d() {
        return this.f463a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (p0.f482a < 24) {
                if (d() != mVar.d()) {
                    return false;
                }
                for (int i10 = 0; i10 < d(); i10++) {
                    if (c(i10) != mVar.c(i10)) {
                        return false;
                    }
                }
                return true;
            }
            return this.f463a.equals(mVar.f463a);
        }
        return false;
    }

    public int hashCode() {
        if (p0.f482a < 24) {
            int d10 = d();
            for (int i10 = 0; i10 < d(); i10++) {
                d10 = (d10 * 31) + c(i10);
            }
            return d10;
        }
        return this.f463a.hashCode();
    }

    private m(SparseBooleanArray sparseBooleanArray) {
        this.f463a = sparseBooleanArray;
    }
}
