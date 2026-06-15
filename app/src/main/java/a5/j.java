package a5;

import a5.o;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
/* compiled from: EGLSurfaceTexture.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f443h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    private final Handler f444a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f445b;

    /* renamed from: c  reason: collision with root package name */
    private final a f446c;

    /* renamed from: d  reason: collision with root package name */
    private EGLDisplay f447d;

    /* renamed from: e  reason: collision with root package name */
    private EGLContext f448e;

    /* renamed from: f  reason: collision with root package name */
    private EGLSurface f449f;

    /* renamed from: g  reason: collision with root package name */
    private SurfaceTexture f450g;

    /* compiled from: EGLSurfaceTexture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a();
    }

    public j(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws o.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f443h, 0, eGLConfigArr, 0, 1, iArr, 0);
        o.c(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, p0.B("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws o.a {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        o.c(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws o.a {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            o.c(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        o.c(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    private void d() {
        a aVar = this.f446c;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void e(int[] iArr) throws o.a {
        GLES20.glGenTextures(1, iArr, 0);
        o.b();
    }

    private static EGLDisplay f() throws o.a {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        o.c(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        o.c(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) a5.a.e(this.f450g);
    }

    public void h(int i10) throws o.a {
        EGLDisplay f10 = f();
        this.f447d = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f447d, a10, i10);
        this.f448e = b10;
        this.f449f = c(this.f447d, a10, b10, i10);
        e(this.f445b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f445b[0]);
        this.f450g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public void i() {
        this.f444a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f450g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f445b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f447d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f447d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f449f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f447d, this.f449f);
            }
            EGLContext eGLContext = this.f448e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f447d, eGLContext);
            }
            if (p0.f482a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f447d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f447d);
            }
            this.f447d = null;
            this.f448e = null;
            this.f449f = null;
            this.f450g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f444a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f450g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public j(Handler handler, a aVar) {
        this.f444a = handler;
        this.f446c = aVar;
        this.f445b = new int[1];
    }
}
