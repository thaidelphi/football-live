package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {
    private static volatile Executor zaa;
    private final ClientSettings zab;
    private final Set<Scope> zac;
    private final Account zad;

    @VisibleForTesting
    @KeepForSdk
    protected GmsClient(Context context, Handler handler, int i10, ClientSettings clientSettings) {
        super(context, handler, GmsClientSupervisor.b(context), GoogleApiAvailability.q(), i10, null, null);
        this.zab = (ClientSettings) Preconditions.m(clientSettings);
        this.zad = clientSettings.a();
        this.zac = zaa(clientSettings.c());
    }

    private final Set<Scope> zaa(Set<Scope> set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope scope : validateScopes) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Executor getBindServiceExecutor() {
        return null;
    }

    @KeepForSdk
    protected final ClientSettings getClientSettings() {
        return this.zab;
    }

    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @KeepForSdk
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    @KeepForSdk
    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    @KeepForSdk
    protected GmsClient(Context context, Looper looper, int i10, ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.b(context), GoogleApiAvailability.q(), i10, clientSettings, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    @Deprecated
    public GmsClient(Context context, Looper looper, int i10, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i10, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public GmsClient(Context context, Looper looper, int i10, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.b(context), GoogleApiAvailability.q(), i10, clientSettings, (ConnectionCallbacks) Preconditions.m(connectionCallbacks), (OnConnectionFailedListener) Preconditions.m(onConnectionFailedListener));
    }

    @VisibleForTesting
    protected GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i10, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i10, connectionCallbacks == null ? null : new c(connectionCallbacks), onConnectionFailedListener == null ? null : new d(onConnectionFailedListener), clientSettings.h());
        this.zab = clientSettings;
        this.zad = clientSettings.a();
        this.zac = zaa(clientSettings.c());
    }
}
