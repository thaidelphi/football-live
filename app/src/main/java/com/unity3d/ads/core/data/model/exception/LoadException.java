package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.n;
/* compiled from: LoadException.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i10, String message) {
        super(message);
        n.f(message, "message");
        this.errorCode = i10;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
