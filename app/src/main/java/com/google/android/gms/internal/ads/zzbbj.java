package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbbj implements zzbec {
    final /* synthetic */ SharedPreferences zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbj(zzbbk zzbbkVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbec
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbec
    public final Double zzb(String str, double d10) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbec
    public final Long zzc(String str, long j10) {
        try {
            return Long.valueOf(this.zza.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbec
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
