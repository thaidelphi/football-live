package o4;

import a5.c0;
import a5.p0;
import a5.t;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.b;
import n4.h;
import n4.j;
import n4.l;
import n4.m;
/* compiled from: Cea608Decoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends e {

    /* renamed from: h  reason: collision with root package name */
    private final int f29363h;

    /* renamed from: i  reason: collision with root package name */
    private final int f29364i;

    /* renamed from: j  reason: collision with root package name */
    private final int f29365j;

    /* renamed from: k  reason: collision with root package name */
    private final long f29366k;

    /* renamed from: n  reason: collision with root package name */
    private List<n4.b> f29369n;

    /* renamed from: o  reason: collision with root package name */
    private List<n4.b> f29370o;

    /* renamed from: p  reason: collision with root package name */
    private int f29371p;

    /* renamed from: q  reason: collision with root package name */
    private int f29372q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f29373r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f29374s;

    /* renamed from: t  reason: collision with root package name */
    private byte f29375t;

    /* renamed from: u  reason: collision with root package name */
    private byte f29376u;

    /* renamed from: w  reason: collision with root package name */
    private boolean f29378w;

    /* renamed from: x  reason: collision with root package name */
    private long f29379x;

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f29360y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f29361z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, j3.c.b.f17911b, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, j3.c.b.f17912c, j3.c.b.f17913d, 235, j3.c.b.f17916g, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, j3.c.b.f17915f, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    private final c0 f29362g = new c0();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<C0326a> f29367l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private C0326a f29368m = new C0326a(0, 4);

    /* renamed from: v  reason: collision with root package name */
    private int f29377v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cea608Decoder.java */
    /* renamed from: o4.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0326a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0327a> f29380a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f29381b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f29382c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        private int f29383d;

        /* renamed from: e  reason: collision with root package name */
        private int f29384e;

        /* renamed from: f  reason: collision with root package name */
        private int f29385f;

        /* renamed from: g  reason: collision with root package name */
        private int f29386g;

        /* renamed from: h  reason: collision with root package name */
        private int f29387h;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: Cea608Decoder.java */
        /* renamed from: o4.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0327a {

            /* renamed from: a  reason: collision with root package name */
            public final int f29388a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f29389b;

            /* renamed from: c  reason: collision with root package name */
            public int f29390c;

            public C0327a(int i10, boolean z10, int i11) {
                this.f29388a = i10;
                this.f29389b = z10;
                this.f29390c = i11;
            }
        }

        public C0326a(int i10, int i11) {
            j(i10);
            this.f29387h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29382c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f29380a.size()) {
                C0327a c0327a = this.f29380a.get(i10);
                boolean z11 = c0327a.f29389b;
                int i16 = c0327a.f29388a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0327a.f29390c;
                i10++;
                if (i17 != (i10 < this.f29380a.size() ? this.f29380a.get(i10).f29390c : length)) {
                    if (i12 != -1 && !z11) {
                        q(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i13 != -1 && !z10) {
                        o(spannableStringBuilder, i13, i17);
                        i13 = -1;
                    } else if (i13 == -1 && z10) {
                        i13 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i11, i17, i14);
                        i14 = i15;
                        i11 = i17;
                    }
                }
            }
            if (i12 != -1 && i12 != length) {
                q(spannableStringBuilder, i12, length);
            }
            if (i13 != -1 && i13 != length) {
                o(spannableStringBuilder, i13, length);
            }
            if (i11 != length) {
                n(spannableStringBuilder, i11, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f29382c.length() < 32) {
                this.f29382c.append(c10);
            }
        }

        public void f() {
            int length = this.f29382c.length();
            if (length > 0) {
                this.f29382c.delete(length - 1, length);
                for (int size = this.f29380a.size() - 1; size >= 0; size--) {
                    C0327a c0327a = this.f29380a.get(size);
                    int i10 = c0327a.f29390c;
                    if (i10 != length) {
                        return;
                    }
                    c0327a.f29390c = i10 - 1;
                }
            }
        }

        public n4.b g(int i10) {
            float f10;
            int i11 = this.f29384e + this.f29385f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f29381b.size(); i13++) {
                spannableStringBuilder.append(p0.Y0(this.f29381b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(p0.Y0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f29386g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f29386g != 2 || i14 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f29383d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f29386g == 1) {
                i15 -= this.f29387h - 1;
            }
            return new b.C0322b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f29380a.isEmpty() && this.f29381b.isEmpty() && this.f29382c.length() == 0;
        }

        public void j(int i10) {
            this.f29386g = i10;
            this.f29380a.clear();
            this.f29381b.clear();
            this.f29382c.setLength(0);
            this.f29383d = 15;
            this.f29384e = 0;
            this.f29385f = 0;
        }

        public void k() {
            this.f29381b.add(h());
            this.f29382c.setLength(0);
            this.f29380a.clear();
            int min = Math.min(this.f29387h, this.f29383d);
            while (this.f29381b.size() >= min) {
                this.f29381b.remove(0);
            }
        }

        public void l(int i10) {
            this.f29386g = i10;
        }

        public void m(int i10) {
            this.f29387h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f29380a.add(new C0327a(i10, z10, this.f29382c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f29366k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f29363h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f29365j = 0;
            this.f29364i = 0;
        } else if (i10 == 2) {
            this.f29365j = 1;
            this.f29364i = 0;
        } else if (i10 == 3) {
            this.f29365j = 0;
            this.f29364i = 1;
        } else if (i10 != 4) {
            t.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f29365j = 0;
            this.f29364i = 0;
        } else {
            this.f29365j = 1;
            this.f29364i = 1;
        }
        M(0);
        L();
        this.f29378w = true;
        this.f29379x = -9223372036854775807L;
    }

    private static boolean A(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean E(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean F(boolean z10, byte b10, byte b11) {
        if (z10 && E(b10)) {
            if (this.f29374s && this.f29375t == b10 && this.f29376u == b11) {
                this.f29374s = false;
                return true;
            }
            this.f29374s = true;
            this.f29375t = b10;
            this.f29376u = b11;
        } else {
            this.f29374s = false;
        }
        return false;
    }

    private static boolean G(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean H(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean J(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void K(byte b10, byte b11) {
        if (J(b10)) {
            this.f29378w = false;
        } else if (G(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f29378w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f29378w = true;
        }
    }

    private void L() {
        this.f29368m.j(this.f29371p);
        this.f29367l.clear();
        this.f29367l.add(this.f29368m);
    }

    private void M(int i10) {
        int i11 = this.f29371p;
        if (i11 == i10) {
            return;
        }
        this.f29371p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f29367l.size(); i12++) {
                this.f29367l.get(i12).l(i10);
            }
            return;
        }
        L();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f29369n = Collections.emptyList();
        }
    }

    private void N(int i10) {
        this.f29372q = i10;
        this.f29368m.m(i10);
    }

    private boolean O() {
        return (this.f29366k == -9223372036854775807L || this.f29379x == -9223372036854775807L || j() - this.f29379x < this.f29366k) ? false : true;
    }

    private boolean P(byte b10) {
        if (z(b10)) {
            this.f29377v = q(b10);
        }
        return this.f29377v == this.f29365j;
    }

    private static char p(byte b10) {
        return (char) B[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int q(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<n4.b> r() {
        int size = this.f29367l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            n4.b g10 = this.f29367l.get(i11).g(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f28605i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            n4.b bVar = (n4.b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f28605i != i10) {
                    bVar = (n4.b) a5.a.e(this.f29367l.get(i12).g(i10));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char s(byte b10) {
        return (char) D[b10 & 31];
    }

    private static char t(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char u(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return s(b11);
        }
        return t(b11);
    }

    private static char v(byte b10) {
        return (char) C[b10 & 15];
    }

    private void w(byte b10) {
        this.f29368m.e(' ');
        this.f29368m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void x(byte b10) {
        if (b10 == 32) {
            M(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    M(1);
                    N(2);
                    return;
                case 38:
                    M(1);
                    N(3);
                    return;
                case 39:
                    M(1);
                    N(4);
                    return;
                default:
                    int i10 = this.f29371p;
                    if (i10 == 0) {
                        return;
                    }
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f29369n = Collections.emptyList();
                                int i11 = this.f29371p;
                                if (i11 == 1 || i11 == 3) {
                                    L();
                                    return;
                                }
                                return;
                            case 45:
                                if (i10 != 1 || this.f29368m.i()) {
                                    return;
                                }
                                this.f29368m.k();
                                return;
                            case 46:
                                L();
                                return;
                            case 47:
                                this.f29369n = r();
                                L();
                                return;
                            default:
                                return;
                        }
                    }
                    this.f29368m.f();
                    return;
            }
        } else {
            M(3);
        }
    }

    private void y(byte b10, byte b11) {
        int i10 = f29360y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f29368m.f29383d) {
            if (this.f29371p != 1 && !this.f29368m.i()) {
                C0326a c0326a = new C0326a(this.f29371p, this.f29372q);
                this.f29368m = c0326a;
                this.f29367l.add(c0326a);
            }
            this.f29368m.f29383d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f29368m.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f29368m.f29384e = f29361z[i11];
        }
    }

    private static boolean z(byte b10) {
        return (b10 & 224) == 0;
    }

    @Override // o4.e, n4.i
    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    @Override // o4.e
    protected h e() {
        List<n4.b> list = this.f29369n;
        this.f29370o = list;
        return new f((List) a5.a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0018 A[SYNTHETIC] */
    @Override // o4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void f(n4.l r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.a.f(n4.l):void");
    }

    @Override // o4.e, q3.d
    public void flush() {
        super.flush();
        this.f29369n = null;
        this.f29370o = null;
        M(0);
        N(4);
        L();
        this.f29373r = false;
        this.f29374s = false;
        this.f29375t = (byte) 0;
        this.f29376u = (byte) 0;
        this.f29377v = 0;
        this.f29378w = true;
        this.f29379x = -9223372036854775807L;
    }

    @Override // o4.e
    public /* bridge */ /* synthetic */ l g() throws j {
        return super.d();
    }

    @Override // o4.e, q3.d
    /* renamed from: h */
    public m b() throws j {
        m i10;
        m b10 = super.b();
        if (b10 != null) {
            return b10;
        }
        if (!O() || (i10 = i()) == null) {
            return null;
        }
        this.f29369n = Collections.emptyList();
        this.f29379x = -9223372036854775807L;
        i10.q(j(), e(), Long.MAX_VALUE);
        return i10;
    }

    @Override // o4.e
    protected boolean k() {
        return this.f29369n != this.f29370o;
    }

    @Override // o4.e
    public /* bridge */ /* synthetic */ void l(l lVar) throws j {
        super.c(lVar);
    }

    @Override // o4.e, q3.d
    public void release() {
    }
}
