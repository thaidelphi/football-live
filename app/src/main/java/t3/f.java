package t3;

import a5.c0;
import java.io.IOException;
import s3.j;
/* compiled from: Sniffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f31019a = new c0(8);

    /* renamed from: b  reason: collision with root package name */
    private int f31020b;

    private long a(j jVar) throws IOException {
        int i10 = 0;
        jVar.n(this.f31019a.d(), 0, 1);
        int i11 = this.f31019a.d()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        jVar.n(this.f31019a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f31019a.d()[i10] & 255) + (i14 << 8);
        }
        this.f31020b += i13 + 1;
        return i14;
    }

    public boolean b(j jVar) throws IOException {
        long a10;
        int i10;
        long a11 = jVar.a();
        int i11 = (a11 > (-1L) ? 1 : (a11 == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && a11 <= 1024) {
            j10 = a11;
        }
        int i12 = (int) j10;
        jVar.n(this.f31019a.d(), 0, 4);
        long B = this.f31019a.B();
        this.f31020b = 4;
        while (B != 440786851) {
            int i13 = this.f31020b + 1;
            this.f31020b = i13;
            if (i13 == i12) {
                return false;
            }
            jVar.n(this.f31019a.d(), 0, 1);
            B = ((B << 8) & (-256)) | (this.f31019a.d()[0] & 255);
        }
        long a12 = a(jVar);
        long j11 = this.f31020b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a12 >= a11) {
            return false;
        }
        while (true) {
            int i14 = this.f31020b;
            long j12 = j11 + a12;
            if (i14 >= j12) {
                return ((long) i14) == j12;
            } else if (a(jVar) != Long.MIN_VALUE && (a(jVar)) >= 0 && a10 <= 2147483647L) {
                if (i10 != 0) {
                    int i15 = (int) a10;
                    jVar.h(i15);
                    this.f31020b += i15;
                }
            }
        }
    }
}
