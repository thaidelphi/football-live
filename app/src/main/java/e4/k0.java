package e4;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import n3.h;
import n3.m1;
/* compiled from: TrackGroup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k0 implements n3.h {

    /* renamed from: f  reason: collision with root package name */
    public static final h.a<k0> f25082f = new h.a() { // from class: e4.j0
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            k0 e8;
            e8 = k0.e(bundle);
            return e8;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f25083a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25084b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25085c;

    /* renamed from: d  reason: collision with root package name */
    private final m1[] f25086d;

    /* renamed from: e  reason: collision with root package name */
    private int f25087e;

    public k0(m1... m1VarArr) {
        this("", m1VarArr);
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k0 e(Bundle bundle) {
        y5.q b10;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        if (parcelableArrayList == null) {
            b10 = y5.q.p();
        } else {
            b10 = a5.c.b(m1.H, parcelableArrayList);
        }
        return new k0(bundle.getString(d(1), ""), (m1[]) b10.toArray(new m1[0]));
    }

    private static void f(String str, String str2, String str3, int i10) {
        a5.t.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String g(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int h(int i10) {
        return i10 | 16384;
    }

    private void i() {
        String g10 = g(this.f25086d[0].f28176c);
        int h10 = h(this.f25086d[0].f28178e);
        int i10 = 1;
        while (true) {
            m1[] m1VarArr = this.f25086d;
            if (i10 >= m1VarArr.length) {
                return;
            }
            if (!g10.equals(g(m1VarArr[i10].f28176c))) {
                m1[] m1VarArr2 = this.f25086d;
                f("languages", m1VarArr2[0].f28176c, m1VarArr2[i10].f28176c, i10);
                return;
            } else if (h10 != h(this.f25086d[i10].f28178e)) {
                f("role flags", Integer.toBinaryString(this.f25086d[0].f28178e), Integer.toBinaryString(this.f25086d[i10].f28178e), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public m1 b(int i10) {
        return this.f25086d[i10];
    }

    public int c(m1 m1Var) {
        int i10 = 0;
        while (true) {
            m1[] m1VarArr = this.f25086d;
            if (i10 >= m1VarArr.length) {
                return -1;
            }
            if (m1Var == m1VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f25084b.equals(k0Var.f25084b) && Arrays.equals(this.f25086d, k0Var.f25086d);
    }

    public int hashCode() {
        if (this.f25087e == 0) {
            this.f25087e = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f25084b.hashCode()) * 31) + Arrays.hashCode(this.f25086d);
        }
        return this.f25087e;
    }

    public k0(String str, m1... m1VarArr) {
        a5.a.a(m1VarArr.length > 0);
        this.f25084b = str;
        this.f25086d = m1VarArr;
        this.f25083a = m1VarArr.length;
        int k10 = a5.x.k(m1VarArr[0].f28185l);
        this.f25085c = k10 == -1 ? a5.x.k(m1VarArr[0].f28184k) : k10;
        i();
    }
}
