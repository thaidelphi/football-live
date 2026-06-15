package c5;

import a5.k0;
import a5.o;
import a5.t;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.m1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SceneRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements b5.k, a {

    /* renamed from: i  reason: collision with root package name */
    private int f5501i;

    /* renamed from: j  reason: collision with root package name */
    private SurfaceTexture f5502j;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f5505m;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f5493a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f5494b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private final g f5495c = new g();

    /* renamed from: d  reason: collision with root package name */
    private final c f5496d = new c();

    /* renamed from: e  reason: collision with root package name */
    private final k0<Long> f5497e = new k0<>();

    /* renamed from: f  reason: collision with root package name */
    private final k0<e> f5498f = new k0<>();

    /* renamed from: g  reason: collision with root package name */
    private final float[] f5499g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    private final float[] f5500h = new float[16];

    /* renamed from: k  reason: collision with root package name */
    private volatile int f5503k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f5504l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f5493a.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f5505m;
        int i11 = this.f5504l;
        this.f5505m = bArr;
        if (i10 == -1) {
            i10 = this.f5503k;
        }
        this.f5504l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f5505m)) {
            return;
        }
        byte[] bArr3 = this.f5505m;
        e a10 = bArr3 != null ? f.a(bArr3, this.f5504l) : null;
        if (a10 == null || !g.c(a10)) {
            a10 = e.b(this.f5504l);
        }
        this.f5498f.a(j10, a10);
    }

    @Override // b5.k
    public void a(long j10, long j11, m1 m1Var, MediaFormat mediaFormat) {
        this.f5497e.a(j11, Long.valueOf(j10));
        i(m1Var.f28195v, m1Var.f28196w, j11);
    }

    @Override // c5.a
    public void b(long j10, float[] fArr) {
        this.f5496d.e(j10, fArr);
    }

    @Override // c5.a
    public void d() {
        this.f5497e.c();
        this.f5496d.d();
        this.f5494b.set(true);
    }

    public void e(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            o.b();
        } catch (o.a e8) {
            t.d("SceneRenderer", "Failed to draw a frame", e8);
        }
        if (this.f5493a.compareAndSet(true, false)) {
            ((SurfaceTexture) a5.a.e(this.f5502j)).updateTexImage();
            try {
                o.b();
            } catch (o.a e10) {
                t.d("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (this.f5494b.compareAndSet(true, false)) {
                o.j(this.f5499g);
            }
            long timestamp = this.f5502j.getTimestamp();
            Long g10 = this.f5497e.g(timestamp);
            if (g10 != null) {
                this.f5496d.c(this.f5499g, g10.longValue());
            }
            e j10 = this.f5498f.j(timestamp);
            if (j10 != null) {
                this.f5495c.d(j10);
            }
        }
        Matrix.multiplyMM(this.f5500h, 0, fArr, 0, this.f5499g, 0);
        this.f5495c.a(this.f5501i, this.f5500h, z10);
    }

    public SurfaceTexture f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            o.b();
            this.f5495c.b();
            o.b();
            this.f5501i = o.f();
        } catch (o.a e8) {
            t.d("SceneRenderer", "Failed to initialize the renderer", e8);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f5501i);
        this.f5502j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: c5.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.g(surfaceTexture2);
            }
        });
        return this.f5502j;
    }

    public void h(int i10) {
        this.f5503k = i10;
    }
}
