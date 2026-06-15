package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzbt {
    public final boolean zzA;
    public final zzfvy zzB;
    public final zzfwa zzC;
    public final int zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zze = 0;
    public final int zzf = 0;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final zzfvv zzl;
    public final zzfvv zzm;
    public final int zzn;
    public final zzfvv zzo;
    public final int zzp;
    public final int zzq;
    public final int zzr;
    public final zzfvv zzs;
    public final zzbr zzt;
    public final zzfvv zzu;
    public final int zzv;
    public final int zzw;
    public final boolean zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        new zzbt(new zzbs());
        int i10 = zzeh.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbt(zzbs zzbsVar) {
        int i10;
        int i11;
        boolean z10;
        zzfvv zzfvvVar;
        zzfvv zzfvvVar2;
        zzfvv zzfvvVar3;
        zzfvv zzfvvVar4;
        zzbr zzbrVar;
        zzfvv zzfvvVar5;
        int i12;
        HashMap hashMap;
        HashSet hashSet;
        i10 = zzbsVar.zze;
        this.zzi = i10;
        i11 = zzbsVar.zzf;
        this.zzj = i11;
        z10 = zzbsVar.zzg;
        this.zzk = z10;
        zzfvvVar = zzbsVar.zzh;
        this.zzl = zzfvvVar;
        zzfvvVar2 = zzbsVar.zzi;
        this.zzm = zzfvvVar2;
        this.zzn = 0;
        zzfvvVar3 = zzbsVar.zzj;
        this.zzo = zzfvvVar3;
        this.zzp = 0;
        this.zzq = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzr = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        zzfvvVar4 = zzbsVar.zzm;
        this.zzs = zzfvvVar4;
        zzbrVar = zzbsVar.zzn;
        this.zzt = zzbrVar;
        zzfvvVar5 = zzbsVar.zzo;
        this.zzu = zzfvvVar5;
        i12 = zzbsVar.zzp;
        this.zzv = i12;
        this.zzw = 0;
        this.zzx = false;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        hashMap = zzbsVar.zzq;
        this.zzB = zzfvy.zzc(hashMap);
        hashSet = zzbsVar.zzr;
        this.zzC = zzfwa.zzl(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbt zzbtVar = (zzbt) obj;
            if (this.zzk == zzbtVar.zzk && this.zzi == zzbtVar.zzi && this.zzj == zzbtVar.zzj && this.zzl.equals(zzbtVar.zzl) && this.zzm.equals(zzbtVar.zzm) && this.zzo.equals(zzbtVar.zzo) && this.zzs.equals(zzbtVar.zzs) && this.zzt.equals(zzbtVar.zzt) && this.zzu.equals(zzbtVar.zzu) && this.zzv == zzbtVar.zzv && this.zzB.equals(zzbtVar.zzB) && this.zzC.equals(zzbtVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.zzk ? 1 : 0) - 1048002209) * 31) + this.zzi) * 31) + this.zzj) * 31) + this.zzl.hashCode()) * 31) + this.zzm.hashCode()) * 961) + this.zzo.hashCode()) * 961) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + this.zzs.hashCode()) * 31) + 29791) * 31) + this.zzu.hashCode()) * 31) + this.zzv) * 887503681) + this.zzB.hashCode()) * 31) + this.zzC.hashCode();
    }
}
