package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f13767e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13768a;

    /* renamed from: b  reason: collision with root package name */
    private final ClientSettings f13769b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f13770c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f13771d;

    public SignInClientImpl(Context context, Looper looper, boolean z10, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f13768a = true;
        this.f13769b = clientSettings;
        this.f13770c = bundle;
        this.f13771d = clientSettings.g();
    }

    @KeepForSdk
    public static Bundle e(ClientSettings clientSettings) {
        clientSettings.f();
        Integer g10 = clientSettings.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.a());
        if (g10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.signin.zae
    public final void a() {
        try {
            ((zaf) getService()).Z(((Integer) Preconditions.m(this.f13771d)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.signin.zae
    public final void b() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.signin.zae
    public final void c(zae zaeVar) {
        Preconditions.n(zaeVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b10 = this.f13769b.b();
            ((zaf) getService()).u0(new zai(1, new zat(b10, ((Integer) Preconditions.m(this.f13771d)).intValue(), BaseGmsClient.DEFAULT_ACCOUNT.equals(b10.name) ? Storage.a(getContext()).b() : null)), zaeVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zaeVar.g(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder);
    }

    @Override // com.google.android.gms.signin.zae
    public final void d(IAccountAccessor iAccountAccessor, boolean z10) {
        try {
            ((zaf) getService()).t0(iAccountAccessor, ((Integer) Preconditions.m(this.f13771d)).intValue(), z10);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f13769b.d())) {
            this.f13770c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f13769b.d());
        }
        return this.f13770c;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.f12026a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.f13768a;
    }
}
