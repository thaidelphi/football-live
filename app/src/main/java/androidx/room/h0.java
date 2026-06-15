package androidx.room;

import androidx.room.q0;
import java.util.concurrent.Executor;
/* compiled from: QueryInterceptorOpenHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h0 implements v0.h, o {

    /* renamed from: a  reason: collision with root package name */
    private final v0.h f4187a;

    /* renamed from: b  reason: collision with root package name */
    private final q0.f f4188b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f4189c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(v0.h hVar, q0.f fVar, Executor executor) {
        this.f4187a = hVar;
        this.f4188b = fVar;
        this.f4189c = executor;
    }

    @Override // v0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4187a.close();
    }

    @Override // v0.h
    public String getDatabaseName() {
        return this.f4187a.getDatabaseName();
    }

    @Override // androidx.room.o
    public v0.h getDelegate() {
        return this.f4187a;
    }

    @Override // v0.h
    public v0.g q0() {
        return new g0(this.f4187a.q0(), this.f4188b, this.f4189c);
    }

    @Override // v0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4187a.setWriteAheadLoggingEnabled(z10);
    }
}
