package o4;

import a5.b0;
import a5.c0;
import a5.t;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import n4.b;
import n4.h;
import n4.j;
import n4.l;
import n4.m;
import o4.c;
/* compiled from: Cea708Decoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends e {

    /* renamed from: g  reason: collision with root package name */
    private final c0 f29392g = new c0();

    /* renamed from: h  reason: collision with root package name */
    private final b0 f29393h = new b0();

    /* renamed from: i  reason: collision with root package name */
    private int f29394i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f29395j;

    /* renamed from: k  reason: collision with root package name */
    private final int f29396k;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f29397l;

    /* renamed from: m  reason: collision with root package name */
    private b f29398m;

    /* renamed from: n  reason: collision with root package name */
    private List<n4.b> f29399n;

    /* renamed from: o  reason: collision with root package name */
    private List<n4.b> f29400o;

    /* renamed from: p  reason: collision with root package name */
    private C0328c f29401p;

    /* renamed from: q  reason: collision with root package name */
    private int f29402q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cea708Decoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private static final Comparator<a> f29403c = new Comparator() { // from class: o4.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c10;
                c10 = c.a.c((c.a) obj, (c.a) obj2);
                return c10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final n4.b f29404a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29405b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0322b n10 = new b.C0322b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f29404a = n10.a();
            this.f29405b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f29405b, aVar.f29405b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cea708Decoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w  reason: collision with root package name */
        public static final int f29406w = h(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f29407x;

        /* renamed from: y  reason: collision with root package name */
        public static final int f29408y;

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f29409z;

        /* renamed from: a  reason: collision with root package name */
        private final List<SpannableString> f29410a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f29411b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f29412c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29413d;

        /* renamed from: e  reason: collision with root package name */
        private int f29414e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f29415f;

        /* renamed from: g  reason: collision with root package name */
        private int f29416g;

        /* renamed from: h  reason: collision with root package name */
        private int f29417h;

        /* renamed from: i  reason: collision with root package name */
        private int f29418i;

        /* renamed from: j  reason: collision with root package name */
        private int f29419j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f29420k;

        /* renamed from: l  reason: collision with root package name */
        private int f29421l;

        /* renamed from: m  reason: collision with root package name */
        private int f29422m;

        /* renamed from: n  reason: collision with root package name */
        private int f29423n;

        /* renamed from: o  reason: collision with root package name */
        private int f29424o;

        /* renamed from: p  reason: collision with root package name */
        private int f29425p;

        /* renamed from: q  reason: collision with root package name */
        private int f29426q;

        /* renamed from: r  reason: collision with root package name */
        private int f29427r;

        /* renamed from: s  reason: collision with root package name */
        private int f29428s;

        /* renamed from: t  reason: collision with root package name */
        private int f29429t;

        /* renamed from: u  reason: collision with root package name */
        private int f29430u;

        /* renamed from: v  reason: collision with root package name */
        private int f29431v;

        static {
            int h10 = h(0, 0, 0, 0);
            f29407x = h10;
            int h11 = h(0, 0, 0, 3);
            f29408y = h11;
            f29409z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                a5.a.c(r4, r0, r1)
                a5.a.c(r5, r0, r1)
                a5.a.c(r6, r0, r1)
                a5.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == '\n') {
                this.f29410a.add(d());
                this.f29411b.clear();
                if (this.f29425p != -1) {
                    this.f29425p = 0;
                }
                if (this.f29426q != -1) {
                    this.f29426q = 0;
                }
                if (this.f29427r != -1) {
                    this.f29427r = 0;
                }
                if (this.f29429t != -1) {
                    this.f29429t = 0;
                }
                while (true) {
                    if ((!this.f29420k || this.f29410a.size() < this.f29419j) && this.f29410a.size() < 15) {
                        return;
                    }
                    this.f29410a.remove(0);
                }
            } else {
                this.f29411b.append(c10);
            }
        }

        public void b() {
            int length = this.f29411b.length();
            if (length > 0) {
                this.f29411b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public o4.c.a c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.c.b.c():o4.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29411b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f29425p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f29425p, length, 33);
                }
                if (this.f29426q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f29426q, length, 33);
                }
                if (this.f29427r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f29428s), this.f29427r, length, 33);
                }
                if (this.f29429t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f29430u), this.f29429t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f29410a.clear();
            this.f29411b.clear();
            this.f29425p = -1;
            this.f29426q = -1;
            this.f29427r = -1;
            this.f29429t = -1;
            this.f29431v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f29412c = true;
            this.f29413d = z10;
            this.f29420k = z11;
            this.f29414e = i10;
            this.f29415f = z13;
            this.f29416g = i11;
            this.f29417h = i12;
            this.f29418i = i15;
            int i18 = i13 + 1;
            if (this.f29419j != i18) {
                this.f29419j = i18;
                while (true) {
                    if ((!z11 || this.f29410a.size() < this.f29419j) && this.f29410a.size() < 15) {
                        break;
                    }
                    this.f29410a.remove(0);
                }
            }
            if (i16 != 0 && this.f29422m != i16) {
                this.f29422m = i16;
                int i19 = i16 - 1;
                q(D[i19], f29408y, C[i19], 0, A[i19], B[i19], f29409z[i19]);
            }
            if (i17 == 0 || this.f29423n == i17) {
                return;
            }
            this.f29423n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f29406w, G[i20], f29407x);
        }

        public boolean i() {
            return this.f29412c;
        }

        public boolean j() {
            return !i() || (this.f29410a.isEmpty() && this.f29411b.length() == 0);
        }

        public boolean k() {
            return this.f29413d;
        }

        public void l() {
            e();
            this.f29412c = false;
            this.f29413d = false;
            this.f29414e = 4;
            this.f29415f = false;
            this.f29416g = 0;
            this.f29417h = 0;
            this.f29418i = 0;
            this.f29419j = 15;
            this.f29420k = true;
            this.f29421l = 0;
            this.f29422m = 0;
            this.f29423n = 0;
            int i10 = f29407x;
            this.f29424o = i10;
            this.f29428s = f29406w;
            this.f29430u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f29425p != -1) {
                if (!z10) {
                    this.f29411b.setSpan(new StyleSpan(2), this.f29425p, this.f29411b.length(), 33);
                    this.f29425p = -1;
                }
            } else if (z10) {
                this.f29425p = this.f29411b.length();
            }
            if (this.f29426q == -1) {
                if (z11) {
                    this.f29426q = this.f29411b.length();
                }
            } else if (z11) {
            } else {
                this.f29411b.setSpan(new UnderlineSpan(), this.f29426q, this.f29411b.length(), 33);
                this.f29426q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f29427r != -1 && this.f29428s != i10) {
                this.f29411b.setSpan(new ForegroundColorSpan(this.f29428s), this.f29427r, this.f29411b.length(), 33);
            }
            if (i10 != f29406w) {
                this.f29427r = this.f29411b.length();
                this.f29428s = i10;
            }
            if (this.f29429t != -1 && this.f29430u != i11) {
                this.f29411b.setSpan(new BackgroundColorSpan(this.f29430u), this.f29429t, this.f29411b.length(), 33);
            }
            if (i11 != f29407x) {
                this.f29429t = this.f29411b.length();
                this.f29430u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f29431v != i10) {
                a('\n');
            }
            this.f29431v = i10;
        }

        public void p(boolean z10) {
            this.f29413d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f29424o = i10;
            this.f29421l = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cea708Decoder.java */
    /* renamed from: o4.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0328c {

        /* renamed from: a  reason: collision with root package name */
        public final int f29432a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29433b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f29434c;

        /* renamed from: d  reason: collision with root package name */
        int f29435d = 0;

        public C0328c(int i10, int i11) {
            this.f29432a = i10;
            this.f29433b = i11;
            this.f29434c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f29396k = i10 == -1 ? 1 : i10;
        this.f29395j = (list == null || !a5.e.h(list)) ? false : z10;
        this.f29397l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f29397l[i11] = new b();
        }
        this.f29398m = this.f29397l[0];
    }

    private void A() {
        int h10 = b.h(this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2));
        int h11 = b.h(this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2));
        this.f29393h.q(2);
        this.f29398m.n(h10, h11, b.g(this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2)));
    }

    private void B() {
        this.f29393h.q(4);
        int h10 = this.f29393h.h(4);
        this.f29393h.q(2);
        this.f29398m.o(h10, this.f29393h.h(6));
    }

    private void C() {
        int h10 = b.h(this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2));
        int h11 = this.f29393h.h(2);
        int g10 = b.g(this.f29393h.h(2), this.f29393h.h(2), this.f29393h.h(2));
        if (this.f29393h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f29393h.g();
        int h12 = this.f29393h.h(2);
        int h13 = this.f29393h.h(2);
        int h14 = this.f29393h.h(2);
        this.f29393h.q(8);
        this.f29398m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void D() {
        C0328c c0328c = this.f29401p;
        if (c0328c.f29435d != (c0328c.f29433b * 2) - 1) {
            t.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f29401p.f29433b * 2) - 1) + ", but current index is " + this.f29401p.f29435d + " (sequence number " + this.f29401p.f29432a + ");");
        }
        boolean z10 = false;
        b0 b0Var = this.f29393h;
        C0328c c0328c2 = this.f29401p;
        b0Var.n(c0328c2.f29434c, c0328c2.f29435d);
        while (true) {
            if (this.f29393h.b() <= 0) {
                break;
            }
            int h10 = this.f29393h.h(3);
            int h11 = this.f29393h.h(5);
            if (h10 == 7) {
                this.f29393h.q(2);
                h10 = this.f29393h.h(6);
                if (h10 < 7) {
                    t.i("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    t.i("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f29396k) {
                this.f29393h.r(h11);
            } else {
                int e8 = this.f29393h.e() + (h11 * 8);
                while (this.f29393h.e() < e8) {
                    int h12 = this.f29393h.h(8);
                    if (h12 == 16) {
                        int h13 = this.f29393h.h(8);
                        if (h13 <= 31) {
                            s(h13);
                        } else {
                            if (h13 <= 127) {
                                x(h13);
                            } else if (h13 <= 159) {
                                t(h13);
                            } else if (h13 <= 255) {
                                y(h13);
                            } else {
                                t.i("Cea708Decoder", "Invalid extended command: " + h13);
                            }
                            z10 = true;
                        }
                    } else if (h12 <= 31) {
                        q(h12);
                    } else {
                        if (h12 <= 127) {
                            v(h12);
                        } else if (h12 <= 159) {
                            r(h12);
                        } else if (h12 <= 255) {
                            w(h12);
                        } else {
                            t.i("Cea708Decoder", "Invalid base command: " + h12);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f29399n = p();
        }
    }

    private void E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f29397l[i10].l();
        }
    }

    private void o() {
        if (this.f29401p == null) {
            return;
        }
        D();
        this.f29401p = null;
    }

    private List<n4.b> p() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f29397l[i10].j() && this.f29397l[i10].k() && (c10 = this.f29397l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f29403c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f29404a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f29399n = p();
            } else if (i10 != 8) {
                switch (i10) {
                    case 12:
                        E();
                        return;
                    case 13:
                        this.f29398m.a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i10 >= 17 && i10 <= 23) {
                            t.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                            this.f29393h.q(8);
                            return;
                        } else if (i10 >= 24 && i10 <= 31) {
                            t.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                            this.f29393h.q(16);
                            return;
                        } else {
                            t.i("Cea708Decoder", "Invalid C0 command: " + i10);
                            return;
                        }
                }
            } else {
                this.f29398m.b();
            }
        }
    }

    private void r(int i10) {
        b bVar;
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f29402q != i12) {
                    this.f29402q = i12;
                    this.f29398m = this.f29397l[i12];
                    return;
                }
                return;
            case 136:
                while (i11 <= 8) {
                    if (this.f29393h.g()) {
                        this.f29397l[8 - i11].e();
                    }
                    i11++;
                }
                return;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f29393h.g()) {
                        this.f29397l[8 - i13].p(true);
                    }
                }
                return;
            case 138:
                while (i11 <= 8) {
                    if (this.f29393h.g()) {
                        this.f29397l[8 - i11].p(false);
                    }
                    i11++;
                }
                return;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f29393h.g()) {
                        this.f29397l[8 - i14].p(!bVar.k());
                    }
                }
                return;
            case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                while (i11 <= 8) {
                    if (this.f29393h.g()) {
                        this.f29397l[8 - i11].l();
                    }
                    i11++;
                }
                return;
            case 141:
                this.f29393h.q(8);
                return;
            case 142:
                return;
            case 143:
                E();
                return;
            case 144:
                if (!this.f29398m.i()) {
                    this.f29393h.q(16);
                    return;
                } else {
                    z();
                    return;
                }
            case 145:
                if (!this.f29398m.i()) {
                    this.f29393h.q(24);
                    return;
                } else {
                    A();
                    return;
                }
            case 146:
                if (!this.f29398m.i()) {
                    this.f29393h.q(16);
                    return;
                } else {
                    B();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
            default:
                t.i("Cea708Decoder", "Invalid C1 command: " + i10);
                return;
            case 151:
                if (!this.f29398m.i()) {
                    this.f29393h.q(32);
                    return;
                } else {
                    C();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                u(i15);
                if (this.f29402q != i15) {
                    this.f29402q = i15;
                    this.f29398m = this.f29397l[i15];
                    return;
                }
                return;
        }
    }

    private void s(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f29393h.q(8);
        } else if (i10 <= 23) {
            this.f29393h.q(16);
        } else if (i10 <= 31) {
            this.f29393h.q(24);
        }
    }

    private void t(int i10) {
        if (i10 <= 135) {
            this.f29393h.q(32);
        } else if (i10 <= 143) {
            this.f29393h.q(40);
        } else if (i10 <= 159) {
            this.f29393h.q(2);
            this.f29393h.q(this.f29393h.h(6) * 8);
        }
    }

    private void u(int i10) {
        b bVar = this.f29397l[i10];
        this.f29393h.q(2);
        boolean g10 = this.f29393h.g();
        boolean g11 = this.f29393h.g();
        boolean g12 = this.f29393h.g();
        int h10 = this.f29393h.h(3);
        boolean g13 = this.f29393h.g();
        int h11 = this.f29393h.h(7);
        int h12 = this.f29393h.h(8);
        int h13 = this.f29393h.h(4);
        int h14 = this.f29393h.h(4);
        this.f29393h.q(2);
        int h15 = this.f29393h.h(6);
        this.f29393h.q(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f29393h.h(3), this.f29393h.h(3));
    }

    private void v(int i10) {
        if (i10 == 127) {
            this.f29398m.a((char) 9835);
        } else {
            this.f29398m.a((char) (i10 & 255));
        }
    }

    private void w(int i10) {
        this.f29398m.a((char) (i10 & 255));
    }

    private void x(int i10) {
        if (i10 == 32) {
            this.f29398m.a(' ');
        } else if (i10 == 33) {
            this.f29398m.a((char) 160);
        } else if (i10 == 37) {
            this.f29398m.a((char) 8230);
        } else if (i10 == 42) {
            this.f29398m.a((char) 352);
        } else if (i10 == 44) {
            this.f29398m.a((char) 338);
        } else if (i10 == 63) {
            this.f29398m.a((char) 376);
        } else if (i10 == 57) {
            this.f29398m.a((char) 8482);
        } else if (i10 == 58) {
            this.f29398m.a((char) 353);
        } else if (i10 == 60) {
            this.f29398m.a((char) 339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f29398m.a((char) 9608);
                    return;
                case 49:
                    this.f29398m.a((char) 8216);
                    return;
                case 50:
                    this.f29398m.a((char) 8217);
                    return;
                case 51:
                    this.f29398m.a((char) 8220);
                    return;
                case 52:
                    this.f29398m.a((char) 8221);
                    return;
                case 53:
                    this.f29398m.a((char) 8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f29398m.a((char) 8539);
                            return;
                        case 119:
                            this.f29398m.a((char) 8540);
                            return;
                        case 120:
                            this.f29398m.a((char) 8541);
                            return;
                        case 121:
                            this.f29398m.a((char) 8542);
                            return;
                        case 122:
                            this.f29398m.a((char) 9474);
                            return;
                        case 123:
                            this.f29398m.a((char) 9488);
                            return;
                        case 124:
                            this.f29398m.a((char) 9492);
                            return;
                        case 125:
                            this.f29398m.a((char) 9472);
                            return;
                        case 126:
                            this.f29398m.a((char) 9496);
                            return;
                        case 127:
                            this.f29398m.a((char) 9484);
                            return;
                        default:
                            t.i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            this.f29398m.a((char) 8480);
        }
    }

    private void y(int i10) {
        if (i10 == 160) {
            this.f29398m.a((char) 13252);
            return;
        }
        t.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f29398m.a('_');
    }

    private void z() {
        this.f29398m.m(this.f29393h.h(4), this.f29393h.h(2), this.f29393h.h(2), this.f29393h.g(), this.f29393h.g(), this.f29393h.h(3), this.f29393h.h(3));
    }

    @Override // o4.e, n4.i
    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    @Override // o4.e
    protected h e() {
        List<n4.b> list = this.f29399n;
        this.f29400o = list;
        return new f((List) a5.a.e(list));
    }

    @Override // o4.e
    protected void f(l lVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a5.a.e(lVar.f30091c);
        this.f29392g.I(byteBuffer.array(), byteBuffer.limit());
        while (this.f29392g.a() >= 3) {
            int z10 = this.f29392g.z() & 7;
            int i10 = z10 & 3;
            boolean z11 = (z10 & 4) == 4;
            byte z12 = (byte) this.f29392g.z();
            byte z13 = (byte) this.f29392g.z();
            if (i10 == 2 || i10 == 3) {
                if (z11) {
                    if (i10 == 3) {
                        o();
                        int i11 = (z12 & 192) >> 6;
                        int i12 = this.f29394i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            E();
                            t.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f29394i + " current=" + i11);
                        }
                        this.f29394i = i11;
                        int i13 = z12 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0328c c0328c = new C0328c(i11, i13);
                        this.f29401p = c0328c;
                        byte[] bArr = c0328c.f29434c;
                        int i14 = c0328c.f29435d;
                        c0328c.f29435d = i14 + 1;
                        bArr[i14] = z13;
                    } else {
                        a5.a.a(i10 == 2);
                        C0328c c0328c2 = this.f29401p;
                        if (c0328c2 == null) {
                            t.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0328c2.f29434c;
                            int i15 = c0328c2.f29435d;
                            int i16 = i15 + 1;
                            c0328c2.f29435d = i16;
                            bArr2[i15] = z12;
                            c0328c2.f29435d = i16 + 1;
                            bArr2[i16] = z13;
                        }
                    }
                    C0328c c0328c3 = this.f29401p;
                    if (c0328c3.f29435d == (c0328c3.f29433b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // o4.e, q3.d
    public void flush() {
        super.flush();
        this.f29399n = null;
        this.f29400o = null;
        this.f29402q = 0;
        this.f29398m = this.f29397l[0];
        E();
        this.f29401p = null;
    }

    @Override // o4.e
    public /* bridge */ /* synthetic */ l g() throws j {
        return super.d();
    }

    @Override // o4.e
    public /* bridge */ /* synthetic */ m h() throws j {
        return super.b();
    }

    @Override // o4.e
    protected boolean k() {
        return this.f29399n != this.f29400o;
    }

    @Override // o4.e
    public /* bridge */ /* synthetic */ void l(l lVar) throws j {
        super.c(lVar);
    }

    @Override // o4.e, q3.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
