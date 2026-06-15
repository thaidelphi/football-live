package com.google.android.gms.common.api.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f12253a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zabq f12254b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(zabq zabqVar, int i10) {
        this.f12254b = zabqVar;
        this.f12253a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12254b.h(this.f12253a);
    }
}
