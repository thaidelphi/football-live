package y2;

import android.animation.ValueAnimator;
/* compiled from: PulseRing.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j extends x2.d {
    public j() {
        C(0.0f);
    }

    @Override // x2.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        v2.d dVar = new v2.d(this);
        Float valueOf = Float.valueOf(1.0f);
        return dVar.l(fArr, Float.valueOf(0.0f), valueOf, valueOf).a(fArr, 255, 178, 0).c(1000L).h(w2.b.b(0.21f, 0.53f, 0.56f, 0.8f, fArr)).b();
    }
}
