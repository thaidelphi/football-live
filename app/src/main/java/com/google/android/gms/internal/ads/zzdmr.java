package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbar;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdmr implements zzhdk {
    private final zzhdt zza;

    public zzdmr(zzhdt zzhdtVar) {
        this.zza = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbar.zza.EnumC0178zza enumC0178zza;
        if (((zzctw) this.zza).zza().zzo.zza == 3) {
            enumC0178zza = zzbar.zza.EnumC0178zza.REWARDED_INTERSTITIAL;
        } else {
            enumC0178zza = zzbar.zza.EnumC0178zza.REWARD_BASED_VIDEO_AD;
        }
        zzhds.zzb(enumC0178zza);
        return enumC0178zza;
    }
}
