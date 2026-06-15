package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcto {
    private final Context zza;
    private final zzfap zzb;
    private final Bundle zzc;
    private final zzfah zzd;
    private final zzctf zze;
    private final zzebl zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcto(zzctm zzctmVar, zzctn zzctnVar) {
        this.zza = zzctm.zzb(zzctmVar);
        this.zzb = zzctm.zzo(zzctmVar);
        this.zzc = zzctm.zzc(zzctmVar);
        this.zzd = zzctm.zzn(zzctmVar);
        this.zze = zzctm.zzd(zzctmVar);
        this.zzf = zzctm.zzm(zzctmVar);
        this.zzg = zzctm.zza(zzctmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzb(Context context) {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzc() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzctf zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzctm zze() {
        zzctm zzctmVar = new zzctm();
        zzctmVar.zzf(this.zza);
        zzctmVar.zzk(this.zzb);
        zzctmVar.zzg(this.zzc);
        zzctmVar.zzh(this.zze);
        zzctmVar.zze(this.zzf);
        return zzctmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzebl zzf(String str) {
        zzebl zzeblVar = this.zzf;
        return zzeblVar != null ? zzeblVar : new zzebl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfah zzg() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfap zzh() {
        return this.zzb;
    }
}
