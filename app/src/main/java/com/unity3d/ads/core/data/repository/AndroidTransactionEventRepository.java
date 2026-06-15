package com.unity3d.ads.core.data.repository;

import f9.a;
import g9.a0;
import g9.c0;
import g9.g;
import g9.v;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.n;
/* compiled from: AndroidTransactionEventRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final v<TransactionEventRequestOuterClass.TransactionEventRequest> _transactionEvents;
    private final a0<TransactionEventRequestOuterClass.TransactionEventRequest> transactionEvents;

    public AndroidTransactionEventRepository() {
        v<TransactionEventRequestOuterClass.TransactionEventRequest> a10 = c0.a(10, 10, a.DROP_OLDEST);
        this._transactionEvents = a10;
        this.transactionEvents = g.a(a10);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        n.f(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.c(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public a0<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents() {
        return this.transactionEvents;
    }
}
