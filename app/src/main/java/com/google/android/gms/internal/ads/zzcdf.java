package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcdf extends zzbzr {
    private final zzcam zzc;
    private zzcdg zzd;
    private Uri zze;
    private zzbzq zzf;
    private boolean zzg;
    private int zzh;

    public zzcdf(Context context, zzcam zzcamVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcamVar;
        zzcamVar.zza(this);
    }

    public static /* synthetic */ void zzi(zzcdf zzcdfVar) {
        zzbzq zzbzqVar = zzcdfVar.zzf;
        if (zzbzqVar != null) {
            if (!zzcdfVar.zzg) {
                zzbzqVar.zzg();
                zzcdfVar.zzg = true;
            }
            zzcdfVar.zzf.zze();
        }
    }

    public static /* synthetic */ void zzk(zzcdf zzcdfVar) {
        zzbzq zzbzqVar = zzcdfVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzd();
        }
    }

    public static /* synthetic */ void zzl(zzcdf zzcdfVar) {
        zzbzq zzbzqVar = zzcdfVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzf();
        }
    }

    private final boolean zzm() {
        int i10 = this.zzh;
        return (i10 == 1 || i10 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i10) {
        if (i10 == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i10;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcdf.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final long zzh() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final String zzj() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzbzr, com.google.android.gms.internal.ads.zzcao
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcde
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdf.zzk(zzcdf.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdf.zzi(zzcdf.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzq(int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView seek " + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzr(zzbzq zzbzqVar) {
        this.zzf = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzs(String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.zze = parse;
            this.zzd = new zzcdg(parse.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdf.zzl(zzcdf.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcdg zzcdgVar = this.zzd;
        if (zzcdgVar != null) {
            zzcdgVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzu(float f10, float f11) {
    }
}
