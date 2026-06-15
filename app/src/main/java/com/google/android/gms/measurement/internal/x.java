package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class x extends o {

    /* renamed from: b  reason: collision with root package name */
    private boolean f13219b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13220a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        if (!h()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void e() {
        if (this.f13219b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f13220a.b();
        this.f13219b = true;
    }

    public final void f() {
        if (!this.f13219b) {
            g();
            this.f13220a.b();
            this.f13219b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected void g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.f13219b;
    }

    protected abstract boolean i();
}
