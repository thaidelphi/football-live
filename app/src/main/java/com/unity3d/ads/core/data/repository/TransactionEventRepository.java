package com.unity3d.ads.core.data.repository;

import g9.a0;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
/* compiled from: TransactionEventRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    a0<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents();
}
