package com.ironsource;

import com.ironsource.p0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class r0 implements p0, p0.a {

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f19915a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, o0> f19916b;

    public r0() {
        this(null, 1, null);
    }

    public r0(ReadWriteLock readWriteLock) {
        kotlin.jvm.internal.n.f(readWriteLock, "readWriteLock");
        this.f19915a = readWriteLock;
        this.f19916b = new LinkedHashMap();
    }

    public /* synthetic */ r0(ReadWriteLock readWriteLock, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.p0
    public o0 a(String adId) {
        kotlin.jvm.internal.n.f(adId, "adId");
        this.f19915a.readLock().lock();
        try {
            return this.f19916b.get(adId);
        } finally {
            this.f19915a.readLock().unlock();
        }
    }

    @Override // com.ironsource.p0
    public List<o0> a() {
        List<o0> M;
        this.f19915a.readLock().lock();
        M = j8.y.M(this.f19916b.values());
        this.f19915a.readLock().unlock();
        return M;
    }

    @Override // com.ironsource.p0.a
    public void a(n1 adStatus, String adId) {
        kotlin.jvm.internal.n.f(adStatus, "adStatus");
        kotlin.jvm.internal.n.f(adId, "adId");
        this.f19915a.writeLock().lock();
        try {
            o0 o0Var = this.f19916b.get(adId);
            if (o0Var != null) {
                o0Var.a(adStatus);
                o0Var.a(System.currentTimeMillis() / 1000.0d);
            }
        } finally {
            this.f19915a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.p0.a
    public void a(o0 adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f19915a.writeLock().lock();
        try {
            if (this.f19916b.get(adInfo.c()) == null) {
                this.f19916b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.f19915a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.p0.a
    public void a(JSONObject json, n1 adStatus, String adId) {
        kotlin.jvm.internal.n.f(json, "json");
        kotlin.jvm.internal.n.f(adStatus, "adStatus");
        kotlin.jvm.internal.n.f(adId, "adId");
        this.f19915a.writeLock().lock();
        try {
            o0 o0Var = this.f19916b.get(adId);
            if (o0Var != null) {
                String bundleId = json.optString("bundleId");
                kotlin.jvm.internal.n.e(bundleId, "bundleId");
                boolean z10 = true;
                if (bundleId.length() > 0) {
                    o0Var.a(bundleId);
                }
                String dynamicDemandSourceId = json.optString("dynamicDemandSource");
                kotlin.jvm.internal.n.e(dynamicDemandSourceId, "dynamicDemandSourceId");
                if (dynamicDemandSourceId.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    o0Var.a(ig.f17828b.a(dynamicDemandSourceId));
                }
                o0Var.a(adStatus);
            }
        } finally {
            this.f19915a.writeLock().unlock();
        }
    }
}
