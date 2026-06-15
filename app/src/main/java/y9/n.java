package y9;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n implements e {

    /* renamed from: a  reason: collision with root package name */
    public final c f33382a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final s f33383b;

    /* renamed from: c  reason: collision with root package name */
    boolean f33384c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(s sVar) {
        Objects.requireNonNull(sVar, "source == null");
        this.f33383b = sVar;
    }

    @Override // y9.e
    public boolean B0(long j10, f fVar) throws IOException {
        return b(j10, fVar, 0, fVar.r());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // y9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long E0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.Y(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.f(r3)
            if (r3 == 0) goto L4a
            y9.c r3 = r6.f33382a
            long r4 = (long) r1
            byte r3 = r3.z(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            y9.c r0 = r6.f33382a
            long r0 = r0.E0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.n.E0():long");
    }

    @Override // y9.e
    public InputStream F0() {
        return new a();
    }

    @Override // y9.s
    public long H(c cVar, long j10) throws IOException {
        if (cVar != null) {
            if (j10 >= 0) {
                if (!this.f33384c) {
                    c cVar2 = this.f33382a;
                    if (cVar2.f33354b == 0 && this.f33383b.H(cVar2, 8192L) == -1) {
                        return -1L;
                    }
                    return this.f33382a.H(cVar, Math.min(j10, this.f33382a.f33354b));
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // y9.e
    public String I() throws IOException {
        return u(Long.MAX_VALUE);
    }

    @Override // y9.e
    public byte[] N(long j10) throws IOException {
        Y(j10);
        return this.f33382a.N(j10);
    }

    @Override // y9.e
    public short T() throws IOException {
        Y(2L);
        return this.f33382a.T();
    }

    @Override // y9.e
    public void Y(long j10) throws IOException {
        if (!f(j10)) {
            throw new EOFException();
        }
    }

    public long a(byte b10, long j10, long j11) throws IOException {
        if (this.f33384c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        while (j10 < j11) {
            long E = this.f33382a.E(b10, j10, j11);
            if (E == -1) {
                c cVar = this.f33382a;
                long j12 = cVar.f33354b;
                if (j12 >= j11 || this.f33383b.H(cVar, 8192L) == -1) {
                    break;
                }
                j10 = Math.max(j10, j12);
            } else {
                return E;
            }
        }
        return -1L;
    }

    public boolean b(long j10, f fVar, int i10, int i11) throws IOException {
        if (!this.f33384c) {
            if (j10 < 0 || i10 < 0 || i11 < 0 || fVar.r() - i10 < i11) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = i12 + j10;
                if (!f(1 + j11) || this.f33382a.z(j11) != fVar.j(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // y9.e
    public long b0(byte b10) throws IOException {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    @Override // y9.e
    public void c(long j10) throws IOException {
        if (this.f33384c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            c cVar = this.f33382a;
            if (cVar.f33354b == 0 && this.f33383b.H(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f33382a.S());
            this.f33382a.c(min);
            j10 -= min;
        }
    }

    @Override // y9.e
    public f c0(long j10) throws IOException {
        Y(j10);
        return this.f33382a.c0(j10);
    }

    @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33384c) {
            return;
        }
        this.f33384c = true;
        this.f33383b.close();
        this.f33382a.f();
    }

    @Override // y9.e, y9.d
    public c d() {
        return this.f33382a;
    }

    @Override // y9.s
    public t e() {
        return this.f33383b.e();
    }

    public boolean f(long j10) throws IOException {
        c cVar;
        if (j10 >= 0) {
            if (!this.f33384c) {
                do {
                    cVar = this.f33382a;
                    if (cVar.f33354b >= j10) {
                        return true;
                    }
                } while (this.f33383b.H(cVar, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    @Override // y9.e
    public byte[] h0() throws IOException {
        this.f33382a.D0(this.f33383b);
        return this.f33382a.h0();
    }

    @Override // y9.e
    public boolean i0() throws IOException {
        if (this.f33384c) {
            throw new IllegalStateException("closed");
        }
        return this.f33382a.i0() && this.f33383b.H(this.f33382a, 8192L) == -1;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f33384c;
    }

    @Override // y9.e
    public long l0() throws IOException {
        byte z10;
        Y(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!f(i11)) {
                break;
            }
            z10 = this.f33382a.z(i10);
            if ((z10 < 48 || z10 > 57) && !(i10 == 0 && z10 == 45)) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(z10)));
        }
        return this.f33382a.l0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.f33382a;
        if (cVar.f33354b == 0 && this.f33383b.H(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f33382a.read(byteBuffer);
    }

    @Override // y9.e
    public byte readByte() throws IOException {
        Y(1L);
        return this.f33382a.readByte();
    }

    @Override // y9.e
    public void readFully(byte[] bArr) throws IOException {
        try {
            Y(bArr.length);
            this.f33382a.readFully(bArr);
        } catch (EOFException e8) {
            int i10 = 0;
            while (true) {
                c cVar = this.f33382a;
                long j10 = cVar.f33354b;
                if (j10 > 0) {
                    int G = cVar.G(bArr, i10, (int) j10);
                    if (G == -1) {
                        throw new AssertionError();
                    }
                    i10 += G;
                } else {
                    throw e8;
                }
            }
        }
    }

    @Override // y9.e
    public int readInt() throws IOException {
        Y(4L);
        return this.f33382a.readInt();
    }

    @Override // y9.e
    public short readShort() throws IOException {
        Y(2L);
        return this.f33382a.readShort();
    }

    @Override // y9.e
    public String s0(Charset charset) throws IOException {
        if (charset != null) {
            this.f33382a.D0(this.f33383b);
            return this.f33382a.s0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String toString() {
        return "buffer(" + this.f33383b + ")";
    }

    @Override // y9.e
    public String u(long j10) throws IOException {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            long a10 = a((byte) 10, 0L, j11);
            if (a10 != -1) {
                return this.f33382a.R(a10);
            }
            if (j11 < Long.MAX_VALUE && f(j11) && this.f33382a.z(j11 - 1) == 13 && f(1 + j11) && this.f33382a.z(j11) == 10) {
                return this.f33382a.R(j11);
            }
            c cVar = new c();
            c cVar2 = this.f33382a;
            cVar2.t(cVar, 0L, Math.min(32L, cVar2.S()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f33382a.S(), j10) + " content=" + cVar.J().k() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    @Override // y9.e
    public int w0() throws IOException {
        Y(4L);
        return this.f33382a.w0();
    }

    /* compiled from: RealBufferedSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            n nVar = n.this;
            if (!nVar.f33384c) {
                return (int) Math.min(nVar.f33382a.f33354b, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            n nVar = n.this;
            if (!nVar.f33384c) {
                c cVar = nVar.f33382a;
                if (cVar.f33354b == 0 && nVar.f33383b.H(cVar, 8192L) == -1) {
                    return -1;
                }
                return n.this.f33382a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!n.this.f33384c) {
                u.b(bArr.length, i10, i11);
                n nVar = n.this;
                c cVar = nVar.f33382a;
                if (cVar.f33354b == 0 && nVar.f33383b.H(cVar, 8192L) == -1) {
                    return -1;
                }
                return n.this.f33382a.G(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
