package y9;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: ForwardingTimeout.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class i extends t {

    /* renamed from: e  reason: collision with root package name */
    private t f33363e;

    public i(t tVar) {
        if (tVar != null) {
            this.f33363e = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // y9.t
    public t a() {
        return this.f33363e.a();
    }

    @Override // y9.t
    public t b() {
        return this.f33363e.b();
    }

    @Override // y9.t
    public long c() {
        return this.f33363e.c();
    }

    @Override // y9.t
    public t d(long j10) {
        return this.f33363e.d(j10);
    }

    @Override // y9.t
    public boolean e() {
        return this.f33363e.e();
    }

    @Override // y9.t
    public void f() throws IOException {
        this.f33363e.f();
    }

    @Override // y9.t
    public t g(long j10, TimeUnit timeUnit) {
        return this.f33363e.g(j10, timeUnit);
    }

    public final t i() {
        return this.f33363e;
    }

    public final i j(t tVar) {
        if (tVar != null) {
            this.f33363e = tVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
