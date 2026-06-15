package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Ww  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1214Ww extends AbstractC1102Sf {
    public static byte[] A08;
    public static String[] A09 = {"1PL2Y4Pi", "rHhy", "VqIrJ5UEaEPRrUaVlihlnOj4AVZsYSrB", "EcVmkXNkGi2G1Rc27fjMehVbck5hCefs", "uAN33ASfmS0JMPy7yuPCyjdqXVu1J4SV", "ry5pyEhAEtXMXTcUkJuFrKVwBMoqj9HE", "N5j4BZMkzk92Ajy5OzTXdEIVQTNDaWom", "5ShEbue2K"};
    @MetaExoPlayerCustomization("Keep track of the non-adjusted timestamp")
    public long A00;
    public long A01;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public final C1107Sk A05;
    public final int A06;
    public final int A07;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A08 = new byte[]{-19, -11, -11, -19, -76, -21, -2, -11, -76, -22, -21, -23, -11, -22, -21, -8};
    }

    static {
        A05();
        PS.A03(A03(0, 16, 16));
    }

    public C1214Ww(int i10) {
        this(i10, 0);
    }

    public C1214Ww(int i10, int i11) {
        this.A05 = new C1107Sk();
        this.A06 = i10;
        this.A07 = i11;
    }

    public static C1214Ww A02() {
        return new C1214Ww(0);
    }

    private ByteBuffer A04(int i10) {
        if (this.A06 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (this.A06 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.A02;
        String[] strArr = A09;
        if (strArr[0].length() != strArr[7].length()) {
            String[] strArr2 = A09;
            strArr2[2] = "zkaJ8ixLuilEK0maQq8JVH1jkM9A5ZSA";
            strArr2[4] = "GjTkljrbUrNZqXRPfdy2leVkPGLhHC7g";
            throw new C1111So(byteBuffer == null ? 0 : this.A02.capacity(), i10);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1102Sf
    public void A0A() {
        super.A0A();
        if (this.A02 != null) {
            this.A02.clear();
        }
        if (this.A03 != null) {
            this.A03.clear();
        }
        this.A04 = false;
    }

    public final void A0B() {
        if (this.A02 != null) {
            this.A02.flip();
        }
        if (this.A03 != null) {
            this.A03.flip();
        }
    }

    @EnsuresNonNull({"data"})
    public final void A0C(int i10) {
        int i11 = i10 + this.A07;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer == null) {
            ByteBuffer currentData = A04(i11);
            this.A02 = currentData;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = position + i11;
        if (capacity >= i12) {
            this.A02 = byteBuffer;
            return;
        }
        ByteBuffer A04 = A04(i12);
        A04.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            A04.put(byteBuffer);
        }
        this.A02 = A04;
    }

    @EnsuresNonNull({"supplementalData"})
    public final void A0D(int i10) {
        if (this.A03 == null || this.A03.capacity() < i10) {
            this.A03 = ByteBuffer.allocate(i10);
        } else {
            this.A03.clear();
        }
    }

    public final boolean A0E() {
        return A09(1073741824);
    }
}
