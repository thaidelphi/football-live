package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class dn extends f1 {
    public dn() {
        this(lf.f18190a.a(), "", null, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(UUID adId, String adUnitId, Placement placement) {
        super(IronSource.AD_UNIT.NATIVE_AD, adId, adUnitId, placement, null, 16, null);
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
    }

    public /* synthetic */ dn(UUID uuid, String str, Placement placement, int i10, kotlin.jvm.internal.h hVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : placement);
    }
}
