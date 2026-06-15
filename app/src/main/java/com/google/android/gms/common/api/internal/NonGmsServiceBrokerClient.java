package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {

    /* renamed from: l  reason: collision with root package name */
    private static final String f12137l = NonGmsServiceBrokerClient.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final String f12138a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12139b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f12140c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f12141d;

    /* renamed from: e  reason: collision with root package name */
    private final ConnectionCallbacks f12142e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f12143f;

    /* renamed from: g  reason: collision with root package name */
    private final OnConnectionFailedListener f12144g;

    /* renamed from: h  reason: collision with root package name */
    private IBinder f12145h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12146i;

    /* renamed from: j  reason: collision with root package name */
    private String f12147j;

    /* renamed from: k  reason: collision with root package name */
    private String f12148k;

    private final void g() {
        if (Thread.currentThread() != this.f12143f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void h(String str) {
        String.valueOf(this.f12145h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f12146i = false;
        this.f12145h = null;
        h("Disconnected.");
        this.f12142e.onConnectionSuspended(1);
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        g();
        h("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f12140c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f12138a).setAction(this.f12139b);
            }
            boolean bindService = this.f12141d.bindService(intent, this, GmsClientSupervisor.a());
            this.f12146i = bindService;
            if (!bindService) {
                this.f12145h = null;
                this.f12144g.onConnectionFailed(new ConnectionResult(16));
            }
            h("Finished connect.");
        } catch (SecurityException e8) {
            this.f12146i = false;
            this.f12145h = null;
            throw e8;
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        g();
        h("Disconnect called.");
        try {
            this.f12141d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f12146i = false;
        this.f12145h = null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(IBinder iBinder) {
        this.f12146i = false;
        this.f12145h = iBinder;
        h("Connected.");
        this.f12142e.onConnected(new Bundle());
    }

    public final void f(String str) {
        this.f12148k = str;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String getEndpointPackageName() {
        String str = this.f12138a;
        if (str != null) {
            return str;
        }
        Preconditions.m(this.f12140c);
        return this.f12140c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String getLastDisconnectMessage() {
        return this.f12147j;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnected() {
        g();
        return this.f12145h != null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnecting() {
        g();
        return this.f12146i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f12143f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacg
            @Override // java.lang.Runnable
            public final void run() {
                NonGmsServiceBrokerClient.this.e(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f12143f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacf
            @Override // java.lang.Runnable
            public final void run() {
                NonGmsServiceBrokerClient.this.b();
            }
        });
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect(String str) {
        g();
        this.f12147j = str;
        disconnect();
    }
}
