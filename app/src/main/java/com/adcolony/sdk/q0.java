package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class q0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<Callable<T>> f6217a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6218b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a<T> extends Callable<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Callable<T> callable) {
        if (this.f6218b) {
            return;
        }
        this.f6217a.add(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f6217a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<T> a() {
        return a(-1L);
    }

    List<T> a(long j10) {
        List<Future<T>> invokeAll;
        this.f6218b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f6217a.size());
        ArrayList arrayList2 = new ArrayList();
        try {
            if (j10 > 0) {
                invokeAll = newFixedThreadPool.invokeAll(this.f6217a, j10, TimeUnit.MILLISECONDS);
            } else {
                invokeAll = newFixedThreadPool.invokeAll(this.f6217a);
            }
            arrayList2.addAll(invokeAll);
            newFixedThreadPool.shutdownNow();
        } catch (Exception unused) {
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Future future = (Future) arrayList2.get(i10);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f6217a.get(i10) instanceof a) {
                arrayList.add(((a) this.f6217a.get(i10)).a());
            }
        }
        return arrayList;
    }
}
