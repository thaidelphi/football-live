package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.oj;
import com.ironsource.zb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v implements AdapterNetworkData {

    /* renamed from: a  reason: collision with root package name */
    private final String f19149a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f19150b;

    public v(String networkName, JSONObject data) {
        kotlin.jvm.internal.n.f(networkName, "networkName");
        kotlin.jvm.internal.n.f(data, "data");
        this.f19149a = networkName;
        this.f19150b = new JSONObject(data.toString());
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List s10;
        s10 = j8.y.s(collection);
        ArrayList<AbstractAdapter> arrayList = new ArrayList();
        for (Object obj : s10) {
            if (c.a(this.f19149a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        for (AbstractAdapter abstractAdapter : arrayList) {
            abstractAdapter.setNetworkData(this);
        }
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List s10;
        int k10;
        s10 = j8.y.s(collection);
        ArrayList<AdapterBaseWrapper> arrayList = new ArrayList();
        for (Object obj : s10) {
            if (c.a(this.f19149a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        k10 = j8.r.k(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(k10);
        for (AdapterBaseWrapper adapterBaseWrapper : arrayList) {
            arrayList2.add(adapterBaseWrapper.getAdapterBaseInterface());
        }
        ArrayList<AdapterNetworkDataInterface> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        for (AdapterNetworkDataInterface adapterNetworkDataInterface : arrayList3) {
            adapterNetworkDataInterface.setNetworkData(this);
        }
    }

    public final String a() {
        return this.f19149a;
    }

    public final void a(Collection<? extends AbstractAdapter> adapters, Collection<? extends AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.n.f(adapters, "adapters");
        kotlin.jvm.internal.n.f(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (Exception e8) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("error while setting network data: " + e8.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject allData() {
        return this.f19150b;
    }

    public final void b() {
        a9.f c10;
        List r10;
        String A;
        Iterator<String> keys = this.f19150b.keys();
        kotlin.jvm.internal.n.e(keys, "networkData.keys()");
        c10 = a9.l.c(keys);
        r10 = a9.n.r(c10);
        A = j8.y.A(r10, ",", null, null, 0, null, null, 62, null);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        oj.i().a(new zb(57, mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, this.f19149a + " - " + A)));
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String desiredKey, Class<T> valueType) {
        a9.f c10;
        T t10;
        boolean l10;
        kotlin.jvm.internal.n.f(desiredKey, "desiredKey");
        kotlin.jvm.internal.n.f(valueType, "valueType");
        Iterator<String> keys = allData().keys();
        kotlin.jvm.internal.n.e(keys, "allData()\n          .keys()");
        c10 = a9.l.c(keys);
        Iterator<T> it = c10.iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            l10 = b9.o.l((String) t10, desiredKey, true);
            if (l10) {
                break;
            }
        }
        String str = (String) t10;
        if (str != null) {
            Object opt = allData().opt(str);
            if (!valueType.isInstance(opt)) {
                opt = null;
            }
            if (opt != null) {
                return valueType.cast(opt);
            }
            return null;
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject networkDataByAdUnit(IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        JSONObject optJSONObject = this.f19150b.optJSONObject(adUnit.toString());
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.f19149a + ", networkData=" + this.f19150b + ')';
    }
}
