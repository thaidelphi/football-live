package com.ironsource;

import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ko implements jo {

    /* renamed from: a  reason: collision with root package name */
    private a6 f18103a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<c6> f18104b = new WeakReference<>(null);

    public final void a(a6 loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        this.f18103a = loadListener;
    }

    public final void a(c6 showListener) {
        kotlin.jvm.internal.n.f(showListener, "showListener");
        this.f18104b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.jo
    public void onBannerClick() {
        c6 c6Var = this.f18104b.get();
        if (c6Var != null) {
            c6Var.onBannerClick();
        }
    }

    @Override // com.ironsource.jo
    public void onBannerInitFailed(String str) {
    }

    @Override // com.ironsource.jo
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.jo
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        a6 a6Var = this.f18103a;
        if (a6Var != null) {
            a6Var.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.jo
    public void onBannerLoadSuccess(rj adInstance, vg adContainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adContainer, "adContainer");
        a6 a6Var = this.f18103a;
        if (a6Var != null) {
            a6Var.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.jo
    public void onBannerShowSuccess() {
        c6 c6Var = this.f18104b.get();
        if (c6Var != null) {
            c6Var.onBannerShowSuccess();
        }
    }
}
