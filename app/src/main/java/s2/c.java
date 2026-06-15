package s2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ContentLengthInputStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f30640a;

    /* renamed from: b  reason: collision with root package name */
    private int f30641b;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f30640a = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f30641b += i10;
        } else if (this.f30640a - this.f30641b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f30640a + ", but read: " + this.f30641b);
        }
        return i10;
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f30640a - this.f30641b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        return a(super.read(bArr, i10, i11));
    }
}
