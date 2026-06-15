package x2;

import android.graphics.Canvas;
import android.graphics.Paint;
/* compiled from: CircleSprite.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends e {
    @Override // x2.e
    public void J(Canvas canvas, Paint paint) {
        if (d() != null) {
            canvas.drawCircle(d().centerX(), d().centerY(), Math.min(d().width(), d().height()) / 2, paint);
        }
    }
}
