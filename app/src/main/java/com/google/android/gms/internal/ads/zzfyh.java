package com.google.android.gms.internal.ads;

import com.ironsource.cc;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzfyh extends zzfyi {
    private volatile zzfyi zza;
    final zzfyd zzb;
    final Character zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyh(zzfyd zzfydVar, Character ch) {
        this.zzb = zzfydVar;
        boolean z10 = true;
        if (ch != null) {
            ch.charValue();
            if (zzfydVar.zze(cc.T)) {
                z10 = false;
            }
        }
        zzfsv.zzi(z10, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyh) {
            zzfyh zzfyhVar = (zzfyh) obj;
            if (this.zzb.equals(zzfyhVar.zzb) && Objects.equals(this.zzc, zzfyhVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    int zza(byte[] bArr, CharSequence charSequence) throws zzfyg {
        zzfyd zzfydVar;
        CharSequence zzg = zzg(charSequence);
        if (this.zzb.zzd(zzg.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzg.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    zzfydVar = this.zzb;
                    if (i12 >= zzfydVar.zzc) {
                        break;
                    }
                    j10 <<= zzfydVar.zzb;
                    if (i10 + i12 < zzg.length()) {
                        j10 |= this.zzb.zzb(zzg.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = zzfydVar.zzd;
                int i15 = i13 * zzfydVar.zzb;
                int i16 = (i14 - 1) * 8;
                while (i16 >= (i14 * 8) - i15) {
                    bArr[i11] = (byte) ((j10 >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.zzb.zzc;
            }
            return i11;
        }
        throw new zzfyg("Invalid input length " + zzg.length());
    }

    zzfyi zzb(zzfyd zzfydVar, Character ch) {
        return new zzfyh(zzfydVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzfsv.zzk(0, i11, bArr.length);
        while (i12 < i11) {
            zzh(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    final int zzd(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    final int zze(int i10) {
        zzfyd zzfydVar = this.zzb;
        return zzfydVar.zzc * zzfyr.zzb(i10, zzfydVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    public final zzfyi zzf() {
        zzfyi zzfyiVar = this.zza;
        if (zzfyiVar == null) {
            zzfyd zzfydVar = this.zzb;
            zzfyd zzc = zzfydVar.zzc();
            zzfyiVar = zzc == zzfydVar ? this : zzb(zzc, this.zzc);
            this.zza = zzfyiVar;
        }
        return zzfyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    final CharSequence zzg(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzfsv.zzk(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzfsv.zze(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzfyd zzfydVar = this.zzb;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzfydVar.zzb) - i12);
            zzfyd zzfydVar2 = this.zzb;
            appendable.append(zzfydVar2.zza(((int) j11) & zzfydVar2.zza));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append(cc.T);
                i12 += this.zzb.zzb;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyh(String str, String str2, Character ch) {
        this(new zzfyd(str, str2.toCharArray()), ch);
    }
}
