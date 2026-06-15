package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: AppCompatImageHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1710a;

    /* renamed from: b  reason: collision with root package name */
    private x0 f1711b;

    /* renamed from: c  reason: collision with root package name */
    private x0 f1712c;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1713d;

    /* renamed from: e  reason: collision with root package name */
    private int f1714e = 0;

    public q(ImageView imageView) {
        this.f1710a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1713d == null) {
            this.f1713d = new x0();
        }
        x0 x0Var = this.f1713d;
        x0Var.a();
        ColorStateList a10 = androidx.core.widget.f.a(this.f1710a);
        if (a10 != null) {
            x0Var.f1797d = true;
            x0Var.f1794a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.f.b(this.f1710a);
        if (b10 != null) {
            x0Var.f1796c = true;
            x0Var.f1795b = b10;
        }
        if (x0Var.f1797d || x0Var.f1796c) {
            k.i(drawable, x0Var, this.f1710a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1711b != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1710a.getDrawable() != null) {
            this.f1710a.getDrawable().setLevel(this.f1714e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1710a.getDrawable();
        if (drawable != null) {
            h0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            x0 x0Var = this.f1712c;
            if (x0Var != null) {
                k.i(drawable, x0Var, this.f1710a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1711b;
            if (x0Var2 != null) {
                k.i(drawable, x0Var2, this.f1710a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList d() {
        x0 x0Var = this.f1712c;
        if (x0Var != null) {
            return x0Var.f1794a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        x0 x0Var = this.f1712c;
        if (x0Var != null) {
            return x0Var.f1795b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1710a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        Context context = this.f1710a.getContext();
        int[] iArr = e.j.P;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1710a;
        androidx.core.view.a0.o0(imageView, imageView.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f1710a.getDrawable();
            if (drawable == null && (n10 = v10.n(e.j.Q, -1)) != -1 && (drawable = f.a.b(this.f1710a.getContext(), n10)) != null) {
                this.f1710a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h0.b(drawable);
            }
            int i11 = e.j.R;
            if (v10.s(i11)) {
                androidx.core.widget.f.c(this.f1710a, v10.c(i11));
            }
            int i12 = e.j.S;
            if (v10.s(i12)) {
                androidx.core.widget.f.d(this.f1710a, h0.d(v10.k(i12, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f1714e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = f.a.b(this.f1710a.getContext(), i10);
            if (b10 != null) {
                h0.b(b10);
            }
            this.f1710a.setImageDrawable(b10);
        } else {
            this.f1710a.setImageDrawable(null);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f1712c == null) {
            this.f1712c = new x0();
        }
        x0 x0Var = this.f1712c;
        x0Var.f1794a = colorStateList;
        x0Var.f1797d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f1712c == null) {
            this.f1712c = new x0();
        }
        x0 x0Var = this.f1712c;
        x0Var.f1795b = mode;
        x0Var.f1796c = true;
        c();
    }
}
