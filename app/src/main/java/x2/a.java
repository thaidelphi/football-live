package x2;

import android.graphics.Canvas;
import android.graphics.Rect;
/* compiled from: CircleLayoutContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends g {
    @Override // x2.g
    public void J(Canvas canvas) {
        for (int i10 = 0; i10 < L(); i10++) {
            f K = K(i10);
            int save = canvas.save();
            canvas.rotate((i10 * 360) / L(), getBounds().centerX(), getBounds().centerY());
            K.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = a(rect);
        int width = (int) (((a10.width() * 3.141592653589793d) / 3.5999999046325684d) / L());
        int centerX = a10.centerX() - width;
        int centerX2 = a10.centerX() + width;
        for (int i10 = 0; i10 < L(); i10++) {
            f K = K(i10);
            int i11 = a10.top;
            K.v(centerX, i11, centerX2, (width * 2) + i11);
        }
    }
}
