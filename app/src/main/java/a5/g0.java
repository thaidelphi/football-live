package a5;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import z4.j0;
/* compiled from: SntpClient.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f428a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f429b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f430c = false;

    /* renamed from: d  reason: collision with root package name */
    private static long f431d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static String f432e = "time.android.com";

    /* compiled from: SntpClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(IOException iOException);

        void b();
    }

    /* compiled from: SntpClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class c implements j0.b<j0.e> {

        /* renamed from: a  reason: collision with root package name */
        private final b f433a;

        public c(b bVar) {
            this.f433a = bVar;
        }

        @Override // z4.j0.b
        public void i(j0.e eVar, long j10, long j11) {
            if (this.f433a != null) {
                if (!g0.k()) {
                    this.f433a.a(new IOException(new ConcurrentModificationException()));
                } else {
                    this.f433a.b();
                }
            }
        }

        @Override // z4.j0.b
        public void m(j0.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // z4.j0.b
        public j0.c s(j0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f433a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return z4.j0.f33523f;
        }
    }

    /* compiled from: SntpClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class d implements j0.e {
        private d() {
        }

        @Override // z4.j0.e
        public void a() throws IOException {
            synchronized (g0.f428a) {
                synchronized (g0.f429b) {
                    if (g0.f430c) {
                        return;
                    }
                    long e8 = g0.e();
                    synchronized (g0.f429b) {
                        long unused = g0.f431d = e8;
                        boolean unused2 = g0.f430c = true;
                    }
                }
            }
        }

        @Override // z4.j0.e
        public void b() {
        }
    }

    static /* synthetic */ long e() throws IOException {
        return l();
    }

    private static void g(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        } else if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long h() {
        long j10;
        synchronized (f429b) {
            j10 = f430c ? f431d : -9223372036854775807L;
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f429b) {
            str = f432e;
        }
        return str;
    }

    public static void j(z4.j0 j0Var, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        if (j0Var == null) {
            j0Var = new z4.j0("SntpClient");
        }
        j0Var.n(new d(), new c(bVar), 1);
    }

    public static boolean k() {
        boolean z10;
        synchronized (f429b) {
            z10 = f430c;
        }
        return z10;
    }

    private static long l() throws IOException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            long n10 = n(bArr, 24);
            long n11 = n(bArr, 32);
            long n12 = n(bArr, 40);
            g((byte) ((bArr[0] >> 6) & 3), (byte) (bArr[0] & 7), bArr[1] & 255, n12);
            long j11 = (j10 + (((n11 - n10) + (n12 - j10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    private static long n(byte[] bArr, int i10) {
        long m7 = m(bArr, i10);
        long m10 = m(bArr, i10 + 4);
        if (m7 == 0 && m10 == 0) {
            return 0L;
        }
        return ((m7 - 2208988800L) * 1000) + ((m10 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j12 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j12 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j12 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j12 >> 0);
        long j13 = ((j10 - (j11 * 1000)) * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j13 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j13 >> 16);
        bArr[i16] = (byte) (j13 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }
}
