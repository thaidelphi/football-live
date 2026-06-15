package androidx.collection;
/* compiled from: CircularIntArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private int[] f1932a;

    /* renamed from: b  reason: collision with root package name */
    private int f1933b;

    /* renamed from: c  reason: collision with root package name */
    private int f1934c;

    /* renamed from: d  reason: collision with root package name */
    private int f1935d;

    public c() {
        this(8);
    }

    private void c() {
        int[] iArr = this.f1932a;
        int length = iArr.length;
        int i10 = this.f1933b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f1932a, 0, iArr2, i11, this.f1933b);
            this.f1932a = iArr2;
            this.f1933b = 0;
            this.f1934c = length;
            this.f1935d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void a(int i10) {
        int[] iArr = this.f1932a;
        int i11 = this.f1934c;
        iArr[i11] = i10;
        int i12 = this.f1935d & (i11 + 1);
        this.f1934c = i12;
        if (i12 == this.f1933b) {
            c();
        }
    }

    public void b() {
        this.f1934c = this.f1933b;
    }

    public boolean d() {
        return this.f1933b == this.f1934c;
    }

    public int e() {
        int i10 = this.f1933b;
        if (i10 != this.f1934c) {
            int i11 = this.f1932a[i10];
            this.f1933b = (i10 + 1) & this.f1935d;
            return i11;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 <= 1073741824) {
            i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
            this.f1935d = i10 - 1;
            this.f1932a = new int[i10];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}
