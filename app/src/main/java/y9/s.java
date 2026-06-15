package y9;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: Source.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface s extends Closeable {
    long H(c cVar, long j10) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    t e();
}
