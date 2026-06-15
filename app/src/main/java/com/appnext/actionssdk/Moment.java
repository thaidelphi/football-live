package com.appnext.actionssdk;

import android.content.Context;
import com.appnext.core.Ad;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Moment extends ActionAd {
    /* JADX INFO: Access modifiers changed from: protected */
    public Moment(Ad ad) {
        super(ad);
    }

    @Override // com.appnext.actionssdk.ActionAd
    public ArrayList<AdData> getAdsData() {
        return a.j().f(this);
    }

    @Override // com.appnext.actionssdk.ActionAd, com.appnext.core.Ad
    public String getTID() {
        return "AASDK";
    }

    @Override // com.appnext.actionssdk.ActionAd, com.appnext.core.Ad
    public String getVID() {
        return Action.VID;
    }

    @Override // com.appnext.actionssdk.ActionAd, com.appnext.core.Ad
    public boolean isAdLoaded() {
        return false;
    }

    @Override // com.appnext.actionssdk.ActionAd, com.appnext.core.Ad
    public void loadAd() {
    }

    @Override // com.appnext.actionssdk.ActionAd, com.appnext.core.Ad
    public void showAd() {
    }

    public Moment(Context context, String str) {
        super(context, str);
        setCount(1);
    }
}
