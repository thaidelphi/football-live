package z4;

import java.util.Arrays;
import z4.b;
/* compiled from: DefaultAllocator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f33591a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33592b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f33593c;

    /* renamed from: d  reason: collision with root package name */
    private int f33594d;

    /* renamed from: e  reason: collision with root package name */
    private int f33595e;

    /* renamed from: f  reason: collision with root package name */
    private int f33596f;

    /* renamed from: g  reason: collision with root package name */
    private a[] f33597g;

    public q(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // z4.b
    public synchronized a a() {
        a aVar;
        this.f33595e++;
        int i10 = this.f33596f;
        if (i10 > 0) {
            a[] aVarArr = this.f33597g;
            int i11 = i10 - 1;
            this.f33596f = i11;
            aVar = (a) a5.a.e(aVarArr[i11]);
            this.f33597g[this.f33596f] = null;
        } else {
            aVar = new a(new byte[this.f33592b], 0);
            int i12 = this.f33595e;
            a[] aVarArr2 = this.f33597g;
            if (i12 > aVarArr2.length) {
                this.f33597g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // z4.b
    public synchronized void b(a aVar) {
        a[] aVarArr = this.f33597g;
        int i10 = this.f33596f;
        this.f33596f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f33595e--;
        notifyAll();
    }

    @Override // z4.b
    public synchronized void c() {
        int i10 = 0;
        int max = Math.max(0, a5.p0.l(this.f33594d, this.f33592b) - this.f33595e);
        int i11 = this.f33596f;
        if (max >= i11) {
            return;
        }
        if (this.f33593c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) a5.a.e(this.f33597g[i10]);
                if (aVar.f33471a == this.f33593c) {
                    i10++;
                } else {
                    a aVar2 = (a) a5.a.e(this.f33597g[i12]);
                    if (aVar2.f33471a != this.f33593c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f33597g;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f33596f) {
                return;
            }
        }
        Arrays.fill(this.f33597g, max, this.f33596f, (Object) null);
        this.f33596f = max;
    }

    @Override // z4.b
    public synchronized void d(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f33597g;
            int i10 = this.f33596f;
            this.f33596f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f33595e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // z4.b
    public int e() {
        return this.f33592b;
    }

    public synchronized int f() {
        return this.f33595e * this.f33592b;
    }

    public synchronized void g() {
        if (this.f33591a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f33594d;
        this.f33594d = i10;
        if (z10) {
            c();
        }
    }

    public q(boolean z10, int i10, int i11) {
        a5.a.a(i10 > 0);
        a5.a.a(i11 >= 0);
        this.f33591a = z10;
        this.f33592b = i10;
        this.f33596f = i11;
        this.f33597g = new a[i11 + 100];
        if (i11 > 0) {
            this.f33593c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f33597g[i12] = new a(this.f33593c, i12 * i10);
            }
            return;
        }
        this.f33593c = null;
    }
}
