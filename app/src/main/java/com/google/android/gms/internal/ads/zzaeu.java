package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaeu extends zzaet {
    private final zzdx zzb;
    private final zzdx zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaeu(zzadp zzadpVar) {
        super(zzadpVar);
        this.zzb = new zzdx(zzfd.zza);
        this.zzc = new zzdx(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zza(zzdx zzdxVar) throws zzaes {
        int zzm = zzdxVar.zzm();
        int i10 = zzm >> 4;
        int i11 = zzm & 15;
        if (i11 == 7) {
            this.zzg = i10;
            return i10 != 5;
        }
        throw new zzaes("Video format not supported: " + i11);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zzb(zzdx zzdxVar, long j10) throws zzaz {
        int i10;
        int zzm = zzdxVar.zzm();
        long zzh = zzdxVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzdx zzdxVar2 = new zzdx(new byte[zzdxVar.zzb()]);
                zzdxVar.zzH(zzdxVar2.zzN(), 0, zzdxVar.zzb());
                zzabn zza = zzabn.zza(zzdxVar2);
                this.zzd = zza.zzb;
                zzx zzxVar = new zzx();
                zzxVar.zzE("video/x-flv");
                zzxVar.zzad(MimeTypes.VIDEO_H264);
                zzxVar.zzC(zza.zzl);
                zzxVar.zzai(zza.zzc);
                zzxVar.zzM(zza.zzd);
                zzxVar.zzZ(zza.zzk);
                zzxVar.zzP(zza.zza);
                this.zza.zzm(zzxVar.zzaj());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            int i11 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i10 = i11;
            } else if (i11 != 0) {
                i10 = 1;
            }
            byte[] zzN = this.zzc.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzdxVar.zzb() > 0) {
                zzdxVar.zzH(this.zzc.zzN(), i12, this.zzd);
                this.zzc.zzL(0);
                zzdx zzdxVar3 = this.zzc;
                zzdx zzdxVar4 = this.zzb;
                int zzp = zzdxVar3.zzp();
                zzdxVar4.zzL(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzdxVar, zzp);
                i13 = i13 + 4 + zzp;
            }
            this.zza.zzt(j10 + (zzh * 1000), i10, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
