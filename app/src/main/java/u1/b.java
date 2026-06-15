package u1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* compiled from: StrictLineReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f31307a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f31308b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f31309c;

    /* renamed from: d  reason: collision with root package name */
    private int f31310d;

    /* renamed from: e  reason: collision with root package name */
    private int f31311e;

    /* compiled from: StrictLineReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f31308b.name());
            } catch (UnsupportedEncodingException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f31307a;
        byte[] bArr = this.f31309c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f31310d = 0;
            this.f31311e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f31307a) {
            if (this.f31309c != null) {
                this.f31309c = null;
                this.f31307a.close();
            }
        }
    }

    public boolean f() {
        return this.f31311e == -1;
    }

    public String j() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f31307a) {
            if (this.f31309c != null) {
                if (this.f31310d >= this.f31311e) {
                    b();
                }
                for (int i12 = this.f31310d; i12 != this.f31311e; i12++) {
                    byte[] bArr2 = this.f31309c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f31310d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f31308b.name());
                                this.f31310d = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f31308b.name());
                        this.f31310d = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f31311e - this.f31310d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f31309c;
                    int i14 = this.f31310d;
                    aVar.write(bArr3, i14, this.f31311e - i14);
                    this.f31311e = -1;
                    b();
                    i10 = this.f31310d;
                    while (i10 != this.f31311e) {
                        bArr = this.f31309c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f31310d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f31310d = i10 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 >= 0) {
            if (charset.equals(c.f31313a)) {
                this.f31307a = inputStream;
                this.f31308b = charset;
                this.f31309c = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
