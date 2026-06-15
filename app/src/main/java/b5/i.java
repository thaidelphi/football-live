package b5;

import a5.o;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: VideoDecoderGLSurfaceView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i extends GLSurfaceView implements j {

    /* renamed from: a  reason: collision with root package name */
    private final a f5165a;

    /* compiled from: VideoDecoderGLSurfaceView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: k  reason: collision with root package name */
        private static final float[] f5166k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: l  reason: collision with root package name */
        private static final float[] f5167l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: m  reason: collision with root package name */
        private static final float[] f5168m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: n  reason: collision with root package name */
        private static final String[] f5169n = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: o  reason: collision with root package name */
        private static final FloatBuffer f5170o = a5.o.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a  reason: collision with root package name */
        private final GLSurfaceView f5171a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f5172b = new int[3];

        /* renamed from: c  reason: collision with root package name */
        private final int[] f5173c = new int[3];

        /* renamed from: d  reason: collision with root package name */
        private final int[] f5174d = new int[3];

        /* renamed from: e  reason: collision with root package name */
        private final int[] f5175e = new int[3];

        /* renamed from: f  reason: collision with root package name */
        private final AtomicReference<q3.k> f5176f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private final FloatBuffer[] f5177g = new FloatBuffer[3];

        /* renamed from: h  reason: collision with root package name */
        private a5.n f5178h;

        /* renamed from: i  reason: collision with root package name */
        private int f5179i;

        /* renamed from: j  reason: collision with root package name */
        private q3.k f5180j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f5171a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f5174d;
                this.f5175e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f5172b, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f5178h.j(f5169n[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    a5.o.a(3553, this.f5172b[i10]);
                }
                a5.o.b();
            } catch (o.a e8) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e8);
            }
        }

        public void a(q3.k kVar) {
            q3.k andSet = this.f5176f.getAndSet(kVar);
            if (andSet != null) {
                andSet.p();
            }
            this.f5171a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            q3.k andSet = this.f5176f.getAndSet(null);
            if (andSet == null && this.f5180j == null) {
                return;
            }
            if (andSet != null) {
                q3.k kVar = this.f5180j;
                if (kVar != null) {
                    kVar.p();
                }
                this.f5180j = andSet;
            }
            q3.k kVar2 = (q3.k) a5.a.e(this.f5180j);
            float[] fArr = f5167l;
            int i10 = kVar2.f30124h;
            if (i10 == 1) {
                fArr = f5166k;
            } else if (i10 == 3) {
                fArr = f5168m;
            }
            GLES20.glUniformMatrix3fv(this.f5179i, 1, false, fArr, 0);
            int[] iArr = (int[]) a5.a.e(kVar2.f30123g);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) a5.a.e(kVar2.f30122f);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? kVar2.f30121e : (kVar2.f30121e + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f5172b[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = (r3[0] + 1) / 2;
            int[] iArr2 = {kVar2.f30120d, i13, i13};
            for (int i14 = 0; i14 < 3; i14++) {
                if (this.f5174d[i14] != iArr2[i14] || this.f5175e[i14] != iArr[i14]) {
                    a5.a.f(iArr[i14] != 0);
                    float f10 = iArr2[i14] / iArr[i14];
                    this.f5177g[i14] = a5.o.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f5173c[i14], 2, 5126, false, 0, (Buffer) this.f5177g[i14]);
                    this.f5174d[i14] = iArr2[i14];
                    this.f5175e[i14] = iArr[i14];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                a5.o.b();
            } catch (o.a e8) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e8);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                a5.n nVar = new a5.n("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f5178h = nVar;
                GLES20.glVertexAttribPointer(nVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f5170o);
                this.f5173c[0] = this.f5178h.e("in_tc_y");
                this.f5173c[1] = this.f5178h.e("in_tc_u");
                this.f5173c[2] = this.f5178h.e("in_tc_v");
                this.f5179i = this.f5178h.j("mColorConversion");
                a5.o.b();
                b();
                a5.o.b();
            } catch (o.a e8) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e8);
            }
        }
    }

    public i(Context context) {
        this(context, null);
    }

    @Deprecated
    public j getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(q3.k kVar) {
        this.f5165a.a(kVar);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f5165a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
