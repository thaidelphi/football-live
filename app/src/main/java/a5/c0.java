package a5;

import java.nio.charset.Charset;
import java.util.Arrays;
/* compiled from: ParsableByteArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f409a;

    /* renamed from: b  reason: collision with root package name */
    private int f410b;

    /* renamed from: c  reason: collision with root package name */
    private int f411c;

    public c0() {
        this.f409a = p0.f487f;
    }

    public int A() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        int i12 = i11 + 1;
        this.f410b = i12;
        int i13 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f410b = i12 + 2;
        return i13;
    }

    public long B() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        int i12 = i11 + 1;
        this.f410b = i12;
        int i13 = i12 + 1;
        this.f410b = i13;
        this.f410b = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
    }

    public int C() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        int i12 = i11 + 1;
        this.f410b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f410b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int D() {
        int n10 = n();
        if (n10 >= 0) {
            return n10;
        }
        throw new IllegalStateException("Top bit not zero: " + n10);
    }

    public long E() {
        long t10 = t();
        if (t10 >= 0) {
            return t10;
        }
        throw new IllegalStateException("Top bit not zero: " + t10);
    }

    public int F() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        this.f410b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public void G(int i10) {
        I(b() < i10 ? new byte[i10] : this.f409a, i10);
    }

    public void H(byte[] bArr) {
        I(bArr, bArr.length);
    }

    public void I(byte[] bArr, int i10) {
        this.f409a = bArr;
        this.f411c = i10;
        this.f410b = 0;
    }

    public void J(int i10) {
        a.a(i10 >= 0 && i10 <= this.f409a.length);
        this.f411c = i10;
    }

    public void K(int i10) {
        a.a(i10 >= 0 && i10 <= this.f411c);
        this.f410b = i10;
    }

    public void L(int i10) {
        K(this.f410b + i10);
    }

    public int a() {
        return this.f411c - this.f410b;
    }

    public int b() {
        return this.f409a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f409a = Arrays.copyOf(this.f409a, i10);
        }
    }

    public byte[] d() {
        return this.f409a;
    }

    public int e() {
        return this.f410b;
    }

    public int f() {
        return this.f411c;
    }

    public char g() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int h() {
        return this.f409a[this.f410b] & 255;
    }

    public void i(b0 b0Var, int i10) {
        j(b0Var.f405a, 0, i10);
        b0Var.o(0);
    }

    public void j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f409a, this.f410b, bArr, i10, i11);
        this.f410b += i11;
    }

    public String k(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f410b;
        while (i10 < this.f411c && this.f409a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f409a;
        int i11 = this.f410b;
        String D = p0.D(bArr, i11, i10 - i11);
        this.f410b = i10;
        if (i10 < this.f411c) {
            this.f410b = i10 + 1;
        }
        return D;
    }

    public double l() {
        return Double.longBitsToDouble(t());
    }

    public float m() {
        return Float.intBitsToFloat(n());
    }

    public int n() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        int i12 = i11 + 1;
        this.f410b = i12;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        this.f410b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f410b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public String o() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f410b;
        while (i10 < this.f411c && !p0.v0(this.f409a[i10])) {
            i10++;
        }
        int i11 = this.f410b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f409a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f410b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f409a;
        int i12 = this.f410b;
        String D = p0.D(bArr2, i12, i10 - i12);
        this.f410b = i10;
        int i13 = this.f411c;
        if (i10 == i13) {
            return D;
        }
        byte[] bArr3 = this.f409a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f410b = i14;
            if (i14 == i13) {
                return D;
            }
        }
        int i15 = this.f410b;
        if (bArr3[i15] == 10) {
            this.f410b = i15 + 1;
        }
        return D;
    }

    public int p() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        int i12 = i11 + 1;
        this.f410b = i12;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        this.f410b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f410b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public short q() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        this.f410b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long r() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        int i12 = i11 + 1;
        this.f410b = i12;
        int i13 = i12 + 1;
        this.f410b = i13;
        this.f410b = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public int s() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        this.f410b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long t() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        int i12 = i11 + 1;
        this.f410b = i12;
        int i13 = i12 + 1;
        this.f410b = i13;
        int i14 = i13 + 1;
        this.f410b = i14;
        int i15 = i14 + 1;
        this.f410b = i15;
        int i16 = i15 + 1;
        this.f410b = i16;
        int i17 = i16 + 1;
        this.f410b = i17;
        this.f410b = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (bArr[i17] & 255);
    }

    public String u() {
        return k((char) 0);
    }

    public short v() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        int i11 = i10 + 1;
        this.f410b = i11;
        this.f410b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String w(int i10) {
        return x(i10, x5.b.f32750c);
    }

    public String x(int i10, Charset charset) {
        String str = new String(this.f409a, this.f410b, i10, charset);
        this.f410b += i10;
        return str;
    }

    public int y() {
        return (z() << 21) | (z() << 14) | (z() << 7) | z();
    }

    public int z() {
        byte[] bArr = this.f409a;
        int i10 = this.f410b;
        this.f410b = i10 + 1;
        return bArr[i10] & 255;
    }

    public c0(int i10) {
        this.f409a = new byte[i10];
        this.f411c = i10;
    }

    public c0(byte[] bArr) {
        this.f409a = bArr;
        this.f411c = bArr.length;
    }

    public c0(byte[] bArr, int i10) {
        this.f409a = bArr;
        this.f411c = i10;
    }
}
