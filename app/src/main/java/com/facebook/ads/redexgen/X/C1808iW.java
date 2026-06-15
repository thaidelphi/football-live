package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.iW  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1808iW extends BY {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ B6 A00;
    public final /* synthetic */ B9 A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, 18, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, 63, 51, 50, 50, 57, 63, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1900k1 c1900k1;
        C1900k1 c1900k12;
        C1900k1 c1900k13;
        C1900k1 c1900k14;
        C1900k1 c1900k15;
        long j10;
        C1900k1 c1900k16;
        String str;
        Map<? extends String, ? extends String> map;
        JS A032;
        C1900k1 c1900k17;
        C1900k1 c1900k18;
        C1900k1 c1900k19;
        C1900k1 c1900k110;
        long j11;
        this.A01.A00 = System.currentTimeMillis();
        c1900k1 = this.A01.A05;
        if (AbstractC0707Cs.A00(c1900k1) == EnumC0706Cr.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A01 = A01(13, 21, 62);
            c1900k110 = this.A01.A05;
            InterfaceC04311f A0F = c1900k110.A0F();
            j11 = this.A01.A01;
            A0F.A3M(C0709Cu.A01(j11), adErrorType.getErrorCode(), A01, adErrorType.isPublicError());
            this.A01.A0E(new C0660Ag(adErrorType, A01));
            return;
        }
        c1900k12 = this.A01.A05;
        C06148k.A08(c1900k12);
        c1900k13 = this.A01.A05;
        C7V.A07(c1900k13);
        C9D A00 = C9D.A00();
        c1900k14 = this.A01.A05;
        boolean z10 = true;
        Map<String, String> A0A = this.A00.A0A(A00.A01(c1900k14, true).A7o(this.A00.A05()));
        this.A01.A03 = A0A;
        try {
            c1900k17 = this.A01.A05;
            PackageManager packageManager = c1900k17.getPackageManager();
            if (packageManager != null) {
                String A012 = A01(1, 12, 92);
                StringBuilder sb = new StringBuilder();
                c1900k18 = this.A01.A05;
                StringBuilder append = sb.append(c1900k18.getPackageName()).append(A01(0, 1, 59));
                c1900k19 = this.A01.A05;
                A0A.put(A012, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1900k19.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC0664Al.A04 && this.A00.A07() != EnumC0664Al.A06 && this.A00.A07() != EnumC0664Al.A05 && this.A00.A07() != null) {
                z10 = false;
            }
            c1900k16 = this.A01.A05;
            JR A022 = C0880Jj.A02(z10, c1900k16);
            str = this.A01.A07;
            C0876Jf c0876Jf = new C0876Jf();
            map = this.A01.A03;
            byte[] A08 = c0876Jf.A05(map).A08();
            A032 = this.A01.A03(C0709Cu.A00(), this.A00);
            A022.AG6(str, A08, A032);
        } catch (Exception e8) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e8.getMessage();
            c1900k15 = this.A01.A05;
            InterfaceC04311f A0F2 = c1900k15.A0F();
            j10 = this.A01.A01;
            A0F2.A3M(C0709Cu.A01(j10), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            B9 b92 = this.A01;
            C0660Ag A013 = C0660Ag.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            b92.A0E(A013);
        }
    }

    static {
        A04();
    }

    public C1808iW(B9 b92, B6 b62) {
        this.A01 = b92;
        this.A00 = b62;
    }
}
