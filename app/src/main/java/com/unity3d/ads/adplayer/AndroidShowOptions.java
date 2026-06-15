package com.unity3d.ads.adplayer;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AndroidShowOptions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final WeakReference<Activity> activity;
    private final boolean isScarAd;
    private final String placementId;
    private final String scarAdString;
    private final String scarAdUnitId;
    private final String scarQueryId;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(WeakReference<Activity> activity, Map<String, ? extends Object> map, String str, boolean z10, String str2, String str3, String str4) {
        n.f(activity, "activity");
        this.activity = activity;
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z10;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, WeakReference weakReference, Map map, String str, boolean z10, String str2, String str3, String str4, int i10, Object obj) {
        WeakReference<Activity> weakReference2 = weakReference;
        if ((i10 & 1) != 0) {
            weakReference2 = androidShowOptions.activity;
        }
        Map<String, Object> map2 = map;
        if ((i10 & 2) != 0) {
            map2 = androidShowOptions.unityAdsShowOptions;
        }
        Map map3 = map2;
        if ((i10 & 4) != 0) {
            str = androidShowOptions.placementId;
        }
        String str5 = str;
        if ((i10 & 8) != 0) {
            z10 = androidShowOptions.isScarAd;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        String str6 = str2;
        if ((i10 & 32) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        String str7 = str3;
        if ((i10 & 64) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        return androidShowOptions.copy(weakReference2, map3, str5, z11, str6, str7, str4);
    }

    public final WeakReference<Activity> component1() {
        return this.activity;
    }

    public final Map<String, Object> component2() {
        return this.unityAdsShowOptions;
    }

    public final String component3() {
        return this.placementId;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdString;
    }

    public final String component7() {
        return this.scarAdUnitId;
    }

    public final AndroidShowOptions copy(WeakReference<Activity> activity, Map<String, ? extends Object> map, String str, boolean z10, String str2, String str3, String str4) {
        n.f(activity, "activity");
        return new AndroidShowOptions(activity, map, str, z10, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidShowOptions) {
            AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
            return n.a(this.activity, androidShowOptions.activity) && n.a(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && n.a(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && n.a(this.scarQueryId, androidShowOptions.scarQueryId) && n.a(this.scarAdString, androidShowOptions.scarAdString) && n.a(this.scarAdUnitId, androidShowOptions.scarAdUnitId);
        }
        return false;
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.activity.hashCode() * 31;
        Map<String, Object> map = this.unityAdsShowOptions;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.placementId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.isScarAd;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode3 + i10) * 31;
        String str2 = this.scarQueryId;
        int hashCode4 = (i11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public String toString() {
        return "AndroidShowOptions(activity=" + this.activity + ", unityAdsShowOptions=" + this.unityAdsShowOptions + ", placementId=" + this.placementId + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdString=" + this.scarAdString + ", scarAdUnitId=" + this.scarAdUnitId + ')';
    }

    public /* synthetic */ AndroidShowOptions(WeakReference weakReference, Map map, String str, boolean z10, String str2, String str3, String str4, int i10, h hVar) {
        this(weakReference, map, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4);
    }
}
