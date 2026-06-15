package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzelr implements zzerv {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final String zzf;
    private final zzcro zzg;

    public zzelr(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, String str3, zzcro zzcroVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzcroVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfB)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.zzq();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzq(this.zza));
            } catch (RemoteException | RuntimeException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcth zzcthVar = (zzcth) obj;
        zzcthVar.zzb.putBundle("quality_signals", this.zzb);
        zzc(zzcthVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcth) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzN()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !this.zze.zzN());
        zzc(bundle);
        if (this.zzf != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dload", this.zzg.zzb(this.zzf));
            bundle2.putInt("pcc", this.zzg.zza(this.zzf));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjG)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zza() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzv.zzp().zza());
    }
}
