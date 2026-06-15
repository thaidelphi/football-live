package c5;

import a5.k0;
import a5.o;
import android.opengl.Matrix;
/* compiled from: FrameRotationQueue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f5454a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f5455b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final k0<float[]> f5456c = new k0<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f5457d;

    public static void a(float[] fArr, float[] fArr2) {
        o.j(fArr);
        float sqrt = (float) Math.sqrt((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            o.j(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] j11 = this.f5456c.j(j10);
        if (j11 == null) {
            return false;
        }
        b(this.f5455b, j11);
        if (!this.f5457d) {
            a(this.f5454a, this.f5455b);
            this.f5457d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f5454a, 0, this.f5455b, 0);
        return true;
    }

    public void d() {
        this.f5456c.c();
        this.f5457d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f5456c.a(j10, fArr);
    }
}
