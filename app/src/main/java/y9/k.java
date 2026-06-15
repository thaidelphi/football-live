package y9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: InflaterSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k implements s {

    /* renamed from: a  reason: collision with root package name */
    private final e f33369a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f33370b;

    /* renamed from: c  reason: collision with root package name */
    private int f33371c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33372d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater != null) {
            this.f33369a = eVar;
            this.f33370b = inflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }

    private void b() throws IOException {
        int i10 = this.f33371c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f33370b.getRemaining();
        this.f33371c -= remaining;
        this.f33369a.c(remaining);
    }

    @Override // y9.s
    public long H(c cVar, long j10) throws IOException {
        o o02;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (this.f33372d) {
                throw new IllegalStateException("closed");
            }
            if (i10 == 0) {
                return 0L;
            }
            while (true) {
                boolean a10 = a();
                try {
                    o02 = cVar.o0(1);
                    int inflate = this.f33370b.inflate(o02.f33386a, o02.f33388c, (int) Math.min(j10, 8192 - o02.f33388c));
                    if (inflate > 0) {
                        o02.f33388c += inflate;
                        long j11 = inflate;
                        cVar.f33354b += j11;
                        return j11;
                    } else if (this.f33370b.finished() || this.f33370b.needsDictionary()) {
                        break;
                    } else if (a10) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e8) {
                    throw new IOException(e8);
                }
            }
            b();
            if (o02.f33387b == o02.f33388c) {
                cVar.f33353a = o02.b();
                p.a(o02);
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    public final boolean a() throws IOException {
        if (this.f33370b.needsInput()) {
            b();
            if (this.f33370b.getRemaining() == 0) {
                if (this.f33369a.i0()) {
                    return true;
                }
                o oVar = this.f33369a.d().f33353a;
                int i10 = oVar.f33388c;
                int i11 = oVar.f33387b;
                int i12 = i10 - i11;
                this.f33371c = i12;
                this.f33370b.setInput(oVar.f33386a, i11, i12);
                return false;
            }
            throw new IllegalStateException("?");
        }
        return false;
    }

    @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33372d) {
            return;
        }
        this.f33370b.end();
        this.f33372d = true;
        this.f33369a.close();
    }

    @Override // y9.s
    public t e() {
        return this.f33369a.e();
    }
}
