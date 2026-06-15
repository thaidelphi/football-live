package p3;

import a5.p0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import n3.m1;
/* compiled from: Ac3Util.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29559a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29560b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f29561c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f29562d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f29563e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f29564f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1253, 1393};

    /* compiled from: Ac3Util.java */
    /* renamed from: p3.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0334b {

        /* renamed from: a  reason: collision with root package name */
        public final String f29565a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29566b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29567c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29568d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29569e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29570f;

        private C0334b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f29565a = str;
            this.f29566b = i10;
            this.f29568d = i11;
            this.f29567c = i12;
            this.f29569e = i13;
            this.f29570f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((p0.H(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = f29560b;
            if (i10 >= iArr.length || i11 < 0) {
                return -1;
            }
            int[] iArr2 = f29564f;
            if (i12 >= iArr2.length) {
                return -1;
            }
            int i13 = iArr[i10];
            if (i13 == 44100) {
                return (iArr2[i12] + (i11 % 2)) * 2;
            }
            int i14 = f29563e[i12];
            return i13 == 32000 ? i14 * 6 : i14 * 4;
        }
        return -1;
    }

    public static m1 c(a5.c0 c0Var, String str, String str2, DrmInitData drmInitData) {
        int i10 = f29560b[(c0Var.z() & 192) >> 6];
        int z10 = c0Var.z();
        int i11 = f29562d[(z10 & 56) >> 3];
        if ((z10 & 4) != 0) {
            i11++;
        }
        return new m1.b().S(str).e0("audio/ac3").H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f29559a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0334b e(a5.b0 b0Var) {
        int b10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int h10;
        int i14;
        int i15;
        int i16;
        int i17;
        int e8 = b0Var.e();
        b0Var.q(40);
        boolean z10 = b0Var.h(5) > 10;
        b0Var.o(e8);
        int i18 = -1;
        if (z10) {
            b0Var.q(16);
            int h11 = b0Var.h(2);
            if (h11 == 0) {
                i18 = 0;
            } else if (h11 == 1) {
                i18 = 1;
            } else if (h11 == 2) {
                i18 = 2;
            }
            b0Var.q(3);
            b10 = (b0Var.h(11) + 1) * 2;
            int h12 = b0Var.h(2);
            if (h12 == 3) {
                i10 = f29561c[b0Var.h(2)];
                i14 = 6;
                h10 = 3;
            } else {
                h10 = b0Var.h(2);
                i14 = f29559a[h10];
                i10 = f29560b[h12];
            }
            i11 = i14 * 256;
            int h13 = b0Var.h(3);
            boolean g10 = b0Var.g();
            i12 = f29562d[h13] + (g10 ? 1 : 0);
            b0Var.q(10);
            if (b0Var.g()) {
                b0Var.q(8);
            }
            if (h13 == 0) {
                b0Var.q(5);
                if (b0Var.g()) {
                    b0Var.q(8);
                }
            }
            if (i18 == 1 && b0Var.g()) {
                b0Var.q(16);
            }
            if (b0Var.g()) {
                if (h13 > 2) {
                    b0Var.q(2);
                }
                if ((h13 & 1) == 0 || h13 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    b0Var.q(6);
                }
                if ((h13 & 4) != 0) {
                    b0Var.q(i16);
                }
                if (g10 && b0Var.g()) {
                    b0Var.q(5);
                }
                if (i18 == 0) {
                    if (b0Var.g()) {
                        i17 = 6;
                        b0Var.q(6);
                    } else {
                        i17 = 6;
                    }
                    if (h13 == 0 && b0Var.g()) {
                        b0Var.q(i17);
                    }
                    if (b0Var.g()) {
                        b0Var.q(i17);
                    }
                    int h14 = b0Var.h(2);
                    if (h14 == 1) {
                        b0Var.q(5);
                    } else if (h14 == 2) {
                        b0Var.q(12);
                    } else if (h14 == 3) {
                        int h15 = b0Var.h(5);
                        if (b0Var.g()) {
                            b0Var.q(5);
                            if (b0Var.g()) {
                                b0Var.q(4);
                            }
                            if (b0Var.g()) {
                                b0Var.q(4);
                            }
                            if (b0Var.g()) {
                                b0Var.q(4);
                            }
                            if (b0Var.g()) {
                                b0Var.q(4);
                            }
                            if (b0Var.g()) {
                                b0Var.q(4);
                            }
                            if (b0Var.g()) {
                                b0Var.q(4);
                            }
                            if (b0Var.g()) {
                                b0Var.q(4);
                            }
                            if (b0Var.g()) {
                                if (b0Var.g()) {
                                    b0Var.q(4);
                                }
                                if (b0Var.g()) {
                                    b0Var.q(4);
                                }
                            }
                        }
                        if (b0Var.g()) {
                            b0Var.q(5);
                            if (b0Var.g()) {
                                b0Var.q(7);
                                if (b0Var.g()) {
                                    b0Var.q(8);
                                }
                            }
                        }
                        b0Var.q((h15 + 2) * 8);
                        b0Var.c();
                    }
                    if (h13 < 2) {
                        if (b0Var.g()) {
                            b0Var.q(14);
                        }
                        if (h13 == 0 && b0Var.g()) {
                            b0Var.q(14);
                        }
                    }
                    if (b0Var.g()) {
                        if (h10 == 0) {
                            b0Var.q(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (b0Var.g()) {
                                    b0Var.q(5);
                                }
                            }
                        }
                    }
                }
            }
            if (b0Var.g()) {
                b0Var.q(5);
                if (h13 == 2) {
                    b0Var.q(4);
                }
                if (h13 >= 6) {
                    b0Var.q(2);
                }
                if (b0Var.g()) {
                    b0Var.q(8);
                }
                if (h13 == 0 && b0Var.g()) {
                    b0Var.q(8);
                }
                if (h12 < 3) {
                    b0Var.p();
                }
            }
            if (i18 == 0 && h10 != 3) {
                b0Var.p();
            }
            if (i18 == 2 && (h10 == 3 || b0Var.g())) {
                i15 = 6;
                b0Var.q(6);
            } else {
                i15 = 6;
            }
            str = (b0Var.g() && b0Var.h(i15) == 1 && b0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i18;
        } else {
            b0Var.q(32);
            int h16 = b0Var.h(2);
            String str2 = h16 == 3 ? null : "audio/ac3";
            b10 = b(h16, b0Var.h(6));
            b0Var.q(8);
            int h17 = b0Var.h(3);
            if ((h17 & 1) != 0 && h17 != 1) {
                b0Var.q(2);
            }
            if ((h17 & 4) != 0) {
                b0Var.q(2);
            }
            if (h17 == 2) {
                b0Var.q(2);
            }
            int[] iArr = f29560b;
            i10 = h16 < iArr.length ? iArr[h16] : -1;
            i11 = 1536;
            i12 = f29562d[h17] + (b0Var.g() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new C0334b(str, i13, i12, i10, b10, i11);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static m1 g(a5.c0 c0Var, String str, String str2, DrmInitData drmInitData) {
        c0Var.L(2);
        int i10 = f29560b[(c0Var.z() & 192) >> 6];
        int z10 = c0Var.z();
        int i11 = f29562d[(z10 & 14) >> 1];
        if ((z10 & 1) != 0) {
            i11++;
        }
        if (((c0Var.z() & 30) >> 1) > 0 && (2 & c0Var.z()) != 0) {
            i11 += 2;
        }
        return new m1.b().S(str).e0((c0Var.a() <= 0 || (c0Var.z() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
