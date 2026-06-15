package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int a(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14 = i10;
        while (true) {
            i13 = (i11 & (-4)) + i10;
            if (i14 >= i13) {
                break;
            }
            int i15 = ((bArr[i14] & 255) | ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14 + 2] & 255) << 16) | (bArr[i14 + 3] << 24)) * (-862048943);
            int i16 = i12 ^ (((i15 >>> 17) | (i15 << 15)) * 461845907);
            i12 = (((i16 >>> 19) | (i16 << 13)) * 5) - 430675100;
            i14 += 4;
        }
        int i17 = i11 & 3;
        if (i17 != 1) {
            if (i17 != 2) {
                r0 = i17 == 3 ? (bArr[i13 + 2] & 255) << 16 : 0;
                int i18 = i12 ^ i11;
                int i19 = (i18 ^ (i18 >>> 16)) * (-2048144789);
                int i20 = (i19 ^ (i19 >>> 13)) * (-1028477387);
                return i20 ^ (i20 >>> 16);
            }
            r0 |= (bArr[i13 + 1] & 255) << 8;
        }
        int i21 = ((bArr[i13] & 255) | r0) * (-862048943);
        i12 ^= ((i21 >>> 17) | (i21 << 15)) * 461845907;
        int i182 = i12 ^ i11;
        int i192 = (i182 ^ (i182 >>> 16)) * (-2048144789);
        int i202 = (i192 ^ (i192 >>> 13)) * (-1028477387);
        return i202 ^ (i202 >>> 16);
    }
}
