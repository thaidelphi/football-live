package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import g9.e;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import i8.w;
import java.util.List;
import m8.d;
import u7.c;
/* compiled from: ScarManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface ScarManager {
    Object getSignals(List<? extends InitializationResponseOuterClass.AdFormat> list, d<? super BiddingSignals> dVar);

    Object getVersion(d<? super String> dVar);

    Object loadAd(String str, String str2, String str3, String str4, String str5, int i10, d<? super w> dVar);

    e<GmaEventData> loadBannerAd(Context context, BannerView bannerView, c cVar, UnityBannerSize unityBannerSize, String str);

    e<GmaEventData> show(String str, String str2);
}
