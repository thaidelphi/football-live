package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface qa {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize);

        void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str);

        void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2);

        void c(String str);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b {
        void a(Activity activity, String str);

        void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        void b(Activity activity, String str, String str2);

        void b(String str);

        boolean f(String str);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface c {
        void a(Activity activity, String str, String str2);

        void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        void a(String str);

        void b(Activity activity, String str);

        boolean j(String str);
    }

    String a(Context context);

    void a(Context context, String str, IronSource.AD_UNIT... ad_unitArr);
}
