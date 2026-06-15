package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import android.content.Intent;
import com.ironsource.b9;
import com.ironsource.uc;
import com.startapp.l3;
import com.startapp.o9;
import com.startapp.q;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.v1;
import java.io.Serializable;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class InterstitialAd extends HtmlAd implements d {
    private static final long serialVersionUID = -8158520010577551438L;

    public InterstitialAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Boolean[], java.io.Serializable] */
    @Override // com.startapp.sdk.adsbase.d
    @Deprecated
    public final boolean a(String str) {
        String a10 = a.a();
        if (u() && AdsCommonMetaData.f22889h.G().a().equals(VideoConfig.BackMode.DISABLED) && a10.equals("back")) {
            a(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
        if (!q.f22400f.booleanValue()) {
            setState(Ad.AdState.UN_INITIALIZED);
        }
        if (k() == null) {
            a(NotDisplayedReason.INTERNAL_ERROR);
            return false;
        } else if (super.c()) {
            a(NotDisplayedReason.AD_EXPIRED);
            return false;
        } else {
            ActivityExtra activityExtra = this.activityExtra;
            boolean z10 = activityExtra != null && activityExtra.a();
            Intent intent = new Intent(this.f22876a, OverlayActivity.class);
            intent.putExtra(uc.c.f20970a, "exit.html");
            String[] strArr = this.trackingUrls;
            String concat = "&position=".concat(a.a());
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str2 = strArr[i10];
                if (str2 != null && !"".equals(str2)) {
                    strArr[i10] = strArr[i10] + concat;
                }
            }
            intent.putExtra("tracking", strArr);
            intent.putExtra("trackingClickUrl", p());
            intent.putExtra("packageNames", n());
            intent.putExtra("htmlUuid", l());
            intent.putExtra("smartRedirect", this.smartRedirect);
            intent.putExtra("browserEnabled", this.inAppBrowserEnabled);
            intent.putExtra("placement", this.placement.a());
            intent.putExtra("adInfoOverride", getAdInfoOverride());
            intent.putExtra("ad", this);
            intent.putExtra("videoAd", u());
            intent.putExtra("fullscreen", z10);
            intent.putExtra("orientation", m() == 0 ? this.f22876a.getResources().getConfiguration().orientation : m());
            intent.putExtra("adTag", str);
            intent.putExtra("lastLoadTime", super.d());
            intent.putExtra("adCacheTtl", super.b());
            intent.putExtra("closingUrl", g());
            intent.putExtra("rewardDuration", o());
            intent.putExtra("rewardedHideTimer", s());
            if (i() != null) {
                intent.putExtra("delayImpressionSeconds", i());
            }
            if (h() != null) {
                intent.putExtra("delayCloseInterval", h());
            }
            intent.putExtra("sendRedirectHops", (Serializable) t());
            WeakHashMap weakHashMap = o9.f22359a;
            if (this instanceof SplashAd) {
                intent.putExtra("isSplash", true);
            }
            intent.putExtra(b9.h.L, a10);
            intent.addFlags(343932928);
            v1 a11 = com.startapp.sdk.components.a.a(this.f22876a).f23233i.a();
            if (a11.f23466e) {
                a11.f23465d = intent;
            } else {
                try {
                    this.f22876a.startActivity(intent);
                } catch (Throwable th) {
                    l3.a(th);
                    return false;
                }
            }
            return true;
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final Long b() {
        return super.b();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final boolean c() {
        return super.c();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final Long d() {
        return super.d();
    }

    public boolean u() {
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final boolean a() {
        return super.a();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final void a(boolean z10) {
        super.a(z10);
    }
}
