package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f9564a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9565b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f9566c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f9567d = new AtomicInteger();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f9568a;

        /* renamed from: b  reason: collision with root package name */
        private final b f9569b;

        /* renamed from: c  reason: collision with root package name */
        private final long f9570c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                String str = this.f9568a;
                String str2 = ((c) obj).f9568a;
                return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f9568a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f9568a + "', countdownStepMillis=" + this.f9570c + '}';
        }

        private c(String str, long j10, b bVar) {
            this.f9568a = str;
            this.f9570c = j10;
            this.f9569b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f9569b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f9570c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f9568a;
        }
    }

    public x0(Handler handler, com.applovin.impl.sdk.j jVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (jVar != null) {
            this.f9565b = handler;
            this.f9564a = jVar.I();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9564a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f9566c.clear();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f9566c);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9564a;
            nVar.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f9567d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9564a;
                nVar2.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + incrementAndGet + "...");
            }
            a(cVar, incrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9564a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f9567d.incrementAndGet();
        this.f9565b.removeCallbacksAndMessages(null);
    }

    public void a(String str, long j10, b bVar) {
        if (j10 > 0) {
            if (this.f9565b != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9564a;
                    nVar.a("CountdownManager", "Adding countdown: " + str);
                }
                this.f9566c.add(new c(str, j10, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b a10 = cVar.a();
        if (a10.b()) {
            if (this.f9567d.get() == i10) {
                try {
                    a10.a();
                    a(cVar, i10);
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.f9564a;
                        nVar.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9564a;
                nVar2.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar3 = this.f9564a;
            nVar3.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    private void a(final c cVar, final int i10) {
        this.f9565b.postDelayed(new Runnable() { // from class: com.applovin.impl.nf
            @Override // java.lang.Runnable
            public final void run() {
                x0.this.b(cVar, i10);
            }
        }, cVar.b());
    }
}
