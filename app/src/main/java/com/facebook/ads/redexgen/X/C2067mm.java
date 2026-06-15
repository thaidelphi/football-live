package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.mm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2067mm extends AnonymousClass25 {
    public static byte[] A06;
    public static final String A07;
    public C2069mo A00;
    public EnumC0662Aj A01;
    public boolean A02;
    public final C1900k1 A03;
    public final A7 A04;
    public final F1 A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C2067mm.class.getSimpleName();
    }

    public C2067mm(C1900k1 c1900k1, A7 a72, F1 f12, JL jl, AnonymousClass26 anonymousClass26, EnumC0662Aj enumC0662Aj) {
        super(c1900k1, anonymousClass26, jl);
        this.A04 = a72;
        this.A05 = f12;
        this.A03 = c1900k1;
        this.A01 = enumC0662Aj;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass25
    public final void A08(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7E())) {
            this.A03.A0F().A3B();
            AbstractC04783a.A02(this.A00.A05(), AbstractC0693Ce.A00(A04(0, 6, 50)));
            this.A04.AB0(this.A00.A7E(), map);
            if (C06419m.A18(this.A03)) {
                if (this.A01 == EnumC0662Aj.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                C0677Bh A00 = C0677Bh.A00(this.A03);
                String placementType = this.A00.A7E();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC0712Cx.A00(new C2068mn(this));
            }
        }
    }

    public final void A0A(C2069mo c2069mo) {
        this.A00 = c2069mo;
    }
}
