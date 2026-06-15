package com.adcolony.sdk;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class w0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    InputStream f6366a;

    /* renamed from: b  reason: collision with root package name */
    int f6367b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(InputStream inputStream, int i10, int i11) throws IOException {
        this.f6366a = inputStream;
        while (i10 > 0) {
            i10 -= (int) inputStream.skip(i10);
        }
        this.f6367b = i11;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int available = this.f6366a.available();
        int i10 = this.f6367b;
        return available <= i10 ? available : i10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6366a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f6367b;
        if (i10 == 0) {
            return -1;
        }
        this.f6367b = i10 - 1;
        return this.f6366a.read();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        int i10 = (int) j10;
        if (i10 <= 0) {
            return 0L;
        }
        int i11 = this.f6367b;
        if (i10 > i11) {
            i10 = i11;
        }
        this.f6367b = i11 - i10;
        while (i10 > 0) {
            i10 -= (int) this.f6366a.skip(j10);
        }
        return j10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f6367b;
        if (i12 == 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int read = this.f6366a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f6367b -= read;
        return read;
    }
}
