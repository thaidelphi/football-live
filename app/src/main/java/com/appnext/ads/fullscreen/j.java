package com.appnext.ads.fullscreen;

import android.net.Uri;
import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface j {
    void closeClicked();

    long closeDelay();

    int getCaptionTextTime();

    SettingsManager getConfigManager();

    String getCtaText();

    String getLanguage();

    boolean getMute();

    AppnextAd getSelectedAd();

    Uri getSelectedVideoUri();

    int getTemplate(String str);

    void installClicked(AppnextAd appnextAd);

    boolean isInstalled();

    void privacyClicked();

    void report(String str, String str2);

    boolean showClose();

    void videoEnded();

    void videoStarted();
}
