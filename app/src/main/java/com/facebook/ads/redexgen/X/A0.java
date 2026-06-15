package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import java.util.Arrays;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class A0 implements AudienceNetworkExportedActivityApi {
    public static byte[] A01;
    public static String[] A02 = {"mk4JADweKGMdEipgs7lqzWCmp9MhwBVd", "7Ny", "iKbrrxCAW5LmmXQLv4pN0A2xOojW5LEh", "hTGooAwgeIivj8mmjwzyxJz5o5QVTAJv", "t2q", "TYEvFDV2ICGQhAA5rVoFfbgoEst1cigG", "6Z5Mtc9AK5a0redP3ZVrPDgigSlCVve8", "dEPXAz2Hd7rZMNq86xusU7gw49uZCQrL"};
    public final Activity A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -12, -6, 5, -8, -4, 5, -25, -10, -10, 5, -11, -8, -17, -21, -12, -6, -25, -6, -17, -11, -12, 5, -15, -21, -1, -44, -43, -45, -32, -62, -59, -32, -54, -59, -32, -52, -58, -38};
    }

    static {
        A01();
    }

    public A0(Activity activity) {
        this.A00 = activity;
    }

    private void A02(int i10) {
        this.A00.setResult(i10);
        this.A00.finish();
    }

    private boolean A03(C06549z c06549z) {
        String callingPackage = this.A00.getCallingPackage();
        if (callingPackage != null) {
            String callingPackage2 = c06549z.A03;
            if (callingPackage.equals(callingPackage2)) {
                if (A02[6].charAt(24) != 'N') {
                    String[] strArr = A02;
                    strArr[3] = "K8elIBMg7jYz2h1Vp3N7ST3gxgb7rcrL";
                    strArr[2] = "atbN7xR2A34bPDsarDq1XfYhUcdmo37f";
                    return true;
                }
                String[] strArr2 = A02;
                strArr2[3] = "WL8DJ1n8qMW41xfoDndW3QEL4VTWFS4X";
                strArr2[2] = "L472DFJOuggr64sYy3SVVGT8Lyt3cNtD";
                return true;
            }
        }
        A02(12);
        if (c06549z.A00 instanceof C2017ly) {
            ((C2017ly) c06549z.A00).A0F().A0F().AH1();
        }
        if (c06549z.A00 instanceof C2014lv) {
            InterfaceC04311f A0F = ((C2014lv) c06549z.A00).A0H().A0F();
            if (A02[6].charAt(24) != 'N') {
                String[] strArr3 = A02;
                strArr3[3] = "KnmB7vQIkrX7k7dgjGlnkXpo8slRCHvd";
                strArr3[2] = "L31mVvLUBUTWDHfS0xNAbfc4Adshav9b";
                A0F.AH1();
                return false;
            }
            throw new RuntimeException();
        }
        return false;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi
    public final void onCreate(Bundle bundle) {
        C1900k1 A05 = C05686p.A05(this.A00, UUID.randomUUID().toString());
        if (this.A00.isTaskRoot()) {
            A05.A0F().AGu();
            A02(10);
            return;
        }
        String stringExtra = this.A00.getIntent().getStringExtra(A00(26, 13, 64));
        if (stringExtra == null) {
            A05.A0F().AGx();
            A02(11);
            return;
        }
        C1846j9 A00 = C1846j9.A00();
        String[] strArr = A02;
        String adId = strArr[3];
        if (adId.charAt(2) == strArr[2].charAt(2)) {
            throw new RuntimeException();
        }
        A02[6] = "lksFSMsleDiju0zPRojKCtBItYjbAveN";
        C06549z A04 = A00.A04(stringExtra);
        C3G c3g = A04 != null ? A04.A00 : null;
        if (A04 != null && (c3g instanceof C2014lv)) {
            boolean A03 = A03(A04);
            String[] strArr2 = A02;
            String adId2 = strArr2[3];
            if (adId2.charAt(2) == strArr2[2].charAt(2)) {
                throw new RuntimeException();
            }
            A02[6] = "e1bxVkSqO5M4Y9q0gpYlqAB3DYjxjVYF";
            if (!A03) {
                return;
            }
            C2014lv c2014lv = (C2014lv) c3g;
            c2014lv.A0G().A01().A0J(this.A00);
            c2014lv.A0M(this.A00.getIntent().getIntExtra(A00(0, 26, 101), -1), 0L);
        } else if (A04 != null && (c3g instanceof C2017ly)) {
            if (!A03(A04)) {
                return;
            }
            C2017ly c2017ly = (C2017ly) c3g;
            c2017ly.A0E().A05().A0J(this.A00);
            c2017ly.A0J();
        } else {
            A05.A0F().AHO();
            A02(13);
            return;
        }
        this.A00.setResult(-1);
        this.A00.finish();
    }
}
