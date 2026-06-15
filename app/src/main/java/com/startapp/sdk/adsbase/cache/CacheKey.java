package com.startapp.sdk.adsbase.cache;

import com.startapp.o9;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CacheKey implements Serializable {
    private static final long serialVersionUID = 4364970708341709138L;
    private String adTag;
    private String advertiserId;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    private String country;
    private boolean forceFullpage;
    private boolean forceOfferWall2D;
    private boolean forceOfferWall3D;
    private boolean forceOverlay;
    private Double minCpm;
    private AdPreferences.Placement placement;
    private String productId;
    private String template;
    private boolean testMode;
    private Ad.AdType type;
    private boolean videoMuted;

    public CacheKey(AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.placement = placement;
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.videoMuted = adPreferences.isVideoMuted();
        this.minCpm = adPreferences.getMinCpm();
        this.forceOfferWall3D = adPreferences.isForceOfferWall3D();
        this.forceOfferWall2D = adPreferences.isForceOfferWall2D();
        this.forceFullpage = adPreferences.isForceFullpage();
        this.forceOverlay = adPreferences.isForceOverlay();
        this.testMode = adPreferences.isTestMode();
        this.adTag = adPreferences.getAdTag();
        this.productId = adPreferences.getCustomProductId();
        this.type = adPreferences.getType();
    }

    public final AdPreferences.Placement a() {
        return this.placement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) obj;
        return this.forceOfferWall3D == cacheKey.forceOfferWall3D && this.forceOfferWall2D == cacheKey.forceOfferWall2D && this.forceFullpage == cacheKey.forceFullpage && this.forceOverlay == cacheKey.forceOverlay && this.testMode == cacheKey.testMode && this.videoMuted == cacheKey.videoMuted && this.placement == cacheKey.placement && o9.a(this.categories, cacheKey.categories) && o9.a(this.categoriesExclude, cacheKey.categoriesExclude) && o9.a(this.minCpm, cacheKey.minCpm) && o9.a(this.adTag, cacheKey.adTag) && o9.a(this.productId, cacheKey.productId) && o9.a(this.country, cacheKey.country) && o9.a(this.advertiserId, cacheKey.advertiserId) && o9.a(this.template, cacheKey.template) && this.type == cacheKey.type;
    }

    public final int hashCode() {
        Object[] objArr = {this.placement, this.categories, this.categoriesExclude, this.minCpm, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), Boolean.valueOf(this.testMode), Boolean.valueOf(this.videoMuted), this.adTag, this.productId, this.country, this.advertiserId, this.template, this.type};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final String toString() {
        return super.toString();
    }
}
