package j4;

import a5.l0;
import android.util.SparseArray;
/* compiled from: TimestampAdjusterProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<l0> f27063a = new SparseArray<>();

    public l0 a(int i10) {
        l0 l0Var = this.f27063a.get(i10);
        if (l0Var == null) {
            l0 l0Var2 = new l0(9223372036854775806L);
            this.f27063a.put(i10, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public void b() {
        this.f27063a.clear();
    }
}
