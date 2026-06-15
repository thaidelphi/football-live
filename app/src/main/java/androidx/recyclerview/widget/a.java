package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdapterHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private androidx.core.util.f<b> f3981a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f3982b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f3983c;

    /* renamed from: d  reason: collision with root package name */
    final InterfaceC0069a f3984d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f3985e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f3986f;

    /* renamed from: g  reason: collision with root package name */
    final h f3987g;

    /* renamed from: h  reason: collision with root package name */
    private int f3988h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0069a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.c0 f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f3989a;

        /* renamed from: b  reason: collision with root package name */
        int f3990b;

        /* renamed from: c  reason: collision with root package name */
        Object f3991c;

        /* renamed from: d  reason: collision with root package name */
        int f3992d;

        b(int i10, int i11, int i12, Object obj) {
            this.f3989a = i10;
            this.f3990b = i11;
            this.f3992d = i12;
            this.f3991c = obj;
        }

        String a() {
            int i10 = this.f3989a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = this.f3989a;
                if (i10 != bVar.f3989a) {
                    return false;
                }
                if (i10 == 8 && Math.abs(this.f3992d - this.f3990b) == 1 && this.f3992d == bVar.f3990b && this.f3990b == bVar.f3992d) {
                    return true;
                }
                if (this.f3992d == bVar.f3992d && this.f3990b == bVar.f3990b) {
                    Object obj2 = this.f3991c;
                    if (obj2 != null) {
                        if (!obj2.equals(bVar.f3991c)) {
                            return false;
                        }
                    } else if (bVar.f3991c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f3989a * 31) + this.f3990b) * 31) + this.f3992d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + b9.i.f16696d + a() + ",s:" + this.f3990b + "c:" + this.f3992d + ",p:" + this.f3991c + b9.i.f16698e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0069a interfaceC0069a) {
        this(interfaceC0069a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f3990b;
        int i11 = bVar.f3992d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3984d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f3992d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f3990b;
        int i11 = bVar.f3992d + i10;
        int i12 = 0;
        boolean z10 = true;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f3984d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f3991c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(a(4, i13, i12, bVar.f3991c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f3992d) {
            Object obj = bVar.f3991c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (!z10) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f3983c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3983c.get(i11);
            int i12 = bVar.f3989a;
            if (i12 == 8) {
                if (n(bVar.f3992d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3990b;
                int i14 = bVar.f3992d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f3989a;
        if (i11 != 1 && i11 != 8) {
            int z10 = z(bVar.f3990b, i11);
            int i12 = bVar.f3990b;
            int i13 = bVar.f3989a;
            if (i13 == 2) {
                i10 = 0;
            } else if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            } else {
                i10 = 1;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < bVar.f3992d; i15++) {
                int z11 = z(bVar.f3990b + (i10 * i15), bVar.f3989a);
                int i16 = bVar.f3989a;
                if (i16 == 2 ? z11 == z10 : i16 == 4 && z11 == z10 + 1) {
                    i14++;
                } else {
                    b a10 = a(i16, z10, i14, bVar.f3991c);
                    l(a10, i12);
                    b(a10);
                    if (bVar.f3989a == 4) {
                        i12 += i14;
                    }
                    i14 = 1;
                    z10 = z11;
                }
            }
            Object obj = bVar.f3991c;
            b(bVar);
            if (i14 > 0) {
                b a11 = a(bVar.f3989a, z10, i14, obj);
                l(a11, i12);
                b(a11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void v(b bVar) {
        this.f3983c.add(bVar);
        int i10 = bVar.f3989a;
        if (i10 == 1) {
            this.f3984d.g(bVar.f3990b, bVar.f3992d);
        } else if (i10 == 2) {
            this.f3984d.d(bVar.f3990b, bVar.f3992d);
        } else if (i10 == 4) {
            this.f3984d.e(bVar.f3990b, bVar.f3992d, bVar.f3991c);
        } else if (i10 == 8) {
            this.f3984d.a(bVar.f3990b, bVar.f3992d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f3983c.size() - 1; size >= 0; size--) {
            b bVar = this.f3983c.get(size);
            int i14 = bVar.f3989a;
            if (i14 == 8) {
                int i15 = bVar.f3990b;
                int i16 = bVar.f3992d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f3990b = i15 + 1;
                            bVar.f3992d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f3990b = i15 - 1;
                            bVar.f3992d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f3992d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f3992d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f3990b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f3990b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f3990b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f3992d;
                    } else if (i14 == 2) {
                        i10 += bVar.f3992d;
                    }
                } else if (i11 == 1) {
                    bVar.f3990b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f3990b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f3983c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3983c.get(size2);
            if (bVar2.f3989a == 8) {
                int i18 = bVar2.f3992d;
                if (i18 == bVar2.f3990b || i18 < 0) {
                    this.f3983c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f3992d <= 0) {
                this.f3983c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public b a(int i10, int i11, int i12, Object obj) {
        b b10 = this.f3981a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f3989a = i10;
        b10.f3990b = i11;
        b10.f3992d = i12;
        b10.f3991c = obj;
        return b10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void b(b bVar) {
        if (this.f3986f) {
            return;
        }
        bVar.f3991c = null;
        this.f3981a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f3982b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3982b.get(i11);
            int i12 = bVar.f3989a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f3990b;
                    if (i13 <= i10) {
                        int i14 = bVar.f3992d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f3990b;
                    if (i15 == i10) {
                        i10 = bVar.f3992d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f3992d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f3990b <= i10) {
                i10 += bVar.f3992d;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.f3983c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3984d.c(this.f3983c.get(i10));
        }
        x(this.f3983c);
        this.f3988h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f3982b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3982b.get(i10);
            int i11 = bVar.f3989a;
            if (i11 == 1) {
                this.f3984d.c(bVar);
                this.f3984d.g(bVar.f3990b, bVar.f3992d);
            } else if (i11 == 2) {
                this.f3984d.c(bVar);
                this.f3984d.h(bVar.f3990b, bVar.f3992d);
            } else if (i11 == 4) {
                this.f3984d.c(bVar);
                this.f3984d.e(bVar.f3990b, bVar.f3992d, bVar.f3991c);
            } else if (i11 == 8) {
                this.f3984d.c(bVar);
                this.f3984d.a(bVar.f3990b, bVar.f3992d);
            }
            Runnable runnable = this.f3985e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f3982b);
        this.f3988h = 0;
    }

    void l(b bVar, int i10) {
        this.f3984d.b(bVar);
        int i11 = bVar.f3989a;
        if (i11 == 2) {
            this.f3984d.h(i10, bVar.f3992d);
        } else if (i11 == 4) {
            this.f3984d.e(i10, bVar.f3992d, bVar.f3991c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f3983c.size();
        while (i11 < size) {
            b bVar = this.f3983c.get(i11);
            int i12 = bVar.f3989a;
            if (i12 == 8) {
                int i13 = bVar.f3990b;
                if (i13 == i10) {
                    i10 = bVar.f3992d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3992d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3990b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3992d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3992d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f3988h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f3982b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return (this.f3983c.isEmpty() || this.f3982b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3982b.add(a(4, i10, i11, obj));
        this.f3988h |= 4;
        return this.f3982b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3982b.add(a(1, i10, i11, null));
        this.f3988h |= 1;
        return this.f3982b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f3982b.add(a(8, i10, i11, null));
            this.f3988h |= 8;
            return this.f3982b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3982b.add(a(2, i10, i11, null));
        this.f3988h |= 2;
        return this.f3982b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f3987g.b(this.f3982b);
        int size = this.f3982b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3982b.get(i10);
            int i11 = bVar.f3989a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3985e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3982b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        x(this.f3982b);
        x(this.f3983c);
        this.f3988h = 0;
    }

    a(InterfaceC0069a interfaceC0069a, boolean z10) {
        this.f3981a = new androidx.core.util.g(30);
        this.f3982b = new ArrayList<>();
        this.f3983c = new ArrayList<>();
        this.f3988h = 0;
        this.f3984d = interfaceC0069a;
        this.f3986f = z10;
        this.f3987g = new h(this);
    }
}
