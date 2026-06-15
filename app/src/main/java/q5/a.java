package q5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.v;
import androidx.core.widget.d;
import d5.b;
import d5.j;
/* compiled from: MaterialRadioButton.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends v {

    /* renamed from: g  reason: collision with root package name */
    private static final int f30140g = j.f24112n;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f30141h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f30142e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30143f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f23995y);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f30142e == null) {
            int d10 = j5.a.d(this, b.f23976f);
            int d11 = j5.a.d(this, b.f23978h);
            int d12 = j5.a.d(this, b.f23981k);
            int[][] iArr = f30141h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = j5.a.h(d12, d10, 1.0f);
            iArr2[1] = j5.a.h(d12, d11, 0.54f);
            iArr2[2] = j5.a.h(d12, d11, 0.38f);
            iArr2[3] = j5.a.h(d12, d11, 0.38f);
            this.f30142e = new ColorStateList(iArr, iArr2);
        }
        return this.f30142e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30143f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f30143f = z10;
        if (z10) {
            d.c(this, getMaterialThemeColorsTintList());
        } else {
            d.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = q5.a.f30140g
            android.content.Context r8 = v5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = d5.k.f24123a3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r10 = d5.k.f24131b3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = r5.c.a(r8, r9, r10)
            androidx.core.widget.d.c(r7, r8)
        L28:
            int r8 = d5.k.f24139c3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f30143f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
