package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zznp {
    private final zzbl zza;
    private zzfvv zzb = zzfvv.zzn();
    private zzfvy zzc = zzfvy.zzd();
    private zzty zzd;
    private zzty zze;
    private zzty zzf;

    public zznp(zzbl zzblVar) {
        this.zza = zzblVar;
    }

    private static zzty zzj(zzbh zzbhVar, zzfvv zzfvvVar, zzty zztyVar, zzbl zzblVar) {
        zzbn zzo = zzbhVar.zzo();
        int zzf = zzbhVar.zzf();
        Object zzf2 = zzo.zzo() ? null : zzo.zzf(zzf);
        int zzc = (zzbhVar.zzx() || zzo.zzo()) ? -1 : zzo.zzd(zzf, zzblVar, false).zzc(zzeh.zzs(zzbhVar.zzl()));
        for (int i10 = 0; i10 < zzfvvVar.size(); i10++) {
            zzty zztyVar2 = (zzty) zzfvvVar.get(i10);
            if (zzm(zztyVar2, zzf2, zzbhVar.zzx(), zzbhVar.zzc(), zzbhVar.zzd(), zzc)) {
                return zztyVar2;
            }
        }
        if (zzfvvVar.isEmpty() && zztyVar != null) {
            if (zzm(zztyVar, zzf2, zzbhVar.zzx(), zzbhVar.zzc(), zzbhVar.zzd(), zzc)) {
                return zztyVar;
            }
        }
        return null;
    }

    private final void zzk(zzfvx zzfvxVar, zzty zztyVar, zzbn zzbnVar) {
        if (zztyVar == null) {
            return;
        }
        if (zzbnVar.zza(zztyVar.zza) != -1) {
            zzfvxVar.zza(zztyVar, zzbnVar);
            return;
        }
        zzbn zzbnVar2 = (zzbn) this.zzc.get(zztyVar);
        if (zzbnVar2 != null) {
            zzfvxVar.zza(zztyVar, zzbnVar2);
        }
    }

    private final void zzl(zzbn zzbnVar) {
        zzfvx zzfvxVar = new zzfvx();
        if (this.zzb.isEmpty()) {
            zzk(zzfvxVar, this.zze, zzbnVar);
            if (!zzfss.zza(this.zzf, this.zze)) {
                zzk(zzfvxVar, this.zzf, zzbnVar);
            }
            if (!zzfss.zza(this.zzd, this.zze) && !zzfss.zza(this.zzd, this.zzf)) {
                zzk(zzfvxVar, this.zzd, zzbnVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfvxVar, (zzty) this.zzb.get(i10), zzbnVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfvxVar, this.zzd, zzbnVar);
            }
        }
        this.zzc = zzfvxVar.zzc();
    }

    private static boolean zzm(zzty zztyVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (zztyVar.zza.equals(obj)) {
            if (z10) {
                if (zztyVar.zzb != i10 || zztyVar.zzc != i11) {
                    return false;
                }
            } else if (zztyVar.zzb != -1 || zztyVar.zze != i12) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzbn zza(zzty zztyVar) {
        return (zzbn) this.zzc.get(zztyVar);
    }

    public final zzty zzb() {
        return this.zzd;
    }

    public final zzty zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfvv zzfvvVar = this.zzb;
        if (zzfvvVar instanceof List) {
            if (!zzfvvVar.isEmpty()) {
                obj = zzfvvVar.get(zzfvvVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzfvvVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzty) obj;
    }

    public final zzty zzd() {
        return this.zze;
    }

    public final zzty zze() {
        return this.zzf;
    }

    public final void zzg(zzbh zzbhVar) {
        this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzty zztyVar, zzbh zzbhVar) {
        this.zzb = zzfvv.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzty) list.get(0);
            Objects.requireNonNull(zztyVar);
            this.zzf = zztyVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbhVar.zzo());
    }

    public final void zzi(zzbh zzbhVar) {
        this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
        zzl(zzbhVar.zzo());
    }
}
