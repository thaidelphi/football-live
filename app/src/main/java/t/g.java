package t;

import t.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f30866m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f30849e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f30849e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // t.f
    public void d(int i10) {
        if (this.f30854j) {
            return;
        }
        this.f30854j = true;
        this.f30851g = i10;
        for (d dVar : this.f30855k) {
            dVar.a(dVar);
        }
    }
}
