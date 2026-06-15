package s2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    private static final Queue<d> f30642c = k.e(0);

    /* renamed from: a  reason: collision with root package name */
    private InputStream f30643a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f30644b;

    d() {
    }

    public static d b(InputStream inputStream) {
        d poll;
        Queue<d> queue = f30642c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.j(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f30644b;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f30643a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30643a.close();
    }

    public void f() {
        this.f30644b = null;
        this.f30643a = null;
        Queue<d> queue = f30642c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void j(InputStream inputStream) {
        this.f30643a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f30643a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f30643a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f30643a.read();
        } catch (IOException e8) {
            this.f30644b = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f30643a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f30643a.skip(j10);
        } catch (IOException e8) {
            this.f30644b = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f30643a.read(bArr);
        } catch (IOException e8) {
            this.f30644b = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f30643a.read(bArr, i10, i11);
        } catch (IOException e8) {
            this.f30644b = e8;
            throw e8;
        }
    }
}
