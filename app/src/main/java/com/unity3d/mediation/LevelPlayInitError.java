package com.unity3d.mediation;

import com.ironsource.mr;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayInitError {

    /* renamed from: a  reason: collision with root package name */
    private final int f23780a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23781b;

    public LevelPlayInitError(int i10, String errorMessage) {
        n.f(errorMessage, "errorMessage");
        this.f23780a = i10;
        this.f23781b = errorMessage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(mr sdkError) {
        this(sdkError.c(), sdkError.d());
        n.f(sdkError, "sdkError");
    }

    public final int getErrorCode() {
        return this.f23780a;
    }

    public final String getErrorMessage() {
        return this.f23781b;
    }

    public String toString() {
        return "LevelPlayError(errorCode=" + this.f23780a + ", errorMessage='" + this.f23781b + "')";
    }
}
