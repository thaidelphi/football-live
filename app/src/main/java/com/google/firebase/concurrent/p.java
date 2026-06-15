package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledFuture<?> f14839h;

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.q(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.p(v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b<T> {
        void a(Throwable th);

        void set(T t10);
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(c<V> cVar) {
        this.f14839h = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void b() {
        this.f14839h.cancel(s());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f14839h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: v */
    public int compareTo(Delayed delayed) {
        return this.f14839h.compareTo(delayed);
    }
}
