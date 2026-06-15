package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.7i  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05877i {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C05887j A00;
    public final C05897k A01;
    public final C1899k0 A02;
    public final InterfaceC0887Jq A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C05877i.class.getSimpleName();
    }

    public C05877i(C1899k0 c1899k0, InterfaceC1308aF interfaceC1308aF, C05887j c05887j, C05897k c05897k) {
        this.A02 = c1899k0;
        this.A03 = interfaceC1308aF.A5K(EnumC0888Jr.A06);
        this.A00 = c05887j;
        this.A01 = c05897k;
        this.A03.A3r(new C1908k9(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (BQ.A02(this)) {
            return;
        }
        if (!this.A03.AAT()) {
            this.A02.A05().AAD();
            return;
        }
        String btExtras = this.A03.A7Y().optString(A00(0, 9, 7));
        if (!TextUtils.isEmpty(btExtras)) {
            this.A00.A04(this.A02, btExtras);
            if (!A04 || C06419m.A0i(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
