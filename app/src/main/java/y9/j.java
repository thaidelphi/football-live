package y9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: GzipSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class j implements s {

    /* renamed from: b  reason: collision with root package name */
    private final e f33365b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f33366c;

    /* renamed from: d  reason: collision with root package name */
    private final k f33367d;

    /* renamed from: a  reason: collision with root package name */
    private int f33364a = 0;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f33368e = new CRC32();

    public j(s sVar) {
        if (sVar != null) {
            Inflater inflater = new Inflater(true);
            this.f33366c = inflater;
            e d10 = l.d(sVar);
            this.f33365b = d10;
            this.f33367d = new k(d10, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private void b() throws IOException {
        this.f33365b.Y(10L);
        byte z10 = this.f33365b.d().z(3L);
        boolean z11 = ((z10 >> 1) & 1) == 1;
        if (z11) {
            j(this.f33365b.d(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f33365b.readShort());
        this.f33365b.c(8L);
        if (((z10 >> 2) & 1) == 1) {
            this.f33365b.Y(2L);
            if (z11) {
                j(this.f33365b.d(), 0L, 2L);
            }
            long T = this.f33365b.d().T();
            this.f33365b.Y(T);
            if (z11) {
                j(this.f33365b.d(), 0L, T);
            }
            this.f33365b.c(T);
        }
        if (((z10 >> 3) & 1) == 1) {
            long b02 = this.f33365b.b0((byte) 0);
            if (b02 != -1) {
                if (z11) {
                    j(this.f33365b.d(), 0L, b02 + 1);
                }
                this.f33365b.c(b02 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((z10 >> 4) & 1) == 1) {
            long b03 = this.f33365b.b0((byte) 0);
            if (b03 != -1) {
                if (z11) {
                    j(this.f33365b.d(), 0L, b03 + 1);
                }
                this.f33365b.c(b03 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z11) {
            a("FHCRC", this.f33365b.T(), (short) this.f33368e.getValue());
            this.f33368e.reset();
        }
    }

    private void f() throws IOException {
        a("CRC", this.f33365b.w0(), (int) this.f33368e.getValue());
        a("ISIZE", this.f33365b.w0(), (int) this.f33366c.getBytesWritten());
    }

    private void j(c cVar, long j10, long j11) {
        int i10;
        o oVar = cVar.f33353a;
        while (true) {
            int i11 = oVar.f33388c;
            int i12 = oVar.f33387b;
            if (j10 < i11 - i12) {
                break;
            }
            j10 -= i11 - i12;
            oVar = oVar.f33391f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(oVar.f33388c - i10, j11);
            this.f33368e.update(oVar.f33386a, (int) (oVar.f33387b + j10), min);
            j11 -= min;
            oVar = oVar.f33391f;
            j10 = 0;
        }
    }

    @Override // y9.s
    public long H(c cVar, long j10) throws IOException {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (i10 == 0) {
            return 0L;
        } else {
            if (this.f33364a == 0) {
                b();
                this.f33364a = 1;
            }
            if (this.f33364a == 1) {
                long j11 = cVar.f33354b;
                long H = this.f33367d.H(cVar, j10);
                if (H != -1) {
                    j(cVar, j11, H);
                    return H;
                }
                this.f33364a = 2;
            }
            if (this.f33364a == 2) {
                f();
                this.f33364a = 3;
                if (!this.f33365b.i0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33367d.close();
    }

    @Override // y9.s
    public t e() {
        return this.f33365b.e();
    }
}
