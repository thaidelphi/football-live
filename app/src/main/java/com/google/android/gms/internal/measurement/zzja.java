package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzja extends zziz {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzja(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjd) && zzd() == ((zzjd) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzja) {
                zzja zzjaVar = (zzja) obj;
                int zzk = zzk();
                int zzk2 = zzjaVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd <= zzjaVar.zzd()) {
                        if (zzd <= zzjaVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzjaVar.zza;
                            zzjaVar.zzc();
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < zzd) {
                                if (bArr[i10] != bArr2[i11]) {
                                    return false;
                                }
                                i10++;
                                i11++;
                            }
                            return true;
                        }
                        throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzjaVar.zzd());
                    }
                    throw new IllegalArgumentException("Length too large: " + zzd + zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzjd
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    protected final int zze(int i10, int i11, int i12) {
        return zzkm.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final zzjd zzf(int i10, int i11) {
        int zzj = zzjd.zzj(0, i11, zzd());
        return zzj == 0 ? zzjd.zzb : new zzix(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzjd
    public final void zzh(zzit zzitVar) throws IOException {
        ((zzji) zzitVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean zzi() {
        return zznc.zzf(this.zza, 0, zzd());
    }
}
