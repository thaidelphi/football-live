package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class J3 {
    public static byte[] A02;
    public final C0739Dy A00;
    public final C1042Pu A01 = new C1042Pu();

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public J3(C1900k1 c1900k1) {
        InterfaceC1480d6 trackSelectionFactory = new QX(this.A01);
        C05475u c05475u = new C05475u(trackSelectionFactory);
        PC loadControl = new C1276Zh();
        this.A00 = OZ.A00(new C1270Zb(c1900k1), c05475u, loadControl, this.A01);
    }

    public static String A01(Z1 z12) {
        boolean z10 = z12 instanceof EK;
        String A00 = A00(36, 2, 118);
        String A002 = A00(0, 14, 108);
        if (z10) {
            EK ek = (EK) z12;
            return A00(55, 11, 8) + ek.A03 + A00(14, 22, 98) + ek.A02 + A002 + ek.getCause() + A00;
        }
        return A00(41, 14, 99) + z12.getMessage() + A002 + z12.getCause() + A00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7U();
    }

    public final long A07() {
        return this.A00.A7i();
    }

    public final J1 A08() {
        ZM vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new J1(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f10) {
        this.A00.A0M(f10);
    }

    public final void A0D(long j10) {
        this.A00.A04(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1899k0 c1899k0, Uri uri) {
        if (C06419m.A2p(c1899k0, A03())) {
            J7 cacheManager = J7.A01(c1899k0);
            InterfaceC1509dZ cachedDataSourceFactory = cacheManager.A0H(c1899k0);
            this.A00.A0Q(new C7K(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC1352az mediaSource = new C7K(new C1041Pt(c1899k0, AbstractC1672gE.A0j(c1899k0, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(J0 j02) {
        this.A00.A0O(new C1342ap(this, j02));
    }

    public final void A0H(J2 j22) {
        this.A00.A0P(new C0826Hh(this, j22));
    }

    public final void A0I(boolean z10) {
        this.A00.A0S(z10);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
