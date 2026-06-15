package p2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import q2.b;
/* compiled from: ImageViewTarget.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e<Z> extends i<ImageView, Z> implements b.a {

    /* renamed from: h  reason: collision with root package name */
    private Animatable f29538h;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void m(Z z10) {
        if (z10 instanceof Animatable) {
            Animatable animatable = (Animatable) z10;
            this.f29538h = animatable;
            animatable.start();
            return;
        }
        this.f29538h = null;
    }

    private void p(Z z10) {
        o(z10);
        m(z10);
    }

    @Override // p2.h
    public void a(Z z10, q2.b<? super Z> bVar) {
        if (bVar != null && bVar.a(z10, this)) {
            m(z10);
        } else {
            p(z10);
        }
    }

    @Override // p2.i, p2.a, p2.h
    public void d(Drawable drawable) {
        super.d(drawable);
        p(null);
        n(drawable);
    }

    @Override // p2.i, p2.a, p2.h
    public void f(Drawable drawable) {
        super.f(drawable);
        Animatable animatable = this.f29538h;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    @Override // p2.a, p2.h
    public void h(Drawable drawable) {
        super.h(drawable);
        p(null);
        n(drawable);
    }

    public void n(Drawable drawable) {
        ((ImageView) this.f29541a).setImageDrawable(drawable);
    }

    protected abstract void o(Z z10);

    @Override // p2.a, l2.m
    public void onStart() {
        Animatable animatable = this.f29538h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p2.a, l2.m
    public void onStop() {
        Animatable animatable = this.f29538h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
