package y2;

import android.animation.ValueAnimator;
import android.os.Build;
/* compiled from: DoubleBounce.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends x2.g {

    /* compiled from: DoubleBounce.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends x2.b {
        a() {
            setAlpha(153);
            C(0.0f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            v2.d dVar = new v2.d(this);
            Float valueOf = Float.valueOf(0.0f);
            return dVar.l(fArr, valueOf, Float.valueOf(1.0f), valueOf).c(2000L).d(fArr).b();
        }
    }

    @Override // x2.g
    public void N(x2.f... fVarArr) {
        super.N(fVarArr);
        if (Build.VERSION.SDK_INT >= 24) {
            fVarArr[1].t(1000);
        } else {
            fVarArr[1].t(-1000);
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new a(), new a()};
    }
}
