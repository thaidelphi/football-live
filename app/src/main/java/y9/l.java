package y9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: Okio.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f33373a = Logger.getLogger(l.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f33374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OutputStream f33375b;

        a(t tVar, OutputStream outputStream) {
            this.f33374a = tVar;
            this.f33375b = outputStream;
        }

        @Override // y9.r
        public void A(y9.c cVar, long j10) throws IOException {
            u.b(cVar.f33354b, 0L, j10);
            while (j10 > 0) {
                this.f33374a.f();
                o oVar = cVar.f33353a;
                int min = (int) Math.min(j10, oVar.f33388c - oVar.f33387b);
                this.f33375b.write(oVar.f33386a, oVar.f33387b, min);
                int i10 = oVar.f33387b + min;
                oVar.f33387b = i10;
                long j11 = min;
                j10 -= j11;
                cVar.f33354b -= j11;
                if (i10 == oVar.f33388c) {
                    cVar.f33353a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f33375b.close();
        }

        @Override // y9.r
        public t e() {
            return this.f33374a;
        }

        @Override // y9.r, java.io.Flushable
        public void flush() throws IOException {
            this.f33375b.flush();
        }

        public String toString() {
            return "sink(" + this.f33375b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f33376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f33377b;

        b(t tVar, InputStream inputStream) {
            this.f33376a = tVar;
            this.f33377b = inputStream;
        }

        @Override // y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (i10 == 0) {
                return 0L;
            } else {
                try {
                    this.f33376a.f();
                    o o02 = cVar.o0(1);
                    int read = this.f33377b.read(o02.f33386a, o02.f33388c, (int) Math.min(j10, 8192 - o02.f33388c));
                    if (read == -1) {
                        return -1L;
                    }
                    o02.f33388c += read;
                    long j11 = read;
                    cVar.f33354b += j11;
                    return j11;
                } catch (AssertionError e8) {
                    if (l.e(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
            }
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f33377b.close();
        }

        @Override // y9.s
        public t e() {
            return this.f33376a;
        }

        public String toString() {
            return "source(" + this.f33377b + ")";
        }
    }

    /* compiled from: Okio.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    final class c implements r {
        c() {
        }

        @Override // y9.r
        public void A(y9.c cVar, long j10) throws IOException {
            cVar.c(j10);
        }

        @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // y9.r
        public t e() {
            return t.f33397d;
        }

        @Override // y9.r, java.io.Flushable
        public void flush() throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Okio.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class d extends y9.a {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Socket f33378k;

        d(Socket socket) {
            this.f33378k = socket;
        }

        @Override // y9.a
        protected IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // y9.a
        protected void t() {
            try {
                this.f33378k.close();
            } catch (AssertionError e8) {
                if (l.e(e8)) {
                    Logger logger = l.f33373a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + this.f33378k, (Throwable) e8);
                    return;
                }
                throw e8;
            } catch (Exception e10) {
                Logger logger2 = l.f33373a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + this.f33378k, (Throwable) e10);
            }
        }
    }

    private l() {
    }

    public static r a(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static r b() {
        return new c();
    }

    public static y9.d c(r rVar) {
        return new m(rVar);
    }

    public static e d(s sVar) {
        return new n(sVar);
    }

    static boolean e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static r f(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static r g(OutputStream outputStream) {
        return h(outputStream, new t());
    }

    private static r h(OutputStream outputStream, t tVar) {
        if (outputStream != null) {
            if (tVar != null) {
                return new a(tVar, outputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    public static r i(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                y9.a n10 = n(socket);
                return n10.r(h(socket.getOutputStream(), n10));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static s j(File file) throws FileNotFoundException {
        if (file != null) {
            return k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static s k(InputStream inputStream) {
        return l(inputStream, new t());
    }

    private static s l(InputStream inputStream, t tVar) {
        if (inputStream != null) {
            if (tVar != null) {
                return new b(tVar, inputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    public static s m(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                y9.a n10 = n(socket);
                return n10.s(l(socket.getInputStream(), n10));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static y9.a n(Socket socket) {
        return new d(socket);
    }
}
