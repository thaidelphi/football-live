package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.g;
import com.applovin.impl.l2;
import com.applovin.impl.o0;
import com.applovin.impl.o5;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.applovin.impl.z4;
import com.applovin.impl.z5;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final n logger;
    private final com.applovin.impl.sdk.j sdk;

    public AppLovinNativeAdService(com.applovin.impl.sdk.j jVar) {
        this.sdk = jVar;
        this.logger = jVar.I();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            n.h(TAG, "Empty ad token");
            l2.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        com.applovin.impl.g gVar = new com.applovin.impl.g(trim, this.sdk);
        if (gVar.c() == g.a.REGULAR) {
            if (n.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + gVar);
            }
            this.sdk.i0().a((z4) new o5(gVar, appLovinNativeAdLoadListener, this.sdk), u5.b.CORE);
        } else if (gVar.c() == g.a.AD_RESPONSE_JSON) {
            JSONObject a10 = gVar.a();
            if (a10 != null) {
                o0.c(a10, this.sdk);
                o0.b(a10, this.sdk);
                o0.a(a10, this.sdk);
                if (JsonUtils.getJSONArray(a10, "ads", new JSONArray()).length() > 0) {
                    if (n.a()) {
                        this.logger.a(TAG, "Rendering ad for token: " + gVar);
                    }
                    this.sdk.i0().a((z4) new z5(a10, appLovinNativeAdLoadListener, this.sdk), u5.b.CORE);
                    return;
                }
                if (n.a()) {
                    this.logger.b(TAG, "No ad returned from the server for token: " + gVar);
                }
                l2.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
                return;
            }
            String str2 = "Unable to retrieve ad response JSON from token: " + gVar.b();
            AppLovinError appLovinError = new AppLovinError(-8, str2);
            n.h(TAG, str2);
            l2.b(appLovinNativeAdLoadListener, appLovinError);
        } else {
            AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
            n.h(TAG, "Invalid token type");
            l2.b(appLovinNativeAdLoadListener, appLovinError2);
        }
    }
}
