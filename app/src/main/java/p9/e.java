package p9;

import java.io.IOException;
import y9.g;
import y9.r;
/* compiled from: FaultHidingSink.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
class e extends g {

    /* renamed from: b  reason: collision with root package name */
    private boolean f29967b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(r rVar) {
        super(rVar);
    }

    @Override // y9.g, y9.r
    public void A(y9.c cVar, long j10) throws IOException {
        if (this.f29967b) {
            cVar.c(j10);
            return;
        }
        try {
            super.A(cVar, j10);
        } catch (IOException e8) {
            this.f29967b = true;
            a(e8);
        }
    }

    protected void a(IOException iOException) {
        throw null;
    }

    @Override // y9.g, y9.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f29967b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.f29967b = true;
            a(e8);
        }
    }

    @Override // y9.g, y9.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f29967b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.f29967b = true;
            a(e8);
        }
    }
}
