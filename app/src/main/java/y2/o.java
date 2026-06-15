package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
/* compiled from: Wave.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o extends x2.g {

    /* compiled from: Wave.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends x2.c {
        a() {
            E(0.4f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            v2.d dVar = new v2.d(this);
            Float valueOf = Float.valueOf(0.4f);
            return dVar.m(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).c(1200L).d(fArr).b();
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        a[] aVarArr = new a[5];
        for (int i10 = 0; i10 < 5; i10++) {
            aVarArr[i10] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i10].t((i10 * 100) + 600);
            } else {
                aVarArr[i10].t((i10 * 100) - 1200);
            }
        }
        return aVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = a(rect);
        int width = a10.width() / L();
        int width2 = ((a10.width() / 5) * 3) / 5;
        for (int i10 = 0; i10 < L(); i10++) {
            x2.f K = K(i10);
            int i11 = a10.left + (i10 * width) + (width / 5);
            K.v(i11, a10.top, i11 + width2, a10.bottom);
        }
    }
}
