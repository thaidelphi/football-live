package x2;

import android.graphics.Canvas;
import android.graphics.Paint;
/* compiled from: RingSprite.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends e {
    @Override // x2.e
    public void J(Canvas canvas, Paint paint) {
        if (d() != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(d().width(), d().height()) / 2;
            paint.setStrokeWidth(min / 12);
            canvas.drawCircle(d().centerX(), d().centerY(), min, paint);
        }
    }
}
