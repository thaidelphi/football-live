package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
/* renamed from: com.facebook.ads.redexgen.X.n3  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2084n3 implements AnonymousClass23, InterfaceC04722u {
    public static byte[] A0B;
    public static String[] A0C = {"Tri2", "1D6RXHNY", "CY2J", "FG3HLf7FRck3Q4", "aTw9XxKg19aD2PWH35UjlgQd", "aN0Sboz7ddtAAnQUWG6qQ4oJRDDzSUBt", "pWs", "z"};
    public long A00;
    public RewardData A01;
    public C2E A02;
    public C2F A03;
    public C04732v A04;
    public C1900k1 A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{-37, -7, 6, -65, 12, -72, 11, 12, -7, 10, 12, -72, -39, 13, -4, 1, -3, 6, -5, -3, -26, -3, 12, 15, 7, 10, 3, -39, -5, 12, 1, 14, 1, 12, 17, -58, -72, -27, -7, 3, -3, -72, 11, 13, 10, -3, -72, 12, 0, -7, 12, -72, 1, 12, -65, 11, -72, 1, 6, -72, 17, 7, 13, 10, -72, -39, 6, -4, 10, 7, 1, -4, -27, -7, 6, 1, -2, -3, 11, 12, -58, 16, 5, 4, -72, -2, 1, 4, -3, -58, -16, -20, -21, 31, 14, 19, 15, 24, 13, 15, -8, 15, 30, 33, 25, 28, 21, -55, -48, -35, -50, -48, -46, -29, -40, -27, -40, -29, -24, -1, -9, -10, -5, -13, 6, -5, 1, 0, -42, -13, 6, -13, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -55, -53, -66, -67, -66, -65, -62, -57, -66, -67, -88, -53, -62, -66, -57, -51, -70, -51, -62, -56, -57, -92, -66, -46, -7, -20, -8, -4, -20, -6, -5, -37, -16, -12, -20, -6, -13, -18, -10, -6, -22, -50, -23, 34, 21, 17, 35, 0, 37, 28, 17, 12, -2, 3, -7, 4, 12};
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(194, 6, 65));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        FF A02 = A02();
        if (A02 == FF.A05) {
            String[] strArr = A0C;
            String str = strArr[4];
            String str2 = strArr[7];
            int rotation2 = str.length();
            if (rotation2 != str2.length()) {
                String[] strArr2 = A0C;
                strArr2[6] = "b7o";
                strArr2[3] = "Q7inAkPu5HYVeU";
                return -1;
            }
        } else if (A02 == FF.A03) {
            switch (rotation) {
                case 2:
                case 3:
                    int rotation3 = A0C[1].length();
                    if (rotation3 != 29) {
                        String[] strArr3 = A0C;
                        strArr3[6] = "bcp";
                        strArr3[3] = "BEZRNTMscmchpM";
                        return 8;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            switch (rotation) {
                case 2:
                    return 9;
                default:
                    String[] strArr4 = A0C;
                    String str3 = strArr4[4];
                    String str4 = strArr4[7];
                    int rotation4 = str3.length();
                    if (rotation4 != str4.length()) {
                        String[] strArr5 = A0C;
                        strArr5[0] = "VdY7";
                        strArr5[2] = "KFhl";
                        return 1;
                    }
                    throw new RuntimeException();
            }
        }
        throw new RuntimeException();
    }

    private final BG A01() {
        return this.A04.A0E();
    }

    private FF A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        this.A04.A0I(intent, this.A01, I7.A03(this.A01, this.A0A, this.A06));
    }

    private final void A07(C1900k1 c1900k1, C2E c2e, AnonymousClass38 anonymousClass38, EnumSet<CacheFlag> cacheFlags, String str) {
        C04732v c04732v = new C04732v(c1900k1, anonymousClass38, this, str);
        C2S A0D = c04732v.A0D();
        if (C06419m.A0u(c1900k1) && (A0D instanceof AbstractC2058md) && AbstractC04511z.A06(this.A05, AbstractC04511z.A01(c1900k1, anonymousClass38.A03(), ((AbstractC2058md) A0D).A1g()), c1900k1.A0A())) {
            this.A05.A0F().A4s();
            this.A02.ADV(this, AdError.NO_FILL);
            return;
        }
        this.A04 = c04732v;
        A08(c04732v.A0E());
        c04732v.A0J(c1900k1, cacheFlags);
    }

    private void A08(BG bg) {
        if (bg.equals(BG.A04)) {
            this.A05.A0F().AIz(EnumC04431r.A05);
        } else if (bg.equals(BG.A0A)) {
            this.A05.A0F().AIz(EnumC04431r.A04);
        } else if (bg.equals(BG.A0B)) {
            this.A05.A0F().AIz(EnumC04431r.A0B);
        } else if (bg.equals(BG.A0D)) {
            this.A05.A0F().AIz(EnumC04431r.A0D);
        } else if (bg.equals(BG.A0C)) {
            this.A05.A0F().AIz(EnumC04431r.A0C);
        } else if (!bg.equals(BG.A06)) {
        } else {
            if (this.A04.A0K()) {
                this.A05.A0F().AIz(EnumC04431r.A08);
            } else if ((A09() instanceof AbstractC2058md) && this.A04.A0L((AbstractC2058md) A09())) {
                InterfaceC04311f A0F = this.A05.A0F();
                if (A0C[1].length() == 29) {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "5zP";
                strArr[3] = "kcwn0HZtMTZNOx";
                A0F.AIz(EnumC04431r.A0A);
            } else {
                this.A05.A0F().AIz(EnumC04431r.A09);
            }
        }
    }

    public final C2S A09() {
        return this.A04.A0D();
    }

    public final void A0A(C1900k1 c1900k1, C2E c2e, AnonymousClass38 anonymousClass38, EnumSet<CacheFlag> enumSet, String str, String str2, RewardData rewardData) {
        this.A05 = c1900k1;
        this.A02 = c2e;
        this.A08 = anonymousClass38.A02();
        this.A06 = this.A08 != null ? this.A08.split(A03(107, 1, 22))[0] : A03(0, 0, 85);
        this.A00 = anonymousClass38.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1900k1, c2e, anonymousClass38, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            if (this.A02 != null) {
                this.A02.ADV(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent A05 = C0683Bq.A05(this.A05);
        A05.putExtra(A03(143, 24, 5), A00());
        A05.putExtra(A03(178, 8, 49), this.A0A);
        A05.putExtra(A03(132, 11, 76), this.A08);
        A05.putExtra(A03(167, 11, 51), this.A00);
        BG A01 = A01();
        A08(A01);
        A05.putExtra(A03(186, 8, 88), A01);
        if (this.A07 != null) {
            A05.putExtra(A03(119, 13, 62), this.A07);
        }
        A06(A05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            String[] strArr = A0C;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "Sc68";
            strArr2[2] = "wieN";
            A05.addFlags(268435456);
        }
        try {
            ActivityUtils.A03(this.A05);
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C0683Bq.A0I(this.A05, A05)) {
                    this.A05.A0F().AHI();
                    if (this.A02 != null) {
                        this.A02.ADV(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C0683Bq.A0B(this.A05, A05);
            return true;
        } catch (C0681Bo e8) {
            Throwable cause = e8.getCause();
            Throwable th = e8;
            if (cause != null) {
                th = e8.getCause();
            }
            this.A05.A08().AAu(A03(108, 11, 27), AbstractC06048a.A0D, new C06058b(th));
            Log.e(A03(90, 17, 86), A03(0, 90, 68), th);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final String A7E() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final AdPlacementType A8a() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AC8(AdError adError) {
        if (this.A02 != null) {
            this.A02.ADV(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AC9() {
        A04();
        this.A02.ADU(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AGg() {
        this.A03 = new C2F(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final boolean AJQ() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AJc() {
        if (this.A03 != null) {
            C2F c2f = this.A03;
            String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "DiF0";
            strArr2[2] = "lQT3";
            c2f.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0H();
        }
    }
}
