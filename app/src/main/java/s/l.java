package s;

import java.util.ArrayList;
/* compiled from: WidgetContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l extends e {
    public ArrayList<e> D0 = new ArrayList<>();

    public void a(e eVar) {
        this.D0.add(eVar);
        if (eVar.I() != null) {
            ((l) eVar.I()).c1(eVar);
        }
        eVar.M0(this);
    }

    public ArrayList<e> a1() {
        return this.D0;
    }

    public void b1() {
        ArrayList<e> arrayList = this.D0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.D0.get(i10);
            if (eVar instanceof l) {
                ((l) eVar).b1();
            }
        }
    }

    public void c1(e eVar) {
        this.D0.remove(eVar);
        eVar.h0();
    }

    public void d1() {
        this.D0.clear();
    }

    @Override // s.e
    public void h0() {
        this.D0.clear();
        super.h0();
    }

    @Override // s.e
    public void j0(r.c cVar) {
        super.j0(cVar);
        int size = this.D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.D0.get(i10).j0(cVar);
        }
    }
}
