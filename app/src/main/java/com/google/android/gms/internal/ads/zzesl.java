package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzesl implements zzerw {
    private final zzgba zza;
    private final Context zzb;

    public zzesl(zzgba zzgbaVar, Context context) {
        this.zza = zzgbaVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzesj zzc(zzesl zzeslVar) {
        boolean z10;
        int i10;
        TelephonyManager telephonyManager = (TelephonyManager) zzeslVar.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzv.zzq();
        int i11 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzB(zzeslVar.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) zzeslVar.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = ordinal;
            } else {
                i10 = -1;
            }
            z10 = connectivityManager.isActiveNetworkMetered();
        } else {
            z10 = false;
            i10 = -2;
        }
        return new zzesj(networkOperator, i10, com.google.android.gms.ads.internal.zzv.zzr().zzm(zzeslVar.zzb), phoneType, z10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesl.zzc(zzesl.this);
            }
        });
    }
}
