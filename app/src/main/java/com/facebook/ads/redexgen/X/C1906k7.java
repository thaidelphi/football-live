package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.k7  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1906k7 extends BY {
    public static byte[] A02;
    public final /* synthetic */ C1905k6 A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{14, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C1906k7(C1905k6 c1905k6, AtomicBoolean atomicBoolean) {
        this.A00 = c1905k6;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AnonymousClass85 anonymousClass85;
        long j10;
        AnonymousClass85 anonymousClass852;
        long j11;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(AE.A0H);
                anonymousClass852 = this.A00.A02.A04;
                C05917m c05917m = this.A00.A01;
                int i10 = C06017w.A00;
                j11 = this.A00.A02.A00;
                C06017w.A02(anonymousClass852, c05917m, i10, A01(11, 14, 1), j11);
                this.A00.A02.A0T();
                this.A00.A00.ACj();
                return;
            }
            this.A00.A02.A0I(AE.A0G);
            anonymousClass85 = this.A00.A02.A04;
            C05917m c05917m2 = this.A00.A01;
            int i11 = C06017w.A04;
            j10 = this.A00.A02.A00;
            C06017w.A02(anonymousClass85, c05917m2, i11, A01(0, 11, 125), j10);
            this.A00.A02.A0U();
            this.A00.A00.ACa();
        }
    }
}
