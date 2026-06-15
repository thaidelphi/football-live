package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChildHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final InterfaceC0070b f3993a;

    /* renamed from: b  reason: collision with root package name */
    final a f3994b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f3995c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f3996a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f3997b;

        a() {
        }

        private void c() {
            if (this.f3997b == null) {
                this.f3997b = new a();
            }
        }

        void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f3997b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f3996a &= ~(1 << i10);
        }

        int b(int i10) {
            a aVar = this.f3997b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f3996a);
                }
                return Long.bitCount(this.f3996a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f3996a & ((1 << i10) - 1));
            } else {
                return aVar.b(i10 - 64) + Long.bitCount(this.f3996a);
            }
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3996a & (1 << i10)) != 0;
            }
            c();
            return this.f3997b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3997b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3996a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3996a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3997b != null) {
                c();
                this.f3997b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3997b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3996a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3996a = j12;
            long j13 = j10 - 1;
            this.f3996a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3997b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3997b.f(0);
            }
            return z10;
        }

        void g() {
            this.f3996a = 0L;
            a aVar = this.f3997b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f3997b.h(i10 - 64);
                return;
            }
            this.f3996a |= 1 << i10;
        }

        public String toString() {
            if (this.f3997b == null) {
                return Long.toBinaryString(this.f3996a);
            }
            return this.f3997b.toString() + "xx" + Long.toBinaryString(this.f3996a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0070b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        RecyclerView.c0 d(View view);

        void e(int i10);

        void f();

        int g(View view);

        void h(View view);

        void i(int i10);

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(InterfaceC0070b interfaceC0070b) {
        this.f3993a = interfaceC0070b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f3993a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.f3994b.b(i11));
            if (b10 == 0) {
                while (this.f3994b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private void l(View view) {
        this.f3995c.add(view);
        this.f3993a.b(view);
    }

    private boolean t(View view) {
        if (this.f3995c.remove(view)) {
            this.f3993a.h(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i10, boolean z10) {
        int h10;
        if (i10 < 0) {
            h10 = this.f3993a.c();
        } else {
            h10 = h(i10);
        }
        this.f3994b.e(h10, z10);
        if (z10) {
            l(view);
        }
        this.f3993a.addView(view, h10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int h10;
        if (i10 < 0) {
            h10 = this.f3993a.c();
        } else {
            h10 = h(i10);
        }
        this.f3994b.e(h10, z10);
        if (z10) {
            l(view);
        }
        this.f3993a.j(view, h10, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i10) {
        int h10 = h(i10);
        this.f3994b.f(h10);
        this.f3993a.e(h10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View e(int i10) {
        int size = this.f3995c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f3995c.get(i11);
            RecyclerView.c0 d10 = this.f3993a.d(view);
            if (d10.getLayoutPosition() == i10 && !d10.isInvalid() && !d10.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f3993a.a(h(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f3993a.c() - this.f3995c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View i(int i10) {
        return this.f3993a.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f3993a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(View view) {
        int g10 = this.f3993a.g(view);
        if (g10 >= 0) {
            this.f3994b.h(g10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(View view) {
        int g10 = this.f3993a.g(view);
        if (g10 == -1 || this.f3994b.d(g10)) {
            return -1;
        }
        return g10 - this.f3994b.b(g10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f3995c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.f3994b.g();
        for (int size = this.f3995c.size() - 1; size >= 0; size--) {
            this.f3993a.h(this.f3995c.get(size));
            this.f3995c.remove(size);
        }
        this.f3993a.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(View view) {
        int g10 = this.f3993a.g(view);
        if (g10 < 0) {
            return;
        }
        if (this.f3994b.f(g10)) {
            t(view);
        }
        this.f3993a.i(g10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i10) {
        int h10 = h(i10);
        View a10 = this.f3993a.a(h10);
        if (a10 == null) {
            return;
        }
        if (this.f3994b.f(h10)) {
            t(a10);
        }
        this.f3993a.i(h10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(View view) {
        int g10 = this.f3993a.g(view);
        if (g10 == -1) {
            t(view);
            return true;
        } else if (this.f3994b.d(g10)) {
            this.f3994b.f(g10);
            t(view);
            this.f3993a.i(g10);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(View view) {
        int g10 = this.f3993a.g(view);
        if (g10 >= 0) {
            if (this.f3994b.d(g10)) {
                this.f3994b.a(g10);
                t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f3994b.toString() + ", hidden list:" + this.f3995c.size();
    }
}
