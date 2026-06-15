package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2;
/* renamed from: com.facebook.ads.redexgen.X.Ta  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1123Ta {
    public final EnumC1196Wd A00 = EnumC1196Wd.A03;

    private boolean A00() {
        return this.A00 == EnumC1196Wd.A04;
    }

    public final UK A01(int i10) {
        if (A00()) {
            return new FragmentedMp4Extractor2(i10);
        }
        return new C1127Te(i10);
    }
}
