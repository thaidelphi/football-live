package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.mx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2078mx implements InterfaceC05907l {
    public static byte[] A04;
    public final /* synthetic */ C2B A00;
    public final /* synthetic */ N4 A01;
    public final /* synthetic */ M5 A02;
    public final /* synthetic */ C0728Dn A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C2078mx(N4 n42, C0728Dn c0728Dn, C2B c2b, M5 m52) {
        this.A01 = n42;
        this.A03 = c0728Dn;
        this.A00 = c2b;
        this.A02 = m52;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACa() {
        long j10;
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 69);
        InterfaceC2108nR A0F = this.A02.A0F();
        j10 = this.A01.A00;
        A0F.A3D(C0709Cu.A01(j10), adErrorType.getErrorCode(), A00);
        this.A00.ADc(this.A01, C0660Ag.A01(adErrorType, A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACj() {
        C2B c2b;
        this.A03.A0J();
        this.A00.ACV(this.A01, this.A03);
        InterfaceC2108nR A0F = this.A02.A0F();
        c2b = this.A01.A01;
        A0F.A4E(c2b != null);
    }
}
