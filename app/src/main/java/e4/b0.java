package e4;

import a5.p0;
import e4.d0;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import s3.t;
import z4.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SampleDataQueue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final z4.b f24981a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24982b;

    /* renamed from: c  reason: collision with root package name */
    private final a5.c0 f24983c;

    /* renamed from: d  reason: collision with root package name */
    private a f24984d;

    /* renamed from: e  reason: collision with root package name */
    private a f24985e;

    /* renamed from: f  reason: collision with root package name */
    private a f24986f;

    /* renamed from: g  reason: collision with root package name */
    private long f24987g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SampleDataQueue.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f24988a;

        /* renamed from: b  reason: collision with root package name */
        public long f24989b;

        /* renamed from: c  reason: collision with root package name */
        public z4.a f24990c;

        /* renamed from: d  reason: collision with root package name */
        public a f24991d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // z4.b.a
        public z4.a a() {
            return (z4.a) a5.a.e(this.f24990c);
        }

        public a b() {
            this.f24990c = null;
            a aVar = this.f24991d;
            this.f24991d = null;
            return aVar;
        }

        public void c(z4.a aVar, a aVar2) {
            this.f24990c = aVar;
            this.f24991d = aVar2;
        }

        public void d(long j10, int i10) {
            a5.a.f(this.f24990c == null);
            this.f24988a = j10;
            this.f24989b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f24988a)) + this.f24990c.f33472b;
        }

        @Override // z4.b.a
        public b.a next() {
            a aVar = this.f24991d;
            if (aVar == null || aVar.f24990c == null) {
                return null;
            }
            return aVar;
        }
    }

    public b0(z4.b bVar) {
        this.f24981a = bVar;
        int e8 = bVar.e();
        this.f24982b = e8;
        this.f24983c = new a5.c0(32);
        a aVar = new a(0L, e8);
        this.f24984d = aVar;
        this.f24985e = aVar;
        this.f24986f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f24990c == null) {
            return;
        }
        this.f24981a.d(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f24989b) {
            aVar = aVar.f24991d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f24987g + i10;
        this.f24987g = j10;
        a aVar = this.f24986f;
        if (j10 == aVar.f24989b) {
            this.f24986f = aVar.f24991d;
        }
    }

    private int h(int i10) {
        a aVar = this.f24986f;
        if (aVar.f24990c == null) {
            aVar.c(this.f24981a.a(), new a(this.f24986f.f24989b, this.f24982b));
        }
        return Math.min(i10, (int) (this.f24986f.f24989b - this.f24987g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f24989b - j10));
            byteBuffer.put(d10.f24990c.f33471a, d10.e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == d10.f24989b) {
                d10 = d10.f24991d;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f24989b - j10));
            System.arraycopy(d10.f24990c.f33471a, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == d10.f24989b) {
                d10 = d10.f24991d;
            }
        }
        return d10;
    }

    private static a k(a aVar, q3.g gVar, d0.b bVar, a5.c0 c0Var) {
        long j10 = bVar.f25031b;
        int i10 = 1;
        c0Var.G(1);
        a j11 = j(aVar, j10, c0Var.d(), 1);
        long j12 = j10 + 1;
        byte b10 = c0Var.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        q3.c cVar = gVar.f30090b;
        byte[] bArr = cVar.f30066a;
        if (bArr == null) {
            cVar.f30066a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, cVar.f30066a, i11);
        long j14 = j12 + i11;
        if (z10) {
            c0Var.G(2);
            j13 = j(j13, j14, c0Var.d(), 2);
            j14 += 2;
            i10 = c0Var.F();
        }
        int i12 = i10;
        int[] iArr = cVar.f30069d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f30070e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            c0Var.G(i13);
            j13 = j(j13, j14, c0Var.d(), i13);
            j14 += i13;
            c0Var.K(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = c0Var.F();
                iArr4[i14] = c0Var.D();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f25030a - ((int) (j14 - bVar.f25031b));
        }
        t.a aVar2 = (t.a) p0.j(bVar.f25032c);
        cVar.c(i12, iArr2, iArr4, aVar2.f30728b, cVar.f30066a, aVar2.f30727a, aVar2.f30729c, aVar2.f30730d);
        long j15 = bVar.f25031b;
        int i15 = (int) (j14 - j15);
        bVar.f25031b = j15 + i15;
        bVar.f25030a -= i15;
        return j13;
    }

    private static a l(a aVar, q3.g gVar, d0.b bVar, a5.c0 c0Var) {
        if (gVar.s()) {
            aVar = k(aVar, gVar, bVar, c0Var);
        }
        if (gVar.j()) {
            c0Var.G(4);
            a j10 = j(aVar, bVar.f25031b, c0Var.d(), 4);
            int D = c0Var.D();
            bVar.f25031b += 4;
            bVar.f25030a -= 4;
            gVar.q(D);
            a i10 = i(j10, bVar.f25031b, gVar.f30091c, D);
            bVar.f25031b += D;
            int i11 = bVar.f25030a - D;
            bVar.f25030a = i11;
            gVar.u(i11);
            return i(i10, bVar.f25031b, gVar.f30094f, bVar.f25030a);
        }
        gVar.q(bVar.f25030a);
        return i(aVar, bVar.f25031b, gVar.f30091c, bVar.f25030a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f24984d;
            if (j10 < aVar.f24989b) {
                break;
            }
            this.f24981a.b(aVar.f24990c);
            this.f24984d = this.f24984d.b();
        }
        if (this.f24985e.f24988a < aVar.f24988a) {
            this.f24985e = aVar;
        }
    }

    public void c(long j10) {
        a5.a.a(j10 <= this.f24987g);
        this.f24987g = j10;
        if (j10 != 0) {
            a aVar = this.f24984d;
            if (j10 != aVar.f24988a) {
                while (this.f24987g > aVar.f24989b) {
                    aVar = aVar.f24991d;
                }
                a aVar2 = (a) a5.a.e(aVar.f24991d);
                a(aVar2);
                a aVar3 = new a(aVar.f24989b, this.f24982b);
                aVar.f24991d = aVar3;
                if (this.f24987g == aVar.f24989b) {
                    aVar = aVar3;
                }
                this.f24986f = aVar;
                if (this.f24985e == aVar2) {
                    this.f24985e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f24984d);
        a aVar4 = new a(this.f24987g, this.f24982b);
        this.f24984d = aVar4;
        this.f24985e = aVar4;
        this.f24986f = aVar4;
    }

    public long e() {
        return this.f24987g;
    }

    public void f(q3.g gVar, d0.b bVar) {
        l(this.f24985e, gVar, bVar, this.f24983c);
    }

    public void m(q3.g gVar, d0.b bVar) {
        this.f24985e = l(this.f24985e, gVar, bVar, this.f24983c);
    }

    public void n() {
        a(this.f24984d);
        this.f24984d.d(0L, this.f24982b);
        a aVar = this.f24984d;
        this.f24985e = aVar;
        this.f24986f = aVar;
        this.f24987g = 0L;
        this.f24981a.c();
    }

    public void o() {
        this.f24985e = this.f24984d;
    }

    public int p(z4.i iVar, int i10, boolean z10) throws IOException {
        int h10 = h(i10);
        a aVar = this.f24986f;
        int b10 = iVar.b(aVar.f24990c.f33471a, aVar.e(this.f24987g), h10);
        if (b10 != -1) {
            g(b10);
            return b10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void q(a5.c0 c0Var, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f24986f;
            c0Var.j(aVar.f24990c.f33471a, aVar.e(this.f24987g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
