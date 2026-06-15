package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: h  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f12357h = zad.f13784c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12358a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f12359b;

    /* renamed from: c  reason: collision with root package name */
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f12360c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Scope> f12361d;

    /* renamed from: e  reason: collision with root package name */
    private final ClientSettings f12362e;

    /* renamed from: f  reason: collision with root package name */
    private com.google.android.gms.signin.zae f12363f;

    /* renamed from: g  reason: collision with root package name */
    private zacs f12364g;

    public zact(Context context, Handler handler, ClientSettings clientSettings) {
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = f12357h;
        this.f12358a = context;
        this.f12359b = handler;
        this.f12362e = (ClientSettings) Preconditions.n(clientSettings, "ClientSettings must not be null");
        this.f12361d = clientSettings.e();
        this.f12360c = abstractClientBuilder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void u0(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        ConnectionResult X = zakVar.X();
        if (X.z0()) {
            zav zavVar = (zav) Preconditions.m(zakVar.n0());
            ConnectionResult X2 = zavVar.X();
            if (!X2.z0()) {
                String valueOf = String.valueOf(X2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                zactVar.f12364g.c(X2);
                zactVar.f12363f.disconnect();
                return;
            }
            zactVar.f12364g.b(zavVar.n0(), zactVar.f12361d);
        } else {
            zactVar.f12364g.c(X);
        }
        zactVar.f12363f.disconnect();
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void g(com.google.android.gms.signin.internal.zak zakVar) {
        this.f12359b.post(new e0(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f12363f.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f12364g.c(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.f12363f.disconnect();
    }

    public final void v0(zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.f12363f;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        this.f12362e.j(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f12360c;
        Context context = this.f12358a;
        Looper looper = this.f12359b.getLooper();
        ClientSettings clientSettings = this.f12362e;
        this.f12363f = abstractClientBuilder.buildClient(context, looper, clientSettings, (ClientSettings) clientSettings.f(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.f12364g = zacsVar;
        Set<Scope> set = this.f12361d;
        if (set != null && !set.isEmpty()) {
            this.f12363f.b();
        } else {
            this.f12359b.post(new d0(this));
        }
    }

    public final void w0() {
        com.google.android.gms.signin.zae zaeVar = this.f12363f;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
