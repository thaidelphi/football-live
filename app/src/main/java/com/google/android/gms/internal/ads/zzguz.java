package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzguz extends zzguy {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzguz(byte[] bArr) {
        super(null);
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgvc) && zzd() == ((zzgvc) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzguz) {
                zzguz zzguzVar = (zzguz) obj;
                int zzr = zzr();
                int zzr2 = zzguzVar.zzr();
                if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
                    return zzg(zzguzVar, 0, zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public int zzd() {
        return this.zza.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzguy
    final boolean zzg(zzgvc zzgvcVar, int i10, int i11) {
        if (i11 <= zzgvcVar.zzd()) {
            int i12 = i10 + i11;
            if (i12 <= zzgvcVar.zzd()) {
                if (zzgvcVar instanceof zzguz) {
                    zzguz zzguzVar = (zzguz) zzgvcVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzguzVar.zza;
                    int zzc = zzc() + i11;
                    int zzc2 = zzc();
                    int zzc3 = zzguzVar.zzc() + i10;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgvcVar.zzk(i10, i12).equals(zzk(0, i11));
            }
            int zzd = zzgvcVar.zzd();
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zzd);
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i11 + zzd2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final int zzi(int i10, int i11, int i12) {
        return zzgwx.zzb(i10, this.zza, zzc() + i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzgzm.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final zzgvc zzk(int i10, int i11) {
        int zzq = zzgvc.zzq(i10, i11, zzd());
        return zzq == 0 ? zzgvc.zzb : new zzguw(this.zza, zzc() + i10, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final zzgvi zzl() {
        return zzgvi.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final void zzo(zzgut zzgutVar) throws IOException {
        zzgutVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final boolean zzp() {
        int zzc = zzc();
        return zzgzm.zzi(this.zza, zzc, zzd() + zzc);
    }
}
