package d9;
/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class k2 extends j0 {
    public abstract k2 K0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String L0() {
        k2 k2Var;
        k2 c10 = f1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            k2Var = c10.K0();
        } catch (UnsupportedOperationException unused) {
            k2Var = null;
        }
        if (this == k2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // d9.j0
    public String toString() {
        String L0 = L0();
        if (L0 == null) {
            return t0.a(this) + '@' + t0.b(this);
        }
        return L0;
    }
}
