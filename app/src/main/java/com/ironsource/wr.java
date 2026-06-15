package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wr {

    /* renamed from: a  reason: collision with root package name */
    private final mr f21316a;

    /* renamed from: b  reason: collision with root package name */
    private final sr f21317b;

    public wr(mr error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f21316a = error;
        this.f21317b = null;
    }

    public wr(sr sdkInitResponse) {
        kotlin.jvm.internal.n.f(sdkInitResponse, "sdkInitResponse");
        this.f21317b = sdkInitResponse;
        this.f21316a = null;
    }

    public final mr a() {
        return this.f21316a;
    }

    public final sr b() {
        return this.f21317b;
    }

    public final boolean c() {
        sr srVar;
        if (this.f21316a == null && (srVar = this.f21317b) != null) {
            return srVar.c().p();
        }
        return false;
    }
}
