package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaiq extends zzaiu {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzdx zzdxVar) {
        return zzk(zzdxVar, zza);
    }

    private static boolean zzk(zzdx zzdxVar, byte[] bArr) {
        if (zzdxVar.zzb() < 8) {
            return false;
        }
        int zzd = zzdxVar.zzd();
        byte[] bArr2 = new byte[8];
        zzdxVar.zzH(bArr2, 0, 8);
        zzdxVar.zzL(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    protected final long zza(zzdx zzdxVar) {
        return zzg(zzade.zzd(zzdxVar.zzN()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    protected final boolean zzc(zzdx zzdxVar, long j10, zzair zzairVar) throws zzaz {
        if (zzk(zzdxVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzdxVar.zzN(), zzdxVar.zze());
            int i10 = copyOf[9] & 255;
            List zze = zzade.zze(copyOf);
            if (zzairVar.zza == null) {
                zzx zzxVar = new zzx();
                zzxVar.zzE("audio/ogg");
                zzxVar.zzad("audio/opus");
                zzxVar.zzB(i10);
                zzxVar.zzae(48000);
                zzxVar.zzP(zze);
                zzairVar.zza = zzxVar.zzaj();
                return true;
            }
        } else if (zzk(zzdxVar, zzb)) {
            zzcv.zzb(zzairVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzdxVar.zzM(8);
                zzav zzb2 = zzadv.zzb(zzfvv.zzm(zzadv.zzc(zzdxVar, false, false).zza));
                if (zzb2 != null) {
                    zzx zzb3 = zzairVar.zza.zzb();
                    zzb3.zzW(zzb2.zzd(zzairVar.zza.zzl));
                    zzairVar.zza = zzb3.zzaj();
                }
            }
        } else {
            zzcv.zzb(zzairVar.zza);
            return false;
        }
        return true;
    }
}
