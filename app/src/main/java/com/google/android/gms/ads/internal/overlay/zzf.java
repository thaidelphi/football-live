package com.google.android.gms.ads.internal.overlay;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzf implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzm f11323a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zzm zzmVar) {
        this.f11323a = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.f11323a;
        zzmVar.f11349v = 2;
        zzmVar.f11328a.finish();
    }
}
