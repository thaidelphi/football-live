package s2;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f30654a;

    public h(InputStream inputStream) {
        super(inputStream);
        this.f30654a = RecyclerView.UNDEFINED_DURATION;
    }

    private long a(long j10) {
        int i10 = this.f30654a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    private void b(long j10) {
        int i10 = this.f30654a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f30654a = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i10 = this.f30654a;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f30654a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f30654a = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0L;
        }
        long skip = super.skip(a10);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int a10 = (int) a(i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        b(read);
        return read;
    }
}
