package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.jvm.internal.n;
/* compiled from: GatewayStoreExceptionHandler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i10, Exception exception) {
        n.f(storeEvent, "storeEvent");
        n.f(exception, "exception");
        throw exception;
    }
}
