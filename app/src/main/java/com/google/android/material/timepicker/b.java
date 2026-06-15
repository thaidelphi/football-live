package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.a0;
import d5.f;
import d5.h;
import d5.k;
import u5.g;
import u5.i;
/* compiled from: RadialViewGroup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class b extends ConstraintLayout {

    /* renamed from: x  reason: collision with root package name */
    private final Runnable f14727x;

    /* renamed from: y  reason: collision with root package name */
    private int f14728y;

    /* renamed from: z  reason: collision with root package name */
    private g f14729z;

    /* compiled from: RadialViewGroup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.y();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Drawable u() {
        g gVar = new g();
        this.f14729z = gVar;
        gVar.V(new i(0.5f));
        this.f14729z.X(ColorStateList.valueOf(-1));
        return this.f14729z;
    }

    private static boolean x(View view) {
        return "skip".equals(view.getTag());
    }

    private void z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f14727x);
            handler.post(this.f14727x);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(a0.m());
        }
        z();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f14729z.X(ColorStateList.valueOf(i10));
    }

    public int v() {
        return this.f14728y;
    }

    public void w(int i10) {
        this.f14728y = i10;
        y();
    }

    protected void y() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (x(getChildAt(i11))) {
                i10++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id = childAt.getId();
            int i13 = f.f24037b;
            if (id != i13 && !x(childAt)) {
                dVar.i(childAt.getId(), i13, this.f14728y, f10);
                f10 += 360.0f / (childCount - i10);
            }
        }
        dVar.c(this);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.f24070f, this);
        a0.u0(this, u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.N3, i10, 0);
        this.f14728y = obtainStyledAttributes.getDimensionPixelSize(k.O3, 0);
        this.f14727x = new a();
        obtainStyledAttributes.recycle();
    }
}
