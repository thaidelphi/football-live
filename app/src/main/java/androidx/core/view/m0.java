package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f2941a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f2942a;

        /* renamed from: b  reason: collision with root package name */
        private final View f2943b;

        a(Window window, View view) {
            this.f2942a = window;
            this.f2943b = view;
        }

        protected void c(int i10) {
            View decorView = this.f2942a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            this.f2942a.addFlags(i10);
        }

        protected void e(int i10) {
            View decorView = this.f2942a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f2942a.clearFlags(i10);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.m0.e
        public void b(boolean z10) {
            if (z10) {
                f(67108864);
                d(RecyclerView.UNDEFINED_DURATION);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.m0.e
        public void a(boolean z10) {
            if (z10) {
                f(134217728);
                d(RecyclerView.UNDEFINED_DURATION);
                c(16);
                return;
            }
            e(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
        }
    }

    public m0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2941a = new d(window, this);
        } else if (i10 >= 26) {
            this.f2941a = new c(window, view);
        } else if (i10 >= 23) {
            this.f2941a = new b(window, view);
        } else if (i10 >= 20) {
            this.f2941a = new a(window, view);
        } else {
            this.f2941a = new e();
        }
    }

    public void a(boolean z10) {
        this.f2941a.a(z10);
    }

    public void b(boolean z10) {
        this.f2941a.b(z10);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final m0 f2944a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f2945b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.collection.h<Object, WindowInsetsController.OnControllableInsetsChangedListener> f2946c;

        /* renamed from: d  reason: collision with root package name */
        protected Window f2947d;

        d(Window window, m0 m0Var) {
            this(window.getInsetsController(), m0Var);
            this.f2947d = window;
        }

        @Override // androidx.core.view.m0.e
        public void a(boolean z10) {
            if (z10) {
                if (this.f2947d != null) {
                    c(16);
                }
                this.f2945b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f2947d != null) {
                d(16);
            }
            this.f2945b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.m0.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f2947d != null) {
                    c(8192);
                }
                this.f2945b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f2947d != null) {
                d(8192);
            }
            this.f2945b.setSystemBarsAppearance(0, 8);
        }

        protected void c(int i10) {
            View decorView = this.f2947d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            View decorView = this.f2947d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, m0 m0Var) {
            this.f2946c = new androidx.collection.h<>();
            this.f2945b = windowInsetsController;
            this.f2944a = m0Var;
        }
    }
}
