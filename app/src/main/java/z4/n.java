package z4;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: DataSourceInputStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final l f33555a;

    /* renamed from: b  reason: collision with root package name */
    private final p f33556b;

    /* renamed from: f  reason: collision with root package name */
    private long f33560f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33558d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33559e = false;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f33557c = new byte[1];

    public n(l lVar, p pVar) {
        this.f33555a = lVar;
        this.f33556b = pVar;
    }

    private void a() throws IOException {
        if (this.f33558d) {
            return;
        }
        this.f33555a.l(this.f33556b);
        this.f33558d = true;
    }

    public void b() throws IOException {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33559e) {
            return;
        }
        this.f33555a.close();
        this.f33559e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f33557c) == -1) {
            return -1;
        }
        return this.f33557c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        a5.a.f(!this.f33559e);
        a();
        int b10 = this.f33555a.b(bArr, i10, i11);
        if (b10 == -1) {
            return -1;
        }
        this.f33560f += b10;
        return b10;
    }
}
