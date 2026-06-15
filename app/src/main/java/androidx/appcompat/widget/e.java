package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1555a;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1558d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f1559e;

    /* renamed from: f  reason: collision with root package name */
    private x0 f1560f;

    /* renamed from: c  reason: collision with root package name */
    private int f1557c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final k f1556b = k.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f1555a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1560f == null) {
            this.f1560f = new x0();
        }
        x0 x0Var = this.f1560f;
        x0Var.a();
        ColorStateList u10 = androidx.core.view.a0.u(this.f1555a);
        if (u10 != null) {
            x0Var.f1797d = true;
            x0Var.f1794a = u10;
        }
        PorterDuff.Mode v10 = androidx.core.view.a0.v(this.f1555a);
        if (v10 != null) {
            x0Var.f1796c = true;
            x0Var.f1795b = v10;
        }
        if (x0Var.f1797d || x0Var.f1796c) {
            k.i(drawable, x0Var, this.f1555a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1558d != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1555a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            x0 x0Var = this.f1559e;
            if (x0Var != null) {
                k.i(background, x0Var, this.f1555a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1558d;
            if (x0Var2 != null) {
                k.i(background, x0Var2, this.f1555a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        x0 x0Var = this.f1559e;
        if (x0Var != null) {
            return x0Var.f1794a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        x0 x0Var = this.f1559e;
        if (x0Var != null) {
            return x0Var.f1795b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1555a.getContext();
        int[] iArr = e.j.f24802y3;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1555a;
        androidx.core.view.a0.o0(view, view.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            int i11 = e.j.f24807z3;
            if (v10.s(i11)) {
                this.f1557c = v10.n(i11, -1);
                ColorStateList f10 = this.f1556b.f(this.f1555a.getContext(), this.f1557c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = e.j.A3;
            if (v10.s(i12)) {
                androidx.core.view.a0.v0(this.f1555a, v10.c(i12));
            }
            int i13 = e.j.B3;
            if (v10.s(i13)) {
                androidx.core.view.a0.w0(this.f1555a, h0.d(v10.k(i13, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1557c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10) {
        this.f1557c = i10;
        k kVar = this.f1556b;
        h(kVar != null ? kVar.f(this.f1555a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1558d == null) {
                this.f1558d = new x0();
            }
            x0 x0Var = this.f1558d;
            x0Var.f1794a = colorStateList;
            x0Var.f1797d = true;
        } else {
            this.f1558d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1559e == null) {
            this.f1559e = new x0();
        }
        x0 x0Var = this.f1559e;
        x0Var.f1794a = colorStateList;
        x0Var.f1797d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1559e == null) {
            this.f1559e = new x0();
        }
        x0 x0Var = this.f1559e;
        x0Var.f1795b = mode;
        x0Var.f1796c = true;
        b();
    }
}
