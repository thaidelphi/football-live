package t9;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import t9.d;
/* compiled from: Http2Writer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class j implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f31233g = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final y9.d f31234a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31235b;

    /* renamed from: c  reason: collision with root package name */
    private final y9.c f31236c;

    /* renamed from: d  reason: collision with root package name */
    private int f31237d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31238e;

    /* renamed from: f  reason: collision with root package name */
    final d.b f31239f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(y9.d dVar, boolean z10) {
        this.f31234a = dVar;
        this.f31235b = z10;
        y9.c cVar = new y9.c();
        this.f31236c = cVar;
        this.f31239f = new d.b(cVar);
        this.f31237d = 16384;
    }

    private void P(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int min = (int) Math.min(this.f31237d, j10);
            long j11 = min;
            j10 -= j11;
            k(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f31234a.A(this.f31236c, j11);
        }
    }

    private static void R(y9.d dVar, int i10) throws IOException {
        dVar.j0((i10 >>> 16) & 255);
        dVar.j0((i10 >>> 8) & 255);
        dVar.j0(i10 & 255);
    }

    public synchronized void E(boolean z10, int i10, int i11) throws IOException {
        if (!this.f31238e) {
            k(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f31234a.o(i10);
            this.f31234a.o(i11);
            this.f31234a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void F(int i10, int i11, List<c> list) throws IOException {
        if (!this.f31238e) {
            this.f31239f.g(list);
            long S = this.f31236c.S();
            int min = (int) Math.min(this.f31237d - 4, S);
            long j10 = min;
            int i12 = (S > j10 ? 1 : (S == j10 ? 0 : -1));
            k(i10, min + 4, (byte) 5, i12 == 0 ? (byte) 4 : (byte) 0);
            this.f31234a.o(i11 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f31234a.A(this.f31236c, j10);
            if (i12 > 0) {
                P(i10, S - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void G(int i10, b bVar) throws IOException {
        if (!this.f31238e) {
            if (bVar.f31085a != -1) {
                k(i10, 4, (byte) 3, (byte) 0);
                this.f31234a.o(bVar.f31085a);
                this.f31234a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void J(m mVar) throws IOException {
        if (!this.f31238e) {
            int i10 = 0;
            k(0, mVar.j() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (mVar.g(i10)) {
                    this.f31234a.e0(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f31234a.o(mVar.b(i10));
                }
                i10++;
            }
            this.f31234a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void K(boolean z10, int i10, int i11, List<c> list) throws IOException {
        if (!this.f31238e) {
            w(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void L(int i10, long j10) throws IOException {
        if (this.f31238e) {
            throw new IOException("closed");
        }
        if (j10 != 0 && j10 <= 2147483647L) {
            k(i10, 4, (byte) 8, (byte) 0);
            this.f31234a.o((int) j10);
            this.f31234a.flush();
        } else {
            throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
    }

    public synchronized void a(m mVar) throws IOException {
        if (!this.f31238e) {
            this.f31237d = mVar.f(this.f31237d);
            if (mVar.c() != -1) {
                this.f31239f.e(mVar.c());
            }
            k(0, 0, (byte) 4, (byte) 1);
            this.f31234a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void b() throws IOException {
        if (!this.f31238e) {
            if (this.f31235b) {
                Logger logger = f31233g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o9.c.r(">> CONNECTION %s", e.f31115a.k()));
                }
                this.f31234a.O(e.f31115a.v());
                this.f31234a.flush();
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f31238e = true;
        this.f31234a.close();
    }

    public synchronized void f(boolean z10, int i10, y9.c cVar, int i11) throws IOException {
        if (!this.f31238e) {
            j(i10, z10 ? (byte) 1 : (byte) 0, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.f31238e) {
            this.f31234a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    void j(int i10, byte b10, y9.c cVar, int i11) throws IOException {
        k(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f31234a.A(cVar, i11);
        }
    }

    public void k(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f31233g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i10, i11, b10, b11));
        }
        int i12 = this.f31237d;
        if (i11 > i12) {
            throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw e.c("reserved bit set: %s", Integer.valueOf(i10));
        }
        R(this.f31234a, i11);
        this.f31234a.j0(b10 & 255);
        this.f31234a.j0(b11 & 255);
        this.f31234a.o(i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public synchronized void t(int i10, b bVar, byte[] bArr) throws IOException {
        if (!this.f31238e) {
            if (bVar.f31085a != -1) {
                k(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f31234a.o(i10);
                this.f31234a.o(bVar.f31085a);
                if (bArr.length > 0) {
                    this.f31234a.O(bArr);
                }
                this.f31234a.flush();
            } else {
                throw e.c("errorCode.httpCode == -1", new Object[0]);
            }
        } else {
            throw new IOException("closed");
        }
    }

    void w(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.f31238e) {
            this.f31239f.g(list);
            long S = this.f31236c.S();
            int min = (int) Math.min(this.f31237d, S);
            long j10 = min;
            int i11 = (S > j10 ? 1 : (S == j10 ? 0 : -1));
            byte b10 = i11 == 0 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            k(i10, min, (byte) 1, b10);
            this.f31234a.A(this.f31236c, j10);
            if (i11 > 0) {
                P(i10, S - j10);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int z() {
        return this.f31237d;
    }
}
