package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.6j  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05626j {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C05576e A01;
    public final C1900k1 A02;
    public final A7 A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1741hM A06() {
        C0968Mw A02 = A02();
        if (A02 == null) {
            return null;
        }
        C1737hI c1737hI = new C1737hI();
        return new C1741hM(this.A02, this.A03, new C1945kk(this.A01), A02, null, c1737hI, A0K(c1737hI, A02));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1741hM A07() {
        C0966Mu A03 = A03();
        if (A03 == null) {
            return null;
        }
        C1736hH c1736hH = new C1736hH();
        return new C1741hM(this.A02, this.A03, new M6(this.A01), A03, A03.A0s(), c1736hH, A0K(c1736hH, A03));
    }

    public static String A0L(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A04 = new byte[]{99, Byte.MAX_VALUE, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 124, 115, 102, 123, 100, 119, 83, 118, 86, 115, 102, 115, 80, 103, 124, 118, 126, 119, 106, 118, 123, 121, Byte.MAX_VALUE, 119, Byte.MAX_VALUE, 116, 110, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, 16, 39, 60, 54, 62, 55, 22, 9, 4, 5, 15, 63, 20, 9, 13, 5, 63, 16, 15, 12, 12, 9, 14, 7, 63, 9, 14, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0M();
    }

    public C05626j(C05576e c05576e, Intent intent, A7 a72, C1900k1 c1900k1) {
        this.A01 = c05576e;
        this.A00 = intent;
        this.A03 = a72;
        this.A02 = c1900k1;
    }

    private AbstractC2058md A00() {
        int i10 = Build.VERSION.SDK_INT;
        String A0L = A0L(68, 18, 41);
        if (i10 >= 33) {
            return (AbstractC2058md) this.A00.getSerializableExtra(A0L, AbstractC2058md.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC2058md) intent.getSerializableExtra(A0L);
    }

    private C2056mb A01() {
        int i10 = Build.VERSION.SDK_INT;
        String A0L = A0L(26, 19, 47);
        if (i10 >= 33) {
            return (C2056mb) this.A00.getSerializableExtra(A0L, C2056mb.class);
        }
        return (C2056mb) this.A00.getSerializableExtra(A0L);
    }

    private C0968Mw A02() {
        int i10 = Build.VERSION.SDK_INT;
        String A0L = A0L(2, 14, 94);
        if (i10 >= 33) {
            return (C0968Mw) this.A00.getSerializableExtra(A0L, C0968Mw.class);
        }
        return (C0968Mw) this.A00.getSerializableExtra(A0L);
    }

    private C0966Mu A03() {
        int i10 = Build.VERSION.SDK_INT;
        String A0L = A0L(95, 25, 105);
        if (i10 >= 33) {
            return (C0966Mu) this.A00.getSerializableExtra(A0L, C0966Mu.class);
        }
        return (C0966Mu) this.A00.getSerializableExtra(A0L);
    }

    private DS A05() {
        if (C06419m.A2m(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0L(45, 23, 126));
            C05576e c05576e = this.A01;
            C1900k1 c1900k1 = this.A02;
            A7 a72 = this.A03;
            C1945kk c1945kk = new C1945kk(this.A01);
            Intent intent = this.A00;
            String clickDelayMs = A0L(16, 10, 115);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0L(0, 2, 117);
            }
            int parseInt = Integer.parseInt(stringExtra);
            if (A05[5].charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new View$OnClickListenerC0947Lz(c05576e, c1900k1, a72, c1945kk, stringExtra2, parseInt);
        }
        return new C1773hu(this.A01, this.A02, this.A03, new C1945kk(this.A01));
    }

    private final C1740hL A08() {
        return new C1740hL(this.A02, this.A01);
    }

    private C1738hJ A09(RelativeLayout relativeLayout) {
        C1738hJ c1738hJ = new C1738hJ(this.A02, new C1944kj(this), this.A03, new C1945kk(this.A01));
        c1738hJ.A05(relativeLayout);
        c1738hJ.A04(this.A00.getIntExtra(A0L(120, 27, 91), 200));
        D3.A0K(relativeLayout, -16777216);
        return c1738hJ;
    }

    private LJ A0A() {
        C0968Mw A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new LJ(this.A02, this.A03, new C1945kk(this.A01), A02, new C1737hI(), 1);
    }

    private LJ A0B() {
        C0966Mu A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new LJ(this.A02, this.A03, new C1945kk(this.A01), A03, new C1736hH(), 0);
    }

    private C1617fL A0C() {
        C0810Gr A02;
        AbstractC2058md A00 = A00();
        if (A00 == null || (A02 = AbstractC0811Gs.A02(A00.A0r())) == null) {
            return null;
        }
        return new C1617fL(this.A02, new C1945kk(this.A01), A02, A00.A1g());
    }

    private C1534dz A0D(BG bg) {
        EC c1736hH;
        DR m62;
        C2056mb A01 = A01();
        if (A01 == null) {
            return null;
        }
        if (bg == BG.A04) {
            c1736hH = new C1737hI();
            m62 = new C1945kk(this.A01);
        } else {
            c1736hH = new C1736hH();
            m62 = new M6(this.A01);
        }
        return new C1534dz(this.A02, c1736hH, this.A03, A01, new C05987t(this.A02), m62);
    }

    private C0913Kq A0E() {
        C0968Mw A02 = A02();
        if (A02 == null) {
            if (A05[1].charAt(5) != 'X') {
                throw new RuntimeException();
            }
            A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
            return null;
        }
        return new C0913Kq(this.A02, new C1737hI(), this.A03, A02, new C05987t(this.A02), new C1945kk(this.A01));
    }

    private C0906Kj A0F() {
        C0968Mw A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new C0906Kj(this.A02, new C1737hI(), this.A03, A02, new C05987t(this.A02), new C1945kk(this.A01));
    }

    private C0906Kj A0G() {
        C0966Mu A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new C0906Kj(this.A02, new C1736hH(), this.A03, A03, new C05987t(this.A02), new M6(this.A01));
    }

    private C1503dT A0H() {
        C0966Mu A03;
        C0966Mu A032 = A03();
        if (A032 == null || (A03 = A03()) == null) {
            return null;
        }
        return new C1503dT(this.A02, this.A03, A032, A03, new M6(this.A01), this.A01);
    }

    private C0905Ki A0I() {
        C0968Mw dataBundle = A02();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0y(this.A01.A08());
        return new C0905Ki(this.A02, this.A03, new C05987t(this.A02), new C1945kk(this.A01), dataBundle);
    }

    private C0905Ki A0J() {
        C0966Mu dataBundle = A03();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0y(this.A01.A08());
        return new C0905Ki(this.A02, this.A03, new C05987t(this.A02), new C1945kk(this.A01), dataBundle);
    }

    private C0833Ho A0K(EC ec, AbstractC2058md abstractC2058md) {
        C04672p A07 = abstractC2058md.A1b().A0F().A07();
        if (A07 == null || !A07.A0M()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0L(86, 9, 33), ec.A8b());
        return new C0833Ho(this.A02, abstractC2058md, A07, this.A03, null, hashMap);
    }

    public final DS A0N(BG bg, RelativeLayout relativeLayout) {
        if (bg == null) {
            return null;
        }
        switch (C05616i.A00[bg.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A09(relativeLayout);
                }
                return null;
            case 2:
                return A0J();
            case 3:
                return A0G();
            case 4:
                return A07();
            case 5:
                return A05();
            case 6:
                C0906Kj A0F = A0F();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return A0F;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return A0F;
            case 7:
                return A0E();
            case 8:
                return A0I();
            case 9:
                return A06();
            case 10:
                return A0C();
            case 11:
                LJ A0A = A0A();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return A0A;
            case 12:
                return A0B();
            case 13:
            case 14:
                return A0D(bg);
            case 15:
                return A08();
            case 16:
                return A0H();
            default:
                return null;
        }
    }
}
