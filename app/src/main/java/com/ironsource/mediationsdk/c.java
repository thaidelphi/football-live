package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.ln;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.o9;
import com.ironsource.oj;
import com.ironsource.z8;
import com.ironsource.zb;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: k  reason: collision with root package name */
    private static final String f18541k = "IronSource";

    /* renamed from: l  reason: collision with root package name */
    private static final String f18542l = "com.ironsource.adapters";

    /* renamed from: m  reason: collision with root package name */
    private static final String f18543m = "aps";

    /* renamed from: n  reason: collision with root package name */
    private static final c f18544n = new c();

    /* renamed from: o  reason: collision with root package name */
    private static final Object f18545o = new Object();

    /* renamed from: c  reason: collision with root package name */
    private String f18548c;

    /* renamed from: d  reason: collision with root package name */
    private String f18549d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f18550e;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f18553h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private z8 f18554i = new z8();

    /* renamed from: j  reason: collision with root package name */
    private final ln f18555j = new ln();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f18546a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f18547b = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentHashMap<String, List<String>> f18551f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> f18552g = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18556a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f18556a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18556a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18556a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18556a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str2) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e8) {
            String str3 = "Error while loading adapter - exception = " + e8.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            a(str3);
            return null;
        }
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : f18542l) + "." + str2;
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
            IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(baseAdapter);
            this.f18554i.a(baseAdapter, networkSettings);
            this.f18547b.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str4 = "failed to load " + str3;
                IronLog.INTERNAL.error(str4);
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
            }
            return null;
        }
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
        String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : f18542l) + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
        try {
            return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str2 = "failed to load " + str;
                IronLog.INTERNAL.error(str2);
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            }
            return null;
        }
    }

    private String a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null || TextUtils.isEmpty(ad_unit.toString())) {
            return "";
        }
        return ad_unit.toString().substring(0, 1).toUpperCase(Locale.getDefault()) + ad_unit.toString().substring(1);
    }

    private void a(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            oj.i().a(new zb(i10, jSONObject));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private void a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f18543m) || this.f18552g.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.f18552g.keySet()) {
            try {
                JSONObject jSONObject = this.f18552g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                String str = "error while setting aps data: " + e8.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
            }
        }
        this.f18552g.clear();
    }

    private void a(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
            a("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f18546a.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.f18546a.values()) {
                    if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f18543m) && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f18547b.values()) {
                if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(f18543m)) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseInterface != null) {
                        ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                    return;
                }
            }
            synchronized (f18545o) {
                this.f18552g.put(ad_unit, jSONObject2);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            String str = "error while setting APSData: " + e8.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
            a(str);
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.f18550e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e8) {
            o9.d().a(e8);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e8.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            b(str);
        }
    }

    private void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    private void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!next.equalsIgnoreCase(ad_unit.toString())) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!next.equalsIgnoreCase(ad_unit.toString())) {
                    ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                    if (next.equalsIgnoreCase(ad_unit.toString())) {
                    }
                }
            }
            a(ad_unit, optJSONObject);
        }
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.f18553h.compareAndSet(false, true)) {
            b("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.f18548c, this.f18549d, jSONObject);
            } catch (Exception e8) {
                o9.d().a(e8);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e8.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static c b() {
        return f18544n;
    }

    private String b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f18550e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                o9.d().a(th);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                b(str);
            }
        }
    }

    private void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    private String c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        String uuid2 = uuid != null ? uuid.toString() : "";
        return uuid2 + "-" + ad_unit.toString() + "-" + networkSettings.getProviderName();
    }

    private void c(AbstractAdapter abstractAdapter) {
        for (String str : this.f18551f.keySet()) {
            try {
                List<String> list = this.f18551f.get(str);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (Throwable th) {
                o9.d().a(th);
                String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                b(str2);
            }
        }
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z10) {
        String b10 = b(networkSettings);
        String providerTypeForReflection = z10 ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f18545o) {
            if (this.f18546a.containsKey(b10)) {
                return this.f18546a.get(b10);
            }
            AbstractAdapter a10 = a(b10, providerTypeForReflection);
            if (a10 == null) {
                a(b10 + " adapter was not loaded");
                return null;
            }
            a10.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
            String coreSDKVersion = a10.getCoreSDKVersion();
            b(b10 + " was allocated (adapter version: " + a10.getVersion() + ", sdk version: " + coreSDKVersion + ")");
            c(a10);
            this.f18555j.a(a10);
            a(a10);
            this.f18554i.a(a10, networkSettings);
            b(a10);
            a(jSONObject, a10, providerTypeForReflection);
            this.f18546a.put(b10, a10);
            return a10;
        }
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        BaseAdAdapter<?, ?> a10 = a(networkSettings, ad_unit);
        if (a10 != null || networkSettings.isCustomNetwork()) {
            return a10;
        }
        AbstractAdapter a11 = a(networkSettings);
        if (a11 != null) {
            return com.ironsource.mediationsdk.a.a(a11, networkSettings, ad_unit, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f18546a;
    }

    public void a(v vVar) {
        String str;
        if (vVar.allData().length() == 0) {
            str = "empty network data";
        } else if (!TextUtils.isEmpty(vVar.a())) {
            this.f18555j.a(vVar);
            vVar.a(this.f18546a.values(), this.f18547b.values());
            vVar.b();
            if (StringUtils.toLowerCase(vVar.a()).equals(f18543m)) {
                a(vVar.allData());
                return;
            }
            return;
        } else {
            str = "empty network key";
        }
        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
        a(str);
    }

    public void a(String str, List<String> list) {
        synchronized (f18545o) {
            this.f18551f.put(str, list);
            if (!this.f18546a.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter abstractAdapter : this.f18546a.values()) {
                    abstractAdapter.setMetaData(str, list);
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f18547b.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                    try {
                        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                    } catch (Exception e8) {
                        o9.d().a(e8);
                        String str2 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e8.getLocalizedMessage();
                        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        b(str2);
                    }
                }
            }
        }
    }

    public void a(boolean z10) {
        synchronized (f18545o) {
            this.f18550e = Boolean.valueOf(z10);
            for (AbstractAdapter abstractAdapter : this.f18546a.values()) {
                b(abstractAdapter);
            }
        }
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        String b10 = networkSettings.isCustomNetwork() ? b(networkSettings) : c(networkSettings, ad_unit, uuid);
        if (this.f18547b.containsKey(b10)) {
            return this.f18547b.get(b10).getAdapterBaseInterface();
        }
        AdapterBaseInterface a10 = a(b10, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (a10 != null || networkSettings.isCustomNetwork()) {
            this.f18555j.a(this.f18547b.put(b10, new AdapterBaseWrapper(a10, networkSettings)));
            return a10;
        }
        int i10 = a.f18556a[ad_unit.ordinal()];
        AbstractAdapter a11 = a(networkSettings, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : networkSettings.getNativeAdSettings() : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false);
        if (a11 != null) {
            u uVar = new u(a11);
            this.f18547b.put(b10, new AdapterBaseWrapper(uVar, networkSettings));
            return uVar;
        }
        String str = "error creating network adapter " + networkSettings.getProviderName();
        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public void b(String str, String str2) {
        this.f18548c = str;
        this.f18549d = str2;
    }

    public void b(boolean z10) {
        synchronized (f18545o) {
            this.f18554i.a(z10);
            this.f18554i.a(this.f18546a, this.f18547b);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f18551f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> d() {
        return this.f18547b;
    }

    public void e() {
        this.f18546a.clear();
        this.f18547b.clear();
    }
}
