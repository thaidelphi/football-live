package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacz {
    private final zzdx zza = new zzdx(10);

    public final zzav zza(zzack zzackVar, zzafq zzafqVar) throws IOException {
        zzav zzavVar = null;
        int i10 = 0;
        while (true) {
            try {
                zzackVar.zzh(this.zza.zzN(), 0, 10);
                this.zza.zzL(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzM(3);
                int zzl = this.zza.zzl();
                int i11 = zzl + 10;
                if (zzavVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzN(), 0, bArr, 0, 10);
                    zzackVar.zzh(bArr, 10, zzl);
                    zzavVar = zzafs.zza(bArr, i11, zzafqVar, new zzafe());
                } else {
                    zzackVar.zzg(zzl);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzackVar.zzj();
        zzackVar.zzg(i10);
        return zzavVar;
    }
}
