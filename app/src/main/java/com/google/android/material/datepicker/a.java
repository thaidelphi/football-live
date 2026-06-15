package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.a0;
/* compiled from: CalendarItemStyle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f14145a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f14146b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f14147c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f14148d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14149e;

    /* renamed from: f  reason: collision with root package name */
    private final u5.k f14150f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, u5.k kVar, Rect rect) {
        androidx.core.util.i.c(rect.left);
        androidx.core.util.i.c(rect.top);
        androidx.core.util.i.c(rect.right);
        androidx.core.util.i.c(rect.bottom);
        this.f14145a = rect;
        this.f14146b = colorStateList2;
        this.f14147c = colorStateList;
        this.f14148d = colorStateList3;
        this.f14149e = i10;
        this.f14150f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context, int i10) {
        androidx.core.util.i.a(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, d5.k.J2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(d5.k.K2, 0), obtainStyledAttributes.getDimensionPixelOffset(d5.k.M2, 0), obtainStyledAttributes.getDimensionPixelOffset(d5.k.L2, 0), obtainStyledAttributes.getDimensionPixelOffset(d5.k.N2, 0));
        ColorStateList a10 = r5.c.a(context, obtainStyledAttributes, d5.k.O2);
        ColorStateList a11 = r5.c.a(context, obtainStyledAttributes, d5.k.T2);
        ColorStateList a12 = r5.c.a(context, obtainStyledAttributes, d5.k.R2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d5.k.S2, 0);
        u5.k m7 = u5.k.b(context, obtainStyledAttributes.getResourceId(d5.k.P2, 0), obtainStyledAttributes.getResourceId(d5.k.Q2, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, m7, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f14145a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f14145a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView) {
        u5.g gVar = new u5.g();
        u5.g gVar2 = new u5.g();
        gVar.setShapeAppearanceModel(this.f14150f);
        gVar2.setShapeAppearanceModel(this.f14150f);
        gVar.X(this.f14147c);
        gVar.d0(this.f14149e, this.f14148d);
        textView.setTextColor(this.f14146b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f14146b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f14145a;
        a0.u0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
