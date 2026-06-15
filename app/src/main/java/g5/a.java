package g5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.d;
import com.google.android.material.internal.o;
import d5.b;
import d5.j;
/* compiled from: MaterialCheckBox.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends g {

    /* renamed from: h  reason: collision with root package name */
    private static final int f25792h = j.f24111m;

    /* renamed from: i  reason: collision with root package name */
    private static final int[][] f25793i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f25794e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25795f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25796g;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f23973c);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f25794e == null) {
            int[][] iArr = f25793i;
            int[] iArr2 = new int[iArr.length];
            int d10 = j5.a.d(this, b.f23976f);
            int d11 = j5.a.d(this, b.f23981k);
            int d12 = j5.a.d(this, b.f23978h);
            iArr2[0] = j5.a.h(d11, d10, 1.0f);
            iArr2[1] = j5.a.h(d11, d12, 0.54f);
            iArr2[2] = j5.a.h(d11, d12, 0.38f);
            iArr2[3] = j5.a.h(d11, d12, 0.38f);
            this.f25794e = new ColorStateList(iArr, iArr2);
        }
        return this.f25794e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25795f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a10;
        if (this.f25796g && TextUtils.isEmpty(getText()) && (a10 = d.a(this)) != null) {
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (o.e(this) ? -1 : 1);
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f25796g = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f25795f = z10;
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
            int r4 = g5.a.f25792h
            android.content.Context r8 = v5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = d5.k.V2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r10 = d5.k.W2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = r5.c.a(r8, r9, r10)
            androidx.core.widget.d.c(r7, r8)
        L28:
            int r8 = d5.k.Y2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f25795f = r8
            int r8 = d5.k.X2
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f25796g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
