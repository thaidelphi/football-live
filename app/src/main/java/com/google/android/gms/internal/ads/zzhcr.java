package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzhcr implements zzaqc {
    private static final zzhdc zzg = zzhdc.zzb(zzhcr.class);
    protected final String zza;
    long zzd;
    zzhcw zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhcr(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        if (this.zzc) {
            return;
        }
        try {
            zzhdc zzhdcVar = zzg;
            String str = this.zza;
            zzhdcVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzh = this.zzf.zzd(this.zzd, this.zze);
            this.zzc = true;
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb(zzhcw zzhcwVar, ByteBuffer byteBuffer, long j10, zzapz zzapzVar) throws IOException {
        this.zzd = zzhcwVar.zzb();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zzhcwVar;
        zzhcwVar.zze(zzhcwVar.zzb() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    protected abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        String str;
        zzc();
        zzhdc zzhdcVar = zzg;
        String str2 = this.zza;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzhdcVar.zza(str);
        ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }
}
