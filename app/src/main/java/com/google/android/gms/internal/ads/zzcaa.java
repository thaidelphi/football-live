package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcaa {
    private final Context zza;
    private final zzcal zzb;
    private final ViewGroup zzc;
    private zzbzz zzd;

    public zzcaa(Context context, ViewGroup viewGroup, zzcdq zzcdqVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcdqVar;
        this.zzd = null;
    }

    public final zzbzz zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzbzz zzbzzVar = this.zzd;
        if (zzbzzVar != null) {
            return zzbzzVar.zzl();
        }
        return null;
    }

    public final void zzc(int i10, int i11, int i12, int i13) {
        Preconditions.f("The underlay may only be modified from the UI thread.");
        zzbzz zzbzzVar = this.zzd;
        if (zzbzzVar != null) {
            zzbzzVar.zzF(i10, i11, i12, i13);
        }
    }

    public final void zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcak zzcakVar) {
        if (this.zzd != null) {
            return;
        }
        zzbbt.zza(this.zzb.zzl().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcal zzcalVar = this.zzb;
        zzbzz zzbzzVar = new zzbzz(context, zzcalVar, i14, z10, zzcalVar.zzl().zza(), zzcakVar);
        this.zzd = zzbzzVar;
        this.zzc.addView(zzbzzVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i10, i11, i12, i13);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.f("onDestroy must be called from the UI thread.");
        zzbzz zzbzzVar = this.zzd;
        if (zzbzzVar != null) {
            zzbzzVar.zzq();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.f("onPause must be called from the UI thread.");
        zzbzz zzbzzVar = this.zzd;
        if (zzbzzVar != null) {
            zzbzzVar.zzu();
        }
    }

    public final void zzg(int i10) {
        zzbzz zzbzzVar = this.zzd;
        if (zzbzzVar != null) {
            zzbzzVar.zzC(i10);
        }
    }
}
