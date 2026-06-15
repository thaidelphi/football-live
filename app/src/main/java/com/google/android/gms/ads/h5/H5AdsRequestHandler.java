package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbju;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class H5AdsRequestHandler {

    /* renamed from: a  reason: collision with root package name */
    private final zzbju f11132a;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.f11132a = new zzbju(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.f11132a.zza();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.f11132a.zzb(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbju.zzc(str);
    }
}
