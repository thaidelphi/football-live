package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<zaaw> f12212a;

    /* renamed from: b  reason: collision with root package name */
    private final Api<?> f12213b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12214c;

    public h(zaaw zaawVar, Api<?> api, boolean z10) {
        this.f12212a = new WeakReference<>(zaawVar);
        this.f12213b = api;
        this.f12214c = z10;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        zabi zabiVar;
        Lock lock;
        Lock lock2;
        boolean n10;
        boolean o10;
        Lock lock3;
        zaaw zaawVar = this.f12212a.get();
        if (zaawVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        zabiVar = zaawVar.f12268a;
        Preconditions.q(myLooper == zabiVar.f12323n.h(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.f12269b;
        lock.lock();
        try {
            n10 = zaawVar.n(0);
            if (n10) {
                if (!connectionResult.z0()) {
                    zaawVar.l(connectionResult, this.f12213b, this.f12214c);
                }
                o10 = zaawVar.o();
                if (o10) {
                    zaawVar.m();
                }
                lock3 = zaawVar.f12269b;
            } else {
                lock3 = zaawVar.f12269b;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = zaawVar.f12269b;
            lock2.unlock();
            throw th;
        }
    }
}
