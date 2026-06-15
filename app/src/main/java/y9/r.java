package y9;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
/* compiled from: Sink.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface r extends Closeable, Flushable {
    void A(c cVar, long j10) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    t e();

    void flush() throws IOException;
}
