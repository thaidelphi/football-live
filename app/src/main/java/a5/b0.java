package a5;

import java.nio.charset.Charset;
/* compiled from: ParsableBitArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f405a;

    /* renamed from: b  reason: collision with root package name */
    private int f406b;

    /* renamed from: c  reason: collision with root package name */
    private int f407c;

    /* renamed from: d  reason: collision with root package name */
    private int f408d;

    public b0() {
        this.f405a = p0.f487f;
    }

    private void a() {
        int i10;
        int i11 = this.f406b;
        a.f(i11 >= 0 && (i11 < (i10 = this.f408d) || (i11 == i10 && this.f407c == 0)));
    }

    public int b() {
        return ((this.f408d - this.f406b) * 8) - this.f407c;
    }

    public void c() {
        if (this.f407c == 0) {
            return;
        }
        this.f407c = 0;
        this.f406b++;
        a();
    }

    public int d() {
        a.f(this.f407c == 0);
        return this.f406b;
    }

    public int e() {
        return (this.f406b * 8) + this.f407c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f407c, i11);
        int i12 = this.f407c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f405a;
        int i14 = this.f406b;
        bArr[i14] = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        int i15 = i11 - min;
        bArr[i14] = (byte) (((i10 >>> i15) << i13) | bArr[i14]);
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f405a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f405a;
        bArr2[i16] = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | bArr2[i16]);
        q(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f405a[this.f406b] & (128 >> this.f407c)) != 0;
        p();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f407c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f407c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f407c = i13;
            byte[] bArr = this.f405a;
            int i14 = this.f406b;
            this.f406b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f405a;
        int i15 = this.f406b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f407c = 0;
            this.f406b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f405a;
            int i13 = this.f406b;
            int i14 = i13 + 1;
            this.f406b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f407c;
            bArr[i10] = (byte) (b10 << i15);
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | bArr[i10]);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        bArr[i12] = (byte) (bArr[i12] & (255 >> i16));
        int i17 = this.f407c;
        if (i17 + i16 > 8) {
            int i18 = bArr[i12];
            byte[] bArr3 = this.f405a;
            int i19 = this.f406b;
            this.f406b = i19 + 1;
            bArr[i12] = (byte) (i18 | ((bArr3[i19] & 255) << i17));
            this.f407c = i17 - 8;
        }
        int i20 = this.f407c + i16;
        this.f407c = i20;
        byte[] bArr4 = this.f405a;
        int i21 = this.f406b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i16))) | bArr[i12]);
        if (i20 == 8) {
            this.f407c = 0;
            this.f406b = i21 + 1;
        }
        a();
    }

    public void j(byte[] bArr, int i10, int i11) {
        a.f(this.f407c == 0);
        System.arraycopy(this.f405a, this.f406b, bArr, i10, i11);
        this.f406b += i11;
        a();
    }

    public String k(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        j(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void l(c0 c0Var) {
        n(c0Var.d(), c0Var.f());
        o(c0Var.e() * 8);
    }

    public void m(byte[] bArr) {
        n(bArr, bArr.length);
    }

    public void n(byte[] bArr, int i10) {
        this.f405a = bArr;
        this.f406b = 0;
        this.f407c = 0;
        this.f408d = i10;
    }

    public void o(int i10) {
        int i11 = i10 / 8;
        this.f406b = i11;
        this.f407c = i10 - (i11 * 8);
        a();
    }

    public void p() {
        int i10 = this.f407c + 1;
        this.f407c = i10;
        if (i10 == 8) {
            this.f407c = 0;
            this.f406b++;
        }
        a();
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f406b + i11;
        this.f406b = i12;
        int i13 = this.f407c + (i10 - (i11 * 8));
        this.f407c = i13;
        if (i13 > 7) {
            this.f406b = i12 + 1;
            this.f407c = i13 - 8;
        }
        a();
    }

    public void r(int i10) {
        a.f(this.f407c == 0);
        this.f406b += i10;
        a();
    }

    public b0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public b0(byte[] bArr, int i10) {
        this.f405a = bArr;
        this.f408d = i10;
    }
}
