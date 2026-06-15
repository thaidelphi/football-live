package com.ironsource;

import android.app.Activity;
import com.ironsource.j1;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class nd implements od {

    /* renamed from: a  reason: collision with root package name */
    private final gl f19402a;

    /* renamed from: b  reason: collision with root package name */
    private final LevelPlayAdInfo f19403b;

    public nd(gl adInternal, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f19402a = adInternal;
        this.f19403b = adInfo;
    }

    @Override // com.ironsource.od
    public /* synthetic */ void a() {
        xz.a(this);
    }

    @Override // com.ironsource.od
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        String uuid = this.f19402a.e().toString();
        kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
        this.f19402a.b(new LevelPlayAdError(uuid, this.f19402a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f19403b);
    }

    @Override // com.ironsource.od
    public LevelPlayAdInfo b() {
        return this.f19403b;
    }

    @Override // com.ironsource.od
    public j1 c() {
        return new j1.a("ad is showing");
    }

    @Override // com.ironsource.od
    public void loadAd() {
        String uuid = this.f19402a.e().toString();
        kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
        this.f19402a.b(new LevelPlayAdError(uuid, this.f19402a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"));
    }

    @Override // com.ironsource.od
    public /* synthetic */ void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        xz.b(this, levelPlayAdInfo);
    }
}
