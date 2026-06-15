package t9;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import t9.d;
import y9.s;
import y9.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Http2Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    static final Logger f31199e = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final y9.e f31200a;

    /* renamed from: b  reason: collision with root package name */
    private final a f31201b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f31202c;

    /* renamed from: d  reason: collision with root package name */
    final d.a f31203d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Reader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final y9.e f31204a;

        /* renamed from: b  reason: collision with root package name */
        int f31205b;

        /* renamed from: c  reason: collision with root package name */
        byte f31206c;

        /* renamed from: d  reason: collision with root package name */
        int f31207d;

        /* renamed from: e  reason: collision with root package name */
        int f31208e;

        /* renamed from: f  reason: collision with root package name */
        short f31209f;

        a(y9.e eVar) {
            this.f31204a = eVar;
        }

        private void a() throws IOException {
            int i10 = this.f31207d;
            int z10 = h.z(this.f31204a);
            this.f31208e = z10;
            this.f31205b = z10;
            byte readByte = (byte) (this.f31204a.readByte() & 255);
            this.f31206c = (byte) (this.f31204a.readByte() & 255);
            Logger logger = h.f31199e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f31207d, this.f31205b, readByte, this.f31206c));
            }
            int readInt = this.f31204a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f31207d = readInt;
            if (readByte != 9) {
                throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i10) {
                throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            while (true) {
                int i10 = this.f31208e;
                if (i10 == 0) {
                    this.f31204a.c(this.f31209f);
                    this.f31209f = (short) 0;
                    if ((this.f31206c & 4) != 0) {
                        return -1L;
                    }
                    a();
                } else {
                    long H = this.f31204a.H(cVar, Math.min(j10, i10));
                    if (H == -1) {
                        return -1L;
                    }
                    this.f31208e = (int) (this.f31208e - H);
                    return H;
                }
            }
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // y9.s
        public t e() {
            return this.f31204a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Reader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public interface b {
        void a(boolean z10, int i10, int i11, List<c> list);

        void b(int i10, long j10);

        void c(boolean z10, m mVar);

        void d(int i10, t9.b bVar, y9.f fVar);

        void e(boolean z10, int i10, y9.e eVar, int i11) throws IOException;

        void f(int i10, t9.b bVar);

        void g(int i10, int i11, List<c> list) throws IOException;

        void h();

        void i(boolean z10, int i10, int i11);

        void j(int i10, int i11, int i12, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(y9.e eVar, boolean z10) {
        this.f31200a = eVar;
        this.f31202c = z10;
        a aVar = new a(eVar);
        this.f31201b = aVar;
        this.f31203d = new d.a(CodedOutputStream.DEFAULT_BUFFER_SIZE, aVar);
    }

    private void E(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 8) {
            throw e.d("TYPE_PING length != 8: %s", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            bVar.i((b10 & 1) != 0, this.f31200a.readInt(), this.f31200a.readInt());
            return;
        }
        throw e.d("TYPE_PING streamId != 0", new Object[0]);
    }

    private void F(b bVar, int i10) throws IOException {
        int readInt = this.f31200a.readInt();
        bVar.j(i10, readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER, (this.f31200a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void G(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 5) {
            throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            F(bVar, i11);
            return;
        }
        throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    private void J(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            short readByte = (b10 & 8) != 0 ? (short) (this.f31200a.readByte() & 255) : (short) 0;
            bVar.g(i11, this.f31200a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, t(a(i10 - 4, b10, readByte), readByte, b10, i11));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void K(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            int readInt = this.f31200a.readInt();
            t9.b a10 = t9.b.a(readInt);
            if (a10 == null) {
                throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            bVar.f(i11, a10);
            return;
        }
        throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
    }

    private void L(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b10 & 1) != 0) {
            if (i10 == 0) {
                bVar.h();
                return;
            }
            throw e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i10 % 6 != 0) {
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        } else {
            m mVar = new m();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                int readShort = this.f31200a.readShort() & 65535;
                int readInt = this.f31200a.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                mVar.i(readShort, readInt);
            }
            bVar.c(false, mVar);
        }
    }

    private void P(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        }
        long readInt = this.f31200a.readInt() & 2147483647L;
        if (readInt == 0) {
            throw e.d("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        bVar.b(i11, readInt);
    }

    static int a(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    private void j(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z10 = (b10 & 1) != 0;
        if (!((b10 & 32) != 0)) {
            short readByte = (b10 & 8) != 0 ? (short) (this.f31200a.readByte() & 255) : (short) 0;
            bVar.e(z10, i11, this.f31200a, a(i10, b10, readByte));
            this.f31200a.c(readByte);
            return;
        }
        throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
    }

    private void k(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 < 8) {
            throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            int readInt = this.f31200a.readInt();
            int readInt2 = this.f31200a.readInt();
            int i12 = i10 - 8;
            t9.b a10 = t9.b.a(readInt2);
            if (a10 == null) {
                throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            y9.f fVar = y9.f.f33357e;
            if (i12 > 0) {
                fVar = this.f31200a.c0(i12);
            }
            bVar.d(readInt, a10, fVar);
            return;
        }
        throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
    }

    private List<c> t(int i10, short s10, byte b10, int i11) throws IOException {
        a aVar = this.f31201b;
        aVar.f31208e = i10;
        aVar.f31205b = i10;
        aVar.f31209f = s10;
        aVar.f31206c = b10;
        aVar.f31207d = i11;
        this.f31203d.k();
        return this.f31203d.e();
    }

    private void w(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            boolean z10 = (b10 & 1) != 0;
            short readByte = (b10 & 8) != 0 ? (short) (this.f31200a.readByte() & 255) : (short) 0;
            if ((b10 & 32) != 0) {
                F(bVar, i11);
                i10 -= 5;
            }
            bVar.a(z10, i11, -1, t(a(i10, b10, readByte), readByte, b10, i11));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    static int z(y9.e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    public boolean b(boolean z10, b bVar) throws IOException {
        try {
            this.f31200a.Y(9L);
            int z11 = z(this.f31200a);
            if (z11 < 0 || z11 > 16384) {
                throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(z11));
            }
            byte readByte = (byte) (this.f31200a.readByte() & 255);
            if (!z10 || readByte == 4) {
                byte readByte2 = (byte) (this.f31200a.readByte() & 255);
                int readInt = this.f31200a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                Logger logger = f31199e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.b(true, readInt, z11, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        j(bVar, z11, readByte2, readInt);
                        break;
                    case 1:
                        w(bVar, z11, readByte2, readInt);
                        break;
                    case 2:
                        G(bVar, z11, readByte2, readInt);
                        break;
                    case 3:
                        K(bVar, z11, readByte2, readInt);
                        break;
                    case 4:
                        L(bVar, z11, readByte2, readInt);
                        break;
                    case 5:
                        J(bVar, z11, readByte2, readInt);
                        break;
                    case 6:
                        E(bVar, z11, readByte2, readInt);
                        break;
                    case 7:
                        k(bVar, z11, readByte2, readInt);
                        break;
                    case 8:
                        P(bVar, z11, readByte2, readInt);
                        break;
                    default:
                        this.f31200a.c(z11);
                        break;
                }
                return true;
            }
            throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31200a.close();
    }

    public void f(b bVar) throws IOException {
        if (this.f31202c) {
            if (!b(true, bVar)) {
                throw e.d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        y9.e eVar = this.f31200a;
        y9.f fVar = e.f31115a;
        y9.f c02 = eVar.c0(fVar.r());
        Logger logger = f31199e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(o9.c.r("<< CONNECTION %s", c02.k()));
        }
        if (!fVar.equals(c02)) {
            throw e.d("Expected a connection header but was %s", c02.w());
        }
    }
}
