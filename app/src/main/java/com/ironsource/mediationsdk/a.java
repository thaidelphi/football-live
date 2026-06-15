package com.ironsource.mediationsdk;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mk;
import com.ironsource.y7;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a<Listener extends AdapterAdListener> extends BaseAdAdapter<u, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, y7 {

    /* renamed from: a  reason: collision with root package name */
    protected AbstractAdapter f18510a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Listener> f18511b;

    public a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        super(ad_unit, networkSettings, uuid);
        this.f18511b = new WeakReference<>(null);
        this.f18510a = abstractAdapter;
    }

    public static a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return new z(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return new o(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return new j(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return new t(abstractAdapter, networkSettings, uuid);
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error("ad unit not supported - " + ad_unit);
        return null;
    }

    private void a(AdData adData, Listener listener) {
        this.f18511b = new WeakReference<>(listener);
        a(mk.a(adData.getConfiguration()), mk.a(adData.getAdUnitData()), adData);
    }

    private void b(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error(a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        return a((String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str) {
        String ad_unit = b().toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return ad_unit + " - " + str;
    }

    @Override // com.ironsource.y7
    public Map<String, Object> a(AdData adData) {
        JSONObject a10 = mk.a(adData.getConfiguration());
        JSONObject a11 = mk.a(adData.getAdUnitData());
        IronSource.AD_UNIT ad_unit = (IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f18510a.getRewardedVideoBiddingData(a10, a11);
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f18510a.getInterstitialBiddingData(a10, a11);
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f18510a.getBannerBiddingData(a10, a11);
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return this.f18510a.getNativeAdBiddingData(a10, a11);
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error("ad unit not supported - " + ad_unit);
        return null;
    }

    @Override // com.ironsource.y7
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        JSONObject a10 = mk.a(adData.getConfiguration());
        JSONObject a11 = mk.a(adData.getAdUnitData());
        IronSource.AD_UNIT ad_unit = (IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f18510a.collectRewardedVideoBiddingData(a10, a11, biddingDataCallback);
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f18510a.collectInterstitialBiddingData(a10, a11, biddingDataCallback);
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f18510a.collectBannerBiddingData(a10, a11, biddingDataCallback);
        } else if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            this.f18510a.collectNativeAdBiddingData(a10, a11, biddingDataCallback);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("ad unit not supported - " + ad_unit);
        }
    }

    protected void a(JSONObject jSONObject) {
        b("destroyAd");
    }

    protected abstract void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    protected abstract IronSource.AD_UNIT b();

    protected void b(JSONObject jSONObject) {
        b("disposeAd");
    }

    protected boolean c(JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    public void d(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(AdData adData) {
        a(mk.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void disposeAd(AdData adData) {
        b(mk.a(adData.getConfiguration()));
    }

    public void e(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    protected void f(JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return c(mk.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        a(adData, (AdData) listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(AdData adData, Activity activity, Listener listener) {
        a(adData, (AdData) listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(AdData adData) {
        d(mk.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(AdData adData) {
        e(mk.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public void releaseMemory() {
        IronLog.INTERNAL.verbose(a());
        AbstractAdapter abstractAdapter = this.f18510a;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(b(), new JSONObject());
            this.f18510a = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Listener listener) {
        this.f18511b = new WeakReference<>(listener);
        f(mk.a(adData.getConfiguration()));
    }
}
