package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzhb extends zzbn {
    private final int zzb;
    private final zzvv zzc;

    public zzhb(boolean z10, zzvv zzvvVar) {
        this.zzc = zzvvVar;
        this.zzb = zzvvVar.zzc();
    }

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zzd(i10);
        }
        if (i10 >= this.zzb - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp != -1 && (zza = zzu(zzp).zza(obj3)) != -1) {
                return zzs(zzp) + zza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i10, zzbl zzblVar, boolean z10) {
        int zzq = zzq(i10);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i10 - zzs(zzq), zzblVar, z10);
        zzblVar.zzc += zzt;
        if (z10) {
            Object zzv = zzv(zzq);
            Object obj = zzblVar.zzb;
            Objects.requireNonNull(obj);
            zzblVar.zzb = Pair.create(zzv, obj);
        }
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i10, zzbm zzbmVar, long j10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i10 - zzt, zzbmVar, j10);
        Object zzv = zzv(zzr);
        if (!zzbm.zza.equals(zzbmVar.zzb)) {
            zzv = Pair.create(zzv, zzbmVar.zzb);
        }
        zzbmVar.zzb = zzv;
        zzbmVar.zzn += zzs;
        zzbmVar.zzo += zzs;
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i10) {
        int zzq = zzq(i10);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i10 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzg(boolean z10) {
        if (this.zzb != 0) {
            int zza = z10 ? this.zzc.zza() : 0;
            while (zzu(zza).zzo()) {
                zza = zzw(zza, z10);
                if (zza == -1) {
                    return -1;
                }
            }
            return zzt(zza) + zzu(zza).zzg(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzh(boolean z10) {
        int i10 = this.zzb;
        if (i10 != 0) {
            int zzb = z10 ? this.zzc.zzb() : i10 - 1;
            while (zzu(zzb).zzo()) {
                zzb = zzx(zzb, z10);
                if (zzb == -1) {
                    return -1;
                }
            }
            return zzt(zzb) + zzu(zzb).zzh(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzj(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i10 - zzt, i11 == 2 ? 0 : i11, z10);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z10);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z10);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z10);
        }
        if (i11 == 2) {
            return zzg(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzk(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i10 - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzt(zzx) + zzu(zzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzn(Object obj, zzbl zzblVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzblVar);
        zzblVar.zzc += zzt;
        zzblVar.zzb = obj;
        return zzblVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i10);

    protected abstract int zzr(int i10);

    protected abstract int zzs(int i10);

    protected abstract int zzt(int i10);

    protected abstract zzbn zzu(int i10);

    protected abstract Object zzv(int i10);
}
