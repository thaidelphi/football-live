package com.ironsource.mediationsdk.model;

import com.ironsource.lp;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Placement extends BasePlacement {

    /* renamed from: e  reason: collision with root package name */
    private String f18956e;

    /* renamed from: f  reason: collision with root package name */
    private int f18957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(int i10, String placementName, boolean z10, String rewardName, int i11, lp lpVar) {
        super(i10, placementName, z10, lpVar);
        n.f(placementName, "placementName");
        n.f(rewardName, "rewardName");
        this.f18957f = i11;
        this.f18956e = rewardName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(BasePlacement placement) {
        super(placement.getPlacementId(), placement.getPlacementName(), placement.isDefault(), placement.getPlacementAvailabilitySettings());
        n.f(placement, "placement");
        this.f18956e = "";
    }

    public final int getRewardAmount() {
        return this.f18957f;
    }

    public final String getRewardName() {
        return this.f18956e;
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", reward name: " + this.f18956e + " , amount: " + this.f18957f;
    }
}
