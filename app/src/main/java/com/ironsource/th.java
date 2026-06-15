package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface th {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(rh rhVar);

        void onNativeAdShown();
    }

    a a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(uh uhVar);

    rh b();

    void destroy();
}
