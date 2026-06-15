package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: GetDiagnosticEventRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        n.f(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String eventName, Map<String, String> map, Map<String, Integer> map2, Double d10, Boolean bool, ByteString byteString, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        n.f(eventName, "eventName");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        n.e(newBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        _create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        _create.setCustomEventType(eventName);
        if (map != null) {
            _create.putAllStringTags(_create.getStringTagsMap(), map);
        }
        if (map2 != null) {
            _create.putAllIntTags(_create.getIntTagsMap(), map2);
        }
        if (d10 != null) {
            _create.setTimeValue(d10.doubleValue());
        }
        if (bool != null) {
            _create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            _create.setImpressionOpportunityId(byteString);
        }
        if (str != null) {
            _create.setPlacementId(str);
        }
        if (diagnosticAdType != null) {
            _create.setAdType(diagnosticAdType);
        }
        return _create._build();
    }
}
