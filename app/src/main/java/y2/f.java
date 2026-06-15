package y2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
/* compiled from: FoldingCube.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends x2.g {
    private boolean G = false;

    /* compiled from: FoldingCube.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends x2.c {
        a() {
            setAlpha(0);
            A(-180);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            return new v2.d(this).a(fArr, 0, 0, 255, 255, 0, 0).j(fArr, -180, -180, 0, 0, 0, 0).k(fArr, 0, 0, 0, 0, 180, 180).c(2400L).h(new LinearInterpolator()).b();
        }
    }

    @Override // x2.g
    public void J(Canvas canvas) {
        Rect a10 = a(getBounds());
        for (int i10 = 0; i10 < L(); i10++) {
            int save = canvas.save();
            canvas.rotate((i10 * 90) + 45, a10.centerX(), a10.centerY());
            K(i10).draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        a[] aVarArr = new a[4];
        for (int i10 = 0; i10 < 4; i10++) {
            aVarArr[i10] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i10].t(i10 * 300);
            } else {
                aVarArr[i10].t((i10 * 300) - 1200);
            }
        }
        return aVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = a(rect);
        int min = Math.min(a10.width(), a10.height());
        if (this.G) {
            min = (int) Math.sqrt((min * min) / 2);
            int width = (a10.width() - min) / 2;
            int height = (a10.height() - min) / 2;
            a10 = new Rect(a10.left + width, a10.top + height, a10.right - width, a10.bottom - height);
        }
        int i10 = min / 2;
        int i11 = a10.left + i10 + 1;
        int i12 = a10.top + i10 + 1;
        for (int i13 = 0; i13 < L(); i13++) {
            x2.f K = K(i13);
            K.v(a10.left, a10.top, i11, i12);
            K.x(K.d().right);
            K.y(K.d().bottom);
        }
    }
}
