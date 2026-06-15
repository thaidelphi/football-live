package com.ironsource;

import com.ironsource.eg;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class hq implements eg, eg.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, LevelPlayReward> f17727a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, LevelPlayReward> f17728b = new LinkedHashMap();

    private final LevelPlayReward a(String str) {
        return this.f17728b.get(str);
    }

    private final LevelPlayReward b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f17727a.get(str);
    }

    @Override // com.ironsource.eg
    public LevelPlayReward a(String str, String adUnitId) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        LevelPlayReward b10 = b(str);
        return b10 == null ? a(adUnitId) : b10;
    }

    @Override // com.ironsource.eg.a
    public void a(String placement, String rewardName, int i10) {
        kotlin.jvm.internal.n.f(placement, "placement");
        kotlin.jvm.internal.n.f(rewardName, "rewardName");
        this.f17727a.put(placement, new LevelPlayReward(rewardName, i10));
    }

    @Override // com.ironsource.eg.a
    public void b(String adUnitId, String rewardName, int i10) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(rewardName, "rewardName");
        this.f17728b.put(adUnitId, new LevelPlayReward(rewardName, i10));
    }
}
