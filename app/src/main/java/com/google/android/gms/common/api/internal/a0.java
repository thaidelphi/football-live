package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a0 implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* renamed from: a  reason: collision with root package name */
    private final Api.Client f12182a;

    /* renamed from: b  reason: collision with root package name */
    private final ApiKey<?> f12183b;

    /* renamed from: c  reason: collision with root package name */
    private IAccountAccessor f12184c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f12185d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12186e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ GoogleApiManager f12187f;

    public a0(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.f12187f = googleApiManager;
        this.f12182a = client;
        this.f12183b = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        IAccountAccessor iAccountAccessor;
        if (!this.f12186e || (iAccountAccessor = this.f12184c) == null) {
            return;
        }
        this.f12182a.getRemoteService(iAccountAccessor, this.f12185d);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f12187f.f12127p;
        handler.post(new z(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void b(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        if (iAccountAccessor != null && set != null) {
            this.f12184c = iAccountAccessor;
            this.f12185d = set;
            h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        c(new ConnectionResult(4));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void c(ConnectionResult connectionResult) {
        Map map;
        map = this.f12187f.f12123l;
        zabq zabqVar = (zabq) map.get(this.f12183b);
        if (zabqVar != null) {
            zabqVar.F(connectionResult);
        }
    }
}
