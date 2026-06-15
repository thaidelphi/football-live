package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzace implements zzadp {
    private final byte[] zza = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzl zzlVar, int i10, boolean z10) {
        return zzadn.zza(this, zzlVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzl zzlVar, int i10, boolean z10, int i11) throws IOException {
        int zza = zzlVar.zza(this.zza, 0, Math.min((int) CodedOutputStream.DEFAULT_BUFFER_SIZE, i10));
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzl(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzm(zzz zzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzr(zzdx zzdxVar, int i10) {
        zzadn.zzb(this, zzdxVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(zzdx zzdxVar, int i10, int i11) {
        zzdxVar.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzt(long j10, int i10, int i11, int i12, zzado zzadoVar) {
    }
}
