package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;
/* renamed from: com.facebook.ads.redexgen.X.iU  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1806iU implements JS {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ B6 A01;
    public final /* synthetic */ B9 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 4, 87, 3, 80, 5, 7, 3, 62, 62, 57, 56, 50, 110, 62, 104, 44, 53, 41, 40, 35, 30, 5, 3, 22, 18, 15, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, 61, 120, 111, 111, 114, 111, 61, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, 15, 93, 74, 95, 67, 70, 74, 75, 15, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, 63, 62, 19, 63, 61, 32, 60, 53, 36, 53, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C1806iU(B9 b92, B6 b62, long j10) {
        this.A02 = b92;
        this.A01 = b62;
        this.A00 = j10;
    }

    private final void A02(C0875Je c0875Je) {
        C1900k1 c1900k1;
        long j10;
        C1900k1 c1900k12;
        long j11;
        BA ba2;
        C1900k1 c1900k13;
        C1900k1 c1900k14;
        long j12;
        B5.A06(this.A01);
        try {
            JQ response = c0875Je.A00();
            if (response != null) {
                String A6t = response.A6t();
                ba2 = this.A02.A06;
                c1900k13 = this.A02.A05;
                BC serverResponse = ba2.A07(c1900k13, A6t, this.A00);
                if (serverResponse.A01() == BB.A03) {
                    C1802iQ c1802iQ = (C1802iQ) serverResponse;
                    String A042 = c1802iQ.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1802iQ.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A6t = A042;
                    }
                    c1900k14 = this.A02.A05;
                    InterfaceC04311f A0F = c1900k14.A0F();
                    j12 = this.A02.A01;
                    A0F.A3M(C0709Cu.A01(j12), adErrorTypeFromCode.getErrorCode(), A6t, adErrorTypeFromCode.isPublicError());
                    this.A02.A0E(C0660Ag.A01(adErrorTypeFromCode, A6t));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c0875Je.getMessage();
            c1900k12 = this.A02.A05;
            InterfaceC04311f A0F2 = c1900k12.A0F();
            j11 = this.A02.A01;
            long A01 = C0709Cu.A01(j11);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0F2.A3M(A01, errorCode, message, isPublicError);
            this.A02.A0E(C0660Ag.A01(adErrorType, message));
        } catch (JSONException e8) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c0875Je.getMessage();
            c1900k1 = this.A02.A05;
            InterfaceC04311f A0F3 = c1900k1.A0F();
            j10 = this.A02.A01;
            A0F3.A3M(C0709Cu.A01(j10), adErrorType2.getErrorCode(), A00(16, 15, 30) + e8.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(C0660Ag.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.X.JS
    public final void ACh(JQ jq) {
        C1900k1 c1900k1;
        C1900k1 c1900k12;
        AbstractC0669Au.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, 114));
        if (jq != null) {
            String A6t = jq.A6t();
            c1900k1 = this.A02.A05;
            int A02 = C06419m.A02(c1900k1);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1900k12 = this.A02.A05;
                C0677Bh.A00(c1900k12).A0C(A6t);
            }
            B5.A06(this.A01);
            this.A02.A0O(A6t, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JS
    public final void AD5(Exception exc) {
        C1900k1 c1900k1;
        long j10;
        AbstractC0669Au.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (C0875Je.class.equals(exc.getClass())) {
            A02((C0875Je) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1900k1 = this.A02.A05;
        InterfaceC04311f A0F = c1900k1.A0F();
        j10 = this.A02.A01;
        A0F.A3M(C0709Cu.A01(j10), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(C0660Ag.A01(adErrorType, errorMessage));
    }
}
