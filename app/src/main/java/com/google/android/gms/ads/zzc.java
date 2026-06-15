package com.google.android.gms.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzc {
    public static int zza(AdSize adSize) {
        return adSize.b();
    }

    public static int zzb(AdSize adSize) {
        return adSize.a();
    }

    public static AdSize zzc(int i10, int i11, String str) {
        return new AdSize(i10, i11, str);
    }

    public static AdSize zzd(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.e(true);
        adSize.c(i11);
        return adSize;
    }

    public static AdSize zze(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.f(true);
        adSize.d(i11);
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.g();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.h();
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.i();
    }
}
