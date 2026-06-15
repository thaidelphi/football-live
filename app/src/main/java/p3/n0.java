package p3;

import a5.p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p3.g;
/* compiled from: SonicAudioProcessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n0 implements g {

    /* renamed from: b  reason: collision with root package name */
    private int f29753b;

    /* renamed from: c  reason: collision with root package name */
    private float f29754c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f29755d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private g.a f29756e;

    /* renamed from: f  reason: collision with root package name */
    private g.a f29757f;

    /* renamed from: g  reason: collision with root package name */
    private g.a f29758g;

    /* renamed from: h  reason: collision with root package name */
    private g.a f29759h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29760i;

    /* renamed from: j  reason: collision with root package name */
    private m0 f29761j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f29762k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f29763l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f29764m;

    /* renamed from: n  reason: collision with root package name */
    private long f29765n;

    /* renamed from: o  reason: collision with root package name */
    private long f29766o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29767p;

    public n0() {
        g.a aVar = g.a.f29685e;
        this.f29756e = aVar;
        this.f29757f = aVar;
        this.f29758g = aVar;
        this.f29759h = aVar;
        ByteBuffer byteBuffer = g.f29684a;
        this.f29762k = byteBuffer;
        this.f29763l = byteBuffer.asShortBuffer();
        this.f29764m = byteBuffer;
        this.f29753b = -1;
    }

    @Override // p3.g
    public ByteBuffer a() {
        int k10;
        m0 m0Var = this.f29761j;
        if (m0Var != null && (k10 = m0Var.k()) > 0) {
            if (this.f29762k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f29762k = order;
                this.f29763l = order.asShortBuffer();
            } else {
                this.f29762k.clear();
                this.f29763l.clear();
            }
            m0Var.j(this.f29763l);
            this.f29766o += k10;
            this.f29762k.limit(k10);
            this.f29764m = this.f29762k;
        }
        ByteBuffer byteBuffer = this.f29764m;
        this.f29764m = g.f29684a;
        return byteBuffer;
    }

    @Override // p3.g
    public g.a b(g.a aVar) throws g.b {
        if (aVar.f29688c == 2) {
            int i10 = this.f29753b;
            if (i10 == -1) {
                i10 = aVar.f29686a;
            }
            this.f29756e = aVar;
            g.a aVar2 = new g.a(i10, aVar.f29687b, 2);
            this.f29757f = aVar2;
            this.f29760i = true;
            return aVar2;
        }
        throw new g.b(aVar);
    }

    @Override // p3.g
    public boolean c() {
        m0 m0Var;
        return this.f29767p && ((m0Var = this.f29761j) == null || m0Var.k() == 0);
    }

    @Override // p3.g
    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f29765n += remaining;
            ((m0) a5.a.e(this.f29761j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p3.g
    public void e() {
        m0 m0Var = this.f29761j;
        if (m0Var != null) {
            m0Var.s();
        }
        this.f29767p = true;
    }

    public long f(long j10) {
        if (this.f29766o >= 1024) {
            long l10 = this.f29765n - ((m0) a5.a.e(this.f29761j)).l();
            int i10 = this.f29759h.f29686a;
            int i11 = this.f29758g.f29686a;
            if (i10 == i11) {
                return p0.O0(j10, l10, this.f29766o);
            }
            return p0.O0(j10, l10 * i10, this.f29766o * i11);
        }
        return (long) (this.f29754c * j10);
    }

    @Override // p3.g
    public void flush() {
        if (isActive()) {
            g.a aVar = this.f29756e;
            this.f29758g = aVar;
            g.a aVar2 = this.f29757f;
            this.f29759h = aVar2;
            if (this.f29760i) {
                this.f29761j = new m0(aVar.f29686a, aVar.f29687b, this.f29754c, this.f29755d, aVar2.f29686a);
            } else {
                m0 m0Var = this.f29761j;
                if (m0Var != null) {
                    m0Var.i();
                }
            }
        }
        this.f29764m = g.f29684a;
        this.f29765n = 0L;
        this.f29766o = 0L;
        this.f29767p = false;
    }

    public void g(float f10) {
        if (this.f29755d != f10) {
            this.f29755d = f10;
            this.f29760i = true;
        }
    }

    public void h(float f10) {
        if (this.f29754c != f10) {
            this.f29754c = f10;
            this.f29760i = true;
        }
    }

    @Override // p3.g
    public boolean isActive() {
        return this.f29757f.f29686a != -1 && (Math.abs(this.f29754c - 1.0f) >= 1.0E-4f || Math.abs(this.f29755d - 1.0f) >= 1.0E-4f || this.f29757f.f29686a != this.f29756e.f29686a);
    }

    @Override // p3.g
    public void reset() {
        this.f29754c = 1.0f;
        this.f29755d = 1.0f;
        g.a aVar = g.a.f29685e;
        this.f29756e = aVar;
        this.f29757f = aVar;
        this.f29758g = aVar;
        this.f29759h = aVar;
        ByteBuffer byteBuffer = g.f29684a;
        this.f29762k = byteBuffer;
        this.f29763l = byteBuffer.asShortBuffer();
        this.f29764m = byteBuffer;
        this.f29753b = -1;
        this.f29760i = false;
        this.f29761j = null;
        this.f29765n = 0L;
        this.f29766o = 0L;
        this.f29767p = false;
    }
}
