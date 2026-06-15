package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzib {
    final Context zza;
    zzcw zzb;
    zzftn zzc;
    zzftn zzd;
    zzftn zze;
    zzftn zzf;
    zzftn zzg;
    zzfsk zzh;
    Looper zzi;
    int zzj;
    zze zzk;
    int zzl;
    boolean zzm;
    zzlg zzn;
    long zzo;
    long zzp;
    boolean zzq;
    boolean zzr;
    String zzs;
    zzhm zzt;

    public zzib(final Context context, zzccw zzccwVar) {
        zzhu zzhuVar = new zzhu(zzccwVar);
        zzhv zzhvVar = new zzhv(context);
        zzftn zzftnVar = new zzftn() { // from class: com.google.android.gms.internal.ads.zzhw
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return new zzxn(context);
            }
        };
        zzftn zzftnVar2 = new zzftn() { // from class: com.google.android.gms.internal.ads.zzhx
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return new zzhp();
            }
        };
        zzhy zzhyVar = new zzhy(context);
        zzfsk zzfskVar = new zzfsk() { // from class: com.google.android.gms.internal.ads.zzhz
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zznq((zzcw) obj);
            }
        };
        Objects.requireNonNull(context);
        this.zza = context;
        this.zzc = zzhuVar;
        this.zzd = zzhvVar;
        this.zze = zzftnVar;
        this.zzf = zzftnVar2;
        this.zzg = zzhyVar;
        this.zzh = zzfskVar;
        this.zzi = zzeh.zzz();
        this.zzk = zze.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzlg.zzb;
        this.zzt = new zzhm(0.97f, 1.03f, 1000L, 1.0E-7f, zzeh.zzs(20L), zzeh.zzs(500L), 0.999f, null);
        this.zzb = zzcw.zza;
        this.zzo = 500L;
        this.zzp = 2000L;
        this.zzq = true;
        this.zzs = "";
        this.zzj = -1000;
    }

    public static /* synthetic */ zztx zza(Context context) {
        return new zztl(context, new zzacd());
    }
}
