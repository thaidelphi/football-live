package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcti {
    private final zzfet zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhde zzg;
    private final String zzh;
    private final zzerz zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfap zzk;
    private final int zzl;
    private final zzczq zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcti(zzfet zzfetVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhde zzhdeVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzerz zzerzVar, zzfap zzfapVar, zzczq zzczqVar, int i10) {
        this.zza = zzfetVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhdeVar;
        this.zzh = str2;
        this.zzi = zzerzVar;
        this.zzj = zzgVar;
        this.zzk = zzfapVar;
        this.zzm = zzczqVar;
        this.zzl = i10;
    }

    public static /* synthetic */ zzbud zza(zzcti zzctiVar, b6.a aVar, Bundle bundle) {
        zzcth zzcthVar = (zzcth) aVar.get();
        Bundle bundle2 = zzcthVar.zza;
        String str = (String) ((b6.a) zzctiVar.zzg.zzb()).get();
        boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgR)).booleanValue() && zzctiVar.zzj.zzN();
        String str2 = zzctiVar.zzh;
        PackageInfo packageInfo = zzctiVar.zzf;
        List list = zzctiVar.zze;
        return new zzbud(bundle2, zzctiVar.zzb, zzctiVar.zzc, zzctiVar.zzd, list, packageInfo, str, str2, null, null, z10, zzctiVar.zzk.zza(), bundle, zzcthVar.zzb);
    }

    public final b6.a zzb(Bundle bundle) {
        this.zzm.zza();
        return zzfed.zzc(this.zzi.zza(new zzcth(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfen.SIGNALS, this.zza).zza();
    }

    public final b6.a zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final b6.a zzb = zzb(bundle);
        return this.zza.zza(zzfen.REQUEST_PARCEL, zzb, (b6.a) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzctg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcti.zza(zzcti.this, zzb, bundle);
            }
        }).zza();
    }
}
