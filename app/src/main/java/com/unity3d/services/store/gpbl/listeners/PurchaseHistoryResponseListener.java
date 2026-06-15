package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import java.util.List;
/* compiled from: PurchaseHistoryResponseListener.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseHistoryRecordBridge> list);
}
