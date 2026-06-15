package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.n;
/* compiled from: ExposureException.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(String message, Object[] parameters) {
        super(message);
        n.f(message, "message");
        n.f(parameters, "parameters");
        this.parameters = parameters;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
