package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfye extends zzfyh {
    final char[] zza;

    private zzfye(zzfyd zzfydVar) {
        super(zzfydVar, null);
        this.zza = new char[AdRequest.MAX_CONTENT_URL_LENGTH];
        zzfsv.zze(zzfyd.zzf(zzfydVar).length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzfydVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzfydVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfyi
    final int zza(byte[] bArr, CharSequence charSequence) throws zzfyg {
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.zzb.zzb(charSequence.charAt(i10)) << 4) | this.zzb.zzb(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        throw new zzfyg("Invalid input length " + charSequence.length());
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    final zzfyi zzb(zzfyd zzfydVar, Character ch) {
        return new zzfye(zzfydVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfyi
    final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzfsv.zzk(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.zza[i13]);
            appendable.append(this.zza[i13 | 256]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfye(String str, String str2) {
        this(new zzfyd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
