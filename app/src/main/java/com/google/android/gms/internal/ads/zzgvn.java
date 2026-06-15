package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgvn extends zzgvk {
    private final OutputStream zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgvn(OutputStream outputStream, int i10) {
        super(i10);
        Objects.requireNonNull(outputStream, "out");
        this.zzg = outputStream;
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzJ(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzK() throws IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzL(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzM(int i10, boolean z10) throws IOException {
        zzJ(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzN(int i10, zzgvc zzgvcVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzu(zzgvcVar.zzd());
        zzgvcVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, com.google.android.gms.internal.ads.zzgut
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzr(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzh(int i10, int i11) throws IOException {
        zzJ(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzi(int i10) throws IOException {
        zzJ(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzj(int i10, long j10) throws IOException {
        zzJ(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzk(long j10) throws IOException {
        zzJ(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzl(int i10, int i11) throws IOException {
        zzJ(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzn(int i10, zzgxv zzgxvVar, zzgyo zzgyoVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzu(((zzgul) zzgxvVar).zzaM(zzgyoVar));
        zzgyoVar.zzj(zzgxvVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzo(int i10, zzgxv zzgxvVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzu(zzgxvVar.zzaY());
        zzgxvVar.zzcY(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzp(int i10, zzgvc zzgvcVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzN(3, zzgvcVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzq(int i10, String str) throws IOException {
        zzu((i10 << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.zza, i13, i14);
        int i15 = i10 + i14;
        this.zzc = this.zzb;
        this.zzd += i14;
        zzI();
        int i16 = i11 - i14;
        if (i16 <= this.zzb) {
            System.arraycopy(bArr, i15, this.zza, 0, i16);
            this.zzc = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzs(int i10, int i11) throws IOException {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzt(int i10, int i11) throws IOException {
        zzJ(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzu(int i10) throws IOException {
        zzJ(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzv(int i10, long j10) throws IOException {
        zzJ(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final void zzw(long j10) throws IOException {
        zzJ(10);
        zzg(j10);
    }

    public final void zzx(String str) throws IOException {
        int zze;
        try {
            int length = str.length() * 3;
            int zzD = zzgvp.zzD(length);
            int i10 = zzD + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int zzd = zzgzm.zzd(str, bArr, 0, length);
                zzu(zzd);
                zzr(bArr, 0, zzd);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzI();
            }
            int zzD2 = zzgvp.zzD(str.length());
            int i12 = this.zzc;
            try {
                if (zzD2 == zzD) {
                    int i13 = i12 + zzD2;
                    this.zzc = i13;
                    int zzd2 = zzgzm.zzd(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    zze = (zzd2 - i12) - zzD2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzgzm.zze(str);
                    zzf(zze);
                    this.zzc = zzgzm.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzgzl e8) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e8;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new zzgvm(e10);
            }
        } catch (zzgzl e11) {
            zzG(str, e11);
        }
    }
}
