package y9;

import java.io.IOException;
/* compiled from: ForwardingSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class h implements s {

    /* renamed from: a  reason: collision with root package name */
    private final s f33362a;

    public h(s sVar) {
        if (sVar != null) {
            this.f33362a = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // y9.s
    public long H(c cVar, long j10) throws IOException {
        return this.f33362a.H(cVar, j10);
    }

    public final s a() {
        return this.f33362a;
    }

    @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33362a.close();
    }

    @Override // y9.s
    public t e() {
        return this.f33362a.e();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f33362a.toString() + ")";
    }
}
