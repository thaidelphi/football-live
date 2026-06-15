package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a0;
import com.google.android.material.internal.n;
import d5.j;
import u5.g;
import u5.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final int W = j.f24118t;

    /* renamed from: a0  reason: collision with root package name */
    private static final ImageView.ScaleType[] f13861a0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer R;
    private boolean S;
    private boolean T;
    private ImageView.ScaleType U;
    private Boolean V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.I);
    }

    private Pair<Integer, Integer> R(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void S(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.N(context);
            gVar.W(a0.y(this));
            a0.u0(this, gVar);
        }
    }

    private void T(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void U() {
        if (this.S || this.T) {
            TextView e8 = n.e(this);
            TextView c10 = n.c(this);
            if (e8 == null && c10 == null) {
                return;
            }
            Pair<Integer, Integer> R = R(e8, c10);
            if (this.S && e8 != null) {
                T(e8, R);
            }
            if (!this.T || c10 == null) {
                return;
            }
            T(c10, R);
        }
    }

    private Drawable V(Drawable drawable) {
        if (drawable == null || this.R == null) {
            return drawable;
        }
        Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
        androidx.core.graphics.drawable.a.n(r10, this.R.intValue());
        return r10;
    }

    private void W() {
        ImageView b10 = n.b(this);
        if (b10 != null) {
            Boolean bool = this.V;
            if (bool != null) {
                b10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.U;
            if (scaleType != null) {
                b10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.U;
    }

    public Integer getNavigationIconTint() {
        return this.R;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
        W();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.V;
        if (bool == null || bool.booleanValue() != z10) {
            this.V = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.U != scaleType) {
            this.U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(V(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.R = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.W
            android.content.Context r8 = v5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = d5.k.f24243p3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r10 = d5.k.f24267s3
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L29
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = d5.k.f24283u3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.S = r10
            int r10 = d5.k.f24275t3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.T = r10
            int r10 = d5.k.f24259r3
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L4a
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f13861a0
            int r1 = r0.length
            if (r10 >= r1) goto L4a
            r10 = r0[r10]
            r7.U = r10
        L4a:
            int r10 = d5.k.f24251q3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L5c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.V = r10
        L5c:
            r9.recycle()
            r7.S(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
