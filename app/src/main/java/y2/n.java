package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import com.applovin.sdk.AppLovinErrorCodes;
/* compiled from: WanderingCubes.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n extends x2.g {

    /* compiled from: WanderingCubes.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends x2.c {
        int H;

        public a(int i10) {
            this.H = i10;
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            v2.d i10 = new v2.d(this).i(fArr, 0, -90, -179, -180, -270, -360);
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(0.75f);
            v2.d p10 = i10.o(fArr, valueOf, valueOf2, valueOf2, valueOf2, valueOf, valueOf).p(fArr, valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf);
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.5f);
            v2.d d10 = p10.l(fArr, valueOf3, valueOf4, valueOf3, valueOf3, valueOf4, valueOf3).c(1800L).d(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                d10.n(this.H);
            }
            return d10.b();
        }
    }

    @Override // x2.g
    public void N(x2.f... fVarArr) {
        super.N(fVarArr);
        if (Build.VERSION.SDK_INT < 24) {
            fVarArr[1].t(AppLovinErrorCodes.INVALID_URL);
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new a(0), new a(3)};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Rect a10 = a(rect);
        super.onBoundsChange(a10);
        for (int i10 = 0; i10 < L(); i10++) {
            x2.f K = K(i10);
            int i11 = a10.left;
            K.v(i11, a10.top, (a10.width() / 4) + i11, a10.top + (a10.height() / 4));
        }
    }
}
