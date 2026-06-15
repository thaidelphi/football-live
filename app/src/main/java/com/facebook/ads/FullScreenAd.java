package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.Ad;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface FullScreenAd extends Ad {

    @Keep
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface ShowAdConfig {
    }

    @Keep
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
