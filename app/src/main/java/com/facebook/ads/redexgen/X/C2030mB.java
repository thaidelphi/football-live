package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.mB  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2030mB implements B8 {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public C3B A00;
    public C06238t A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final AnonymousClass28 A07;
    public final C1900k1 A08;
    public final A7 A09;
    public final EnumC0664Al A0A;
    public final B9 A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        D5.A02();
    }

    public C2030mB(C1900k1 c1900k1, String str, EnumC0664Al enumC0664Al, AdSize adSize, int i10) {
        this.A08 = c1900k1;
        this.A0D = str;
        this.A0A = enumC0664Al;
        this.A06 = adSize;
        this.A04 = i10;
        this.A0B = new B9(this.A08);
        this.A0B.A0R(this);
        this.A07 = new AnonymousClass28();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new C0955Mh(this);
        this.A09 = c1900k1.A0A();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C2076mv> A04() {
        C06238t c06238t = this.A01;
        ArrayList arrayList = new ArrayList(c06238t.A02());
        for (C06218r A04 = c06238t.A04(); A04 != null; A04 = c06238t.A04()) {
            AnonymousClass23 A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A8a() == AdPlacementType.NATIVE) {
                C2076mv nativeAdapter = (C2076mv) A00;
                nativeAdapter.A0L(this.A08, new C0956Mi(this, arrayList, nativeAdapter), this.A09, new AnonymousClass38(A04.A04(), c06238t.A05(), this.A0D, c06238t.A05().A0C()), C1816ie.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0Q(new B6(this.A08, this.A0D, this.A06 != null ? new C0694Cf(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new C0668Aq(this.A08, null, null, null), AbstractC0700Cl.A01(C06419m.A0M(this.A08)), this.A02, null, new C2023m4()));
        } catch (C0661Ah e8) {
            AD4(C0660Ag.A02(e8));
        }
    }

    public final void A08(C3B c3b) {
        this.A00 = c3b;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void AD4(C0660Ag c0660Ag) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.AD4(c0660Ag);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final void AFG(C1803iR c1803iR) {
        C06238t A00 = c1803iR.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C2076mv> A04 = A04();
            if (this.A00 != null) {
                boolean isEmpty = A04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (isEmpty) {
                    this.A00.AD4(C0660Ag.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AED(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
