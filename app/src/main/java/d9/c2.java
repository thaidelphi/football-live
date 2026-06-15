package d9;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c2 extends g2 implements z {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24420c;

    public c2(z1 z1Var) {
        super(true);
        g0(z1Var);
        this.f24420c = P0();
    }

    private final boolean P0() {
        g2 s10;
        t c02 = c0();
        u uVar = c02 instanceof u ? (u) c02 : null;
        if (uVar != null && (s10 = uVar.s()) != null) {
            while (!s10.Z()) {
                t c03 = s10.c0();
                u uVar2 = c03 instanceof u ? (u) c03 : null;
                if (uVar2 != null) {
                    s10 = uVar2.s();
                    if (s10 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // d9.g2
    public boolean Z() {
        return this.f24420c;
    }

    @Override // d9.g2
    public boolean a0() {
        return true;
    }
}
