package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzbar;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfcd implements zzfcc {
    private final ConcurrentHashMap zza;
    private final zzfcj zzb;
    private final zzfcf zzc = new zzfcf();

    public zzfcd(zzfcj zzfcjVar) {
        this.zza = new ConcurrentHashMap(zzfcjVar.zzd);
        this.zzb = zzfcjVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfcj> creator = zzfcj.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgi)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb.append(i10);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfcm) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i11 = 0; i11 < ((zzfcb) entry.getValue()).zzb(); i11++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfcb) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfcb) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb.append(i10);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final zzfcj zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized zzfcl zzb(zzfcm zzfcmVar) {
        zzfcl zzfclVar;
        zzfcb zzfcbVar = (zzfcb) this.zza.get(zzfcmVar);
        if (zzfcbVar != null) {
            zzfclVar = zzfcbVar.zze();
            if (zzfclVar == null) {
                this.zzc.zze();
            }
            zzfcz zzf = zzfcbVar.zzf();
            if (zzfclVar != null) {
                zzbar.zzb.zzc zzd = zzbar.zzb.zzd();
                zzbar.zzb.zza.C0181zza zza = zzbar.zzb.zza.zza();
                zza.zzf(zzbar.zzb.zzd.IN_MEMORY);
                zzbar.zzb.zze.zza zzb = zzbar.zzb.zze.zzb();
                zzb.zzd(zzf.zza);
                zzb.zze(zzf.zzb);
                zza.zzg(zzb);
                zzd.zzd(zza);
                zzfclVar.zza.zzb().zzc().zzi(zzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfclVar = null;
        }
        return zzfclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    @Deprecated
    public final zzfcm zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        return new zzfcn(zzmVar, str, new zzbug(this.zzb.zza).zza().zzj, this.zzb.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized boolean zzd(zzfcm zzfcmVar, zzfcl zzfclVar) {
        boolean zzh;
        zzfcb zzfcbVar = (zzfcb) this.zza.get(zzfcmVar);
        zzfclVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().a();
        if (zzfcbVar == null) {
            zzfcj zzfcjVar = this.zzb;
            zzfcb zzfcbVar2 = new zzfcb(zzfcjVar.zzd, zzfcjVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i10 = this.zzb.zzg;
                int i11 = i10 - 1;
                zzfcm zzfcmVar2 = null;
                if (i10 != 0) {
                    long j10 = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfcb) entry.getValue()).zzc() < j10) {
                                j10 = ((zzfcb) entry.getValue()).zzc();
                                zzfcmVar2 = (zzfcm) entry.getKey();
                            }
                        }
                        if (zzfcmVar2 != null) {
                            this.zza.remove(zzfcmVar2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfcb) entry2.getValue()).zzd() < j10) {
                                j10 = ((zzfcb) entry2.getValue()).zzd();
                                zzfcmVar2 = (zzfcm) entry2.getKey();
                            }
                        }
                        if (zzfcmVar2 != null) {
                            this.zza.remove(zzfcmVar2);
                        }
                    } else if (i11 == 2) {
                        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfcb) entry3.getValue()).zza() < i12) {
                                i12 = ((zzfcb) entry3.getValue()).zza();
                                zzfcmVar2 = (zzfcm) entry3.getKey();
                            }
                        }
                        if (zzfcmVar2 != null) {
                            this.zza.remove(zzfcmVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfcmVar, zzfcbVar2);
            this.zzc.zzd();
            zzfcbVar = zzfcbVar2;
        }
        zzh = zzfcbVar.zzh(zzfclVar);
        this.zzc.zzc();
        zzfce zza = this.zzc.zza();
        zzfcz zzf = zzfcbVar.zzf();
        zzbar.zzb.zzc zzd = zzbar.zzb.zzd();
        zzbar.zzb.zza.C0181zza zza2 = zzbar.zzb.zza.zza();
        zza2.zzf(zzbar.zzb.zzd.IN_MEMORY);
        zzbar.zzb.zzg.zza zzb = zzbar.zzb.zzg.zzb();
        zzb.zze(zza.zza);
        zzb.zzf(zza.zzb);
        zzb.zzg(zzf.zzb);
        zza2.zzi(zzb);
        zzd.zzd(zza2);
        zzfclVar.zza.zzb().zzc().zzj(zzd.zzbr());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized boolean zze(zzfcm zzfcmVar) {
        zzfcb zzfcbVar = (zzfcb) this.zza.get(zzfcmVar);
        if (zzfcbVar != null) {
            return zzfcbVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
