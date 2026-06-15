package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.m1;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, m1 {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f8721a;

    /* renamed from: b  reason: collision with root package name */
    private com.applovin.impl.q f8722b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8723c;

    /* renamed from: d  reason: collision with root package name */
    private c f8724d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f8721a = new Bundle();
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(o4.f8084c1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd c10;
        if ((obj instanceof c) && (c10 = ((c) obj).c()) != null) {
            obj = c10;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public com.applovin.impl.q getAdZone() {
        com.applovin.impl.q qVar = this.f8722b;
        if (qVar != null) {
            if (qVar.f() != null && this.f8722b.g() != null) {
                return this.f8722b;
            }
            if (getSize() == null && getType() == null) {
                return this.f8722b;
            }
        }
        com.applovin.impl.q a10 = com.applovin.impl.q.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f8722b = a10;
        return a10;
    }

    public c getDummyAd() {
        return this.f8724d;
    }

    public Bundle getMAXAdValues() {
        return this.f8721a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        y4 y4Var = this.synchronizedFullResponse;
        if (y4Var != null) {
            return y4Var.toString();
        }
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.m1
    public long getTimeToLiveMillis() {
        if (canExpire()) {
            return b() - (System.currentTimeMillis() - getCreatedAtMillis());
        }
        return Long.MAX_VALUE;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f8723c;
    }

    public boolean isVideoAd() {
        if (this.adObject.has("is_video_ad")) {
            return getBooleanFromAdObject("is_video_ad", Boolean.FALSE);
        }
        return hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f8724d = cVar;
    }

    @Override // com.applovin.impl.m1
    public void setExpired() {
        this.f8723c = true;
    }

    public void setHasShown(boolean z10) {
        try {
            y4 y4Var = this.synchronizedAdObject;
            if (y4Var != null) {
                y4Var.a("shown", (Object) Boolean.valueOf(z10));
            } else {
                synchronized (this.adObjectLock) {
                    this.adObject.put("shown", z10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f8721a);
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
