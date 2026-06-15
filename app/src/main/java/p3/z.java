package p3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p3.g;
/* compiled from: BaseAudioProcessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class z implements g {

    /* renamed from: b  reason: collision with root package name */
    protected g.a f29838b;

    /* renamed from: c  reason: collision with root package name */
    protected g.a f29839c;

    /* renamed from: d  reason: collision with root package name */
    private g.a f29840d;

    /* renamed from: e  reason: collision with root package name */
    private g.a f29841e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f29842f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f29843g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29844h;

    public z() {
        ByteBuffer byteBuffer = g.f29684a;
        this.f29842f = byteBuffer;
        this.f29843g = byteBuffer;
        g.a aVar = g.a.f29685e;
        this.f29840d = aVar;
        this.f29841e = aVar;
        this.f29838b = aVar;
        this.f29839c = aVar;
    }

    @Override // p3.g
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f29843g;
        this.f29843g = g.f29684a;
        return byteBuffer;
    }

    @Override // p3.g
    public final g.a b(g.a aVar) throws g.b {
        this.f29840d = aVar;
        this.f29841e = g(aVar);
        return isActive() ? this.f29841e : g.a.f29685e;
    }

    @Override // p3.g
    public boolean c() {
        return this.f29844h && this.f29843g == g.f29684a;
    }

    @Override // p3.g
    public final void e() {
        this.f29844h = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f() {
        return this.f29843g.hasRemaining();
    }

    @Override // p3.g
    public final void flush() {
        this.f29843g = g.f29684a;
        this.f29844h = false;
        this.f29838b = this.f29840d;
        this.f29839c = this.f29841e;
        h();
    }

    protected abstract g.a g(g.a aVar) throws g.b;

    protected void h() {
    }

    protected void i() {
    }

    @Override // p3.g
    public boolean isActive() {
        return this.f29841e != g.a.f29685e;
    }

    protected void j() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer k(int i10) {
        if (this.f29842f.capacity() < i10) {
            this.f29842f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f29842f.clear();
        }
        ByteBuffer byteBuffer = this.f29842f;
        this.f29843g = byteBuffer;
        return byteBuffer;
    }

    @Override // p3.g
    public final void reset() {
        flush();
        this.f29842f = g.f29684a;
        g.a aVar = g.a.f29685e;
        this.f29840d = aVar;
        this.f29841e = aVar;
        this.f29838b = aVar;
        this.f29839c = aVar;
        j();
    }
}
