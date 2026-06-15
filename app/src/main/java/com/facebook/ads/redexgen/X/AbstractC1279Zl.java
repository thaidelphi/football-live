package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
/* renamed from: com.facebook.ads.redexgen.X.Zl  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1279Zl implements QQ {
    public static String[] A01 = {"", "", "iCliAypVoqzC0fx0BJXwi", "cFtA", "ks94OJZY24YP0W", "zWHYKq", "smr4D72sS6PujANkMfaeYcGk", "ag4eND"};
    public final C1248Yf A00 = new C1248Yf();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i10, long j10);

    public final int A00() {
        long A6x = A6x();
        long A7i = A7i();
        if (A6x == -9223372036854775807L || A7i == -9223372036854775807L) {
            return 0;
        }
        if (A7i == 0) {
            return 100;
        }
        long j10 = 100 * A6x;
        if (A01[3].length() != 4) {
            throw new RuntimeException();
        }
        A01[4] = "KOrcxd9hxYrcdf";
        return AbstractC1672gE.A07((int) (j10 / A7i), 0, 100);
    }

    public void A01() {
        AJL(false);
    }

    public final void A02() {
        A03(A7X());
    }

    public final void A03(int i10) {
        A0H(i10, -9223372036854775807L);
    }

    public final void A04(long j10) {
        A0H(A7X(), j10);
    }
}
