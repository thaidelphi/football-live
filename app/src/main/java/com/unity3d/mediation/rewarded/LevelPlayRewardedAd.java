package com.unity3d.mediation.rewarded;

import android.app.Activity;
import com.ironsource.e2;
import com.ironsource.ed;
import com.ironsource.gl;
import com.ironsource.lf;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mm;
import com.ironsource.o1;
import com.ironsource.q9;
import com.ironsource.sl;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayRewardedAd {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f23795a;

    /* renamed from: b  reason: collision with root package name */
    private final sl f23796b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final boolean isPlacementCapped(String placementName) {
            n.f(placementName, "placementName");
            return gl.f17578m.a(placementName, LevelPlay.AdFormat.REWARDED);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId) {
        this(adUnitId, new gl.b(new o1(IronSource.AD_UNIT.REWARDED_VIDEO, e2.b.MEDIATION), new ed(), mm.f19249r.d(), new q9.a(), lf.f18190a));
        n.f(adUnitId, "adUnitId");
    }

    public LevelPlayRewardedAd(String adUnitId, gl.b payload) {
        n.f(adUnitId, "adUnitId");
        n.f(payload, "payload");
        this.f23795a = adUnitId;
        this.f23796b = new sl(adUnitId, payload.b(), payload.a(), payload.e(), payload.c(), payload.d());
    }

    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayRewardedAd levelPlayRewardedAd, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        levelPlayRewardedAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.f23796b.a();
    }

    public final String getAdUnitId() {
        return this.f23795a;
    }

    public final boolean isAdReady() {
        return this.f23796b.b();
    }

    public final void loadAd() {
        this.f23796b.c();
    }

    public final void setListener(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.f23796b.a(levelPlayRewardedAdListener);
    }

    public final void showAd(Activity activity) {
        n.f(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    public final void showAd(Activity activity, String str) {
        n.f(activity, "activity");
        this.f23796b.a(activity, str);
    }
}
