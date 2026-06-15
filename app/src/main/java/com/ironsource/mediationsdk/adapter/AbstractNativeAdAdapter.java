package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements NativeAdAdapterInterface {
    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectNativeAdBiddingData(JSONObject config, JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        n.f(config, "config");
        n.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(config, jSONObject);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyNativeAd(JSONObject config) {
        n.f(config, "config");
    }

    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject jSONObject) {
        n.f(config, "config");
        return null;
    }

    public final NativeAdProperties getNativeAdProperties(JSONObject config) {
        n.f(config, "config");
        return new NativeAdProperties(config);
    }

    public void initNativeAdForBidding(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    public void initNativeAds(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    public void loadNativeAd(JSONObject config, JSONObject jSONObject, NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    public void loadNativeAdForBidding(JSONObject config, JSONObject jSONObject, String str, NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }
}
