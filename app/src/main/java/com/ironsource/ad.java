package com.ironsource;

import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ad implements lo {

    /* renamed from: a  reason: collision with root package name */
    private bd f16317a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<cd> f16318b = new WeakReference<>(null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16319a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final String f16320b = "impressions";

        private a() {
        }
    }

    public final void a(bd loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        this.f16317a = loadListener;
    }

    public final void a(cd showListener) {
        kotlin.jvm.internal.n.f(showListener, "showListener");
        this.f16318b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.lo
    public void onInterstitialAdRewarded(String str, int i10) {
        cd cdVar = this.f16318b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidReward(str, i10);
        }
    }

    @Override // com.ironsource.lo
    public void onInterstitialClick() {
        cd cdVar = this.f16318b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.lo
    public void onInterstitialClose() {
        cd cdVar = this.f16318b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.lo
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        cd cdVar;
        if (!kotlin.jvm.internal.n.a(str, "impressions") || (cdVar = this.f16318b.get()) == null) {
            return;
        }
        cdVar.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.lo
    public void onInterstitialInitFailed(String str) {
    }

    @Override // com.ironsource.lo
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.lo
    public void onInterstitialLoadFailed(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        bd bdVar = this.f16317a;
        if (bdVar != null) {
            bdVar.a(description);
        }
    }

    @Override // com.ironsource.lo
    public void onInterstitialLoadSuccess(rj adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        bd bdVar = this.f16317a;
        if (bdVar != null) {
            bdVar.a(adInstance);
        }
    }

    @Override // com.ironsource.lo
    public void onInterstitialOpen() {
        cd cdVar = this.f16318b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.lo
    public void onInterstitialShowFailed(String str) {
        cd cdVar = this.f16318b.get();
        if (cdVar != null) {
            cdVar.a(str);
        }
    }

    @Override // com.ironsource.lo
    public void onInterstitialShowSuccess() {
    }
}
