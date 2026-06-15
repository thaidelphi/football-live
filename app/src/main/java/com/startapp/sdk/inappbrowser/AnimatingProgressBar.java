package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: c  reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f23313c = new AccelerateDecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f23314a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23315b;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AnimatingProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23315b = false;
        this.f23315b = Build.VERSION.SDK_INT >= 11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f23314a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i10) {
        if (!this.f23315b) {
            super.setProgress(i10);
            return;
        }
        ValueAnimator valueAnimator = this.f23314a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i10) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i10);
            this.f23314a = ofInt;
            ofInt.setInterpolator(f23313c);
            this.f23314a.addUpdateListener(new a());
        }
        this.f23314a.setIntValues(getProgress(), i10);
        this.f23314a.start();
    }

    public final void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f23314a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
