package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.k6;
import com.applovin.impl.o4;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final j f8811a;

    /* renamed from: b  reason: collision with root package name */
    private final c f8812b;

    /* renamed from: c  reason: collision with root package name */
    private final List f8813c = Collections.synchronizedList(new ArrayList());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(j jVar) {
        this.f8811a = jVar;
        this.f8812b = new c(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(c.a aVar) {
        if (aVar == null) {
            this.f8811a.I();
            if (n.a()) {
                this.f8811a.I().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f8813c.add(aVar);
        if (((Boolean) this.f8811a.a(o4.Y0)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8811a.h0().b(q4.C);
        this.f8812b.a();
    }

    private void e() {
        String str = (String) this.f8811a.h0().a(q4.C);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            c.a a10 = c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f8811a);
            if (a10 != null) {
                if (a(a10)) {
                    long c10 = a10.c() - SystemClock.elapsedRealtime();
                    this.f8811a.D().d(y1.H, CollectionUtils.map("details", "ttl = " + c10 + "ms"));
                } else {
                    this.f8813c.add(0, a10);
                }
            }
        }
    }

    private void f() {
        this.f8811a.i0().a((z4) new k6(this.f8811a, "loadPersistedAdFilesQueueAndCleanupAsync", new Runnable() { // from class: com.applovin.impl.sdk.f0
            @Override // java.lang.Runnable
            public final void run() {
                d.this.c();
            }
        }), u5.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f8813c) {
            for (c.a aVar : this.f8813c) {
                arrayList.add(aVar.a());
            }
        }
        this.f8811a.h0().b(q4.C, new JSONArray((Collection) arrayList).toString());
    }

    public void a(final com.applovin.impl.q qVar, final a aVar) {
        if (aVar == null) {
            this.f8811a.I();
            if (n.a()) {
                this.f8811a.I().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            com.applovin.impl.f1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
        } else if (qVar == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
        } else {
            this.f8811a.D().a(y1.E, qVar, (AppLovinError) null);
            final c.a a10 = a(qVar.g());
            this.f8812b.a(a10, new c.InterfaceC0136c() { // from class: com.applovin.impl.sdk.e0
                @Override // com.applovin.impl.sdk.c.InterfaceC0136c
                public final void a(com.applovin.impl.sdk.ad.b bVar, String str) {
                    d.this.a(aVar, a10, qVar, bVar, str);
                }
            });
        }
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    public void g() {
        this.f8811a.i0().a((z4) new k6(this.f8811a, "resetManagerState", new Runnable() { // from class: com.applovin.impl.sdk.g0
            @Override // java.lang.Runnable
            public final void run() {
                d.this.d();
            }
        }), u5.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    private void d(c.a aVar) {
        if (aVar != null && this.f8813c.remove(aVar)) {
            this.f8812b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f8811a.D().a(y1.B, bVar);
        this.f8812b.b(bVar, new c.b() { // from class: com.applovin.impl.sdk.d0
            @Override // com.applovin.impl.sdk.c.b
            public final void a(c.a aVar) {
                d.this.c(aVar);
            }
        });
    }

    private boolean b(c.a aVar) {
        long b10 = aVar.b();
        return (b10 == 0 || b10 == j.l()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, c.a aVar2, com.applovin.impl.q qVar, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, qVar, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(c.a.a(bVar));
    }

    private c.a a(AppLovinAdType appLovinAdType) {
        c.a aVar;
        synchronized (this.f8813c) {
            Iterator it = this.f8813c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (c.a) it.next();
                if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                    break;
                }
            }
            this.f8813c.remove(aVar);
        }
        return aVar;
    }

    private void a(a aVar, c.a aVar2, com.applovin.impl.q qVar, String str) {
        if (aVar == null) {
            return;
        }
        this.f8811a.I();
        if (n.a()) {
            this.f8811a.I().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f8812b.b(aVar2);
        this.f8811a.D().a(y1.G, qVar, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f8811a.I();
        if (n.a()) {
            this.f8811a.I().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f8812b.b(aVar2);
        this.f8811a.D().a(y1.F, bVar);
    }

    private boolean a(c.a aVar) {
        return SystemClock.elapsedRealtime() + ((Long) this.f8811a.a(o4.f8069a1)).longValue() >= aVar.c();
    }

    private void a() {
        synchronized (this.f8813c) {
            this.f8812b.a(new ArrayList(this.f8813c));
        }
    }
}
