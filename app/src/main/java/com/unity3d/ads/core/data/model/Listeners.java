package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.n;
/* compiled from: Listeners.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface Listeners {

    /* compiled from: Listeners.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String placementId) {
            n.f(placementId, "placementId");
        }

        public static void onComplete(Listeners listeners, String placementId, UnityAds.UnityAdsShowCompletionState state) {
            n.f(placementId, "placementId");
            n.f(state, "state");
        }

        public static void onError(Listeners listeners, String placementId, UnityAds.UnityAdsShowError error, String message) {
            n.f(placementId, "placementId");
            n.f(error, "error");
            n.f(message, "message");
        }

        public static void onLeftApplication(Listeners listeners, String placementId) {
            n.f(placementId, "placementId");
        }

        public static void onStart(Listeners listeners, String placementId) {
            n.f(placementId, "placementId");
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
