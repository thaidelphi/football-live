package d9;
/* compiled from: Unconfined.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a3 extends j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a3 f24411b = new a3();

    private a3() {
    }

    @Override // d9.j0
    public void G0(m8.g gVar, Runnable runnable) {
        e3 e3Var = (e3) gVar.get(e3.f24432b);
        if (e3Var != null) {
            e3Var.f24433a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // d9.j0
    public boolean I0(m8.g gVar) {
        return false;
    }

    @Override // d9.j0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
