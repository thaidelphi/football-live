package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfp extends zzfk {
    private zzfw zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfp() {
        super(false);
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
        int i13 = zzeh.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final long zzb(zzfw zzfwVar) throws IOException {
        zzi(zzfwVar);
        this.zza = zzfwVar;
        Uri normalizeScheme = zzfwVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzcv.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = zzeh.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e8) {
                    throw zzaz.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e8);
                }
            } else {
                this.zzb = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j10 = zzfwVar.zze;
            int length = this.zzb.length;
            if (j10 <= length) {
                int i11 = (int) j10;
                this.zzc = i11;
                int i12 = length - i11;
                this.zzd = i12;
                long j11 = zzfwVar.zzf;
                if (j11 != -1) {
                    this.zzd = (int) Math.min(i12, j11);
                }
                zzj(zzfwVar);
                long j12 = zzfwVar.zzf;
                return j12 != -1 ? j12 : this.zzd;
            }
            this.zzb = null;
            throw new zzfs(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw zzaz.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        zzfw zzfwVar = this.zza;
        if (zzfwVar != null) {
            return zzfwVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
