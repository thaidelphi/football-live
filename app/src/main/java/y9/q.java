package y9;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedByteString.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class q extends f {

    /* renamed from: f  reason: collision with root package name */
    final transient byte[][] f33395f;

    /* renamed from: g  reason: collision with root package name */
    final transient int[] f33396g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(c cVar, int i10) {
        super(null);
        u.b(cVar.f33354b, 0L, i10);
        o oVar = cVar.f33353a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = oVar.f33388c;
            int i15 = oVar.f33387b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                oVar = oVar.f33391f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f33395f = new byte[i13];
        this.f33396g = new int[i13 * 2];
        o oVar2 = cVar.f33353a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f33395f;
            bArr[i16] = oVar2.f33386a;
            int i17 = oVar2.f33388c;
            int i18 = oVar2.f33387b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f33396g;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            oVar2.f33389d = true;
            i16++;
            oVar2 = oVar2.f33391f;
        }
    }

    private int y(int i10) {
        int binarySearch = Arrays.binarySearch(this.f33396g, 0, this.f33395f.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f z() {
        return new f(v());
    }

    @Override // y9.f
    public String a() {
        return z().a();
    }

    @Override // y9.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.r() == r() && n(0, fVar, 0, r())) {
                return true;
            }
        }
        return false;
    }

    @Override // y9.f
    public int hashCode() {
        int i10 = this.f33359b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f33395f.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f33395f[i11];
            int[] iArr = this.f33396g;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f33359b = i12;
        return i12;
    }

    @Override // y9.f
    public byte j(int i10) {
        u.b(this.f33396g[this.f33395f.length - 1], i10, 1L);
        int y10 = y(i10);
        int i11 = y10 == 0 ? 0 : this.f33396g[y10 - 1];
        int[] iArr = this.f33396g;
        byte[][] bArr = this.f33395f;
        return bArr[y10][(i10 - i11) + iArr[bArr.length + y10]];
    }

    @Override // y9.f
    public String k() {
        return z().k();
    }

    @Override // y9.f
    public f l() {
        return z().l();
    }

    @Override // y9.f
    public boolean n(int i10, f fVar, int i11, int i12) {
        if (i10 < 0 || i10 > r() - i12) {
            return false;
        }
        int y10 = y(i10);
        while (i12 > 0) {
            int i13 = y10 == 0 ? 0 : this.f33396g[y10 - 1];
            int min = Math.min(i12, ((this.f33396g[y10] - i13) + i13) - i10);
            int[] iArr = this.f33396g;
            byte[][] bArr = this.f33395f;
            if (!fVar.o(i11, bArr[y10], (i10 - i13) + iArr[bArr.length + y10], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            y10++;
        }
        return true;
    }

    @Override // y9.f
    public boolean o(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > r() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int y10 = y(i10);
        while (i12 > 0) {
            int i13 = y10 == 0 ? 0 : this.f33396g[y10 - 1];
            int min = Math.min(i12, ((this.f33396g[y10] - i13) + i13) - i10);
            int[] iArr = this.f33396g;
            byte[][] bArr2 = this.f33395f;
            if (!u.a(bArr2[y10], (i10 - i13) + iArr[bArr2.length + y10], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            y10++;
        }
        return true;
    }

    @Override // y9.f
    public f p() {
        return z().p();
    }

    @Override // y9.f
    public f q() {
        return z().q();
    }

    @Override // y9.f
    public int r() {
        return this.f33396g[this.f33395f.length - 1];
    }

    @Override // y9.f
    public f t(int i10, int i11) {
        return z().t(i10, i11);
    }

    @Override // y9.f
    public String toString() {
        return z().toString();
    }

    @Override // y9.f
    public f u() {
        return z().u();
    }

    @Override // y9.f
    public byte[] v() {
        int[] iArr = this.f33396g;
        byte[][] bArr = this.f33395f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f33396g;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f33395f[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // y9.f
    public String w() {
        return z().w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y9.f
    public void x(c cVar) {
        int length = this.f33395f.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f33396g;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            o oVar = new o(this.f33395f[i10], i12, (i12 + i13) - i11, true, false);
            o oVar2 = cVar.f33353a;
            if (oVar2 == null) {
                oVar.f33392g = oVar;
                oVar.f33391f = oVar;
                cVar.f33353a = oVar;
            } else {
                oVar2.f33392g.c(oVar);
            }
            i10++;
            i11 = i13;
        }
        cVar.f33354b += i11;
    }
}
