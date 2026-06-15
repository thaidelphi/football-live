package y2;

import android.animation.ValueAnimator;
/* compiled from: Pulse.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends x2.b {
    public i() {
        C(0.0f);
    }

    @Override // x2.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 1.0f};
        return new v2.d(this).l(fArr, Float.valueOf(0.0f), Float.valueOf(1.0f)).a(fArr, 255, 0).c(1000L).d(fArr).b();
    }
}
