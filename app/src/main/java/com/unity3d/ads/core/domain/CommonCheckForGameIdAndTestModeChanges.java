package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import i8.s;
import j8.j0;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: CommonCheckForGameIdAndTestModeChanges.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(getGameId, "getGameId");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z10) {
        if (z10) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(str, map, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, null, map, null, null, 26, null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z10) {
        Map<String, String> g10;
        Map<String, String> g11;
        String invoke = this.getGameId.invoke();
        if (invoke == null) {
            invoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        g10 = j0.g(s.a("previous_game_id", previousGameId), s.a("game_id", invoke));
        if (n.a(previousGameId, "null")) {
            return;
        }
        if (!n.a(invoke, previousGameId)) {
            sendDiagnostic("native_initialize_game_id_changed", g10, z10);
        } else {
            sendDiagnostic("native_initialize_game_id_same", g10, z10);
        }
        boolean isTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        g11 = j0.g(s.a("previous_test_mode", String.valueOf(previousTestMode)), s.a("test_mode", String.valueOf(isTestMode)));
        if (isTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", g11, z10);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", g11, z10);
        }
    }
}
