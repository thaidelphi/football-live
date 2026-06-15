package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import g9.e;
import i8.w;
/* compiled from: Show.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface Show {
    e<ShowEvent> invoke(Activity activity, AdObject adObject, UnityAdsShowOptions unityAdsShowOptions);

    Object terminate(AdObject adObject, m8.d<? super w> dVar);
}
