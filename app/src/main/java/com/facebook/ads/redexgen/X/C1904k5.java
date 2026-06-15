package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.k5  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1904k5 implements C1Y {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C1899k0 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1904k5(C1899k0 c1899k0) {
        this.A00 = c1899k0;
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void AAo(Throwable th) {
        this.A00.A08().AAu(A00(0, 5, 39), AbstractC06048a.A1e, new C06058b(th));
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void AAz(Throwable th) {
        this.A00.A08().AAu(A00(0, 5, 39), AbstractC06048a.A1g, new C06058b(th));
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void AGc(String str, int i10, String str2, Long l10, Long l11, C1J c1j) {
        C06017w.A05(this.A00, c1j.A06, c1j.A08, c1j.A09, c1j.A07, c1j.A03, i10, str2, l10, l11, null);
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void AGd(String str, boolean z10, C1J c1j) {
        C06017w.A04(this.A00, new C06007v(c1j.A06, c1j.A08, c1j.A07, c1j.A03, str), z10);
    }
}
