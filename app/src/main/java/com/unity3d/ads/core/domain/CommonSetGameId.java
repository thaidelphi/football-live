package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.n;
/* compiled from: CommonSetGameId.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonSetGameId implements SetGameId {
    private final SessionRepository sessionRepository;

    public CommonSetGameId(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetGameId
    public void invoke(String str) {
        this.sessionRepository.setGameId(str);
    }
}
