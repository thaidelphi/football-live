package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z8 {

    /* renamed from: a  reason: collision with root package name */
    private Boolean f21633a;

    /* renamed from: b  reason: collision with root package name */
    private final nf f21634b = mm.f19249r.d().f();

    private final Boolean a(NetworkSettings networkSettings) {
        return (networkSettings == null || networkSettings.isCustomNetwork()) ? this.f21633a : networkSettings.getApplicationSettings().has(a9.f16279a) ? Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(a9.f16279a)) : this.f21633a;
    }

    private final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            oj.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public final Boolean a() {
        return this.f21633a;
    }

    public final void a(int i10) {
        String b10;
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            String K = this.f21634b.K(ContextProvider.getInstance().getApplicationContext());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, i10 + ';' + K);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            b10 = i8.b.b(e8);
            ironLog.error(b10);
        }
        ar.i().a(new zb(42, mediationAdditionalData));
    }

    public final void a(int i10, ConcurrentHashMap<String, NetworkSettings> providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        String K = this.f21634b.K(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + K);
        ironLog.general("CMP ID: " + i10);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> values = providerSettings.values();
        kotlin.jvm.internal.n.e(values, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            boolean z10 = false;
            if (networkSettings.getProviderDefaultInstance() != null && !kotlin.jvm.internal.n.a(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                JSONObject applicationSettings = networkSettings.getApplicationSettings();
                if (applicationSettings != null && applicationSettings.has(a9.f16279a)) {
                    z10 = true;
                }
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<NetworkSettings> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (NetworkSettings networkSettings2 : arrayList2) {
            IronLog ironLog2 = IronLog.API;
            StringBuilder sb = new StringBuilder();
            sb.append(networkSettings2.getProviderDefaultInstance());
            sb.append(": ");
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            sb.append(applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(a9.f16279a)) : null);
            ironLog2.general(sb.toString());
        }
    }

    public final void a(AbstractAdapter adapter, NetworkSettings networkSettings) {
        kotlin.jvm.internal.n.f(adapter, "adapter");
        try {
            Boolean a10 = a(networkSettings);
            if (a10 != null) {
                adapter.setNewConsent(a10.booleanValue());
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "error while setting consent of " + adapter.getProviderName() + ": " + th.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(AdapterBaseInterface adapter, NetworkSettings networkSettings) {
        kotlin.jvm.internal.n.f(adapter, "adapter");
        try {
            Boolean a10 = a(networkSettings);
            if (a10 == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(a10.booleanValue());
        } catch (Throwable th) {
            o9.d().a(th);
            StringBuilder sb = new StringBuilder();
            sb.append("error while setting consent of ");
            sb.append(networkSettings != null ? networkSettings.getProviderName() : null);
            sb.append(": ");
            sb.append(th.getLocalizedMessage());
            String sb2 = sb.toString();
            a(sb2);
            IronLog.INTERNAL.error(sb2);
        }
    }

    public final void a(ConcurrentHashMap<String, AbstractAdapter> adapters, ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) {
        i8.w wVar;
        kotlin.jvm.internal.n.f(adapters, "adapters");
        kotlin.jvm.internal.n.f(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            kotlin.jvm.internal.n.e(adapter, "adapter");
            a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                wVar = i8.w.f26638a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(boolean z10) {
        this.f21633a = Boolean.valueOf(z10);
    }

    public final nf b() {
        return this.f21634b;
    }
}
