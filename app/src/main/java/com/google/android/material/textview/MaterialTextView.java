package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.c0;
import d5.k;
import r5.b;
import r5.c;
import v5.a;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class MaterialTextView extends c0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void f(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f24171g3);
        int i11 = i(getContext(), obtainStyledAttributes, k.f24187i3, k.f24195j3);
        obtainStyledAttributes.recycle();
        if (i11 >= 0) {
            setLineHeight(i11);
        }
    }

    private static boolean g(Context context) {
        return b.b(context, d5.b.F, true);
    }

    private static int h(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f24203k3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(k.f24211l3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int i(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f24203k3, i10, i11);
        int i12 = i(context, obtainStyledAttributes, k.f24219m3, k.f24227n3);
        obtainStyledAttributes.recycle();
        return i12 != -1;
    }

    @Override // androidx.appcompat.widget.c0, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (g(context)) {
            f(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        int h10;
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (j(context2, theme, attributeSet, i10, i11) || (h10 = h(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            f(theme, h10);
        }
    }
}
