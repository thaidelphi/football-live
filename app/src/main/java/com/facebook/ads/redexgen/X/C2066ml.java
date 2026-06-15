package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.ml  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2066ml extends AnonymousClass25 {
    public static byte[] A02;
    public final C2063mi A00;
    public final A7 A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C2066ml(C1900k1 c1900k1, AnonymousClass26 anonymousClass26, JL jl, A7 a72, C2063mi c2063mi) {
        super(c1900k1, anonymousClass26, jl);
        this.A01 = a72;
        this.A00 = c2063mi;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass25
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7E())) {
            this.A02.A0F().A3B();
            AbstractC04783a.A02(this.A00.A0X(), AbstractC0693Ce.A00(A01(0, 6, 62)));
            this.A01.AB0(this.A00.A7E(), map);
            if (C06419m.A18(this.A02)) {
                String adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C0677Bh A00 = C0677Bh.A00(this.A02);
                String placementType = this.A00.A7E();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }
}
