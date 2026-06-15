package com.google.android.gms.common.api.internal;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.signin.internal.zak f12205a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zact f12206b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.f12206b = zactVar;
        this.f12205a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.u0(this.f12206b, this.f12205a);
    }
}
