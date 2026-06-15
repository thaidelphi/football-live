package com.google.android.gms.internal.ads;

import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaep extends zzaet {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaep(zzadp zzadpVar) {
        super(zzadpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zza(zzdx zzdxVar) throws zzaes {
        if (!this.zzc) {
            int zzm = zzdxVar.zzm();
            int i10 = zzm >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzm >> 2) & 3];
                zzx zzxVar = new zzx();
                zzxVar.zzE("video/x-flv");
                zzxVar.zzad("audio/mpeg");
                zzxVar.zzB(1);
                zzxVar.zzae(i11);
                this.zza.zzm(zzxVar.zzaj());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                zzx zzxVar2 = new zzx();
                zzxVar2.zzE("video/x-flv");
                zzxVar2.zzad(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzxVar2.zzB(1);
                zzxVar2.zzae(8000);
                this.zza.zzm(zzxVar2.zzaj());
                this.zzd = true;
            } else if (i10 != 10) {
                throw new zzaes("Audio format not supported: " + i10);
            }
            this.zzc = true;
        } else {
            zzdxVar.zzM(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zzb(zzdx zzdxVar, long j10) throws zzaz {
        if (this.zze == 2) {
            int zzb2 = zzdxVar.zzb();
            this.zza.zzr(zzdxVar, zzb2);
            this.zza.zzt(j10, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzdxVar.zzm();
        if (zzm == 0 && !this.zzd) {
            int zzb3 = zzdxVar.zzb();
            byte[] bArr = new byte[zzb3];
            zzdxVar.zzH(bArr, 0, zzb3);
            zzabd zza = zzabf.zza(bArr);
            zzx zzxVar = new zzx();
            zzxVar.zzE("video/x-flv");
            zzxVar.zzad("audio/mp4a-latm");
            zzxVar.zzC(zza.zzc);
            zzxVar.zzB(zza.zzb);
            zzxVar.zzae(zza.zza);
            zzxVar.zzP(Collections.singletonList(bArr));
            this.zza.zzm(zzxVar.zzaj());
            this.zzd = true;
            return false;
        } else if (this.zze != 10 || zzm == 1) {
            int zzb4 = zzdxVar.zzb();
            this.zza.zzr(zzdxVar, zzb4);
            this.zza.zzt(j10, 1, zzb4, 0, null);
            return true;
        } else {
            return false;
        }
    }
}
