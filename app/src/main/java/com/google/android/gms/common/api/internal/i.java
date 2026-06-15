package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class i extends r {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ConnectionResult f12215b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f12216c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.f12216c = kVar;
        this.f12215b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void a() {
        this.f12216c.f12221c.k(this.f12215b);
    }
}
