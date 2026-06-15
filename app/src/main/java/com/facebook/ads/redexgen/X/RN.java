package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RN {
    public static byte[] A02;
    public static String[] A03 = {"1US6jaMoLfGpUdFO5rmDhf8munMUTyyz", "AzwI5NnaLsYDkqk6vxyc9X5ibAo0j", "bfG8XRn5J4pxnZSTuSdJkmLDCGbun", "LGZKMOIwxUGb9Sa7WaeOQBxAqlkUXRPJ", "XIuy9XHvCvNpm8zIV9Uh3cYy8m4OrBcf", "c9D7XteEnB8TAAjE3iP2V", "fGg6yWitVF0MkDupRdkubu1xmLHdltJo", "145wIaprs64LJ0mAZomk5qtDjlaPGJU6"};
    public static final RN A04;
    public static final RN A05;
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Prevent throwing when building the map")
    public static final AbstractC2005lm<Integer, Integer> A06;
    public final int A00;
    public final int[] A01;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-61, -73, 10, 12, 7, 7, 6, 9, 11, -4, -5, -36, 5, -6, 6, -5, 0, 5, -2, 10, -44, -17, 27, 15, 40, 29, 28, -69, -17, -34, -29, -23, -67, -37, -22, -37, -36, -29, -26, -29, -18, -29, -33, -19, -43, -25, -37, -14, -67, -30, -37, -24, -24, -33, -26, -67, -23, -17, -24, -18, -73, -53, -36, -44, -30, -32, -36, -38, 20, 33, 23, 37, 34, 28, 23, -31, 32, 24, 23, 28, 20, -31, 20, 22, 39, 28, 34, 33, -31, -5, -9, 0, -4, 18, -12, 8, -9, -4, 2, 18, 3, -1, 8, -6, 33, 46, 36, 50, 47, 41, 36, -18, 45, 37, 36, 41, 33, -18, 37, 56, 52, 50, 33, -18, 1, 21, 4, 9, 15, 31, 16, 12, 21, 7, 31, 19, 20, 1, 20, 5, -46, -33, -43, -29, -32, -38, -43, -97, -34, -42, -43, -38, -46, -97, -42, -23, -27, -29, -46, -97, -74, -65, -76, -64, -75, -70, -65, -72, -60, -25, -12, -22, -8, -11, -17, -22, -76, -13, -21, -22, -17, -25, -76, -21, -2, -6, -8, -25, -76, -45, -57, -34, -27, -55, -50, -57, -44, -44, -53, -46, -27, -55, -43, -37, -44, -38, -12, 7, 3, -12, 1, -3, -16, -5, -18, 2, 4, 1, 1, -2, 4, -3, -13, -18, 2, -2, 4, -3, -13, -18, -12, -3, -16, -15, -5, -12, -13, 26, 41, 27, 41};
    }

    static {
        A06();
        A04 = new RN(new int[]{2}, 8);
        A05 = new RN(new int[]{2, 5, 6}, 8);
        A06 = new C2003lk().A05(5, 6).A05(17, 6).A05(7, 6).A05(18, 6).A05(6, 8).A05(8, 8).A05(14, 8).A07();
    }

    public RN(int[] iArr, int i10) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i10;
    }

    public static int A00(int i10) {
        if (AbstractC1672gE.A02 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        int i11 = AbstractC1672gE.A02;
        if (A03[7].charAt(31) == '6') {
            A03[3] = "PjNVoBzctyN0TP5o6Ocm4zn0aB65285e";
            if (i11 <= 26 && A05(237, 4, 84).equals(AbstractC1672gE.A03) && i10 == 1) {
                i10 = 2;
            }
            int A01 = AbstractC1672gE.A01(i10);
            if (A03[4].charAt(9) == 'v') {
                A03[6] = "O";
                return A01;
            }
        }
        throw new RuntimeException();
    }

    public static int A01(int i10, int i11) {
        if (AbstractC1672gE.A02 >= 29) {
            return RM.A00(i10, i11);
        }
        Integer num = (Integer) AbstractC1589es.A01(A06.getOrDefault(Integer.valueOf(i10), 0));
        if (A03[4].charAt(9) != 'v') {
            throw new RuntimeException();
        }
        A03[3] = "I3z5XyDQc75s0TeotCQipoKgEG1EPBKw";
        return num.intValue();
    }

    public static RN A02(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter(A05(68, 36, 83)));
        return A03(context, intent);
    }

    public static RN A03(Context context, Intent intent) {
        if (A07() && Settings.Global.getInt(context.getContentResolver(), A05(j3.c.b.f17916g, 31, 47), 0) == 1) {
            RN rn = A05;
            String[] strArr = A03;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A03[7] = "dk3tU0JE1Vng71STUEPysAijWx9OcFI6";
            return rn;
        } else if (AbstractC1672gE.A02 >= 29 && (AbstractC1672gE.A18(context) || AbstractC1672gE.A17(context))) {
            return new RN(RM.A01(), 8);
        } else {
            if (intent == null || intent.getIntExtra(A05(104, 36, 96), 0) == 0) {
                return A04;
            }
            return new RN(intent.getIntArrayExtra(A05(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 29, 17)), intent.getIntExtra(A05(169, 37, 38), 8));
        }
    }

    public static boolean A07() {
        if (AbstractC1672gE.A02 >= 17) {
            if (A05(21, 6, 78).equals(AbstractC1672gE.A05) || A05(61, 6, 19).equals(AbstractC1672gE.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r3 == 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (A0A(8) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r3 == 8) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> A09(com.facebook.ads.redexgen.X.ZM r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.A0W
            java.lang.Object r1 = com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r8.A0R
            int r3 = com.facebook.ads.redexgen.X.Q2.A03(r1, r0)
            com.facebook.ads.redexgen.X.lm<java.lang.Integer, java.lang.Integer> r1 = com.facebook.ads.redexgen.X.RN.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.containsKey(r0)
            r6 = 0
            if (r0 != 0) goto L1c
            return r6
        L1c:
            r4 = 18
            if (r3 != r4) goto L42
            boolean r0 = r7.A0A(r4)
            if (r0 != 0) goto L42
            r3 = 6
        L27:
            boolean r5 = r7.A0A(r3)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.RN.A03
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 21
            if (r1 == r0) goto Lba
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RN.A03
            java.lang.String r1 = "DjCP"
            r0 = 6
            r2[r0] = r1
            if (r5 != 0) goto L6e
            return r6
        L42:
            r5 = 8
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.RN.A03
            r0 = 3
            r1 = r1[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            r0 = 121(0x79, float:1.7E-43)
            if (r1 == r0) goto L64
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RN.A03
            java.lang.String r1 = "wFhbJKy58v40Wk4KrqBPUxM5TkQcpYqq"
            r0 = 4
            r2[r0] = r1
            if (r3 != r5) goto L27
        L5c:
            boolean r0 = r7.A0A(r5)
            if (r0 != 0) goto L27
            r3 = 7
            goto L27
        L64:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RN.A03
            java.lang.String r1 = "OgOTkedCY92WT2lC7F95vgytrFI"
            r0 = 6
            r2[r0] = r1
            if (r3 != r5) goto L27
            goto L5c
        L6e:
            int r0 = r8.A06
            r1 = -1
            if (r0 == r1) goto L75
            if (r3 != r4) goto La0
        L75:
            int r0 = r8.A0G
            if (r0 == r1) goto L9c
            int r0 = r8.A0G
        L7b:
            int r1 = A01(r3, r0)
        L7f:
            int r4 = A00(r1)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.RN.A03
            r0 = 3
            r1 = r1[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            r0 = 121(0x79, float:1.7E-43)
            if (r1 == r0) goto Lb4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RN.A03
            java.lang.String r1 = "Fa5CSkaQAVHEu7AwmMZt6eZBU8hEd6h6"
            r0 = 7
            r2[r0] = r1
            if (r4 != 0) goto La7
            return r6
        L9c:
            r0 = 48000(0xbb80, float:6.7262E-41)
            goto L7b
        La0:
            int r1 = r8.A06
            int r0 = r7.A00
            if (r1 <= r0) goto L7f
            return r6
        La7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        Lb4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lba:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RN.A09(com.facebook.ads.redexgen.X.ZM):android.util.Pair");
    }

    public final boolean A0A(int i10) {
        return Arrays.binarySearch(this.A01, i10) >= 0;
    }

    public final boolean A0B(ZM zm) {
        return A09(zm) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RN) {
            RN rn = (RN) obj;
            return Arrays.equals(this.A01, rn.A01) && this.A00 == rn.A00;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A05(27, 34, 26) + this.A00 + A05(0, 21, 55) + Arrays.toString(this.A01) + A05(67, 1, 29);
    }
}
