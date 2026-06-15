package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zaaw f12238a;

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        Lock lock3;
        lock = this.f12238a.f12269b;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock3 = this.f12238a.f12269b;
                } else {
                    b();
                    lock3 = this.f12238a.f12269b;
                }
            } catch (RuntimeException e8) {
                zabiVar = this.f12238a.f12268a;
                zabiVar.l(e8);
                lock3 = this.f12238a.f12269b;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f12238a.f12269b;
            lock2.unlock();
            throw th;
        }
    }
}
