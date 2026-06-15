package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzix extends zzja {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzix(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzjd.zzj(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zzjd
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zzjd
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzja
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zzjd
    public final int zzd() {
        return this.zzc;
    }
}
