package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
/* compiled from: AwaitInitialization.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface AwaitInitialization {

    /* compiled from: AwaitInitialization.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(AwaitInitialization awaitInitialization, long j10, m8.d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    j10 = Long.MAX_VALUE;
                }
                return awaitInitialization.invoke(j10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(long j10, m8.d<? super InitializationState> dVar);
}
