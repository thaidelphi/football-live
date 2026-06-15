package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q0 implements zabz {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f12241a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q0(a aVar, zaw zawVar) {
        this.f12241a = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f12241a.f12180m;
        lock.lock();
        try {
            a.t(this.f12241a, bundle);
            this.f12241a.f12177j = ConnectionResult.f12002e;
            a.u(this.f12241a);
        } finally {
            lock2 = this.f12241a.f12180m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void b(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zabi zabiVar;
        lock = this.f12241a.f12180m;
        lock.lock();
        try {
            a aVar = this.f12241a;
            z11 = aVar.f12179l;
            if (!z11) {
                connectionResult = aVar.f12178k;
                if (connectionResult != null) {
                    connectionResult2 = aVar.f12178k;
                    if (connectionResult2.z0()) {
                        this.f12241a.f12179l = true;
                        zabiVar = this.f12241a.f12172e;
                        zabiVar.onConnectionSuspended(i10);
                        lock3 = this.f12241a.f12180m;
                        lock3.unlock();
                    }
                }
            }
            this.f12241a.f12179l = false;
            a.s(this.f12241a, i10, z10);
            lock3 = this.f12241a.f12180m;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f12241a.f12180m;
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void c(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f12241a.f12180m;
        lock.lock();
        try {
            this.f12241a.f12177j = connectionResult;
            a.u(this.f12241a);
        } finally {
            lock2 = this.f12241a.f12180m;
            lock2.unlock();
        }
    }
}
