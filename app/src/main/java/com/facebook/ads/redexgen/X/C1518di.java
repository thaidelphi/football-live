package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.di  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1518di extends BY {
    public static byte[] A01;
    public static String[] A02 = {"zQTxaAZtyj5Zf7xpyBa5Wo13", "ZyRPoqiC9PInhvt4VYdLIOd5Fjjwld3Q", "AJVcAlxtfo1o3uDwHkILc2qtWBcw5I", "qm4l90vWWtQXhhB5Cv7", "msnWA3qGYryppWjZvi7PZr4M3Bb415RH", "kQT0oRvSr6py", "zmROIVOKOovaIXaapuTgFe6PU", "TFR8Ke0ijybG7ZAZ7LbnVmkovmXx0N"};
    public final /* synthetic */ C0906Kj A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 22);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-116, -97, -102, -101, -91, 86, -92, -101, -84, -101, -88, 86, -87, -86, -105, -88, -86, -101, -102, 86, -90, -94, -105, -81, -97, -92, -99};
    }

    static {
        A04();
    }

    public C1518di(C0906Kj c0906Kj) {
        this.A00 = c0906Kj;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        z10 = this.A00.A0F;
        if (!z10) {
            C0906Kj c0906Kj = this.A00;
            if (A02[1].charAt(3) != 'P') {
                throw new RuntimeException();
            }
            A02[3] = "tIcfuB5su4wQORzkX2J";
            c0906Kj.A0Q(A01(0, 27, 32));
        }
    }
}
