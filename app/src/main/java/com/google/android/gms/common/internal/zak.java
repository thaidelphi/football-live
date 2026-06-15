package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zak implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final zaj f12579a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f12580b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<GoogleApiClient.ConnectionCallbacks> f12581c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> f12582d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f12583e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f12584f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12585g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f12586h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f12587i;

    public final void a() {
        this.f12583e = false;
        this.f12584f.incrementAndGet();
    }

    public final void b() {
        this.f12583e = true;
    }

    @VisibleForTesting
    public final void c(ConnectionResult connectionResult) {
        Preconditions.e(this.f12586h, "onConnectionFailure must only be called on the Handler thread");
        this.f12586h.removeMessages(1);
        synchronized (this.f12587i) {
            ArrayList arrayList = new ArrayList(this.f12582d);
            int i10 = this.f12584f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                if (this.f12583e && this.f12584f.get() == i10) {
                    if (this.f12582d.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                return;
            }
        }
    }

    @VisibleForTesting
    public final void d(Bundle bundle) {
        Preconditions.e(this.f12586h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f12587i) {
            Preconditions.p(!this.f12585g);
            this.f12586h.removeMessages(1);
            this.f12585g = true;
            Preconditions.p(this.f12581c.isEmpty());
            ArrayList arrayList = new ArrayList(this.f12580b);
            int i10 = this.f12584f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.f12583e || !this.f12579a.isConnected() || this.f12584f.get() != i10) {
                    break;
                } else if (!this.f12581c.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.f12581c.clear();
            this.f12585g = false;
        }
    }

    @VisibleForTesting
    public final void e(int i10) {
        Preconditions.e(this.f12586h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f12586h.removeMessages(1);
        synchronized (this.f12587i) {
            this.f12585g = true;
            ArrayList arrayList = new ArrayList(this.f12580b);
            int i11 = this.f12584f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.f12583e || this.f12584f.get() != i11) {
                    break;
                } else if (this.f12580b.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i10);
                }
            }
            this.f12581c.clear();
            this.f12585g = false;
        }
    }

    public final void f(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m(onConnectionFailedListener);
        synchronized (this.f12587i) {
            if (!this.f12582d.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.f12587i) {
                if (this.f12583e && this.f12579a.isConnected() && this.f12580b.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i10);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
