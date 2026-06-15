package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class IT extends InputStream {
    public int A00;
    public long A01;
    public Q7 A02;
    public final Uri A03;
    public final C1899k0 A04;
    public final InterfaceC1509dZ A05;
    public final String A06;

    public IT(C1899k0 c1899k0, Uri uri, InterfaceC1509dZ interfaceC1509dZ) throws IOException {
        this.A04 = c1899k0;
        this.A05 = interfaceC1509dZ;
        this.A03 = uri;
        this.A06 = J7.A09(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A05.A58();
        this.A01 = (int) this.A02.AFq(new C1519dj(this.A03, i10, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A02.read(bArr, i10, i11);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.A01 - this.A00;
        if (j11 <= 0) {
            return 0L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        this.A00 = (int) (this.A00 + j10);
        A00(this.A00);
        return j10;
    }
}
