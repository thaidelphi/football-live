package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgzf extends zzgzg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgzf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final byte zza(long j10) {
        return Memory.peekByte(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final double zzb(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final float zzc(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzd(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray(j10, bArr, (int) j11, (int) j12);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zze(Object obj, long j10, boolean z10) {
        if (zzgzh.zzb) {
            zzgzh.zzG(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzgzh.zzH(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzf(Object obj, long j10, byte b10) {
        if (zzgzh.zzb) {
            zzgzh.zzG(obj, j10, b10);
        } else {
            zzgzh.zzH(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzh(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final boolean zzi(Object obj, long j10) {
        if (zzgzh.zzb) {
            return zzgzh.zzw(obj, j10);
        }
        return zzgzh.zzx(obj, j10);
    }
}
