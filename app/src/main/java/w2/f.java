package w2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
/* compiled from: PathInterpolatorDonut.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class f implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f31976a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f31977b;

    public f(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = ((int) (length / 0.002f)) + 1;
        this.f31976a = new float[i10];
        this.f31977b = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((i11 * length) / (i10 - 1), fArr, null);
            this.f31976a[i11] = fArr[0];
            this.f31977b[i11] = fArr[1];
        }
    }

    private static Path a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f31976a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f31976a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f31976a;
        float f11 = fArr[length] - fArr[i10];
        if (f11 == 0.0f) {
            return this.f31977b[i10];
        }
        float[] fArr2 = this.f31977b;
        float f12 = fArr2[i10];
        return f12 + (((f10 - fArr[i10]) / f11) * (fArr2[length] - f12));
    }

    public f(float f10, float f11, float f12, float f13) {
        this(a(f10, f11, f12, f13));
    }
}
