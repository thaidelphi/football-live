package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkr {
    private final zznz zza;
    private final zzkq zze;
    private final zzlm zzh;
    private final zzdg zzi;
    private boolean zzj;
    private zzgr zzk;
    private zzvv zzl = new zzvv(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzkr(zzkq zzkqVar, zzlm zzlmVar, zzdg zzdgVar, zznz zznzVar) {
        this.zza = zznzVar;
        this.zze = zzkqVar;
        this.zzh = zzlmVar;
        this.zzi = zzdgVar;
    }

    private final void zzr(int i10, int i11) {
        while (i10 < this.zzb.size()) {
            ((zzkp) this.zzb.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzs(zzkp zzkpVar) {
        zzko zzkoVar = (zzko) this.zzf.get(zzkpVar);
        if (zzkoVar != null) {
            zzkoVar.zza.zzi(zzkoVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzkp zzkpVar = (zzkp) it.next();
            if (zzkpVar.zzc.isEmpty()) {
                zzs(zzkpVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzkp zzkpVar) {
        if (zzkpVar.zze && zzkpVar.zzc.isEmpty()) {
            zzko zzkoVar = (zzko) this.zzf.remove(zzkpVar);
            Objects.requireNonNull(zzkoVar);
            zzkoVar.zza.zzp(zzkoVar.zzb);
            zzkoVar.zza.zzs(zzkoVar.zzc);
            zzkoVar.zza.zzr(zzkoVar.zzc);
            this.zzg.remove(zzkpVar);
        }
    }

    private final void zzv(zzkp zzkpVar) {
        zztt zzttVar = zzkpVar.zza;
        zztz zztzVar = new zztz() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zztz
            public final void zza(zzua zzuaVar, zzbn zzbnVar) {
                zzkr.this.zze.zzi();
            }
        };
        zzkn zzknVar = new zzkn(this, zzkpVar);
        this.zzf.put(zzkpVar, new zzko(zzttVar, zztzVar, zzknVar));
        zzttVar.zzh(new Handler(zzeh.zzz(), null), zzknVar);
        zzttVar.zzg(new Handler(zzeh.zzz(), null), zzknVar);
        zzttVar.zzm(zztzVar, this.zzk, this.zza);
    }

    private final void zzw(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            zzkp zzkpVar = (zzkp) this.zzb.remove(i11);
            this.zzd.remove(zzkpVar.zzb);
            zzr(i11, -zzkpVar.zza.zzC().zzc());
            zzkpVar.zze = true;
            if (this.zzj) {
                zzu(zzkpVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbn zzb() {
        if (!this.zzb.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzb.size(); i11++) {
                zzkp zzkpVar = (zzkp) this.zzb.get(i11);
                zzkpVar.zzd = i10;
                i10 += zzkpVar.zza.zzC().zzc();
            }
            return new zzky(this.zzb, this.zzl);
        }
        return zzbn.zza;
    }

    public final zzbn zzc(int i10, int i11, List list) {
        zzcv.zzd(i10 >= 0 && i10 <= i11 && i11 <= zza());
        zzcv.zzd(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((zzkp) this.zzb.get(i12)).zza.zzt((zzap) list.get(i12 - i10));
        }
        return zzb();
    }

    public final void zzg(zzgr zzgrVar) {
        zzcv.zzf(!this.zzj);
        this.zzk = zzgrVar;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzkp zzkpVar = (zzkp) this.zzb.get(i10);
            zzv(zzkpVar);
            this.zzg.add(zzkpVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzko zzkoVar : this.zzf.values()) {
            try {
                zzkoVar.zza.zzp(zzkoVar.zzb);
            } catch (RuntimeException e8) {
                zzdn.zzd("MediaSourceList", "Failed to release child source.", e8);
            }
            zzkoVar.zza.zzs(zzkoVar.zzc);
            zzkoVar.zza.zzr(zzkoVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zztw zztwVar) {
        zzkp zzkpVar = (zzkp) this.zzc.remove(zztwVar);
        Objects.requireNonNull(zzkpVar);
        zzkpVar.zza.zzG(zztwVar);
        zzkpVar.zzc.remove(((zztq) zztwVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzkpVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbn zzk(int i10, List list, zzvv zzvvVar) {
        if (!list.isEmpty()) {
            this.zzl = zzvvVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzkp zzkpVar = (zzkp) list.get(i11 - i10);
                if (i11 > 0) {
                    zzkp zzkpVar2 = (zzkp) this.zzb.get(i11 - 1);
                    zzkpVar.zzc(zzkpVar2.zzd + zzkpVar2.zza.zzC().zzc());
                } else {
                    zzkpVar.zzc(0);
                }
                zzr(i11, zzkpVar.zza.zzC().zzc());
                this.zzb.add(i11, zzkpVar);
                this.zzd.put(zzkpVar.zzb, zzkpVar);
                if (this.zzj) {
                    zzv(zzkpVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkpVar);
                    } else {
                        zzs(zzkpVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbn zzl(int i10, int i11, int i12, zzvv zzvvVar) {
        zzcv.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzbn zzm(int i10, int i11, zzvv zzvvVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        }
        zzcv.zzd(z10);
        this.zzl = zzvvVar;
        zzw(i10, i11);
        return zzb();
    }

    public final zzbn zzn(List list, zzvv zzvvVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzvvVar);
    }

    public final zzbn zzo(zzvv zzvvVar) {
        int zza = zza();
        if (zzvvVar.zzc() != zza) {
            zzvvVar = zzvvVar.zzf().zzg(0, zza);
        }
        this.zzl = zzvvVar;
        return zzb();
    }

    public final zztw zzp(zzty zztyVar, zzye zzyeVar, long j10) {
        int i10 = zzky.zzb;
        Object obj = zztyVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzty zza = zztyVar.zza(((Pair) obj).second);
        zzkp zzkpVar = (zzkp) this.zzd.get(obj2);
        Objects.requireNonNull(zzkpVar);
        this.zzg.add(zzkpVar);
        zzko zzkoVar = (zzko) this.zzf.get(zzkpVar);
        if (zzkoVar != null) {
            zzkoVar.zza.zzk(zzkoVar.zzb);
        }
        zzkpVar.zzc.add(zza);
        zztq zzI = zzkpVar.zza.zzI(zza, zzyeVar, j10);
        this.zzc.put(zzI, zzkpVar);
        zzt();
        return zzI;
    }

    public final zzvv zzq() {
        return this.zzl;
    }
}
