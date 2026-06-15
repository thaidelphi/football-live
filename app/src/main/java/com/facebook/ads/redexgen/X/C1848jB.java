package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.jB  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1848jB implements AJ {
    public static byte[] A04;
    public static String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final String A06;
    public View$OnAttachStateChangeListenerC1849jC A00;
    public C2166oc<C06489t, C06539y> A01;
    public final C1899k0 A02;
    public final C0981Nj A03 = C0981Nj.A01();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[1].length() == 18) {
                throw new RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 121);
            i13++;
        }
    }

    public static void A02() {
        A04 = new byte[]{79, 115, 126, 59, 118, 126, Byte.MAX_VALUE, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, 53, 121, 66, 94, 73, 75, 69, 95, 88, 73, 94, 69, 66, 75, 12, 77, 12, 66, 89, 64, 64, 12, 79, 94, 73, 77, 88, 69, 90, 73, 12, 90, 69, 73, 91, 13, 83, 108, 96, 114, 117, 106, 108, 107, 113, 65, 100, 113, 100, 37, 108, 118, 37, 107, 112, 105, 105, 36, 25, 15, 9, 5, 4, 14, 53, 9, 2, 11, 4, 4, 15, 6};
    }

    static {
        A02();
        A06 = C1848jB.class.getSimpleName();
    }

    public C1848jB(C1899k0 c1899k0) {
        this.A02 = c1899k0;
    }

    private void A01() {
        this.A02.A08().AAu(A00(89, 14, 19), 3600, new C06058b(A00(67, 22, 124)));
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void ACq() {
        if (this.A01 != null) {
            this.A01.A07.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AFk() {
        if (this.A01 != null) {
            this.A01.A07.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AJZ(View view) {
        if (this.A01 == null) {
            this.A02.A08().AAu(A00(89, 14, 19), 3600, new C06058b(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AJs(View view, String str, boolean z10) {
        AJt(view, str, z10, false);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AJt(View view, String str, boolean z10, boolean z11) {
        AJu(view, str, z10, z11, false);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AJu(View view, String str, boolean z10, boolean z11, boolean z12) {
        if (view != null) {
            this.A00 = new View$OnAttachStateChangeListenerC1849jC(view);
            this.A03.A0A(this.A00, view);
            if (z11) {
                this.A00.A03();
            }
            this.A01 = C2166oc.A00(new C06489t(this.A02, view, str, z10, z12), new C06539y(), A06).A06(new C1850jD(new C1847jA())).A07();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A08().AAu(A00(89, 14, 19), 3600, new C06058b(A00(0, 32, 98)));
    }
}
