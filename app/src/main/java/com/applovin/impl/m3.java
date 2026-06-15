package com.applovin.impl;

import com.applovin.impl.k3;
import com.applovin.impl.l3;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m3 {

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap f7497b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap f7498c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f7499d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7500a;

    public m3(com.applovin.impl.sdk.j jVar) {
        this.f7500a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10, Long l11) {
        return l10;
    }

    private void b(k3 k3Var, l3 l3Var, k3.a aVar) {
        HashMap hashMap;
        if (a(k3Var, l3Var, aVar)) {
            String b10 = l3Var.b();
            HashMap a10 = a(l3Var.a());
            synchronized (a10) {
                if (a10.containsKey(b10)) {
                    hashMap = (HashMap) a10.get(b10);
                } else {
                    HashMap hashMap2 = new HashMap();
                    a10.put(b10, hashMap2);
                    hashMap = hashMap2;
                }
                hashMap.put(k3Var, aVar.a(hashMap.get(k3Var)));
            }
        }
    }

    public void a(k3 k3Var, l3 l3Var) {
        b(k3Var, l3Var, new k3.a() { // from class: com.applovin.impl.ad
            @Override // com.applovin.impl.k3.a
            public final Object a(Object obj) {
                Long a10;
                a10 = m3.a((Long) obj);
                return a10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10) {
        return Long.valueOf(l10 != null ? 1 + l10.longValue() : 1L);
    }

    public void a(k3 k3Var, l3 l3Var, final Long l10) {
        b(k3Var, l3Var, new k3.a() { // from class: com.applovin.impl.zc
            @Override // com.applovin.impl.k3.a
            public final Object a(Object obj) {
                Long a10;
                a10 = m3.a(l10, (Long) obj);
                return a10;
            }
        });
    }

    public Map a(k3 k3Var, l3.a aVar) {
        HashMap a10 = a(aVar);
        HashMap hashMap = new HashMap();
        synchronized (a10) {
            for (String str : a10.keySet()) {
                hashMap.put(str, ((HashMap) a10.get(str)).get(k3Var));
            }
        }
        return hashMap;
    }

    private HashMap a(l3.a aVar) {
        if (aVar == l3.a.AD_UNIT_ID) {
            return f7497b;
        }
        if (aVar == l3.a.AD_FORMAT) {
            return f7498c;
        }
        return f7499d;
    }

    private boolean a(k3 k3Var, l3 l3Var, k3.a aVar) {
        if (k3Var == null) {
            this.f7500a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f7500a.I().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        } else if (l3Var == null) {
            this.f7500a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f7500a.I().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        } else if (aVar == null) {
            this.f7500a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f7500a.I().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
            }
            return false;
        } else {
            return true;
        }
    }
}
