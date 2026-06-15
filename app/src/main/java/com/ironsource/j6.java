package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j6 extends f1 {

    /* renamed from: f  reason: collision with root package name */
    private final LevelPlayAdSize f17935f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f17936g;

    /* renamed from: h  reason: collision with root package name */
    private final Long f17937h;

    public j6() {
        this(lf.f18190a.a(), "", null, null, null, null, null, 124, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(UUID adId, String adUnitId, Placement placement, LevelPlayAdSize adSize, Boolean bool, Long l10, eu euVar) {
        super(IronSource.AD_UNIT.BANNER, adId, adUnitId, placement, euVar);
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adSize, "adSize");
        this.f17935f = adSize;
        this.f17936g = bool;
        this.f17937h = l10;
    }

    public /* synthetic */ j6(UUID uuid, String str, Placement placement, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l10, eu euVar, int i10, kotlin.jvm.internal.h hVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : placement, (i10 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : euVar);
    }

    public final LevelPlayAdSize g() {
        return this.f17935f;
    }

    public final Boolean h() {
        return this.f17936g;
    }

    public final Long i() {
        return this.f17937h;
    }
}
