package com.appnext.ads.fullscreen;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends Animation {

    /* renamed from: d  reason: collision with root package name */
    private Circle f10031d;

    /* renamed from: e  reason: collision with root package name */
    private float f10032e;

    /* renamed from: f  reason: collision with root package name */
    private float f10033f;

    public a(Circle circle, float f10) {
        setInterpolator(new LinearInterpolator());
        this.f10032e = circle.getAngle();
        this.f10033f = f10;
        this.f10031d = circle;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f10, Transformation transformation) {
        try {
            float f11 = this.f10032e;
            this.f10031d.setAngle(f11 - ((f11 - this.f10033f) * f10));
            this.f10031d.invalidate();
            this.f10031d.requestLayout();
        } catch (Throwable th) {
            com.appnext.base.a.a("CircleAngleAnimation$applyTransformation", th);
        }
    }
}
