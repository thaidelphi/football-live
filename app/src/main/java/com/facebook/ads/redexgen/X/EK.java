package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class EK extends Z1 {
    public static byte[] A07;
    public static String[] A08 = {"OeYhwvq00bMNYRlp8BxeqxzBkkxb", "nkAG9tudEnhHC7mgCykA73xzeSMA", "dPMLzny", "89sU", "GOWZnpp", "xskk6Zi7ChFZ13", "OtgkT7DbFI27r6Tfpevt", "UWT5bAyAVTX0VJWiYNGzQ1fG72nxKTm3"};
    public static final InterfaceC0972Na<EK> A09;
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public static final String A0F;
    public final boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final ZM A04;
    public final AbstractC1023Pb A05;
    public final String A06;

    public static /* synthetic */ EK A00(Bundle bundle) {
        return new EK(bundle);
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A08;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "U38F0gdMiMxij0PALtiSuZMWxKwUMHry";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
            i13++;
        }
    }

    public static void A07() {
        A07 = new byte[]{28, 89, 78, 78, 83, 78, 16, 28, 85, 82, 88, 89, 68, 1, 69, 73, 15, 6, 27, 4, 8, 29, 84, 71, 75, 13, 4, 25, 6, 10, 31, 52, 24, 30, 27, 27, 4, 25, 31, 14, 15, 86, 88, 66, 115, 68, 76, 78, 85, 68, 1, 68, 83, 83, 78, 83, 100, 88, 66, 69, 84, 82, 23, 82, 69, 69, 88, 69, 48, 11, 0, 29, 21, 0, 6, 17, 0, 1, 69, 23, 16, 11, 17, 12, 8, 0, 69, 0, 23, 23, 10, 23};
    }

    static {
        A07();
        A09 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.ZR
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                return EK.A00(bundle);
            }
        };
        A0F = AbstractC1672gE.A0h(1001);
        A0E = AbstractC1672gE.A0h(1002);
        A0D = AbstractC1672gE.A0h(1003);
        A0B = AbstractC1672gE.A0h(1004);
        A0C = AbstractC1672gE.A0h(1005);
        A0A = AbstractC1672gE.A0h(1006);
    }

    public EK(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public EK(int i10, Throwable th, String str, int i11, String str2, int i12, ZM zm, int i13, boolean z10) {
        this(A06(i10, th, str, str2, i12, zm, i13), th, i11, i10, str2, i12, zm, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public EK(Bundle bundle) {
        super(bundle);
        ZM A6V;
        this.A03 = bundle.getInt(A0F, 2);
        this.A06 = bundle.getString(A0E);
        this.A02 = bundle.getInt(A0D, -1);
        Bundle bundle2 = bundle.getBundle(A0B);
        if (bundle2 == null) {
            A6V = null;
        } else {
            A6V = ZM.A0b.A6V(bundle2);
        }
        this.A04 = A6V;
        this.A01 = bundle.getInt(A0C, 4);
        this.A00 = bundle.getBoolean(A0A, false);
        this.A05 = null;
    }

    public EK(String str, Throwable th, int i10, int i11, String str2, int i12, ZM zm, int i13, AbstractC1023Pb abstractC1023Pb, long j10, boolean z10) {
        super(str, th, i10, j10);
        boolean z11 = false;
        AbstractC1589es.A07(!z10 || i11 == 1);
        AbstractC1589es.A07((th != null || i11 == 3) ? true : true);
        this.A03 = i11;
        this.A06 = str2;
        this.A02 = i12;
        this.A04 = zm;
        this.A01 = i13;
        this.A05 = abstractC1023Pb;
        this.A00 = z10;
    }

    public static EK A01(IOException iOException, int i10) {
        return new EK(0, iOException, i10);
    }

    @Deprecated
    public static EK A02(RuntimeException runtimeException) {
        return A03(runtimeException, 1000);
    }

    public static EK A03(RuntimeException runtimeException, int i10) {
        return new EK(2, runtimeException, i10);
    }

    public static EK A04(Throwable th, String str, int i10, ZM zm, int i11, boolean z10, int i12) {
        int i13 = i11;
        if (zm == null) {
            i13 = 4;
        }
        return new EK(1, th, null, i12, str, i10, zm, i13, z10);
    }

    public static String A06(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}, value = "Throwable cause - linked with Error reporting") int i10, Throwable th, String str, String str2, int i11, ZM zm, int i12) {
        String message;
        String A05;
        if (str == null) {
            message = th == null ? null : th.getMessage();
        } else {
            message = str;
        }
        if (message != null) {
            return message;
        }
        switch (i10) {
            case 0:
                A05 = A05(56, 12, 15);
                break;
            case 1:
                StringBuilder append = new StringBuilder().append(str2);
                String message2 = A05(0, 14, 4);
                StringBuilder append2 = append.append(message2).append(i11);
                String message3 = A05(14, 9, 81);
                StringBuilder append3 = append2.append(message3).append(zm);
                String message4 = A05(23, 19, 83);
                StringBuilder append4 = append3.append(message4);
                String message5 = AbstractC1672gE.A0g(i12);
                A05 = append4.append(message5).toString();
                break;
            case 2:
            default:
                A05 = A05(68, 24, 93);
                break;
            case 3:
                A05 = A05(44, 12, 25);
                break;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder append5 = new StringBuilder().append(A05);
            String message6 = A05(42, 2, 90);
            return append5.append(message6).append(str).toString();
        }
        return A05;
    }
}
