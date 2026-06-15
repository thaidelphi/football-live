package p3;

import a5.p0;
import java.nio.ByteBuffer;
import p3.g;
/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private final long f29715i;

    /* renamed from: j  reason: collision with root package name */
    private final long f29716j;

    /* renamed from: k  reason: collision with root package name */
    private final short f29717k;

    /* renamed from: l  reason: collision with root package name */
    private int f29718l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f29719m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f29720n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f29721o;

    /* renamed from: p  reason: collision with root package name */
    private int f29722p;

    /* renamed from: q  reason: collision with root package name */
    private int f29723q;

    /* renamed from: r  reason: collision with root package name */
    private int f29724r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f29725s;

    /* renamed from: t  reason: collision with root package name */
    private long f29726t;

    public l0() {
        this(150000L, 20000L, (short) 1024);
    }

    private int l(long j10) {
        return (int) ((j10 * this.f29838b.f29686a) / 1000000);
    }

    private int m(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.f29717k) {
                    int i10 = this.f29718l;
                    return ((limit / i10) * i10) + i10;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }

    private int n(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f29717k) {
                int i10 = this.f29718l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void p(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        k(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f29725s = true;
        }
    }

    private void q(byte[] bArr, int i10) {
        k(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f29725s = true;
        }
    }

    private void r(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int n10 = n(byteBuffer);
        int position = n10 - byteBuffer.position();
        byte[] bArr = this.f29720n;
        int length = bArr.length;
        int i10 = this.f29723q;
        int i11 = length - i10;
        if (n10 < limit && position < i11) {
            q(bArr, i10);
            this.f29723q = 0;
            this.f29722p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f29720n, this.f29723q, min);
        int i12 = this.f29723q + min;
        this.f29723q = i12;
        byte[] bArr2 = this.f29720n;
        if (i12 == bArr2.length) {
            if (this.f29725s) {
                q(bArr2, this.f29724r);
                this.f29726t += (this.f29723q - (this.f29724r * 2)) / this.f29718l;
            } else {
                this.f29726t += (i12 - this.f29724r) / this.f29718l;
            }
            v(byteBuffer, this.f29720n, this.f29723q);
            this.f29723q = 0;
            this.f29722p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f29720n.length));
        int m7 = m(byteBuffer);
        if (m7 == byteBuffer.position()) {
            this.f29722p = 1;
        } else {
            byteBuffer.limit(m7);
            p(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int n10 = n(byteBuffer);
        byteBuffer.limit(n10);
        this.f29726t += byteBuffer.remaining() / this.f29718l;
        v(byteBuffer, this.f29721o, this.f29724r);
        if (n10 < limit) {
            q(this.f29721o, this.f29724r);
            this.f29722p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void v(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f29724r);
        int i11 = this.f29724r - min;
        System.arraycopy(bArr, i10 - i11, this.f29721o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f29721o, i11, min);
    }

    @Override // p3.g
    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i10 = this.f29722p;
            if (i10 == 0) {
                s(byteBuffer);
            } else if (i10 == 1) {
                r(byteBuffer);
            } else if (i10 == 2) {
                t(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // p3.z
    public g.a g(g.a aVar) throws g.b {
        if (aVar.f29688c == 2) {
            return this.f29719m ? aVar : g.a.f29685e;
        }
        throw new g.b(aVar);
    }

    @Override // p3.z
    protected void h() {
        if (this.f29719m) {
            this.f29718l = this.f29838b.f29689d;
            int l10 = l(this.f29715i) * this.f29718l;
            if (this.f29720n.length != l10) {
                this.f29720n = new byte[l10];
            }
            int l11 = l(this.f29716j) * this.f29718l;
            this.f29724r = l11;
            if (this.f29721o.length != l11) {
                this.f29721o = new byte[l11];
            }
        }
        this.f29722p = 0;
        this.f29726t = 0L;
        this.f29723q = 0;
        this.f29725s = false;
    }

    @Override // p3.z
    protected void i() {
        int i10 = this.f29723q;
        if (i10 > 0) {
            q(this.f29720n, i10);
        }
        if (this.f29725s) {
            return;
        }
        this.f29726t += this.f29724r / this.f29718l;
    }

    @Override // p3.z, p3.g
    public boolean isActive() {
        return this.f29719m;
    }

    @Override // p3.z
    protected void j() {
        this.f29719m = false;
        this.f29724r = 0;
        byte[] bArr = p0.f487f;
        this.f29720n = bArr;
        this.f29721o = bArr;
    }

    public long o() {
        return this.f29726t;
    }

    public void u(boolean z10) {
        this.f29719m = z10;
    }

    public l0(long j10, long j11, short s10) {
        a5.a.a(j11 <= j10);
        this.f29715i = j10;
        this.f29716j = j11;
        this.f29717k = s10;
        byte[] bArr = p0.f487f;
        this.f29720n = bArr;
        this.f29721o = bArr;
    }
}
