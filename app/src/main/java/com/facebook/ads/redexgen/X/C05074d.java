package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
/* renamed from: com.facebook.ads.redexgen.X.4d  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05074d implements PW {
    public static byte[] A03;
    public static String[] A04 = {"pEHJeEej7oDaKOrGwfFZ6VbJw4w8c3Yk", "EhtWM9B8QuhGIQg2ZWGmGNDhU3aFqzox", "mhwpLCRFCroGq8K4tvVQzBCj1P3CmMBJ", "pEQCkIZmE2eSZvV5JfWZR4fjdXdwA9oi", "WnFn4ajPEqOmDfjs1HajDVdIxctVAVnd", "5nNVj9aLY0YTYH6Tt7sjSNJW9d9HcliU", "tlYrgkszxPV53fTcXLWVikDBelclLvHJ", "NugMlTmX3mpNRVzI0BiZYBq"};
    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;
    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;
    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<C1572eb> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.ep
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C05074d.A00((C1572eb) obj, (C1572eb) obj2);
        }
    });

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-60, -43, -56, -62, -45, -94, -64, -62, -57, -60};
    }

    static {
        A02();
    }

    public C05074d(long j10) {
        this.A01 = j10;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(C1572eb c1572eb, C1572eb c1572eb2) {
        if (c1572eb.A00 - c1572eb2.A00 != 0) {
            return c1572eb.A00 < c1572eb2.A00 ? -1 : 1;
        }
        int compareTo = c1572eb.compareTo(c1572eb2);
        if (A04[0].charAt(13) != 'P') {
            A04[7] = "zLYrGgGuyzqSn9ZsZy5YNqU";
            return compareTo;
        }
        throw new RuntimeException();
    }

    private void A03(InterfaceC1562eR interfaceC1562eR, long j10) {
        AbstractC1663g5.A02(A01(0, 10, 50));
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            interfaceC1562eR.AHb(this.A02.first());
        }
        AbstractC1663g5.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eQ
    public final void AFB(InterfaceC1562eR interfaceC1562eR, C1572eb c1572eb) {
        this.A02.add(c1572eb);
        this.A00 += c1572eb.A01;
        A03(interfaceC1562eR, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eQ
    public final void AFC(InterfaceC1562eR interfaceC1562eR, C1572eb c1572eb) {
        this.A02.remove(c1572eb);
        this.A00 -= c1572eb.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eQ
    public final void AFD(InterfaceC1562eR interfaceC1562eR, C1572eb c1572eb, C1572eb c1572eb2) {
        AFC(interfaceC1562eR, c1572eb);
        AFB(interfaceC1562eR, c1572eb2);
    }

    @Override // com.facebook.ads.redexgen.X.PW
    public final void AFE(InterfaceC1562eR interfaceC1562eR, String str, long j10, long j11) {
        if (j11 != -1) {
            A03(interfaceC1562eR, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PW
    public final boolean AHp() {
        return true;
    }
}
