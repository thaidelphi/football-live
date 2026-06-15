package t3;

import a5.c0;
import a5.p0;
import a5.u;
import a5.y;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import n3.h2;
import s3.i;
import s3.j;
import s3.k;
import s3.m;
import s3.p;
import s3.q;
import s3.t;
/* compiled from: MatroskaExtractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements i {

    /* renamed from: c0  reason: collision with root package name */
    public static final m f30957c0 = d.f30956a;

    /* renamed from: d0  reason: collision with root package name */
    private static final byte[] f30958d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0  reason: collision with root package name */
    private static final byte[] f30959e0 = p0.m0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0  reason: collision with root package name */
    private static final byte[] f30960f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0  reason: collision with root package name */
    private static final byte[] f30961g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0  reason: collision with root package name */
    private static final UUID f30962h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0  reason: collision with root package name */
    private static final Map<String, Integer> f30963i0;
    private long A;
    private long B;
    private u C;
    private u D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* renamed from: a  reason: collision with root package name */
    private final t3.c f30964a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f30965a0;

    /* renamed from: b  reason: collision with root package name */
    private final g f30966b;

    /* renamed from: b0  reason: collision with root package name */
    private k f30967b0;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<c> f30968c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f30969d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f30970e;

    /* renamed from: f  reason: collision with root package name */
    private final c0 f30971f;

    /* renamed from: g  reason: collision with root package name */
    private final c0 f30972g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f30973h;

    /* renamed from: i  reason: collision with root package name */
    private final c0 f30974i;

    /* renamed from: j  reason: collision with root package name */
    private final c0 f30975j;

    /* renamed from: k  reason: collision with root package name */
    private final c0 f30976k;

    /* renamed from: l  reason: collision with root package name */
    private final c0 f30977l;

    /* renamed from: m  reason: collision with root package name */
    private final c0 f30978m;

    /* renamed from: n  reason: collision with root package name */
    private final c0 f30979n;

    /* renamed from: o  reason: collision with root package name */
    private ByteBuffer f30980o;

    /* renamed from: p  reason: collision with root package name */
    private long f30981p;

    /* renamed from: q  reason: collision with root package name */
    private long f30982q;

    /* renamed from: r  reason: collision with root package name */
    private long f30983r;

    /* renamed from: s  reason: collision with root package name */
    private long f30984s;

    /* renamed from: t  reason: collision with root package name */
    private long f30985t;

    /* renamed from: u  reason: collision with root package name */
    private c f30986u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f30987v;

    /* renamed from: w  reason: collision with root package name */
    private int f30988w;

    /* renamed from: x  reason: collision with root package name */
    private long f30989x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f30990y;

    /* renamed from: z  reason: collision with root package name */
    private long f30991z;

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class b implements t3.b {
        private b() {
        }

        @Override // t3.b
        public void a(int i10) throws h2 {
            e.this.n(i10);
        }

        @Override // t3.b
        public void b(int i10, double d10) throws h2 {
            e.this.q(i10, d10);
        }

        @Override // t3.b
        public void c(int i10, long j10) throws h2 {
            e.this.w(i10, j10);
        }

        @Override // t3.b
        public int d(int i10) {
            return e.this.t(i10);
        }

        @Override // t3.b
        public boolean e(int i10) {
            return e.this.y(i10);
        }

        @Override // t3.b
        public void f(int i10, int i11, j jVar) throws IOException {
            e.this.k(i10, i11, jVar);
        }

        @Override // t3.b
        public void g(int i10, String str) throws h2 {
            e.this.F(i10, str);
        }

        @Override // t3.b
        public void h(int i10, long j10, long j11) throws h2 {
            e.this.E(i10, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MatroskaExtractor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {
        public byte[] N;
        public s3.u T;
        public boolean U;
        public t X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f30993a;

        /* renamed from: b  reason: collision with root package name */
        public String f30994b;

        /* renamed from: c  reason: collision with root package name */
        public int f30995c;

        /* renamed from: d  reason: collision with root package name */
        public int f30996d;

        /* renamed from: e  reason: collision with root package name */
        public int f30997e;

        /* renamed from: f  reason: collision with root package name */
        public int f30998f;

        /* renamed from: g  reason: collision with root package name */
        private int f30999g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f31000h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f31001i;

        /* renamed from: j  reason: collision with root package name */
        public t.a f31002j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f31003k;

        /* renamed from: l  reason: collision with root package name */
        public DrmInitData f31004l;

        /* renamed from: m  reason: collision with root package name */
        public int f31005m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f31006n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f31007o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f31008p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f31009q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f31010r = -1;

        /* renamed from: s  reason: collision with root package name */
        public float f31011s = 0.0f;

        /* renamed from: t  reason: collision with root package name */
        public float f31012t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f31013u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f31014v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f31015w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f31016x = false;

        /* renamed from: y  reason: collision with root package name */
        public int f31017y = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f31018z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        private String W = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            a5.a.e(this.X);
        }

        private byte[] g(String str) throws h2 {
            byte[] bArr = this.f31003k;
            if (bArr != null) {
                return bArr;
            }
            throw h2.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) (this.L + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(c0 c0Var) throws h2 {
            try {
                c0Var.L(16);
                long r10 = c0Var.r();
                if (r10 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (r10 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (r10 == 826496599) {
                    byte[] d10 = c0Var.d();
                    for (int e8 = c0Var.e() + 20; e8 < d10.length - 4; e8++) {
                        if (d10[e8] == 0 && d10[e8 + 1] == 0 && d10[e8 + 2] == 1 && d10[e8 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d10, e8, d10.length)));
                        }
                    }
                    throw h2.a("Failed to find FourCC VC1 initialization data", null);
                }
                a5.t.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw h2.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(c0 c0Var) throws h2 {
            try {
                int s10 = c0Var.s();
                if (s10 == 1) {
                    return true;
                }
                if (s10 == 65534) {
                    c0Var.K(24);
                    if (c0Var.t() == e.f30962h0.getMostSignificantBits()) {
                        if (c0Var.t() == e.f30962h0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw h2.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws h2 {
            try {
                if (bArr[0] == 2) {
                    int i10 = 0;
                    int i11 = 1;
                    while ((bArr[i11] & 255) == 255) {
                        i10 += 255;
                        i11++;
                    }
                    int i12 = i11 + 1;
                    int i13 = i10 + (bArr[i11] & 255);
                    int i14 = 0;
                    while ((bArr[i12] & 255) == 255) {
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (bArr[i12] & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i18];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw h2.a("Error parsing vorbis codec private", null);
                        }
                        throw h2.a("Error parsing vorbis codec private", null);
                    }
                    throw h2.a("Error parsing vorbis codec private", null);
                }
                throw h2.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw h2.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f30994b) ? z10 : this.f30998f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0417  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x0430  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0432  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0451  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x055a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(s3.k r20, int r21) throws n3.h2 {
            /*
                Method dump skipped, instructions count: 1648
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.e.c.i(s3.k, int):void");
        }

        public void j() {
            s3.u uVar = this.T;
            if (uVar != null) {
                uVar.a(this.X, this.f31002j);
            }
        }

        public void n() {
            s3.u uVar = this.T;
            if (uVar != null) {
                uVar.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f30963i0 = Collections.unmodifiableMap(hashMap);
    }

    public e(int i10) {
        this(new t3.a(), i10);
    }

    private void A(j jVar, int i10) throws IOException {
        if (this.f30972g.f() >= i10) {
            return;
        }
        if (this.f30972g.b() < i10) {
            c0 c0Var = this.f30972g;
            c0Var.c(Math.max(c0Var.b() * 2, i10));
        }
        jVar.readFully(this.f30972g.d(), this.f30972g.f(), i10 - this.f30972g.f());
        this.f30972g.J(i10);
    }

    private void B() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f30965a0 = false;
        this.f30975j.G(0);
    }

    private long C(long j10) throws h2 {
        long j11 = this.f30983r;
        if (j11 != -9223372036854775807L) {
            return p0.O0(j10, j11, 1000L);
        }
        throw h2.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void D(String str, long j10, byte[] bArr) {
        byte[] r10;
        int i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                r10 = r(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                r10 = r(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                r10 = r(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(r10, 0, bArr, i10, r10.length);
    }

    private int G(j jVar, c cVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f30994b)) {
            H(jVar, f30958d0, i10);
            return p();
        } else if ("S_TEXT/ASS".equals(cVar.f30994b)) {
            H(jVar, f30960f0, i10);
            return p();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f30994b)) {
            H(jVar, f30961g0, i10);
            return p();
        } else {
            t tVar = cVar.X;
            if (!this.V) {
                if (cVar.f31000h) {
                    this.O &= -1073741825;
                    if (!this.W) {
                        jVar.readFully(this.f30972g.d(), 0, 1);
                        this.S++;
                        if ((this.f30972g.d()[0] & 128) != 128) {
                            this.Z = this.f30972g.d()[0];
                            this.W = true;
                        } else {
                            throw h2.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.Z;
                    if ((b10 & 1) == 1) {
                        boolean z11 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.f30965a0) {
                            jVar.readFully(this.f30977l.d(), 0, 8);
                            this.S += 8;
                            this.f30965a0 = true;
                            this.f30972g.d()[0] = (byte) ((z11 ? 128 : 0) | 8);
                            this.f30972g.K(0);
                            tVar.f(this.f30972g, 1, 1);
                            this.T++;
                            this.f30977l.K(0);
                            tVar.f(this.f30977l, 8, 1);
                            this.T += 8;
                        }
                        if (z11) {
                            if (!this.X) {
                                jVar.readFully(this.f30972g.d(), 0, 1);
                                this.S++;
                                this.f30972g.K(0);
                                this.Y = this.f30972g.z();
                                this.X = true;
                            }
                            int i12 = this.Y * 4;
                            this.f30972g.G(i12);
                            jVar.readFully(this.f30972g.d(), 0, i12);
                            this.S += i12;
                            short s10 = (short) ((this.Y / 2) + 1);
                            int i13 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f30980o;
                            if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                this.f30980o = ByteBuffer.allocate(i13);
                            }
                            this.f30980o.position(0);
                            this.f30980o.putShort(s10);
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i14 >= i11) {
                                    break;
                                }
                                int D = this.f30972g.D();
                                if (i14 % 2 == 0) {
                                    this.f30980o.putShort((short) (D - i15));
                                } else {
                                    this.f30980o.putInt(D - i15);
                                }
                                i14++;
                                i15 = D;
                            }
                            int i16 = (i10 - this.S) - i15;
                            if (i11 % 2 == 1) {
                                this.f30980o.putInt(i16);
                            } else {
                                this.f30980o.putShort((short) i16);
                                this.f30980o.putInt(0);
                            }
                            this.f30978m.I(this.f30980o.array(), i13);
                            tVar.f(this.f30978m, i13, 1);
                            this.T += i13;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f31001i;
                    if (bArr != null) {
                        this.f30975j.I(bArr, bArr.length);
                    }
                }
                if (cVar.o(z10)) {
                    this.O |= 268435456;
                    this.f30979n.G(0);
                    int f10 = (this.f30975j.f() + i10) - this.S;
                    this.f30972g.G(4);
                    this.f30972g.d()[0] = (byte) ((f10 >> 24) & 255);
                    this.f30972g.d()[1] = (byte) ((f10 >> 16) & 255);
                    this.f30972g.d()[2] = (byte) ((f10 >> 8) & 255);
                    this.f30972g.d()[3] = (byte) (f10 & 255);
                    tVar.f(this.f30972g, 4, 2);
                    this.T += 4;
                }
                this.V = true;
            }
            int f11 = i10 + this.f30975j.f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f30994b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f30994b)) {
                if (cVar.T != null) {
                    a5.a.f(this.f30975j.f() == 0);
                    cVar.T.d(jVar);
                }
                while (true) {
                    int i17 = this.S;
                    if (i17 >= f11) {
                        break;
                    }
                    int I = I(jVar, tVar, f11 - i17);
                    this.S += I;
                    this.T += I;
                }
            } else {
                byte[] d10 = this.f30971f.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i18 = cVar.Y;
                int i19 = 4 - i18;
                while (this.S < f11) {
                    int i20 = this.U;
                    if (i20 == 0) {
                        J(jVar, d10, i19, i18);
                        this.S += i18;
                        this.f30971f.K(0);
                        this.U = this.f30971f.D();
                        this.f30970e.K(0);
                        tVar.d(this.f30970e, 4);
                        this.T += 4;
                    } else {
                        int I2 = I(jVar, tVar, i20);
                        this.S += I2;
                        this.T += I2;
                        this.U -= I2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f30994b)) {
                this.f30973h.K(0);
                tVar.d(this.f30973h, 4);
                this.T += 4;
            }
            return p();
        }
    }

    private void H(j jVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f30976k.b() < length) {
            this.f30976k.H(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f30976k.d(), 0, bArr.length);
        }
        jVar.readFully(this.f30976k.d(), bArr.length, i10);
        this.f30976k.K(0);
        this.f30976k.J(length);
    }

    private int I(j jVar, t tVar, int i10) throws IOException {
        int a10 = this.f30975j.a();
        if (a10 > 0) {
            int min = Math.min(i10, a10);
            tVar.d(this.f30975j, min);
            return min;
        }
        return tVar.b(jVar, i10, false);
    }

    private void J(j jVar, byte[] bArr, int i10, int i11) throws IOException {
        int min = Math.min(i11, this.f30975j.a());
        jVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f30975j.j(bArr, i10, min);
        }
    }

    private void h(int i10) throws h2 {
        if (this.C == null || this.D == null) {
            throw h2.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void i(int i10) throws h2 {
        if (this.f30986u != null) {
            return;
        }
        throw h2.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void j() {
        a5.a.h(this.f30967b0);
    }

    private q l(u uVar, u uVar2) {
        int i10;
        if (this.f30982q != -1 && this.f30985t != -9223372036854775807L && uVar != null && uVar.c() != 0 && uVar2 != null && uVar2.c() == uVar.c()) {
            int c10 = uVar.c();
            int[] iArr = new int[c10];
            long[] jArr = new long[c10];
            long[] jArr2 = new long[c10];
            long[] jArr3 = new long[c10];
            int i11 = 0;
            for (int i12 = 0; i12 < c10; i12++) {
                jArr3[i12] = uVar.b(i12);
                jArr[i12] = this.f30982q + uVar2.b(i12);
            }
            while (true) {
                i10 = c10 - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArr[i11] = (int) (jArr[i13] - jArr[i11]);
                jArr2[i11] = jArr3[i13] - jArr3[i11];
                i11 = i13;
            }
            iArr[i10] = (int) ((this.f30982q + this.f30981p) - jArr[i10]);
            jArr2[i10] = this.f30985t - jArr3[i10];
            long j10 = jArr2[i10];
            if (j10 <= 0) {
                a5.t.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
                iArr = Arrays.copyOf(iArr, i10);
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                jArr3 = Arrays.copyOf(jArr3, i10);
            }
            return new s3.c(iArr, jArr, jArr2, jArr3);
        }
        return new q.b(this.f30985t);
    }

    private void m(c cVar, long j10, int i10, int i11, int i12) {
        s3.u uVar = cVar.T;
        if (uVar != null) {
            uVar.c(cVar.X, j10, i10, i11, i12, cVar.f31002j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f30994b) || "S_TEXT/ASS".equals(cVar.f30994b) || "S_TEXT/WEBVTT".equals(cVar.f30994b)) {
                if (this.K > 1) {
                    a5.t.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        a5.t.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        D(cVar.f30994b, j11, this.f30976k.d());
                        int e8 = this.f30976k.e();
                        while (true) {
                            if (e8 >= this.f30976k.f()) {
                                break;
                            } else if (this.f30976k.d()[e8] == 0) {
                                this.f30976k.J(e8);
                                break;
                            } else {
                                e8++;
                            }
                        }
                        t tVar = cVar.X;
                        c0 c0Var = this.f30976k;
                        tVar.d(c0Var, c0Var.f());
                        i11 += this.f30976k.f();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    this.f30979n.G(0);
                } else {
                    int f10 = this.f30979n.f();
                    cVar.X.f(this.f30979n, f10, 2);
                    i11 += f10;
                }
            }
            cVar.X.e(j10, i10, i11, i12, cVar.f31002j);
        }
        this.F = true;
    }

    private static int[] o(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int p() {
        int i10 = this.T;
        B();
        return i10;
    }

    private static byte[] r(long j10, String str, long j11) {
        a5.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return p0.m0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    private static boolean x(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    private boolean z(p pVar, long j10) {
        if (this.f30990y) {
            this.A = j10;
            pVar.f30719a = this.f30991z;
            this.f30990y = false;
            return true;
        }
        if (this.f30987v) {
            long j11 = this.A;
            if (j11 != -1) {
                pVar.f30719a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    protected void E(int i10, long j10, long j11) throws h2 {
        j();
        if (i10 == 160) {
            this.Q = false;
            this.R = 0L;
        } else if (i10 == 174) {
            this.f30986u = new c();
        } else if (i10 == 187) {
            this.E = false;
        } else if (i10 == 19899) {
            this.f30988w = -1;
            this.f30989x = -1L;
        } else if (i10 == 20533) {
            s(i10).f31000h = true;
        } else if (i10 == 21968) {
            s(i10).f31016x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f30982q;
            if (j12 != -1 && j12 != j10) {
                throw h2.a("Multiple Segment elements not supported", null);
            }
            this.f30982q = j10;
            this.f30981p = j11;
        } else if (i10 != 475249515) {
            if (i10 == 524531317 && !this.f30987v) {
                if (this.f30969d && this.f30991z != -1) {
                    this.f30990y = true;
                    return;
                }
                this.f30967b0.o(new q.b(this.f30985t));
                this.f30987v = true;
            }
        } else {
            this.C = new u();
            this.D = new u();
        }
    }

    protected void F(int i10, String str) throws h2 {
        if (i10 == 134) {
            s(i10).f30994b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                s(i10).f30993a = str;
            } else if (i10 != 2274716) {
            } else {
                s(i10).W = str;
            }
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            throw h2.a("DocType " + str + " not supported", null);
        }
    }

    @Override // s3.i
    public final int a(j jVar, p pVar) throws IOException {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f30964a.a(jVar);
            if (z10 && z(pVar, jVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f30968c.size(); i10++) {
            c valueAt = this.f30968c.valueAt(i10);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    @Override // s3.i
    public final void b(k kVar) {
        this.f30967b0 = kVar;
    }

    @Override // s3.i
    public final boolean c(j jVar) throws IOException {
        return new f().b(jVar);
    }

    @Override // s3.i
    public void d(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f30964a.reset();
        this.f30966b.e();
        B();
        for (int i10 = 0; i10 < this.f30968c.size(); i10++) {
            this.f30968c.valueAt(i10).n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0241, code lost:
        throw n3.h2.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void k(int r22, int r23, s3.j r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.e.k(int, int, s3.j):void");
    }

    protected void n(int i10) throws h2 {
        j();
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            c cVar = this.f30968c.get(this.M);
            cVar.f();
            if (this.R > 0 && "A_OPUS".equals(cVar.f30994b)) {
                this.f30979n.H(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            int i13 = 0;
            while (i13 < this.K) {
                long j10 = this.H + ((cVar.f30997e * i13) / 1000);
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                int i16 = i11 - i15;
                m(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.G = 0;
        } else if (i10 == 174) {
            c cVar2 = (c) a5.a.h(this.f30986u);
            String str = cVar2.f30994b;
            if (str != null) {
                if (x(str)) {
                    cVar2.i(this.f30967b0, cVar2.f30995c);
                    this.f30968c.put(cVar2.f30995c, cVar2);
                }
                this.f30986u = null;
                return;
            }
            throw h2.a("CodecId is missing in TrackEntry element", null);
        } else if (i10 == 19899) {
            int i17 = this.f30988w;
            if (i17 != -1) {
                long j11 = this.f30989x;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f30991z = j11;
                        return;
                    }
                    return;
                }
            }
            throw h2.a("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i10 == 25152) {
            i(i10);
            c cVar3 = this.f30986u;
            if (cVar3.f31000h) {
                if (cVar3.f31002j != null) {
                    cVar3.f31004l = new DrmInitData(new DrmInitData.SchemeData(n3.i.f28004a, MimeTypes.VIDEO_WEBM, this.f30986u.f31002j.f30728b));
                    return;
                }
                throw h2.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
        } else if (i10 == 28032) {
            i(i10);
            c cVar4 = this.f30986u;
            if (cVar4.f31000h && cVar4.f31001i != null) {
                throw h2.a("Combining encryption and compression is not supported", null);
            }
        } else if (i10 == 357149030) {
            if (this.f30983r == -9223372036854775807L) {
                this.f30983r = 1000000L;
            }
            long j12 = this.f30984s;
            if (j12 != -9223372036854775807L) {
                this.f30985t = C(j12);
            }
        } else if (i10 == 374648427) {
            if (this.f30968c.size() != 0) {
                this.f30967b0.q();
                return;
            }
            throw h2.a("No valid tracks were found", null);
        } else if (i10 == 475249515) {
            if (!this.f30987v) {
                this.f30967b0.o(l(this.C, this.D));
                this.f30987v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    protected void q(int i10, double d10) throws h2 {
        if (i10 == 181) {
            s(i10).Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    s(i10).D = (float) d10;
                    return;
                case 21970:
                    s(i10).E = (float) d10;
                    return;
                case 21971:
                    s(i10).F = (float) d10;
                    return;
                case 21972:
                    s(i10).G = (float) d10;
                    return;
                case 21973:
                    s(i10).H = (float) d10;
                    return;
                case 21974:
                    s(i10).I = (float) d10;
                    return;
                case 21975:
                    s(i10).J = (float) d10;
                    return;
                case 21976:
                    s(i10).K = (float) d10;
                    return;
                case 21977:
                    s(i10).L = (float) d10;
                    return;
                case 21978:
                    s(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            s(i10).f31011s = (float) d10;
                            return;
                        case 30324:
                            s(i10).f31012t = (float) d10;
                            return;
                        case 30325:
                            s(i10).f31013u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f30984s = (long) d10;
        }
    }

    @Override // s3.i
    public final void release() {
    }

    protected c s(int i10) throws h2 {
        i(i10);
        return this.f30986u;
    }

    protected int t(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void u(c cVar, j jVar, int i10) throws IOException {
        if (cVar.f30999g != 1685485123 && cVar.f30999g != 1685480259) {
            jVar.j(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        jVar.readFully(bArr, 0, i10);
    }

    protected void v(c cVar, int i10, j jVar, int i11) throws IOException {
        if (i10 == 4 && "V_VP9".equals(cVar.f30994b)) {
            this.f30979n.G(i11);
            jVar.readFully(this.f30979n.d(), 0, i11);
            return;
        }
        jVar.j(i11);
    }

    protected void w(int i10, long j10) throws h2 {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw h2.a("ContentEncodingOrder " + j10 + " not supported", null);
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw h2.a("ContentEncodingScope " + j10 + " not supported", null);
        } else {
            switch (i10) {
                case 131:
                    s(i10).f30996d = (int) j10;
                    return;
                case 136:
                    s(i10).V = j10 == 1;
                    return;
                case 155:
                    this.I = C(j10);
                    return;
                case 159:
                    s(i10).O = (int) j10;
                    return;
                case 176:
                    s(i10).f31005m = (int) j10;
                    return;
                case 179:
                    h(i10);
                    this.C.a(C(j10));
                    return;
                case 186:
                    s(i10).f31006n = (int) j10;
                    return;
                case 215:
                    s(i10).f30995c = (int) j10;
                    return;
                case 231:
                    this.B = C(j10);
                    return;
                case 238:
                    this.P = (int) j10;
                    return;
                case 241:
                    if (this.E) {
                        return;
                    }
                    h(i10);
                    this.D.a(j10);
                    this.E = true;
                    return;
                case 251:
                    this.Q = true;
                    return;
                case 16871:
                    s(i10).f30999g = (int) j10;
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    throw h2.a("ContentCompAlgo " + j10 + " not supported", null);
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        throw h2.a("DocTypeReadVersion " + j10 + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    throw h2.a("EBMLReadVersion " + j10 + " not supported", null);
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    throw h2.a("ContentEncAlgo " + j10 + " not supported", null);
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    throw h2.a("AESSettingsCipherMode " + j10 + " not supported", null);
                case 21420:
                    this.f30989x = j10 + this.f30982q;
                    return;
                case 21432:
                    int i11 = (int) j10;
                    i(i10);
                    if (i11 == 0) {
                        this.f30986u.f31015w = 0;
                        return;
                    } else if (i11 == 1) {
                        this.f30986u.f31015w = 2;
                        return;
                    } else if (i11 == 3) {
                        this.f30986u.f31015w = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.f30986u.f31015w = 3;
                        return;
                    }
                case 21680:
                    s(i10).f31007o = (int) j10;
                    return;
                case 21682:
                    s(i10).f31009q = (int) j10;
                    return;
                case 21690:
                    s(i10).f31008p = (int) j10;
                    return;
                case 21930:
                    s(i10).U = j10 == 1;
                    return;
                case 21998:
                    s(i10).f30998f = (int) j10;
                    return;
                case 22186:
                    s(i10).R = j10;
                    return;
                case 22203:
                    s(i10).S = j10;
                    return;
                case 25188:
                    s(i10).P = (int) j10;
                    return;
                case 30114:
                    this.R = j10;
                    return;
                case 30321:
                    i(i10);
                    int i12 = (int) j10;
                    if (i12 == 0) {
                        this.f30986u.f31010r = 0;
                        return;
                    } else if (i12 == 1) {
                        this.f30986u.f31010r = 1;
                        return;
                    } else if (i12 == 2) {
                        this.f30986u.f31010r = 2;
                        return;
                    } else if (i12 != 3) {
                        return;
                    } else {
                        this.f30986u.f31010r = 3;
                        return;
                    }
                case 2352003:
                    s(i10).f30997e = (int) j10;
                    return;
                case 2807729:
                    this.f30983r = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            i(i10);
                            int i13 = (int) j10;
                            if (i13 == 1) {
                                this.f30986u.A = 2;
                                return;
                            } else if (i13 != 2) {
                                return;
                            } else {
                                this.f30986u.A = 1;
                                return;
                            }
                        case 21946:
                            i(i10);
                            int c10 = b5.c.c((int) j10);
                            if (c10 != -1) {
                                this.f30986u.f31018z = c10;
                                return;
                            }
                            return;
                        case 21947:
                            i(i10);
                            this.f30986u.f31016x = true;
                            int b10 = b5.c.b((int) j10);
                            if (b10 != -1) {
                                this.f30986u.f31017y = b10;
                                return;
                            }
                            return;
                        case 21948:
                            s(i10).B = (int) j10;
                            return;
                        case 21949:
                            s(i10).C = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    protected boolean y(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    e(t3.c cVar, int i10) {
        this.f30982q = -1L;
        this.f30983r = -9223372036854775807L;
        this.f30984s = -9223372036854775807L;
        this.f30985t = -9223372036854775807L;
        this.f30991z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f30964a = cVar;
        cVar.b(new b());
        this.f30969d = (i10 & 1) == 0;
        this.f30966b = new g();
        this.f30968c = new SparseArray<>();
        this.f30972g = new c0(4);
        this.f30973h = new c0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f30974i = new c0(4);
        this.f30970e = new c0(y.f526a);
        this.f30971f = new c0(4);
        this.f30975j = new c0();
        this.f30976k = new c0();
        this.f30977l = new c0(8);
        this.f30978m = new c0();
        this.f30979n = new c0();
        this.L = new int[1];
    }
}
