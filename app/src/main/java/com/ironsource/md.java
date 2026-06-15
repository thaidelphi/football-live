package com.ironsource;

import android.app.Activity;
import com.ironsource.j1;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class md implements od {

    /* renamed from: a  reason: collision with root package name */
    private final gl f18473a;

    /* renamed from: b  reason: collision with root package name */
    private final LevelPlayAdInfo f18474b;

    public md(gl adInternal) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        this.f18473a = adInternal;
        String uuid = adInternal.e().toString();
        kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
        this.f18474b = new LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.od
    public /* synthetic */ void a() {
        xz.a(this);
    }

    @Override // com.ironsource.od
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        String uuid = this.f18473a.e().toString();
        kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
        this.f18473a.b(new LevelPlayAdError(uuid, this.f18473a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f18474b);
    }

    @Override // com.ironsource.od
    public LevelPlayAdInfo b() {
        return this.f18474b;
    }

    @Override // com.ironsource.od
    public j1 c() {
        return new j1.a("Ad is loading");
    }

    @Override // com.ironsource.od
    public void loadAd() {
        String uuid = this.f18473a.e().toString();
        kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
        this.f18473a.b(new LevelPlayAdError(uuid, this.f18473a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"));
    }

    @Override // com.ironsource.od
    public /* synthetic */ void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        xz.b(this, levelPlayAdInfo);
    }
}
