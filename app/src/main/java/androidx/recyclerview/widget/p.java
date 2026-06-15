package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInfoStore.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    final androidx.collection.h<RecyclerView.c0, a> f4136a = new androidx.collection.h<>();

    /* renamed from: b  reason: collision with root package name */
    final androidx.collection.e<RecyclerView.c0> f4137b = new androidx.collection.e<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static androidx.core.util.f<a> f4138d = new androidx.core.util.g(20);

        /* renamed from: a  reason: collision with root package name */
        int f4139a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.m.c f4140b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.m.c f4141c;

        private a() {
        }

        static void a() {
            do {
            } while (f4138d.b() != null);
        }

        static a b() {
            a b10 = f4138d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f4139a = 0;
            aVar.f4140b = null;
            aVar.f4141c = null;
            f4138d.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(RecyclerView.c0 c0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.c0 c0Var);

        void c(RecyclerView.c0 c0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.c0 c0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    private RecyclerView.m.c l(RecyclerView.c0 c0Var, int i10) {
        a m7;
        RecyclerView.m.c cVar;
        int f10 = this.f4136a.f(c0Var);
        if (f10 >= 0 && (m7 = this.f4136a.m(f10)) != null) {
            int i11 = m7.f4139a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                m7.f4139a = i12;
                if (i10 == 4) {
                    cVar = m7.f4140b;
                } else if (i10 == 8) {
                    cVar = m7.f4141c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f4136a.k(f10);
                    a.c(m7);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.c0 c0Var, RecyclerView.m.c cVar) {
        a aVar = this.f4136a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4136a.put(c0Var, aVar);
        }
        aVar.f4139a |= 2;
        aVar.f4140b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.c0 c0Var) {
        a aVar = this.f4136a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4136a.put(c0Var, aVar);
        }
        aVar.f4139a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j10, RecyclerView.c0 c0Var) {
        this.f4137b.k(j10, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.c0 c0Var, RecyclerView.m.c cVar) {
        a aVar = this.f4136a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4136a.put(c0Var, aVar);
        }
        aVar.f4141c = cVar;
        aVar.f4139a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.c0 c0Var, RecyclerView.m.c cVar) {
        a aVar = this.f4136a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4136a.put(c0Var, aVar);
        }
        aVar.f4140b = cVar;
        aVar.f4139a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f4136a.clear();
        this.f4137b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.c0 g(long j10) {
        return this.f4137b.g(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.c0 c0Var) {
        a aVar = this.f4136a.get(c0Var);
        return (aVar == null || (aVar.f4139a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.c0 c0Var) {
        a aVar = this.f4136a.get(c0Var);
        return (aVar == null || (aVar.f4139a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.c0 c0Var) {
        p(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c m(RecyclerView.c0 c0Var) {
        return l(c0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c n(RecyclerView.c0 c0Var) {
        return l(c0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f4136a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 i10 = this.f4136a.i(size);
            a k10 = this.f4136a.k(size);
            int i11 = k10.f4139a;
            if ((i11 & 3) == 3) {
                bVar.b(i10);
            } else if ((i11 & 1) != 0) {
                RecyclerView.m.c cVar = k10.f4140b;
                if (cVar == null) {
                    bVar.b(i10);
                } else {
                    bVar.c(i10, cVar, k10.f4141c);
                }
            } else if ((i11 & 14) == 14) {
                bVar.a(i10, k10.f4140b, k10.f4141c);
            } else if ((i11 & 12) == 12) {
                bVar.d(i10, k10.f4140b, k10.f4141c);
            } else if ((i11 & 4) != 0) {
                bVar.c(i10, k10.f4140b, null);
            } else if ((i11 & 8) != 0) {
                bVar.a(i10, k10.f4140b, k10.f4141c);
            }
            a.c(k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.c0 c0Var) {
        a aVar = this.f4136a.get(c0Var);
        if (aVar == null) {
            return;
        }
        aVar.f4139a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.c0 c0Var) {
        int n10 = this.f4137b.n() - 1;
        while (true) {
            if (n10 < 0) {
                break;
            } else if (c0Var == this.f4137b.o(n10)) {
                this.f4137b.m(n10);
                break;
            } else {
                n10--;
            }
        }
        a remove = this.f4136a.remove(c0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
