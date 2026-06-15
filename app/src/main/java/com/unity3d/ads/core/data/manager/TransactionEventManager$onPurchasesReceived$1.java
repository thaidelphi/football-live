package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import d9.o0;
import i8.w;
import j8.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionEventManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {92, 109, 112}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TransactionEventManager$onPurchasesReceived$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ List<PurchaseBridge> $purchases;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionEventManager$onPurchasesReceived$1(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, d<? super TransactionEventManager$onPurchasesReceived$1> dVar) {
        super(2, dVar);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(List list, int i10, List list2, TransactionEventManager transactionEventManager, PurchaseBridge purchaseBridge, BillingResultBridge billingResultBridge, List list3) {
        int k10;
        GetTransactionData getTransactionData;
        if (list3 != null && billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            k10 = r.k(list3, 10);
            ArrayList arrayList = new ArrayList(k10);
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                getTransactionData = transactionEventManager.getTransactionData;
                arrayList.add(getTransactionData.invoke(purchaseBridge, (SkuDetailsBridge) it.next()));
            }
            list2.addAll(arrayList);
            ((d9.w) list.get(i10)).L(w.f26638a);
            return;
        }
        ((d9.w) list.get(i10)).L(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((TransactionEventManager$onPurchasesReceived$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0176  */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00da -> B:26:0x00e9). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
