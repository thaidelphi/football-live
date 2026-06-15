package y9;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
/* compiled from: BufferedSink.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface d extends r, WritableByteChannel {
    d B(String str) throws IOException;

    d O(byte[] bArr) throws IOException;

    d Z(long j10) throws IOException;

    c d();

    d e0(int i10) throws IOException;

    @Override // y9.r, java.io.Flushable
    void flush() throws IOException;

    d j0(int i10) throws IOException;

    d o(int i10) throws IOException;

    d s() throws IOException;

    d t0(byte[] bArr, int i10, int i11) throws IOException;

    d u0(long j10) throws IOException;
}
