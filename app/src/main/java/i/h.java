package i;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f26415c;

    /* renamed from: d  reason: collision with root package name */
    h0 f26416d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26417e;

    /* renamed from: b  reason: collision with root package name */
    private long f26414b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f26418f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<g0> f26413a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends i0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f26419a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f26420b = 0;

        a() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            int i10 = this.f26420b + 1;
            this.f26420b = i10;
            if (i10 == h.this.f26413a.size()) {
                h0 h0Var = h.this.f26416d;
                if (h0Var != null) {
                    h0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void c(View view) {
            if (this.f26419a) {
                return;
            }
            this.f26419a = true;
            h0 h0Var = h.this.f26416d;
            if (h0Var != null) {
                h0Var.c(null);
            }
        }

        void d() {
            this.f26420b = 0;
            this.f26419a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f26417e) {
            Iterator<g0> it = this.f26413a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f26417e = false;
        }
    }

    void b() {
        this.f26417e = false;
    }

    public h c(g0 g0Var) {
        if (!this.f26417e) {
            this.f26413a.add(g0Var);
        }
        return this;
    }

    public h d(g0 g0Var, g0 g0Var2) {
        this.f26413a.add(g0Var);
        g0Var2.j(g0Var.d());
        this.f26413a.add(g0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f26417e) {
            this.f26414b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f26417e) {
            this.f26415c = interpolator;
        }
        return this;
    }

    public h g(h0 h0Var) {
        if (!this.f26417e) {
            this.f26416d = h0Var;
        }
        return this;
    }

    public void h() {
        if (this.f26417e) {
            return;
        }
        Iterator<g0> it = this.f26413a.iterator();
        while (it.hasNext()) {
            g0 next = it.next();
            long j10 = this.f26414b;
            if (j10 >= 0) {
                next.f(j10);
            }
            Interpolator interpolator = this.f26415c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f26416d != null) {
                next.h(this.f26418f);
            }
            next.l();
        }
        this.f26417e = true;
    }
}
