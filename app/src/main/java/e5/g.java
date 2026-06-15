package e5;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* compiled from: MatrixEvaluator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f25179a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f25180b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f25181c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f25179a);
        matrix2.getValues(this.f25180b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f25180b;
            float f11 = fArr[i10];
            float[] fArr2 = this.f25179a;
            fArr[i10] = fArr2[i10] + ((f11 - fArr2[i10]) * f10);
        }
        this.f25181c.setValues(this.f25180b);
        return this.f25181c;
    }
}
