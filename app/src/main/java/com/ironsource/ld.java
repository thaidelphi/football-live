package com.ironsource;

import android.app.Activity;
import com.ironsource.j1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ld implements od {

    /* renamed from: a  reason: collision with root package name */
    private final gl f18183a;

    /* renamed from: b  reason: collision with root package name */
    private LevelPlayAdInfo f18184b;

    /* renamed from: c  reason: collision with root package name */
    private final q9 f18185c;

    /* renamed from: d  reason: collision with root package name */
    private final long f18186d;

    public ld(gl adInternal, LevelPlayAdInfo adInfo, q9 currentTimeProvider) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f18183a = adInternal;
        this.f18184b = adInfo;
        this.f18185c = currentTimeProvider;
        this.f18186d = currentTimeProvider.a();
    }

    private final long d() {
        return this.f18185c.a() - this.f18186d;
    }

    @Override // com.ironsource.od
    public void a() {
        gl glVar = this.f18183a;
        glVar.a(new hd(glVar, true));
    }

    @Override // com.ironsource.od
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        Placement a10 = this.f18183a.f().a(this.f18183a.d(), str);
        dd c10 = this.f18183a.c();
        if (c10 == null) {
            gl glVar = this.f18183a;
            String uuid = this.f18183a.e().toString();
            kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
            glVar.b(new LevelPlayAdError(uuid, this.f18183a.h(), IronSourceError.ERROR_IS_SHOW_EXCEPTION, "Internal Error, Illegal state"), this.f18184b);
            return;
        }
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f18184b, str);
        this.f18184b = levelPlayAdInfo;
        gl glVar2 = this.f18183a;
        glVar2.a(new nd(glVar2, levelPlayAdInfo));
        c10.a(activity, a10);
    }

    @Override // com.ironsource.od
    public LevelPlayAdInfo b() {
        return this.f18184b;
    }

    @Override // com.ironsource.od
    public j1 c() {
        l8 a10 = this.f18183a.k().u().a(this.f18183a.h());
        return a10.d() ? j1.a.f17886c.a(a10.e()) : j1.b.f17889a;
    }

    @Override // com.ironsource.od
    public void loadAd() {
        this.f18183a.f().e().h().a(Long.valueOf(d()));
        this.f18183a.a(this.f18184b);
    }

    @Override // com.ironsource.od
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f18184b = adInfo;
    }
}
