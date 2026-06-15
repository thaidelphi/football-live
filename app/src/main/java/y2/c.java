package y2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
/* compiled from: CubeGrid.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends x2.g {

    /* compiled from: CubeGrid.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b extends x2.c {
        private b() {
        }

        @Override // x2.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            v2.d dVar = new v2.d(this);
            Float valueOf = Float.valueOf(1.0f);
            return dVar.l(fArr, valueOf, Float.valueOf(0.0f), valueOf, valueOf).c(1300L).d(fArr).b();
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        int[] iArr = {200, 300, CommonGatewayClient.CODE_400, 100, 200, 300, 0, 100, 200};
        b[] bVarArr = new b[9];
        for (int i10 = 0; i10 < 9; i10++) {
            bVarArr[i10] = new b();
            bVarArr[i10].t(iArr[i10]);
        }
        return bVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x2.g, x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = a(rect);
        int width = (int) (a10.width() * 0.33f);
        int height = (int) (a10.height() * 0.33f);
        for (int i10 = 0; i10 < L(); i10++) {
            int i11 = a10.left + ((i10 % 3) * width);
            int i12 = a10.top + ((i10 / 3) * height);
            K(i10).v(i11, i12, i11 + width, i12 + height);
        }
    }
}
