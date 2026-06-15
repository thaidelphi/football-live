package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkn implements zzuj, zzqu {
    final /* synthetic */ zzkr zza;
    private final zzkp zzb;

    public zzkn(zzkr zzkrVar, zzkp zzkpVar) {
        this.zza = zzkrVar;
        this.zzb = zzkpVar;
    }

    private final Pair zzf(int i10, zzty zztyVar) {
        zzty zztyVar2;
        zzty zztyVar3 = null;
        if (zztyVar != null) {
            zzkp zzkpVar = this.zzb;
            int i11 = 0;
            while (true) {
                if (i11 >= zzkpVar.zzc.size()) {
                    zztyVar2 = null;
                    break;
                } else if (((zzty) zzkpVar.zzc.get(i11)).zzd == zztyVar.zzd) {
                    Object obj = zztyVar.zza;
                    Object obj2 = zzkpVar.zzb;
                    int i12 = zzky.zzb;
                    zztyVar2 = zztyVar.zza(Pair.create(obj2, obj));
                    break;
                } else {
                    i11++;
                }
            }
            if (zztyVar2 == null) {
                return null;
            }
            zztyVar3 = zztyVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zztyVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzaf(int i10, zzty zztyVar, final zztu zztuVar) {
        zzdg zzdgVar;
        final Pair zzf = zzf(0, zztyVar);
        if (zzf != null) {
            zzdgVar = this.zza.zzi;
            zzdgVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // java.lang.Runnable
                public final void run() {
                    zzlm zzlmVar;
                    Pair pair = zzf;
                    zzlmVar = zzkn.this.zza.zzh;
                    zzlmVar.zzaf(((Integer) pair.first).intValue(), (zzty) pair.second, zztuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzag(int i10, zzty zztyVar, final zztp zztpVar, final zztu zztuVar) {
        zzdg zzdgVar;
        final Pair zzf = zzf(0, zztyVar);
        if (zzf != null) {
            zzdgVar = this.zza.zzi;
            zzdgVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // java.lang.Runnable
                public final void run() {
                    zzlm zzlmVar;
                    Pair pair = zzf;
                    zzlmVar = zzkn.this.zza.zzh;
                    zzlmVar.zzag(((Integer) pair.first).intValue(), (zzty) pair.second, zztpVar, zztuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzah(int i10, zzty zztyVar, final zztp zztpVar, final zztu zztuVar) {
        zzdg zzdgVar;
        final Pair zzf = zzf(0, zztyVar);
        if (zzf != null) {
            zzdgVar = this.zza.zzi;
            zzdgVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // java.lang.Runnable
                public final void run() {
                    zzlm zzlmVar;
                    Pair pair = zzf;
                    zzlmVar = zzkn.this.zza.zzh;
                    zzlmVar.zzah(((Integer) pair.first).intValue(), (zzty) pair.second, zztpVar, zztuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzai(int i10, zzty zztyVar, final zztp zztpVar, final zztu zztuVar, final IOException iOException, final boolean z10) {
        zzdg zzdgVar;
        final Pair zzf = zzf(0, zztyVar);
        if (zzf != null) {
            zzdgVar = this.zza.zzi;
            zzdgVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // java.lang.Runnable
                public final void run() {
                    zzlm zzlmVar;
                    Pair pair = zzf;
                    zzlmVar = zzkn.this.zza.zzh;
                    zzlmVar.zzai(((Integer) pair.first).intValue(), (zzty) pair.second, zztpVar, zztuVar, iOException, z10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzaj(int i10, zzty zztyVar, final zztp zztpVar, final zztu zztuVar, final int i11) {
        zzdg zzdgVar;
        final Pair zzf = zzf(0, zztyVar);
        if (zzf != null) {
            zzdgVar = this.zza.zzi;
            zzdgVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // java.lang.Runnable
                public final void run() {
                    zzlm zzlmVar;
                    Pair pair = zzf;
                    zzlmVar = zzkn.this.zza.zzh;
                    zzlmVar.zzaj(((Integer) pair.first).intValue(), (zzty) pair.second, zztpVar, zztuVar, i11);
                }
            });
        }
    }
}
