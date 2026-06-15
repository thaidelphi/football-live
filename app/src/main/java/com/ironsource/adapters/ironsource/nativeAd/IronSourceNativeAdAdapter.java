package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.o9;
import com.ironsource.ph;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private ph nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter adapter) {
        super(adapter);
        n.f(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        n.f(this$0, "this$0");
        n.f(config, "$config");
        n.f(listener, "$listener");
        try {
            ph a10 = ph.f19750j.a();
            a10.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(a10, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject prepareLoadParams = this$0.prepareLoadParams(config, str);
            n.e(activity, "activity");
            a10.a(activity, prepareLoadParams);
            this$0.nativeAd = a10;
        } catch (Exception e8) {
            o9.d().a(e8);
            listener.onNativeAdLoadFailed(new IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e8.getMessage()));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) {
        JSONObject loadParams = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(b9.f16523r, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION).put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        n.e(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        n.e(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject config) {
        n.f(config, "config");
        ph phVar = this.nativeAd;
        if (phVar != null) {
            phVar.destroy();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject jSONObject) {
        n.f(config, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
        getAdapter().initSDK(str, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(final JSONObject config, JSONObject jSONObject, final String str, final NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
        postOnUIThread(new Runnable() { // from class: j7.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter.this, config, listener, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT adUnit, JSONObject jSONObject) {
        n.f(adUnit, "adUnit");
    }
}
