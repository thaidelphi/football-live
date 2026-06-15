package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.n;
/* compiled from: ShowStatusExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ShowStatusExtensionsKt {

    /* compiled from: ShowStatusExtensions.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShowStatus.values().length];
            try {
                iArr[ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(ShowStatus showStatus) {
        n.f(showStatus, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[showStatus.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return UnityAds.UnityAdsShowCompletionState.SKIPPED;
            }
            throw new IllegalStateException("Unexpected show status: " + showStatus);
        }
        return UnityAds.UnityAdsShowCompletionState.COMPLETED;
    }
}
