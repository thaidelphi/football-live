package com.unity3d.ads.core.data.repository;

import a9.f;
import com.google.android.gms.common.api.Api;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import d9.j0;
import d9.k;
import d9.n0;
import d9.o0;
import d9.p0;
import g9.a0;
import g9.c0;
import g9.g;
import g9.l0;
import g9.v;
import g9.w;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import j8.q;
import j8.y;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.n;
/* compiled from: AndroidDiagnosticEventRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final v<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final w<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final w<Boolean> configured;
    private final o0 coroutineScope;
    private final a0<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    private final w<Boolean> enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(CoroutineTimer flushTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, j0 dispatcher) {
        List d10;
        n.f(flushTimer, "flushTimer");
        n.f(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        n.f(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = p0.h(p0.a(dispatcher), new n0("DiagnosticEventRepository"));
        d10 = q.d();
        this.batch = l0.a(d10);
        this.maxBatchSize = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = l0.a(bool);
        this.configured = l0.a(bool);
        v<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> b10 = c0.b(100, 0, null, 6, null);
        this._diagnosticEvents = b10;
        this.diagnosticEvents = g.a(b10);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> F;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> F2;
        n.f(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            w<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> wVar = this.batch;
            do {
                value2 = wVar.getValue();
                F2 = y.F(value2, diagnosticEvent);
            } while (!wVar.i(value2, F2));
        } else if (this.enabled.getValue().booleanValue()) {
            w<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> wVar2 = this.batch;
            do {
                value = wVar2.getValue();
                F = y.F(value, diagnosticEvent);
            } while (!wVar2.i(value, F));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> d10;
        w<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> wVar = this.batch;
        do {
            value = wVar.getValue();
            d10 = q.d();
        } while (!wVar.i(value, d10));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        n.f(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        n.e(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        n.e(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new AndroidDiagnosticEventRepository$configure$1(this));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> d10;
        f p10;
        f l10;
        f h10;
        f h11;
        List r10;
        if (this.enabled.getValue().booleanValue()) {
            w<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> wVar = this.batch;
            do {
                value = wVar.getValue();
                d10 = q.d();
            } while (!wVar.i(value, d10));
            p10 = y.p(value);
            l10 = a9.n.l(p10, new AndroidDiagnosticEventRepository$flush$events$2(this));
            h10 = a9.n.h(l10, new AndroidDiagnosticEventRepository$flush$events$3(this));
            h11 = a9.n.h(h10, new AndroidDiagnosticEventRepository$flush$events$4(this));
            r10 = a9.n.r(h11);
            if (!r10.isEmpty()) {
                DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + this.enabled.getValue().booleanValue() + " size: " + r10.size() + " :: " + r10);
                k.d(this.coroutineScope, null, null, new AndroidDiagnosticEventRepository$flush$1(this, r10, null), 3, null);
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public a0<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
