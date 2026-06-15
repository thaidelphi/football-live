package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: e  reason: collision with root package name */
    private static final long f8713e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a  reason: collision with root package name */
    private final j f8714a;

    /* renamed from: b  reason: collision with root package name */
    private final n f8715b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet f8716c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final Object f8717d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0134a {
        void onAdExpired(m1 m1Var);
    }

    public a(j jVar) {
        this.f8714a = jVar;
        this.f8715b = jVar.I();
    }

    private b b(m1 m1Var) {
        synchronized (this.f8717d) {
            if (m1Var == null) {
                return null;
            }
            Iterator it = this.f8716c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (m1Var == bVar.b()) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public boolean a(m1 m1Var, InterfaceC0134a interfaceC0134a) {
        synchronized (this.f8717d) {
            if (b(m1Var) != null) {
                if (n.a()) {
                    n nVar = this.f8715b;
                    nVar.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + m1Var);
                }
                return true;
            } else if (m1Var.getTimeToLiveMillis() <= f8713e) {
                if (n.a()) {
                    n nVar2 = this.f8715b;
                    nVar2.a("AdExpirationManager", "Ad has already expired: " + m1Var);
                }
                m1Var.setExpired();
                return false;
            } else {
                if (n.a()) {
                    n nVar3 = this.f8715b;
                    nVar3.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(m1Var.getTimeToLiveMillis()) + " seconds from now for " + m1Var + "...");
                }
                if (this.f8716c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f8716c.add(b.a(m1Var, interfaceC0134a, this.f8714a));
                return true;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f8717d) {
            Iterator it = this.f8716c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                m1 b10 = bVar.b();
                if (b10 == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = b10.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (n.a()) {
                            n nVar = this.f8715b;
                            nVar.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + b10);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (n.a()) {
                            n nVar2 = this.f8715b;
                            nVar2.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + b10);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(m1 m1Var) {
        synchronized (this.f8717d) {
            b b10 = b(m1Var);
            if (b10 != null) {
                if (n.a()) {
                    n nVar = this.f8715b;
                    nVar.a("AdExpirationManager", "Cancelling expiration timer for ad: " + m1Var);
                }
                b10.a();
                a(b10);
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f8717d) {
            this.f8716c.remove(bVar);
            if (this.f8716c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.f8717d) {
            Iterator it = this.f8716c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }
}
