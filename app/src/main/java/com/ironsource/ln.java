package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ln {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, JSONObject> f18247a;

    public ln() {
        this(null, 1, null);
    }

    public ln(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.n.f(networkDataMap, "networkDataMap");
        this.f18247a = networkDataMap;
    }

    public /* synthetic */ ln(ConcurrentHashMap concurrentHashMap, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ln a(ln lnVar, ConcurrentHashMap concurrentHashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = lnVar.f18247a;
        }
        return lnVar.a(concurrentHashMap);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f18247a;
    }

    public final ln a(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.n.f(networkDataMap, "networkDataMap");
        return new ln(networkDataMap);
    }

    public final void a(AbstractAdapter adapter) {
        kotlin.jvm.internal.n.f(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> entrySet = this.f18247a.entrySet();
        kotlin.jvm.internal.n.e(entrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            kotlin.jvm.internal.n.e(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.n.e(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.v((String) key, (JSONObject) value));
        }
    }

    public final void a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> entrySet = this.f18247a.entrySet();
        kotlin.jvm.internal.n.e(entrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            kotlin.jvm.internal.n.d(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            kotlin.jvm.internal.n.e(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.n.e(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.v((String) key, (JSONObject) value));
        }
    }

    public final void a(com.ironsource.mediationsdk.v networkData) {
        kotlin.jvm.internal.n.f(networkData, "networkData");
        if (!this.f18247a.containsKey(networkData.a())) {
            this.f18247a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f18247a;
            String a10 = networkData.a();
            JSONObject jSONObject = this.f18247a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject deepMergeJSONObjects = IronSourceUtils.deepMergeJSONObjects(jSONObject, networkData.allData());
            kotlin.jvm.internal.n.e(deepMergeJSONObjects, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(a10, deepMergeJSONObjects);
        } catch (Exception e8) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("error while merging network data: " + e8.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln) && kotlin.jvm.internal.n.a(this.f18247a, ((ln) obj).f18247a);
    }

    public int hashCode() {
        return this.f18247a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f18247a + ')';
    }
}
