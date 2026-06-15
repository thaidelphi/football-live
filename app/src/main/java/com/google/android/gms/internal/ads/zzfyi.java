package com.google.android.gms.internal.ads;

import com.ironsource.cc;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfyi {
    private static final zzfyi zza;

    static {
        Character valueOf = Character.valueOf(cc.T);
        new zzfyf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        new zzfyf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new zzfyh("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new zzfyh("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zza = new zzfye("base16()", "0123456789ABCDEF");
    }

    public static zzfyi zzi() {
        return zza;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence) throws zzfyg;

    abstract void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int zzd(int i10);

    abstract int zze(int i10);

    public abstract zzfyi zzf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzfsv.zzk(0, i11, bArr.length);
        StringBuilder sb = new StringBuilder(zze(i11));
        try {
            zzc(sb, bArr, 0, i11);
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzd = zzd(zzg.length());
            byte[] bArr = new byte[zzd];
            int zza2 = zza(bArr, zzg);
            if (zza2 == zzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzfyg e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
