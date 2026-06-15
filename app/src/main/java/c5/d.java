package c5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
/* compiled from: OrientationListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f5458a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f5459b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f5460c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f5461d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private final Display f5462e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f5463f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5464g;

    /* compiled from: OrientationListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f5462e = display;
        this.f5463f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f5459b);
        SensorManager.getOrientation(this.f5459b, this.f5461d);
        return this.f5461d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f5463f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f5464g) {
            c.a(this.f5460c, fArr);
            this.f5464g = true;
        }
        float[] fArr2 = this.f5459b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f5459b, 0, this.f5460c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 130;
            int i12 = 129;
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
                i11 = 129;
            } else if (i10 != 3) {
                throw new IllegalStateException();
            } else {
                i12 = 1;
            }
            float[] fArr2 = this.f5459b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f5459b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f5458a, sensorEvent.values);
        d(this.f5458a, this.f5462e.getRotation());
        float a10 = a(this.f5458a);
        e(this.f5458a);
        c(this.f5458a);
        b(this.f5458a, a10);
    }
}
