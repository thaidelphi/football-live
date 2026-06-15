package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@VisibleForTesting
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzjr implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f13648a;

    /* renamed from: b  reason: collision with root package name */
    private volatile zzek f13649b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzjs f13650c;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjr(zzjs zzjsVar) {
        this.f13650c = zzjsVar;
    }

    public final void b(Intent intent) {
        zzjr zzjrVar;
        this.f13650c.c();
        Context zzau = this.f13650c.f13220a.zzau();
        ConnectionTracker b10 = ConnectionTracker.b();
        synchronized (this) {
            if (this.f13648a) {
                this.f13650c.f13220a.zzay().q().a("Connection attempt already in progress");
                return;
            }
            this.f13650c.f13220a.zzay().q().a("Using local app measurement service");
            this.f13648a = true;
            zzjrVar = this.f13650c.f13651c;
            b10.a(zzau, intent, zzjrVar, 129);
        }
    }

    public final void c() {
        this.f13650c.c();
        Context zzau = this.f13650c.f13220a.zzau();
        synchronized (this) {
            if (this.f13648a) {
                this.f13650c.f13220a.zzay().q().a("Connection attempt already in progress");
            } else if (this.f13649b != null && (this.f13649b.isConnecting() || this.f13649b.isConnected())) {
                this.f13650c.f13220a.zzay().q().a("Already awaiting connection attempt");
            } else {
                this.f13649b = new zzek(zzau, Looper.getMainLooper(), this, this);
                this.f13650c.f13220a.zzay().q().a("Connecting to remote service");
                this.f13648a = true;
                Preconditions.m(this.f13649b);
                this.f13649b.checkAvailabilityAndConnect();
            }
        }
    }

    public final void d() {
        if (this.f13649b != null && (this.f13649b.isConnected() || this.f13649b.isConnecting())) {
            this.f13649b.disconnect();
        }
        this.f13649b = null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.m(this.f13649b);
                this.f13650c.f13220a.zzaz().u(new b3(this, (zzee) this.f13649b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f13649b = null;
                this.f13648a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.f("MeasurementServiceConnection.onConnectionFailed");
        zzeo z10 = this.f13650c.f13220a.z();
        if (z10 != null) {
            z10.r().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f13648a = false;
            this.f13649b = null;
        }
        this.f13650c.f13220a.zzaz().u(new d3(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Preconditions.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f13650c.f13220a.zzay().l().a("Service connection suspended");
        this.f13650c.f13220a.zzaz().u(new c3(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjr zzjrVar;
        zzee zzecVar;
        Preconditions.f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f13648a = false;
                this.f13650c.f13220a.zzay().m().a("Service connected with null binder");
                return;
            }
            zzee zzeeVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof zzee) {
                        zzecVar = (zzee) queryLocalInterface;
                    } else {
                        zzecVar = new zzec(iBinder);
                    }
                    zzeeVar = zzecVar;
                    this.f13650c.f13220a.zzay().q().a("Bound to IMeasurementService interface");
                } else {
                    this.f13650c.f13220a.zzay().m().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f13650c.f13220a.zzay().m().a("Service connect failed to get IMeasurementService");
            }
            if (zzeeVar == null) {
                this.f13648a = false;
                try {
                    ConnectionTracker b10 = ConnectionTracker.b();
                    Context zzau = this.f13650c.f13220a.zzau();
                    zzjrVar = this.f13650c.f13651c;
                    b10.c(zzau, zzjrVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f13650c.f13220a.zzaz().u(new z2(this, zzeeVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f13650c.f13220a.zzay().l().a("Service disconnected");
        this.f13650c.f13220a.zzaz().u(new a3(this, componentName));
    }
}
