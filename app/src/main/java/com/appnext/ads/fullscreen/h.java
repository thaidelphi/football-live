package com.appnext.ads.fullscreen;

import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface h {
    void closeClicked();

    SettingsManager getConfigManager();

    String getCtaText();

    String getLanguage();

    ArrayList<AppnextAd> getPostRollAds();

    int getTemplate(String str);

    void installClicked(AppnextAd appnextAd);

    boolean isRewarded();

    void privacyClicked();

    void report(String str, String str2);
}
