package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzchl {
    private zzcft zza;
    private zzcif zzb;
    private zzfex zzc;
    private zzcis zzd;
    private zzfbr zze;

    private zzchl() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchl(zzcie zzcieVar) {
    }

    public final zzcfq zza() {
        zzhds.zzc(this.zza, zzcft.class);
        zzhds.zzc(this.zzb, zzcif.class);
        if (this.zzc == null) {
            this.zzc = new zzfex();
        }
        if (this.zzd == null) {
            this.zzd = new zzcis();
        }
        if (this.zze == null) {
            this.zze = new zzfbr();
        }
        return new zzcha(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzchl zzb(zzcft zzcftVar) {
        this.zza = zzcftVar;
        return this;
    }

    public final zzchl zzc(zzcif zzcifVar) {
        this.zzb = zzcifVar;
        return this;
    }
}
