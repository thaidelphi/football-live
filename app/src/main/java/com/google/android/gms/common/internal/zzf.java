package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzf extends f {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f12616g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f12617h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i10, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i10, bundle);
        this.f12617h = baseGmsClient;
        this.f12616g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final void f(ConnectionResult connectionResult) {
        if (this.f12617h.zzx != null) {
            this.f12617h.zzx.onConnectionFailed(connectionResult);
        }
        this.f12617h.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.f
    protected final boolean g() {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            IBinder iBinder = this.f12616g;
            Preconditions.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f12617h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f12617h.getServiceDescriptor();
                Log.w("GmsClient", "service descriptor mismatch: " + serviceDescriptor + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = this.f12617h.createServiceInterface(this.f12616g);
            if (createServiceInterface == null || !(BaseGmsClient.zzn(this.f12617h, 2, 4, createServiceInterface) || BaseGmsClient.zzn(this.f12617h, 3, 4, createServiceInterface))) {
                return false;
            }
            this.f12617h.zzB = null;
            BaseGmsClient baseGmsClient = this.f12617h;
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            baseConnectionCallbacks = baseGmsClient.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = this.f12617h.zzw;
                baseConnectionCallbacks2.onConnected(connectionHint);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
