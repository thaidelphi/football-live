package com.appnext.ads.fullscreen;

import java.io.Serializable;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RewardedServerSidePostback implements Serializable {
    private String J;
    private String K;
    private String L;
    private String M;
    private String N;

    public RewardedServerSidePostback() {
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
    }

    public String getRewardsAmountRewarded() {
        return this.M;
    }

    public String getRewardsCustomParameter() {
        return this.N;
    }

    public String getRewardsRewardTypeCurrency() {
        return this.L;
    }

    public String getRewardsTransactionId() {
        return this.J;
    }

    public String getRewardsUserId() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HashMap<String, String> n() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("rewardsTransactionId", this.J);
            hashMap.put("rewardsUserId", this.K);
            hashMap.put("rewardsRewardTypeCurrency", this.L);
            hashMap.put("rewardsAmountRewarded", this.M);
            hashMap.put("rewardsCustomParameter", this.N);
        } catch (Throwable th) {
            com.appnext.base.a.a("RewardedServerSidePostback$getParams", th);
        }
        return hashMap;
    }

    public void setRewardsAmountRewarded(String str) {
        this.M = str;
    }

    public void setRewardsCustomParameter(String str) {
        this.N = str;
    }

    public void setRewardsRewardTypeCurrency(String str) {
        this.L = str;
    }

    public void setRewardsTransactionId(String str) {
        this.J = str;
    }

    public void setRewardsUserId(String str) {
        this.K = str;
    }

    public RewardedServerSidePostback(String str, String str2, String str3, String str4, String str5) {
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.J = str;
        this.K = str2;
        this.L = str3;
        this.M = str4;
        this.N = str5;
    }
}
