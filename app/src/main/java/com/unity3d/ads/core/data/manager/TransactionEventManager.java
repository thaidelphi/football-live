package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import d9.k;
import d9.o0;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: TransactionEventManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TransactionEventManager {
    public static final Companion Companion = new Companion(null);
    private static final String INAPP = "inapp";
    private static final int dummyOperationId = 42;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final o0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final StoreMonitor storeMonitor;
    private final TransactionEventRepository transactionEventRepository;

    /* compiled from: TransactionEventManager.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public TransactionEventManager(o0 scope, StoreMonitor storeMonitor, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource iapTransactionStore, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(scope, "scope");
        n.f(storeMonitor, "storeMonitor");
        n.f(getTransactionData, "getTransactionData");
        n.f(getTransactionRequest, "getTransactionRequest");
        n.f(transactionEventRepository, "transactionEventRepository");
        n.f(iapTransactionStore, "iapTransactionStore");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.storeMonitor = storeMonitor;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            if (list == null || list.isEmpty()) {
                return;
            }
            k.d(this.scope, null, null, new TransactionEventManager$onPurchasesReceived$1(list, this, null), 3, null);
        }
    }

    public final void invoke() {
        k.d(this.scope, null, null, new TransactionEventManager$invoke$1(this, null), 3, null);
    }
}
