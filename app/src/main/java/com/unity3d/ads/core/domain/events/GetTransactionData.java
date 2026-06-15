package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
/* compiled from: GetTransactionData.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface GetTransactionData {
    TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseBridge, SkuDetailsBridge skuDetailsBridge);
}
