package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.common.parser.TypeInfo;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdsCommonMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final transient Object f22882a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Integer f22883b = 18;

    /* renamed from: c  reason: collision with root package name */
    public static final Integer f22884c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f22885d = new HashSet(Arrays.asList("BOLD"));

    /* renamed from: e  reason: collision with root package name */
    public static final Integer f22886e = -16777216;

    /* renamed from: f  reason: collision with root package name */
    public static final Integer f22887f = -14803426;

    /* renamed from: g  reason: collision with root package name */
    public static final Integer f22888g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static AdsCommonMetaData f22889h = new AdsCommonMetaData();
    private static final long serialVersionUID = -4342481322424952690L;
    private Long explicitLoadIntervalMillis;
    private String acMetadataUpdateVersion = "4.11.5";
    private Integer probability3D = 0;
    private Integer homeProbability3D = 80;
    private Integer fullpageOfferWallProbability = 100;
    private Integer fullpageOverlayProbability = 0;
    private Integer backgroundGradientTop = -14606047;
    private Integer backgroundGradientBottom = -14606047;
    private Integer maxAds = 10;
    private Integer titleBackgroundColor = -14803426;
    private String titleContent = "Recommended for you";
    private Integer titleTextSize = f22883b;
    private Integer titleTextColor = f22884c;
    @TypeInfo(type = HashSet.class)
    private Set<String> titleTextDecoration = f22885d;
    private Integer titleLineColor = f22886e;
    private Integer itemGradientTop = -14014151;
    private Integer itemGradientBottom = -8750199;
    private Integer itemTitleTextSize = MetaDataStyle.f23187a;
    private Integer itemTitleTextColor = MetaDataStyle.f23188b;
    @TypeInfo(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = MetaDataStyle.f23189c;
    private Integer itemDescriptionTextSize = MetaDataStyle.f23190d;
    private Integer itemDescriptionTextColor = MetaDataStyle.f23191e;
    @TypeInfo(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = MetaDataStyle.f23192f;
    @TypeInfo(type = HashMap.class, value = MetaDataStyle.class)
    private HashMap<String, MetaDataStyle> templates = new HashMap<>();
    @TypeInfo(complex = true)
    private AdRules adRules = new AdRules();
    private Integer poweredByBackgroundColor = f22887f;
    private Integer poweredByTextColor = f22888g;
    private long returnAdMinBackgroundTime = 300;
    private boolean disableReturnAd = false;
    private boolean disableSplashAd = false;
    private int smartRedirectTimeout = 5;
    private long smartRedirectLoadedTimeout = 1000;
    private boolean enableSmartRedirect = true;
    private boolean autoInterstitialEnabled = true;
    private int defaultActivitiesBetweenAds = 1;
    private int defaultSecondsBetweenAds = 0;
    private boolean disableTwoClicks = false;
    private boolean appPresence = true;
    private boolean disableInAppStore = false;
    @TypeInfo(complex = true)
    private VideoConfig video = new VideoConfig();
    private int forceExternalBrowserDaysInterval = 7;
    private boolean enableForceExternalBrowser = false;
    private boolean enforceForeground = false;

    public static void a(Context context) {
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) g2.c(context, "StartappAdsMetadata");
        AdsCommonMetaData adsCommonMetaData2 = new AdsCommonMetaData();
        if (adsCommonMetaData != null) {
            boolean a10 = o9.a((Serializable) adsCommonMetaData, (Serializable) adsCommonMetaData2);
            if (!(!"4.11.5".equals(adsCommonMetaData.acMetadataUpdateVersion)) && a10) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "metadata_null";
                l3Var.a();
            }
            AdRules adRules = adsCommonMetaData.adRules;
            adRules.getClass();
            adRules.f23000a = new HashSet();
            f22889h = adsCommonMetaData;
            return;
        }
        f22889h = adsCommonMetaData2;
    }

    public static AdsCommonMetaData k() {
        return f22889h;
    }

    public final Integer A() {
        return this.titleBackgroundColor;
    }

    public final String B() {
        return this.titleContent;
    }

    public final Integer C() {
        return this.titleLineColor;
    }

    public final Integer D() {
        return this.titleTextColor;
    }

    public final Set<String> E() {
        return this.titleTextDecoration;
    }

    public final Integer F() {
        return this.titleTextSize;
    }

    public final VideoConfig G() {
        return this.video;
    }

    public final boolean H() {
        return this.appPresence;
    }

    public final boolean I() {
        return this.autoInterstitialEnabled;
    }

    public final boolean J() {
        return this.disableInAppStore;
    }

    public final boolean K() {
        return this.disableReturnAd;
    }

    public final boolean L() {
        return this.disableSplashAd;
    }

    public final boolean M() {
        return this.disableTwoClicks;
    }

    public final boolean N() {
        return this.enableSmartRedirect;
    }

    public final boolean O() {
        return this.enforceForeground;
    }

    public final AdRules b() {
        return this.adRules;
    }

    public final int c() {
        return this.backgroundGradientBottom.intValue();
    }

    public final int d() {
        return this.backgroundGradientTop.intValue();
    }

    public final int e() {
        return this.forceExternalBrowserDaysInterval;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) obj;
        return this.returnAdMinBackgroundTime == adsCommonMetaData.returnAdMinBackgroundTime && this.disableReturnAd == adsCommonMetaData.disableReturnAd && this.disableSplashAd == adsCommonMetaData.disableSplashAd && this.smartRedirectTimeout == adsCommonMetaData.smartRedirectTimeout && this.smartRedirectLoadedTimeout == adsCommonMetaData.smartRedirectLoadedTimeout && this.enableSmartRedirect == adsCommonMetaData.enableSmartRedirect && this.autoInterstitialEnabled == adsCommonMetaData.autoInterstitialEnabled && this.defaultActivitiesBetweenAds == adsCommonMetaData.defaultActivitiesBetweenAds && this.defaultSecondsBetweenAds == adsCommonMetaData.defaultSecondsBetweenAds && this.disableTwoClicks == adsCommonMetaData.disableTwoClicks && this.appPresence == adsCommonMetaData.appPresence && this.disableInAppStore == adsCommonMetaData.disableInAppStore && this.forceExternalBrowserDaysInterval == adsCommonMetaData.forceExternalBrowserDaysInterval && this.enableForceExternalBrowser == adsCommonMetaData.enableForceExternalBrowser && this.enforceForeground == adsCommonMetaData.enforceForeground && o9.a(this.acMetadataUpdateVersion, adsCommonMetaData.acMetadataUpdateVersion) && o9.a(this.probability3D, adsCommonMetaData.probability3D) && o9.a(this.homeProbability3D, adsCommonMetaData.homeProbability3D) && o9.a(this.fullpageOfferWallProbability, adsCommonMetaData.fullpageOfferWallProbability) && o9.a(this.fullpageOverlayProbability, adsCommonMetaData.fullpageOverlayProbability) && o9.a(this.backgroundGradientTop, adsCommonMetaData.backgroundGradientTop) && o9.a(this.backgroundGradientBottom, adsCommonMetaData.backgroundGradientBottom) && o9.a(this.maxAds, adsCommonMetaData.maxAds) && o9.a(this.explicitLoadIntervalMillis, adsCommonMetaData.explicitLoadIntervalMillis) && o9.a(this.titleBackgroundColor, adsCommonMetaData.titleBackgroundColor) && o9.a(this.titleContent, adsCommonMetaData.titleContent) && o9.a(this.titleTextSize, adsCommonMetaData.titleTextSize) && o9.a(this.titleTextColor, adsCommonMetaData.titleTextColor) && o9.a(this.titleTextDecoration, adsCommonMetaData.titleTextDecoration) && o9.a(this.titleLineColor, adsCommonMetaData.titleLineColor) && o9.a(this.itemGradientTop, adsCommonMetaData.itemGradientTop) && o9.a(this.itemGradientBottom, adsCommonMetaData.itemGradientBottom) && o9.a(this.itemTitleTextSize, adsCommonMetaData.itemTitleTextSize) && o9.a(this.itemTitleTextColor, adsCommonMetaData.itemTitleTextColor) && o9.a(this.itemTitleTextDecoration, adsCommonMetaData.itemTitleTextDecoration) && o9.a(this.itemDescriptionTextSize, adsCommonMetaData.itemDescriptionTextSize) && o9.a(this.itemDescriptionTextColor, adsCommonMetaData.itemDescriptionTextColor) && o9.a(this.itemDescriptionTextDecoration, adsCommonMetaData.itemDescriptionTextDecoration) && o9.a(this.templates, adsCommonMetaData.templates) && o9.a(this.adRules, adsCommonMetaData.adRules) && o9.a(this.poweredByBackgroundColor, adsCommonMetaData.poweredByBackgroundColor) && o9.a(this.poweredByTextColor, adsCommonMetaData.poweredByTextColor) && o9.a(this.video, adsCommonMetaData.video);
    }

    public final int f() {
        return this.defaultActivitiesBetweenAds;
    }

    public final int g() {
        return this.defaultSecondsBetweenAds;
    }

    public final Long h() {
        return this.explicitLoadIntervalMillis;
    }

    public final int hashCode() {
        Object[] objArr = {this.acMetadataUpdateVersion, this.probability3D, this.homeProbability3D, this.fullpageOfferWallProbability, this.fullpageOverlayProbability, this.backgroundGradientTop, this.backgroundGradientBottom, this.maxAds, this.explicitLoadIntervalMillis, this.titleBackgroundColor, this.titleContent, this.titleTextSize, this.titleTextColor, this.titleTextDecoration, this.titleLineColor, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration, this.templates, this.adRules, this.poweredByBackgroundColor, this.poweredByTextColor, Long.valueOf(this.returnAdMinBackgroundTime), Boolean.valueOf(this.disableReturnAd), Boolean.valueOf(this.disableSplashAd), Integer.valueOf(this.smartRedirectTimeout), Long.valueOf(this.smartRedirectLoadedTimeout), Boolean.valueOf(this.enableSmartRedirect), Boolean.valueOf(this.autoInterstitialEnabled), Integer.valueOf(this.defaultActivitiesBetweenAds), Integer.valueOf(this.defaultSecondsBetweenAds), Boolean.valueOf(this.disableTwoClicks), Boolean.valueOf(this.appPresence), Boolean.valueOf(this.disableInAppStore), this.video, Integer.valueOf(this.forceExternalBrowserDaysInterval), Boolean.valueOf(this.enableForceExternalBrowser), Boolean.valueOf(this.enforceForeground)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final int i() {
        return this.fullpageOfferWallProbability.intValue();
    }

    public final int j() {
        return this.fullpageOverlayProbability.intValue();
    }

    public final Integer l() {
        return this.itemDescriptionTextColor;
    }

    public final Set<String> m() {
        return this.itemDescriptionTextDecoration;
    }

    public final Integer n() {
        return this.itemDescriptionTextSize;
    }

    public final int o() {
        return this.itemGradientBottom.intValue();
    }

    public final int p() {
        return this.itemGradientTop.intValue();
    }

    public final Integer q() {
        return this.itemTitleTextColor;
    }

    public final Set<String> r() {
        return this.itemTitleTextDecoration;
    }

    public final Integer s() {
        return this.itemTitleTextSize;
    }

    public final int t() {
        return this.maxAds.intValue();
    }

    public final Integer u() {
        return this.poweredByBackgroundColor;
    }

    public final Integer v() {
        return this.poweredByTextColor;
    }

    public final int w() {
        return this.probability3D.intValue();
    }

    public final long x() {
        return TimeUnit.SECONDS.toMillis(this.returnAdMinBackgroundTime);
    }

    public final long y() {
        return this.smartRedirectLoadedTimeout;
    }

    public final long z() {
        return TimeUnit.SECONDS.toMillis(this.smartRedirectTimeout);
    }

    public final MetaDataStyle a(String str) {
        return this.templates.get(str);
    }

    public final boolean a() {
        return this.enableForceExternalBrowser;
    }

    public static void a(Context context, AdsCommonMetaData adsCommonMetaData) {
        synchronized (f22882a) {
            adsCommonMetaData.acMetadataUpdateVersion = "4.11.5";
            f22889h = adsCommonMetaData;
            g2.a(context, "StartappAdsMetadata", adsCommonMetaData);
        }
    }
}
