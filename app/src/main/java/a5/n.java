package a5;

import a5.o;
import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;
/* compiled from: GlProgram.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final int f466a;

    /* renamed from: b  reason: collision with root package name */
    private final a[] f467b;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f468c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, a> f469d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, b> f470e;

    /* compiled from: GlProgram.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f471a;

        /* renamed from: b  reason: collision with root package name */
        private final int f472b;

        /* renamed from: c  reason: collision with root package name */
        private final int f473c;

        private a(String str, int i10, int i11) {
            this.f471a = str;
            this.f472b = i10;
            this.f473c = i11;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveAttrib(i10, i11, iArr[0], new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, n.h(bArr));
            return new a(str, i11, n.f(i10, str));
        }
    }

    /* compiled from: GlProgram.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f474a;

        /* renamed from: b  reason: collision with root package name */
        private final int f475b;

        /* renamed from: c  reason: collision with root package name */
        private final int f476c;

        /* renamed from: d  reason: collision with root package name */
        private final float[] f477d = new float[16];

        private b(String str, int i10, int i11) {
            this.f474a = str;
            this.f475b = i10;
            this.f476c = i11;
        }

        public static b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveUniform(i10, i11, iArr[0], new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, n.h(bArr));
            return new b(str, n.i(i10, str), iArr2[0]);
        }
    }

    public n(String str, String str2) throws o.a {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f466a = glCreateProgram;
        o.b();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        o.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.f469d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f467b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a a10 = a.a(this.f466a, i10);
            this.f467b[i10] = a10;
            this.f469d.put(a10.f471a, a10);
        }
        this.f470e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f466a, 35718, iArr3, 0);
        this.f468c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b a11 = b.a(this.f466a, i11);
            this.f468c[i11] = a11;
            this.f470e.put(a11.f474a, a11);
        }
        o.b();
    }

    private static void d(int i10, int i11, String str) throws o.a {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        boolean z10 = iArr[0] == 1;
        o.c(z10, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        o.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f466a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) throws o.a {
        int g10 = g(str);
        GLES20.glEnableVertexAttribArray(g10);
        o.b();
        return g10;
    }

    public int j(String str) {
        return i(this.f466a, str);
    }
}
