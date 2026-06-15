package v3;

import a5.c0;
import a5.l0;
import a5.p0;
import a5.y;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import n3.h2;
import n3.m1;
import s3.m;
import s3.n;
import s3.p;
import s3.q;
import s3.t;
import v3.a;
/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements s3.i {
    public static final m I = t3.d.f30956a;
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final m1 K = new m1.b().e0("application/x-emsg").E();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private s3.k E;
    private t[] F;
    private t[] G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final int f31793a;

    /* renamed from: b  reason: collision with root package name */
    private final i f31794b;

    /* renamed from: c  reason: collision with root package name */
    private final List<m1> f31795c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<b> f31796d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f31797e;

    /* renamed from: f  reason: collision with root package name */
    private final c0 f31798f;

    /* renamed from: g  reason: collision with root package name */
    private final c0 f31799g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f31800h;

    /* renamed from: i  reason: collision with root package name */
    private final c0 f31801i;

    /* renamed from: j  reason: collision with root package name */
    private final l0 f31802j;

    /* renamed from: k  reason: collision with root package name */
    private final a4.b f31803k;

    /* renamed from: l  reason: collision with root package name */
    private final c0 f31804l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque<a.C0367a> f31805m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<a> f31806n;

    /* renamed from: o  reason: collision with root package name */
    private final t f31807o;

    /* renamed from: p  reason: collision with root package name */
    private int f31808p;

    /* renamed from: q  reason: collision with root package name */
    private int f31809q;

    /* renamed from: r  reason: collision with root package name */
    private long f31810r;

    /* renamed from: s  reason: collision with root package name */
    private int f31811s;

    /* renamed from: t  reason: collision with root package name */
    private c0 f31812t;

    /* renamed from: u  reason: collision with root package name */
    private long f31813u;

    /* renamed from: v  reason: collision with root package name */
    private int f31814v;

    /* renamed from: w  reason: collision with root package name */
    private long f31815w;

    /* renamed from: x  reason: collision with root package name */
    private long f31816x;

    /* renamed from: y  reason: collision with root package name */
    private long f31817y;

    /* renamed from: z  reason: collision with root package name */
    private b f31818z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f31819a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f31820b;

        /* renamed from: c  reason: collision with root package name */
        public final int f31821c;

        public a(long j10, boolean z10, int i10) {
            this.f31819a = j10;
            this.f31820b = z10;
            this.f31821c = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final t f31822a;

        /* renamed from: d  reason: collision with root package name */
        public l f31825d;

        /* renamed from: e  reason: collision with root package name */
        public c f31826e;

        /* renamed from: f  reason: collision with root package name */
        public int f31827f;

        /* renamed from: g  reason: collision with root package name */
        public int f31828g;

        /* renamed from: h  reason: collision with root package name */
        public int f31829h;

        /* renamed from: i  reason: collision with root package name */
        public int f31830i;

        /* renamed from: l  reason: collision with root package name */
        private boolean f31833l;

        /* renamed from: b  reason: collision with root package name */
        public final k f31823b = new k();

        /* renamed from: c  reason: collision with root package name */
        public final c0 f31824c = new c0();

        /* renamed from: j  reason: collision with root package name */
        private final c0 f31831j = new c0(1);

        /* renamed from: k  reason: collision with root package name */
        private final c0 f31832k = new c0();

        public b(t tVar, l lVar, c cVar) {
            this.f31822a = tVar;
            this.f31825d = lVar;
            this.f31826e = cVar;
            j(lVar, cVar);
        }

        public int c() {
            int i10;
            if (!this.f31833l) {
                i10 = this.f31825d.f31878g[this.f31827f];
            } else {
                i10 = this.f31823b.f31864k[this.f31827f] ? 1 : 0;
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            if (!this.f31833l) {
                return this.f31825d.f31874c[this.f31827f];
            }
            return this.f31823b.f31860g[this.f31829h];
        }

        public long e() {
            if (!this.f31833l) {
                return this.f31825d.f31877f[this.f31827f];
            }
            return this.f31823b.c(this.f31827f);
        }

        public int f() {
            if (!this.f31833l) {
                return this.f31825d.f31875d[this.f31827f];
            }
            return this.f31823b.f31862i[this.f31827f];
        }

        public j g() {
            if (this.f31833l) {
                int i10 = ((c) p0.j(this.f31823b.f31854a)).f31782a;
                j jVar = this.f31823b.f31867n;
                if (jVar == null) {
                    jVar = this.f31825d.f31872a.a(i10);
                }
                if (jVar == null || !jVar.f31849a) {
                    return null;
                }
                return jVar;
            }
            return null;
        }

        public boolean h() {
            this.f31827f++;
            if (this.f31833l) {
                int i10 = this.f31828g + 1;
                this.f31828g = i10;
                int[] iArr = this.f31823b.f31861h;
                int i11 = this.f31829h;
                if (i10 == iArr[i11]) {
                    this.f31829h = i11 + 1;
                    this.f31828g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        public int i(int i10, int i11) {
            c0 c0Var;
            j g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f31852d;
            if (i12 != 0) {
                c0Var = this.f31823b.f31868o;
            } else {
                byte[] bArr = (byte[]) p0.j(g10.f31853e);
                this.f31832k.I(bArr, bArr.length);
                c0 c0Var2 = this.f31832k;
                i12 = bArr.length;
                c0Var = c0Var2;
            }
            boolean g11 = this.f31823b.g(this.f31827f);
            boolean z10 = g11 || i11 != 0;
            this.f31831j.d()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f31831j.K(0);
            this.f31822a.f(this.f31831j, 1, 1);
            this.f31822a.f(c0Var, i12, 1);
            if (z10) {
                if (!g11) {
                    this.f31824c.G(8);
                    byte[] d10 = this.f31824c.d();
                    d10[0] = 0;
                    d10[1] = 1;
                    d10[2] = (byte) ((i11 >> 8) & 255);
                    d10[3] = (byte) (i11 & 255);
                    d10[4] = (byte) ((i10 >> 24) & 255);
                    d10[5] = (byte) ((i10 >> 16) & 255);
                    d10[6] = (byte) ((i10 >> 8) & 255);
                    d10[7] = (byte) (i10 & 255);
                    this.f31822a.f(this.f31824c, 8, 1);
                    return i12 + 1 + 8;
                }
                c0 c0Var3 = this.f31823b.f31868o;
                int F = c0Var3.F();
                c0Var3.L(-2);
                int i13 = (F * 6) + 2;
                if (i11 != 0) {
                    this.f31824c.G(i13);
                    byte[] d11 = this.f31824c.d();
                    c0Var3.j(d11, 0, i13);
                    int i14 = (((d11[2] & 255) << 8) | (d11[3] & 255)) + i11;
                    d11[2] = (byte) ((i14 >> 8) & 255);
                    d11[3] = (byte) (i14 & 255);
                    c0Var3 = this.f31824c;
                }
                this.f31822a.f(c0Var3, i13, 1);
                return i12 + 1 + i13;
            }
            return i12 + 1;
        }

        public void j(l lVar, c cVar) {
            this.f31825d = lVar;
            this.f31826e = cVar;
            this.f31822a.a(lVar.f31872a.f31843f);
            k();
        }

        public void k() {
            this.f31823b.f();
            this.f31827f = 0;
            this.f31829h = 0;
            this.f31828g = 0;
            this.f31830i = 0;
            this.f31833l = false;
        }

        public void l(long j10) {
            int i10 = this.f31827f;
            while (true) {
                k kVar = this.f31823b;
                if (i10 >= kVar.f31859f || kVar.c(i10) >= j10) {
                    return;
                }
                if (this.f31823b.f31864k[i10]) {
                    this.f31830i = i10;
                }
                i10++;
            }
        }

        public void m() {
            j g10 = g();
            if (g10 == null) {
                return;
            }
            c0 c0Var = this.f31823b.f31868o;
            int i10 = g10.f31852d;
            if (i10 != 0) {
                c0Var.L(i10);
            }
            if (this.f31823b.g(this.f31827f)) {
                c0Var.L(c0Var.F() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            j a10 = this.f31825d.f31872a.a(((c) p0.j(this.f31823b.f31854a)).f31782a);
            this.f31822a.a(this.f31825d.f31872a.f31843f.b().M(drmInitData.c(a10 != null ? a10.f31850b : null)).E());
        }
    }

    public f(int i10, l0 l0Var, i iVar) {
        this(i10, l0Var, iVar, Collections.emptyList());
    }

    private static b A(c0 c0Var, SparseArray<b> sparseArray, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        c0Var.K(8);
        int b10 = v3.a.b(c0Var.n());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(c0Var.n());
        if (valueAt == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long E = c0Var.E();
            k kVar = valueAt.f31823b;
            kVar.f31856c = E;
            kVar.f31857d = E;
        }
        c cVar = valueAt.f31826e;
        if ((b10 & 2) != 0) {
            i10 = c0Var.n() - 1;
        } else {
            i10 = cVar.f31782a;
        }
        if ((b10 & 8) != 0) {
            i11 = c0Var.n();
        } else {
            i11 = cVar.f31783b;
        }
        if ((b10 & 16) != 0) {
            i12 = c0Var.n();
        } else {
            i12 = cVar.f31784c;
        }
        if ((b10 & 32) != 0) {
            i13 = c0Var.n();
        } else {
            i13 = cVar.f31785d;
        }
        valueAt.f31823b.f31854a = new c(i10, i11, i12, i13);
        return valueAt;
    }

    private static void B(a.C0367a c0367a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws h2 {
        b A = A(((a.b) a5.a.e(c0367a.g(1952868452))).f31752b, sparseArray, z10);
        if (A == null) {
            return;
        }
        k kVar = A.f31823b;
        long j10 = kVar.f31870q;
        boolean z11 = kVar.f31871r;
        A.k();
        A.f31833l = true;
        a.b g10 = c0367a.g(1952867444);
        if (g10 != null && (i10 & 2) == 0) {
            kVar.f31870q = z(g10.f31752b);
            kVar.f31871r = true;
        } else {
            kVar.f31870q = j10;
            kVar.f31871r = z11;
        }
        E(c0367a, A, i10);
        j a10 = A.f31825d.f31872a.a(((c) a5.a.e(kVar.f31854a)).f31782a);
        a.b g11 = c0367a.g(1935763834);
        if (g11 != null) {
            u((j) a5.a.e(a10), g11.f31752b, kVar);
        }
        a.b g12 = c0367a.g(1935763823);
        if (g12 != null) {
            t(g12.f31752b, kVar);
        }
        a.b g13 = c0367a.g(1936027235);
        if (g13 != null) {
            x(g13.f31752b, kVar);
        }
        v(c0367a, a10 != null ? a10.f31850b : null, kVar);
        int size = c0367a.f31750c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0367a.f31750c.get(i11);
            if (bVar.f31748a == 1970628964) {
                F(bVar.f31752b, kVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> C(c0 c0Var) {
        c0Var.K(12);
        return Pair.create(Integer.valueOf(c0Var.n()), new c(c0Var.n() - 1, c0Var.n(), c0Var.n(), c0Var.n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int D(v3.f.b r34, int r35, int r36, a5.c0 r37, int r38) throws n3.h2 {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f.D(v3.f$b, int, int, a5.c0, int):int");
    }

    private static void E(a.C0367a c0367a, b bVar, int i10) throws h2 {
        List<a.b> list = c0367a.f31750c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f31748a == 1953658222) {
                c0 c0Var = bVar2.f31752b;
                c0Var.K(12);
                int D = c0Var.D();
                if (D > 0) {
                    i12 += D;
                    i11++;
                }
            }
        }
        bVar.f31829h = 0;
        bVar.f31828g = 0;
        bVar.f31827f = 0;
        bVar.f31823b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f31748a == 1953658222) {
                i15 = D(bVar, i14, i10, bVar3.f31752b, i15);
                i14++;
            }
        }
    }

    private static void F(c0 c0Var, k kVar, byte[] bArr) throws h2 {
        c0Var.K(8);
        c0Var.j(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            w(c0Var, 16, kVar);
        }
    }

    private void G(long j10) throws h2 {
        while (!this.f31805m.isEmpty() && this.f31805m.peek().f31749b == j10) {
            l(this.f31805m.pop());
        }
        f();
    }

    private boolean H(s3.j jVar) throws IOException {
        if (this.f31811s == 0) {
            if (!jVar.f(this.f31804l.d(), 0, 8, true)) {
                return false;
            }
            this.f31811s = 8;
            this.f31804l.K(0);
            this.f31810r = this.f31804l.B();
            this.f31809q = this.f31804l.n();
        }
        long j10 = this.f31810r;
        if (j10 == 1) {
            jVar.readFully(this.f31804l.d(), 8, 8);
            this.f31811s += 8;
            this.f31810r = this.f31804l.E();
        } else if (j10 == 0) {
            long a10 = jVar.a();
            if (a10 == -1 && !this.f31805m.isEmpty()) {
                a10 = this.f31805m.peek().f31749b;
            }
            if (a10 != -1) {
                this.f31810r = (a10 - jVar.getPosition()) + this.f31811s;
            }
        }
        if (this.f31810r >= this.f31811s) {
            long position = jVar.getPosition() - this.f31811s;
            int i10 = this.f31809q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.o(new q.b(this.f31816x, position));
                this.H = true;
            }
            if (this.f31809q == 1836019558) {
                int size = this.f31796d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    k kVar = this.f31796d.valueAt(i11).f31823b;
                    kVar.f31855b = position;
                    kVar.f31857d = position;
                    kVar.f31856c = position;
                }
            }
            int i12 = this.f31809q;
            if (i12 == 1835295092) {
                this.f31818z = null;
                this.f31813u = position + this.f31810r;
                this.f31808p = 2;
                return true;
            }
            if (L(i12)) {
                long position2 = (jVar.getPosition() + this.f31810r) - 8;
                this.f31805m.push(new a.C0367a(this.f31809q, position2));
                if (this.f31810r == this.f31811s) {
                    G(position2);
                } else {
                    f();
                }
            } else if (M(this.f31809q)) {
                if (this.f31811s == 8) {
                    long j11 = this.f31810r;
                    if (j11 <= 2147483647L) {
                        c0 c0Var = new c0((int) j11);
                        System.arraycopy(this.f31804l.d(), 0, c0Var.d(), 0, 8);
                        this.f31812t = c0Var;
                        this.f31808p = 1;
                    } else {
                        throw h2.d("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw h2.d("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f31810r <= 2147483647L) {
                this.f31812t = null;
                this.f31808p = 1;
            } else {
                throw h2.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw h2.d("Atom size less than header length (unsupported).");
    }

    private void I(s3.j jVar) throws IOException {
        int i10 = ((int) this.f31810r) - this.f31811s;
        c0 c0Var = this.f31812t;
        if (c0Var != null) {
            jVar.readFully(c0Var.d(), 8, i10);
            n(new a.b(this.f31809q, c0Var), jVar.getPosition());
        } else {
            jVar.j(i10);
        }
        G(jVar.getPosition());
    }

    private void J(s3.j jVar) throws IOException {
        int size = this.f31796d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = this.f31796d.valueAt(i10).f31823b;
            if (kVar.f31869p) {
                long j11 = kVar.f31857d;
                if (j11 < j10) {
                    bVar = this.f31796d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f31808p = 3;
            return;
        }
        int position = (int) (j10 - jVar.getPosition());
        if (position >= 0) {
            jVar.j(position);
            bVar.f31823b.b(jVar);
            return;
        }
        throw h2.a("Offset to encryption data was negative.", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean K(s3.j jVar) throws IOException {
        int b10;
        b bVar = this.f31818z;
        Throwable th = null;
        if (bVar == null) {
            bVar = i(this.f31796d);
            if (bVar == null) {
                int position = (int) (this.f31813u - jVar.getPosition());
                if (position >= 0) {
                    jVar.j(position);
                    f();
                    return false;
                }
                throw h2.a("Offset to end of mdat was negative.", null);
            }
            int d10 = (int) (bVar.d() - jVar.getPosition());
            if (d10 < 0) {
                a5.t.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            jVar.j(d10);
            this.f31818z = bVar;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f31808p == 3) {
            int f10 = bVar.f();
            this.A = f10;
            if (bVar.f31827f < bVar.f31830i) {
                jVar.j(f10);
                bVar.m();
                if (!bVar.h()) {
                    this.f31818z = null;
                }
                this.f31808p = 3;
                return true;
            }
            if (bVar.f31825d.f31872a.f31844g == 1) {
                this.A = f10 - 8;
                jVar.j(8);
            }
            if ("audio/ac4".equals(bVar.f31825d.f31872a.f31843f.f28185l)) {
                this.B = bVar.i(this.A, 7);
                p3.c.a(this.A, this.f31801i);
                bVar.f31822a.d(this.f31801i, 7);
                this.B += 7;
            } else {
                this.B = bVar.i(this.A, 0);
            }
            this.A += this.B;
            this.f31808p = 4;
            this.C = 0;
        }
        i iVar = bVar.f31825d.f31872a;
        t tVar = bVar.f31822a;
        long e8 = bVar.e();
        l0 l0Var = this.f31802j;
        if (l0Var != null) {
            e8 = l0Var.a(e8);
        }
        long j10 = e8;
        if (iVar.f31847j == 0) {
            while (true) {
                int i12 = this.B;
                int i13 = this.A;
                if (i12 >= i13) {
                    break;
                }
                this.B += tVar.b(jVar, i13 - i12, false);
            }
        } else {
            byte[] d11 = this.f31798f.d();
            d11[0] = 0;
            d11[1] = 0;
            d11[2] = 0;
            int i14 = iVar.f31847j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.B < this.A) {
                int i17 = this.C;
                if (i17 == 0) {
                    jVar.readFully(d11, i16, i15);
                    this.f31798f.K(0);
                    int n10 = this.f31798f.n();
                    if (n10 >= i11) {
                        this.C = n10 - 1;
                        this.f31797e.K(0);
                        tVar.d(this.f31797e, i10);
                        tVar.d(this.f31798f, i11);
                        this.D = (this.G.length <= 0 || !y.g(iVar.f31843f.f28185l, d11[i10])) ? 0 : i11;
                        this.B += 5;
                        this.A += i16;
                    } else {
                        throw h2.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.f31799g.G(i17);
                        jVar.readFully(this.f31799g.d(), 0, this.C);
                        tVar.d(this.f31799g, this.C);
                        b10 = this.C;
                        int q10 = y.q(this.f31799g.d(), this.f31799g.f());
                        this.f31799g.K(MimeTypes.VIDEO_H265.equals(iVar.f31843f.f28185l) ? 1 : 0);
                        this.f31799g.J(q10);
                        s3.b.a(j10, this.f31799g, this.G);
                    } else {
                        b10 = tVar.b(jVar, i17, false);
                    }
                    this.B += b10;
                    this.C -= b10;
                    th = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int c10 = bVar.c();
        j g10 = bVar.g();
        tVar.e(j10, c10, this.A, 0, g10 != null ? g10.f31851c : null);
        q(j10);
        if (!bVar.h()) {
            this.f31818z = null;
        }
        this.f31808p = 3;
        return true;
    }

    private static boolean L(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean M(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int e(int i10) throws h2 {
        if (i10 >= 0) {
            return i10;
        }
        throw h2.a("Unexpected negative value: " + i10, null);
    }

    private void f() {
        this.f31808p = 0;
        this.f31811s = 0;
    }

    private c g(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) a5.a.e(sparseArray.get(i10));
    }

    private static DrmInitData h(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f31748a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d10 = bVar.f31752b.d();
                UUID f10 = g.f(d10);
                if (f10 == null) {
                    a5.t.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(f10, "video/mp4", d10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static b i(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f31833l || valueAt.f31827f != valueAt.f31825d.f31873b) && (!valueAt.f31833l || valueAt.f31829h != valueAt.f31823b.f31858e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void j() {
        int i10;
        t[] tVarArr = new t[2];
        this.F = tVarArr;
        t tVar = this.f31807o;
        int i11 = 0;
        if (tVar != null) {
            tVarArr[0] = tVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f31793a & 4) != 0) {
            tVarArr[i10] = this.E.f(100, 5);
            i10++;
            i12 = 101;
        }
        t[] tVarArr2 = (t[]) p0.H0(this.F, i10);
        this.F = tVarArr2;
        for (t tVar2 : tVarArr2) {
            tVar2.a(K);
        }
        this.G = new t[this.f31795c.size()];
        while (i11 < this.G.length) {
            t f10 = this.E.f(i12, 3);
            f10.a(this.f31795c.get(i11));
            this.G[i11] = f10;
            i11++;
            i12++;
        }
    }

    private void l(a.C0367a c0367a) throws h2 {
        int i10 = c0367a.f31748a;
        if (i10 == 1836019574) {
            p(c0367a);
        } else if (i10 == 1836019558) {
            o(c0367a);
        } else if (this.f31805m.isEmpty()) {
        } else {
            this.f31805m.peek().d(c0367a);
        }
    }

    private void m(c0 c0Var) {
        long O0;
        String str;
        long O02;
        String str2;
        long B;
        long j10;
        t[] tVarArr;
        if (this.F.length == 0) {
            return;
        }
        c0Var.K(8);
        int c10 = v3.a.c(c0Var.n());
        if (c10 == 0) {
            String str3 = (String) a5.a.e(c0Var.u());
            String str4 = (String) a5.a.e(c0Var.u());
            long B2 = c0Var.B();
            O0 = p0.O0(c0Var.B(), 1000000L, B2);
            long j11 = this.f31817y;
            long j12 = j11 != -9223372036854775807L ? j11 + O0 : -9223372036854775807L;
            str = str3;
            O02 = p0.O0(c0Var.B(), 1000L, B2);
            str2 = str4;
            B = c0Var.B();
            j10 = j12;
        } else if (c10 != 1) {
            a5.t.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c10);
            return;
        } else {
            long B3 = c0Var.B();
            j10 = p0.O0(c0Var.E(), 1000000L, B3);
            long O03 = p0.O0(c0Var.B(), 1000L, B3);
            long B4 = c0Var.B();
            str = (String) a5.a.e(c0Var.u());
            O02 = O03;
            B = B4;
            str2 = (String) a5.a.e(c0Var.u());
            O0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[c0Var.a()];
        c0Var.j(bArr, 0, c0Var.a());
        c0 c0Var2 = new c0(this.f31803k.a(new EventMessage(str, str2, O02, B, bArr)));
        int a10 = c0Var2.a();
        for (t tVar : this.F) {
            c0Var2.K(0);
            tVar.d(c0Var2, a10);
        }
        if (j10 == -9223372036854775807L) {
            this.f31806n.addLast(new a(O0, true, a10));
            this.f31814v += a10;
        } else if (!this.f31806n.isEmpty()) {
            this.f31806n.addLast(new a(j10, false, a10));
            this.f31814v += a10;
        } else {
            l0 l0Var = this.f31802j;
            if (l0Var != null) {
                j10 = l0Var.a(j10);
            }
            for (t tVar2 : this.F) {
                tVar2.e(j10, 1, a10, 0, null);
            }
        }
    }

    private void n(a.b bVar, long j10) throws h2 {
        if (!this.f31805m.isEmpty()) {
            this.f31805m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f31748a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                m(bVar.f31752b);
                return;
            }
            return;
        }
        Pair<Long, s3.c> y10 = y(bVar.f31752b, j10);
        this.f31817y = ((Long) y10.first).longValue();
        this.E.o((q) y10.second);
        this.H = true;
    }

    private void o(a.C0367a c0367a) throws h2 {
        s(c0367a, this.f31796d, this.f31794b != null, this.f31793a, this.f31800h);
        DrmInitData h10 = h(c0367a.f31750c);
        if (h10 != null) {
            int size = this.f31796d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f31796d.valueAt(i10).n(h10);
            }
        }
        if (this.f31815w != -9223372036854775807L) {
            int size2 = this.f31796d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f31796d.valueAt(i11).l(this.f31815w);
            }
            this.f31815w = -9223372036854775807L;
        }
    }

    private void p(a.C0367a c0367a) throws h2 {
        int i10 = 0;
        a5.a.g(this.f31794b == null, "Unexpected moov box.");
        DrmInitData h10 = h(c0367a.f31750c);
        a.C0367a c0367a2 = (a.C0367a) a5.a.e(c0367a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0367a2.f31750c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0367a2.f31750c.get(i11);
            int i12 = bVar.f31748a;
            if (i12 == 1953654136) {
                Pair<Integer, c> C = C(bVar.f31752b);
                sparseArray.put(((Integer) C.first).intValue(), (c) C.second);
            } else if (i12 == 1835362404) {
                j10 = r(bVar.f31752b);
            }
        }
        List<l> w10 = v3.b.w(c0367a, new n(), j10, h10, (this.f31793a & 16) != 0, false, new x5.d() { // from class: v3.e
            @Override // x5.d
            public final Object apply(Object obj) {
                return f.this.k((i) obj);
            }
        });
        int size2 = w10.size();
        if (this.f31796d.size() == 0) {
            while (i10 < size2) {
                l lVar = w10.get(i10);
                i iVar = lVar.f31872a;
                this.f31796d.put(iVar.f31838a, new b(this.E.f(i10, iVar.f31839b), lVar, g(sparseArray, iVar.f31838a)));
                this.f31816x = Math.max(this.f31816x, iVar.f31842e);
                i10++;
            }
            this.E.q();
            return;
        }
        a5.a.f(this.f31796d.size() == size2);
        while (i10 < size2) {
            l lVar2 = w10.get(i10);
            i iVar2 = lVar2.f31872a;
            this.f31796d.get(iVar2.f31838a).j(lVar2, g(sparseArray, iVar2.f31838a));
            i10++;
        }
    }

    private void q(long j10) {
        while (!this.f31806n.isEmpty()) {
            a removeFirst = this.f31806n.removeFirst();
            this.f31814v -= removeFirst.f31821c;
            long j11 = removeFirst.f31819a;
            if (removeFirst.f31820b) {
                j11 += j10;
            }
            l0 l0Var = this.f31802j;
            if (l0Var != null) {
                j11 = l0Var.a(j11);
            }
            for (t tVar : this.F) {
                tVar.e(j11, 1, removeFirst.f31821c, this.f31814v, null);
            }
        }
    }

    private static long r(c0 c0Var) {
        c0Var.K(8);
        return v3.a.c(c0Var.n()) == 0 ? c0Var.B() : c0Var.E();
    }

    private static void s(a.C0367a c0367a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws h2 {
        int size = c0367a.f31751d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0367a c0367a2 = c0367a.f31751d.get(i11);
            if (c0367a2.f31748a == 1953653094) {
                B(c0367a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void t(c0 c0Var, k kVar) throws h2 {
        c0Var.K(8);
        int n10 = c0Var.n();
        if ((v3.a.b(n10) & 1) == 1) {
            c0Var.L(8);
        }
        int D = c0Var.D();
        if (D == 1) {
            kVar.f31857d += v3.a.c(n10) == 0 ? c0Var.B() : c0Var.E();
            return;
        }
        throw h2.a("Unexpected saio entry count: " + D, null);
    }

    private static void u(j jVar, c0 c0Var, k kVar) throws h2 {
        int i10;
        int i11 = jVar.f31852d;
        c0Var.K(8);
        if ((v3.a.b(c0Var.n()) & 1) == 1) {
            c0Var.L(8);
        }
        int z10 = c0Var.z();
        int D = c0Var.D();
        if (D <= kVar.f31859f) {
            if (z10 == 0) {
                boolean[] zArr = kVar.f31866m;
                i10 = 0;
                for (int i12 = 0; i12 < D; i12++) {
                    int z11 = c0Var.z();
                    i10 += z11;
                    zArr[i12] = z11 > i11;
                }
            } else {
                i10 = (z10 * D) + 0;
                Arrays.fill(kVar.f31866m, 0, D, z10 > i11);
            }
            Arrays.fill(kVar.f31866m, D, kVar.f31859f, false);
            if (i10 > 0) {
                kVar.d(i10);
                return;
            }
            return;
        }
        throw h2.a("Saiz sample count " + D + " is greater than fragment sample count" + kVar.f31859f, null);
    }

    private static void v(a.C0367a c0367a, String str, k kVar) throws h2 {
        byte[] bArr = null;
        c0 c0Var = null;
        c0 c0Var2 = null;
        for (int i10 = 0; i10 < c0367a.f31750c.size(); i10++) {
            a.b bVar = c0367a.f31750c.get(i10);
            c0 c0Var3 = bVar.f31752b;
            int i11 = bVar.f31748a;
            if (i11 == 1935828848) {
                c0Var3.K(12);
                if (c0Var3.n() == 1936025959) {
                    c0Var = c0Var3;
                }
            } else if (i11 == 1936158820) {
                c0Var3.K(12);
                if (c0Var3.n() == 1936025959) {
                    c0Var2 = c0Var3;
                }
            }
        }
        if (c0Var == null || c0Var2 == null) {
            return;
        }
        c0Var.K(8);
        int c10 = v3.a.c(c0Var.n());
        c0Var.L(4);
        if (c10 == 1) {
            c0Var.L(4);
        }
        if (c0Var.n() == 1) {
            c0Var2.K(8);
            int c11 = v3.a.c(c0Var2.n());
            c0Var2.L(4);
            if (c11 == 1) {
                if (c0Var2.B() == 0) {
                    throw h2.d("Variable length description in sgpd found (unsupported)");
                }
            } else if (c11 >= 2) {
                c0Var2.L(4);
            }
            if (c0Var2.B() == 1) {
                c0Var2.L(1);
                int z10 = c0Var2.z();
                int i12 = (z10 & 240) >> 4;
                int i13 = z10 & 15;
                boolean z11 = c0Var2.z() == 1;
                if (z11) {
                    int z12 = c0Var2.z();
                    byte[] bArr2 = new byte[16];
                    c0Var2.j(bArr2, 0, 16);
                    if (z12 == 0) {
                        int z13 = c0Var2.z();
                        bArr = new byte[z13];
                        c0Var2.j(bArr, 0, z13);
                    }
                    kVar.f31865l = true;
                    kVar.f31867n = new j(z11, str, z12, bArr2, i12, i13, bArr);
                    return;
                }
                return;
            }
            throw h2.d("Entry count in sgpd != 1 (unsupported).");
        }
        throw h2.d("Entry count in sbgp != 1 (unsupported).");
    }

    private static void w(c0 c0Var, int i10, k kVar) throws h2 {
        c0Var.K(i10 + 8);
        int b10 = v3.a.b(c0Var.n());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int D = c0Var.D();
            if (D == 0) {
                Arrays.fill(kVar.f31866m, 0, kVar.f31859f, false);
                return;
            } else if (D == kVar.f31859f) {
                Arrays.fill(kVar.f31866m, 0, D, z10);
                kVar.d(c0Var.a());
                kVar.a(c0Var);
                return;
            } else {
                throw h2.a("Senc sample count " + D + " is different from fragment sample count" + kVar.f31859f, null);
            }
        }
        throw h2.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void x(c0 c0Var, k kVar) throws h2 {
        w(c0Var, 0, kVar);
    }

    private static Pair<Long, s3.c> y(c0 c0Var, long j10) throws h2 {
        long E;
        long E2;
        int[] iArr;
        c0Var.K(8);
        int c10 = v3.a.c(c0Var.n());
        c0Var.L(4);
        long B = c0Var.B();
        if (c10 == 0) {
            E = c0Var.B();
            E2 = c0Var.B();
        } else {
            E = c0Var.E();
            E2 = c0Var.E();
        }
        long j11 = E;
        long j12 = j10 + E2;
        long O0 = p0.O0(j11, 1000000L, B);
        c0Var.L(2);
        int F = c0Var.F();
        int[] iArr2 = new int[F];
        long[] jArr = new long[F];
        long[] jArr2 = new long[F];
        long[] jArr3 = new long[F];
        long j13 = O0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < F) {
            int n10 = c0Var.n();
            if ((n10 & RecyclerView.UNDEFINED_DURATION) == 0) {
                long B2 = c0Var.B();
                iArr2[i10] = n10 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                jArr[i10] = j12;
                jArr3[i10] = j13;
                long j15 = j14 + B2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = F;
                long O02 = p0.O0(j15, 1000000L, B);
                jArr4[i10] = O02 - jArr5[i10];
                c0Var.L(4);
                j12 += iArr[i10];
                i10++;
                iArr2 = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                F = i11;
                j14 = j15;
                j13 = O02;
            } else {
                throw h2.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(O0), new s3.c(iArr2, jArr, jArr2, jArr3));
    }

    private static long z(c0 c0Var) {
        c0Var.K(8);
        return v3.a.c(c0Var.n()) == 1 ? c0Var.E() : c0Var.B();
    }

    @Override // s3.i
    public int a(s3.j jVar, p pVar) throws IOException {
        while (true) {
            int i10 = this.f31808p;
            if (i10 != 0) {
                if (i10 == 1) {
                    I(jVar);
                } else if (i10 != 2) {
                    if (K(jVar)) {
                        return 0;
                    }
                } else {
                    J(jVar);
                }
            } else if (!H(jVar)) {
                return -1;
            }
        }
    }

    @Override // s3.i
    public void b(s3.k kVar) {
        this.E = kVar;
        f();
        j();
        i iVar = this.f31794b;
        if (iVar != null) {
            this.f31796d.put(0, new b(kVar.f(0, iVar.f31839b), new l(this.f31794b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.q();
        }
    }

    @Override // s3.i
    public boolean c(s3.j jVar) throws IOException {
        return h.b(jVar);
    }

    @Override // s3.i
    public void d(long j10, long j11) {
        int size = this.f31796d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31796d.valueAt(i10).k();
        }
        this.f31806n.clear();
        this.f31814v = 0;
        this.f31815w = j11;
        this.f31805m.clear();
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i k(i iVar) {
        return iVar;
    }

    @Override // s3.i
    public void release() {
    }

    public f(int i10, l0 l0Var, i iVar, List<m1> list) {
        this(i10, l0Var, iVar, list, null);
    }

    public f(int i10, l0 l0Var, i iVar, List<m1> list, t tVar) {
        this.f31793a = i10;
        this.f31802j = l0Var;
        this.f31794b = iVar;
        this.f31795c = Collections.unmodifiableList(list);
        this.f31807o = tVar;
        this.f31803k = new a4.b();
        this.f31804l = new c0(16);
        this.f31797e = new c0(y.f526a);
        this.f31798f = new c0(5);
        this.f31799g = new c0();
        byte[] bArr = new byte[16];
        this.f31800h = bArr;
        this.f31801i = new c0(bArr);
        this.f31805m = new ArrayDeque<>();
        this.f31806n = new ArrayDeque<>();
        this.f31796d = new SparseArray<>();
        this.f31816x = -9223372036854775807L;
        this.f31815w = -9223372036854775807L;
        this.f31817y = -9223372036854775807L;
        this.E = s3.k.f30714w0;
        this.F = new t[0];
        this.G = new t[0];
    }
}
