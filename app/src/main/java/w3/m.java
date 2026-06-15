package w3;

import a5.d0;
import a5.p0;
import a5.y;
import android.util.SparseArray;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import n3.m1;
import w3.a0;
/* compiled from: H264Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final w f32127a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32128b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f32129c;

    /* renamed from: g  reason: collision with root package name */
    private long f32133g;

    /* renamed from: i  reason: collision with root package name */
    private String f32135i;

    /* renamed from: j  reason: collision with root package name */
    private s3.t f32136j;

    /* renamed from: k  reason: collision with root package name */
    private b f32137k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32138l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f32140n;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f32134h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    private final r f32130d = new r(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final r f32131e = new r(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final r f32132f = new r(6, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f32139m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    private final a5.c0 f32141o = new a5.c0();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H264Reader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final s3.t f32142a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f32143b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f32144c;

        /* renamed from: f  reason: collision with root package name */
        private final d0 f32147f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f32148g;

        /* renamed from: h  reason: collision with root package name */
        private int f32149h;

        /* renamed from: i  reason: collision with root package name */
        private int f32150i;

        /* renamed from: j  reason: collision with root package name */
        private long f32151j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f32152k;

        /* renamed from: l  reason: collision with root package name */
        private long f32153l;

        /* renamed from: o  reason: collision with root package name */
        private boolean f32156o;

        /* renamed from: p  reason: collision with root package name */
        private long f32157p;

        /* renamed from: q  reason: collision with root package name */
        private long f32158q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f32159r;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<y.c> f32145d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<y.b> f32146e = new SparseArray<>();

        /* renamed from: m  reason: collision with root package name */
        private a f32154m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f32155n = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: H264Reader.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f32160a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f32161b;

            /* renamed from: c  reason: collision with root package name */
            private y.c f32162c;

            /* renamed from: d  reason: collision with root package name */
            private int f32163d;

            /* renamed from: e  reason: collision with root package name */
            private int f32164e;

            /* renamed from: f  reason: collision with root package name */
            private int f32165f;

            /* renamed from: g  reason: collision with root package name */
            private int f32166g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f32167h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f32168i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f32169j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f32170k;

            /* renamed from: l  reason: collision with root package name */
            private int f32171l;

            /* renamed from: m  reason: collision with root package name */
            private int f32172m;

            /* renamed from: n  reason: collision with root package name */
            private int f32173n;

            /* renamed from: o  reason: collision with root package name */
            private int f32174o;

            /* renamed from: p  reason: collision with root package name */
            private int f32175p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (this.f32160a) {
                    if (aVar.f32160a) {
                        y.c cVar = (y.c) a5.a.h(this.f32162c);
                        y.c cVar2 = (y.c) a5.a.h(aVar.f32162c);
                        return (this.f32165f == aVar.f32165f && this.f32166g == aVar.f32166g && this.f32167h == aVar.f32167h && (!this.f32168i || !aVar.f32168i || this.f32169j == aVar.f32169j) && (((i10 = this.f32163d) == (i11 = aVar.f32163d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f554l) != 0 || cVar2.f554l != 0 || (this.f32172m == aVar.f32172m && this.f32173n == aVar.f32173n)) && ((i12 != 1 || cVar2.f554l != 1 || (this.f32174o == aVar.f32174o && this.f32175p == aVar.f32175p)) && (z10 = this.f32170k) == aVar.f32170k && (!z10 || this.f32171l == aVar.f32171l))))) ? false : true;
                    }
                    return true;
                }
                return false;
            }

            public void b() {
                this.f32161b = false;
                this.f32160a = false;
            }

            public boolean d() {
                int i10;
                return this.f32161b && ((i10 = this.f32164e) == 7 || i10 == 2);
            }

            public void e(y.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f32162c = cVar;
                this.f32163d = i10;
                this.f32164e = i11;
                this.f32165f = i12;
                this.f32166g = i13;
                this.f32167h = z10;
                this.f32168i = z11;
                this.f32169j = z12;
                this.f32170k = z13;
                this.f32171l = i14;
                this.f32172m = i15;
                this.f32173n = i16;
                this.f32174o = i17;
                this.f32175p = i18;
                this.f32160a = true;
                this.f32161b = true;
            }

            public void f(int i10) {
                this.f32164e = i10;
                this.f32161b = true;
            }
        }

        public b(s3.t tVar, boolean z10, boolean z11) {
            this.f32142a = tVar;
            this.f32143b = z10;
            this.f32144c = z11;
            byte[] bArr = new byte[128];
            this.f32148g = bArr;
            this.f32147f = new d0(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            long j10 = this.f32158q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f32159r;
            this.f32142a.e(j10, z10 ? 1 : 0, (int) (this.f32151j - this.f32157p), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w3.m.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f32150i == 9 || (this.f32144c && this.f32155n.c(this.f32154m))) {
                if (z10 && this.f32156o) {
                    d(i10 + ((int) (j10 - this.f32151j)));
                }
                this.f32157p = this.f32151j;
                this.f32158q = this.f32153l;
                this.f32159r = false;
                this.f32156o = true;
            }
            if (this.f32143b) {
                z11 = this.f32155n.d();
            }
            boolean z13 = this.f32159r;
            int i11 = this.f32150i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f32159r = z14;
            return z14;
        }

        public boolean c() {
            return this.f32144c;
        }

        public void e(y.b bVar) {
            this.f32146e.append(bVar.f540a, bVar);
        }

        public void f(y.c cVar) {
            this.f32145d.append(cVar.f546d, cVar);
        }

        public void g() {
            this.f32152k = false;
            this.f32156o = false;
            this.f32155n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f32150i = i10;
            this.f32153l = j11;
            this.f32151j = j10;
            if (!this.f32143b || i10 != 1) {
                if (!this.f32144c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f32154m;
            this.f32154m = this.f32155n;
            this.f32155n = aVar;
            aVar.b();
            this.f32149h = 0;
            this.f32152k = true;
        }
    }

    public m(w wVar, boolean z10, boolean z11) {
        this.f32127a = wVar;
        this.f32128b = z10;
        this.f32129c = z11;
    }

    private void b() {
        a5.a.h(this.f32136j);
        p0.j(this.f32137k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f32138l || this.f32137k.c()) {
            this.f32130d.b(i11);
            this.f32131e.b(i11);
            if (!this.f32138l) {
                if (this.f32130d.c() && this.f32131e.c()) {
                    ArrayList arrayList = new ArrayList();
                    r rVar = this.f32130d;
                    arrayList.add(Arrays.copyOf(rVar.f32245d, rVar.f32246e));
                    r rVar2 = this.f32131e;
                    arrayList.add(Arrays.copyOf(rVar2.f32245d, rVar2.f32246e));
                    r rVar3 = this.f32130d;
                    y.c l10 = a5.y.l(rVar3.f32245d, 3, rVar3.f32246e);
                    r rVar4 = this.f32131e;
                    y.b j12 = a5.y.j(rVar4.f32245d, 3, rVar4.f32246e);
                    this.f32136j.a(new m1.b().S(this.f32135i).e0(MimeTypes.VIDEO_H264).I(a5.e.a(l10.f543a, l10.f544b, l10.f545c)).j0(l10.f548f).Q(l10.f549g).a0(l10.f550h).T(arrayList).E());
                    this.f32138l = true;
                    this.f32137k.f(l10);
                    this.f32137k.e(j12);
                    this.f32130d.d();
                    this.f32131e.d();
                }
            } else if (this.f32130d.c()) {
                r rVar5 = this.f32130d;
                this.f32137k.f(a5.y.l(rVar5.f32245d, 3, rVar5.f32246e));
                this.f32130d.d();
            } else if (this.f32131e.c()) {
                r rVar6 = this.f32131e;
                this.f32137k.e(a5.y.j(rVar6.f32245d, 3, rVar6.f32246e));
                this.f32131e.d();
            }
        }
        if (this.f32132f.b(i11)) {
            r rVar7 = this.f32132f;
            this.f32141o.I(this.f32132f.f32245d, a5.y.q(rVar7.f32245d, rVar7.f32246e));
            this.f32141o.K(4);
            this.f32127a.a(j11, this.f32141o);
        }
        if (this.f32137k.b(j10, i10, this.f32138l, this.f32140n)) {
            this.f32140n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f32138l || this.f32137k.c()) {
            this.f32130d.a(bArr, i10, i11);
            this.f32131e.a(bArr, i10, i11);
        }
        this.f32132f.a(bArr, i10, i11);
        this.f32137k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f32138l || this.f32137k.c()) {
            this.f32130d.e(i10);
            this.f32131e.e(i10);
        }
        this.f32132f.e(i10);
        this.f32137k.h(j10, i10, j11);
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        b();
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        byte[] d10 = c0Var.d();
        this.f32133g += c0Var.a();
        this.f32136j.d(c0Var, c0Var.a());
        while (true) {
            int c10 = a5.y.c(d10, e8, f10, this.f32134h);
            if (c10 == f10) {
                h(d10, e8, f10);
                return;
            }
            int f11 = a5.y.f(d10, c10);
            int i10 = c10 - e8;
            if (i10 > 0) {
                h(d10, e8, c10);
            }
            int i11 = f10 - c10;
            long j10 = this.f32133g - i11;
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f32139m);
            i(j10, f11, this.f32139m);
            e8 = c10 + 3;
        }
    }

    @Override // w3.j
    public void c() {
        this.f32133g = 0L;
        this.f32140n = false;
        this.f32139m = -9223372036854775807L;
        a5.y.a(this.f32134h);
        this.f32130d.d();
        this.f32131e.d();
        this.f32132f.d();
        b bVar = this.f32137k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32135i = dVar.b();
        s3.t f10 = kVar.f(dVar.c(), 2);
        this.f32136j = f10;
        this.f32137k = new b(f10, this.f32128b, this.f32129c);
        this.f32127a.b(kVar, dVar);
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32139m = j10;
        }
        this.f32140n |= (i10 & 2) != 0;
    }
}
