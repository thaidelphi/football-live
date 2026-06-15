package y2;

import android.animation.ValueAnimator;
import android.os.Build;
/* compiled from: FadingCircle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends x2.a {

    /* compiled from: FadingCircle.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends x2.b {
        a() {
            setAlpha(0);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            return new v2.d(this).a(fArr, 0, 0, 255, 0).c(1200L).d(fArr).b();
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        a[] aVarArr = new a[12];
        for (int i10 = 0; i10 < 12; i10++) {
            aVarArr[i10] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i10].t(i10 * 100);
            } else {
                aVarArr[i10].t((i10 * 100) - 1200);
            }
        }
        return aVarArr;
    }
}
