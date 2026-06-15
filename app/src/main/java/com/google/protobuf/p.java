package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IterableByteBufferInputStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class p extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<ByteBuffer> f15473a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f15474b;

    /* renamed from: c  reason: collision with root package name */
    private int f15475c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f15476d;

    /* renamed from: e  reason: collision with root package name */
    private int f15477e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15478f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f15479g;

    /* renamed from: h  reason: collision with root package name */
    private int f15480h;

    /* renamed from: i  reason: collision with root package name */
    private long f15481i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Iterable<ByteBuffer> iterable) {
        this.f15473a = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f15475c++;
        }
        this.f15476d = -1;
        if (a()) {
            return;
        }
        this.f15474b = Internal.EMPTY_BYTE_BUFFER;
        this.f15476d = 0;
        this.f15477e = 0;
        this.f15481i = 0L;
    }

    private boolean a() {
        this.f15476d++;
        if (this.f15473a.hasNext()) {
            ByteBuffer next = this.f15473a.next();
            this.f15474b = next;
            this.f15477e = next.position();
            if (this.f15474b.hasArray()) {
                this.f15478f = true;
                this.f15479g = this.f15474b.array();
                this.f15480h = this.f15474b.arrayOffset();
            } else {
                this.f15478f = false;
                this.f15481i = t0.k(this.f15474b);
                this.f15479g = null;
            }
            return true;
        }
        return false;
    }

    private void b(int i10) {
        int i11 = this.f15477e + i10;
        this.f15477e = i11;
        if (i11 == this.f15474b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f15476d == this.f15475c) {
            return -1;
        }
        if (this.f15478f) {
            int i10 = this.f15479g[this.f15477e + this.f15480h] & 255;
            b(1);
            return i10;
        }
        int x10 = t0.x(this.f15477e + this.f15481i) & 255;
        b(1);
        return x10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f15476d == this.f15475c) {
            return -1;
        }
        int limit = this.f15474b.limit();
        int i12 = this.f15477e;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f15478f) {
            System.arraycopy(this.f15479g, i12 + this.f15480h, bArr, i10, i11);
            b(i11);
        } else {
            int position = this.f15474b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f15474b.position(this.f15477e);
            this.f15474b.get(bArr, i10, i11);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f15474b.position(position);
            b(i11);
        }
        return i11;
    }
}
