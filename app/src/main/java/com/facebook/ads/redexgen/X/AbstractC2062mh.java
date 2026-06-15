package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
/* renamed from: com.facebook.ads.redexgen.X.mh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2062mh implements AnonymousClass23 {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0H();

    public abstract C2S A0I();

    public abstract boolean A0J();

    public final void A00(int i10) {
        this.A00 = i10;
    }

    public final void A01(long j10) {
        this.A01 = j10;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final AdPlacementType A8a() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
