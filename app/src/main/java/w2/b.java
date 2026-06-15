package w2;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
/* compiled from: KeyFrameInterpolator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private TimeInterpolator f31974a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f31975b;

    public b(TimeInterpolator timeInterpolator, float... fArr) {
        this.f31974a = timeInterpolator;
        this.f31975b = fArr;
    }

    public static b a(float... fArr) {
        b bVar = new b(a.a(), new float[0]);
        bVar.c(fArr);
        return bVar;
    }

    public static b b(float f10, float f11, float f12, float f13, float... fArr) {
        b bVar = new b(c.a(f10, f11, f12, f13), new float[0]);
        bVar.c(fArr);
        return bVar;
    }

    public void c(float... fArr) {
        this.f31975b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (this.f31975b.length > 1) {
            int i10 = 0;
            while (true) {
                float[] fArr = this.f31975b;
                if (i10 >= fArr.length - 1) {
                    break;
                }
                float f11 = fArr[i10];
                i10++;
                float f12 = fArr[i10];
                float f13 = f12 - f11;
                if (f10 >= f11 && f10 <= f12) {
                    return f11 + (this.f31974a.getInterpolation((f10 - f11) / f13) * f13);
                }
            }
        }
        return this.f31974a.getInterpolation(f10);
    }
}
