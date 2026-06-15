package e4;

import android.os.Bundle;
import java.util.ArrayList;
import n3.h;
/* compiled from: TrackGroupArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m0 implements n3.h {

    /* renamed from: d  reason: collision with root package name */
    public static final m0 f25104d = new m0(new k0[0]);

    /* renamed from: e  reason: collision with root package name */
    public static final h.a<m0> f25105e = new h.a() { // from class: e4.l0
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            m0 e8;
            e8 = m0.e(bundle);
            return e8;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f25106a;

    /* renamed from: b  reason: collision with root package name */
    private final y5.q<k0> f25107b;

    /* renamed from: c  reason: collision with root package name */
    private int f25108c;

    public m0(k0... k0VarArr) {
        this.f25107b = y5.q.m(k0VarArr);
        this.f25106a = k0VarArr.length;
        f();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m0 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        if (parcelableArrayList == null) {
            return new m0(new k0[0]);
        }
        return new m0((k0[]) a5.c.b(k0.f25082f, parcelableArrayList).toArray(new k0[0]));
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f25107b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f25107b.size(); i12++) {
                if (this.f25107b.get(i10).equals(this.f25107b.get(i12))) {
                    a5.t.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public k0 b(int i10) {
        return this.f25107b.get(i10);
    }

    public int c(k0 k0Var) {
        int indexOf = this.f25107b.indexOf(k0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f25106a == m0Var.f25106a && this.f25107b.equals(m0Var.f25107b);
    }

    public int hashCode() {
        if (this.f25108c == 0) {
            this.f25108c = this.f25107b.hashCode();
        }
        return this.f25108c;
    }
}
