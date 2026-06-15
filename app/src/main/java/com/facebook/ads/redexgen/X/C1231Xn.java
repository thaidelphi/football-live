package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.Xn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1231Xn {
    public static byte[] A0I;
    public static String[] A0J = {"aQOyOqoBkJ0rwuleBZ1F", "L0demTaA7O8QeCOuHbjan03WTHX", "rTDek8PbGiaqt9uZxgq95nX4Okm0DE6l", "CBhsEIM6p56i8hyujdcRkXgCLf8OrpOR", "ARhgf4ZvddJSdRvg2a3jN3ZUX5LvlJRE", "Eh2gAFDik7oC9QYLDC4m4", "8LFtV7kfs8BXCTQHnEtqb9d6omhUKRkh", "dZcdVeh5H2h2aQkfNZgW0W3UV0j17VoW"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    @MetaExoPlayerCustomization("Removed parameter in r2.18")
    public Layout.Alignment A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public Set<String> A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A0J[1].length() != 27) {
            throw new RuntimeException();
        }
        A0J[1] = "OYmGfvsLwvQICcsoqVdXYyJO8M2";
        A0I = new byte[]{-73, -42, -40, -32, -36, -25, -28, -22, -29, -39, -107, -40, -28, -31, -28, -25, -107, -29, -28, -23, -107, -39, -38, -37, -34, -29, -38, -39, -93, 126, -89, -90, -84, 88, -101, -89, -92, -89, -86, 88, -90, -89, -84, 88, -100, -99, -98, -95, -90, -99, -100};
    }

    static {
        A02();
    }

    public C1231Xn() {
        String A01 = A01(0, 0, 36);
        this.A0B = A01;
        this.A0C = A01;
        this.A0E = Collections.emptySet();
        this.A0D = A01;
        this.A0A = null;
        this.A0H = false;
        this.A0G = false;
        this.A06 = -1;
        this.A08 = -1;
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A09 = null;
        this.A07 = -1;
        this.A0F = false;
    }

    public static int A00(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        boolean equals = str.equals(str2);
        if (A0J[4].charAt(14) != 'A') {
            String[] strArr = A0J;
            strArr[7] = "8hwpOZ7w3wizngPtsVdpXoT58AkSD7vx";
            strArr[6] = "wQZ0xe9l4utCxDRbaU7qGXypvivD7YEx";
            if (equals) {
                return i10 + i11;
            }
            return -1;
        }
        throw new RuntimeException();
    }

    public final float A03() {
        return this.A00;
    }

    public final int A04() {
        if (this.A0G) {
            return this.A01;
        }
        throw new IllegalStateException(A01(0, 29, 76));
    }

    public final int A05() {
        if (this.A0H) {
            return this.A03;
        }
        throw new IllegalStateException(A01(29, 22, 15));
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        return this.A07;
    }

    public final int A08() {
        if (this.A02 == -1 && this.A05 == -1) {
            return -1;
        }
        return (this.A02 == 1 ? 1 : 0) | (this.A05 == 1 ? 2 : 0);
    }

    public final int A09(String str, String str2, Set<String> set, String str3) {
        if (this.A0B.isEmpty() && this.A0C.isEmpty() && this.A0E.isEmpty() && this.A0D.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int A00 = A00(0, this.A0B, str, 1073741824);
        String str4 = this.A0C;
        if (A0J[1].length() != 27) {
            throw new RuntimeException();
        }
        A0J[4] = "qJXY8AJeyfRufZ67RjFMGioJmjO24Zy8";
        int A002 = A00(A00(A00, str4, str2, 2), this.A0D, str3, 4);
        if (A002 != -1 && set.containsAll(this.A0E)) {
            int score = this.A0E.size();
            return A002 + (score * 4);
        } else if (A0J[4].charAt(14) != 'A') {
            A0J[4] = "27AatopipqVKDpk1DeFZu7Zz9e6Q7RNr";
            return 0;
        } else {
            String[] strArr = A0J;
            strArr[5] = "EDwz6ctWqW5GKR6US7g6e";
            strArr[0] = "sT4t7vymYW7iqr1Y7nGM";
            return 0;
        }
    }

    public final C1231Xn A0A(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C1231Xn A0B(int i10) {
        this.A01 = i10;
        this.A0G = true;
        return this;
    }

    public final C1231Xn A0C(int i10) {
        this.A03 = i10;
        this.A0H = true;
        return this;
    }

    public final C1231Xn A0D(int i10) {
        this.A04 = i10;
        return this;
    }

    public final C1231Xn A0E(int i10) {
        this.A07 = i10;
        return this;
    }

    public final C1231Xn A0F(String str) {
        this.A0A = str == null ? null : AbstractC1756hb.A01(str);
        return this;
    }

    public final C1231Xn A0G(boolean z10) {
        this.A02 = z10 ? 1 : 0;
        return this;
    }

    public final C1231Xn A0H(boolean z10) {
        this.A0F = z10;
        return this;
    }

    public final C1231Xn A0I(boolean z10) {
        this.A05 = z10 ? 1 : 0;
        return this;
    }

    public final C1231Xn A0J(boolean z10) {
        this.A08 = z10 ? 1 : 0;
        return this;
    }

    public final String A0K() {
        return this.A0A;
    }

    public final void A0L(String str) {
        this.A0B = str;
    }

    public final void A0M(String str) {
        this.A0C = str;
    }

    public final void A0N(String str) {
        this.A0D = str;
    }

    public final void A0O(String[] strArr) {
        this.A0E = new HashSet(Arrays.asList(strArr));
    }

    public final boolean A0P() {
        return this.A0F;
    }

    public final boolean A0Q() {
        return this.A0G;
    }

    public final boolean A0R() {
        return this.A0H;
    }

    public final boolean A0S() {
        return this.A06 == 1;
    }

    public final boolean A0T() {
        return this.A08 == 1;
    }
}
