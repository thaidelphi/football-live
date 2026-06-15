package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class B9 {
    public static byte[] A08;
    public static String[] A09 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final D6 A0A;
    public static final Executor A0B;
    public static final AtomicReference<BD> A0C;
    public long A00;
    public long A01;
    public B8 A02;
    public Map<String, String> A03;
    public final C04843g A04;
    public final C1900k1 A05;
    public final BA A06;
    public final String A07;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{108, 106, 110, 115, -101, -99, 112, 114, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, 89, -117, -121, 115, 89, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, 11, -30, 5, 8, 8, -28, 11, 11, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0B();
        A0A = new D6();
        A0B = Executors.newCachedThreadPool(A0A);
        A0C = new AtomicReference<>();
    }

    public B9(C1900k1 c1900k1) {
        this(c1900k1, AbstractC04853h.A00(c1900k1.A02()));
    }

    public B9(C1900k1 c1900k1, C04843g c04843g) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A05 = c1900k1;
        this.A06 = BA.A00();
        this.A07 = BE.A01(c1900k1);
        this.A04 = c04843g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1806iU A03(long j10, B6 b62) {
        return new C1806iU(this, b62, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A05 == null || !C0880Jj.A0A(this.A05)) {
            return;
        }
        C06058b c06058b = new C06058b(A06(8, 5, 102));
        c06058b.A05(1);
        this.A05.A08().AAu(A06(86, 7, 32), AbstractC06048a.A1x, c06058b);
    }

    private void A0C(int i10, String str) {
        String A06 = A06(37, 16, 59);
        String A062 = A06(0, 8, 1);
        String A063 = A06(93, 10, 99);
        AbstractC0669Au.A05(A063, A06, A062);
        AbstractC0669Au.A04(A063, String.format(Locale.US, A06(53, 26, 82), Integer.valueOf(i10), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C0660Ag c0660Ag) {
        if (this.A02 != null) {
            this.A02.AD4(c0660Ag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C0660Ag c0660Ag) {
        ExecutorC0712Cx.A00(new C1804iS(this, c0660Ag));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(C1803iR c1803iR) {
        if (this.A02 != null) {
            this.A02.AFG(c1803iR);
        } else if (c1803iR.A00() == null || c1803iR.A00().A06() == null) {
        } else {
            C0677Bh.A00(this.A05).A0D(c1803iR.A00().A06().toString(), c1803iR.A00().A0B());
        }
    }

    private void A0M(C1803iR c1803iR) {
        C8B syncModule;
        ExecutorC0712Cx.A00(new C1805iT(this, c1803iR));
        if (C06419m.A2U(this.A05) && (syncModule = this.A05.A06()) != null) {
            syncModule.A6T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j10, B6 b62) {
        String clientChallenge;
        try {
        } catch (Exception e8) {
            e = e8;
        }
        try {
            BC A07 = this.A06.A07(this.A05, str, j10);
            C06238t A00 = A07.A00();
            if (A00 != null) {
                C06419m.A0U(this.A05).A2w(A00.A0A());
                if (C06419m.A0w(this.A05) && A00.A08() != null) {
                    AnonymousClass93.A04(this.A05.A02(), A00.A08());
                }
                if (C06419m.A0x(this.A05) && A00.A0D() != null) {
                    AnonymousClass93.A05(this.A05.A02(), A00.A0D());
                }
                this.A05.A08().ABl();
                this.A04.A0N(A00.A07());
                B5.A05(A00.A05().A0B(), b62);
                DH.A01(this.A05, A0B, A00);
                C06058b c06058b = new C06058b(A06(30, 7, 0) + CQ.A02());
                c06058b.A06(1);
                c06058b.A0A(false);
                this.A05.A08().ABU(A06(79, 7, 63), AbstractC06048a.A1W, c06058b);
            }
            switch (A07.A01()) {
                case A02:
                    C1803iR c1803iR = (C1803iR) A07;
                    if (A00 != null) {
                        if (A00.A05().A0E()) {
                            B5.A07(str, b62);
                        }
                        if (this.A03 != null) {
                            clientChallenge = this.A03.get(A06(13, 17, 107));
                        } else {
                            clientChallenge = null;
                        }
                        if (!TextUtils.isEmpty(A07.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                            this.A05.A03().AHo(this.A05, clientChallenge, A07.A02());
                        }
                    }
                    this.A05.A0F().A3N(C0709Cu.A01(this.A01), C0709Cu.A02(this.A01, this.A00));
                    A0M(c1803iR);
                    return;
                case A03:
                    C1802iQ c1802iQ = (C1802iQ) A07;
                    String A04 = c1802iQ.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1802iQ.A03(), AdErrorType.ERROR_MESSAGE);
                    A0C(c1802iQ.A03(), A04);
                    if (A04 == null) {
                        A04 = str;
                    }
                    this.A05.A0F().A3M(C0709Cu.A01(this.A01), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                    A0E(C0660Ag.A01(adErrorTypeFromCode, A04));
                    return;
                default:
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A05.A0F().A3M(C0709Cu.A01(this.A01), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0E(C0660Ag.A01(adErrorType, str));
                    return;
            }
        } catch (Exception e10) {
            e = e10;
            String message = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            C1900k1 c1900k1 = this.A05;
            if (A09[0].length() == 29) {
                throw new RuntimeException();
            }
            A09[0] = "STn1t4NLUPoQ";
            c1900k1.A0F().A3M(C0709Cu.A01(this.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0E(C0660Ag.A01(adErrorType2, message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j10, B6 b62) {
        A0B.execute(new C1807iV(this, str, j10, b62));
    }

    private boolean A0P(B6 b62) {
        String adPlacementType = b62.A06().toString();
        if (C0677Bh.A00(this.A05).A0F(adPlacementType)) {
            return false;
        }
        int A0A2 = C0677Bh.A00(this.A05).A0A(adPlacementType);
        int storedAdsCount = C06419m.A0I(this.A05);
        int A092 = C0677Bh.A00(this.A05).A09(adPlacementType);
        if (A0A2 >= storedAdsCount || A0A2 > A092) {
            C0677Bh A00 = C0677Bh.A00(this.A05);
            String type = b62.A06().toString();
            Pair<String, String> A0B2 = A00.A0B(type);
            if (A0B2 != null) {
                Object obj = A0B2.second;
                String[] strArr = A09;
                String str = strArr[1];
                String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && A0B2.first != null) {
                    A0O(A0B2.second.toString(), 0L, b62);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0Q(B6 b62) {
        this.A01 = System.currentTimeMillis();
        C06148k.A0B(this.A05);
        A0C.get();
        if (0 != 0) {
            throw new NullPointerException(A06(103, 7, 52));
        }
        if (C06419m.A02(this.A05) > 0 && A0P(b62)) {
            return;
        }
        if (B5.A08(b62)) {
            D8.A06.execute(new C1809iX(this));
            String A02 = B5.A02(b62);
            if (A02 != null) {
                this.A05.A0F().AJl();
                A0O(A02, 0L, b62);
                return;
            }
            AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A05.A0F().A3M(C0709Cu.A01(this.A01), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
            A0E(C0660Ag.A01(error, null));
            return;
        }
        A0B.execute(new C1808iW(this, b62));
    }

    public final void A0R(B8 b82) {
        this.A02 = b82;
    }
}
