package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: WidgetGroup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o {

    /* renamed from: g  reason: collision with root package name */
    static int f30881g;

    /* renamed from: b  reason: collision with root package name */
    int f30883b;

    /* renamed from: d  reason: collision with root package name */
    int f30885d;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<s.e> f30882a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    boolean f30884c = false;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<a> f30886e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f30887f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetGroup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<s.e> f30888a;

        /* renamed from: b  reason: collision with root package name */
        int f30889b;

        /* renamed from: c  reason: collision with root package name */
        int f30890c;

        /* renamed from: d  reason: collision with root package name */
        int f30891d;

        /* renamed from: e  reason: collision with root package name */
        int f30892e;

        /* renamed from: f  reason: collision with root package name */
        int f30893f;

        /* renamed from: g  reason: collision with root package name */
        int f30894g;

        public a(s.e eVar, r.d dVar, int i10) {
            this.f30888a = new WeakReference<>(eVar);
            this.f30889b = dVar.x(eVar.H);
            this.f30890c = dVar.x(eVar.I);
            this.f30891d = dVar.x(eVar.J);
            this.f30892e = dVar.x(eVar.K);
            this.f30893f = dVar.x(eVar.L);
            this.f30894g = i10;
        }
    }

    public o(int i10) {
        this.f30883b = -1;
        this.f30885d = 0;
        int i11 = f30881g;
        f30881g = i11 + 1;
        this.f30883b = i11;
        this.f30885d = i10;
    }

    private String e() {
        int i10 = this.f30885d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(r.d dVar, ArrayList<s.e> arrayList, int i10) {
        int x10;
        int x11;
        s.f fVar = (s.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.N0 > 0) {
            s.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.O0 > 0) {
            s.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f30886e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f30886e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.H);
            x11 = dVar.x(fVar.J);
            dVar.D();
        } else {
            x10 = dVar.x(fVar.I);
            x11 = dVar.x(fVar.K);
            dVar.D();
        }
        return x11 - x10;
    }

    public boolean a(s.e eVar) {
        if (this.f30882a.contains(eVar)) {
            return false;
        }
        this.f30882a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f30882a.size();
        if (this.f30887f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f30887f == oVar.f30883b) {
                    g(this.f30885d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f30883b;
    }

    public int d() {
        return this.f30885d;
    }

    public int f(r.d dVar, int i10) {
        if (this.f30882a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f30882a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<s.e> it = this.f30882a.iterator();
        while (it.hasNext()) {
            s.e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.A0 = oVar.c();
            } else {
                next.B0 = oVar.c();
            }
        }
        this.f30887f = oVar.f30883b;
    }

    public void h(boolean z10) {
        this.f30884c = z10;
    }

    public void i(int i10) {
        this.f30885d = i10;
    }

    public String toString() {
        Iterator<s.e> it;
        String str = e() + " [" + this.f30883b + "] <";
        while (this.f30882a.iterator().hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
