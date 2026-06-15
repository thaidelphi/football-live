package x3;

import java.util.NoSuchElementException;
/* compiled from: IntArrayQueue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f32476a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f32477b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f32478c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f32479d;

    /* renamed from: e  reason: collision with root package name */
    private int f32480e;

    public k() {
        int[] iArr = new int[16];
        this.f32479d = iArr;
        this.f32480e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f32479d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f32476a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f32479d, 0, iArr2, i11, i10);
            this.f32476a = 0;
            this.f32477b = this.f32478c - 1;
            this.f32479d = iArr2;
            this.f32480e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f32478c == this.f32479d.length) {
            c();
        }
        int i11 = (this.f32477b + 1) & this.f32480e;
        this.f32477b = i11;
        this.f32479d[i11] = i10;
        this.f32478c++;
    }

    public void b() {
        this.f32476a = 0;
        this.f32477b = -1;
        this.f32478c = 0;
    }

    public boolean d() {
        return this.f32478c == 0;
    }

    public int e() {
        int i10 = this.f32478c;
        if (i10 != 0) {
            int[] iArr = this.f32479d;
            int i11 = this.f32476a;
            int i12 = iArr[i11];
            this.f32476a = (i11 + 1) & this.f32480e;
            this.f32478c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
