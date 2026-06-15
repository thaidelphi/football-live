package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import d9.z2;
import kotlin.jvm.internal.n;
/* compiled from: CommonAwaitInitialization.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonAwaitInitialization implements AwaitInitialization {
    private final SessionRepository sessionRepository;

    public CommonAwaitInitialization(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.AwaitInitialization
    public Object invoke(long j10, m8.d<? super InitializationState> dVar) {
        return z2.d(j10, new CommonAwaitInitialization$invoke$2(this, null), dVar);
    }
}
