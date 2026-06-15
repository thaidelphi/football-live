package com.unity3d.services.store.gpbl.listeners;
/* compiled from: StoreEventListener.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface StoreEventListener extends PurchaseHistoryResponseListener, SkuDetailsResponseListener, PurchasesResponseListener, PurchaseUpdatedResponseListener, FeatureSupportedListener, BillingInitializationListener {
    int getOperationId();
}
