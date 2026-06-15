package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: GetIdListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource<String> f14873a;

    public f(TaskCompletionSource<String> taskCompletionSource) {
        this.f14873a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(t6.d dVar) {
        if (dVar.l() || dVar.k() || dVar.i()) {
            this.f14873a.trySetResult(dVar.d());
            return true;
        }
        return false;
    }
}
