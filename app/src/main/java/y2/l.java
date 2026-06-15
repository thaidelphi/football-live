package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
/* compiled from: RotatingPlane.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l extends x2.c {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        w(a(rect));
    }

    @Override // x2.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new v2.d(this).j(fArr, 0, -180, -180).k(fArr, 0, 0, -180).c(1200L).d(fArr).b();
    }
}
