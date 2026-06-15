package j4;

import a5.c0;
import a5.l0;
import a5.n0;
import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import j4.f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k4.g;
import n3.m1;
import o3.q1;
import z4.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HlsMediaChunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i extends g4.n {
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final q1 C;
    private j D;
    private p E;
    private int F;
    private boolean G;
    private volatile boolean H;
    private boolean I;
    private y5.q<Integer> J;
    private boolean K;
    private boolean L;

    /* renamed from: k  reason: collision with root package name */
    public final int f26981k;

    /* renamed from: l  reason: collision with root package name */
    public final int f26982l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f26983m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f26984n;

    /* renamed from: o  reason: collision with root package name */
    public final int f26985o;

    /* renamed from: p  reason: collision with root package name */
    private final z4.l f26986p;

    /* renamed from: q  reason: collision with root package name */
    private final z4.p f26987q;

    /* renamed from: r  reason: collision with root package name */
    private final j f26988r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f26989s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f26990t;

    /* renamed from: u  reason: collision with root package name */
    private final l0 f26991u;

    /* renamed from: v  reason: collision with root package name */
    private final h f26992v;

    /* renamed from: w  reason: collision with root package name */
    private final List<m1> f26993w;

    /* renamed from: x  reason: collision with root package name */
    private final DrmInitData f26994x;

    /* renamed from: y  reason: collision with root package name */
    private final c4.b f26995y;

    /* renamed from: z  reason: collision with root package name */
    private final c0 f26996z;

    private i(h hVar, z4.l lVar, z4.p pVar, m1 m1Var, boolean z10, z4.l lVar2, z4.p pVar2, boolean z11, Uri uri, List<m1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, l0 l0Var, DrmInitData drmInitData, j jVar, c4.b bVar, c0 c0Var, boolean z15, q1 q1Var) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f26985o = i11;
        this.L = z12;
        this.f26982l = i12;
        this.f26987q = pVar2;
        this.f26986p = lVar2;
        this.G = pVar2 != null;
        this.B = z11;
        this.f26983m = uri;
        this.f26989s = z14;
        this.f26991u = l0Var;
        this.f26990t = z13;
        this.f26992v = hVar;
        this.f26993w = list;
        this.f26994x = drmInitData;
        this.f26988r = jVar;
        this.f26995y = bVar;
        this.f26996z = c0Var;
        this.f26984n = z15;
        this.C = q1Var;
        this.J = y5.q.p();
        this.f26981k = M.getAndIncrement();
    }

    private static z4.l i(z4.l lVar, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            a5.a.e(bArr2);
            return new a(lVar, bArr, bArr2);
        }
        return lVar;
    }

    public static i j(h hVar, z4.l lVar, m1 m1Var, long j10, k4.g gVar, f.e eVar, Uri uri, List<m1> list, int i10, Object obj, boolean z10, r rVar, i iVar, byte[] bArr, byte[] bArr2, boolean z11, q1 q1Var) {
        boolean z12;
        z4.l lVar2;
        z4.p pVar;
        boolean z13;
        c4.b bVar;
        c0 c0Var;
        j jVar;
        g.e eVar2 = eVar.f26976a;
        z4.p a10 = new p.b().i(n0.e(gVar.f27229a, eVar2.f27192a)).h(eVar2.f27200i).g(eVar2.f27201j).b(eVar.f26979d ? 8 : 0).a();
        boolean z14 = bArr != null;
        z4.l i11 = i(lVar, bArr, z14 ? l((String) a5.a.e(eVar2.f27199h)) : null);
        g.d dVar = eVar2.f27193b;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] l10 = z15 ? l((String) a5.a.e(dVar.f27199h)) : null;
            z12 = z14;
            pVar = new z4.p(n0.e(gVar.f27229a, dVar.f27192a), dVar.f27200i, dVar.f27201j);
            lVar2 = i(lVar, bArr2, l10);
            z13 = z15;
        } else {
            z12 = z14;
            lVar2 = null;
            pVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar2.f27196e;
        long j12 = j11 + eVar2.f27194c;
        int i12 = gVar.f27172j + eVar2.f27195d;
        if (iVar != null) {
            z4.p pVar2 = iVar.f26987q;
            boolean z16 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.f33569a.equals(pVar2.f33569a) && pVar.f33575g == iVar.f26987q.f33575g);
            boolean z17 = uri.equals(iVar.f26983m) && iVar.I;
            c4.b bVar2 = iVar.f26995y;
            bVar = bVar2;
            c0Var = iVar.f26996z;
            jVar = (z16 && z17 && !iVar.K && iVar.f26982l == i12) ? iVar.D : null;
        } else {
            bVar = new c4.b();
            c0Var = new c0(10);
            jVar = null;
        }
        return new i(hVar, i11, a10, m1Var, z12, lVar2, pVar, z13, uri, list, i10, obj, j11, j12, eVar.f26977b, eVar.f26978c, !eVar.f26979d, i12, eVar2.f27202k, z10, rVar.a(i12), eVar2.f27197f, jVar, bVar, c0Var, z11, q1Var);
    }

    private void k(z4.l lVar, z4.p pVar, boolean z10, boolean z11) throws IOException {
        z4.p e8;
        long position;
        long j10;
        if (z10) {
            r0 = this.F != 0;
            e8 = pVar;
        } else {
            e8 = pVar.e(this.F);
        }
        try {
            s3.e u10 = u(lVar, e8, z11);
            if (r0) {
                u10.j(this.F);
            }
            do {
                try {
                    if (this.H) {
                        break;
                    }
                } catch (EOFException e10) {
                    if ((this.f25738d.f28178e & 16384) != 0) {
                        this.D.c();
                        position = u10.getPosition();
                        j10 = pVar.f33575g;
                    } else {
                        throw e10;
                    }
                }
            } while (this.D.a(u10));
            position = u10.getPosition();
            j10 = pVar.f33575g;
            this.F = (int) (position - j10);
        } finally {
            z4.o.a(lVar);
        }
    }

    private static byte[] l(String str) {
        if (x5.a.e(str).startsWith("0x")) {
            str = str.substring(2).equals("null") ? "98356e6228da3dc7a9fb210bc0c2a198" : str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, k4.g gVar) {
        g.e eVar2 = eVar.f26976a;
        if (eVar2 instanceof g.b) {
            return ((g.b) eVar2).f27185l || (eVar.f26978c == 0 && gVar.f27231c);
        }
        return gVar.f27231c;
    }

    private void r() throws IOException {
        k(this.f25743i, this.f25736b, this.A, true);
    }

    private void s() throws IOException {
        if (this.G) {
            a5.a.e(this.f26986p);
            a5.a.e(this.f26987q);
            k(this.f26986p, this.f26987q, this.B, false);
            this.F = 0;
            this.G = false;
        }
    }

    private long t(s3.j jVar) throws IOException {
        jVar.e();
        try {
            this.f26996z.G(10);
            jVar.n(this.f26996z.d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f26996z.C() != 4801587) {
            return -9223372036854775807L;
        }
        this.f26996z.L(3);
        int y10 = this.f26996z.y();
        int i10 = y10 + 10;
        if (i10 > this.f26996z.b()) {
            byte[] d10 = this.f26996z.d();
            this.f26996z.G(i10);
            System.arraycopy(d10, 0, this.f26996z.d(), 0, 10);
        }
        jVar.n(this.f26996z.d(), 10, y10);
        Metadata e8 = this.f26995y.e(this.f26996z.d(), y10);
        if (e8 == null) {
            return -9223372036854775807L;
        }
        int e10 = e8.e();
        for (int i11 = 0; i11 < e10; i11++) {
            Metadata.Entry d11 = e8.d(i11);
            if (d11 instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) d11;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f10606b)) {
                    System.arraycopy(privFrame.f10607c, 0, this.f26996z.d(), 0, 8);
                    this.f26996z.K(0);
                    this.f26996z.J(8);
                    return this.f26996z.t() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private s3.e u(z4.l lVar, z4.p pVar, boolean z10) throws IOException {
        j a10;
        long j10;
        long l10 = lVar.l(pVar);
        if (z10) {
            try {
                this.f26991u.h(this.f26989s, this.f25741g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        s3.e eVar = new s3.e(lVar, pVar.f33575g, l10);
        if (this.D == null) {
            long t10 = t(eVar);
            eVar.e();
            j jVar = this.f26988r;
            if (jVar != null) {
                a10 = jVar.f();
            } else {
                a10 = this.f26992v.a(pVar.f33569a, this.f25738d, this.f26993w, this.f26991u, lVar.d(), eVar, this.C);
            }
            this.D = a10;
            if (a10.e()) {
                p pVar2 = this.E;
                if (t10 != -9223372036854775807L) {
                    j10 = this.f26991u.b(t10);
                } else {
                    j10 = this.f25741g;
                }
                pVar2.n0(j10);
            } else {
                this.E.n0(0L);
            }
            this.E.Z();
            this.D.b(this.E);
        }
        this.E.k0(this.f26994x);
        return eVar;
    }

    public static boolean w(i iVar, Uri uri, k4.g gVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f26983m) && iVar.I) {
            return false;
        }
        return !p(eVar, gVar) || j10 + eVar.f26976a.f27196e < iVar.f25742h;
    }

    @Override // z4.j0.e
    public void a() throws IOException {
        j jVar;
        a5.a.e(this.E);
        if (this.D == null && (jVar = this.f26988r) != null && jVar.d()) {
            this.D = this.f26988r;
            this.G = false;
        }
        s();
        if (this.H) {
            return;
        }
        if (!this.f26990t) {
            r();
        }
        this.I = !this.H;
    }

    @Override // z4.j0.e
    public void b() {
        this.H = true;
    }

    @Override // g4.n
    public boolean h() {
        return this.I;
    }

    public int m(int i10) {
        a5.a.f(!this.f26984n);
        if (i10 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i10).intValue();
    }

    public void n(p pVar, y5.q<Integer> qVar) {
        this.E = pVar;
        this.J = qVar;
    }

    public void o() {
        this.K = true;
    }

    public boolean q() {
        return this.L;
    }

    public void v() {
        this.L = true;
    }
}
