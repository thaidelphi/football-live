package x2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
/* compiled from: ShapeSprite.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e extends f {
    private Paint E;
    private int F;
    private int G;

    public e() {
        u(-1);
        Paint paint = new Paint();
        this.E = paint;
        paint.setAntiAlias(true);
        this.E.setColor(this.F);
    }

    private void K() {
        int alpha = getAlpha();
        int i10 = this.G;
        this.F = ((((i10 >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i10 << 8) >>> 8);
    }

    public abstract void J(Canvas canvas, Paint paint);

    @Override // x2.f
    protected final void b(Canvas canvas) {
        this.E.setColor(this.F);
        J(canvas, this.E);
    }

    @Override // x2.f
    public int c() {
        return this.G;
    }

    @Override // x2.f, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        K();
    }

    @Override // x2.f, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.E.setColorFilter(colorFilter);
    }

    @Override // x2.f
    public void u(int i10) {
        this.G = i10;
        K();
    }
}
