package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfyf extends zzfyh {
    private zzfyf(zzfyd zzfydVar, Character ch) {
        super(zzfydVar, ch);
        zzfsv.zze(zzfyd.zzf(zzfydVar).length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfyi
    final int zza(byte[] bArr, CharSequence charSequence) throws zzfyg {
        CharSequence zzg = zzg(charSequence);
        if (this.zzb.zzd(zzg.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzg.length()) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                int zzb = (this.zzb.zzb(zzg.charAt(i10)) << 18) | (this.zzb.zzb(zzg.charAt(i12)) << 12);
                bArr[i11] = (byte) (zzb >>> 16);
                int i14 = i12 + 1;
                if (i14 < zzg.length()) {
                    int i15 = i14 + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zzg.charAt(i14)) << 6);
                    i11 = i13 + 1;
                    bArr[i13] = (byte) ((zzb2 >>> 8) & 255);
                    if (i15 < zzg.length()) {
                        bArr[i11] = (byte) ((zzb2 | this.zzb.zzb(zzg.charAt(i15))) & 255);
                        i11++;
                        i10 = i15 + 1;
                    } else {
                        i10 = i15;
                    }
                } else {
                    i10 = i14;
                    i11 = i13;
                }
            }
            return i11;
        }
        throw new zzfyg("Invalid input length " + zzg.length());
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    final zzfyi zzb(zzfyd zzfydVar, Character ch) {
        return new zzfyf(zzfydVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfyi
    final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzfsv.zzk(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = i14 + 1;
            int i16 = ((bArr[i12] & 255) << 16) | ((bArr[i14] & 255) << 8) | (bArr[i15] & 255);
            appendable.append(this.zzb.zza(i16 >>> 18));
            appendable.append(this.zzb.zza((i16 >>> 12) & 63));
            appendable.append(this.zzb.zza((i16 >>> 6) & 63));
            appendable.append(this.zzb.zza(i16 & 63));
            i12 = i15 + 1;
        }
        if (i12 < i11) {
            zzh(appendable, bArr, i12, i11 - i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyf(String str, String str2, Character ch) {
        this(new zzfyd(str, str2.toCharArray()), ch);
    }
}
