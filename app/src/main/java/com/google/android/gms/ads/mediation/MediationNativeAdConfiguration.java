package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzben;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    /* renamed from: j  reason: collision with root package name */
    private final zzben f11603j;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, Location location, int i10, int i11, String str2, String str3, zzben zzbenVar) {
        super(context, str, bundle, bundle2, z10, location, i10, i11, str2, str3);
        this.f11603j = zzbenVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzben.zza(this.f11603j);
    }
}
