package t;

import java.util.ArrayList;
import java.util.List;
/* compiled from: DependencyNode.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    p f30848d;

    /* renamed from: f  reason: collision with root package name */
    int f30850f;

    /* renamed from: g  reason: collision with root package name */
    public int f30851g;

    /* renamed from: a  reason: collision with root package name */
    public d f30845a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30846b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f30847c = false;

    /* renamed from: e  reason: collision with root package name */
    a f30849e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    int f30852h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f30853i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f30854j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f30855k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f30856l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f30848d = pVar;
    }

    @Override // t.d
    public void a(d dVar) {
        for (f fVar : this.f30856l) {
            if (!fVar.f30854j) {
                return;
            }
        }
        this.f30847c = true;
        d dVar2 = this.f30845a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f30846b) {
            this.f30848d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f fVar3 : this.f30856l) {
            if (!(fVar3 instanceof g)) {
                i10++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f30854j) {
            g gVar = this.f30853i;
            if (gVar != null) {
                if (!gVar.f30854j) {
                    return;
                }
                this.f30850f = this.f30852h * gVar.f30851g;
            }
            d(fVar2.f30851g + this.f30850f);
        }
        d dVar3 = this.f30845a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f30855k.add(dVar);
        if (this.f30854j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f30856l.clear();
        this.f30855k.clear();
        this.f30854j = false;
        this.f30851g = 0;
        this.f30847c = false;
        this.f30846b = false;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30848d.f30897b.r());
        sb.append(":");
        sb.append(this.f30849e);
        sb.append("(");
        sb.append(this.f30854j ? Integer.valueOf(this.f30851g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f30856l.size());
        sb.append(":d=");
        sb.append(this.f30855k.size());
        sb.append(">");
        return sb.toString();
    }
}
