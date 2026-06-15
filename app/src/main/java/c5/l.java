package c5;

import a5.o;
import a5.p0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import c5.d;
import c5.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f5509a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f5510b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f5511c;

    /* renamed from: d  reason: collision with root package name */
    private final d f5512d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f5513e;

    /* renamed from: f  reason: collision with root package name */
    private final m f5514f;

    /* renamed from: g  reason: collision with root package name */
    private final i f5515g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f5516h;

    /* renamed from: i  reason: collision with root package name */
    private Surface f5517i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5518j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5519k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5520l;

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* renamed from: a  reason: collision with root package name */
        private final i f5521a;

        /* renamed from: d  reason: collision with root package name */
        private final float[] f5524d;

        /* renamed from: e  reason: collision with root package name */
        private final float[] f5525e;

        /* renamed from: f  reason: collision with root package name */
        private final float[] f5526f;

        /* renamed from: g  reason: collision with root package name */
        private float f5527g;

        /* renamed from: h  reason: collision with root package name */
        private float f5528h;

        /* renamed from: b  reason: collision with root package name */
        private final float[] f5522b = new float[16];

        /* renamed from: c  reason: collision with root package name */
        private final float[] f5523c = new float[16];

        /* renamed from: i  reason: collision with root package name */
        private final float[] f5529i = new float[16];

        /* renamed from: j  reason: collision with root package name */
        private final float[] f5530j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f5524d = fArr;
            float[] fArr2 = new float[16];
            this.f5525e = fArr2;
            float[] fArr3 = new float[16];
            this.f5526f = fArr3;
            this.f5521a = iVar;
            o.j(fArr);
            o.j(fArr2);
            o.j(fArr3);
            this.f5528h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f5525e, 0, -this.f5527g, (float) Math.cos(this.f5528h), (float) Math.sin(this.f5528h), 0.0f);
        }

        @Override // c5.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f5524d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f5528h = -f10;
            d();
        }

        @Override // c5.m.a
        public synchronized void b(PointF pointF) {
            this.f5527g = pointF.y;
            d();
            Matrix.setRotateM(this.f5526f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f5530j, 0, this.f5524d, 0, this.f5526f, 0);
                Matrix.multiplyMM(this.f5529i, 0, this.f5525e, 0, this.f5530j, 0);
            }
            Matrix.multiplyMM(this.f5523c, 0, this.f5522b, 0, this.f5529i, 0);
            this.f5521a.e(this.f5523c, false);
        }

        @Override // c5.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f5522b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.g(this.f5521a.f());
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void A(Surface surface);

        void z(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Surface surface = this.f5517i;
        if (surface != null) {
            Iterator<b> it = this.f5509a.iterator();
            while (it.hasNext()) {
                it.next().z(surface);
            }
        }
        h(this.f5516h, surface);
        this.f5516h = null;
        this.f5517i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f5516h;
        Surface surface = this.f5517i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f5516h = surfaceTexture;
        this.f5517i = surface2;
        Iterator<b> it = this.f5509a.iterator();
        while (it.hasNext()) {
            it.next().A(surface2);
        }
        h(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final SurfaceTexture surfaceTexture) {
        this.f5513e.post(new Runnable() { // from class: c5.k
            @Override // java.lang.Runnable
            public final void run() {
                l.this.f(surfaceTexture);
            }
        });
    }

    private static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z10 = this.f5518j && this.f5519k;
        Sensor sensor = this.f5511c;
        if (sensor == null || z10 == this.f5520l) {
            return;
        }
        if (z10) {
            this.f5510b.registerListener(this.f5512d, sensor, 0);
        } else {
            this.f5510b.unregisterListener(this.f5512d);
        }
        this.f5520l = z10;
    }

    public void d(b bVar) {
        this.f5509a.add(bVar);
    }

    public c5.a getCameraMotionListener() {
        return this.f5515g;
    }

    public b5.k getVideoFrameMetadataListener() {
        return this.f5515g;
    }

    public Surface getVideoSurface() {
        return this.f5517i;
    }

    public void i(b bVar) {
        this.f5509a.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5513e.post(new Runnable() { // from class: c5.j
            @Override // java.lang.Runnable
            public final void run() {
                l.this.e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f5519k = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f5519k = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f5515g.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f5518j = z10;
        j();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5509a = new CopyOnWriteArrayList<>();
        this.f5513e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) a5.a.e(context.getSystemService("sensor"));
        this.f5510b = sensorManager;
        Sensor defaultSensor = p0.f482a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f5511c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f5515g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f5514f = mVar;
        this.f5512d = new d(((WindowManager) a5.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f5518j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
