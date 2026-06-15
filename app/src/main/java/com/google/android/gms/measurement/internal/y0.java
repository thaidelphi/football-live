package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class y0 extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f13250b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13220a.d();
    }

    protected void d() {
    }

    protected abstract boolean e();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void g() {
        if (!this.f13250b) {
            if (e()) {
                return;
            }
            this.f13220a.b();
            this.f13250b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void h() {
        if (!this.f13250b) {
            d();
            this.f13220a.b();
            this.f13250b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.f13250b;
    }
}
