package com.unity3d.ads.core.data.repository;

import f9.a;
import g9.a0;
import g9.c0;
import g9.g;
import g9.v;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.n;
/* compiled from: OperativeEventRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OperativeEventRepository {
    private final v<OperativeEventRequestOuterClass.OperativeEventRequest> _operativeEvents;
    private final a0<OperativeEventRequestOuterClass.OperativeEventRequest> operativeEvents;

    public OperativeEventRepository() {
        v<OperativeEventRequestOuterClass.OperativeEventRequest> a10 = c0.a(10, 10, a.DROP_OLDEST);
        this._operativeEvents = a10;
        this.operativeEvents = g.a(a10);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        n.f(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.c(operativeEventRequest);
    }

    public final a0<OperativeEventRequestOuterClass.OperativeEventRequest> getOperativeEvents() {
        return this.operativeEvents;
    }
}
