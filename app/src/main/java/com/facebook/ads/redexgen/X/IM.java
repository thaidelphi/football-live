package com.facebook.ads.redexgen.X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class IM extends RelativeLayout {
    public static String[] A04 = {"Ym3c0mHmt8I3OfABPCOx9UJ2Q16UuduY", "K4DkQJV", "KARr27mhou56jkSxhuic5Eo8", "doL6IsbVcBXoE3lEPdAb4lspmNlkYQBg", "ZiamaIcezCYLNnFM0CzM2w39hefukKsr", "QAAEQWAERntefxGdirzkY0W9ygCVb18Z", "ecvamyNjiJSZyZ2FY2suHBqgS12IICXX", "BDk4Rb0w5P1ojifCZQT7pVNvZTakDsaU"};
    public static final int A05 = (int) (CP.A02 * 4.0f);
    public int A00;
    public KA A01;
    public WeakReference<IL> A02;
    public final JG A03;

    public IM(C1900k1 c1900k1, JG jg) {
        super(c1900k1);
        this.A00 = 0;
        this.A03 = jg;
        D3.A0H((View) this.A03);
        addView(this.A03.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A00(AnimatorSet animatorSet, final int i10, final boolean z10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.ads.redexgen.X.IJ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IM.this.A04(z10, i10, valueAnimator);
            }
        });
        animatorSet.playTogether(ofFloat);
    }

    public final void A01(AnimatorSet animatorSet, boolean z10) {
        if (z10) {
            this.A03.getView().setClipToOutline(true);
            IK ik = new IK(this);
            this.A03.getView().setOutlineProvider(ik);
            if (this.A01 != null) {
                this.A01.setClipToOutline(true);
                this.A01.setOutlineProvider(ik);
            }
            A00(animatorSet, A05, true);
            return;
        }
        this.A03.getView().setClipToOutline(false);
        this.A03.getView().setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        if (this.A01 != null) {
            this.A01.setClipToOutline(false);
            this.A01.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        A00(animatorSet, this.A00, false);
    }

    public final void A02(AbstractC1418c6 abstractC1418c6) {
        addView(abstractC1418c6, new RelativeLayout.LayoutParams(-1, -1));
        this.A01 = (KA) abstractC1418c6;
    }

    public final void A03(AbstractC1418c6 abstractC1418c6) {
        D3.A0H(abstractC1418c6);
        this.A01 = null;
    }

    public final /* synthetic */ void A04(boolean z10, int i10, ValueAnimator valueAnimator) {
        float curInterpolatedTime = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z10) {
            curInterpolatedTime = 1.0f - curInterpolatedTime;
        }
        float interpolatedTime = i10;
        this.A00 = (int) (interpolatedTime * curInterpolatedTime);
        requestLayout();
    }

    public final boolean A05() {
        return this.A03.A9h();
    }

    public int getCurrentPosition() {
        return this.A03.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A03).layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        if (this.A01 != null) {
            this.A01.layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        int heightSpecSize = this.A03.getVideoWidth() + (this.A00 * 2);
        int widthSpecMode = this.A03.getVideoHeight() + (this.A00 * 2);
        int width = getDefaultSize(heightSpecSize, i10);
        int height = getDefaultSize(widthSpecMode, i11);
        if (heightSpecSize > 0 && widthSpecMode > 0) {
            z10 = true;
            int mode = View.MeasureSpec.getMode(i10);
            int heightSpecMode = View.MeasureSpec.getSize(i10);
            int widthSpecSize = View.MeasureSpec.getMode(i11);
            int mVideoHeight = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824 || widthSpecSize != 1073741824) {
                if (mode == 1073741824) {
                    width = heightSpecMode;
                    height = (width * widthSpecMode) / heightSpecSize;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                    }
                } else if (widthSpecSize == 1073741824) {
                    height = mVideoHeight;
                    width = (height * heightSpecSize) / widthSpecMode;
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                    }
                } else {
                    width = heightSpecSize;
                    height = widthSpecMode;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                        width = (height * heightSpecSize) / widthSpecMode;
                    }
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            } else {
                width = heightSpecMode;
                height = mVideoHeight;
                int mVideoWidth = heightSpecSize * height;
                if (mVideoWidth < width * widthSpecMode) {
                    int width2 = height * heightSpecSize;
                    String[] strArr = A04;
                    String str = strArr[2];
                    String str2 = strArr[1];
                    int mVideoWidth2 = str.length();
                    if (mVideoWidth2 == str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[5] = "U4zbj2Wm0uAraatZAyMG0dkAaN2sbGyV";
                    strArr2[7] = "NaQeXa1xIolrwrGsNa3PifVvRhjqFXGF";
                    width = width2 / widthSpecMode;
                } else {
                    int mVideoWidth3 = heightSpecSize * height;
                    if (mVideoWidth3 > width * widthSpecMode) {
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            }
        }
        setMeasuredDimension(width, height);
        if (!z10 || this.A02 == null) {
            return;
        }
        WeakReference<IL> weakReference = this.A02;
        int mVideoWidth4 = A04[6].charAt(8);
        if (mVideoWidth4 != 105) {
            throw new RuntimeException();
        }
        A04[3] = "u6I59svdNPk3v5MrivI4HijRJO25VXOb";
        if (weakReference.get() != null) {
            this.A02.get().AFb();
        }
    }

    public void setViewImplInflationListener(IL il) {
        this.A02 = new WeakReference<>(il);
    }
}
