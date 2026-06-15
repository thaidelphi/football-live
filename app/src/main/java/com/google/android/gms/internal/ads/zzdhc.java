package com.google.android.gms.internal.ads;

import androidx.collection.h;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdhc {
    public static final zzdhc zza = new zzdhc(new zzdha());
    private final zzbfz zzb;
    private final zzbfw zzc;
    private final zzbgm zzd;
    private final zzbgj zze;
    private final zzblh zzf;
    private final h zzg;
    private final h zzh;

    private zzdhc(zzdha zzdhaVar) {
        this.zzb = zzdhaVar.zza;
        this.zzc = zzdhaVar.zzb;
        this.zzd = zzdhaVar.zzc;
        this.zzg = new h(zzdhaVar.zzf);
        this.zzh = new h(zzdhaVar.zzg);
        this.zze = zzdhaVar.zzd;
        this.zzf = zzdhaVar.zze;
    }

    public final zzbfw zza() {
        return this.zzc;
    }

    public final zzbfz zzb() {
        return this.zzb;
    }

    public final zzbgc zzc(String str) {
        return (zzbgc) this.zzh.get(str);
    }

    public final zzbgf zzd(String str) {
        if (str == null) {
            return null;
        }
        return (zzbgf) this.zzg.get(str);
    }

    public final zzbgj zze() {
        return this.zze;
    }

    public final zzbgm zzf() {
        return this.zzd;
    }

    public final zzblh zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i10 = 0; i10 < this.zzg.size(); i10++) {
            arrayList.add((String) this.zzg.i(i10));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
