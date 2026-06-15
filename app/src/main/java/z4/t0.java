package z4;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* compiled from: UdpDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final int f33656e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f33657f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f33658g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f33659h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f33660i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f33661j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f33662k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f33663l;

    /* renamed from: m  reason: collision with root package name */
    private int f33664m;

    /* compiled from: UdpDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public t0() {
        this(2000);
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f33664m == 0) {
            try {
                ((DatagramSocket) a5.a.e(this.f33660i)).receive(this.f33658g);
                int length = this.f33658g.getLength();
                this.f33664m = length;
                o(length);
            } catch (SocketTimeoutException e8) {
                throw new a(e8, 2002);
            } catch (IOException e10) {
                throw new a(e10, 2001);
            }
        }
        int length2 = this.f33658g.getLength();
        int i12 = this.f33664m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f33657f, length2 - i12, bArr, i10, min);
        this.f33664m -= min;
        return min;
    }

    @Override // z4.l
    public void close() {
        this.f33659h = null;
        MulticastSocket multicastSocket = this.f33661j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) a5.a.e(this.f33662k));
            } catch (IOException unused) {
            }
            this.f33661j = null;
        }
        DatagramSocket datagramSocket = this.f33660i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f33660i = null;
        }
        this.f33662k = null;
        this.f33664m = 0;
        if (this.f33663l) {
            this.f33663l = false;
            p();
        }
    }

    @Override // z4.l
    public long l(p pVar) throws a {
        Uri uri = pVar.f33569a;
        this.f33659h = uri;
        String str = (String) a5.a.e(uri.getHost());
        int port = this.f33659h.getPort();
        q(pVar);
        try {
            this.f33662k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f33662k, port);
            if (this.f33662k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f33661j = multicastSocket;
                multicastSocket.joinGroup(this.f33662k);
                this.f33660i = this.f33661j;
            } else {
                this.f33660i = new DatagramSocket(inetSocketAddress);
            }
            this.f33660i.setSoTimeout(this.f33656e);
            this.f33663l = true;
            r(pVar);
            return -1L;
        } catch (IOException e8) {
            throw new a(e8, 2001);
        } catch (SecurityException e10) {
            throw new a(e10, 2006);
        }
    }

    @Override // z4.l
    public Uri m() {
        return this.f33659h;
    }

    public t0(int i10) {
        this(i10, 8000);
    }

    public t0(int i10, int i11) {
        super(true);
        this.f33656e = i11;
        byte[] bArr = new byte[i10];
        this.f33657f = bArr;
        this.f33658g = new DatagramPacket(bArr, 0, i10);
    }
}
