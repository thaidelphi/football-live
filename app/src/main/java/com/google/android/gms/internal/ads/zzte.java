package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzte implements zzuj, zzqu {
    final /* synthetic */ zztg zza;
    private final Object zzb;
    private zzui zzc;
    private zzqt zzd;

    public zzte(zztg zztgVar, Object obj) {
        this.zza = zztgVar;
        this.zzc = zztgVar.zze(null);
        this.zzd = zztgVar.zzc(null);
        this.zzb = obj;
    }

    private final zztu zzf(zztu zztuVar, zzty zztyVar) {
        zztg zztgVar = this.zza;
        Object obj = this.zzb;
        long j10 = zztuVar.zzc;
        zztgVar.zzx(obj, j10, zztyVar);
        zztg zztgVar2 = this.zza;
        Object obj2 = this.zzb;
        long j11 = zztuVar.zzd;
        zztgVar2.zzx(obj2, j11, zztyVar);
        return (j10 == zztuVar.zzc && j11 == zztuVar.zzd) ? zztuVar : new zztu(1, zztuVar.zza, zztuVar.zzb, 0, null, j10, j11);
    }

    private final boolean zzg(int i10, zzty zztyVar) {
        zzty zztyVar2;
        if (zztyVar != null) {
            zztyVar2 = this.zza.zzy(this.zzb, zztyVar);
            if (zztyVar2 == null) {
                return false;
            }
        } else {
            zztyVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzui zzuiVar = this.zzc;
        int i11 = zzuiVar.zza;
        zzty zztyVar3 = zzuiVar.zzb;
        int i12 = zzeh.zza;
        if (!Objects.equals(zztyVar3, zztyVar2)) {
            this.zzc = this.zza.zzf(0, zztyVar2);
        }
        zzqt zzqtVar = this.zzd;
        int i13 = zzqtVar.zza;
        if (Objects.equals(zzqtVar.zzb, zztyVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zztyVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzaf(int i10, zzty zztyVar, zztu zztuVar) {
        if (zzg(0, zztyVar)) {
            this.zzc.zzd(zzf(zztuVar, zztyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzag(int i10, zzty zztyVar, zztp zztpVar, zztu zztuVar) {
        if (zzg(0, zztyVar)) {
            this.zzc.zze(zztpVar, zzf(zztuVar, zztyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzah(int i10, zzty zztyVar, zztp zztpVar, zztu zztuVar) {
        if (zzg(0, zztyVar)) {
            this.zzc.zzf(zztpVar, zzf(zztuVar, zztyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzai(int i10, zzty zztyVar, zztp zztpVar, zztu zztuVar, IOException iOException, boolean z10) {
        if (zzg(0, zztyVar)) {
            this.zzc.zzg(zztpVar, zzf(zztuVar, zztyVar), iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzaj(int i10, zzty zztyVar, zztp zztpVar, zztu zztuVar, int i11) {
        if (zzg(0, zztyVar)) {
            this.zzc.zzh(zztpVar, zzf(zztuVar, zztyVar), i11);
        }
    }
}
