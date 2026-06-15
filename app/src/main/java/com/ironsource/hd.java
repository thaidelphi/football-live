package com.ironsource;

import android.app.Activity;
import com.ironsource.j1;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class hd implements od {

    /* renamed from: a  reason: collision with root package name */
    private final gl f17671a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17672b;

    /* renamed from: c  reason: collision with root package name */
    private final LevelPlayAdInfo f17673c;

    /* renamed from: d  reason: collision with root package name */
    private final fi f17674d;

    public hd(gl adInternal, boolean z10) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        this.f17671a = adInternal;
        this.f17672b = z10;
        String uuid = adInternal.e().toString();
        kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
        this.f17673c = new LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
        this.f17674d = adInternal.k().o();
    }

    public /* synthetic */ hd(gl glVar, boolean z10, int i10, kotlin.jvm.internal.h hVar) {
        this(glVar, (i10 & 2) != 0 ? false : z10);
    }

    private final dd d() {
        dd c10 = this.f17671a.c();
        if (c10 == null) {
            f1 f1Var = new f1(com.unity3d.mediation.a.a(this.f17671a.d()), this.f17671a.e(), this.f17671a.h(), null, this.f17674d.a(), 8, null);
            this.f17671a.f().e().a(new c2(this.f17671a.f(), f1Var, this.f17671a.f().b(this.f17671a.d(), this.f17671a.h()).b().b()));
            ed i10 = this.f17671a.i();
            gl glVar = this.f17671a;
            return i10.a(glVar, glVar.f(), f1Var, this.f17671a.g());
        }
        return c10;
    }

    private final boolean e() {
        if (this.f17671a.h().length() == 0) {
            gl glVar = this.f17671a;
            String uuid = this.f17671a.e().toString();
            kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
            glVar.onAdLoadFailed(new LevelPlayAdError(uuid, this.f17671a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        } else if (!this.f17671a.f().g()) {
            gl glVar2 = this.f17671a;
            String uuid2 = this.f17671a.e().toString();
            kotlin.jvm.internal.n.e(uuid2, "adInternal.adId.toString()");
            glVar2.onAdLoadFailed(new LevelPlayAdError(uuid2, this.f17671a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"));
            return false;
        } else {
            el a10 = this.f17671a.k().t().a();
            if (a10 != null && a10.a(this.f17671a.h(), this.f17671a.d())) {
                return true;
            }
            gl glVar3 = this.f17671a;
            String uuid3 = this.f17671a.e().toString();
            kotlin.jvm.internal.n.e(uuid3, "adInternal.adId.toString()");
            glVar3.b(new LevelPlayAdError(uuid3, this.f17671a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
            return false;
        }
    }

    @Override // com.ironsource.od
    public /* synthetic */ void a() {
        xz.a(this);
    }

    @Override // com.ironsource.od
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        String str2 = this.f17672b ? "Show called on expired ad" : "Show called before load success";
        String uuid = this.f17671a.e().toString();
        kotlin.jvm.internal.n.e(uuid, "adInternal.adId.toString()");
        this.f17671a.a(new LevelPlayAdError(uuid, this.f17671a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2));
    }

    @Override // com.ironsource.od
    public LevelPlayAdInfo b() {
        return this.f17673c;
    }

    @Override // com.ironsource.od
    public j1 c() {
        return new j1.a(this.f17672b ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.od
    public void loadAd() {
        if (e()) {
            this.f17671a.a(d());
            this.f17671a.n();
        }
    }

    @Override // com.ironsource.od
    public /* synthetic */ void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        xz.b(this, levelPlayAdInfo);
    }
}
