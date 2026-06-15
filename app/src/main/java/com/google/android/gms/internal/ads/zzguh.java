package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzguh {
    private final byte[] zza;

    private zzguh(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzguh zzb(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new zzguh(bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzguh) {
            return Arrays.equals(((zzguh) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb.append("0123456789abcdef".charAt(i10 >> 4));
            sb.append("0123456789abcdef".charAt(i10 & 15));
        }
        return "Bytes(" + sb.toString() + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
