package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaax implements zabf {

    /* renamed from: a  reason: collision with root package name */
    private final zabi f12289a;

    public zaax(zabi zabiVar) {
        this.f12289a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
        for (Api.Client client : this.f12289a.f12315f.values()) {
            client.disconnect();
        }
        this.f12289a.f12323n.f12301m = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c() {
        this.f12289a.i();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(ConnectionResult connectionResult, Api<?> api, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
