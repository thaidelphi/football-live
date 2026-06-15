package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import d9.n;
import d9.o;
import d9.o0;
import i8.o;
import i8.w;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import n8.c;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionEventManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {123}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TransactionEventManager$invoke$1 extends l implements p<o0, d<? super w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventManager$invoke$1(TransactionEventManager transactionEventManager, d<? super TransactionEventManager$invoke$1> dVar) {
        super(2, dVar);
        this.this$0 = transactionEventManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new TransactionEventManager$invoke$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((TransactionEventManager$invoke$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        SendDiagnosticEvent sendDiagnosticEvent;
        StoreMonitor storeMonitor;
        d b10;
        StoreMonitor storeMonitor2;
        Object c11;
        StoreMonitor storeMonitor3;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
        } catch (Exception unused) {
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, 30, null);
        }
        if (i10 == 0) {
            i8.p.b(obj);
            storeMonitor = this.this$0.storeMonitor;
            if (!storeMonitor.isInitialized()) {
                final TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                b10 = c.b(this);
                final o oVar = new o(b10, 1);
                oVar.C();
                storeMonitor2 = transactionEventManager.storeMonitor;
                storeMonitor2.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                    private final void tryResume() {
                        if (oVar.isActive()) {
                            n<w> nVar = oVar;
                            o.a aVar = i8.o.f26626b;
                            nVar.resumeWith(i8.o.b(w.f26638a));
                        }
                    }

                    private final void tryResumeWithException(Exception exc) {
                        if (oVar.isActive()) {
                            n<w> nVar = oVar;
                            o.a aVar = i8.o.f26626b;
                            nVar.resumeWith(i8.o.b(i8.p.a(exc)));
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        tryResumeWithException(new TransactionException("Billing service disconnected"));
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingSetupFinished(BillingResultBridge billingResult) {
                        kotlin.jvm.internal.n.f(billingResult, "billingResult");
                        if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                            tryResumeWithException(new TransactionException("Billing setup failed"));
                        } else {
                            tryResume();
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                    public void onIsAlreadyInitialized() {
                        tryResume();
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                    public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
                        kotlin.jvm.internal.n.f(billingResult, "billingResult");
                        transactionEventManager.onPurchasesReceived(billingResult, list);
                    }
                });
                Object z10 = oVar.z();
                c11 = n8.d.c();
                if (z10 == c11) {
                    h.c(this);
                }
                if (z10 == c10) {
                    return c10;
                }
            }
            return w.f26638a;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            TransactionEventManager transactionEventManager2 = (TransactionEventManager) this.L$0;
            i8.p.b(obj);
        }
        storeMonitor3 = this.this$0.storeMonitor;
        final TransactionEventManager transactionEventManager3 = this.this$0;
        storeMonitor3.getPurchases(42, "inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
            @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
            public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                TransactionEventManager.access$onPurchasesReceived(TransactionEventManager.this, billingResultBridge, list);
            }
        });
        return w.f26638a;
    }
}
