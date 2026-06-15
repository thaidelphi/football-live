package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.an;
import com.ironsource.cn;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import i8.w;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    /* renamed from: a  reason: collision with root package name */
    private String f18518a;

    /* renamed from: b  reason: collision with root package name */
    private Placement f18519b;

    /* renamed from: c  reason: collision with root package name */
    private LevelPlayNativeAdListener f18520c;

    /* renamed from: d  reason: collision with root package name */
    private an f18521d;

    /* renamed from: e  reason: collision with root package name */
    private AdapterNativeAdData f18522e;

    /* renamed from: f  reason: collision with root package name */
    private AdapterNativeAdViewBinder f18523f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f18524g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f18525a;

        /* renamed from: b  reason: collision with root package name */
        private LevelPlayNativeAdListener f18526b;

        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f18526b;
        }

        public final String getMPlacementName$mediationsdk_release() {
            return this.f18525a;
        }

        public final void setMListener$mediationsdk_release(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f18526b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(String str) {
            this.f18525a = str;
        }

        public final Builder withActivity(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog ironLog = IronLog.INTERNAL;
            StringBuilder sb = new StringBuilder();
            sb.append("activity is updated to: ");
            sb.append(activity != null ? activity.hashCode() : 0);
            ironLog.verbose(sb.toString());
            return this;
        }

        public final Builder withListener(LevelPlayNativeAdListener listener) {
            n.f(listener, "listener");
            this.f18526b = listener;
            return this;
        }

        public final Builder withPlacementName(String str) {
            this.f18525a = str;
            return this;
        }
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f18524g = new AtomicBoolean(false);
        this.f18518a = builder.getMPlacementName$mediationsdk_release();
        this.f18520c = builder.getMListener$mediationsdk_release();
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, h hVar) {
        this(builder);
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f18520c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0) {
        w wVar;
        n.f(this$0, "this$0");
        this$0.b();
        an anVar = this$0.f18521d;
        if (anVar != null) {
            anVar.a(this$0.f18519b);
            wVar = w.f26638a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this$0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        n.f(this$0, "this$0");
        n.f(adapterNativeAdData, "$adapterNativeAdData");
        n.f(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.f18522e = adapterNativeAdData;
        this$0.f18523f = nativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f18520c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdInfo adInfo) {
        n.f(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f18520c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, IronSourceError ironSourceError) {
        n.f(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f18520c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }

    private final void b() {
        if (this.f18524g.compareAndSet(false, true)) {
            an f10 = p.m().f();
            this.f18521d = f10;
            if (f10 != null) {
                f10.a(this);
                cn n10 = p.m().n(this.f18518a);
                n.e(n10, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f18519b = new Placement(n10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd this$0, AdInfo adInfo) {
        n.f(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f18520c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            an anVar = this.f18521d;
            if (anVar != null) {
                anVar.M();
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f18522e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f18522e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f18522e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f18522e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f18523f;
    }

    public final UUID getObjectId() {
        an anVar = this.f18521d;
        if (anVar != null) {
            return anVar.k();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f18522e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String initError = p.m().e();
        n.e(initError, "initError");
        if (!(initError.length() > 0)) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new Runnable() { // from class: k7.a
                @Override // java.lang.Runnable
                public final void run() {
                    LevelPlayNativeAd.a(LevelPlayNativeAd.this);
                }
            });
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f18520c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): " + initError, IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: k7.d
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(LevelPlayNativeAd.this, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: k7.c
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.b(LevelPlayNativeAd.this, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(final IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: k7.e
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(LevelPlayNativeAd.this, ironSourceError);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(final AdInfo adInfo, final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder nativeAdViewBinder) {
        n.f(adapterNativeAdData, "adapterNativeAdData");
        n.f(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: k7.b
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(LevelPlayNativeAd.this, adapterNativeAdData, nativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f18520c = levelPlayNativeAdListener;
    }
}
