package com.ironsource.mediationsdk.adapter;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getAdUnitIdMissingErrorString(String key) {
        n.f(key, "key");
        return "Missing params - " + key;
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getConfigStringValueFromKey(JSONObject config, String key) {
        n.f(config, "config");
        n.f(key, "key");
        String optString = config.optString(key);
        n.e(optString, "config.optString(key)");
        return optString;
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
    }

    public final void postBackgroundThread(Runnable runnable) {
        n.f(runnable, "runnable");
        IronSourceThreadManager.postAdapterBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void postOnUIThread(Runnable runnable) {
        n.f(runnable, "runnable");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }
}
