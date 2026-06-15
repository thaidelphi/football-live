package c5;

import a5.n;
import a5.o;
import android.opengl.GLES20;
import android.util.Log;
import c5.e;
import java.nio.Buffer;
import java.nio.FloatBuffer;
/* compiled from: ProjectionRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f5474j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f5475k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f5476l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    private static final float[] f5477m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    private static final float[] f5478n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private int f5479a;

    /* renamed from: b  reason: collision with root package name */
    private a f5480b;

    /* renamed from: c  reason: collision with root package name */
    private a f5481c;

    /* renamed from: d  reason: collision with root package name */
    private n f5482d;

    /* renamed from: e  reason: collision with root package name */
    private int f5483e;

    /* renamed from: f  reason: collision with root package name */
    private int f5484f;

    /* renamed from: g  reason: collision with root package name */
    private int f5485g;

    /* renamed from: h  reason: collision with root package name */
    private int f5486h;

    /* renamed from: i  reason: collision with root package name */
    private int f5487i;

    /* compiled from: ProjectionRenderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f5488a;

        /* renamed from: b  reason: collision with root package name */
        private final FloatBuffer f5489b;

        /* renamed from: c  reason: collision with root package name */
        private final FloatBuffer f5490c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5491d;

        public a(e.b bVar) {
            this.f5488a = bVar.a();
            this.f5489b = o.e(bVar.f5472c);
            this.f5490c = o.e(bVar.f5473d);
            int i10 = bVar.f5471b;
            if (i10 == 1) {
                this.f5491d = 5;
            } else if (i10 != 2) {
                this.f5491d = 4;
            } else {
                this.f5491d = 6;
            }
        }
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f5465a;
        e.a aVar2 = eVar.f5466b;
        return aVar.b() == 1 && aVar.a(0).f5470a == 0 && aVar2.b() == 1 && aVar2.a(0).f5470a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f5481c : this.f5480b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f5479a;
        if (i11 == 1) {
            fArr2 = z10 ? f5476l : f5475k;
        } else if (i11 == 2) {
            fArr2 = z10 ? f5478n : f5477m;
        } else {
            fArr2 = f5474j;
        }
        GLES20.glUniformMatrix3fv(this.f5484f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f5483e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f5487i, 0);
        try {
            o.b();
        } catch (o.a e8) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e8);
        }
        GLES20.glVertexAttribPointer(this.f5485g, 3, 5126, false, 12, (Buffer) aVar.f5489b);
        try {
            o.b();
        } catch (o.a e10) {
            Log.e("ProjectionRenderer", "Failed to load position data", e10);
        }
        GLES20.glVertexAttribPointer(this.f5486h, 2, 5126, false, 8, (Buffer) aVar.f5490c);
        try {
            o.b();
        } catch (o.a e11) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e11);
        }
        GLES20.glDrawArrays(aVar.f5491d, 0, aVar.f5488a);
        try {
            o.b();
        } catch (o.a e12) {
            Log.e("ProjectionRenderer", "Failed to render", e12);
        }
    }

    public void b() {
        try {
            n nVar = new n("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f5482d = nVar;
            this.f5483e = nVar.j("uMvpMatrix");
            this.f5484f = this.f5482d.j("uTexMatrix");
            this.f5485g = this.f5482d.e("aPosition");
            this.f5486h = this.f5482d.e("aTexCoords");
            this.f5487i = this.f5482d.j("uTexture");
        } catch (o.a e8) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e8);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f5479a = eVar.f5467c;
            a aVar = new a(eVar.f5465a.a(0));
            this.f5480b = aVar;
            if (!eVar.f5468d) {
                aVar = new a(eVar.f5466b.a(0));
            }
            this.f5481c = aVar;
        }
    }
}
