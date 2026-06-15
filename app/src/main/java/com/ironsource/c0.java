package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c0 implements d2 {

    /* renamed from: a  reason: collision with root package name */
    private final w2 f16806a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f16807b;

    /* renamed from: c  reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f16808c;

    public c0(w2 adTools, b0 instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        this.f16806a = adTools;
        this.f16807b = instanceData;
        this.f16808c = baseAdAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    @Override // com.ironsource.d2
    public Map<String, Object> a(b2 event) {
        String str;
        kotlin.jvm.internal.n.f(event, "event");
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f16808c;
            String str2 = "";
            if (baseAdAdapter != null) {
                ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
                kotlin.jvm.internal.n.c(networkAdapter);
                str = networkAdapter.getAdapterVersion();
            } else {
                str = "";
            }
            kotlin.jvm.internal.n.e(str, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f16808c;
            if (baseAdAdapter2 != null) {
                ?? networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                kotlin.jvm.internal.n.c(networkAdapter2);
                str2 = networkAdapter2.getNetworkSDKVersion();
            }
            kotlin.jvm.internal.n.c(str2);
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(o1.a(this.f16806a, "could not get adapter version for event data " + this.f16807b.w(), (String) null, 2, (Object) null));
        }
        String i10 = this.f16807b.j().i();
        kotlin.jvm.internal.n.e(i10, "instanceData.adapterConfig.subProviderId");
        hashMap.put("spId", i10);
        String a10 = this.f16807b.j().a();
        kotlin.jvm.internal.n.e(a10, "instanceData.adapterConfig.adSourceNameForEvents");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, a10);
        hashMap.put("instanceType", Integer.valueOf(this.f16807b.s()));
        String serverData = this.f16807b.n().k();
        w2 w2Var = this.f16806a;
        kotlin.jvm.internal.n.e(serverData, "serverData");
        String e10 = w2Var.e(serverData);
        if (!TextUtils.isEmpty(e10)) {
            hashMap.put("dynamicDemandSource", e10);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.f16807b.v()));
        if (!TextUtils.isEmpty(this.f16807b.u().getCustomNetwork())) {
            String customNetwork = this.f16807b.u().getCustomNetwork();
            kotlin.jvm.internal.n.e(customNetwork, "instanceData.providerSettings.customNetwork");
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return hashMap;
    }
}
