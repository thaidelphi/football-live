package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zaaw f12209a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(zaaw zaawVar) {
        this.f12209a = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        zaaw zaawVar = this.f12209a;
        googleApiAvailabilityLight = zaawVar.f12271d;
        context = zaawVar.f12270c;
        googleApiAvailabilityLight.a(context);
    }
}
