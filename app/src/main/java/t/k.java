package t;

import t.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelperReferences.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k extends p {
    public k(s.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f30903h.f30855k.add(fVar);
        fVar.f30856l.add(this.f30903h);
    }

    @Override // t.p, t.d
    public void a(d dVar) {
        s.a aVar = (s.a) this.f30897b;
        int e12 = aVar.e1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f30903h.f30856l) {
            int i12 = fVar.f30851g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (e12 != 0 && e12 != 2) {
            this.f30903h.d(i10 + aVar.f1());
        } else {
            this.f30903h.d(i11 + aVar.f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        s.e eVar = this.f30897b;
        if (eVar instanceof s.a) {
            this.f30903h.f30846b = true;
            s.a aVar = (s.a) eVar;
            int e12 = aVar.e1();
            boolean d12 = aVar.d1();
            int i10 = 0;
            if (e12 == 0) {
                this.f30903h.f30849e = f.a.LEFT;
                while (i10 < aVar.E0) {
                    s.e eVar2 = aVar.D0[i10];
                    if (d12 || eVar2.Q() != 8) {
                        f fVar = eVar2.f30535e.f30903h;
                        fVar.f30855k.add(this.f30903h);
                        this.f30903h.f30856l.add(fVar);
                    }
                    i10++;
                }
                q(this.f30897b.f30535e.f30903h);
                q(this.f30897b.f30535e.f30904i);
            } else if (e12 == 1) {
                this.f30903h.f30849e = f.a.RIGHT;
                while (i10 < aVar.E0) {
                    s.e eVar3 = aVar.D0[i10];
                    if (d12 || eVar3.Q() != 8) {
                        f fVar2 = eVar3.f30535e.f30904i;
                        fVar2.f30855k.add(this.f30903h);
                        this.f30903h.f30856l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f30897b.f30535e.f30903h);
                q(this.f30897b.f30535e.f30904i);
            } else if (e12 == 2) {
                this.f30903h.f30849e = f.a.TOP;
                while (i10 < aVar.E0) {
                    s.e eVar4 = aVar.D0[i10];
                    if (d12 || eVar4.Q() != 8) {
                        f fVar3 = eVar4.f30537f.f30903h;
                        fVar3.f30855k.add(this.f30903h);
                        this.f30903h.f30856l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f30897b.f30537f.f30903h);
                q(this.f30897b.f30537f.f30904i);
            } else if (e12 != 3) {
            } else {
                this.f30903h.f30849e = f.a.BOTTOM;
                while (i10 < aVar.E0) {
                    s.e eVar5 = aVar.D0[i10];
                    if (d12 || eVar5.Q() != 8) {
                        f fVar4 = eVar5.f30537f.f30904i;
                        fVar4.f30855k.add(this.f30903h);
                        this.f30903h.f30856l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f30897b.f30537f.f30903h);
                q(this.f30897b.f30537f.f30904i);
            }
        }
    }

    @Override // t.p
    public void e() {
        s.e eVar = this.f30897b;
        if (eVar instanceof s.a) {
            int e12 = ((s.a) eVar).e1();
            if (e12 != 0 && e12 != 1) {
                this.f30897b.W0(this.f30903h.f30851g);
            } else {
                this.f30897b.V0(this.f30903h.f30851g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f30898c = null;
        this.f30903h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        return false;
    }
}
