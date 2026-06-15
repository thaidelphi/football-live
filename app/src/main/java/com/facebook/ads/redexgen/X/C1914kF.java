package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.kF  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1914kF {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final C7N A00;
    public final C05987t A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{81, 115, 100, 109, 110, 96, 101, 104, 111, 102, 33, 36, 101, 33, 96, 114, 114, 100, 117, 114, 60, 30, 9, 0, 3, 13, 8, 5, 2, 11, 76, 5, 1, 13, 11, 9, 86, 76, 73, 31, 118, 84, 67, 74, 73, 71, 66, 79, 72, 65, 6, 75, 71, 84, 77, 83, 86, 28, 6, 3, 85, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, 38, 112, 111, 98, 99, 105, 60, 38, 35, 117, 50, 101, 48, 48, 96, 97, 98, 98, 123, 52, 110, 101, 100, 123, 103, 103, 51, 111, 123, 55, 100, 55, 101, 123, 100, 55, 100, 55, 51, 100, 50, 52, 53, 53, 51, 98, 55, 53, 34, 33, 34, 51, 36, 47, 106, 113, 116, 113, 112, 104, 113};
    }

    static {
        A02();
        A04 = C1914kF.class.getSimpleName();
    }

    public C1914kF(C7N c7n, C1899k0 c1899k0) {
        this.A00 = c7n;
        this.A00.A3q(new C1916kH(this));
        this.A01 = new C05987t(c1899k0);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            C7N c7n = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(c7n.A6n().size()));
        }
        for (C7Q c7q : this.A00.A6n()) {
            switch (C7M.A00[c7q.A9E().ordinal()]) {
                case 1:
                    A04(c7q.getUrl());
                    break;
                case 2:
                    A06(c7q.getUrl());
                    break;
                case 3:
                    A05(c7q.getUrl());
                    break;
            }
        }
        this.A01.A0W(new C1915kG(this), new C05917m(A00(81, 36, 123), A00(125, 7, 50)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        C05967r c05967r = new C05967r(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        c05967r.A01 = A00(117, 8, 106);
        this.A01.A0b(c05967r);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        C05947p c05947p = new C05947p(str, A00(81, 36, 123), A00(125, 7, 50));
        c05947p.A04 = true;
        c05947p.A02 = A00(117, 8, 106);
        this.A01.A0X(c05947p);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        C05947p c05947p = new C05947p(str, A00(81, 36, 123), A00(125, 7, 50));
        c05947p.A04 = false;
        c05947p.A02 = A00(117, 8, 106);
        this.A01.A0a(c05947p);
    }
}
