package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.startapp.a1;
import com.startapp.b1;
import com.startapp.common.parser.TypeInfo;
import com.startapp.f2;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.p2;
import com.startapp.q;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.insight.NetworkTestsMetaData;
import com.startapp.sdk.sensors.SensorsData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import com.startapp.y;
import com.startapp.z0;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MetaData implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f23151d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f23152e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public static final HashSet f23153f = new HashSet(Arrays.asList(Constants.f23213a));

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f23154g = Arrays.asList("https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/");

    /* renamed from: h  reason: collision with root package name */
    public static final String f23155h = "https://req.startappservice.com/1.5/";

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f23156i = {60, 60, 240};

    /* renamed from: j  reason: collision with root package name */
    public static final HashSet f23157j = new HashSet(Arrays.asList("com.facebook.katana", "com.yandex.browser"));

    /* renamed from: k  reason: collision with root package name */
    public static volatile MetaData f23158k = new MetaData();

    /* renamed from: l  reason: collision with root package name */
    public static com.startapp.sdk.adsbase.remoteconfig.a f23159l = null;
    private static final long serialVersionUID = 2443409898977358749L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    private boolean SupportIABViewability;

    /* renamed from: a  reason: collision with root package name */
    public transient boolean f23160a;
    @TypeInfo(complex = true, name = "debug")
    private AdDebuggerMetadata adDebugger;
    private String adPlatformBannerHostSecured;
    public String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private String adPlatformReturnHostSecured;
    private String adPlatformSplashHostSecured;
    @TypeInfo(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;
    @TypeInfo(complex = true)
    public AnalyticsConfig analytics;
    @TypeInfo(complex = true)
    private ANRRemoteConfig anrConfig;
    @TypeInfo(complex = true)
    private AppSessionConfig appSession;
    private String assetsBaseUrlSecured;

    /* renamed from: b  reason: collision with root package name */
    public transient boolean f23161b;
    @TypeInfo(complex = true)
    private BluetoothConfig btConfig;

    /* renamed from: c  reason: collision with root package name */
    public transient List<c> f23162c;
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;
    @TypeInfo(complex = true)
    private ConnectivityHelperMetadata connectivity;
    @TypeInfo(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;
    private double flh;
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig httpClientInfoEvents;
    @TypeInfo(complex = true)
    private ImpressionsTrackingMetadata impressionsTracking;
    private boolean inAppBrowser;
    @TypeInfo(type = HashSet.class)
    private Set<String> installersList;
    private boolean isToken1Mandatory;
    private String lastVersion;
    @TypeInfo(complex = true)
    private LocationMetadata location;
    private String metadataUpdateVersion;
    @TypeInfo(complex = true)
    private MotionMetadata motion;
    @TypeInfo(complex = true)
    private MraidMetadata mraid;
    @TypeInfo(complex = true)
    private NetworkDiagnosticConfig netDiag;
    @TypeInfo(complex = true)
    private NetworkTestsMetaData networkTests;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;
    @TypeInfo(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;
    @TypeInfo(complex = true)
    private RcdMetadata rcd;
    @TypeInfo(complex = true)
    private RscMetadata rsc;
    @TypeInfo(complex = true)
    private SensorsConfig sensorsConfig;
    @TypeInfo(complex = true)
    private SensorsData sensorsData;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;
    @TypeInfo(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;
    @TypeInfo(complex = true)
    private TelephonyMetadata telephony;
    @TypeInfo(complex = true)
    private TopicsClientMetadata topics;
    public String trackDownloadHost;
    @TypeInfo(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;
    private String vastRecorderHost;
    @TypeInfo(complex = true, name = "wvf")
    private WvfMetadata webViewFactory;
    private boolean webViewSecured;
    @TypeInfo(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();
    @TypeInfo(type = ArrayList.class)
    public List<String> metaDataHosts = f23154g;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements b1.b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f23163a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23164b;

        public a(Context context, String str) {
            this.f23163a = context;
            this.f23164b = str;
        }

        @Override // com.startapp.b1.b
        public final void a(Bitmap bitmap, int i10) {
            if (bitmap != null) {
                Context context = this.f23163a;
                String str = this.f23164b;
                ConcurrentHashMap concurrentHashMap = a1.f21748a;
                com.startapp.sdk.components.a.a(context).A.a().execute(new z0(context, bitmap, str));
            }
        }
    }

    public MetaData() {
        String str = f23155h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f23153f;
        this.preInstalledPackages = f23157j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = f23156i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1L;
        this.IABVideoImpressionDelayInSeconds = 2L;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = "";
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f23160a = false;
        this.f23161b = false;
        this.f23162c = new ArrayList();
        this.metadataUpdateVersion = "4.11.5";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.networkTests = new NetworkTestsMetaData();
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
        this.impressionsTracking = null;
        this.connectivity = new ConnectivityHelperMetadata();
        this.appSession = new AppSessionConfig();
        this.topics = null;
        this.mraid = null;
    }

    public static void a(MetaData metaData) {
        synchronized (f23151d) {
            metaData.f23162c.addAll(f23158k.f23162c);
            f23158k = metaData;
        }
    }

    public static MetaData w() {
        return f23158k;
    }

    public final MraidMetadata A() {
        return this.mraid;
    }

    public final NetworkDiagnosticConfig B() {
        return this.netDiag;
    }

    public final NetworkTestsMetaData C() {
        return this.networkTests;
    }

    public final int D() {
        return this.notVisibleBannerReloadInterval;
    }

    public final int E() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public final Set<String> F() {
        Set set = this.preInstalledPackages;
        if (set == null) {
            set = f23157j;
        }
        return Collections.unmodifiableSet(set);
    }

    public final String G() {
        return this.profileId;
    }

    public final RcdMetadata H() {
        return this.rcd;
    }

    public final RscMetadata I() {
        return this.rsc;
    }

    public final SensorsConfig J() {
        return this.sensorsConfig;
    }

    public final SensorsData K() {
        return this.sensorsData;
    }

    public final long L() {
        return TimeUnit.SECONDS.toMillis(this.sessionMaxBackgroundTime);
    }

    public final SimpleTokenConfig M() {
        return this.SimpleToken;
    }

    public final StaleDcConfig N() {
        return this.staleDc;
    }

    public final int O() {
        return this.stopAutoLoadAmount;
    }

    public final int P() {
        return this.stopAutoLoadPreCacheAmount;
    }

    public final TelephonyMetadata Q() {
        return this.telephony;
    }

    public final TopicsClientMetadata R() {
        return this.topics;
    }

    public final String S() {
        return this.vastRecorderHost;
    }

    public final WvfMetadata T() {
        return this.webViewFactory;
    }

    public final boolean U() {
        return this.alwaysSendToken;
    }

    public final boolean V() {
        return this.compressionEnabled;
    }

    public final boolean W() {
        WeakHashMap weakHashMap = o9.f22359a;
        return this.inAppBrowser;
    }

    public final boolean X() {
        return this.omSdkEnabled;
    }

    public final boolean Y() {
        return this.periodicForegroundEventSec != null;
    }

    public final boolean Z() {
        return this.periodicInfoEventEnabled;
    }

    public final boolean a0() {
        return this.periodicMetaDataEnabled;
    }

    public final int b(Context context) {
        int[] iArr = this.periodicEventIntMin;
        if (iArr == null || iArr.length < 3) {
            iArr = f23156i;
        }
        if (y.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i10 = iArr[0];
            return i10 <= 0 ? f23156i[0] : i10;
        } else if (y.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            int i11 = iArr[1];
            return i11 <= 0 ? f23156i[1] : i11;
        } else {
            return iArr[2];
        }
    }

    public final boolean b0() {
        return this.SupportIABViewability;
    }

    public final AdDebuggerMetadata c() {
        return this.adDebugger;
    }

    public final boolean c0() {
        return this.isToken1Mandatory;
    }

    public final String d() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : f23155h;
    }

    public final AdvertisingIdResolverMetadata e() {
        return this.air;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        return this.sessionMaxBackgroundTime == metaData.sessionMaxBackgroundTime && this.simpleToken2 == metaData.simpleToken2 && this.alwaysSendToken == metaData.alwaysSendToken && this.isToken1Mandatory == metaData.isToken1Mandatory && this.compressionEnabled == metaData.compressionEnabled && this.periodicMetaDataEnabled == metaData.periodicMetaDataEnabled && this.periodicMetaDataIntervalInMinutes == metaData.periodicMetaDataIntervalInMinutes && this.periodicInfoEventEnabled == metaData.periodicInfoEventEnabled && this.inAppBrowser == metaData.inAppBrowser && this.SupportIABViewability == metaData.SupportIABViewability && this.IABDisplayImpressionDelayInSeconds == metaData.IABDisplayImpressionDelayInSeconds && this.IABVideoImpressionDelayInSeconds == metaData.IABVideoImpressionDelayInSeconds && this.notVisibleBannerReloadInterval == metaData.notVisibleBannerReloadInterval && this.dns == metaData.dns && this.stopAutoLoadAmount == metaData.stopAutoLoadAmount && this.stopAutoLoadPreCacheAmount == metaData.stopAutoLoadPreCacheAmount && this.trueNetEnabled == metaData.trueNetEnabled && this.webViewSecured == metaData.webViewSecured && this.omSdkEnabled == metaData.omSdkEnabled && this.chromeCustomeTabsInternal == metaData.chromeCustomeTabsInternal && this.chromeCustomeTabsExternal == metaData.chromeCustomeTabsExternal && this.closeAdAfterClick == metaData.closeAdAfterClick && this.disableSendAdvertisingId == metaData.disableSendAdvertisingId && Double.compare(this.flh, metaData.flh) == 0 && o9.a(this.SimpleToken, metaData.SimpleToken) && o9.a(this.consentDetails, metaData.consentDetails) && o9.a(this.calcProd, metaData.calcProd) && o9.a(this.metaDataHosts, metaData.metaDataHosts) && o9.a(this.adPlatformHostSecured, metaData.adPlatformHostSecured) && o9.a(this.trackDownloadHost, metaData.trackDownloadHost) && o9.a(this.vastRecorderHost, metaData.vastRecorderHost) && o9.a(this.adPlatformBannerHostSecured, metaData.adPlatformBannerHostSecured) && o9.a(this.adPlatformSplashHostSecured, metaData.adPlatformSplashHostSecured) && o9.a(this.adPlatformReturnHostSecured, metaData.adPlatformReturnHostSecured) && o9.a(this.adPlatformOverlayHostSecured, metaData.adPlatformOverlayHostSecured) && o9.a(this.adPlatformNativeHostSecured, metaData.adPlatformNativeHostSecured) && o9.a(this.profileId, metaData.profileId) && o9.a(this.installersList, metaData.installersList) && o9.a(this.preInstalledPackages, metaData.preInstalledPackages) && Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) && Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) && o9.a(this.sensorsConfig, metaData.sensorsConfig) && o9.a(this.btConfig, metaData.btConfig) && o9.a(this.assetsBaseUrlSecured, metaData.assetsBaseUrlSecured) && o9.a(this.httpClientInfoEvents, metaData.httpClientInfoEvents) && o9.a(this.analytics, metaData.analytics) && o9.a(this.metadataUpdateVersion, metaData.metadataUpdateVersion) && o9.a(this.networkTests, metaData.networkTests) && o9.a(this.triggeredLinks, metaData.triggeredLinks) && o9.a(this.rsc, metaData.rsc) && o9.a(this.rcd, metaData.rcd) && o9.a(this.netDiag, metaData.netDiag) && o9.a(this.staleDc, metaData.staleDc) && o9.a(this.motion, metaData.motion) && o9.a(this.sensorsData, metaData.sensorsData) && o9.a(this.air, metaData.air) && o9.a(this.telephony, metaData.telephony) && o9.a(this.anrConfig, metaData.anrConfig) && o9.a(this.location, metaData.location) && o9.a(this.impressionsTracking, metaData.impressionsTracking) && o9.a(this.connectivity, metaData.connectivity) && o9.a(this.adDebugger, metaData.adDebugger) && o9.a(this.webViewFactory, metaData.webViewFactory) && o9.a(this.appSession, metaData.appSession) && o9.a(this.topics, metaData.topics) && o9.a(this.mraid, metaData.mraid) && o9.a(this.lastVersion, metaData.lastVersion);
    }

    public final ANRRemoteConfig f() {
        return this.anrConfig;
    }

    public final AppSessionConfig g() {
        return this.appSession;
    }

    public final String h() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : "";
    }

    public final int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformSplashHostSecured, this.adPlatformReturnHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.assetsBaseUrlSecured, this.httpClientInfoEvents, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), Double.valueOf(this.flh), this.networkTests, this.triggeredLinks, this.rsc, this.rcd, this.netDiag, this.staleDc, this.motion, this.sensorsData, this.air, this.telephony, this.anrConfig, this.location, this.impressionsTracking, this.connectivity, this.adDebugger, this.webViewFactory, this.appSession, this.topics, this.mraid, this.lastVersion};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final BluetoothConfig i() {
        return this.btConfig;
    }

    public final String j() {
        return this.calcProd;
    }

    public final boolean k() {
        return this.chromeCustomeTabsExternal;
    }

    public final boolean l() {
        return this.chromeCustomeTabsInternal;
    }

    public final boolean m() {
        return this.closeAdAfterClick;
    }

    public final ConnectivityHelperMetadata n() {
        return this.connectivity;
    }

    public final ConsentConfig o() {
        return this.consentDetails;
    }

    public final boolean p() {
        return this.disableSendAdvertisingId;
    }

    public final String q() {
        int indexOf;
        String d10 = f23158k.d();
        String str = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? HttpRequest.DEFAULT_SCHEME : "http";
        if (d10.startsWith(str.concat("://")) || (indexOf = d10.indexOf(58)) == -1) {
            return d10;
        }
        return str + d10.substring(indexOf);
    }

    public final ComponentInfoEventConfig r() {
        return this.httpClientInfoEvents;
    }

    public final long s() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public final long t() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public final ImpressionsTrackingMetadata u() {
        return this.impressionsTracking;
    }

    public final Set<String> v() {
        return this.installersList;
    }

    public final String x() {
        return this.lastVersion;
    }

    public final LocationMetadata y() {
        return this.location;
    }

    public final MotionMetadata z() {
        return this.motion;
    }

    public static void c(Context context) {
        if (f23152e.getAndSet(true)) {
            return;
        }
        MetaData metaData = (MetaData) g2.c(context, "StartappMetadata");
        MetaData metaData2 = new MetaData();
        if (metaData != null) {
            boolean a10 = o9.a((Serializable) metaData, (Serializable) metaData2);
            if (!(true ^ "4.11.5".equals(metaData.metadataUpdateVersion)) && a10) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "metadata_null";
                l3Var.a();
            }
            metaData.f23160a = false;
            metaData.f23161b = false;
            metaData.f23162c = new ArrayList();
            a(metaData);
        } else {
            synchronized (f23151d) {
                metaData2.f23162c.addAll(f23158k.f23162c);
                f23158k = metaData2;
            }
        }
        f23158k.a();
    }

    public static void a(Context context, MetaData metaData, MetaDataRequest.RequestReason requestReason, boolean z10) {
        ArrayList arrayList;
        synchronized (f23151d) {
            arrayList = new ArrayList(f23158k.f23162c);
            f23158k.f23162c.clear();
            metaData.f23162c = f23158k.f23162c;
            metaData.a();
            metaData.metadataUpdateVersion = "4.11.5";
            com.startapp.sdk.components.a.a(context).A.a().execute(new f2(context, "StartappMetadata", metaData));
            metaData.f23160a = false;
            metaData.f23161b = true;
            if (!o9.a(f23158k, metaData)) {
                z10 = true;
            }
            f23158k = metaData;
            if (o9.e(context)) {
                e a10 = com.startapp.sdk.components.a.a(context).E.a();
                a10.edit().putInt("totalSessions", a10.getInt("totalSessions", 0) + 1).apply();
            }
            f23159l = null;
        }
        boolean z11 = Math.random() < f23158k.flh;
        Handler handler = z11 ? new Handler(Looper.getMainLooper()) : null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (z11) {
                handler.post(new b(cVar, requestReason, z10));
            } else {
                cVar.a(requestReason, z10);
            }
        }
    }

    public final boolean b() {
        return !this.dns;
    }

    public static void a(MetaDataRequest.RequestReason requestReason) {
        ArrayList arrayList;
        synchronized (f23151d) {
            arrayList = new ArrayList(f23158k.f23162c);
            f23158k.f23162c.clear();
            f23158k.f23160a = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
    }

    public final void a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason, boolean z10, Ad.b bVar, boolean z11) {
        if (!z10 && bVar != null) {
            bVar.a(requestReason, false);
        }
        synchronized (f23151d) {
            if (f23158k.f23161b && !z11) {
                if (!z10 || bVar == null) {
                    return;
                }
                bVar.a(requestReason, false);
                return;
            }
            if (!f23158k.f23160a || z11) {
                this.f23160a = true;
                this.f23161b = false;
                com.startapp.sdk.adsbase.remoteconfig.a aVar = f23159l;
                if (aVar != null) {
                    aVar.f23204j = true;
                }
                com.startapp.sdk.adsbase.remoteconfig.a aVar2 = new com.startapp.sdk.adsbase.remoteconfig.a(context, adPreferences, requestReason);
                f23159l = aVar2;
                com.startapp.sdk.components.a a10 = com.startapp.sdk.components.a.a(context);
                a10.f23249y.a().execute(new p2(aVar2, a10));
            }
            if (z10 && bVar != null) {
                f23158k.a(bVar);
            }
        }
    }

    public final void a(c cVar) {
        synchronized (f23151d) {
            this.f23162c.add(cVar);
        }
    }

    public final int a(Context context) {
        int[] iArr = this.periodicForegroundEventSec;
        if (iArr == null || iArr.length < 3) {
            iArr = f23156i;
        }
        if (y.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i10 = iArr[0];
            return i10 <= 0 ? f23156i[0] : i10;
        } else if (y.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            int i11 = iArr[1];
            return i11 <= 0 ? f23156i[1] : i11;
        } else {
            return iArr[2];
        }
    }

    public final String a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 1) {
            String str = this.adPlatformBannerHostSecured;
            return str != null ? str : d();
        } else if (ordinal == 7) {
            String str2 = this.adPlatformReturnHostSecured;
            return str2 != null ? str2 : d();
        } else if (ordinal == 3) {
            String str3 = this.adPlatformSplashHostSecured;
            return str3 != null ? str3 : d();
        } else if (ordinal == 4) {
            String str4 = this.adPlatformOverlayHostSecured;
            return str4 != null ? str4 : d();
        } else if (ordinal != 5) {
            return d();
        } else {
            String str5 = this.adPlatformNativeHostSecured;
            return str5 != null ? str5 : d();
        }
    }

    public final void a() {
        ArrayList arrayList;
        this.adPlatformHostSecured = a(this.adPlatformHostSecured, f23155h);
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (String str : list) {
                String a10 = a(str, (String) null);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        this.adPlatformBannerHostSecured = a(this.adPlatformBannerHostSecured, (String) null);
        this.adPlatformSplashHostSecured = a(this.adPlatformSplashHostSecured, (String) null);
        this.adPlatformReturnHostSecured = a(this.adPlatformReturnHostSecured, (String) null);
        this.adPlatformOverlayHostSecured = a(this.adPlatformOverlayHostSecured, (String) null);
        this.adPlatformNativeHostSecured = a(this.adPlatformNativeHostSecured, (String) null);
    }

    public static String a(String str, String str2) {
        return str != null ? str.replace("%AdPlatformProtocol%", "1.5") : str2;
    }

    public static void a(Context context, String str) {
        String[] strArr;
        String[] strArr2;
        if (str == null || str.equals("")) {
            return;
        }
        if (!a1.a(context, "close_button")) {
            WeakHashMap weakHashMap = o9.f22359a;
            new b1(context, str.concat("close_button.png"), new a(context, "close_button"), 0).a();
        }
        WeakHashMap weakHashMap2 = o9.f22359a;
        for (String str2 : q.f22402h) {
            if (!a1.a(context, str2)) {
                new b1(context, str + str2 + ".png", new a(context, str2), 0).a();
            }
        }
        WeakHashMap weakHashMap3 = o9.f22359a;
        for (String str3 : q.f22403i) {
            if (!a1.a(context, str3)) {
                new b1(context, str + str3 + ".png", new a(context, str3), 0).a();
            }
        }
        if (a1.a(context, "logo")) {
            return;
        }
        new b1(context, str.concat("logo.png"), new a(context, "logo"), 0).a();
    }
}
