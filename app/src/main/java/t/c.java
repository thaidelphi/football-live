package t;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ChainRun.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList<p> f30834k;

    /* renamed from: l  reason: collision with root package name */
    private int f30835l;

    public c(s.e eVar, int i10) {
        super(eVar);
        this.f30834k = new ArrayList<>();
        this.f30901f = i10;
        q();
    }

    private void q() {
        s.e eVar;
        s.e eVar2 = this.f30897b;
        s.e J = eVar2.J(this.f30901f);
        while (true) {
            s.e eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            J = eVar2.J(this.f30901f);
        }
        this.f30897b = eVar;
        this.f30834k.add(eVar.L(this.f30901f));
        s.e H = eVar.H(this.f30901f);
        while (H != null) {
            this.f30834k.add(H.L(this.f30901f));
            H = H.H(this.f30901f);
        }
        Iterator<p> it = this.f30834k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f30901f;
            if (i10 == 0) {
                next.f30897b.f30531c = this;
            } else if (i10 == 1) {
                next.f30897b.f30533d = this;
            }
        }
        if ((this.f30901f == 0 && ((s.f) this.f30897b.I()).x1()) && this.f30834k.size() > 1) {
            ArrayList<p> arrayList = this.f30834k;
            this.f30897b = arrayList.get(arrayList.size() - 1).f30897b;
        }
        this.f30835l = this.f30901f == 0 ? this.f30897b.x() : this.f30897b.N();
    }

    private s.e r() {
        for (int i10 = 0; i10 < this.f30834k.size(); i10++) {
            p pVar = this.f30834k.get(i10);
            if (pVar.f30897b.Q() != 8) {
                return pVar.f30897b;
            }
        }
        return null;
    }

    private s.e s() {
        for (int size = this.f30834k.size() - 1; size >= 0; size--) {
            p pVar = this.f30834k.get(size);
            if (pVar.f30897b.Q() != 8) {
                return pVar.f30897b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a5, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cd, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d0, code lost:
        r9.f30900e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0418, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // t.p, t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(t.d r26) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.a(t.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        Iterator<p> it = this.f30834k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f30834k.size();
        if (size < 1) {
            return;
        }
        s.e eVar = this.f30834k.get(0).f30897b;
        s.e eVar2 = this.f30834k.get(size - 1).f30897b;
        if (this.f30901f == 0) {
            s.d dVar = eVar.H;
            s.d dVar2 = eVar2.J;
            f i10 = i(dVar, 0);
            int e8 = dVar.e();
            s.e r10 = r();
            if (r10 != null) {
                e8 = r10.H.e();
            }
            if (i10 != null) {
                b(this.f30903h, i10, e8);
            }
            f i11 = i(dVar2, 0);
            int e10 = dVar2.e();
            s.e s10 = s();
            if (s10 != null) {
                e10 = s10.J.e();
            }
            if (i11 != null) {
                b(this.f30904i, i11, -e10);
            }
        } else {
            s.d dVar3 = eVar.I;
            s.d dVar4 = eVar2.K;
            f i12 = i(dVar3, 1);
            int e11 = dVar3.e();
            s.e r11 = r();
            if (r11 != null) {
                e11 = r11.I.e();
            }
            if (i12 != null) {
                b(this.f30903h, i12, e11);
            }
            f i13 = i(dVar4, 1);
            int e12 = dVar4.e();
            s.e s11 = s();
            if (s11 != null) {
                e12 = s11.K.e();
            }
            if (i13 != null) {
                b(this.f30904i, i13, -e12);
            }
        }
        this.f30903h.f30845a = this;
        this.f30904i.f30845a = this;
    }

    @Override // t.p
    public void e() {
        for (int i10 = 0; i10 < this.f30834k.size(); i10++) {
            this.f30834k.get(i10).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f30898c = null;
        Iterator<p> it = this.f30834k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // t.p
    public long j() {
        int size = this.f30834k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f30834k.get(i10);
            j10 = j10 + pVar.f30903h.f30850f + pVar.j() + pVar.f30904i.f30850f;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        int size = this.f30834k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f30834k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        Iterator<p> it;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f30901f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        while (this.f30834k.iterator().hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
