package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import g9.l0;
import g9.w;
import kotlin.jvm.internal.n;
/* compiled from: AlternativeFlowReader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final w<Boolean> isAlternativeFlowEnabled;
    private final w<Boolean> isAlternativeFlowRead;
    private final SessionRepository sessionRepository;

    public AlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository) {
        n.f(configurationReader, "configurationReader");
        n.f(sessionRepository, "sessionRepository");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        Boolean bool = Boolean.FALSE;
        this.isAlternativeFlowRead = l0.a(bool);
        this.isAlternativeFlowEnabled = l0.a(bool);
    }

    public final boolean invoke() {
        if (!this.isAlternativeFlowRead.getValue().booleanValue()) {
            this.isAlternativeFlowEnabled.setValue(Boolean.valueOf(this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled() || this.sessionRepository.getNativeConfiguration().getFeatureFlags().getBoldSdkNextSessionEnabled()));
            this.isAlternativeFlowRead.setValue(Boolean.TRUE);
        }
        return this.isAlternativeFlowEnabled.getValue().booleanValue();
    }
}
