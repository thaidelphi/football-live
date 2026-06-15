package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
/* compiled from: ThreeBounce.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m extends x2.g {

    /* compiled from: ThreeBounce.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends x2.b {
        a() {
            C(0.0f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            v2.d dVar = new v2.d(this);
            Float valueOf = Float.valueOf(0.0f);
            return dVar.l(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).c(1400L).d(fArr).b();
        }
    }

    @Override // x2.g
    public void N(x2.f... fVarArr) {
        super.N(fVarArr);
        fVarArr[1].t(160);
        fVarArr[2].t(320);
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new a(), new a(), new a()};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = a(rect);
        int width = a10.width() / 8;
        int centerY = a10.centerY() - width;
        int centerY2 = a10.centerY() + width;
        for (int i10 = 0; i10 < L(); i10++) {
            int width2 = ((a10.width() * i10) / 3) + a10.left;
            K(i10).v(width2, centerY, (width * 2) + width2, centerY2);
        }
    }
}
