package y9;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSink.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f33379a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final r f33380b;

    /* renamed from: c  reason: collision with root package name */
    boolean f33381c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(r rVar) {
        Objects.requireNonNull(rVar, "sink == null");
        this.f33380b = rVar;
    }

    @Override // y9.r
    public void A(c cVar, long j10) throws IOException {
        if (!this.f33381c) {
            this.f33379a.A(cVar, j10);
            s();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.d
    public d B(String str) throws IOException {
        if (!this.f33381c) {
            this.f33379a.B(str);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.d
    public d O(byte[] bArr) throws IOException {
        if (!this.f33381c) {
            this.f33379a.O(bArr);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.d
    public d Z(long j10) throws IOException {
        if (!this.f33381c) {
            this.f33379a.Z(j10);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33381c) {
            return;
        }
        Throwable th = null;
        try {
            c cVar = this.f33379a;
            long j10 = cVar.f33354b;
            if (j10 > 0) {
                this.f33380b.A(cVar, j10);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f33380b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f33381c = true;
        if (th != null) {
            u.e(th);
        }
    }

    @Override // y9.d
    public c d() {
        return this.f33379a;
    }

    @Override // y9.r
    public t e() {
        return this.f33380b.e();
    }

    @Override // y9.d
    public d e0(int i10) throws IOException {
        if (!this.f33381c) {
            this.f33379a.e0(i10);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.d, y9.r, java.io.Flushable
    public void flush() throws IOException {
        if (!this.f33381c) {
            c cVar = this.f33379a;
            long j10 = cVar.f33354b;
            if (j10 > 0) {
                this.f33380b.A(cVar, j10);
            }
            this.f33380b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f33381c;
    }

    @Override // y9.d
    public d j0(int i10) throws IOException {
        if (!this.f33381c) {
            this.f33379a.j0(i10);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.d
    public d o(int i10) throws IOException {
        if (!this.f33381c) {
            this.f33379a.o(i10);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.d
    public d s() throws IOException {
        if (!this.f33381c) {
            long k10 = this.f33379a.k();
            if (k10 > 0) {
                this.f33380b.A(this.f33379a, k10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.d
    public d t0(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f33381c) {
            this.f33379a.t0(bArr, i10, i11);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f33380b + ")";
    }

    @Override // y9.d
    public d u0(long j10) throws IOException {
        if (!this.f33381c) {
            this.f33379a.u0(j10);
            return s();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f33381c) {
            int write = this.f33379a.write(byteBuffer);
            s();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
