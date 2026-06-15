package com.unity3d.ads.core.domain.work;

import com.google.protobuf.kotlin.DslList;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import j8.r;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
/* compiled from: DiagnosticEventRequestWorkModifier.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticEventRequestWorkModifier {
    private final LifecycleDataSource lifecycleDataSource;
    private final SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(SessionRepository sessionRepository, LifecycleDataSource lifecycleDataSource) {
        n.f(sessionRepository, "sessionRepository");
        n.f(lifecycleDataSource, "lifecycleDataSource");
        this.sessionRepository = sessionRepository;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    public final UniversalRequestOuterClass.UniversalRequest invoke(UniversalRequestOuterClass.UniversalRequest universalRequest) {
        int k10;
        n.f(universalRequest, "universalRequest");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        n.e(builder, "this.toBuilder()");
        UniversalRequestKt.Dsl _create = companion._create(builder);
        UniversalRequestOuterClass.UniversalRequest.Payload payload = _create.getPayload();
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder2 = payload.toBuilder();
        n.e(builder2, "this.toBuilder()");
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(builder2);
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = _create2.getDiagnosticEventRequest();
        DiagnosticEventRequestKt.Dsl.Companion companion3 = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder3 = diagnosticEventRequest.toBuilder();
        n.e(builder3, "this.toBuilder()");
        DiagnosticEventRequestKt.Dsl _create3 = companion3._create(builder3);
        DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent> batch = _create3.getBatch();
        k10 = r.k(batch, 10);
        ArrayList arrayList = new ArrayList(k10);
        for (DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent : batch) {
            DiagnosticEventKt.Dsl.Companion companion4 = DiagnosticEventKt.Dsl.Companion;
            DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder4 = diagnosticEvent.toBuilder();
            n.e(builder4, "this.toBuilder()");
            DiagnosticEventKt.Dsl _create4 = companion4._create(builder4);
            _create4.putStringTags(_create4.getStringTagsMap(), "same_session", String.valueOf(n.a(universalRequest.getSharedData().getSessionToken(), this.sessionRepository.getSessionToken())));
            _create4.putStringTags(_create4.getStringTagsMap(), "app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
            arrayList.add(_create4._build());
        }
        _create3.clearBatch(_create3.getBatch());
        _create3.addAllBatch(_create3.getBatch(), arrayList);
        _create2.setDiagnosticEventRequest(_create3._build());
        _create.setPayload(_create2._build());
        return _create._build();
    }
}
