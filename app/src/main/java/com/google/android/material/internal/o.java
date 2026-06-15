package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.u;
/* compiled from: ViewUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class o {

    /* compiled from: ViewUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f14459a;

        a(View view) {
            this.f14459a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f14459a.getContext().getSystemService("input_method")).showSoftInput(this.f14459a, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f14461b;

        b(d dVar, e eVar) {
            this.f14460a = dVar;
            this.f14461b = eVar;
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            return this.f14460a.a(view, l0Var, new e(this.f14461b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            a0.n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface d {
        l0 a(View view, l0 l0Var, e eVar);
    }

    public static void a(View view, d dVar) {
        a0.C0(view, new b(dVar, new e(a0.J(view), view.getPaddingTop(), a0.I(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += a0.y((View) parent);
        }
        return f10;
    }

    public static boolean e(View view) {
        return a0.E(view) == 1;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void g(View view) {
        if (a0.T(view)) {
            a0.n0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f14462a;

        /* renamed from: b  reason: collision with root package name */
        public int f14463b;

        /* renamed from: c  reason: collision with root package name */
        public int f14464c;

        /* renamed from: d  reason: collision with root package name */
        public int f14465d;

        public e(int i10, int i11, int i12, int i13) {
            this.f14462a = i10;
            this.f14463b = i11;
            this.f14464c = i12;
            this.f14465d = i13;
        }

        public e(e eVar) {
            this.f14462a = eVar.f14462a;
            this.f14463b = eVar.f14463b;
            this.f14464c = eVar.f14464c;
            this.f14465d = eVar.f14465d;
        }
    }
}
