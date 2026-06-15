package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbar;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdet implements zzcuf, zzdbj {
    private final zzbwx zza;
    private final Context zzb;
    private final zzbxb zzc;
    private final View zzd;
    private String zze;
    private final zzbar.zza.EnumC0178zza zzf;

    public zzdet(zzbwx zzbwxVar, Context context, zzbxb zzbxbVar, View view, zzbar.zza.EnumC0178zza enumC0178zza) {
        this.zza = zzbwxVar;
        this.zzb = context;
        this.zzc = zzbxbVar;
        this.zzd = view;
        this.zzf = enumC0178zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(zzbup zzbupVar, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzbxb zzbxbVar = this.zzc;
                Context context = this.zzb;
                zzbxbVar.zzl(context, zzbxbVar.zzb(context), this.zza.zza(), zzbupVar.zzc(), zzbupVar.zzb());
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception to get reward item.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzl() {
        if (this.zzf == zzbar.zza.EnumC0178zza.APP_OPEN) {
            return;
        }
        String zzd = this.zzc.zzd(this.zzb);
        this.zze = zzd;
        this.zze = String.valueOf(zzd).concat(this.zzf == zzbar.zza.EnumC0178zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
