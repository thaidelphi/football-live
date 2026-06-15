package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.n;
/* compiled from: CommonGetGameId.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGetGameId implements GetGameId {
    private final SessionRepository sessionRepository;

    public CommonGetGameId(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetGameId
    public String invoke() {
        return this.sessionRepository.getGameId();
    }
}
