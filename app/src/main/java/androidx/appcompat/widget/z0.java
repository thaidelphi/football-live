package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
/* compiled from: TintTypedArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1806a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1807b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1808c;

    private z0(Context context, TypedArray typedArray) {
        this.f1806a = context;
        this.f1807b = typedArray;
    }

    public static z0 t(Context context, int i10, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static z0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1807b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1807b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f1807b.hasValue(i10) || (resourceId = this.f1807b.getResourceId(i10, 0)) == 0 || (a10 = f.a.a(this.f1806a, resourceId)) == null) ? this.f1807b.getColorStateList(i10) : a10;
    }

    public float d(int i10, float f10) {
        return this.f1807b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1807b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1807b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (this.f1807b.hasValue(i10) && (resourceId = this.f1807b.getResourceId(i10, 0)) != 0) {
            return f.a.b(this.f1806a, resourceId);
        }
        return this.f1807b.getDrawable(i10);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1807b.hasValue(i10) || (resourceId = this.f1807b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f1806a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f1807b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.f fVar) {
        int resourceId = this.f1807b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1808c == null) {
            this.f1808c = new TypedValue();
        }
        return androidx.core.content.res.h.h(this.f1806a, resourceId, this.f1808c, i11, fVar);
    }

    public int k(int i10, int i11) {
        return this.f1807b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1807b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1807b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1807b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1807b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1807b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1807b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1807b;
    }

    public boolean s(int i10) {
        return this.f1807b.hasValue(i10);
    }

    public void w() {
        this.f1807b.recycle();
    }
}
