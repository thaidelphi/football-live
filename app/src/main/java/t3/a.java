package t3;

import java.io.IOException;
import java.util.ArrayDeque;
import n3.h2;
import s3.j;
/* compiled from: DefaultEbmlReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f30947a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f30948b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f30949c = new g();

    /* renamed from: d  reason: collision with root package name */
    private t3.b f30950d;

    /* renamed from: e  reason: collision with root package name */
    private int f30951e;

    /* renamed from: f  reason: collision with root package name */
    private int f30952f;

    /* renamed from: g  reason: collision with root package name */
    private long f30953g;

    /* compiled from: DefaultEbmlReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f30954a;

        /* renamed from: b  reason: collision with root package name */
        private final long f30955b;

        private b(int i10, long j10) {
            this.f30954a = i10;
            this.f30955b = j10;
        }
    }

    private long c(j jVar) throws IOException {
        jVar.e();
        while (true) {
            jVar.n(this.f30947a, 0, 4);
            int c10 = g.c(this.f30947a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f30947a, c10, false);
                if (this.f30950d.e(a10)) {
                    jVar.j(c10);
                    return a10;
                }
            }
            jVar.j(1);
        }
    }

    private double d(j jVar, int i10) throws IOException {
        long e8 = e(jVar, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) e8);
        }
        return Double.longBitsToDouble(e8);
    }

    private long e(j jVar, int i10) throws IOException {
        jVar.readFully(this.f30947a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f30947a[i11] & 255);
        }
        return j10;
    }

    private static String f(j jVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        jVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // t3.c
    public boolean a(j jVar) throws IOException {
        a5.a.h(this.f30950d);
        while (true) {
            b peek = this.f30948b.peek();
            if (peek != null && jVar.getPosition() >= peek.f30955b) {
                this.f30950d.a(this.f30948b.pop().f30954a);
                return true;
            }
            if (this.f30951e == 0) {
                long d10 = this.f30949c.d(jVar, true, false, 4);
                if (d10 == -2) {
                    d10 = c(jVar);
                }
                if (d10 == -1) {
                    return false;
                }
                this.f30952f = (int) d10;
                this.f30951e = 1;
            }
            if (this.f30951e == 1) {
                this.f30953g = this.f30949c.d(jVar, false, true, 8);
                this.f30951e = 2;
            }
            int d11 = this.f30950d.d(this.f30952f);
            if (d11 != 0) {
                if (d11 == 1) {
                    long position = jVar.getPosition();
                    this.f30948b.push(new b(this.f30952f, this.f30953g + position));
                    this.f30950d.h(this.f30952f, position, this.f30953g);
                    this.f30951e = 0;
                    return true;
                } else if (d11 == 2) {
                    long j10 = this.f30953g;
                    if (j10 <= 8) {
                        this.f30950d.c(this.f30952f, e(jVar, (int) j10));
                        this.f30951e = 0;
                        return true;
                    }
                    throw h2.a("Invalid integer size: " + this.f30953g, null);
                } else if (d11 == 3) {
                    long j11 = this.f30953g;
                    if (j11 <= 2147483647L) {
                        this.f30950d.g(this.f30952f, f(jVar, (int) j11));
                        this.f30951e = 0;
                        return true;
                    }
                    throw h2.a("String element size: " + this.f30953g, null);
                } else if (d11 == 4) {
                    this.f30950d.f(this.f30952f, (int) this.f30953g, jVar);
                    this.f30951e = 0;
                    return true;
                } else if (d11 == 5) {
                    long j12 = this.f30953g;
                    if (j12 != 4 && j12 != 8) {
                        throw h2.a("Invalid float size: " + this.f30953g, null);
                    }
                    this.f30950d.b(this.f30952f, d(jVar, (int) j12));
                    this.f30951e = 0;
                    return true;
                } else {
                    throw h2.a("Invalid element type " + d11, null);
                }
            }
            jVar.j((int) this.f30953g);
            this.f30951e = 0;
        }
    }

    @Override // t3.c
    public void b(t3.b bVar) {
        this.f30950d = bVar;
    }

    @Override // t3.c
    public void reset() {
        this.f30951e = 0;
        this.f30948b.clear();
        this.f30949c.e();
    }
}
