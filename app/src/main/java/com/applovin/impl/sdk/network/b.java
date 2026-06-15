package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.d7;
import com.applovin.impl.k6;
import com.applovin.impl.l2;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.u5;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final j f9071a;

    /* renamed from: b  reason: collision with root package name */
    private final n f9072b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9073c;

    /* renamed from: d  reason: collision with root package name */
    private final c f9074d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f9075e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final List f9076f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f9077g;

    /* renamed from: h  reason: collision with root package name */
    private final List f9078h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements AppLovinPostbackListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f9079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f9080b;

        a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f9079a = dVar;
            this.f9080b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            n unused = b.this.f9072b;
            if (n.a()) {
                n nVar = b.this.f9072b;
                nVar.d("PersistentPostbackManager", "Failed to submit postback: " + this.f9079a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f9079a);
            l2.a(this.f9080b, str, i10);
            if (this.f9079a.c() == 1) {
                b.this.f9071a.D().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f9079a);
            n unused = b.this.f9072b;
            if (n.a()) {
                n nVar = b.this.f9072b;
                nVar.a("PersistentPostbackManager", "Successfully submit postback: " + this.f9079a);
            }
            b.this.c();
            l2.a(this.f9080b, str);
        }
    }

    public b(j jVar) {
        ArrayList arrayList = new ArrayList();
        this.f9076f = arrayList;
        this.f9077g = new HashSet();
        this.f9078h = new ArrayList();
        if (jVar != null) {
            this.f9071a = jVar;
            this.f9072b = jVar.I();
            int intValue = ((Integer) jVar.a(o4.L2)).intValue();
            this.f9073c = intValue;
            if (((Boolean) jVar.a(o4.O2)).booleanValue()) {
                c cVar = new c(this, jVar);
                this.f9074d = cVar;
                arrayList.addAll(cVar.a(intValue));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                return;
            }
            this.f9074d = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f9075e) {
            if (((Boolean) this.f9071a.a(o4.N2)).booleanValue()) {
                arrayList.ensureCapacity(this.f9078h.size());
                arrayList.addAll(this.f9078h);
            } else {
                arrayList.ensureCapacity(this.f9076f.size());
                arrayList.addAll(this.f9076f);
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f9071a.i0().a((z4) this.f9074d, u5.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f9075e) {
            while (this.f9076f.size() > this.f9073c) {
                this.f9076f.remove(0);
            }
            this.f9076f.add(dVar);
        }
        if (n.a()) {
            n nVar = this.f9072b;
            nVar.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f9075e) {
            Iterator it = new ArrayList(this.f9076f).iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f9075e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (n.a()) {
                this.f9072b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
                return;
            }
            return;
        }
        if (z10) {
            dVar.a();
        }
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(dVar, appLovinPostbackListener);
            }
        }, d7.h(), dVar.m());
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.f
            @Override // java.lang.Runnable
            public final void run() {
                b.this.e();
            }
        }, true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f9075e) {
            for (d dVar : this.f9078h) {
                b(dVar);
            }
            this.f9078h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f9075e) {
            this.f9077g.remove(dVar);
            this.f9078h.add(dVar);
        }
    }

    public void a() {
        synchronized (this.f9075e) {
            this.f9076f.clear();
            this.f9078h.clear();
        }
        this.f9071a.i0().a((z4) this.f9074d, u5.b.OTHER);
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (n.a()) {
            n nVar = this.f9072b;
            nVar.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f9071a.v0() && !dVar.m()) {
            if (n.a()) {
                this.f9072b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
            }
        } else if (TextUtils.isEmpty(dVar.k())) {
            if (n.a()) {
                this.f9072b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
            }
        } else {
            synchronized (this.f9075e) {
                if (this.f9077g.contains(dVar)) {
                    if (n.a()) {
                        n nVar2 = this.f9072b;
                        nVar2.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f9071a.a(o4.K2);
                if (dVar.c() > num.intValue()) {
                    if (n.a()) {
                        n nVar3 = this.f9072b;
                        nVar3.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f9075e) {
                    this.f9077g.add(dVar);
                }
                e a10 = e.b(this.f9071a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (n.a()) {
                    n nVar4 = this.f9072b;
                    nVar4.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f9071a.X().dispatchPostbackRequest(a10, new a(dVar, appLovinPostbackListener));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f9075e) {
            this.f9077g.remove(dVar);
            this.f9076f.remove(dVar);
        }
        if (n.a()) {
            n nVar = this.f9072b;
            nVar.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f9071a.i0().a((z4) new k6(this.f9071a, z11, "runPostbackTask", runnable), u5.b.OTHER);
            return;
        }
        runnable.run();
    }
}
