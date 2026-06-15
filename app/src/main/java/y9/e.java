package y9;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: BufferedSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface e extends s, ReadableByteChannel {
    boolean B0(long j10, f fVar) throws IOException;

    long E0() throws IOException;

    InputStream F0();

    String I() throws IOException;

    byte[] N(long j10) throws IOException;

    short T() throws IOException;

    void Y(long j10) throws IOException;

    long b0(byte b10) throws IOException;

    void c(long j10) throws IOException;

    f c0(long j10) throws IOException;

    c d();

    byte[] h0() throws IOException;

    boolean i0() throws IOException;

    long l0() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    String s0(Charset charset) throws IOException;

    String u(long j10) throws IOException;

    int w0() throws IOException;
}
