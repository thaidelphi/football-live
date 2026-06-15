package a5;

import java.util.Arrays;
/* compiled from: LongArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private int f517a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f518b;

    public u() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f517a;
        long[] jArr = this.f518b;
        if (i10 == jArr.length) {
            this.f518b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f518b;
        int i11 = this.f517a;
        this.f517a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f517a) {
            return this.f518b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f517a);
    }

    public int c() {
        return this.f517a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f518b, this.f517a);
    }

    public u(int i10) {
        this.f518b = new long[i10];
    }
}
