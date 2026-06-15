package h0;

import android.view.animation.Interpolator;
/* compiled from: LookupTableInterpolator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f26174a;

    /* renamed from: b  reason: collision with root package name */
    private final float f26175b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(float[] fArr) {
        this.f26174a = fArr;
        this.f26175b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f26174a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f26175b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f26174a;
        return fArr2[min] + (f12 * (fArr2[min + 1] - fArr2[min]));
    }
}
