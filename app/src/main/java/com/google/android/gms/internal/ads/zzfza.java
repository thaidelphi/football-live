package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfza {
    private static final byte[] zza;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < 10; i10++) {
            bArr[i10 + 48] = (byte) i10;
        }
        for (int i11 = 0; i11 < 26; i11++) {
            byte b10 = (byte) (i11 + 10);
            bArr[i11 + 65] = b10;
            bArr[i11 + 97] = b10;
        }
        zza = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(char c10) {
        if (c10 < 128) {
            return zza[c10];
        }
        return -1;
    }
}
