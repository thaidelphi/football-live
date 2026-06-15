package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.l3;
import com.startapp.s;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdvertisingIdResolver f23224a;

    public a(AdvertisingIdResolver advertisingIdResolver) {
        this.f23224a = advertisingIdResolver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdvertisingIdResolver advertisingIdResolver;
        s sVar;
        try {
            this.f23224a.f23217d.lock();
            try {
                AdvertisingIdResolver advertisingIdResolver2 = this.f23224a;
                AtomicReference<s> atomicReference = advertisingIdResolver2.f23219f;
                Context context = advertisingIdResolver2.f23214a;
                try {
                    sVar = AdvertisingIdResolver.a(context);
                } catch (AdvertisingIdResolver.InternalException e8) {
                    advertisingIdResolver2.b(e8.infoEventFlags);
                    try {
                        sVar = AdvertisingIdResolver.b(context);
                    } catch (AdvertisingIdResolver.InternalException e10) {
                        advertisingIdResolver2.b(e10.infoEventFlags);
                        sVar = s.f22478d;
                    }
                    atomicReference.set(sVar);
                    advertisingIdResolver = this.f23224a;
                    advertisingIdResolver.f23221h = 2;
                    this.f23224a.f23218e.signalAll();
                    this.f23224a.f23217d.unlock();
                } catch (Throwable th) {
                    if (advertisingIdResolver2.a(128)) {
                        l3.a(th);
                    }
                    sVar = AdvertisingIdResolver.b(context);
                    atomicReference.set(sVar);
                    advertisingIdResolver = this.f23224a;
                    advertisingIdResolver.f23221h = 2;
                    this.f23224a.f23218e.signalAll();
                    this.f23224a.f23217d.unlock();
                }
                atomicReference.set(sVar);
                advertisingIdResolver = this.f23224a;
            } catch (Throwable th2) {
                try {
                    if (this.f23224a.a(64)) {
                        l3.a(th2);
                    }
                    advertisingIdResolver = this.f23224a;
                } catch (Throwable th3) {
                    this.f23224a.f23221h = 2;
                    this.f23224a.f23218e.signalAll();
                    this.f23224a.f23217d.unlock();
                    throw th3;
                }
            }
            advertisingIdResolver.f23221h = 2;
            this.f23224a.f23218e.signalAll();
            this.f23224a.f23217d.unlock();
        } catch (Throwable th4) {
            this.f23224a.f23221h = 2;
            if (this.f23224a.a(16384)) {
                l3.a(th4);
            }
        }
    }
}
