package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
/* compiled from: BufferedOutputStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f10344a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f10345b;

    /* renamed from: c  reason: collision with root package name */
    private z1.b f10346c;

    /* renamed from: d  reason: collision with root package name */
    private int f10347d;

    public c(OutputStream outputStream, z1.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i10 = this.f10347d;
        if (i10 > 0) {
            this.f10344a.write(this.f10345b, 0, i10);
            this.f10347d = 0;
        }
    }

    private void b() throws IOException {
        if (this.f10347d == this.f10345b.length) {
            a();
        }
    }

    private void f() {
        byte[] bArr = this.f10345b;
        if (bArr != null) {
            this.f10346c.put(bArr);
            this.f10345b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f10344a.close();
            f();
        } catch (Throwable th) {
            this.f10344a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f10344a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f10345b;
        int i11 = this.f10347d;
        this.f10347d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    c(OutputStream outputStream, z1.b bVar, int i10) {
        this.f10344a = outputStream;
        this.f10346c = bVar;
        this.f10345b = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f10347d;
            if (i15 == 0 && i13 >= this.f10345b.length) {
                this.f10344a.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f10345b.length - i15);
            System.arraycopy(bArr, i14, this.f10345b, this.f10347d, min);
            this.f10347d += min;
            i12 += min;
            b();
        } while (i12 < i11);
    }
}
