package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.mL  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2040mL implements C2B {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C0965Mt A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{90, 93, 91, 15, 10, 14, 13, 10, 32, 3, 12, 12, 7, 16, 66, 11, 15, 18, 16, 7, 17, 17, 11, 13, 12, 66, 4, 11, 16, 7, 6, 28, 29, 49, 18, 29, 29, 22, 1, 63, 28, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, 28, 29};
    }

    static {
        A01();
    }

    public C2040mL(C0965Mt c0965Mt, Runnable runnable) {
        this.A00 = c0965Mt;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.C2B
    public final void ACU(InterfaceC2090n9 interfaceC2090n9) {
        M5 m52;
        m52 = this.A00.A02;
        m52.A0F().A4Q();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C2B
    public final void ACV(InterfaceC2090n9 interfaceC2090n9, View view) {
        M5 m52;
        m52 = this.A00.A02;
        m52.A0F().A4P(interfaceC2090n9 == ((AbstractC2037mI) this.A00).A00);
        if (interfaceC2090n9 != ((AbstractC2037mI) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        AnonymousClass23 anonymousClass23 = ((AbstractC2037mI) this.A00).A01;
        C0965Mt c0965Mt = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC2037mI) c0965Mt).A01 = interfaceC2090n9;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC2090n9);
            return;
        }
        this.A00.A07.A0E(view);
        this.A00.A0Q(anonymousClass23);
    }

    @Override // com.facebook.ads.redexgen.X.C2B
    public final void ACW(InterfaceC2090n9 interfaceC2090n9) {
        M5 m52;
        AbstractC0669Au.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        m52 = this.A00.A02;
        m52.A0F().A4S();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.C2B
    public final void ADc(InterfaceC2090n9 interfaceC2090n9, C0660Ag c0660Ag) {
        M5 m52;
        m52 = this.A00.A02;
        m52.A0F().A4R(interfaceC2090n9 == ((AbstractC2037mI) this.A00).A00, c0660Ag.A03().getErrorCode());
        if (interfaceC2090n9 != ((AbstractC2037mI) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC2090n9);
        this.A00.AD4(c0660Ag);
    }
}
