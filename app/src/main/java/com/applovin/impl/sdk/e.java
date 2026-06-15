package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final j f8817a;

    /* renamed from: b  reason: collision with root package name */
    private final n f8818b;

    /* renamed from: d  reason: collision with root package name */
    private final Map f8820d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f8821e = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f8819c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(j jVar) {
        this.f8817a = jVar;
        this.f8818b = jVar.I();
        for (com.applovin.impl.q qVar : com.applovin.impl.q.a()) {
            this.f8820d.put(qVar, new p());
            this.f8821e.put(qVar, new p());
        }
    }

    private p c(com.applovin.impl.q qVar) {
        synchronized (this.f8819c) {
            p b10 = b(qVar);
            if (b10.b() > 0) {
                return b10;
            }
            return d(qVar);
        }
    }

    private p d(com.applovin.impl.q qVar) {
        p pVar;
        synchronized (this.f8819c) {
            pVar = (p) this.f8820d.get(qVar);
            if (pVar == null) {
                pVar = new p();
                this.f8820d.put(qVar, pVar);
            }
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8819c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (n.a()) {
                n nVar = this.f8818b;
                nVar.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8819c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.q qVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f8819c) {
            p d10 = d(qVar);
            if (d10.b() > 0) {
                b(qVar).a(d10.a());
                cVar = new com.applovin.impl.sdk.ad.c(qVar, this.f8817a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (n.a()) {
                n nVar = this.f8818b;
                nVar.a("AdPreloadManager", "Retrieved ad of zone " + qVar + "...");
            }
        } else if (n.a()) {
            n nVar2 = this.f8818b;
            nVar2.a("AdPreloadManager", "Unable to retrieve ad of zone " + qVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.q qVar) {
        AppLovinAdImpl d10;
        synchronized (this.f8819c) {
            d10 = c(qVar).d();
        }
        return d10;
    }

    private p b(com.applovin.impl.q qVar) {
        p pVar;
        synchronized (this.f8819c) {
            pVar = (p) this.f8821e.get(qVar);
            if (pVar == null) {
                pVar = new p();
                this.f8821e.put(qVar, pVar);
            }
        }
        return pVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.q qVar) {
        AppLovinAdImpl a10;
        synchronized (this.f8819c) {
            a10 = c(qVar).a();
        }
        return a10;
    }
}
