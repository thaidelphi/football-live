package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzekl implements zzerv {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzekl(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        Preconditions.n(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = z11;
    }

    private final void zzc(Bundle bundle) {
        zzfbd.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfbd.zzf(bundle, "smart_h", "auto", this.zza.zzb == -2);
        zzfbd.zzg(bundle, "ene", true, this.zza.zzj);
        zzfbd.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzfbd.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfbd.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfbd.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfbd.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfbd.zzc(bundle, "format", this.zzb);
        zzfbd.zzf(bundle, "fluid", "height", this.zzc);
        zzfbd.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfbd.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = this.zza.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar.zzi);
                bundle3.putInt("height", zzrVar.zzb);
                bundle3.putInt("width", zzrVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcth) obj).zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcth) obj).zza);
    }
}
