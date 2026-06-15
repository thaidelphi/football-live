package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class r3 extends q3 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f13133c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r3(zzkz zzkzVar) {
        super(zzkzVar);
        this.f13125b.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        if (!f()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void e() {
        if (!this.f13133c) {
            g();
            this.f13125b.h();
            this.f13133c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return this.f13133c;
    }

    protected abstract boolean g();
}
