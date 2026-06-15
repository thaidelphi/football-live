package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import java.util.List;
/* compiled from: SkuDetailsResponseListener.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface SkuDetailsResponseListener {
    void onSkuDetailsUpdated(BillingResultBridge billingResultBridge, List<? extends SkuDetailsBridge> list);
}
