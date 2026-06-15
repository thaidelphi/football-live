package com.unity3d.services.core.extensions;

import kotlin.jvm.internal.n;
/* compiled from: TaskExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AbortRetryException extends Exception {
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortRetryException(String reason) {
        super(reason);
        n.f(reason, "reason");
        this.reason = reason;
    }
}
