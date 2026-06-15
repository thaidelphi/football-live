package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zabv<O extends Api.ApiOptions> extends zaag {

    /* renamed from: c  reason: collision with root package name */
    private final GoogleApi<O> f12340c;

    public zabv(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f12340c = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t10) {
        return (T) this.f12340c.doWrite((GoogleApi<O>) t10);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper h() {
        return this.f12340c.getLooper();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void j(zada zadaVar) {
    }
}
