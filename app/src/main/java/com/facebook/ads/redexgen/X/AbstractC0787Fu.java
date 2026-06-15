package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.Fu  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0787Fu {
    public static byte[] A00;
    public static String[] A01 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-73, -32, 10, -73, -32, 5, 10, 11, -8, 5, 11, -73, -2, -8, 4, -4, 10, -73, -8, 3, 3, 6, 14, -4, -5, -47, -73, -121, -80, -38, -121, -80, -43, -38, -37, -56, -43, -37, -121, -50, -56, -44, -52, -38, -95, -121, -57, 14, 22, 22, 14, 19, 12, -57, 13, 8, 19, 19, 9, 8, 10, 18, -57, 28, 25, 19, -57, 8, 29, 8, 16, 19, 8, 9, 19, 12, -31, -57, 79, -104, -94, -126, -93, -98, -95, -108, 105, 79, 90, -95, -9, -22, -27, -26, -16, -95, -10, -13, -19, -95, -22, -12, -95, -17, -10, -19, -19, -69, -95, 4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 12, 2, 21, 2, 15, 2, -42, -41, -46, -43, -56, -35, -34, -39, -36, -49, -55, -33, -36, -42, -55, -31, -49, -52, -55, -48, -53, -42, -42, -52, -53, -51, -43, -30, -43, -48, -47, -37, -53, -31, -34, -40};
        String[] strArr = A01;
        if (strArr[5].charAt(19) != strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "ump74";
        strArr2[2] = "QJx5Vwz5z";
    }

    static {
        A02();
    }

    public static AbstractC0786Ft A00(C0790Fx c0790Fx, Bundle bundle, boolean z10) {
        AbstractC0786Ft c1668gA;
        c0790Fx.A05().A0H().A00(false);
        C2T A1b = c0790Fx.A04().A1b();
        double A002 = AbstractC0783Fq.A00(A1b);
        boolean isWatchAndBrowse = c0790Fx.A04().A1b().A0Q();
        boolean A06 = AbstractC0783Fq.A06(c0790Fx.A00(), c0790Fx.A01(), A002);
        AbstractC04471v A003 = C04481w.A00(c0790Fx.A05(), c0790Fx.A06(), A01(0, 0, 8), C5.A00(c0790Fx.A04().A1b().A0H().A05()), new HashMap(), c0790Fx.A04().A1c());
        boolean z11 = !TextUtils.isEmpty(A1b.A0F().A09());
        if (C06419m.A1s(c0790Fx.A05())) {
            C1900k1 A05 = c0790Fx.A05();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            A05.A0B().AJs(c0790Fx.A02(), c0790Fx.A04().A1g(), z11);
        }
        boolean A03 = A03(c0790Fx, z11);
        if ((isWatchAndBrowse && (A003 instanceof N8)) || A03) {
            c1668gA = new C1652fu(c0790Fx, A03);
        } else if (z11) {
            c1668gA = new LS(c0790Fx);
        } else if (!z11 && C06419m.A2Y(c0790Fx.A05())) {
            c1668gA = new LT(c0790Fx, A06);
        } else if (A06) {
            c1668gA = new C1673gF(c0790Fx, c0790Fx.A00() == 2);
        } else {
            c1668gA = new C1668gA(c0790Fx, AbstractC0783Fq.A04(A002));
        }
        if (z10) {
            c1668gA.A14(A1b, c0790Fx.A04().A1g(), A002, bundle);
        }
        return c1668gA;
    }

    public static boolean A03(C0790Fx c0790Fx, boolean z10) {
        boolean z11 = false;
        if (c0790Fx.A04().A1T() && z10) {
            Uri A002 = C5.A00(c0790Fx.A04().A1b().A0H().A05());
            String authority = A002.getAuthority();
            if (TextUtils.isEmpty(authority)) {
                c0790Fx.A05().A0F().ABf();
                return false;
            }
            boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 58));
            boolean isInstantGames = A002.getQueryParameter(A01(155, 9, 67)) == null;
            String queryParameter = A002.getQueryParameter(A01(133, 22, 65));
            boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c0790Fx.A04().A0j());
            boolean equals = c0790Fx.A05().getPackageName().equals(A01(109, 19, 120));
            boolean A1U = c0790Fx.A04().A1U();
            if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!equals || A1U)) {
                z11 = true;
            }
            if (!z11 && Build.VERSION.SDK_INT >= 24) {
                c0790Fx.A05().A0F().ABe(A01(78, 11, 6) + isInstantGamesEnabled + A01(89, 20, 88) + isInstantGames + A01(46, 32, 126) + isGoogleFallBackUrlAvailable + A01(27, 19, 62) + equals + A01(0, 27, 110) + A1U);
            }
            return z11;
        }
        return false;
    }
}
