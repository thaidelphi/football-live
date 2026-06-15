package x2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
/* compiled from: SpriteContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class g extends f {
    private f[] E = O();
    private int F;

    public g() {
        M();
        N(this.E);
    }

    private void M() {
        f[] fVarArr = this.E;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setCallback(this);
            }
        }
    }

    public void J(Canvas canvas) {
        f[] fVarArr = this.E;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                int save = canvas.save();
                fVar.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    public f K(int i10) {
        f[] fVarArr = this.E;
        if (fVarArr == null) {
            return null;
        }
        return fVarArr[i10];
    }

    public int L() {
        f[] fVarArr = this.E;
        if (fVarArr == null) {
            return 0;
        }
        return fVarArr.length;
    }

    public void N(f... fVarArr) {
    }

    public abstract f[] O();

    @Override // x2.f
    protected void b(Canvas canvas) {
    }

    @Override // x2.f
    public int c() {
        return this.F;
    }

    @Override // x2.f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        J(canvas);
    }

    @Override // x2.f, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return v2.a.b(this.E) || super.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (f fVar : this.E) {
            fVar.setBounds(rect);
        }
    }

    @Override // x2.f
    public ValueAnimator r() {
        return null;
    }

    @Override // x2.f, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        v2.a.e(this.E);
    }

    @Override // x2.f, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        v2.a.f(this.E);
    }

    @Override // x2.f
    public void u(int i10) {
        this.F = i10;
        for (int i11 = 0; i11 < L(); i11++) {
            K(i11).u(i10);
        }
    }
}
