package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* renamed from: com.facebook.ads.redexgen.X.0m  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04130m extends AbstractC05325e {
    public static String[] A09 = {"TiKmNXGq4mm76WwZQi3ClV2h4", "s68oU2JEG", "4aO7muxXWLG8zzn4ZM21y1fEe", "Mue70Jc9P0wUKVkiYTxg1ZpbDiWqvdHr", "iJuKOgTSjjSd81FP1Jjt3eHga4D1eN0v", "wzZDHg4G3hm7ebuJ04sb2ec3MTY1", "fAtI9NMDc2xXqYF4tJGHZcWOIeFlKrX4", "OrUrdRgBJkt5osuWzziVVcnlNJqL8QOB"};
    public int A00;
    public Uri A01;
    public DatagramSocket A02;
    public InetAddress A03;
    public MulticastSocket A04;
    public boolean A05;
    public final int A06;
    public final DatagramPacket A07;
    public final byte[] A08;

    public C04130m() {
        this(2000);
    }

    public C04130m(int i10) {
        this(i10, 8000);
    }

    public C04130m(int i10, int i11) {
        super(true);
        this.A06 = i11;
        this.A08 = new byte[i10];
        this.A07 = new DatagramPacket(this.A08, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final Uri A9F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final long AFq(C1519dj c1519dj) throws C1028Pg {
        this.A01 = c1519dj.A06;
        String str = (String) AbstractC1589es.A01(this.A01.getHost());
        int port = this.A01.getPort();
        A0G(c1519dj);
        try {
            this.A03 = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.A03, port);
            if (this.A03.isMulticastAddress()) {
                this.A04 = new MulticastSocket(inetSocketAddress);
                this.A04.joinGroup(this.A03);
                this.A02 = this.A04;
            } else {
                this.A02 = new DatagramSocket(inetSocketAddress);
            }
            this.A02.setSoTimeout(this.A06);
            this.A05 = true;
            A0H(c1519dj);
            return -1L;
        } catch (IOException e8) {
            throw new C1028Pg(e8, 2001);
        } catch (SecurityException e10) {
            throw new C1028Pg(e10, 2006);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void close() {
        this.A01 = null;
        if (this.A04 != null) {
            try {
                this.A04.leaveGroup((InetAddress) AbstractC1589es.A01(this.A03));
            } catch (IOException unused) {
            }
            this.A04 = null;
        }
        if (this.A02 != null) {
            this.A02.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A00 = 0;
        if (this.A05) {
            this.A05 = false;
            A0E();
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final int read(byte[] bArr, int i10, int i11) throws C1028Pg {
        if (i11 == 0) {
            if (A09[3].charAt(1) != 'O') {
                String[] strArr = A09;
                strArr[5] = "Agx8o8vBhNBY4IL348uHObFxmf8N";
                strArr[1] = "sHx2t19hy";
                return 0;
            }
            throw new RuntimeException();
        }
        if (this.A00 == 0) {
            try {
                ((DatagramSocket) AbstractC1589es.A01(this.A02)).receive(this.A07);
                this.A00 = this.A07.getLength();
                A0F(this.A00);
            } catch (SocketTimeoutException e8) {
                throw new C1028Pg(e8, 2002);
            } catch (IOException e10) {
                throw new C1028Pg(e10, 2001);
            }
        }
        DatagramPacket datagramPacket = this.A07;
        if (A09[3].charAt(1) != 'O') {
            A09[6] = "S5EztQ32dFJzQPej8x2JBGWQKBKNXTmE";
            int length = datagramPacket.getLength() - this.A00;
            int packetOffset = this.A00;
            int bytesToRead = Math.min(packetOffset, i11);
            System.arraycopy(this.A08, length, bArr, i10, bytesToRead);
            int packetOffset2 = this.A00;
            this.A00 = packetOffset2 - bytesToRead;
            return bytesToRead;
        }
        String[] strArr2 = A09;
        strArr2[0] = "uCXqYBz7vSyOprduezB8TynoM";
        strArr2[2] = "z5EjsLYedCyPsx80SnME4sO8r";
        int length2 = datagramPacket.getLength();
        int packetOffset3 = this.A00;
        int i12 = length2 - packetOffset3;
        int packetOffset4 = this.A00;
        int bytesToRead2 = Math.min(packetOffset4, i11);
        System.arraycopy(this.A08, i12, bArr, i10, bytesToRead2);
        int packetOffset5 = this.A00;
        this.A00 = packetOffset5 - bytesToRead2;
        return bytesToRead2;
    }
}
