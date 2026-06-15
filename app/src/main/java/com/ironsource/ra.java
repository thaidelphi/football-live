package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface ra {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Object> f19937a;

        public a(String providerName) {
            Map<String, Object> i10;
            kotlin.jvm.internal.n.f(providerName, "providerName");
            i10 = j8.j0.i(i8.s.a(IronSourceConstants.EVENTS_PROVIDER, providerName), i8.s.a(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
            this.f19937a = i10;
        }

        public final Map<String, Object> a() {
            Map<String, Object> v10;
            v10 = j8.j0.v(this.f19937a);
            return v10;
        }

        public final void a(String key, Object value) {
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            this.f19937a.put(key, value);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements ra {

        /* renamed from: a  reason: collision with root package name */
        private final rf f19938a;

        /* renamed from: b  reason: collision with root package name */
        private final a f19939b;

        public b(rf eventManager, a eventBaseData) {
            kotlin.jvm.internal.n.f(eventManager, "eventManager");
            kotlin.jvm.internal.n.f(eventBaseData, "eventBaseData");
            this.f19938a = eventManager;
            this.f19939b = eventBaseData;
        }

        @Override // com.ironsource.ra
        public void a(int i10, zr zrVar) {
            Map t10;
            Map<String, Object> a10 = this.f19939b.a();
            a10.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(zrVar));
            t10 = j8.j0.t(a10);
            this.f19938a.a(new zb(i10, new JSONObject(t10)));
        }

        @Override // com.ironsource.ra
        public void a(int i10, String instanceId) {
            Map t10;
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            Map<String, Object> a10 = this.f19939b.a();
            a10.put("spId", instanceId);
            t10 = j8.j0.t(a10);
            this.f19938a.a(new zb(i10, new JSONObject(t10)));
        }
    }

    void a(int i10, zr zrVar);

    void a(int i10, String str);
}
