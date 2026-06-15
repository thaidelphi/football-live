package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* compiled from: ThemeUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1775a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1776b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1777c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1778d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1779e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1780f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f1781g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    static final int[] f1782h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    static final int[] f1783i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1784j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.j.f24799y0);
        try {
            if (!obtainStyledAttributes.hasValue(e.j.D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList e8 = e(context, i10);
        if (e8 != null && e8.isStateful()) {
            return e8.getColorForState(f1776b, e8.getDefaultColor());
        }
        TypedValue f10 = f();
        context.getTheme().resolveAttribute(16842803, f10, true);
        return d(context, i10, f10.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f1784j;
        iArr[0] = i10;
        z0 u10 = z0.u(context, null, iArr);
        try {
            return u10.b(0, 0);
        } finally {
            u10.w();
        }
    }

    static int d(Context context, int i10, float f10) {
        int c10 = c(context, i10);
        return androidx.core.graphics.a.j(c10, Math.round(Color.alpha(c10) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f1784j;
        iArr[0] = i10;
        z0 u10 = z0.u(context, null, iArr);
        try {
            return u10.c(0);
        } finally {
            u10.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f1775a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
