package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* compiled from: OneShotPreDrawListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f2955a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f2956b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f2957c;

    private x(View view, Runnable runnable) {
        this.f2955a = view;
        this.f2956b = view.getViewTreeObserver();
        this.f2957c = runnable;
    }

    public static x a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        return xVar;
    }

    public void b() {
        if (this.f2956b.isAlive()) {
            this.f2956b.removeOnPreDrawListener(this);
        } else {
            this.f2955a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2955a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2957c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2956b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
