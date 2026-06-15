package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.facebook.ads.redexgen.X.3s  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC04963s extends FrameLayout {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04;
    public final Rect A05;
    public final InterfaceC04973t A06;
    public static String[] A07 = {"ShNBvS5", "b2z1l7evnHkZXpFh4jUAU", "JfQekQfzdw1mJ2RkSzlEvaL1jVLq96XT", "0M9zDLqBQAVDpkbZHtwaURqwF1mV2f1S", "jQ6MUrNiHIuV2Q80zD0eWZ3NfiJ07L6A", "0up6ixfDqbrZOotDwCZ4gMtZBiUGrTem", "xF0da7GYt9A5Qra0MND7i27I5BG4MHvn", "fGPiNZIH9FIGNZUMCtCVq24hO8AJIHug"};
    public static final int[] A0B = {16842801};
    public static final float A08 = Resources.getSystem().getDisplayMetrics().density;
    public static final int A09 = (int) (A08 * 1.0f);
    public static final InterfaceC04983u A0A = new C1989lW();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AbstractC04963s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A04 = new Rect();
        this.A05 = new Rect();
        this.A06 = new C1991lY(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(A0B);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        Color.colorToHSV(color, new float[3]);
        ColorStateList valueOf = ColorStateList.valueOf(-328966);
        this.A02 = false;
        this.A03 = true;
        this.A04.left = 0;
        this.A04.top = 0;
        this.A04.right = 0;
        this.A04.bottom = 0;
        float f10 = 10.0f > 50.0f ? 10.0f : 50.0f;
        this.A01 = 0;
        this.A00 = 0;
        A0A.AA6(this.A06, context, valueOf, 10.0f, 10.0f, f10);
    }

    static {
        A0A.AA4();
    }

    public AbstractC04963s(Context context) {
        this(context, null);
    }

    public AbstractC04963s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorStateList getCardBackgroundColor() {
        return A0A.A6r(this.A06);
    }

    public float getCardElevation() {
        return A0A.A7l(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A0A.A8I(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A0A.A8h(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!(A0A instanceof C1989lW)) {
            int mode = View.MeasureSpec.getMode(i10);
            switch (mode) {
                case RecyclerView.UNDEFINED_DURATION /* -2147483648 */:
                case 1073741824:
                    int minWidth = (int) Math.ceil(A0A.A8O(this.A06));
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.max(minWidth, View.MeasureSpec.getSize(i10)), mode);
                    break;
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (A07[1].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[4] = "ezVHALe6egolV0dGNwTkgEwTmiIckZEU";
            strArr[5] = "9kVtZpYuS1B6eNaF5MtLQpOmcikxmxeD";
            switch (mode2) {
                case RecyclerView.UNDEFINED_DURATION /* -2147483648 */:
                case 1073741824:
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(A0A.A8N(this.A06)), View.MeasureSpec.getSize(i11)), mode2);
                    break;
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        A0A.AIP(this.A06, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A0A.AIP(this.A06, colorStateList);
    }

    public void setCardElevation(float f10) {
        A0A.AIV(this.A06, f10);
    }

    public void setMaxCardElevation(float f10) {
        A0A.AId(this.A06, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.A00 = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.A01 = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.A03) {
            this.A03 = z10;
            A0A.AEe(this.A06);
        }
    }

    public void setRadius(float f10) {
        A0A.AIp(this.A06, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.A02 != z10) {
            this.A02 = z10;
            A0A.ACf(this.A06);
        }
    }
}
