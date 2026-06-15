package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzg extends f {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f12618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i10, Bundle bundle) {
        super(baseGmsClient, i10, null);
        this.f12618g = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final void f(ConnectionResult connectionResult) {
        if (this.f12618g.enableLocalFallback() && BaseGmsClient.zzo(this.f12618g)) {
            BaseGmsClient.zzk(this.f12618g, 16);
            return;
        }
        this.f12618g.zzc.a(connectionResult);
        this.f12618g.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.f
    protected final boolean g() {
        this.f12618g.zzc.a(ConnectionResult.f12002e);
        return true;
    }
}
