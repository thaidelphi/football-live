package p3;

import a5.p0;
import java.nio.ByteBuffer;
import p3.g;
/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class o0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private int f29772i;

    /* renamed from: j  reason: collision with root package name */
    private int f29773j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29774k;

    /* renamed from: l  reason: collision with root package name */
    private int f29775l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f29776m = p0.f487f;

    /* renamed from: n  reason: collision with root package name */
    private int f29777n;

    /* renamed from: o  reason: collision with root package name */
    private long f29778o;

    @Override // p3.z, p3.g
    public ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.f29777n) > 0) {
            k(i10).put(this.f29776m, 0, this.f29777n).flip();
            this.f29777n = 0;
        }
        return super.a();
    }

    @Override // p3.z, p3.g
    public boolean c() {
        return super.c() && this.f29777n == 0;
    }

    @Override // p3.g
    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f29775l);
        this.f29778o += min / this.f29838b.f29689d;
        this.f29775l -= min;
        byteBuffer.position(position + min);
        if (this.f29775l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f29777n + i11) - this.f29776m.length;
        ByteBuffer k10 = k(length);
        int q10 = p0.q(length, 0, this.f29777n);
        k10.put(this.f29776m, 0, q10);
        int q11 = p0.q(length - q10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + q11);
        k10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - q11;
        int i13 = this.f29777n - q10;
        this.f29777n = i13;
        byte[] bArr = this.f29776m;
        System.arraycopy(bArr, q10, bArr, 0, i13);
        byteBuffer.get(this.f29776m, this.f29777n, i12);
        this.f29777n += i12;
        k10.flip();
    }

    @Override // p3.z
    public g.a g(g.a aVar) throws g.b {
        if (aVar.f29688c == 2) {
            this.f29774k = true;
            return (this.f29772i == 0 && this.f29773j == 0) ? g.a.f29685e : aVar;
        }
        throw new g.b(aVar);
    }

    @Override // p3.z
    protected void h() {
        if (this.f29774k) {
            this.f29774k = false;
            int i10 = this.f29773j;
            int i11 = this.f29838b.f29689d;
            this.f29776m = new byte[i10 * i11];
            this.f29775l = this.f29772i * i11;
        }
        this.f29777n = 0;
    }

    @Override // p3.z
    protected void i() {
        int i10;
        if (this.f29774k) {
            if (this.f29777n > 0) {
                this.f29778o += i10 / this.f29838b.f29689d;
            }
            this.f29777n = 0;
        }
    }

    @Override // p3.z
    protected void j() {
        this.f29776m = p0.f487f;
    }

    public long l() {
        return this.f29778o;
    }

    public void m() {
        this.f29778o = 0L;
    }

    public void n(int i10, int i11) {
        this.f29772i = i10;
        this.f29773j = i11;
    }
}
