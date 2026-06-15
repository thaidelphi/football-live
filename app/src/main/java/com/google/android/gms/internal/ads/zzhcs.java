package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzhcs extends zzhcv implements zzaqc {
    protected final String zza = "moov";

    public zzhcs(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb(zzhcw zzhcwVar, ByteBuffer byteBuffer, long j10, zzapz zzapzVar) throws IOException {
        zzhcwVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhcwVar;
        this.zze = zzhcwVar.zzb();
        zzhcwVar.zze(zzhcwVar.zzb() + j10);
        this.zzf = zzhcwVar.zzb();
        this.zzb = zzapzVar;
    }
}
