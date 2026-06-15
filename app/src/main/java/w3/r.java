package w3;

import java.util.Arrays;
/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    private final int f32242a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32243b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32244c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f32245d;

    /* renamed from: e  reason: collision with root package name */
    public int f32246e;

    public r(int i10, int i11) {
        this.f32242a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f32245d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f32243b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f32245d;
            int length = bArr2.length;
            int i13 = this.f32246e;
            if (length < i13 + i12) {
                this.f32245d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f32245d, this.f32246e, i12);
            this.f32246e += i12;
        }
    }

    public boolean b(int i10) {
        if (this.f32243b) {
            this.f32246e -= i10;
            this.f32243b = false;
            this.f32244c = true;
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f32244c;
    }

    public void d() {
        this.f32243b = false;
        this.f32244c = false;
    }

    public void e(int i10) {
        a5.a.f(!this.f32243b);
        boolean z10 = i10 == this.f32242a;
        this.f32243b = z10;
        if (z10) {
            this.f32246e = 3;
            this.f32244c = false;
        }
    }
}
