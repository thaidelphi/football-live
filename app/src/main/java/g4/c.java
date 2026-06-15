package g4;

import e4.d0;
import g4.g;
import s3.t;
/* compiled from: BaseMediaChunkOutput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f25714a;

    /* renamed from: b  reason: collision with root package name */
    private final d0[] f25715b;

    public c(int[] iArr, d0[] d0VarArr) {
        this.f25714a = iArr;
        this.f25715b = d0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f25715b.length];
        int i10 = 0;
        while (true) {
            d0[] d0VarArr = this.f25715b;
            if (i10 >= d0VarArr.length) {
                return iArr;
            }
            iArr[i10] = d0VarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (d0 d0Var : this.f25715b) {
            d0Var.Z(j10);
        }
    }

    @Override // g4.g.b
    public t f(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f25714a;
            if (i12 < iArr.length) {
                if (i11 == iArr[i12]) {
                    return this.f25715b[i12];
                }
                i12++;
            } else {
                a5.t.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new s3.h();
            }
        }
    }
}
