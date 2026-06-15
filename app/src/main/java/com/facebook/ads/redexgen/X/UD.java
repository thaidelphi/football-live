package com.facebook.ads.redexgen.X;

import com.google.android.gms.ads.AdSize;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class UD {
    public static byte[] A04;
    public static String[] A05 = {"Jhtx178IMq23kUOoozNXaD96RNDNMeq9", "NXhQPuYygPgm13XpxQ6AVC", "XbCWuI93AbcXpCtq0Lv1ECs2MHmDiQGb", "aRhX3Yl5xHIR8cXYecvLqc0GN0gWfEUM", "JHpIfdiDfTmDtpI00YF6gvRZqtNWaTR9", "DSplChZ5H8QsGzGk5GdQZeMEULlwRRZg", "aSNduxc9zJN0oIXdD27ucq", "ha0k4MwTTu0lAZTs7ugoKqlV19asfAad"};
    public U7 A00;
    public final int A01;
    public final C1198Wf A02;
    public final UC A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[4].charAt(6) == strArr[3].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "SInKRwdAdChGNPlHrJmpFI";
            strArr2[6] = "BMskWzHkRy94e6Jaaiv6Vn";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 104);
            i13++;
        }
    }

    public static void A05() {
        A04 = new byte[]{-48, -11, -3, -24, -13, -16, -21, -89, -22, -24, -6, -20};
    }

    static {
        A05();
    }

    public UD(U8 u82, UC uc, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.A03 = uc;
        this.A01 = i10;
        this.A02 = new C1198Wf(u82, j10, j11, j12, j13, j14, j15);
    }

    private final int A02(WJ wj, long j10, C1152Ug c1152Ug) {
        if (j10 == wj.A8d()) {
            return 0;
        }
        c1152Ug.A00 = j10;
        return 1;
    }

    private final U7 A03(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long A052 = this.A02.A05(j10);
        j11 = this.A02.A05;
        j12 = this.A02.A02;
        j13 = this.A02.A04;
        j14 = this.A02.A01;
        j15 = this.A02.A00;
        return new U7(j10, A052, j11, j12, j13, j14, j15);
    }

    private final void A06(boolean z10, long j10) {
        this.A00 = null;
        this.A03.AF2();
    }

    private final boolean A07(WJ wj, long j10) throws IOException {
        long A8d = j10 - wj.A8d();
        if (A8d >= 0 && A8d <= 262144) {
            wj.AJ9((int) A8d);
            return true;
        }
        return false;
    }

    public final int A08(WJ wj, C1152Ug c1152Ug) throws IOException {
        long A01;
        long A00;
        long A02;
        long A042;
        int i10;
        long j10;
        long j11;
        long j12;
        long floorPosition;
        long j13;
        long j14;
        long j15;
        while (true) {
            U7 u72 = (U7) AbstractC1589es.A02(this.A00);
            A01 = u72.A01();
            A00 = u72.A00();
            A02 = u72.A02();
            if (A00 - A01 <= this.A01) {
                A06(false, A01);
                return A02(wj, A01, c1152Ug);
            } else if (!A07(wj, A02)) {
                return A02(wj, A02, c1152Ug);
            } else {
                wj.AHr();
                UC uc = this.A03;
                A042 = u72.A04();
                UA AI2 = uc.AI2(wj, A042);
                i10 = AI2.A00;
                switch (i10) {
                    case -3:
                        A06(false, A02);
                        return A02(wj, A02, c1152Ug);
                    case AdSize.AUTO_HEIGHT /* -2 */:
                        j14 = AI2.A02;
                        j15 = AI2.A01;
                        u72.A0D(j14, j15);
                        break;
                    case -1:
                        j10 = AI2.A02;
                        j11 = AI2.A01;
                        u72.A0C(j10, j11);
                        break;
                    case 0:
                        j12 = AI2.A01;
                        A07(wj, j12);
                        floorPosition = AI2.A01;
                        A06(true, floorPosition);
                        j13 = AI2.A01;
                        return A02(wj, j13, c1152Ug);
                    default:
                        throw new IllegalStateException(A04(0, 12, 31));
                }
            }
        }
    }

    public final C1198Wf A09() {
        return this.A02;
    }

    public final void A0A(long j10) {
        long A03;
        if (this.A00 != null) {
            A03 = this.A00.A03();
            if (A03 == j10) {
                return;
            }
        }
        this.A00 = A03(j10);
    }

    public final boolean A0B() {
        return this.A00 != null;
    }
}
