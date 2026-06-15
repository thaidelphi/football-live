package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import d9.i;
import d9.j0;
import g9.l0;
import g9.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: TransactionEventObserver.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TransactionEventObserver {
    private final j0 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final w<Boolean> isRunning;
    private final TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, j0 defaultDispatcher, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource iapTransactionStore) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(transactionEventRepository, "transactionEventRepository");
        n.f(gatewayClient, "gatewayClient");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = l0.a(Boolean.FALSE);
    }

    public final Object invoke(d<? super i8.w> dVar) {
        Object c10;
        Object g10 = i.g(this.defaultDispatcher, new TransactionEventObserver$invoke$2(this, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : i8.w.f26638a;
    }
}
