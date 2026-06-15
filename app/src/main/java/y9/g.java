package y9;

import java.io.IOException;
/* compiled from: ForwardingSink.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class g implements r {

    /* renamed from: a  reason: collision with root package name */
    private final r f33361a;

    public g(r rVar) {
        if (rVar != null) {
            this.f33361a = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // y9.r
    public void A(c cVar, long j10) throws IOException {
        this.f33361a.A(cVar, j10);
    }

    @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33361a.close();
    }

    @Override // y9.r
    public t e() {
        return this.f33361a.e();
    }

    @Override // y9.r, java.io.Flushable
    public void flush() throws IOException {
        this.f33361a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f33361a.toString() + ")";
    }
}
