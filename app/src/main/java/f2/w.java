package f2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private volatile byte[] f25374a;

    /* renamed from: b  reason: collision with root package name */
    private int f25375b;

    /* renamed from: c  reason: collision with root package name */
    private int f25376c;

    /* renamed from: d  reason: collision with root package name */
    private int f25377d;

    /* renamed from: e  reason: collision with root package name */
    private int f25378e;

    /* renamed from: f  reason: collision with root package name */
    private final z1.b f25379f;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, z1.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f25377d;
        if (i10 != -1) {
            int i11 = this.f25378e - i10;
            int i12 = this.f25376c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f25375b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f25379f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f25374a = bArr2;
                    this.f25379f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f25378e - this.f25377d;
                this.f25378e = i13;
                this.f25377d = 0;
                this.f25375b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f25378e;
                if (read > 0) {
                    i14 += read;
                }
                this.f25375b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f25377d = -1;
            this.f25378e = 0;
            this.f25375b = read2;
        }
        return read2;
    }

    private static IOException j() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f25374a != null && inputStream != null) {
        } else {
            throw j();
        }
        return (this.f25375b - this.f25378e) + inputStream.available();
    }

    public synchronized void b() {
        this.f25376c = this.f25374a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25374a != null) {
            this.f25379f.put(this.f25374a);
            this.f25374a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void f() {
        if (this.f25374a != null) {
            this.f25379f.put(this.f25374a);
            this.f25374a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f25376c = Math.max(this.f25376c, i10);
        this.f25377d = this.f25378e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f25374a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f25378e < this.f25375b || a(inputStream, bArr) != -1) {
                if (bArr != this.f25374a && (bArr = this.f25374a) == null) {
                    throw j();
                }
                int i10 = this.f25375b;
                int i11 = this.f25378e;
                if (i10 - i11 > 0) {
                    this.f25378e = i11 + 1;
                    return bArr[i11] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw j();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f25374a != null) {
            int i10 = this.f25377d;
            if (-1 != i10) {
                this.f25378e = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f25378e + " markLimit: " + this.f25376c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f25374a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f25375b;
                int i11 = this.f25378e;
                if (i10 - i11 >= j10) {
                    this.f25378e = (int) (i11 + j10);
                    return j10;
                }
                long j11 = i10 - i11;
                this.f25378e = i10;
                if (this.f25377d != -1 && j10 <= this.f25376c) {
                    if (a(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i12 = this.f25375b;
                    int i13 = this.f25378e;
                    if (i12 - i13 >= j10 - j11) {
                        this.f25378e = (int) ((i13 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i12) - i13;
                    this.f25378e = i12;
                    return j12;
                }
                long skip = inputStream.skip(j10 - j11);
                if (skip > 0) {
                    this.f25377d = -1;
                }
                return j11 + skip;
            }
            throw j();
        }
        throw j();
    }

    w(InputStream inputStream, z1.b bVar, int i10) {
        super(inputStream);
        this.f25377d = -1;
        this.f25379f = bVar;
        this.f25374a = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f25374a;
        if (bArr2 == null) {
            throw j();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f25378e;
            int i15 = this.f25375b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f25378e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f25377d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                } else {
                    if (bArr2 != this.f25374a && (bArr2 = this.f25374a) == null) {
                        throw j();
                    }
                    int i17 = this.f25375b;
                    int i18 = this.f25378e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f25378e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw j();
        }
    }
}
