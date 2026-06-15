package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private final zabf f12242a;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(zabf zabfVar) {
        this.f12242a = zabfVar;
    }

    protected abstract void a();

    public final void b(zabi zabiVar) {
        Lock lock;
        Lock lock2;
        zabf zabfVar;
        Lock lock3;
        lock = zabiVar.f12310a;
        lock.lock();
        try {
            zabfVar = zabiVar.f12320k;
            if (zabfVar != this.f12242a) {
                lock3 = zabiVar.f12310a;
            } else {
                a();
                lock3 = zabiVar.f12310a;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = zabiVar.f12310a;
            lock2.unlock();
            throw th;
        }
    }
}
