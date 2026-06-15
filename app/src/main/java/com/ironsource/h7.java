package com.ironsource;

import com.ironsource.mediationsdk.model.BasePlacement;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class h7 extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(int i10, String placementName, boolean z10, lp lpVar) {
        super(i10, placementName, z10, lpVar);
        kotlin.jvm.internal.n.f(placementName, "placementName");
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", placementId: " + getPlacementId();
    }
}
