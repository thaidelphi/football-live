package com.appnext.ads.fullscreen;

import android.content.Context;
import com.appnext.core.SettingsManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RewardedVideo extends Video {
    public static final String VIDEO_MODE_DEFAULT = "default";
    public static final String VIDEO_MODE_MULTI = "multi";
    public static final String VIDEO_MODE_NORMAL = "normal";
    private String mode;
    private int multiTimerLength;
    private RewardedServerSidePostback rewardedServerSidePostback;

    /* JADX INFO: Access modifiers changed from: protected */
    public RewardedVideo(Context context, RewardedVideo rewardedVideo) {
        super(context, rewardedVideo);
        this.mode = VIDEO_MODE_DEFAULT;
        this.multiTimerLength = 5;
        if (rewardedVideo != null) {
            try {
                setRewardedServerSidePostback(rewardedVideo.getRewardedServerSidePostback());
                setMode(rewardedVideo.getMode());
                setMultiTimerLength(rewardedVideo.getMultiTimerLength());
                setBackButtonCanClose(rewardedVideo.isBackButtonCanClose());
            } catch (Throwable th) {
                com.appnext.base.a.a("RewardedVideo$RewardedVideo", th);
            }
        }
    }

    @Override // com.appnext.core.Ad
    public String getAUID() {
        return "800";
    }

    @Override // com.appnext.ads.fullscreen.Video
    protected SettingsManager getConfig() {
        return f.o();
    }

    public String getMode() {
        return this.mode;
    }

    public int getMultiTimerLength() {
        return this.multiTimerLength;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RewardedServerSidePostback getRewardedServerSidePostback() {
        if (getRewardsTransactionId().equals("") && getRewardsUserId().equals("") && getRewardsRewardTypeCurrency().equals("") && getRewardsAmountRewarded().equals("") && getRewardsCustomParameter().equals("")) {
            return null;
        }
        return this.rewardedServerSidePostback;
    }

    public String getRewardsAmountRewarded() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback = this.rewardedServerSidePostback;
            return rewardedServerSidePostback == null ? "" : rewardedServerSidePostback.getRewardsAmountRewarded();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getRewardsCustomParameter() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback = this.rewardedServerSidePostback;
            return rewardedServerSidePostback == null ? "" : rewardedServerSidePostback.getRewardsCustomParameter();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getRewardsRewardTypeCurrency() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback = this.rewardedServerSidePostback;
            return rewardedServerSidePostback == null ? "" : rewardedServerSidePostback.getRewardsRewardTypeCurrency();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getRewardsTransactionId() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback = this.rewardedServerSidePostback;
            return rewardedServerSidePostback == null ? "" : rewardedServerSidePostback.getRewardsTransactionId();
        } catch (Throwable th) {
            com.appnext.base.a.a("RewardedVideo$getRewardsTransactionId", th);
            return "";
        }
    }

    public String getRewardsUserId() {
        try {
            RewardedServerSidePostback rewardedServerSidePostback = this.rewardedServerSidePostback;
            return rewardedServerSidePostback == null ? "" : rewardedServerSidePostback.getRewardsUserId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setMultiTimerLength(int i10) {
        if (i10 <= 0 || i10 > 20) {
            return;
        }
        this.multiTimerLength = i10;
    }

    protected void setRewardedServerSidePostback(RewardedServerSidePostback rewardedServerSidePostback) {
        this.rewardedServerSidePostback = rewardedServerSidePostback;
    }

    public void setRewardsAmountRewarded(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsAmountRewarded(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardsCustomParameter(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsCustomParameter(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardsRewardTypeCurrency(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsRewardTypeCurrency(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardsTransactionId(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsTransactionId(str);
        } catch (Throwable th) {
            com.appnext.base.a.a("RewardedVideo$setRewardsTransactionId", th);
        }
    }

    public void setRewardsUserId(String str) {
        try {
            if (this.rewardedServerSidePostback == null) {
                this.rewardedServerSidePostback = new RewardedServerSidePostback();
            }
            this.rewardedServerSidePostback.setRewardsUserId(str);
        } catch (Throwable unused) {
        }
    }

    public void setRewardedServerSidePostback(String str, String str2, String str3, String str4, String str5) {
        try {
            setRewardsTransactionId(str);
            setRewardsUserId(str2);
            setRewardsRewardTypeCurrency(str3);
            setRewardsAmountRewarded(str4);
            setRewardsCustomParameter(str5);
        } catch (Throwable th) {
            com.appnext.base.a.a("RewardedVideo$setRewardedServerSidePostback", th);
        }
    }

    public RewardedVideo(Context context, String str) {
        super(context, 2, str);
        this.mode = VIDEO_MODE_DEFAULT;
        this.multiTimerLength = 5;
    }

    public RewardedVideo(Context context, String str, RewardedConfig rewardedConfig) {
        super(context, 2, str, rewardedConfig);
        this.mode = VIDEO_MODE_DEFAULT;
        this.multiTimerLength = 5;
        if (rewardedConfig != null) {
            try {
                setBackButtonCanClose(rewardedConfig.isBackButtonCanClose());
                setMode(rewardedConfig.getMode());
                setMultiTimerLength(rewardedConfig.getMultiTimerLength());
                setShowCta(rewardedConfig.isShowCta());
            } catch (Throwable th) {
                com.appnext.base.a.a("RewardedVideo$RewardedVideo", th);
            }
        }
    }
}
