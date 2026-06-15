package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfm extends zzfk {
    private Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzfl zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(byte[] bArr) {
        super(false);
        zzfl zzflVar = new zzfl(bArr);
        this.zzf = zzflVar;
        zzcv.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        zzcv.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final long zzb(zzfw zzfwVar) throws IOException {
        zzi(zzfwVar);
        this.zza = zzfwVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j10 = zzfwVar.zze;
        int length = bArr.length;
        if (j10 <= length) {
            int i10 = (int) j10;
            this.zzc = i10;
            int i11 = length - i10;
            this.zzd = i11;
            long j11 = zzfwVar.zzf;
            if (j11 != -1) {
                this.zzd = (int) Math.min(i11, j11);
            }
            this.zze = true;
            zzj(zzfwVar);
            long j12 = zzfwVar.zzf;
            return j12 != -1 ? j12 : this.zzd;
        }
        throw new zzfs(AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
