package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: GetAuthTokenListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f14871a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<g> f14872b;

    public e(i iVar, TaskCompletionSource<g> taskCompletionSource) {
        this.f14871a = iVar;
        this.f14872b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f14872b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(t6.d dVar) {
        if (!dVar.k() || this.f14871a.f(dVar)) {
            return false;
        }
        this.f14872b.setResult(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
