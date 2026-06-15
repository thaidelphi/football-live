package com.unity3d.services.store;

import com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
/* compiled from: WebViewStoreEventListener.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender, boolean z10) {
        n.f(storeWebViewEventSender, "storeWebViewEventSender");
        this.operationId = i10;
        this.storeWebViewEventSender = storeWebViewEventSender;
        this.isLifecycleListener = z10;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(BillingResultBridge billingResult) {
        n.f(billingResult, "billingResult");
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.INITIALIZATION_REQUEST_RESULT;
            BillingResultResponseCode responseCode = billingResult.getResponseCode();
            n.e(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.INITIALIZATION_REQUEST_FAILED;
        BillingResultResponseCode responseCode2 = billingResult.getResponseCode();
        n.e(responseCode2, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode2);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int i10) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(getOperationId()), Integer.valueOf(i10));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(BillingResultResponseCode.OK.getResponseCode()));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    public void onPurchaseHistoryUpdated(BillingResultBridge billingResult, List<? extends PurchaseHistoryRecordBridge> list) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(getOperationId());
        BillingResultResponseCode responseCode = billingResult.getResponseCode();
        n.e(responseCode, "billingResult.responseCode");
        objArr[1] = responseCode;
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        objArr[2] = jSONArray;
        storeWebViewEventSender.send(storeEvent, objArr);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public void onPurchaseResponse(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        ArrayList arrayList = new ArrayList();
        if (getOperationId() != -1) {
            arrayList.add(Integer.valueOf(getOperationId()));
        }
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            arrayList.add(jSONArray);
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_RESULT : StoreEvent.PURCHASES_REQUEST_RESULT;
            Object[] array = arrayList.toArray(new Object[0]);
            storeWebViewEventSender.send(storeEvent, Arrays.copyOf(array, array.length));
            return;
        }
        arrayList.add(billingResult.getResponseCode());
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_ERROR : StoreEvent.PURCHASES_REQUEST_ERROR;
        Object[] array2 = arrayList.toArray(new Object[0]);
        storeWebViewEventSender2.send(storeEvent2, Arrays.copyOf(array2, array2.length));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.PURCHASES_UPDATED_RESULT;
            Object[] objArr = new Object[1];
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            objArr[0] = jSONArray;
            storeWebViewEventSender.send(storeEvent, objArr);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.PURCHASES_UPDATED_ERROR;
        BillingResultResponseCode responseCode = billingResult.getResponseCode();
        n.e(responseCode, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public void onSkuDetailsUpdated(BillingResultBridge billingResult, List<? extends SkuDetailsBridge> list) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(getOperationId());
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        objArr[1] = jSONArray;
        storeWebViewEventSender.send(storeEvent, objArr);
    }

    public /* synthetic */ WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender, boolean z10, int i11, h hVar) {
        this(i10, storeWebViewEventSender, (i11 & 4) != 0 ? false : z10);
    }
}
