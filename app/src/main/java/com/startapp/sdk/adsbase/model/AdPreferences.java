package com.startapp.sdk.adsbase.model;

import android.content.Context;
import com.startapp.g2;
import com.startapp.o9;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdPreferences implements Serializable {
    public static final String TYPE_APP_WALL = "APP_WALL";
    public static final String TYPE_BANNER = "BANNER";
    public static final String TYPE_INAPP_EXIT = "INAPP_EXIT";
    public static final String TYPE_SCRINGO_TOOLBAR = "SCRINGO_TOOLBAR";
    public static final String TYPE_TEXT = "TEXT";
    private static final long serialVersionUID = 5287002180723228322L;
    private String adTag;
    private String age;
    private Boolean ai;
    private Boolean as;
    private Integer autoLoadAmount;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    protected boolean forceFullpage;
    protected boolean forceOfferWall2D;
    protected boolean forceOfferWall3D;
    protected boolean forceOverlay;
    private SDKAdPreferences.Gender gender;
    private boolean hardwareAccelerated;
    private boolean isPreCached;
    private String keywords;
    private Double latitude;
    private Double longitude;
    protected Double minCpm;
    protected Set<String> packageInclude;
    private String placementId;
    private String productId;
    private boolean testMode;
    protected Ad.AdType type;
    private boolean videoMuted;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Placement {
        INAPP_FULL_SCREEN(1),
        INAPP_BANNER(2),
        INAPP_OFFER_WALL(3),
        INAPP_SPLASH(4),
        INAPP_OVERLAY(5),
        INAPP_NATIVE(6),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_SIDEBAR(7),
        INAPP_RETURN(8),
        INAPP_BROWSER(9);
        
        private int index;

        Placement(int i10) {
            this.index = i10;
        }

        public final int a() {
            return this.index;
        }

        public static Placement a(int i10) {
            Placement[] values;
            Placement placement = INAPP_FULL_SCREEN;
            for (Placement placement2 : values()) {
                if (placement2.index == i10) {
                    return placement2;
                }
            }
            return placement;
        }
    }

    public AdPreferences() {
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.as = null;
        this.videoMuted = false;
        this.adTag = null;
        this.hardwareAccelerated = StartAppSDKInternal.a().c();
        this.categories = null;
        this.categoriesExclude = null;
    }

    public final Integer a() {
        return this.autoLoadAmount;
    }

    public AdPreferences addCategory(String str) {
        if (this.categories == null) {
            this.categories = new HashSet();
        }
        this.categories.add(str);
        return this;
    }

    public AdPreferences addCategoryExclude(String str) {
        if (this.categoriesExclude == null) {
            this.categoriesExclude = new HashSet();
        }
        this.categoriesExclude.add(str);
        return this;
    }

    public final boolean b() {
        return this.hardwareAccelerated;
    }

    public final boolean c() {
        return this.isPreCached;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdPreferences adPreferences = (AdPreferences) obj;
        return this.forceOfferWall3D == adPreferences.forceOfferWall3D && this.forceOfferWall2D == adPreferences.forceOfferWall2D && this.forceFullpage == adPreferences.forceFullpage && this.forceOverlay == adPreferences.forceOverlay && this.testMode == adPreferences.testMode && this.videoMuted == adPreferences.videoMuted && this.hardwareAccelerated == adPreferences.hardwareAccelerated && this.type == adPreferences.type && o9.a(this.packageInclude, adPreferences.packageInclude) && o9.a(this.minCpm, adPreferences.minCpm) && o9.a(this.longitude, adPreferences.longitude) && o9.a(this.latitude, adPreferences.latitude) && o9.a(this.keywords, adPreferences.keywords) && this.gender == adPreferences.gender && o9.a(this.age, adPreferences.age) && o9.a(this.ai, adPreferences.ai) && o9.a(this.as, adPreferences.as) && o9.a(this.adTag, adPreferences.adTag) && o9.a(this.productId, adPreferences.productId) && o9.a(this.autoLoadAmount, adPreferences.autoLoadAmount) && this.isPreCached == adPreferences.isPreCached && o9.a(this.categories, adPreferences.categories) && o9.a(this.categoriesExclude, adPreferences.categoriesExclude) && o9.a(this.placementId, adPreferences.placementId);
    }

    public String getAdTag() {
        return this.adTag;
    }

    public String getAge(Context context) {
        String str = this.age;
        if (str == null) {
            Object obj = StartAppSDKInternal.C;
            StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
            if (startAppSDKInternal.f22909a == null) {
                SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) g2.c(context, "shared_prefs_sdk_ad_prefs");
                if (sDKAdPreferences == null) {
                    startAppSDKInternal.f22909a = new SDKAdPreferences();
                } else {
                    startAppSDKInternal.f22909a = sDKAdPreferences;
                }
            }
            return startAppSDKInternal.f22909a.getAge();
        }
        return str;
    }

    public Boolean getAi() {
        return this.ai;
    }

    public Boolean getAs() {
        return this.as;
    }

    public Set<String> getCategories() {
        return this.categories;
    }

    public Set<String> getCategoriesExclude() {
        return this.categoriesExclude;
    }

    public String getCustomProductId() {
        return this.productId;
    }

    public SDKAdPreferences.Gender getGender(Context context) {
        SDKAdPreferences.Gender gender = this.gender;
        if (gender == null) {
            Object obj = StartAppSDKInternal.C;
            StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
            if (startAppSDKInternal.f22909a == null) {
                SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) g2.c(context, "shared_prefs_sdk_ad_prefs");
                if (sDKAdPreferences == null) {
                    startAppSDKInternal.f22909a = new SDKAdPreferences();
                } else {
                    startAppSDKInternal.f22909a = sDKAdPreferences;
                }
            }
            return startAppSDKInternal.f22909a.getGender();
        }
        return gender;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Double getMinCpm() {
        return this.minCpm;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public Ad.AdType getType() {
        return this.type;
    }

    public int hashCode() {
        Object[] objArr = {this.type, this.packageInclude, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), this.minCpm, Boolean.valueOf(this.testMode), this.longitude, this.latitude, this.keywords, this.gender, this.age, this.ai, this.as, Boolean.valueOf(this.videoMuted), this.adTag, this.productId, Boolean.valueOf(this.hardwareAccelerated), this.autoLoadAmount, Boolean.valueOf(this.isPreCached), this.categories, this.categoriesExclude, this.placementId};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean isForceFullpage() {
        return this.forceFullpage;
    }

    public boolean isForceOfferWall2D() {
        return this.forceOfferWall2D;
    }

    public boolean isForceOfferWall3D() {
        return this.forceOfferWall3D;
    }

    public boolean isForceOverlay() {
        return this.forceOverlay;
    }

    public boolean isSimpleToken() {
        return true;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public boolean isVideoMuted() {
        return this.videoMuted;
    }

    public void makePreCached() {
        this.isPreCached = true;
    }

    public AdPreferences muteVideo() {
        this.videoMuted = true;
        return this;
    }

    public AdPreferences setAdTag(String str) {
        this.adTag = str;
        return this;
    }

    public AdPreferences setAge(Integer num) {
        this.age = Integer.toString(num.intValue());
        return this;
    }

    public AdPreferences setAi(Boolean bool) {
        this.ai = bool;
        return this;
    }

    public AdPreferences setAs(Boolean bool) {
        this.as = bool;
        return this;
    }

    public void setAutoLoadAmount(int i10) {
        if (i10 > 0) {
            this.autoLoadAmount = Integer.valueOf(i10);
        }
    }

    public AdPreferences setCustomProductId(String str) {
        this.productId = str;
        return this;
    }

    public AdPreferences setGender(SDKAdPreferences.Gender gender) {
        this.gender = gender;
        return this;
    }

    public void setHardwareAccelerated(boolean z10) {
        this.hardwareAccelerated = z10;
    }

    public AdPreferences setKeywords(String str) {
        this.keywords = str;
        return this;
    }

    public AdPreferences setLatitude(double d10) {
        this.latitude = Double.valueOf(d10);
        return this;
    }

    public AdPreferences setLongitude(double d10) {
        this.longitude = Double.valueOf(d10);
        return this;
    }

    public void setMinCpm(Double d10) {
        this.minCpm = d10;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public AdPreferences setTestMode(boolean z10) {
        this.testMode = z10;
        return this;
    }

    public void setType(Ad.AdType adType) {
        this.type = adType;
    }

    public String toString() {
        return super.toString();
    }

    public AdPreferences setAge(String str) {
        this.age = str;
        return this;
    }

    public AdPreferences(AdPreferences adPreferences) {
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.as = null;
        this.videoMuted = false;
        this.adTag = null;
        this.hardwareAccelerated = StartAppSDKInternal.a().c();
        this.categories = null;
        this.categoriesExclude = null;
        this.type = adPreferences.type;
        if (adPreferences.packageInclude != null) {
            this.packageInclude = new HashSet(adPreferences.packageInclude);
        }
        this.minCpm = adPreferences.minCpm;
        this.forceOfferWall3D = adPreferences.forceOfferWall3D;
        this.forceOfferWall2D = adPreferences.forceOfferWall2D;
        this.forceFullpage = adPreferences.forceFullpage;
        this.forceOverlay = adPreferences.forceOverlay;
        this.testMode = adPreferences.testMode;
        this.longitude = adPreferences.longitude;
        this.latitude = adPreferences.latitude;
        this.keywords = adPreferences.keywords;
        this.gender = adPreferences.gender;
        this.age = adPreferences.age;
        this.ai = adPreferences.ai;
        this.as = adPreferences.as;
        this.videoMuted = adPreferences.videoMuted;
        this.adTag = adPreferences.adTag;
        this.hardwareAccelerated = adPreferences.hardwareAccelerated;
        this.autoLoadAmount = adPreferences.autoLoadAmount;
        this.isPreCached = adPreferences.isPreCached;
        this.productId = adPreferences.productId;
        if (adPreferences.categories != null) {
            this.categories = new HashSet(adPreferences.categories);
        }
        if (adPreferences.categoriesExclude != null) {
            this.categoriesExclude = new HashSet(adPreferences.categoriesExclude);
        }
        this.placementId = adPreferences.placementId;
    }
}
