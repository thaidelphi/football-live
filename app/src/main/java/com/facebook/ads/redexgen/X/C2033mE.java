package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.mE  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2033mE extends BY {
    public static byte[] A05;
    public static String[] A06 = {"oXE2C4io4CadFj", "SLi30xh9eEh4aNBWy87TaVqEnPCRDurp", "eis5RYtigxDn0kuTv6xEcFlmBnmepzOu", "7zfUioi34Z20h4XlF6Svx2fywMYufGtL", "3ch3CCIwylkue97fKtVgZja7Sq2vQTLD", "WcYwUSLGNymzaUHoHnyTUfb", "YL0d97V0Q3k08jxWq5XvLfGqClGTo7H3", "GhmWEJEURttFfnvoo6VO1smQO3ReaFoJ"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2076mv A01;
    public final /* synthetic */ AnonymousClass38 A02;
    public final /* synthetic */ C0957Mj A03;
    public final /* synthetic */ C06218r A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-97, -93, -59, -24, -27, -12, -8, -23, -10, -92, -8, -19, -15, -23, -13, -7, -8, -78, -74, -61, -61, -64, -61, -73, -67, -79, -4, -15, -11, -19, -9, -3, -4};
        String[] strArr = A06;
        if (strArr[6].charAt(10) != strArr[4].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "j4Ns4hKT00kRsJcq4mYGiSVRR39xkXLE";
        strArr2[4] = "aj4N2GTd0jkYX56rliTu9cnftT6aRfqb";
    }

    static {
        A04();
    }

    public C2033mE(C0957Mj c0957Mj, AnonymousClass38 anonymousClass38, C2076mv c2076mv, long j10, C06218r c06218r) {
        this.A03 = c0957Mj;
        this.A02 = anonymousClass38;
        this.A01 = c2076mv;
        this.A00 = j10;
        this.A04 = c06218r;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        Map A01;
        this.A03.A0T(this.A02);
        this.A03.A0Q(this.A01);
        A01 = this.A03.A01(this.A00);
        A01.put(A01(18, 5, 53), A01(0, 2, 86));
        A01.put(A01(23, 3, 46), A01(26, 7, 108));
        this.A03.A05(this.A04.A03(EnumC06258v.A04), A01);
        this.A03.AD4(new C0660Ag(AdErrorType.NETWORK_ERROR, A01(2, 16, 104)));
    }
}
