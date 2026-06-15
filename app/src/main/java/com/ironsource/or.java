package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class or extends IllegalArgumentException {

    /* renamed from: a  reason: collision with root package name */
    private final IronSourceError f19631a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.n.f(error, "error");
        this.f19631a = error;
        this.f19632b = error.getErrorCode();
    }

    public final IronSourceError a() {
        return this.f19631a;
    }

    public final int b() {
        return this.f19632b;
    }
}
