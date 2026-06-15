package y2;

import android.animation.ValueAnimator;
/* compiled from: RotatingCircle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k extends x2.b {
    @Override // x2.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new v2.d(this).j(fArr, 0, -180, -180).k(fArr, 0, 0, -180).c(1200L).d(fArr).b();
    }
}
