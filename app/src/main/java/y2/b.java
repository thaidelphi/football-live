package y2;

import android.animation.ValueAnimator;
import android.os.Build;
/* compiled from: Circle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends x2.a {

    /* compiled from: Circle.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends x2.b {
        a() {
            C(0.0f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            v2.d dVar = new v2.d(this);
            Float valueOf = Float.valueOf(0.0f);
            return dVar.l(fArr, valueOf, Float.valueOf(1.0f), valueOf).c(1200L).d(fArr).b();
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
