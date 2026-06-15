package g4;

import a5.p0;
import java.io.IOException;
import java.util.Arrays;
import n3.m1;
/* compiled from: DataChunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l extends f {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f25780j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f25781k;

    public l(z4.l lVar, z4.p pVar, int i10, m1 m1Var, int i11, Object obj, byte[] bArr) {
        super(lVar, pVar, i10, m1Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = p0.f487f;
            lVar2 = this;
        } else {
            lVar2 = this;
            bArr2 = bArr;
        }
        lVar2.f25780j = bArr2;
    }

    private void i(int i10) {
        byte[] bArr = this.f25780j;
        if (bArr.length < i10 + 16384) {
            this.f25780j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // z4.j0.e
    public final void a() throws IOException {
        try {
            this.f25743i.l(this.f25736b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f25781k) {
                i(i11);
                i10 = this.f25743i.b(this.f25780j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f25781k) {
                g(this.f25780j, i11);
            }
        } finally {
            z4.o.a(this.f25743i);
        }
    }

    @Override // z4.j0.e
    public final void b() {
        this.f25781k = true;
    }

    protected abstract void g(byte[] bArr, int i10) throws IOException;

    public byte[] h() {
        return this.f25780j;
    }
}
