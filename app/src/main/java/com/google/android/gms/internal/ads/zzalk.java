package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalk implements zzalm {
    private final zzdx zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzadp zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzalk(String str, int i10, int i11, String str2) {
        this.zza = new zzdx(new byte[i11]);
        this.zzc = str;
        this.zzd = i10;
    }

    private final void zzf(zzacg zzacgVar) {
        int i10;
        zzx zzb;
        int i11 = zzacgVar.zzb;
        if (i11 == -2147483647 || (i10 = zzacgVar.zzc) == -1) {
            return;
        }
        zzz zzzVar = this.zzl;
        if (zzzVar != null && i10 == zzzVar.zzE && i11 == zzzVar.zzF) {
            String str = zzacgVar.zza;
            String str2 = zzzVar.zzo;
            int i12 = zzeh.zza;
            if (Objects.equals(str, str2)) {
                return;
            }
        }
        zzz zzzVar2 = this.zzl;
        if (zzzVar2 == null) {
            zzb = new zzx();
        } else {
            zzb = zzzVar2.zzb();
        }
        zzb.zzO(this.zzf);
        zzb.zzE(this.zze);
        zzb.zzad(zzacgVar.zza);
        zzb.zzB(zzacgVar.zzc);
        zzb.zzae(zzacgVar.zzb);
        zzb.zzS(this.zzc);
        zzb.zzab(this.zzd);
        zzz zzaj = zzb.zzaj();
        this.zzl = zzaj;
        this.zzg.zzm(zzaj);
    }

    private final boolean zzg(zzdx zzdxVar, byte[] bArr, int i10) {
        int min = Math.min(zzdxVar.zzb(), i10 - this.zzi);
        zzdxVar.zzH(bArr, this.zzi, min);
        int i11 = this.zzi + min;
        this.zzi = i11;
        return i11 == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
    @Override // com.google.android.gms.internal.ads.zzalm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzdx r20) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalk.zza(com.google.android.gms.internal.ads.zzdx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzf = zzanaVar.zzb();
        this.zzg = zzacmVar.zzw(zzanaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzq = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }
}
