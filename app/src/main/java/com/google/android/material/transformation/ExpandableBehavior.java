package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import java.util.List;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    private int f14731a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f14732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n5.a f14734c;

        a(View view, int i10, n5.a aVar) {
            this.f14732a = view;
            this.f14733b = i10;
            this.f14734c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f14732a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f14731a == this.f14733b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                n5.a aVar = this.f14734c;
                expandableBehavior.H((View) aVar, this.f14732a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f14731a = 0;
    }

    private boolean F(boolean z10) {
        if (!z10) {
            return this.f14731a == 1;
        }
        int i10 = this.f14731a;
        return i10 == 0 || i10 == 2;
    }

    protected n5.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r10 = coordinatorLayout.r(view);
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = r10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (n5.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        n5.a aVar = (n5.a) view2;
        if (F(aVar.a())) {
            this.f14731a = aVar.a() ? 1 : 2;
            return H((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        n5.a G;
        if (a0.U(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i11 = G.a() ? 1 : 2;
        this.f14731a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14731a = 0;
    }
}
