package com.ironsource;

import com.ironsource.bi;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class us implements bi, bi.a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, x> f21069a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final pn f21070b = new pn();

    /* renamed from: c  reason: collision with root package name */
    private final ReadWriteLock f21071c = new ReentrantReadWriteLock();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21072a;

        static {
            int[] iArr = new int[ts.values().length];
            try {
                iArr[ts.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ts.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21072a = iArr;
        }
    }

    private final void b() {
        ss configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        pn pnVar = this.f21070b;
        kotlin.jvm.internal.n.e(configuration, "configuration");
        pnVar.a(a(configuration));
        this.f21070b.a(a());
    }

    @Override // com.ironsource.bi
    public int a(IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f21071c.readLock().lock();
        try {
            x xVar = this.f21069a.get(adFormat.toString());
            return xVar != null ? xVar.a() : 0;
        } finally {
            this.f21071c.readLock().unlock();
        }
    }

    @Override // com.ironsource.bi
    public List<String> a() {
        List<String> M;
        this.f21071c.readLock().lock();
        try {
            Map<String, x> map = this.f21069a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, x> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            M = j8.y.M(linkedHashMap.keySet());
            return M;
        } finally {
            this.f21071c.readLock().unlock();
        }
    }

    @Override // com.ironsource.bi
    public Map<String, JSONObject> a(ss configuration) {
        Map<String, JSONObject> i10;
        kotlin.jvm.internal.n.f(configuration, "configuration");
        this.f21071c.readLock().lock();
        try {
            int i11 = a.f21072a[configuration.a().ordinal()];
            if (i11 == 1) {
                i10 = j8.j0.i(i8.s.a(fe.f17457u1, a(et.FullHistory)), i8.s.a(fe.f17460v1, a(et.CurrentlyLoadedAds)));
            } else if (i11 == 2) {
                i10 = j8.j0.i(i8.s.a(fe.f17460v1, a(et.CurrentlyLoadedAds)));
            } else if (i11 != 3) {
                throw new i8.l();
            } else {
                i10 = j8.j0.f();
            }
            return i10;
        } finally {
            this.f21071c.readLock().unlock();
        }
    }

    @Override // com.ironsource.bi
    public JSONObject a(et mode) {
        kotlin.jvm.internal.n.f(mode, "mode");
        this.f21071c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, x> entry : this.f21069a.entrySet()) {
                String key = entry.getKey();
                JSONObject a10 = entry.getValue().a(mode);
                if (a10.length() > 0) {
                    jSONObject.put(key, a10);
                }
            }
            return jSONObject;
        } finally {
            this.f21071c.readLock().unlock();
        }
    }

    @Override // com.ironsource.bi.a
    public void a(vs historyRecord) {
        kotlin.jvm.internal.n.f(historyRecord, "historyRecord");
        this.f21071c.writeLock().lock();
        try {
            o0 a10 = historyRecord.a();
            String valueOf = String.valueOf(a10 != null ? a10.b() : null);
            Map<String, x> map = this.f21069a;
            x xVar = map.get(valueOf);
            if (xVar == null) {
                xVar = new x();
                map.put(valueOf, xVar);
            }
            xVar.a(historyRecord.a(new bt()));
            this.f21071c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.f21071c.writeLock().unlock();
            throw th;
        }
    }
}
