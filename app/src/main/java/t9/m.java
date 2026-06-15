package t9;

import java.util.Arrays;
/* compiled from: Settings.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f31248a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f31249b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f31248a = 0;
        Arrays.fill(this.f31249b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i10) {
        return this.f31249b[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        if ((this.f31248a & 2) != 0) {
            return this.f31249b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        if ((this.f31248a & 128) != 0) {
            return this.f31249b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(int i10) {
        return (this.f31248a & 16) != 0 ? this.f31249b[4] : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i10) {
        return (this.f31248a & 32) != 0 ? this.f31249b[5] : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i10) {
        return ((1 << i10) & this.f31248a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.g(i10)) {
                i(i10, mVar.b(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m i(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f31249b;
            if (i10 < iArr.length) {
                this.f31248a = (1 << i10) | this.f31248a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.f31248a);
    }
}
