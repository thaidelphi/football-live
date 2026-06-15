package com.appnext.core;

import android.content.Context;
import android.widget.ImageView;
import com.appnext.core.l;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k {
    public static void a(Context context, final ImageView imageView) {
        l.aa().a(context, imageView, "https://cdn.appnext.com/tools/sdk/adchoices/adchoices_big.png", new l.a() { // from class: com.appnext.core.k.1
            @Override // com.appnext.core.l.a
            public final void Z() {
                imageView.setImageResource(R.drawable.apnxt_adchoices);
            }
        });
    }

    public static boolean a(AppnextAd appnextAd, SettingsManager settingsManager) {
        return appnextAd.isGdpr() && Boolean.parseBoolean(settingsManager.t("gdpr"));
    }
}
