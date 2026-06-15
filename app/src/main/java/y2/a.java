package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
/* compiled from: ChasingDots.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends x2.g {

    /* compiled from: ChasingDots.java */
    /* renamed from: y2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class C0385a extends x2.b {
        C0385a() {
            C(0.0f);
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            v2.d dVar = new v2.d(this);
            Float valueOf = Float.valueOf(0.0f);
            return dVar.l(fArr, valueOf, Float.valueOf(1.0f), valueOf).c(2000L).d(fArr).b();
        }
    }

    @Override // x2.g
    public void N(x2.f... fVarArr) {
        super.N(fVarArr);
        if (Build.VERSION.SDK_INT >= 24) {
            fVarArr[1].t(1000);
        } else {
            fVarArr[1].t(-1000);
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new C0385a(), new C0385a()};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = a(rect);
        int width = (int) (a10.width() * 0.6f);
        x2.f K = K(0);
        int i10 = a10.right;
        int i11 = a10.top;
        K.v(i10 - width, i11, i10, i11 + width);
        x2.f K2 = K(1);
        int i12 = a10.right;
        int i13 = a10.bottom;
        K2.v(i12 - width, i13 - width, i12, i13);
    }

    @Override // x2.g, x2.f
    public ValueAnimator r() {
        return new v2.d(this).i(new float[]{0.0f, 1.0f}, 0, 360).c(2000L).h(new LinearInterpolator()).b();
    }
}
