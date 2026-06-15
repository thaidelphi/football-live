package t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuidelineReference.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j extends p {
    public j(s.e eVar) {
        super(eVar);
        eVar.f30535e.f();
        eVar.f30537f.f();
        this.f30901f = ((s.g) eVar).b1();
    }

    private void q(f fVar) {
        this.f30903h.f30855k.add(fVar);
        fVar.f30856l.add(this.f30903h);
    }

    @Override // t.p, t.d
    public void a(d dVar) {
        f fVar = this.f30903h;
        if (fVar.f30847c && !fVar.f30854j) {
            this.f30903h.d((int) ((fVar.f30856l.get(0).f30851g * ((s.g) this.f30897b).e1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        s.g gVar = (s.g) this.f30897b;
        int c12 = gVar.c1();
        int d12 = gVar.d1();
        gVar.e1();
        if (gVar.b1() == 1) {
            if (c12 != -1) {
                this.f30903h.f30856l.add(this.f30897b.T.f30535e.f30903h);
                this.f30897b.T.f30535e.f30903h.f30855k.add(this.f30903h);
                this.f30903h.f30850f = c12;
            } else if (d12 != -1) {
                this.f30903h.f30856l.add(this.f30897b.T.f30535e.f30904i);
                this.f30897b.T.f30535e.f30904i.f30855k.add(this.f30903h);
                this.f30903h.f30850f = -d12;
            } else {
                f fVar = this.f30903h;
                fVar.f30846b = true;
                fVar.f30856l.add(this.f30897b.T.f30535e.f30904i);
                this.f30897b.T.f30535e.f30904i.f30855k.add(this.f30903h);
            }
            q(this.f30897b.f30535e.f30903h);
            q(this.f30897b.f30535e.f30904i);
            return;
        }
        if (c12 != -1) {
            this.f30903h.f30856l.add(this.f30897b.T.f30537f.f30903h);
            this.f30897b.T.f30537f.f30903h.f30855k.add(this.f30903h);
            this.f30903h.f30850f = c12;
        } else if (d12 != -1) {
            this.f30903h.f30856l.add(this.f30897b.T.f30537f.f30904i);
            this.f30897b.T.f30537f.f30904i.f30855k.add(this.f30903h);
            this.f30903h.f30850f = -d12;
        } else {
            f fVar2 = this.f30903h;
            fVar2.f30846b = true;
            fVar2.f30856l.add(this.f30897b.T.f30537f.f30904i);
            this.f30897b.T.f30537f.f30904i.f30855k.add(this.f30903h);
        }
        q(this.f30897b.f30537f.f30903h);
        q(this.f30897b.f30537f.f30904i);
    }

    @Override // t.p
    public void e() {
        if (((s.g) this.f30897b).b1() == 1) {
            this.f30897b.V0(this.f30903h.f30851g);
        } else {
            this.f30897b.W0(this.f30903h.f30851g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f30903h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        return false;
    }
}
