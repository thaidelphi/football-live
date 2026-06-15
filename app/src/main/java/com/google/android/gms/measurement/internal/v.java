package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f13183a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w f13184b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(w wVar, boolean z10) {
        this.f13184b = wVar;
        this.f13183a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkzVar = this.f13184b.f13197a;
        zzkzVar.j(this.f13183a);
    }
}
